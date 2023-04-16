package com.example.oibsip_task1_unit_convertor;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.graphics.Color;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText mET;
        final TextView mTV;
        Button cen;
        Button miter;
        Button foot;
        Button milii;
        Button inch;
        Button kilo;

        cen= (Button) findViewById(R.id.button);
        milii=(Button) findViewById(R.id.button3);
        foot=(Button) findViewById(R.id.button5);
        miter=(Button) findViewById(R.id.button4);
        inch=(Button) findViewById(R.id.button6);
        kilo=(Button) findViewById(R.id.button7);
        mET=(EditText) findViewById(R.id.editText);
        mTV=(TextView) findViewById(R.id.textView);


        cen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert+0));               //Just put the formula here accordingly!!!
                mTV.setTextColor(Color.RED);
            }
        });
        milii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert*10));               //Just put the formula here accordingly!!!
                mTV.setTextColor(Color.RED);
            }
        });
        foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/30.40));               //Just put the formula here accordingly!!!
                mTV.setTextColor(Color.RED);
            }
        });
        miter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/100));               //Just put the formula here accordingly!!!
                mTV.setTextColor(Color.RED);
            }
        });
        inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/2.54 ));               //Just put the formula here accordingly!!!
                mTV.setTextColor(Color.RED);
            }
        });
        kilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert/100000));               //Just put the formula here accordingly!!!
                mTV.setTextColor(Color.RED);
            }
        });
    }
}