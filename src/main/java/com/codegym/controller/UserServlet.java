package com.codegym.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        /*System.out.println("getContextPath: " + req.getContextPath());
        System.out.println("getServletPath: " + req.getServletPath());
        System.out.println("getPathInfo: " + req.getPathInfo());
        System.out.println("getQueryString: " + req.getQueryString());
        System.out.println("getRequestURI: " + req.getRequestURI());*/

        String action = "";
        if(req.getParameter("action")!=null){
            action = req.getParameter("action");
        }
        switch (action){
            case "create":
                showNewForm(req, resp);
                break;
            default:
                listUser(req, resp);
                break;
        }
    }

    private void listUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/admin/user/users.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void showNewForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/admin/user/create.jsp");
        requestDispatcher.forward(req, resp);
    }
}
