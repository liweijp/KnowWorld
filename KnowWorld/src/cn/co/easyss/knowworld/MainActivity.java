package cn.co.easyss.knowworld;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.util.Log;
import android.widget.Button;
import android.widget.TabHost.TabSpec;
import cn.co.easyss.knowworld.View.FragmentTab;


public class MainActivity extends FragmentActivity implements FragmentTabHost.OnTabChangeListener {

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);

	    // FragmentTabHost を取得する
	    FragmentTabHost tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
	    tabHost.setup(this, getSupportFragmentManager(), R.id.container);
	    TabSpec tabSpec1 = tabHost.newTabSpec("tab1");
        Button button1 = new Button(this);
        //button1.setBackgroundResource(R.drawable.tab_left);
        button1.setText("TAB1");
        tabSpec1.setIndicator(button1);
        Bundle bundle1 = new Bundle();
        bundle1.putString("name", "Tab1");
        tabHost.addTab(tabSpec1, FragmentTab.class, bundle1);
         
        TabSpec tabSpec2 = tabHost.newTabSpec("tab2");
        Button button2 = new Button(this);
        button2.setText("TAB2");
       // button2.setBackgroundResource(R.drawable.tab_center);
        tabSpec2.setIndicator(button2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", "Tab2");
        tabHost.addTab(tabSpec2, FragmentTab.class, bundle2);
         
        TabSpec tabSpec3 = tabHost.newTabSpec("tab3");
        Button button3 = new Button(this);
        button3.setText("TAB3");
        //button3.setBackgroundResource(R.drawable.tab_right);
        tabSpec3.setIndicator(button3);
        Bundle bundle3 = new Bundle();
        bundle3.putString("name", "Tab3");
        tabHost.addTab(tabSpec3, FragmentTab.class, bundle3);
        
	  }

	  @Override
	  public void onTabChanged(String tabId) {
	    Log.d("onTabChanged", "tabId: " + tabId);
	  }
	}