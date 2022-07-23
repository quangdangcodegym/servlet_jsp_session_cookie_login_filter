//package com.codegym.filter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
////@WebFilter(urlPatterns = "/assets/*")
//public class ResourceFilter extends HttpFilter {
//    public ResourceFilter() {
//        super();
//    }
//
//    @Override
//    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
//        //super.doFilter(req, res, chain);
//        // url: assets/css/css.css
//        String pathInfo = req.getPathInfo();
//        String pathServlet = req.getServletPath();
//        String pathURI = req.getRequestURI();
//        System.out.println("pathInfo: " + pathInfo);
//        System.out.println("pathServlet: " + pathServlet);
//        System.out.println("pathURI: " + pathURI);
//
//        res.sendError(404);
////        if(pathURI.equals("/assets/css/css.css")){
////            res.sendError(404);
////        }else{
////            chain.doFilter(req, res);
////        }
//
//
//    }
//}
