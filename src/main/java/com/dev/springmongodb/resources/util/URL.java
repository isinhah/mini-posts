package com.dev.springmongodb.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

//Classe que decodifica parâmetro de URL
public class URL {
    public static String decodeParam(String text) {
        try {
            return URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
