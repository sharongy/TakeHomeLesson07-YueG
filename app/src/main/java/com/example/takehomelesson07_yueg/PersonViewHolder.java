package com.example.takehomelesson07_yueg;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView personName;
    public TextView personInfo;
    public ImageView personPhoto;

    public PersonViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = itemView.findViewById(R.id.card_view);
        personName = itemView.findViewById(R.id.person_name);
        personInfo = itemView.findViewById(R.id.person_info);
        personPhoto = itemView.findViewById(R.id.person_photo);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, personName.getText(), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 1400);
                toast.show();
            }
        });
    }
}
