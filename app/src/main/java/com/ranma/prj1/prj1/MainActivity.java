package com.ranma.prj1.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtOutput;
    private Button btnOuput;
    private LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOutput = (EditText) findViewById(R.id.txtOutput);
        btnOuput = (Button) findViewById(R.id.btnOutput);
        linear = (LinearLayout) findViewById(R.id.linear);

        btnOuput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                TextView textView = new TextView(MainActivity.this);
                textView.setText(txtOutput.getText());
                textView.setLayoutParams(layout);
                linear.addView(textView);
            }
        });
    }

}
