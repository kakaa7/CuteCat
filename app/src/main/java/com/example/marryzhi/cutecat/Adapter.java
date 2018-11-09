package com.example.marryzhi.cutecat;
import java.util.List;


import com.squareup.picasso.Picasso;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    private LayoutInflater flater;
    ImageView image;
    private TextView textView;
    private List<Images> list;
    private Context context;


    public Adapter(List<Images> list, Context context) {
        super();
        this.list = list;
        this.context = context;
    }


    @Override
    public int getCount() {
// TODO Auto-generated method stub
        return list.size();
    }


    @Override
    public Object getItem(int position) {
// TODO Auto-generated method stub
        return list.get(position);
    }


    @Override
    public long getItemId(int position) {
// TODO Auto-generated method stub
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
// TODO Auto-generated method stub
        if (convertView == null) {
            flater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = flater.inflate(R.layout.linear, parent, false);
        }
        image = (ImageView) convertView.findViewById(R.id.imageView);
        textView = (TextView) convertView.findViewById(R.id.textView);
        Picasso.with(context).load(list.get(position).getImageUrl())
                .into(image);
        textView.setText(list.get(position).getName());
        return convertView;
    }


}
