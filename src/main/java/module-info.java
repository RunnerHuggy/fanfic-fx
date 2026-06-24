module runner.huggy.fanficfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;
    requires java.sql;


    opens runner.huggy.fanficfx to javafx.fxml;
    exports runner.huggy.fanficfx;
}