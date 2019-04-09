package not.mk.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button logInButton,logOutButton;
    private EditText EditText1,EditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.FirstTextID);

        logInButton = (Button) findViewById(R.id.AddButtonID);
        logOutButton = (Button) findViewById(R.id.SubButtonID);

        EditText1 = (EditText) findViewById(R.id.editText1ID);
        EditText2 = (EditText) findViewById(R.id.editText2ID);

    }



    public void showMessage (View v){
        try{
            String number1 = EditText1.getText().toString();
            String number2 = EditText2.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId() == R.id.AddButtonID) {
                double Sum = num1 + num2;
                textView.setText("Sum is: " + Sum + "\n");
            } else if (v.getId() == R.id.SubButtonID) {
                double Sub = num1 - num2;
                textView.setText("Sub is: " + Sub + "\n");
            }
        }catch(Exception e){
            Toast.makeText(MainActivity.this,"Please Enter Number.",Toast.LENGTH_SHORT).show();
        }
    }
}
