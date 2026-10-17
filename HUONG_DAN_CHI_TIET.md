# HƯỚNG DẪN THỰC HIỆN BÀI KIỂM TRA LẬP TRÌNH DI ĐỘNG TỪ A - Z
**(Thực hiện bằng thao tác KÉO THẢ giao diện & chuẩn phong cách ThS. Nguyễn Văn Khương)**

---

## 📌 MỤC LỤC
1. [Bước 1: Tạo Project trên Android Studio](#bước-1-tạo-project-trên-android-studio)
2. [Bước 2: Tạo thêm Activity2 và Activity3](#bước-2-tạo-thêm-activity2-và-activity3)
3. [Bước 3: Hướng dẫn KÉO THẢ giao diện (Design Mode)](#bước-3-hướng-dẫn-kéo-thả-giao-diện-design-mode)
   - [3.0. Quy tắc & Mẹo kéo thả không bị lỗi](#30-quy-tắc--mẹo-kéo-thả-dễ-nhất-trên-android-studio)
   - [3.1. Kéo thả Activity 1 (activity_main.xml)](#31-kéo-thả-activity-1-activity_mainxml)
   - [3.2. Kéo thả Activity 2 (activity_2.xml - Hình học)](#32-kéo-thả-activity-2-activity_2xml)
   - [3.3. Kéo thả Activity 3 (activity_3.xml - Số chính phương)](#33-kéo-thả-activity-3-activity_3xml)
4. [Bước 4: Viết mã nguồn Java](#bước-4-viết-mã-nguồn-java)
   - [4.1. MainActivity.java](#41-mainactivityjava)
   - [4.2. Activity2.java](#42-activity2java)
   - [4.3. Activity3.java](#43-activity3java)
5. [Bước 5: Khai báo AndroidManifest.xml](#bước-5-khai-báo-androidmanifestxml)
6. [Bước 6: Chạy thử và kiểm tra kết quả](#bước-6-chạy-thử-và-kiểm-tra-kết-quả)

---

## BƯỚC 1: TẠO PROJECT TRÊN ANDROID STUDIO
1. Mở **Android Studio** -> Chọn **New Project**.
2. Chọn template: **Empty Views Activity**. Nhấn **Next**.
3. Cấu hình thông tin:
   - **Name**: Đặt tên tiếng Việt không dấu (ví dụ: `NguyenVanA` hoặc `LEAKKIEMTRA`).
   - **Language**: Chọn **Java**.
   - **Minimum SDK**: Chọn mặc định (ví dụ API 24 hoặc API 26).
4. Nhấn **Finish** và đợi Gradle tải xong.

---

## BƯỚC 2: TẠO THÊM ACTIVITY2 VÀ ACTIVITY3
1. Ở cây thư mục bên trái: Nhấp chuột phải vào package `com.example...` (chứa `MainActivity`):
   - Chọn **New** -> **Activity** -> **Gallery...** -> **Empty Views Activity**.
   - **Activity Name**: Nhập `Activity2` (tự động sinh `activity_2.xml`).
   - Nhấn **Finish**.
2. Làm tương tự cho Activity thứ 3:
   - Chuột phải vào package -> **New** -> **Activity** -> **Empty Views Activity**.
   - **Activity Name**: Nhập `Activity3` (tự động sinh `activity_3.xml`).
   - Nhấn **Finish**.

---

## BƯỚC 3: HƯỚNG DẪN KÉO THẢ GIAO DIỆN (DESIGN MODE)

### 3.0. Quy tắc & Mẹo kéo thả dễ nhất trên Android Studio:
1. Mở file layout `.xml`, nhìn góc trên bên phải màn hình, chọn tab **Design** (hoặc **Split** để vừa thấy hình vừa thấy cây phân cấp).
2. **Mẹo không bị chạy lệch vị trí (Cực kỳ quan trọng)**:
   - Giao diện mặc định là `ConstraintLayout` rất khó căn chỉnh khi kéo thả.
   - Hãy chuyển sang **`LinearLayout (vertical)`**:
     - Nhìn vào bảng **Component Tree** (dưới cùng bên trái).
     - Nhấp chuột phải vào dòng đầu tiên (`ConstraintLayout`) -> Chọn **Convert view...** -> Chọn **LinearLayout** -> Nhấn **Apply**.
     - Nhìn sang bảng **Attributes** bên phải: Tìm thuộc tính **orientation** -> đổi thành **vertical**.
     - Tìm thuộc tính **id** -> đặt là **`main`**.

---

### 3.1. Kéo thả Activity 1 (`activity_main.xml`)

> **Mục tiêu**: Tiêu đề "KIỂM TRA 03", 2 Button mở Activity, 2 TextView hiển thị thông tin.

1. **Đổi root layout sang LinearLayout**:
   - Chuyển `ConstraintLayout` thành `LinearLayout (vertical)` như mẹo ở trên.
   - Trong bảng **Attributes**: Tìm **padding** -> nhập `20dp`.
2. **Kéo Tiêu đề**:
   - Từ bảng **Palette** -> chọn mục **Text** -> kéo `TextView` thả vào màn hình.
   - Bảng **Attributes** bên phải:
     - `id`: `txttieude`
     - `text`: `KIỂM TRA 03`
     - `textSize`: `24sp`
     - `textStyle`: chọn **bold**
     - `layout_gravity`: chọn **center_horizontal**
     - `layout_marginBottom`: `24dp`
3. **Kéo Button 1 (Mở Activity 2)**:
   - Từ bảng **Palette** -> chọn **Buttons** -> kéo `Button` thả vào dưới tiêu đề.
   - Bảng **Attributes**:
     - `id`: sửa thành **`btnact2`**
     - `text`: `OPEN ACTIVITY 01`
     - `layout_width`: `match_parent`
     - `layout_marginBottom`: `16dp`
4. **Kéo Button 2 (Mở Activity 3)**:
   - Từ bảng **Palette** -> chọn **Buttons** -> kéo `Button` thả vào dưới Button 1.
   - Bảng **Attributes**:
     - `id`: sửa thành **`btnact3`**
     - `text`: `OPEN ACTIVITY 02`
     - `layout_width`: `match_parent`
     - `layout_marginBottom`: `32dp`
5. **Kéo TextView Tên sinh viên**:
   - Từ bảng **Palette** -> **Text** -> kéo `TextView` thả vào dưới Button 2.
   - Bảng **Attributes**:
     - `id`: **`txttensv`**
     - `text`: `Tên sinh viên: Nguyễn Văn A`
     - `textSize`: `16sp`
     - `textStyle`: **bold**
     - `layout_marginBottom`: `8dp`
6. **Kéo TextView Lớp**:
   - Kéo thêm 1 `TextView` thả vào dưới Tên sinh viên.
   - Bảng **Attributes**:
     - `id`: **`txtlop`**
     - `text`: `Lớp: 21DTH01`
     - `textSize`: `16sp`
     - `textStyle`: **bold**

---

### 3.2. Kéo thả Activity 2 (`activity_2.xml` - Quản lý hình học)

> **Mục tiêu**: Tiêu đề banner, RadioGroup chọn 3 hình, các ô nhập số, 2 nút TÍNH/THOÁT, 3 dòng kết quả.

1. **Chuẩn bị khung cuộn**:
   - Mở `activity_2.xml` -> Tab **Design**.
   - Trong **Component Tree**, chuột phải vào gốc -> **Convert view...** -> Chọn **ScrollView**.
   - Từ **Palette** -> **Layouts** -> kéo `LinearLayout (vertical)` thả vào BÊN TRONG `ScrollView`. Đặt `id` của LinearLayout này là **`main`** và `padding` là `16dp`.
2. **Kéo Banner tiêu đề**:
   - Từ **Palette** -> **Text** -> kéo `TextView` thả vào đầu LinearLayout.
   - Bảng **Attributes**:
     - `text`: `QUẢN LÝ ĐỐI TƯỢNG HÌNH HỌC`
     - `textSize`: `16sp` | `textStyle`: **bold** | `gravity`: **center**
     - `background`: chọn màu xanh dương nhạt (hoặc `#5697B7`)
     - `textColor`: `#FFFFFF` | `layout_height`: `45dp`
3. **Kéo RadioGroup và các mục hình**:
   - Từ **Palette** -> mục **Buttons** -> kéo **`RadioGroup`** thả vào dưới Banner.
   - Bảng **Attributes**: đặt `id`: **`radgroup`**.
   - **Thêm Hình Tròn**:
     - Kéo **`RadioButton`** thả vào TRONG `radgroup` -> đặt `id`: **`radtron`**, `text`: `Hình tròn:`.
     - Từ **Palette** -> **Text** -> kéo **`Number (decimal)`** thả vào dưới `radtron` -> đặt `id`: **`editbankinh`**, `hint`: `Nhập bán kính:`.
   - **Thêm Hình Chữ Nhật**:
     - Kéo **`RadioButton`** thả vào TRONG `radgroup` -> đặt `id`: **`radchunhat`**, `text`: `Hình chữ nhật:`.
     - Kéo **`Number (decimal)`** -> đặt `id`: **`editchieudai`**, `hint`: `Nhập chiều dài:`.
     - Kéo **`Number (decimal)`** -> đặt `id`: **`editchieurong`**, `hint`: `Nhập chiều rộng:`.
   - **Thêm Hình Tam Giác**:
     - Kéo **`RadioButton`** thả vào TRONG `radgroup` -> đặt `id`: **`radtamgiac`**, `text`: `Hình tam giác:`.
     - Kéo **`Number (decimal)`** -> đặt `id`: **`editcanha`**, `hint`: `Nhập cạnh a:`.
     - Kéo **`Number (decimal)`** -> đặt `id`: **`editcanhb`**, `hint`: `Nhập cạnh b:`.
     - Kéo **`Number (decimal)`** -> đặt `id`: **`editcanhc`**, `hint`: `Nhập cạnh c:`.
4. **Kéo 2 nút TÍNH và THOÁT nằm ngang**:
   - Từ **Palette** -> **Layouts** -> kéo `LinearLayout (horizontal)` thả vào dưới `radgroup`.
   - Kéo 2 `Button` thả vào bên trong `LinearLayout (horizontal)` này:
     - Nút 1: `id`: **`btntinh`**, `text`: `TÍNH`, `layout_width`: `0dp`, `layout_weight`: `1`.
     - Nút 2: `id`: **`btnthoat`**, `text`: `THOÁT`, `layout_width`: `0dp`, `layout_weight`: `1`.
5. **Kéo 3 TextView hiển thị kết quả**:
   - Từ **Palette** -> **Text** -> kéo 3 cái `TextView` thả vào dưới cùng:
     - TextView 1: `id`: **`txttenhinh`**, `text`: `Đây là hình:`
     - TextView 2: `id`: **`txtchuvi`**, `text`: `Chu vi là:`
     - TextView 3: `id`: **`txtdientich`**, `text`: `Diện tích là:`

---

### 3.3. Kéo thả Activity 3 (`activity_3.xml` - Số chính phương)

> **Mục tiêu**: Ô nhập số kiểm tra, 2 nút KIỂM TRA/THOÁT, dòng TextView hiển thị kết quả.

1. **Đổi root layout sang LinearLayout**:
   - Chuột phải vào gốc trong **Component Tree** -> **Convert view...** -> **LinearLayout** -> chọn `orientation`: **vertical**, `id`: **`main`**, `padding`: `20dp`.
2. **Kéo ô nhập số**:
   - Từ **Palette** -> **Text** -> kéo **`Number`** (hoặc `Number (signed)`) thả vào màn hình.
   - Bảng **Attributes**:
     - `id`: **`editso`**
     - `hint`: `Nhập số cần kiểm tra:`
     - `layout_marginTop`: `20dp`, `layout_marginBottom`: `20dp`
3. **Kéo hàng ngang chứa 2 nút**:
   - Từ **Palette** -> **Layouts** -> kéo `LinearLayout (horizontal)` thả vào dưới ô nhập.
   - Kéo 2 `Button` thả vào trong hàng ngang này:
     - Nút 1: `id`: **`btnkiemtra`**, `text`: `KIỂM TRA`, `layout_width`: `0dp`, `layout_weight`: `1`.
     - Nút 2: `id`: **`btnthoat`**, `text`: `THOÁT`, `layout_width`: `0dp`, `layout_weight`: `1`.
4. **Kéo TextView kết quả**:
   - Từ **Palette** -> **Text** -> kéo `TextView` thả vào dưới 2 nút bấm.
   - Bảng **Attributes**:
     - `id`: **`txtketqua`**
     - `text`: `Kết quả có phải là số chính phương không?`
     - `textSize`: `15sp`

---

## BƯỚC 4: VIẾT MÃ NGUỒN JAVA
Sau khi kéo thả và đặt đúng các `id`, bạn chỉ cần copy nguyên văn code vào các file Java tương ứng.

### 4.1. `MainActivity.java`
```java
package com.example.leakkiemtra; // Giữ nguyên dòng package của bạn

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Bước 1: Khai báo biến giao diện
    Button btnact2, btnact3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Bước 2: Ánh xạ Id cho các biến giao diện
        btnact2 = findViewById(R.id.btnact2);
        btnact3 = findViewById(R.id.btnact3);

        //Bước 3: Viết code xử lý
        //Mở Activity 2 khi bấm nút 1
        btnact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Activity2.class);
                startActivity(myIntent);
            }
        });

        //Mở Activity 3 khi bấm nút 2
        btnact3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Activity3.class);
                startActivity(myIntent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
```

---

### 4.2. `Activity2.java`
```java
package com.example.leakkiemtra; // Giữ nguyên dòng package của bạn

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

                //Trường hợp 1: Hình Tròn
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

                //Trường hợp 2: Hình Chữ Nhật
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

                //Trường hợp 3: Hình Tam Giác
                else if (id == R.id.radtamgiac) {
                    if (editcanha.getText().toString().trim().isEmpty() || editcanhb.getText().toString().trim().isEmpty() || editcanhc.getText().toString().trim().isEmpty()) {
                        Toast.makeText(Activity2.this, "Vui lòng nhập đủ 3 cạnh tam giác", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    double a = Double.parseDouble(editcanha.getText().toString());
                    double b = Double.parseDouble(editcanhb.getText().toString());
                    double c = Double.parseDouble(editcanhc.getText().toString());

                    //Kiểm tra điều kiện 3 cạnh tam giác
                    if (a + b <= c || a + c <= b || b + c <= a) {
                        Toast.makeText(Activity2.this, "3 cạnh không tạo thành tam giác", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    //Bước 1: Tính nửa chu vi p
                    double chuvi = a + b + c;
                    double p = (a + b + c) / 2;
                    //Bước 2: Áp dụng công thức Heron tính diện tích S
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
```

---

### 4.3. `Activity3.java`
```java
package com.example.leakkiemtra; // Giữ nguyên dòng package của bạn

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
```

---

## BƯỚC 5: KHAI BÁO ANDROIDMANIFEST.XML
Mở file `app/src/main/AndroidManifest.xml`, kiểm tra bên trong thẻ `<application>` phải có 2 dòng khai báo sau:

```xml
<activity
    android:name=".Activity2"
    android:exported="false" />
<activity
    android:name=".Activity3"
    android:exported="false" />
```

---

## BƯỚC 6: CHẠY THỬ VÀ KIỂM TRA KẾT QUẢ
1. Nhấn nút **Run 'app'** (tam giác xanh ▶️) trên thanh công cụ của Android Studio.
2. Kiểm tra hoạt động:
   - **Activity 1**: Bấm 2 nút mở Activity 2 và Activity 3 xem chuyển trang được chưa.
   - **Activity 2**: Chọn thử lần lượt 3 hình, nhập số và bấm **TÍNH**, bấm **THOÁT** để quay lại.
   - **Activity 3**: Nhập số chính phương (ví dụ `9`, `16`, `25`) và số thường (ví dụ `10`, `15`) rồi bấm **KIỂM TRA**, bấm **THOÁT** để quay lại.
