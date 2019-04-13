package not.mk.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import static not.mk.testapp.R.id.milkCheckboxID;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private Button clickButton;
    private CheckBox milkCheckBox,sugarCheckBox,orangeCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox = (CheckBox) findViewById(R.id.milkCheckboxID);
        sugarCheckBox = (CheckBox) findViewById(R.id.sugarCheckboxID);
        orangeCheckBox = (CheckBox) findViewById(R.id.orangeCheckboxID);
        clickButton = (Button) findViewById(R.id.clickButtonID);
        resultTextView = (TextView) findViewById(R.id.resultTextID);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if(milkCheckBox.isChecked()){
                   String val = milkCheckBox.getText().toString();
                   stringBuilder.append(val+" is Checked.\n\n");
                }
                if(sugarCheckBox.isChecked()){
                    String val = sugarCheckBox.getText().toString();
                    stringBuilder.append(val+" is Checked.\n\n");
                }
                if(orangeCheckBox.isChecked()){
                    String val = orangeCheckBox.getText().toString();
                    stringBuilder.append(val+" is Checked.\n\n");
                }

                resultTextView.setText(stringBuilder);
            }
        });

    }
}
