package com.perpetua.pato.fiscalizar;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pato on 29/07/2015.
 */
public class ListAdapter extends BaseAdapter {
    Context context;
    protected List<String> lProvincia;
    LayoutInflater inflater;

    public ListAdapter(Context context, List<String> lEquipos) {
        this.lProvincia = lEquipos;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    public int getCount() {
        return lProvincia.size();
    }

    public String  getItem(int position) {
        return lProvincia.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = this.inflater.inflate(R.layout.item_lista,parent, false);
            holder.txtNombre = (TextView) convertView.findViewById(R.id.itmtxtNombre);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txtNombre.setText(lProvincia.get(position));
        TipodeLetra(holder);
        return convertView;
    }

    private void TipodeLetra(ViewHolder holder) {
        Typeface fuente = Typeface.createFromAsset(context.getAssets(), "CaptureIt.ttf");
        holder.txtNombre.setTypeface(fuente);
    }

    private class ViewHolder {
        TextView txtNombre;
    }

}
