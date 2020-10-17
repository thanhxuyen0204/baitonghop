package com.thanhxuyen.baitaptonghop1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class list extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"BAI1","BAI2","BAI3","BAI4","BAI4"};
    String mAgo[] = {"1 giờ trước","2 giờ trước","12 giờ trước","2 ngày trước","3 ngày trước",};
    String mDescription[]={"hôm nay trời rất đẹp, tôi đi dạo ở công viên","hôm nay trời rất đẹp, tôi đi dạo ở công viên","hôm nay trời rất đẹp, tôi đi dạo ở công viên","hôm nay trời rất đẹp, tôi đi dạo ở công viên","hôm nay trời rất đẹp, tôi đi dạo ở công viên"};
    int images[] ={R.drawable.bacphan,R.drawable.hoahaiduong,R.drawable.emgioi,R.drawable.hongnhan,R.drawable.saoemvotinh};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.ListView);
        MyAdapter adapter = new MyAdapter( this, mTitle,mAgo,mDescription,images);
        listView.setAdapter(adapter);
    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rAgo[];
        String rDescription[];
        int rImgs[];
        MyAdapter (Context c, String title[],String Ago[],String description[],int imgs[] ){
            super(c,R.layout.row, R.id.textview1,title);
            this.context =c;
            this.rTitle=title;
            this.rAgo=Ago;
            this.rDescription=description;
            this.rImgs=imgs;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent, false);
            ImageView images= row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textview1);
            TextView myAgo = row.findViewById(R.id.textview2);
            TextView myDescription = row.findViewById(R.id.textview3);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myAgo.setText(rAgo[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }

    }
    public void back(View view){
        Intent intent = new Intent(list.this, profile.class);
        startActivity(intent);
    }
}
