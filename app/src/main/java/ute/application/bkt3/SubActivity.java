package ute.application.bkt3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import ute.application.bkt3.DAO.AuthorDAO;
import ute.application.bkt3.adapters.AuthorAdapter;

public class SubActivity extends AppCompatActivity {

    TextView tv;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        tv= findViewById(R.id.textViewBookNameActivity);
        img = findViewById(R.id.imageAuthorActivity);

        Intent myintent = getIntent();
        String name = myintent.getStringExtra("name");
        int image = myintent.getIntExtra("image",1);

        img.setImageResource(image);
        tv.setText(name);

//        setContentView(R.layout.activity_main);
//        lv=findViewById(R.id.listViewAuthor);
//        authorDAOArrayList =new ArrayList<>();
//
//        for(int i=0 ;i<bookName.length;i++){
//            authorDAOArrayList.add(new AuthorDAO(imageBook[i],bookName[i],bookDes[i]));
//        }
//        authorAdapter = new AuthorAdapter(SubActivity.this,R.layout.item_author,authorDAOArrayList);
//        lv.setAdapter(authorAdapter);

//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(MainActivity.this,SubActivity.class);
//                intent.putExtra("name",bookName[i]);
//                intent.putExtra("image",imageBook[i]);
//                intent.putExtra("des",bookDes[i]);
//                startActivity(intent);
//            }
//        });
    }
//
//    int imageBook[]={R.drawable.conan_doyle,R.drawable.agatha_chrisite,R.drawable.victor_hugo};
//    String bookName[]={"Arthur Conan Doyle","Agatha Christie","Victor Hugo"};
//    String bookDes[] = {"Ông hoàng của tiểu thuyết trinh thám","Nữ hoàng của tiểu thuyết trinh thám","Nhà văn của thời đại"};
//
//    ArrayList<AuthorDAO> authorDAOArrayList;
//    AuthorAdapter authorAdapter;
//    ListView lv;
}