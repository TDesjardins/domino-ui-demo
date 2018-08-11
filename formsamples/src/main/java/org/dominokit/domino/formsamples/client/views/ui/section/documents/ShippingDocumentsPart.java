package org.dominokit.domino.formsamples.client.views.ui.section.documents;

import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import org.dominokit.domino.formsamples.client.views.ui.section.ImportSection;
import org.dominokit.domino.formsamples.shared.model.*;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.forms.*;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.row.Row;

import java.util.List;

import static org.dominokit.domino.formsamples.client.views.ui.CustomElements.*;
import static org.dominokit.domino.ui.column.Column.span6;
import static org.jboss.gwt.elemento.core.Elements.div;

public class ShippingDocumentsPart implements ImportSection {

    private final SwitchButton shippingDocumentsSwitchButton;
    private TextBox shippingDocumentsCopiesTextBox;
    private TextBox shippingDocumentsDescriptionTextBox;
    private Select<String> shippingDocumentsTypeSelect;
    private final Select<Bank> orderOfBankSelect;
    private final Select<String> freightSelect;

    private FieldsGrouping fieldsGrouping = FieldsGrouping.create();


    private Card card;
    private HTMLDivElement element = div().asElement();

    public ShippingDocumentsPart(List<Bank> banks) {
        Row shippingDocumentInfoRow = Row.create();
        Row shippingDocumentSelectRow = Row.create();

        shippingDocumentsCopiesTextBox = createCopiesField()
                .groupBy(fieldsGrouping)
                .setAutoValidation(true)
                .setRequired(true);
        shippingDocumentsCopiesTextBox.getInputElement().addEventListener("input", evt -> revalidate());

        shippingDocumentsDescriptionTextBox = createDescriptionField()
                .groupBy(fieldsGrouping)
                .setAutoValidation(true)
                .setRequired(true);
        shippingDocumentsDescriptionTextBox.getInputElement().addEventListener("input", evt -> revalidate());

        orderOfBankSelect = Select.<Bank>create("Order of")
                .groupBy(fieldsGrouping)
                .setLeftAddon(Icons.ALL.domain())
                .setAutoValidation(true)
                .setRequired(true)
                .addSelectionHandler(option -> revalidate());

        for (Bank bank : banks) {
            orderOfBankSelect.addOption(SelectOption.create(bank, bank.getSwiftCode(), bank.getName()));
        }

        freightSelect = Select.<String>create("Freight")
                .groupBy(fieldsGrouping)
                .setAutoValidation(true)
                .setRequired(true)
                .setLeftAddon(Icons.ALL.credit_card())
                .addOption(SelectOption.create("Prepaid", "Prepaid"))
                .addOption(SelectOption.create("Payable at destination", "Payable at destination"))
                .addSelectionHandler(option -> revalidate());

        shippingDocumentsTypeSelect = Select.<String>create("Shipping documents type")
                .groupBy(fieldsGrouping)
                .setRequired(true)
                .setAutoValidation(true)
                .setLeftAddon(Icons.ALL.local_shipping())
                .addOption(SelectOption.create("Ocean bills of lading in", "Ocean bills of lading in"))
                .addOption(SelectOption.create("Airway bill in", "Airway bill in"))
                .addOption(SelectOption.create("Truck consignment note", "Truck consignment note"))
                .addOption(SelectOption.create("Multimodal transport document", "Multimodal transport document"))
                .selectAt(0)
                .addSelectionHandler(option -> revalidate());

        shippingDocumentsSwitchButton = createRequiredField()
                .addChangeHandler(value -> {
                    if (value) {
                        card.expand();
                    } else {
                        card.collapse();
                        revalidate();
                    }
                });


        card = Card.create("Shipping documents")
                .setBodyPaddingTop("40px")
                .collapse();
        card.getHeaderDescription()
                .appendChild(shippingDocumentsSwitchButton.asElement());

        element.appendChild(card
                .appendChild(Row.create()
                        .addColumn(span6().addElement(shippingDocumentsTypeSelect)))
                .appendChild(shippingDocumentInfoRow
                        .addColumn(span6().addElement(shippingDocumentsCopiesTextBox))
                        .addColumn(span6().addElement(shippingDocumentsDescriptionTextBox)))
                .appendChild(shippingDocumentSelectRow
                        .addColumn(span6().addElement(orderOfBankSelect))
                        .addColumn(span6().addElement(freightSelect)
                        ))
                .asElement());
    }

    @Override
    public void collect(LetterOfCredit letterOfCredit) {
        if(shippingDocumentsSwitchButton.getValue()) {
            DocumentsRequired documentsRequired = letterOfCredit.getDocumentsRequired();
            if ("Ocean bills of lading in".equals(shippingDocumentsTypeSelect.getValue())) {
                OceanBillsOfLanding oceanBillsOfLanding = new OceanBillsOfLanding();
                oceanBillsOfLanding.setRequired(true);
                oceanBillsOfLanding.setNumberOfCopies(Integer.parseInt(shippingDocumentsCopiesTextBox.getValue()));
                oceanBillsOfLanding.setDescription(shippingDocumentsDescriptionTextBox.getValue());
                documentsRequired.setOceanBillsOfLanding(oceanBillsOfLanding);
            } else if ("Airway bill in".equals(shippingDocumentsTypeSelect.getValue())) {
                AirwayBill airwayBill = new AirwayBill();
                airwayBill.setRequired(true);
                airwayBill.setNumberOfCopies(Integer.parseInt(shippingDocumentsCopiesTextBox.getValue()));
                airwayBill.setDescription(shippingDocumentsDescriptionTextBox.getValue());
                documentsRequired.setAirwayBill(airwayBill);
            } else if ("Truck consignment note".equals(shippingDocumentsTypeSelect.getValue())) {
                TruckConsignmentNote truckConsignmentNote = new TruckConsignmentNote();
                truckConsignmentNote.setRequired(true);
                truckConsignmentNote.setNumberOfCopies(Integer.parseInt(shippingDocumentsCopiesTextBox.getValue()));
                truckConsignmentNote.setDescription(shippingDocumentsDescriptionTextBox.getValue());
                documentsRequired.setTruckConsignmentNote(truckConsignmentNote);
            }

        }
    }

    @Override
    public boolean validate() {
        boolean valid = !shippingDocumentsSwitchButton.getValue() || fieldsGrouping.validate().isValid();
        markCardValidation(card, valid);
        return valid;
    }

    public void revalidate() {
        if (isInvalidatedCard(card) && fieldsGrouping.validate().isValid()) {
            markCardValidation(card, true, false);
        }
    }

    @Override
    public HTMLElement asElement() {
        return element;
    }
}
