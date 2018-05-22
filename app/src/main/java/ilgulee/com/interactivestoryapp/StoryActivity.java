package ilgulee.com.interactivestoryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class StoryActivity extends AppCompatActivity {
    public static final String TAG=StoryActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent=getIntent();//ctrl+j
        //String name=intent.getStringExtra("name");
        String name=intent.getStringExtra(getString(R.string.key_name));
        Log.d(TAG,name);
    }
}
