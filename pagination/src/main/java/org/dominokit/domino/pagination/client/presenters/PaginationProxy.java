package org.dominokit.domino.pagination.client.presenters;

import org.dominokit.domino.api.client.annotations.presenter.*;
import org.dominokit.domino.componentcase.client.presenters.ComponentCasePresenter;
import org.dominokit.domino.layout.shared.extension.IsLayout;
import org.dominokit.domino.layout.shared.extension.LayoutEvent;
import org.dominokit.domino.pagination.client.views.PaginationView;

@PresenterProxy
@AutoRoute(token = "components/pagination")
@AutoReveal
@Slot(IsLayout.Slots.CONTENT)
@DependsOn(@EventsGroup(LayoutEvent.class))
public class PaginationProxy extends ComponentCasePresenter<PaginationView> {
}