package org.dominokit.domino.notifications.client.presenters;

import org.dominokit.domino.api.client.annotations.InjectContext;
import org.dominokit.domino.api.client.annotations.Presenter;
import org.dominokit.domino.api.client.mvp.presenter.BaseClientPresenter;
import org.dominokit.domino.api.shared.extension.Content;
import org.dominokit.domino.componentcase.shared.extension.ComponentCase;
import org.dominokit.domino.componentcase.shared.extension.ComponentCaseContext;
import org.dominokit.domino.componentcase.shared.extension.ComponentCaseExtensionPoint;
import org.dominokit.domino.components.shared.extension.ComponentsContext;
import org.dominokit.domino.components.shared.extension.ComponentsExtensionPoint;
import org.dominokit.domino.notifications.client.views.NotificationsView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class NotificationsPresenter extends BaseClientPresenter<NotificationsView> {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationsPresenter.class);

    @InjectContext(extensionPoint=ComponentsExtensionPoint.class)
    public void contributeToComponentCaseModule(ComponentsContext context) {
        context.getComponentCaseContext().addComponentCase(new ComponentCase() {
            @Override
            public String getHistoryToken() {
                return "notifications";
            }

            @Override
            public String getMenuPath() {
                return "Components/Notifications";
            }

            @Override
            public Content getContent() {
                return view.getContent();
            }
        });
    }
}