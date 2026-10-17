package com.example.leakkiemtra;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {
    //Bước 1: Khai báo biến giao diện
    RadioGroup radgroup;
    RadioButton radtron, radchunhat, radtamgiac;
    EditText editbankinh, editchieudai, editchieurong, editcanha, editcanhb, editcanhc;
    Button btntinh, btnthoat;
    TextView txttenhinh, txtchuvi, txtdientich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);

        //Bước 2: Ánh xạ Id cho các biến giao diện
        radgroup = findViewById(R.id.radgroup);
        radtron = findViewById(R.id.radtron);
        radchunhat = findViewById(R.id.radchunhat);
        radtamgiac = findViewById(R.id.radtamgiac);

        editbankinh = findViewById(R.id.editbankinh);
        editchieudai = findViewById(R.id.editchieudai);
        editchieurong = findViewById(R.id.editchieurong);
        editcanha = findViewById(R.id.editcanha);
        editcanhb = findViewById(R.id.editcanhb);
        editcanhc = findViewById(R.id.editcanhc);

        btntinh = findViewById(R.id.btntinh);
        btnthoat = findViewById(R.id.btnthoat);

        txttenhinh = findViewById(R.id.txttenhinh);
        txtchuvi = findViewById(R.id.txtchuvi);
        txtdientich = findViewById(R.id.txtdientich);

        //Bước 3: Viết code xử lý
        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radgroup.getCheckedRadioButtonId();
                if (id == -1) {
                    Toast.makeText(Activity2.this, "Phải chọn loại hình cần tính", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Tính Hình Tròn
                if (id == R.id.radtron) {
                    if (editbankinh.getText().toString().trim().isEmpty()) {
                        Toast.makeText(Activity2.this, "Vui lòng nhập bán kính", Toast.LENGTH_SHORT).show();
                        editbankinh.requestFocus();
                        return;
                    }
                    double r = Double.parseDouble(editbankinh.getText().toString());
                    double chuvi = 2 * Math.PI * r;
                    double dientich = Math.PI * r * r;

                    txttenhinh.setText("Đây là hình: Hình tròn");
                    txtchuvi.setText("Chu vi là: " + chuvi);
                    txtdientich.setText("Diện tích là: " + dientich);
                }

                //Tính Hình Chữ Nhật
                else if (id == R.id.radchunhat) {
                    if (editchieudai.getText().toString().trim().isEmpty() || editchieurong.getText().toString().trim().isEmpty()) {
                        Toast.makeText(Activity2.this, "Vui lòng nhập đủ chiều dài và rộng", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    double cd = Double.parseDouble(editchieudai.getText().toString());
                    double cr = Double.parseDouble(editchieurong.getText().toString());
                    double chuvi = (cd + cr) * 2;
                    double dientich = cd * cr;

                    txttenhinh.setText("Đây là hình: Hình chữ nhật");
                    txtchuvi.setText("Chu vi là: " + chuvi);
                    txtdientich.setText("Diện tích là: " + dientich);
                }

                //Tính Hình Tam Giác
                else if (id == R.id.radtamgiac) {
                    if (editcanha.getText().toString().trim().isEmpty() || editcanhb.getText().toString().trim().isEmpty() || editcanhc.getText().toString().trim().isEmpty()) {
                        Toast.makeText(Activity2.this, "Vui lòng nhập đủ 3 cạnh tam giác", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    double a = Double.parseDouble(editcanha.getText().toString());
                    double b = Double.parseDouble(editcanhb.getText().toString());
                    double c = Double.parseDouble(editcanhc.getText().toString());

                    // Kiểm tra điều kiện tam giác
                    if (a + b <= c || a + c <= b || b + c <= a) {
                        Toast.makeText(Activity2.this, "3 cạnh không tạo thành tam giác", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    //Tính theo công thức đề bài
                    double chuvi = a + b + c;
                    double p = (a + b + c) / 2;
                    double dientich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                    txttenhinh.setText("Đây là hình: Hình tam giác");
                    txtchuvi.setText("Chu vi là: " + chuvi);
                    txtdientich.setText("Diện tích là: " + dientich);
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
