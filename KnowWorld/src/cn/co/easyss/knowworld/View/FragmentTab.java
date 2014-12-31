package cn.co.easyss.knowworld.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTab extends Fragment {

	  @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	               Bundle savedInstanceState) {
	    // Inflate the layout for this fragment
	    //return inflater.inflate(R.layout.fragment_tab, container, false);
		  String name = getArguments().getString("name");
		  Log.d("TabFragment.onCreateView", name);
		   
		  TextView textView = new TextView(getActivity());
		  textView.setGravity(Gravity.CENTER);
		  textView.setText(getArguments().getString("name"));
		 
		  return textView;
	  }
	}