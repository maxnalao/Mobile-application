package com.example.productlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.productlist.model.Product;
import com.example.tan01.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Product> values;
    private Context context;

    public MyAdapter(List<Product> values, Context context) {
        this.values = values;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgView;
        public TextView txtHeader;
        public TextView txtPrice;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            imgView = (ImageView) v.findViewById(R.id.icon);
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtPrice = (TextView) v.findViewById(R.id.secondLine);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Product product = values.get(position);
        holder.txtHeader.setText(product.getProduct_name());
        holder.txtPrice.setText(product.getProduct_price() + " บาท");

        Glide.with(context)
                .load(product.getProduct_image())
                .into(holder.imgView);

        holder.imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // แสดง Toast
                Toast toast = Toast.makeText(context, product.getProduct_name(), Toast.LENGTH_SHORT);
                toast.show();

                // เปิด ProductDetailActivity
                Intent intent = new Intent(context, ProductDetailActivity.class);
                intent.putExtra("PRODUCT_NAME", product.getProduct_name());
                intent.putExtra("PRODUCT_IMAGE", product.getProduct_image());
                intent.putExtra("PRODUCT_PRICE", product.getProduct_price());
                intent.putExtra("PRODUCT_DESCRIPTION", product.getProduct_description()); // ส่งคำอธิบายสินค้า
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}

