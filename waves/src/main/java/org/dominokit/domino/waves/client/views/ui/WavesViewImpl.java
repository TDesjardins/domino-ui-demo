package org.dominokit.domino.waves.client.views.ui;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.api.client.annotations.UiView;
import org.dominokit.domino.componentcase.shared.extension.ComponentView;
import org.dominokit.domino.ui.button.Button;
import org.dominokit.domino.ui.button.IconButton;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.column.Column;
import org.dominokit.domino.ui.header.BlockHeader;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.lists.SimpleListGroup;
import org.dominokit.domino.ui.lists.SimpleListItem;
import org.dominokit.domino.ui.row.Row;
import org.dominokit.domino.ui.style.Styles;
import org.dominokit.domino.ui.style.WaveColor;
import org.dominokit.domino.waves.client.presenters.WavesPresenter;
import org.dominokit.domino.waves.client.views.CodeResource;
import org.dominokit.domino.waves.client.views.WavesView;

import static org.jboss.gwt.elemento.core.Elements.div;

@UiView(presentable = WavesPresenter.class)
public class WavesViewImpl extends ComponentView<HTMLDivElement> implements WavesView {

	private HTMLDivElement element = div().asElement();

	@Override
	public void init() {
		element.appendChild(BlockHeader.create("WAVES", "Click effect inspired by Google's Material Design")
				.asElement());

		Column column = Column.create()
				.onLarge(Column.OnLarge.six)
				.onMedium(Column.OnMedium.six)
				.onSmall(Column.OnSmall.twelve)
				.onXSmall(Column.OnXSmall.twelve);

		element.appendChild(Row.create()
				.addColumn(column.copy()
						.addElement(Card.create("COLOR VARIATIONS")
								.appendContent(SimpleListGroup.create()
										.appendItem(SimpleListItem.create("Default").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.LIGHT").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createPrimary("CLICK ME")
														.setWaveColor(WaveColor.LIGHT)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.RED").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.RED)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.PINK").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.PINK)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.PURPLE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.PURPLE)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.DEEP_PURPLE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.DEEP_PURPLE)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.INDIGO").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.INDIGO)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.BLUE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.BLUE)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.LIGHT_BLUE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.LIGHT_BLUE)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.CYAN").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.CYAN)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.TEAL").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.TEAL)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.GREEN").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.GREEN)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.LIGHT_GREEN").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.LIGHT_GREEN)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.LIME").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.LIME)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.YELLOW").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.YELLOW)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.AMBER").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.AMBER)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.ORANGE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.ORANGE)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.DEEP_ORANGE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.DEEP_ORANGE)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.BROWN").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.BROWN)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.GREY").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.GREY)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.BLUE_GREY").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.BLUE_GREY)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.BLACK").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(Button.createDefault("CLICK ME")
														.setWaveColor(WaveColor.BLACK)
														.htmlBuilder().style("min-width:120px;")
														.css(Styles.pull_right)
														.asElement())
										)
										.asElement())
								.asElement()))
				.addColumn(column.copy()
						.addElement(Card.create("CIRCLE")
								.appendContent(SimpleListGroup.create()
										.appendItem(SimpleListItem.create("Default").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.mic())
														.circle(IconButton.CircleSize.SMALL)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.LIGHT").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createPrimary(Icons.ALL.keyboard())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.LIGHT)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.RED").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.content_copy())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.RED)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.PINK").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.content_cut())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.PINK)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.PURPLE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.content_paste())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.PURPLE)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.DEEP_PURPLE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.access_alarm())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.DEEP_PURPLE)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.INDIGO").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.access_time())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.INDIGO)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.BLUE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.account_box())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.BLUE)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.LIGHT_BLUE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.airline_seat_flat())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.LIGHT_BLUE)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.CYAN").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.alarm())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.CYAN)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.TEAL").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.ac_unit())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.TEAL)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.GREEN").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.apps())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.GREEN)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.LIGHT_GREEN").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.assessment())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.LIGHT_GREEN)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.LIME").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.android())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.LIME)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.YELLOW").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.album())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.YELLOW)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.AMBER").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.aspect_ratio())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.AMBER)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.ORANGE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.autorenew())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.ORANGE)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.DEEP_ORANGE").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.add_a_photo())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.DEEP_ORANGE)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.BROWN").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.add_location())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.BROWN)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.GREY").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.add_box())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.GREY)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.BLUE_GREY").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.add_to_queue())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.BLUE_GREY)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.appendItem(SimpleListItem.create("WaveColor.BLACK").htmlBuilder().css(Styles.clearfix).component()
												.appendContent(IconButton.createDefault(Icons.ALL.adjust())
														.circle(IconButton.CircleSize.SMALL)
														.setWaveColor(WaveColor.BLACK)
														.htmlBuilder().css(Styles.pull_right)
														.asElement())
										)
										.asElement())
								.asElement()))
				.asElement());

		element.appendChild(Card.createCodeCard(CodeResource.INSTANCE.waves()).asElement());
	}

	@Override
	public HTMLDivElement getElement() {
		return element;
	}
}