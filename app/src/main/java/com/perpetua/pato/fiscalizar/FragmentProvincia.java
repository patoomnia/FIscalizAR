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


public class FragmentProvincia extends Fragment implements AdapterView.OnItemClickListener{

    ArrayList<String> lProvincias;
    ListView listViewProvincias;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_provincia, container, false);
        lProvincias = new ArrayList<>();
        lProvincias.add("Buenos Aires");
        lProvincias.add("Catamarca");
        lProvincias.add("Capital Federal");
        lProvincias.add("Chaco");
        lProvincias.add("Chubut");
        lProvincias.add("Cordoba");
        lProvincias.add("Corrientes");
        lProvincias.add("Entre Rios");
        lProvincias.add("Formosa");
        lProvincias.add("Jujuy");
        lProvincias.add("La Pampa");
        lProvincias.add("La Rioja");
        lProvincias.add("Mendoza");
        lProvincias.add("Misiones");
        lProvincias.add("Neuquen");
        lProvincias.add("Rio Negro");
        lProvincias.add("Salta");
        lProvincias.add("San Juan");
        lProvincias.add("San Luis");
        lProvincias.add("Santa Cruz");
        lProvincias.add("Santa Fe");
        lProvincias.add("Santiago del Estero");
        lProvincias.add("Tierra Del Fuego");
        lProvincias.add("Tucuman");
        listViewProvincias = (ListView) rootView.findViewById(R.id.ListMunicipios);
        ListAdapter adapter = new ListAdapter(getActivity(), lProvincias);
        listViewProvincias.setAdapter(adapter);
        // Set the onItemClickListener on the ListView to listen for items clicks
        listViewProvincias.setOnItemClickListener(this);
        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        getActivity().setTitle(lProvincias.get(position));
        Fragment defaultFragment = new FragmentMunicipio();
        FragmentManager frgManager = getFragmentManager();
        for(int i = 0; i < frgManager.getBackStackEntryCount(); ++i) {
            frgManager.popBackStack();
        }
        frgManager.beginTransaction().replace(R.id.content_frame, defaultFragment).commit();

    }
}
