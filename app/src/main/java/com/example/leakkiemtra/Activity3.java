package com.example.leakkiemtra;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity3 extends AppCompatActivity {
    //Bước 1: Khai báo biến giao diện
    EditText editso;
    Button btnkiemtra, btnthoat;
    TextView txtketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_3);

        //Bước 2: Ánh xạ Id cho các biến giao diện
        editso = findViewById(R.id.editso);
        btnkiemtra = findViewById(R.id.btnkiemtra);
        btnthoat = findViewById(R.id.btnthoat);
        txtketqua = findViewById(R.id.txtketqua);

        //Bước 3: Viết code xử lý
        btnkiemtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editso.getText().toString().trim().isEmpty()) {
                    Toast.makeText(Activity3.this, "Vui lòng nhập số cần kiểm tra", Toast.LENGTH_SHORT).show();
                    editso.requestFocus();
                    return;
                }

                int n = Integer.parseInt(editso.getText().toString().trim());

                if (n >= 0) {
                    int can = (int) Math.sqrt(n);
                    if (can * can == n) {
                        txtketqua.setText(n + " là số chính phương");
                    } else {
                        txtketqua.setText(n + " không phải là số chính phương");
                    }
                } else {
                    txtketqua.setText(n + " không phải là số chính phương");
                }
            }
        });

        //Nút Thoát quay lại Activity 1
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
