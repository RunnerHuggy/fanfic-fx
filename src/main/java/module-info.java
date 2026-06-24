module runner.huggy.fanficfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens runner.huggy.fanficfx to javafx.fxml;
    exports runner.huggy.fanficfx;
}