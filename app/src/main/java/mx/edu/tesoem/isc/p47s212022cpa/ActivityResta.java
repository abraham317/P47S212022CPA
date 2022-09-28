package mx.edu.tesoem.isc.p47s212022cpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityResta extends AppCompatActivity {

    Button btnatras,resta;
    EditText txtnum1, txtnum2;
    TextView lblresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        btnatras=findViewById(R.id.btnatras);
        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        lblresult = findViewById(R.id.btnrestar);
        txtnum1 = findViewById(R.id.txtresta1);
        txtnum2 = findViewById(R.id.txtresta2);
        lblresult = findViewById(R.id.lblresult1);
        resta = findViewById(R.id.btnrestar);
    }
    public void div (View view){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        txtnum1.setText("");
        txtnum2.setText("");
        lblresult.setText(lblresult.getText().toString() + " " + String.valueOf(num1 - num2));
    }
}