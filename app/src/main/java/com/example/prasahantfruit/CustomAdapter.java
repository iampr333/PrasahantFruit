package com.example.prasahantfruit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<NumberData> {

    private Context mContext;
    private  int mResource;
    int[] fImage;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<NumberData> objects, int[] fruitImages) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
       fImage = fruitImages;
    }
    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Nullable
    @Override
    public NumberData getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getCount() {
        return fImage.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       String hindi = getItem(position).getHindi();
       String eng  = getItem(position).getEng();


      NumberData numberData = new NumberData(hindi,eng);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);
        TextView tvHindi = convertView.findViewById(R.id.hindi_text_view);
        TextView tvEng = convertView.findViewById(R.id.eng_text_view);
        ImageView ivImage = convertView.findViewById(R.id.image_text_view);

         ivImage.setImageResource(fImage[position]);
        tvHindi.setText(hindi);
        tvEng.setText(eng);

          return convertView;
    }


}
