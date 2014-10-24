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
        news1.setTitle("iphone6�׷�");
        news1.setContent("���۷���������iphone6�ױ���");
        news1.setPublishDate(new Date());
        Log.d("Tag", "news id is " + news1.getId());

        /**
         * save()�������ص���һ������ֵ�����ڱ�ʾ�洢�ɹ�����ʧ�ܣ���ͬʱҲ˵����������ǲ����׳��쳣�ġ�
         * ����洢ʧ�ܵĻ����׳��쳣�������Ƿ���һ��false���ǾͿ���ʹ��saveThrows()����������,
         * saveThrows()�������洢���ݣ�һ���洢ʧ�ܾͻ��׳�һ��DataSupportException�쳣
         * 
         */
        if (news1.save()) {
            Toast.makeText(this, "�洢�ɹ�", Toast.LENGTH_SHORT).show();
            Log.d("Tag", "news id is " + news1.getId());
        }
        else {
            Toast.makeText(this, "�洢ʧ��", Toast.LENGTH_SHORT).show();
        }

        /*****************************************************************/
        /**
         * ����ʵ����֮��Ĺ���
         */
        Comment comment1 = new Comment();
        comment1.setContent("really?!");
        comment1.setPublishDate(new Date());
        comment1.save();

        Comment comment2 = new Comment();
        comment2.setContent("��ʷֵ���ж���");
        comment2.setPublishDate(new Date());
        comment2.save();

        News news2 = new News();
        news2.getCommentList().add(comment1);
        news2.getCommentList().add(comment2);
        news2.setTitle("�������εķ�Դ");
        news2.setContent("����������Դ��ϣ�����ӡ�����");
        news2.setPublishDate(new Date());
        news2.setCommentCount(news2.getCommentList().size());
        news2.saveThrows();

    }

    /*****************************************************************/
}
