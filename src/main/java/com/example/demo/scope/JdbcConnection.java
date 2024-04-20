package com.example.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
//proxyMode=ScopedProxyMode.TARGET_CLASS is used for a bean with prototype scope to ensure a new bean instance is provided whenever it's requested for.
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
    public JdbcConnection(){
        System.out.println("JDBC connection.");
    }
}
