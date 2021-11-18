package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Database {
    private Map<String, char[]> data = new HashMap<>();


    public void addusers() {
        data.put("craksys", new char[]{'p', 'i', 'w', 'o'});
        data.put("admin", new char[]{'a','d','m','i','n'});
        data.put("stachapower", new char[]{'s','z','l','a','c','t','a'});
        data.put("dziekan", new char[]{'z','d','a','l','n','e'});
    }
    public boolean authorization(String login,char[] password){
        if(data.containsKey(login)){
            char[] passwordcheck = data.get(login);

            return Arrays.equals(passwordcheck, password);

        }else
        {return false;}
    }
}