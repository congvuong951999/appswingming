package com.example.swimmingtechniques;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class note extends AppCompatActivity {
    ListView lvPF;
    ArrayList<PlatfFrom> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // Hiệu ứng chuyển trang

        // phần  chuyển sang acti mới
        ActionBar actionBar = getSupportActionBar();
        setContentView(R.layout.activity_swimming_style);
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowCustomEnabled(true);
        }

        // xử lý nhận active lấy giá trị title từ main
        Intent intent = getIntent();
        String aTitle = intent.getStringExtra("title");
        actionBar.setTitle(aTitle);

        createData();

        swimmingAdapter adapter1 = new swimmingAdapter(note.this, R.layout.swin2,data);
        lvPF = (ListView)findViewById(R.id.listview2);
        lvPF.setAdapter(adapter1);
        lvPF.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // inten của thanahf vô
                gui(position);
            }
        });
    }
    private void createData(){
        data = new ArrayList<PlatfFrom>();
        data.add(new PlatfFrom(R.drawable.khoidong,"1: Khởi động trước khi bơi","Trong tất cả các môn thể thao, trong đó, bơi lội không ngoại lệ, việc khởi động kỹ lưỡng là điều vô cùng quan trọng. Trước khi đi bơi hãy dành thời gian khởi động trong khoảng 10 phút với những bài tập khởi động toàn thân và khởi động chuyên môn.\n" +
                "\n" +
                "Bạn hãy thực hiện những bài tập khởi động toàn thân, acsc động tác chạy, xoay khớp cổ chân, cổ tay, xoay vai, cổ … Đây là những thao tác giúp khởi động hệ thống khớp xương và cơ. Cơ sẽ được khởi động cho nóng lên, sẵn sàng thích ứng với một loạt những động tác mới của cơ thể."));
        data.add(new PlatfFrom(R.drawable.an,"2: Không ăn no khi đi bơi","Trong tất cả các kiểu bơi lội hiện nay, không có kiểu bơi nào phù hợp với việc bạn đang ăn no. Và cũng không có môn thể thao nào khuyến khích bạn tập luyện khi đang ăn no. Khi ăn xong, dạ dày sẽ phải tập trung làm nhiệm vụ co bóp thức ăn và ngay sau đó nó cần có thời gian nghỉ ngơi. Đo dó, bơi khi ăn no sẽ gây nên tình trạng đau dạ dày.\n" +
                "\n" +
                "Thời điểm đi bơi phù hợp nhất là cách bữa ăn từ 2 đến 3 giờ. Khi cơ thể quá nó các động tác của cơ thể kết hợp áp lực của nước sẽ tác động không tốt lên dạ dày. Khi cơ thể quá đói cũng sẽ không đủ thể lực để tham gia bơi lội, có thể dẫn đến tình trạng tụt huyết áp… Tốt nhất, nên đi bơi trong khoảng thời gian từ 16 giờ đến 18 giờ."));
        data.add(new PlatfFrom(R.drawable.water,"3: Bổ sung đủ nước cho cơ thể","Tham gia hoạt động bơi lội, cơ thể bạn sẽ vận động toàn diện. Lúc này sẽ tiêu hao lượng lớn calo và nước. Nước trong cơ thể sẽ bị hao hụt do sự bài tiết của mồ hôi. Bởi vậy, khi đi bơi, hãy chuẩn bị cho mình một bình nước và bổ sung nước ngay cho cơ thể.\n" +
                "Bạn có thể uống nước khi nghỉ ngơi giữa hiệp hoặc sau khi vừa bơi xong. Ngoài nước lọc thì những loại nước khoáng, nước muối cũng có tác dụng rất tốt cho cơ thể."));
        data.add(new PlatfFrom(R.drawable.sun,"4: Không bơi dưới trời nắng to","Chúng ta thường nghĩ rằng, khi trời nắng to, cơ thể nóng bức và ngột ngạt thì đi bơi sẽ là cách tốt nhất để giải nhiệt. Đó là lý do vì sao, vào mùa hè các bể bơi thường quá tải. Quả thực trời oi bức, nóng nực mà được ngâm mình trong làn nước mát thì còn gì thích thú bằng. Tuy nhiên, các bạn hãy lưu ý không nên bơi dưới trời nắng to.\n" +
                "\n" +
                "Thời điểm nắng to nhất thường là vào khoảng trưa, từ 11 giờ trưa đến 3 giờ chiều. Lúc này, chỉ số UV cao nhất, ảnh hưởng rất lớn đến làn da. Nó có thể khiến da bạn bị cháy nắng, đen sạm ảnh hưởng không nhỏ đến thẩm mỹ. Ngoài ra, khi nhiệt độ ngoài trời quá cao mà bạn đi bơi sẽ tạo nên một phản ứng sốc nhiệt, có thể gây nên tình trạng bị cảm giật, không tốt cho sức khỏe."));
        data.add(new PlatfFrom(R.drawable.icon,"5: Không bơi quá lâu","Khi thực hiện bất cứ bài tập nào, thời gian quá lâu cũng là điều không tốt. Đối với bơi lội cũng vậy. Dù bạn áp dụng các kiểu bơi nào thì cũng nên bơi trong khoảng thời gian thích hợp.\n" +
                "" +
                "Việc ngâm mình trong nước sẽ khiến cho nhiệt độ cơ thể bị giảm. Nhất là trong những ngày thời tiết lạnh, thì bơi quá lâu sẽ dễ dẫn đến cơ thể bị thoát nhiệt, cảm lạnh. Thời gian bơi lội lý tưởng nhất là trong 2 giờ đồng hồ. Nếu bơi quá lâu còn khiến cơ thể bị mất sức, không mang lại hiệu quả cho sức khỏe.\n" +
                "" +
                "Nhiều người thắc mắc rằng, đối với những người cao tuổi, liệu bơi 2 giờ có quá sức với họ không.\n"  + "Câu trả lời là không. Bơi lội là môn thể thao phù hợp với tất cả mọi người, mọi lứa tuổi. Do đó, nếu sức khỏe ổn định, người cao tuổi hoàn toàn có thể bơi 2 giờ mỗi ngày."));
        data.add(new PlatfFrom(R.drawable.phao,"6: Trang bị các dụng cụ hỗ trợ khi bơi","Khi tham gia bơi lội, ngoài việc cần nắm kỹ thuật của các kiểu bơi, thì người bơi cũng cần trang bị cho mình các dụng cụ hỗ trợ. Điều này có ý nghĩa to lớn trong việc đảm bảo an toàn và giúp họ thực hiện đúng động tác, nhất là với trẻ em và những người mới học bơi lần đầu.\n"+"\n" +" Những dụng cụ hỗ trợ khi bơi bao gồm phao bơi, phao tay, quần áo bơi, kính bơi, mũ bơi … Trong đó, phao bơi và phao tay giúp cho cơ thể có thể nổi trên mặt nước. Kính bơi giúp bảo vệ mắt không bị nước trong bể bơi làm tổn thương đồng thời đảm bảo việc quan sát được thuận tiện hơn. Mũ bơi giúp bảo vệ tóc trước những ảnh hưởng của hóa chất bể bơi hay nước biển mặn làm tóc khô, rít. Ngoài ra, người bơi cần thoa thêm kem chống nắng để bảo vệ làn da tốt nhất."));
    }

    private  void gui(int p){
        PlatfFrom a = data.get(p);
        Intent intent = new Intent(this,Techniques2.class);
        intent.putExtra("ok1","");
        intent.putExtra("okk1",a.getContent());
        intent.putExtra("title",a.getTitle());

        startActivity(intent);
    }
}