package com.example.ratul_pc.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {

    private Context  mContext;
    private List<Product> productList;

    public ProductAdapter(@NonNull Context context, List<Product> productList) {
        super(context, R.layout.product_model, productList);

        mContext =context;
        this.productList =productList;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater =LayoutInflater.from(mContext);

        convertView = inflater.inflate(R.layout.product_model,parent,false);

        Product product = productList.get(position);

        TextView productName =convertView.findViewById(R.id.productNameId);
        TextView productPrice =convertView.findViewById(R.id.productPriceId);
        TextView productLocation =convertView.findViewById(R.id.productLocationId);

        productName.setText(product.getmProductName());
        productPrice.setText(product.getmProductPrice());
        productLocation.setText(product.getmProductLocation());

        return convertView;
    }
}
