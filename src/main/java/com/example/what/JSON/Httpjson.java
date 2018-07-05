package com.example.what.JSON;

import jdk.nashorn.internal.runtime.JSONListAdapter;

import javax.naming.Context;
import javax.swing.text.html.ListView;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Handler;

public class Httpjson extends Thread{
    private String url;
    private Context context;
    private ListView listView;
    private JSONListAdapter jsonListAdapter;
    private Handler handler;

    public Httpjson(String url,ListView listView,JSONListAdapter jsonListAdapter,Handler handler){
        super();
        this.url = url;
        this.listView = listView;
        this.jsonListAdapter = jsonListAdapter;
        this.handler = handler;

    }

    @Override
    public void run(){
        URL httpUrl;
        try {
            httpUrl = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


}
