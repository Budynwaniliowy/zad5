package com.example.domekwgorach;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private TextView licznikTextView;
    private int licznik = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titleTextView = findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView);
        Button polubButton = findViewById(R.id.polub);
        Button usunButton = findViewById(R.id.usun);
        Button zapiszButton = findViewById(R.id.zapisz);
        licznikTextView = findViewById(R.id.licznik);
        TextView opisTextView = findViewById(R.id.opis);
        TextView opisDomTextView = findViewById(R.id.opisdom);
        titleTextView.setText("Domek w górach");
        opisTextView.setText("Opis");
        opisDomTextView.setText("Odwiedź komfortowy domek w Sudetach, blisko do szlaków turystycznych");
        polubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                licznik++;
                updateLicznikText();
            }
        });
        usunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik > 0) {
                    licznik--;
                }
                updateLicznikText();
            }
        });
        zapiszButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        updateLicznikText();
    }
    private void updateLicznikText() {
        String text = licznik + " polubień";
        licznikTextView.setText(text);
    }
}