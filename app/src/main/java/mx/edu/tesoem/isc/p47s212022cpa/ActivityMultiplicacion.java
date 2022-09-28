package mx.edu.tesoem.isc.p47s212022cpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityMultiplicacion extends AppCompatActivity {

    Button btnatras3,multiplicacion;
    EditText txtnum1, txtnum2;
    TextView lblresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        btnatras3=findViewById(R.id.btnatras3);
        btnatras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        lblresult = findViewById(R.id.btnmultiplicar);
        txtnum1 = findViewById(R.id.txtmulti1);
        txtnum2 = findViewById(R.id.txtmulti2);
        lblresult = findViewById(R.id.lblresult2);
        multiplicacion = findViewById(R.id.btnmultiplicar);
    }

    public void div (View view){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        txtnum1.setText("");
        txtnum2.setText("");
        lblresult.setText(lblresult.getText().toString() + " " + String.valueOf(num1 * num2));
    }
}