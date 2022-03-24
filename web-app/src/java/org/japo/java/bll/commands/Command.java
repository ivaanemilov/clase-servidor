package org.japo.java.bll.commands;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Command implements ICommand {

    protected ServletConfig config;
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    @Override
    public ICommand obtenerComando(String cmdName) {
        return null;
    }

    @Override
    public void init(
            ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response) {
        this.config = config;
        this.request = request;
        this.response = response;
    }

  

}
