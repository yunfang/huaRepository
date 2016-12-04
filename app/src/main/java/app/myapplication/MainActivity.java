package app.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.gc();
        System.out.println("seven");
        if(0 ==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
