package com.andrewbateman.todolist;

import com.andrewbateman.todolist.dataModel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    public void initialize() {
        TodoItem item1 = new TodoItem("Finish washing up", "wash plates, cups and forks",
                LocalDate.of(2021, Month.APRIL, 19));
        TodoItem item2 = new TodoItem("Mow lawn", "Mow front and back",
                LocalDate.of(2021, Month.APRIL, 18));
        TodoItem item3 = new TodoItem("Finish javascript project", "Add testing folder",
                LocalDate.of(2021, Month.APRIL, 17));
        TodoItem item4 = new TodoItem("Clean car", "Do boot and bonnet first",
                LocalDate.of(2021, Month.APRIL, 23));
        TodoItem item5 = new TodoItem("Pick up delivery", "At the post office after 11am",
                LocalDate.of(2021, Month.APRIL, 20));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        System.out.println("The selected item is " + item);
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(sb.toString());


    }
}
