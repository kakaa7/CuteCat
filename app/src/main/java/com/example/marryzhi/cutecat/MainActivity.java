package com.example.marryzhi.cutecat;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button csgo;
    private ListView listView;
    private List<Images> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        csgo =  findViewById(R.id.csgo);
        listView =  findViewById(R.id.listView);
        csgo.setOnClickListener(this);
        list = new ArrayList<Images>();
        list.add(new Images(
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542383693&di=67852b4000e917b42cd5a6c2ec48dea8&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.csgo.com.cn%2Fcsgo%2F5d%2Fb4%2F5db436bd2b65071c9ab839ddb3e66f281539848350.jpg",
                "CT狙"));
        list.add(new Images(
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1541788973091&di=454f7e4123b9691e140bd149db9db5ce&imgtype=0&src=http%3A%2F%2Fimg.csgo.com.cn%2Fcsgo%2F59%2Fc7%2F59c79f11bfc4726593c709a8d272150b1539848796.jpg",
                "T变色龙"));
        list.add(new Images(
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1541789082178&di=f34dd15d16a16875311c8c2b916be9d7&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01e69858e484aba801219c77641ed0.jpg%401280w_1l_2o_100sh.png",
                "沙鹰"));
        list.add(new Images(
                "http://bpic.588ku.com/element_origin_min_pic/16/11/20/1158311cdcc5205.jpg",
                "气球"));
        list.add(new Images(
                "http://bpic.588ku.com/element_origin_min_pic/16/06/23/12576b6b4ebc191.jpg",
                "蓝天"));
        list.add(new Images(
                "http://bpic.588ku.com/element_origin_min_pic/25/03/20/1656f4dbb30e81b.jpg",
                "放大镜"));

    }
    public void onClick(View v) {
// TODO Auto-generated method stub
        if (v.getId() == R.id.csgo) {
            listView.setAdapter(new Adapter(list, MainActivity.this));
        }
    }
}


