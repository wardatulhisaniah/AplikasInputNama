package id.ac.poliban.mi.atul.aplikasinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.et_nama);
        Button btTampilkan = findViewById(R.id.bt_ampilkan);

        btTampilkan.setOnClickListener(v ->
                Toast.makeText(this, "Hai Selamat Pagi" + etNama.getText().toString(), Toast.LENGTH_SHORT).show()
        );

    }
}
