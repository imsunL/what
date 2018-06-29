package com.example.what.JSON;

import jdk.internal.org.objectweb.asm.Handle;
import jdk.nashorn.internal.runtime.JSONListAdapter;

import javax.naming.Context;
import javax.swing.text.html.ListView;
import java.util.logging.Handler;

public class Httpjson extends Thread{
    private String url;
    private Context context;
    private ListView listView;
    private JSONListAdapter jsonListAdapter;
    private Handler handler;

    public Httpjson(String url,ListView listView,JSONListAdapter jsonListAdapter,Handler handler){
        super();
    }
}
