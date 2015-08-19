package com.perpetua.pato.fiscalizar;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ariel on 19/08/2015.
 */
public class FragmentMunicipio  extends Fragment implements AdapterView.OnItemClickListener {

    ArrayList<String> lMunicipios;
    ListView listViewMunicipios;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_municipio, container, false);
        lMunicipios = new ArrayList<>();
        lMunicipios.add("Calamuchita");
        lMunicipios.add("Capital");
        lMunicipios.add("Colón");
        lMunicipios.add("Cruz del Eje");
        lMunicipios.add("General Roca");
        lMunicipios.add("General San Martín");
        lMunicipios.add("Ischilín");
        lMunicipios.add("Rio Cuarto");
        lMunicipios.add("Rio Primero");
        lMunicipios.add("Río Seco");
        lMunicipios.add("Río Segundo");
        lMunicipios.add("San Alberto");
        lMunicipios.add("San Javier");
        lMunicipios.add("Marcos Juárez");
        lMunicipios.add("Minas");
        lMunicipios.add("Pocho");
        lMunicipios.add("Juárez Celman");
        lMunicipios.add("Punilla");
        lMunicipios.add("Santa María");
        lMunicipios.add("San Justo");
        lMunicipios.add("Sobremonte");
        lMunicipios.add("Tercero Arriba");
        lMunicipios.add("Totoral");
        lMunicipios.add("Presidente Roque Saenz Peña");
        lMunicipios.add("Tulumba");
        lMunicipios.add("Unión");

        listViewMunicipios = (ListView) rootView.findViewById(R.id.ListMunicipios);
        ListAdapter adapter = new ListAdapter(getActivity(), lMunicipios);
        listViewMunicipios.setAdapter(adapter);
        // Set the onItemClickListener on the ListView to listen for items clicks
        listViewMunicipios.setOnItemClickListener(this);
        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        getActivity().setTitle(lMunicipios.get(position));
        Fragment defaultFragment = new FragmentEscrutinio();
        FragmentManager frgManager = getFragmentManager();
        for(int i = 0; i < frgManager.getBackStackEntryCount(); ++i) {
            frgManager.popBackStack();
        }
        frgManager.beginTransaction().replace(R.id.content_frame, defaultFragment).commit();

    }
}
