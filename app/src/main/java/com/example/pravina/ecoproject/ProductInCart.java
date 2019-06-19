package com.example.pravina.ecoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.pravina.ecoproject.adapter.ProductInCartAdapter;

public class ProductInCart extends AppCompatActivity {

    ItemData itemsData[] = { new ItemData("Help",R.drawable.almond),
            new ItemData("Delete",R.drawable.apple),
            new ItemData("Cloud",R.drawable.apricot),
            new ItemData("Favorite",R.drawable.avocado),
            new ItemData("Like",R.drawable.banana),
            new ItemData("Rating",R.drawable.blackberry)};
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_in_cart);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listProductSerach12);
        Button btnNext = (Button) findViewById(R.id.btnNext);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        ProductInCartAdapter mAdapter = new ProductInCartAdapter(itemsData);
        // 4. set adapter
        //recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductInCart.this,CustomerOrderSuccesfulDetials.class);
                startActivity(intent);
            }
        });
    }

}
