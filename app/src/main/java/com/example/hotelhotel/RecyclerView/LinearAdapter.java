package com.example.hotelhotel.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelhotel.R;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;
    /*    private List<String> list;*/

    public LinearAdapter(Context context,OnItemClickListener listener){
        this.mContext = context;
        this.mListener = listener;
    }
    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, final int position) {
        holder.imageView.setImageResource(R.drawable.bj1);
        holder.textView2.setText("北京新国贸饭店");
        holder.textView3.setText("4.7分 好");
        holder.textView4.setText("“环境不错”");
        holder.textView5.setText("豪华型");
        holder.textView6.setText("休闲度假");
        holder.textView7.setText("￥1051起");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(position);
            }
        });

        holder.imageView.setImageResource(R.drawable.bj2);
        holder.textView2.setText("飘HOME连锁酒店");
        holder.textView3.setText("4.3分");
        holder.textView4.setText("“性价比高”");
        holder.textView5.setText("经济型");
        holder.textView6.setText("商务出行");
        holder.textView7.setText("￥328起");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{

        private TextView textView2,textView3,textView4,textView5,textView6,textView7;
        private ImageView imageView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.bjh_outlook);
            textView2 = itemView.findViewById(R.id.bjh_name);
            textView3 = itemView.findViewById(R.id.bjh_rate);
            textView4 = itemView.findViewById(R.id.bjh_comment);
            textView5 = itemView.findViewById(R.id.bjh_type);
            textView6 = itemView.findViewById(R.id.bjh_style);
            textView7 = itemView.findViewById(R.id.bjh_price);
        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
