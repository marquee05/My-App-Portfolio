package com.marksancho.myappportfolio;

import android.animation.Animator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchApp(View v) {
        switch(v.getId()) {
            case R.id.app_button_spotify_streamer:
                showToast(getString(R.string.app_spotify_streamer), Toast.LENGTH_SHORT);
                break;
            case R.id.app_button_superduo_scores:
                showToast(getString(R.string.app_super_duo_score), Toast.LENGTH_SHORT);
                break;
            case R.id.app_button_superduo_library:
                showToast(getString(R.string.app_super_duo_library), Toast.LENGTH_SHORT);
                break;
            case R.id.app_button_build_it_bigger:
                showToast(getString(R.string.app_build_it_bigger), Toast.LENGTH_SHORT);
                break;
            case R.id.app_button_xyz_reader:
                showToast(getString(R.string.app_xyz_reader), Toast.LENGTH_SHORT);
                break;
            case R.id.app_button_capstone:
                showToast(getString(R.string.app_capstone), Toast.LENGTH_SHORT);
                break;
            default:
                showToast("N/A", Toast.LENGTH_SHORT);
                break;
        }

    }

    private void showToast(String message, int duration) {
        Toast.makeText(getApplicationContext(), "This button will launch " + message, duration).show();
    }
}
