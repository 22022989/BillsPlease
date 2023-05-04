package sg.edu.rp.c346.id22022989.billsplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView Amountpaid;
    TextView Pax;
    TextView Discount;
    ToggleButton SVSCheck;
    ToggleButton GSTCheck;
    RadioGroup GroupPay;
    RadioButton rButtonCash;
    RadioButton rButtonPaynow;
    Button btnSplit;
    Button btnReset;
    TextView tvTotal;
    TextView tvSplit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Amountpaid = findViewById(R.id.textViewAmount);
        Pax = findViewById(R.id.editTextPax);
        SVSCheck = findViewById(R.id.toggleButtonSVS);
        GSTCheck = findViewById(R.id.toggleButtonGST);
        GroupPay = findViewById(R.id.radiogroupPay);
        rButtonCash = findViewById(R.id.radioButtonCash);
        rButtonPaynow = findViewById(R.id.radioButtonPaynow);
        btnSplit = findViewById(R.id.ButtonSplit);
        btnReset = findViewById(R.id.ButtonReset);
        tvTotal = findViewById(R.id.textViewTotal);
        tvSplit = findViewById(R.id.textViewSpilt);

        SVSCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SVSCheck.isChecked()) {

                }

            }
        });
    }
}