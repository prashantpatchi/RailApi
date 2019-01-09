package win.prashant.indianrailapi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    String aa [] = {"android","haddop", "php", "java","c++"};

    ListView listView;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        listView = view.findViewById(R.id.Listview);
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(getContext(),R.layout.support_simple_spinner_dropdown_item,aa);
        listView.setAdapter(arrayAdapter);
        return view;
    }

}
