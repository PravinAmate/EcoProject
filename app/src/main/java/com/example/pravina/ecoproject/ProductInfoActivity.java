package com.example.pravina.ecoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class ProductInfoActivity extends AppCompatActivity {

    GridView gridview;

    public static String[] osNameList = {
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
    };
    public static int[] osImages = {
            R.drawable.almond,
            R.drawable.almond,
            R.drawable.almond,
            R.drawable.almond,
            R.drawable.almond,
            R.drawable.almond,
            R.drawable.almond,
            R.drawable.almond,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);
        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(ProductInfoActivity.this, osNameList, osImages));
    }
}
