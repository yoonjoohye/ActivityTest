package a67yjh00.com.example.lg.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String name, tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button butback = (Button) findViewById(R.id.but_second);
        butback.setOnClickListener(butbackHandler);
        Intent intent=getIntent();
        name=intent.getStringExtra("name");
        tel=intent.getStringExtra("tel");
        TextView textResult=(TextView)findViewById(R.id.text_result);
        textResult.setText("*설명: "+name+"\n"+"*전화번호: "+tel);
    }
    View.OnClickListener butbackHandler=new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            finish();//사라지게함
        }
    };
}
