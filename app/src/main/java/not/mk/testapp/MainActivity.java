package not.mk.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button logInButton,logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.firstText);
        logInButton = (Button) findViewById(R.id.loginButtonID);
        logOutButton = (Button) findViewById(R.id.logoutButtonID);

        logInButton.setOnClickListener(this);
        logOutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginButtonID){
           textView.setText("You Clicked Login Button.");
        }else if(v.getId()==R.id.logoutButtonID){
            textView.setText("You Clicked Logout Button.");
        }
    }
}
