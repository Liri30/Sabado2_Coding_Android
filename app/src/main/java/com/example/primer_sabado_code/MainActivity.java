package com.example.primer_sabado_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button, button2;
    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);


    }

    //Este metodo se llama desde la vista/layout para el button
    public void presionar(View view) {
        myEditText = findViewById(R.id.myEditText);
        String input = String.valueOf(myEditText.getText());
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }

    //este metodo se llamar con el listener en la clase, para eso se implementa el metodo OnClickListener de la clase View
    //para el button
    @Override
    public void onClick(View v) {
        myEditText = findViewById(R.id.myEditText);
        String input = String.valueOf(myEditText.getText());

        if (v.getId() == R.id.button)
            Toast.makeText(this, input + "Button Entrar", Toast.LENGTH_LONG).show();

        else if (v.getId() == R.id.button2)
            Toast.makeText(this, input + "Button Otra vez", Toast.LENGTH_LONG).show();

    }
}
