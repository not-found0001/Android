package not.mk.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = (Button) findViewById(R.id.clickButtonID);

    }

    public void showMessage (View v){
        if(v.getId()==R.id.clickButtonID) {
            LayoutInflater inflater = getLayoutInflater();
            View customView = inflater.inflate(R.layout.customtoast_layout, (ViewGroup) findViewById(R.id.customToastID));

            Toast toast = new Toast(MainActivity.this);

            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(customView);

            toast.show();
        }
    }
}
