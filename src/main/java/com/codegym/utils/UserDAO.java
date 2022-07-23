package com.codegym.utils;

import com.codegym.security.SecurityConfig;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public static boolean checkUserExists(String username, String password){
        if(username.equals("quang")&&password.equals("123123")){
            return true;
        }
        if(username.equals("tien")&&password.equals("123123")){
            return true;
        }
        if(username.equals("thien")&&password.equals("123123")){
            return true;
        }
        return false;
    }
}
