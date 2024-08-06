package com.bhulekh.helper;

import java.util.Arrays;
import java.util.List;

public class ChooseDB {

    public String chooseDb(String dist) {
        String messg = "";

        List<String> d1 = Arrays.asList("153", "154", "155", "156", "157", "158", "168", "169", "170", "171", "180", "181", "182", "183");
        List<String> d2 = Arrays.asList("138", "139", "140", "141", "142", "194", "195", "196", "197", "198", "199", "200", "204");
        List<String> d3 = Arrays.asList("149", "150", "151", "152", "165", "166", "167", "184", "185", "186");
        List<String> d4 = Arrays.asList("145", "146", "147", "148", "159", "160", "161", "162", "163", "164", "187", "188", "189", "190");
        List<String> d5 = Arrays.asList("143", "144", "172", "173", "174", "175", "176", "177", "178", "179", "201", "202", "203");
        List<String> d6 = Arrays.asList("132", "133", "134", "135", "136", "137", "191", "192", "193", "205", "206");

        if (d1.contains(dist)) {
            messg = "db1";
        } else if (d2.contains(dist)) {
            messg = "db2";
            
       }
            else if (d3.contains(dist)) {
            messg = "db3";
        } else if (d4.contains(dist)) {
            messg = "db4";
        } else if (d5.contains(dist)) {
            messg = "db5";
        } else if (d6.contains(dist)) {
            messg = "db6";
        }

        return messg;
    }
}
