package weijiangtao.bwie.com.yuakaoa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv_color);
        Custom_View cv = (Custom_View) findViewById(R.id.cv);

        cv.getOnWhat(new Custom_View.SetOnWhat() {
            @Override
            public void onWhat(int type) {
                switch (type) {
                    case 0:
                        setText("这里是白色");
                        break;
                    case 1:
                        setText("这里是红色");
                        break;
                    case 2:
                        setText("这里是蓝色");
                        break;
                    case 3:
                        setText("这里是绿色");
                        break;
                    case 4:
                        setText("这..这里是哪里?");
                        break;
                    default:
                        break;
                }
            }
        });

    }

    private void setText(String message){
        tv.setText(message);
    }



}

