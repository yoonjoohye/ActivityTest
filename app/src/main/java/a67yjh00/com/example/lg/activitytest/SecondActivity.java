package a67yjh00.com.example.lg.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button butback = (Button) findViewById(R.id.but_second);
        butback.setOnClickListener(butbackHandler);
    }
    View.OnClickListener butbackHandler=new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            finish();//사라지게함
        }
    };
}
