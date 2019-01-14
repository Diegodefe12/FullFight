package app.diego.com.fullfight;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import app.diego.com.fullfight.adapter.BloqueAdapter;
import app.diego.com.fullfight.model.Bloque;
import app.diego.com.fullfight.model.BloqueProvider;


/**
 * A simple {@link Fragment} subclass.
 */
public class BloqueFragment extends Fragment implements BloqueAdapter.ListenerBloquesAdapter{

    private RecyclerView recyclerViewBloques;
    private ListenerRecyclerViewFragment listenerRecyclerViewFragment;




    public BloqueFragment() {
        // Required empty public constructor
    }
    public void onAttach(Context context){
        super.onAttach(context);
        this.listenerRecyclerViewFragment = (ListenerRecyclerViewFragment) context;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bloque, container, false);

        recyclerViewBloques = view.findViewById(R.id.fragmentBloque_recyclerView);
        List<Bloque> bloques = BloqueProvider.cargarBloques();

        BloqueAdapter bloqueAdapter = new BloqueAdapter(bloques,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerViewBloques.setLayoutManager(linearLayoutManager);
        recyclerViewBloques.setAdapter(bloqueAdapter);
        recyclerViewBloques.setHasFixedSize(true);


        return view;
    }

    @Override
    public void informarSeleccionado(Bloque bloque) {
        listenerRecyclerViewFragment.informarSeleccion(bloque);

    }
    public interface ListenerRecyclerViewFragment {
        public void informarSeleccion (Bloque bloque);
    }
}
