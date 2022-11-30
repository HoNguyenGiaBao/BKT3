package ute.application.bkt3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import ute.application.bkt3.DAO.AuthorDAO;
import ute.application.bkt3.adapters.AuthorAdapter;

public class MainActivity extends AppCompatActivity {

    int imageAuthor[]={R.drawable.conan_doyle,R.drawable.agatha_chrisite,R.drawable.victor_hugo};
    String authorName[]={"Arthur Conan Doyle","Agatha Christie","Victor Hugo"};
    String authorDes[] = {"Ông hoàng của tiểu thuyết trinh thám","Nữ hoàng của tiểu thuyết trinh thám","Nhà văn của thời đại"};

    ArrayList<AuthorDAO> authorDAOArrayList;
    AuthorAdapter authorAdapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listViewAuthor);
        authorDAOArrayList =new ArrayList<>();

        for(int i=0 ;i<authorName.length;i++){
            authorDAOArrayList.add(new AuthorDAO(imageAuthor[i],authorName[i],authorDes[i]));
        }
        authorAdapter = new AuthorAdapter(MainActivity.this,R.layout.item_author,authorDAOArrayList);
        lv.setAdapter(authorAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                intent.putExtra("name",authorName[i]);
                intent.putExtra("image",imageAuthor[i]);
                intent.putExtra("des",authorDes[i]);
                startActivity(intent);
            }
        });
    }
}