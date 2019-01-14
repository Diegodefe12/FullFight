package app.diego.com.fullfight;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.diego.com.fullfight.R;
import app.diego.com.fullfight.model.Bloque;

public class PrincipalActivity extends AppCompatActivity implements BloqueFragment.ListenerRecyclerViewFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        BloqueFragment bloqueFragment = new BloqueFragment();
        pegarFragment(bloqueFragment);
    }

    public void pegarFragment(Fragment bloqueFragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedor, bloqueFragment).commit();


    }

    @Override
    public void informarSeleccion(Bloque bloque) {

    }
}
