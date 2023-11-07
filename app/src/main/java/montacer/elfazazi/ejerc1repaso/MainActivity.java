package montacer.elfazazi.ejerc1repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lbDineroAhorrado;
    TextView lbCigarrillosRestantes;
    Button btnCambiar;

    private int contador =0;
    private int dineroAhorrado= 0;
    final int cigarrosIniciales = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarVista();

        btnCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                int total = cigarrosIniciales-contador;
                lbCigarrillosRestantes.setText(String.valueOf(total));

                if (contador == 20){
                    contador=0;
                    dineroAhorrado+=5;
                    lbDineroAhorrado.setText(String.valueOf(dineroAhorrado));
                }
            }
        });
    }

    private void iniciarVista() {
        lbDineroAhorrado = findViewById(R.id.lbDineroAhorrado);
        btnCambiar = findViewById(R.id.btnCambiarCigarro);
        lbCigarrillosRestantes = findViewById(R.id.lbCigarrillosRestantes);

        lbCigarrillosRestantes.setText(String.valueOf(cigarrosIniciales));
        lbDineroAhorrado.setText(String.valueOf(dineroAhorrado));

    }
}