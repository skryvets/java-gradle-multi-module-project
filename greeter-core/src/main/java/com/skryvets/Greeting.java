package com.skryvets;

import com.skryvets.utils.Utils;

public class Greeting {
    public String greet(String name) {
        return "Hello, " + Utils.capitalizeFirst(name);
    }
}
