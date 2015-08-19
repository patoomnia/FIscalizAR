package com.perpetua.pato.fiscalizar;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

/**
 * Created by Ariel on 19/08/2015.
 */
public class FragmentEscrutinio2  extends Fragment implements AdapterView.OnItemClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_escrutinio2, container, false);
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
}
