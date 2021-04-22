package com.example.swimmingtechniques;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;


import com.airbnb.lottie.animation.content.Content;

import java.util.ArrayList;

import static com.example.swimmingtechniques.R.drawable.boi2;

public class SwimmingStyle extends AppCompatActivity {
    ListView lvPF;
    public static Position a = new Position();
    ArrayList<PlatfFrom> data;
    Animation right ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // Hiệu ứng chuyển trang

        // phần  chuyển sang acti mới
        ActionBar actionBar = getSupportActionBar();
        setContentView(R.layout.activity_swimming_style);
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true); // hien thi nut
            actionBar.setDisplayShowCustomEnabled(true); // quay ve activity
        }

        // xử lý nhận active lấy giá trị title
        Intent intent = getIntent();
        String aTitle = intent.getStringExtra("title"); // lấy dữ liệu qua
        actionBar.setTitle(aTitle);

        createData();

        swimmingAdapter adapter1 = new swimmingAdapter(SwimmingStyle.this, R.layout.swin2,data);
        lvPF = (ListView)findViewById(R.id.listview2);
        lvPF.setAdapter(adapter1);
        lvPF.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Send(position);
                Position.position = position ;
                // tạo bien toan cục lây vị trí
            }
        });
    }
    private void createData(){
        data = new ArrayList<PlatfFrom>();
        data.add(new PlatfFrom(R.drawable.conech,"1: Kiểu bơi ếch","Bơi ếch là kiểu bơi mô tả theo hình dáng của con ếch khi di chuyển dưới nước.\n" + "\n" + " Kiểu bơi này có các thao tác thực hiện đơn giản, nhưng tốc độ chậm nhất trong số tất cả các kiểu bơi hiện nay."));
        data.add(new PlatfFrom(R.drawable.icon,"2: Kiểu bơi sải","Bơi sải hay còn gọi là bơi trườn sấp hay bơi tự do. \n" + "\n" + " Đây là kiểu bơi có tốc độ nhanh nhất và thao tác thực hiện cũng không hề phức tạp. Động tác tay xé nước so le nhau, kết hợp với chân đạp mạnh về phía sau giúp cho toàn bộ cơ thể được trườn lên phía trước. Đây là một trong những kiểu bơi đơn giản, thường được hướng dẫn cho những người chưa biết bơi."));
        data.add(new PlatfFrom(R.drawable.conbuom,"3: Kiểu bơi bướm","Trong số các kiểu bơi phổ biến hiện nay thì bơi bướm đòi hỏi kỹ thuật cao nhất và nền tảng thể lực tốt nhất. \n" + "\n" + "Động tác này sử dụng 2 tay đối xứng trong khi hai chân khép lại đạp nước như đuôi cá. Kết hợp toàn thân trồi lên ngụp xuống tạo thành những đường uốn lượn uyển chuyển."));
        data.add(new PlatfFrom(R.drawable.logoboingua,"4: Kiểu bơi ngửa","Đây là kiểu bơi có kỹ thuật tương tự giống như bơi sải.\n" + "\n" + " Tuy nhiên bơi sải thì nằm sấp còn kiểu bơi này thì nằm ngửa."));
        data.add(new PlatfFrom(R.drawable.luonsong,"5: Kiểu bơi lượn sóng", "Bơi lượn sóng hay còn gọi với cái tên khác là bơi lặn. Đây là kiểu bơi mô phỏng lại hình dáng di chuyển của con sâu\n" + "\n" + " Các động tác bơi đòi hỏi kỹ thuật tương đối phức tạp. Kiểu bơi lội này 2 chân khép lại, dùng lực từ lưng, đẩy người lên xuống sao cho phần mông và ngực di chuyển theo hình lượn sóng."));
        data.add(new PlatfFrom(R.drawable.logocho,"6: Kiểu bơi chó", "Đây là kiểu bơi mô tả hình dáng bơi của chó. Kiểu bơi này được những người thường xuyên bơi lội phát minh ra và nhanh chóng được nhiều người áp dụng theo bởi thao tác thực hiện đơn giản.\n" +
                "\n" +
                "Tư thế bơi chó là tư thế úp người, chân đạp giống như trong kỹ thuật bơi sải. Tay để trước ngực và đẩy song song về phía sau. Lặp đi lặp lại động tác nhiều lần."));
    }

    private  void Send(int p){
        PlatfFrom a = data.get(p);
        Intent intent1 = new Intent(this,Techniques.class);
        intent1.putExtra("okk",a.getContent());
        intent1.putExtra("title",a.getTitle()); // lấy lại title tiêu đề
        startActivity(intent1);
    }
}