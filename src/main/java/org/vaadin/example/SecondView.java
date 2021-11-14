package org.vaadin.example;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout.Orientation;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/second")
public class SecondView extends FlexLayout {

    public SecondView() {

        TextField textField = new TextField("This is a textField");
        SplitLayout layout = new SplitLayout();

        layout.setOrientation(Orientation.HORIZONTAL);
        layout.addToPrimary(new Label("Top content component"));
        layout.addToPrimary(textField);
        //layout.setStyle("width", "50%");
        layout.setPrimaryStyle("width", "25%");
        layout.addToPrimary(new TextField("new ffied"));
        layout.addToSecondary(new Label("Bottom content component"));

        VerticalLayout mainPart = new VerticalLayout();
        TextField textField1 = new TextField("This is a textField in mainPart");
        mainPart.add(textField1);

        setSizeFull();
        //setWidth("100%");
        add(layout, mainPart);
    }


}