package ute.application.bkt3.adapters;

import android.app.Activity;
import android.content.Context;
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

import ute.application.bkt3.DAO.AuthorDAO;

public class AuthorAdapter extends ArrayAdapter<AuthorDAO> {
    Activity context;
    int idLayout;
    ArrayList<AuthorDAO> authorList;

    public AuthorAdapter(Activity context, int idLayout, ArrayList<AuthorDAO> authorList) {
        super(context, idLayout,authorList);
        this.context = context;
        this.idLayout = idLayout;
        this.authorList = authorList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mylaoutIn = context.getLayoutInflater();
        convertView =mylaoutIn.inflate(idLayout,null);

        AuthorDAO authorDAO = authorList.get(position);

        ImageView img_author = convertView.findViewById(R.id.imageAuthor);
        img_author.setImageResource(authorDAO.getAuthorImage());


        TextView txt_authorName = convertView.findViewById(R.id.textviewAuthorName);
        txt_authorName.setText(authorDAO.getAuthorName());

        TextView txt_authorDes = convertView.findViewById(R.id.textviewAuthorDes);
        txt_authorDes.setText(authorDAO.getAuthorDes());

        return  convertView;
    }
}
