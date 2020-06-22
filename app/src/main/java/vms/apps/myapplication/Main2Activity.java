package vms.apps.myapplication;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        findViewById(R.id.img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(Main2Activity.this,view,"xyz");
                startActivity(intent,compat.toBundle());
            }
        });
    }


    @Override
    protected void onStop() {

        Log.i("MainActivity12","onstop *** ");

            if (!isFinishing() && Build.VERSION.SDK_INT == Build.VERSION_CODES.Q) {
                new Instrumentation().callActivityOnSaveInstanceState(this, new Bundle());
            }
            super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity12","ondestroy **** " );
    }
}
