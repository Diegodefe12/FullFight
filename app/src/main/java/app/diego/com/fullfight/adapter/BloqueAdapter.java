package app.diego.com.fullfight.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.diego.com.fullfight.BloqueFragment;
import app.diego.com.fullfight.R;
import app.diego.com.fullfight.model.Bloque;

public class BloqueAdapter extends RecyclerView.Adapter {
    private List<Bloque> listaDeBolques;
    private ListenerBloquesAdapter listenerBloquesAdapter;

    public BloqueAdapter(List<Bloque> listaDeBolques, ListenerBloquesAdapter listenerBloquesAdapter) {
        this.listaDeBolques = listaDeBolques;
        this.listenerBloquesAdapter = listenerBloquesAdapter;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View viewCelda = inflador.inflate(R.layout.celda_bloques,parent,false);
        BloqueViewHolder bloqueViewHolder = new BloqueViewHolder(viewCelda);
        return bloqueViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i) {
        Bloque bloque = listaDeBolques.get(i);
        BloqueViewHolder bloqueViewHolder = (BloqueViewHolder) holder;
        bloqueViewHolder.bind(bloque);

    }

    @Override
    public int getItemCount() {
        return listaDeBolques.size();
    }

    private class BloqueViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo;
        private TextView descripción;
        private TextView intensidad;
        private Bloque bloque;

        public BloqueViewHolder(@NonNull View itemView) {
            super(itemView);
            this.titulo = itemView.findViewById(R.id.celdaBloque_TextView_Titulo);
            this.descripción = itemView.findViewById(R.id.celdaBloque_TextView_descripcion);
            this.intensidad = itemView.findViewById(R.id.celdaBLoque_TextView_Intensidad);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listenerBloquesAdapter.informarSeleccionado(bloque);

                }
            });
        }



        public void bind (Bloque unBloque){
            this.bloque = unBloque;
            titulo.setText (unBloque.getTítulo());
            descripción.setText(unBloque.getDescripcion());
            intensidad.setText(unBloque.getIntensidad());

        }
    }
    public interface ListenerBloquesAdapter{
        public void informarSeleccionado(Bloque bloque);
    }
}
