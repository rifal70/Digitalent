package com.application.digitalent.myapps.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.application.digitalent.myapps.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView menu_bawah;
    private TextView tulisan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        menu_bawah = findViewById(R.id.bottom_menu);
        tulisan = findViewById(R.id.tulisan);
        menu_bawah.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.home:
                //aksi ketika home di klik
                tulisan.setText("Tombol home diklik");
                break;
            case R.id.profile:
                //aksi ketika profile di klik
                tulisan.setText("Tombol profile diklik");
                break;
            case R.id.list:
                //aksi ketika folder di klik
                tulisan.setText("Tombol list diklik");
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Log.d("CDA", "onBackPressed Called");
        Intent setIntent = new Intent(Intent.ACTION_MAIN);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);
    }
}