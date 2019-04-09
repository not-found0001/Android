package not.mk.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button1;
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.firstText);
        button1 = (Button) findViewById(R.id.firstButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                textView.setText("Clicked "+cnt+" times.");
            }
        });

    }
}
