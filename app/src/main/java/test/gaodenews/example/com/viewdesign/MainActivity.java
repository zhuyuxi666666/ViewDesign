package test.gaodenews.example.com.viewdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        name= (TextView) findViewById(R.id.name);
        test();
    }
    private void test(){
        OkHttpClient client = new OkHttpClient();//创建OkHttpClient对象。
        FormBody.Builder formBody = new FormBody.Builder();//创建表单请求体
        formBody.add("token", "78B2CE55F31247A1A48DA838DE553CFF_201712051052218380_Android");
        Request request = new Request.Builder()//创建Request 对象。
                .url("http://221.238.128.220:10001/hcs/appUserRoute/getUserRout")
                .post(formBody.build())//传递请求体
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("error---",""+call);
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                Log.e("susscess----",""+call);
                final String res = response.body().string();
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Log.e("2132",""+res);
                        Gson gson = new Gson();
                        JsonObject obj = new JsonParser().parse(res).getAsJsonObject();
                        Users  cr = gson.fromJson(obj, Users.class);
                        name.setText(cr.getData().get(0).getRouteTime());
                    }

                });
            }
        });//回调方法的使用与get异步请求相同，此时略。
    }
}