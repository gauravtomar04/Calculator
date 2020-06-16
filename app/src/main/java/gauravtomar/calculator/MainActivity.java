package gauravtomar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ist,sec;
    TextView ans;
    Button ad;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ist = findViewById(R.id.istdigit);
        sec = findViewById(R.id.secdigit);
        ans = findViewById(R.id.answer);
        ad = findViewById(R.id.add);

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(ist.getText().toString());
                num2 = Integer.parseInt(sec.getText().toString());
              int sum = num1+num2;
              ans.setText(Integer.toString(sum));
            }
        });
    }
}