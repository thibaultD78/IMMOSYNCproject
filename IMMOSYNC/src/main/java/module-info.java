module sio.immosync {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires spring.data.jpa;
    requires spring.context;
    requires spring.data.commons;


    opens sio.immosync to javafx.fxml;
    exports sio.immosync;
    exports sio.immosync.controler;
    opens sio.immosync.controler to javafx.fxml;
    exports sio.immosync.services;
    opens sio.immosync.services to javafx.fxml;
    exports sio.immosync.entities;
    opens sio.immosync.entities to javafx.fxml;
}