package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ali on 2/14/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Construcst a new {@link Earthquake}
     *
     * @param context of the app
     * @param earthquakes is the list of earthquake, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Return a list item view that display information about the earthquake at the given position
     * in the list of earthquakes.
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if there is an existing list item view (called convertView) that we can reuse,
        //otherwise , if convertView is null, then inflate a new list item layout
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquak_list_item, parent, false);
        }

        //Find the earthquake at the given position in the list of earthquakes

        Earthquake currentEarthquake = getItem(position);


        //Find the TextView with ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(currentEarthquake.getmMagnitude());

        //Find the TextView with ID loaction
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        //Display the location of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getmLocation());

        //Find the TextView with ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        //Display the date of the current earthquake in that TextView
        dateView.setText(currentEarthquake.getmDate());

        return listItemView;
    }
}
