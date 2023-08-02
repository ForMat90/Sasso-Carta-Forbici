module com.play.stonepaperscissors {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens com.play.stonepaperscissors to javafx.fxml;
    exports com.play.stonepaperscissors;
    opens com.play.stonepaperscissors.controller to javafx.fxml;
    exports com.play.stonepaperscissors.controller;
}