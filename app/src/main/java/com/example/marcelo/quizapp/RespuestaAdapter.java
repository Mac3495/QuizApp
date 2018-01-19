package com.example.marcelo.quizapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcelo on 18/01/2018.
 */

public class RespuestaAdapter extends RecyclerView.Adapter<RespuestaAdapter.ViewHolder> {

    private Context context;
    private List <Respuesta> dataset;

    public RespuestaAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_respuesta, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Respuesta respuesta = dataset.get(position);
        holder.img.setImageResource(respuesta.getImagen());
        holder.textRespuesta.setText(respuesta.getOpcion());
        holder.checkBox = new CheckBox(respuesta.getCheckBox());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView textRespuesta;
        CheckBox checkBox;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_item);
            textRespuesta = itemView.findViewById(R.id.text_item);
            checkBox = itemView.findViewById(R.id.cb_item);
        }
    }

    public void setDataset (List<Respuesta> lista){
        if(lista  == null){
            dataset = new ArrayList<>();
        }
        else{
            dataset = lista;
        }
        notifyDataSetChanged();
    }
}
