package com.example.demo.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class XMLPersonDAO {

    XMLJdbcConnection jdbcConnection;

    public XMLJdbcConnection getXMLJdbcConnection() {
        return jdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
