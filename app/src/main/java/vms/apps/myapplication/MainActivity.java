package vms.apps.myapplication;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,view,"xyz");
                startActivity(intent,compat.toBundle());
            }
        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity12","onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity12","ondestroy");
    }
}
