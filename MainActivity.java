package com.example.additioncalculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML components with Java
        num1 = findViewById(R.id.editTextText2);
        num2 = findViewById(R.id.editTextText3);
        add = findViewById(R.id.button);
        result = findViewById(R.id.editTextNumber);

        // Perform addition when button is clicked
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Please enter both numbers",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(number1);
                    int b = Integer.parseInt(number2);

                    int sum = a + b;

                    result.setText("Result: " + sum);
                }
            }
        });
    }
}
