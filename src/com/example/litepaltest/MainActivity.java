package com.example.litepaltest;

import java.util.Date;

import org.litepal.tablemanager.Connector;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.litepaltest.model.Comment;
import com.example.litepaltest.model.News;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db = Connector.getDatabase();

        /*****************************************************************/
        News news1 = new News();
        news1.setTitle("iphone6首发");
        news1.setContent("果粉疯抢，超薄iphone6易变形");
        news1.setPublishDate(new Date());
        Log.d("Tag", "news id is " + news1.getId());

        /**
         * save()方法返回的是一个布尔值，用于表示存储成功还是失败，但同时也说明这个方法是不会抛出异常的。
         * 如果存储失败的话就抛出异常，而不是返回一个false，那就可以使用saveThrows()方法来代替,
         * saveThrows()方法来存储数据，一旦存储失败就会抛出一个DataSupportException异常
         * 
         */
        if (news1.save()) {
            Toast.makeText(this, "存储成功", Toast.LENGTH_SHORT).show();
            Log.d("Tag", "news id is " + news1.getId());
        }
        else {
            Toast.makeText(this, "存储失败", Toast.LENGTH_SHORT).show();
        }

        /*****************************************************************/
        /**
         * 两个实体类之间的关联
         */
        Comment comment1 = new Comment();
        comment1.setContent("really?!");
        comment1.setPublishDate(new Date());
        comment1.save();

        Comment comment2 = new Comment();
        comment2.setContent("历史值得研读！");
        comment2.setPublishDate(new Date());
        comment2.save();

        News news2 = new News();
        news2.getCommentList().add(comment1);
        news2.getCommentList().add(comment2);
        news2.setTitle("民主政治的发源");
        news2.setContent("民主政治起源于希腊军队。。。");
        news2.setPublishDate(new Date());
        news2.setCommentCount(news2.getCommentList().size());
        news2.saveThrows();

    }

    /*****************************************************************/
}
