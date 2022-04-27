/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.japo.java.bll.commands;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan Emilov Pashev <ivaaan.bulgaria@gmail.com>
 */
public interface ICommand {

    void init(ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response);

    void process() throws ServletException, IOException;
}
