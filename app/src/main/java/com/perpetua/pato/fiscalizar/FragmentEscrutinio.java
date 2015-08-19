package com.perpetua.pato.fiscalizar;

import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Ariel on 19/08/2015.
 */
public class FragmentEscrutinio extends Fragment implements AdapterView.OnItemClickListener, View.OnClickListener{

    Button btnNvoEscrut;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_escrutinio, container, false);
        btnNvoEscrut = (Button) rootView.findViewById(R.id.btnNvoEscrut);
        btnNvoEscrut.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        getActivity().setTitle("TU VIEJA");
        Fragment defaultFragment = new FragmentEscrutinio();
        FragmentManager frgManager = getFragmentManager();
        for(int i = 0; i < frgManager.getBackStackEntryCount(); ++i) {
            frgManager.popBackStack();
        }
        frgManager.beginTransaction().replace(R.id.content_frame, defaultFragment).commit();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNvoEscrut:
                Fragment defaultFragment = new FragmentEscrutinio2();
                FragmentManager frgManager = getFragmentManager();
                for(int i = 0; i < frgManager.getBackStackEntryCount(); ++i) {
                    frgManager.popBackStack();
                }
                frgManager.beginTransaction().replace(R.id.content_frame, defaultFragment).commit();
                break;
        }
    }
}