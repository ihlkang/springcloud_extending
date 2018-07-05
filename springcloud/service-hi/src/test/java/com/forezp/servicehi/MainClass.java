package com.forezp.servicehi;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
    @Test
    public void test() {
        Scanner in = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        Map<String,Object> map = new HashMap<>();
        while (in.hasNext()) {
            stringBuffer.append(in.next());
        }
        String key = in.next();
        String[] lines =
                stringBuffer.toString().replace("{","").replace("}","").
                        replace("\"","").split("\\,");
        for(int i=0;i<lines.length;i++){
            String[] strings = lines[i].split(":");
            int length = strings.length;
            if(length==2){
                map.put(strings[0].trim(),strings[1].trim());
            }
        }
        System.out.println(map.get(key));
    }
}
