package ute.application.bkt3.adapters;
import android.app.Activity;

import ute.application.bkt3.DAO.BookDAO;
import ute.application.bkt3.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<BookAdapter>{
    Activity context;
    int idLayout;
    ArrayList<BookDAO> bookList;

    public BookAdapter(Activity context, int idLayout, ArrayList<BookDAO> bookList) {
        super(context,idLayout,bookList);
        this.context = context;
        this.idLayout = idLayout;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mylaoutIn = context.getLayoutInflater();
        convertView =mylaoutIn.inflate(idLayout,null);

        BookDAO bookDAO = bookList.get(position);

        ImageView img_author = convertView.findViewById(R.id.imageAuthor);
        img_author.setImageResource(bookDAO.getBookImage());


        TextView txt_authorName = convertView.findViewById(R.id.textviewAuthorName);
        txt_authorName.setText(bookDAO.getBookName());

        TextView txt_authorDes = convertView.findViewById(R.id.textviewAuthorDes);
        txt_authorDes.setText(bookDAO.getBookDes());

        return  convertView;
    }
}
