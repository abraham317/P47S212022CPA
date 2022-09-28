package mx.edu.tesoem.isc.p47s212022cpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityDivision extends AppCompatActivity {

    Button btnatras2,division;
    EditText txtnum1, txtnum2;
    TextView lblresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        btnatras2=findViewById(R.id.btnatras4);
        btnatras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        lblresult = findViewById(R.id.btndividir);
        txtnum1 = findViewById(R.id.txtdivision1);
        txtnum2 = findViewById(R.id.txtdivision2);
        lblresult = findViewById(R.id.lblresult3);
        division = findViewById(R.id.btndividir);
    }

    public void div (View view){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        txtnum1.setText("");
        txtnum2.setText("");
        lblresult.setText("Resultado");
        if (num2 == 0) {
            Toast.makeText(ActivityDivision.this, "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
        } else {
            lblresult.setText(lblresult.getText().toString() + " " + String.valueOf(num1 / num2));
        }
    }
}