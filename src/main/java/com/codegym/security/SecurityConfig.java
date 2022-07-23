package com.codegym.security;

import java.util.*;

public class SecurityConfig {
    public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";

    // String: Role
    // List<String>: urlPatterns.
    private static final Map<String, List<String>> mapConfig = new HashMap<String, List<String>>();

    static {
        init();
    }

    private static void init() {

        // Cấu hình cho vai trò "EMPLOYEE".
        List<String> urlPatterns1 = new ArrayList<String>();

        urlPatterns1.add("/user");
        urlPatterns1.add("/create");

        mapConfig.put(ROLE_EMPLOYEE, urlPatterns1);

        // Cấu hình cho vai trò "MANAGER".
        List<String> urlPatterns2 = new ArrayList<String>();

        urlPatterns2.add("/create");
        urlPatterns2.add("/user");
        urlPatterns2.add("/admin");

        mapConfig.put(ROLE_MANAGER, urlPatterns2);
    }

    public static Set<String> getAllAppRoles() {
        return mapConfig.keySet();
    }

    public static List<String> getUrlPatternsForRole(String role) {
        return mapConfig.get(role);
    }

    public static void main(String[] args) {
        SecurityConfig securityConfig = new SecurityConfig();

        securityConfig.getUrlPatternsForRole(ROLE_MANAGER).stream().forEach(t -> {
            System.out.println(t);

        });
    }
}
