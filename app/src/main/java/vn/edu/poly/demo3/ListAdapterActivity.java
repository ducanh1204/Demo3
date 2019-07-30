package vn.edu.poly.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListAdapterActivity extends AppCompatActivity {

    private ListView lvList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_adapter);
        lvList=findViewById(R.id.lvList);

        setTitle("simple_ListView");

        List<HashMap<String,Object>> ds = new ArrayList<HashMap<String, Object>>();
        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        hashMap.put("anh",R.mipmap.ic_launcher);
        hashMap.put("id","id001");
        hashMap.put("name","Ducanh1");
        ds.add(hashMap);

        hashMap=new HashMap<String, Object>();
        hashMap.put("anh",R.mipmap.ic_launcher);
        hashMap.put("id","id002");
        hashMap.put("name","Ducanh2");
        ds.add(hashMap);


        hashMap=new HashMap<String, Object>();
        hashMap.put("anh",R.mipmap.ic_launcher);
        hashMap.put("id","id003");
        hashMap.put("name","Ducanh3");
        ds.add(hashMap);

        String[] from = {"anh","id","name"};
        int[] to = {R.id.imganh,R.id.tvID,R.id.tvName};

        SimpleAdapter adapter = new SimpleAdapter(this,ds,R.layout.item_simple_listview,from,to);
        lvList.setAdapter(adapter);

    }
}
