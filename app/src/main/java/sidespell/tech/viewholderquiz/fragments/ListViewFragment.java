package sidespell.tech.viewholderquiz.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {

    ListView listview;
    ArrayAdapter<String> adapter;
    ImageView imageview;

    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

View view = inflater.inflate(R.layout.fragment_listview,container,false);

        return inflater.inflate(R.layout.fragment_listview,container,false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        listview = (ListView)view.findViewById(R.id.listView);
        imageview = (ImageView)view.findViewById(R.id.imageview);

        List<String> Movies = new ArrayList<String>();
        Movies.add("A Star War Movie");
        Movies.add("Dead Pool");
        Movies.add("The Forest");
        Movies.add("Batman v Superman");
        Movies.add("Captain America");
        Movies.add("X - Men");
        Movies.add("High Rise");
        Movies.add("Anomalisa");
        Movies.add("Ghostbusters");
        Movies.add("Suicide Squad");


//        ViewHolder holder = new ViewHolder();
//        holder.title = (TextView)convertView.

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();

  if(convertView == null){

      holder = new ViewHolder();
      holder.title = (TextView)convertView.findViewById(R.id.title);
      holder.genre = (TextView)convertView.findViewById(R.id.genre);
  }

            convertView.setTag(holder);
        return convertView;
    }



    static class ViewHolder{
        TextView title;
        TextView genre;
        TextView description;
        ImageView img;

    }

}
