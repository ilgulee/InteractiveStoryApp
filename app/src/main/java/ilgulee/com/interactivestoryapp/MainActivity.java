package ilgulee.com.interactivestoryapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameField;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField=findViewById(R.id.nameEditText);
        startButton=findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nameField.getText().toString();//toString() is required.
                //Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();//MainActivity.this is important.
                storyActivity(name);

            }
        });
    }

    private void storyActivity(String name) {
        Intent intent=new Intent(this,StoryActivity.class);
        //intent.putExtra("name",name);
        Resources resources=getResources();
        String key=resources.getString(R.string.key_name);
        intent.putExtra(key,name);
        startActivity(intent);

    }
}
