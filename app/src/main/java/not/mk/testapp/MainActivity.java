package not.mk.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button logInButton,logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.firstText);
        logInButton = (Button) findViewById(R.id.loginButtonID);
        logOutButton = (Button) findViewById(R.id.logoutButtonID);

    }


    public void showMessage(View v) {
        if(v.getId()==R.id.loginButtonID){
           /// textView.setText("You Clicked Login Button.");
            Toast.makeText(MainActivity.this,"You Clicked Login Button.",Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.logoutButtonID){
            /// textView.setText("You Clicked Logout Button.");
            Toast.makeText(MainActivity.this,"You Clicked Logout Button.",Toast.LENGTH_SHORT).show();
        }
    }
}
