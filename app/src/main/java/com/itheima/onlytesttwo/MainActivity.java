package com.itheima.onlytesttwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        //1.先github上创建一个项目仓库
        //2.然后本地创建一个新项目
        //3.测试as中git.exe是否测试通过
        //4.Vcs>>Enable ... 选择git  项目文件会变红，说明跟git关联在一起了
        //5.项目右键>>git>>add  添加文件进入版本控制
        //6.如果github上创建项目时选择了readme，则本地跟远程github上项目不一致，不能提交成功，先pull下来readme.md
        //7.对项目使用git_bash用本地命令，git pull origin master --allow-unrelated-histories
        //8.项目使用commit and push或者如果之前commint了则对项目git>>Repository>>push即可提交到远程github仓库
    }
}
