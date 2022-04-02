package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LinesRecViewAdapter extends RecyclerView.Adapter<LinesRecViewAdapter.ViewHolder> {
    private ArrayList<Linea> elencoLinee=new ArrayList<>();

    private Context context;

    public LinesRecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lines_list_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.nGiuste.setText(elencoLinee.get(position).getnGiuste());
        holder.nSbagliate.setText(elencoLinee.get(position).getnSbagliate());
        holder.nBianche.setText(elencoLinee.get(position).getnBianche());

        holder.punti.setText(elencoLinee.get(position).getPunti());

    }

    @Override
    public int getItemCount() {
        return elencoLinee.size();
    }

    public void setLines(ArrayList<Linea> linee){
        this.elencoLinee=linee;
        notifyDataSetChanged();

    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        private CardView parent;
        private TextView nGiuste,nSbagliate,nBianche,punti;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent=itemView.findViewById(R.id.parent);
            nGiuste=itemView.findViewById(R.id.txtnumG);
            nSbagliate=itemView.findViewById(R.id.txtnumS);
            nBianche=itemView.findViewById(R.id.txtnumB);
            punti=itemView.findViewById(R.id.txtPunti);
        }
    }
}
