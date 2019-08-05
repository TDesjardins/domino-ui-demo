package org.dominokit.domino.themes.client.presenters;

import org.dominokit.domino.api.client.annotations.presenter.*;
import org.dominokit.domino.api.client.mvp.StoreRegistry;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.domino.history.HistoryToken;
import org.dominokit.domino.layout.shared.extension.IsLayout;
import org.dominokit.domino.layout.shared.extension.LayoutEvent;
import org.dominokit.domino.themes.client.views.ThemesView;

import javax.ws.rs.QueryParam;

import static java.util.Objects.nonNull;

@PresenterProxy
@AutoRoute(routeOnce = true)
@Singleton
@AutoReveal
@Slot(IsLayout.Slots.RIGHT_PANEL)
@DependsOn(@EventsGroup(LayoutEvent.class))
public class ThemesProxy extends ViewBaseClientPresenter<ThemesView> implements ThemesView.ThemesUiHandlers {

    @QueryParam("theme")
    String theme;
    private IsLayout layout;

    @OnBeforeReveal
    public void getLayout(){
        StoreRegistry.INSTANCE.<IsLayout>consumeData(IsLayout.Store.LAYOUT, isLayout -> this.layout = isLayout);
    }

    @OnReveal
    public void initView() {
        view.registerTheme("red");
        view.registerTheme("pink");
        view.registerTheme("purple");
        view.registerTheme("deep_purple");
        view.registerTheme("indigo", !history().currentToken().hasQueryParameter("theme"));
        view.registerTheme("blue");
        view.registerTheme("light_blue");
        view.registerTheme("cyan");
        view.registerTheme("teal");
        view.registerTheme("green");
        view.registerTheme("light_green");
        view.registerTheme("lime");
        view.registerTheme("yellow");
        view.registerTheme("amber");
        view.registerTheme("orange");
        view.registerTheme("deep_orange");
        view.registerTheme("brown");
        view.registerTheme("grey");
        view.registerTheme("blue_grey");
        view.registerTheme("black");

        applyTheme();
    }

    private void applyTheme() {
        if(nonNull(theme))
            view.applyTheme(theme);
    }

    @Override
    public void onThemeApplied(String theme) {
        HistoryToken token=history().currentToken();
        if(history().currentToken().hasQueryParameter("theme"))
            token.queryParameters().put("theme", theme);
        else
            token.appendParameter("theme", theme);

        history().pushState(token.value());
    }

    @Override
    public void onHideThemes() {
        layout.hideRightPanel();
    }
}