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

public class CustomerOrderSuccesfulDetials extends AppCompatActivity {

    ItemData itemsData[] = { new ItemData("Help",R.drawable.almond),
            new ItemData("Delete",R.drawable.apple),
            new ItemData("Cloud",R.drawable.apricot),
            new ItemData("Favorite",R.drawable.avocado),
            new ItemData("Like",R.drawable.banana),
            new ItemData("Rating",R.drawable.blackberry)};
   Button btnAddToCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_order_succesful_detials);
        // 2. set layoutManger
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listProductSerach1);
        btnAddToCart = (Button)findViewById(R.id.btnAddToCart);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        CutomerOrderSuccessfulDetailsAdapter mAdapter = new CutomerOrderSuccessfulDetailsAdapter(itemsData);
        // 4. set adapter
      //  recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerOrderSuccesfulDetials.this,ProductInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
