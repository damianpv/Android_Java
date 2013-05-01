package com.example.holamundo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tv1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        int numero = 1000;
        
        String cadena = ". Prueba de App.";
        
        double decimal = 3.14;
        
        boolean bool = false;
        	
        int [] arreglo = new int [] {0, 1, 2, 3, 11, 27};	
        
        tv1 = (TextView) findViewById(R.id.textView1);
        
        tv1.setText("El valor 3 en el arreglo es: " + arreglo[2] + cadena);
        	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
