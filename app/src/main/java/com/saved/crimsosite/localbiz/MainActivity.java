package com.saved.crimsosite.localbiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView complain,general,order;
    String complainInfo = "Email : complaints@mrpuff.in \nMobile :  +91 9828245671 \n";
    String generalInfo = "Email : mrpuffme@mrpuff.in \nMobile :  +91 9823745911 \n";
    String orderInfo = "Email : orderyou@mrpuff.in \nMobile :  +91 9823983322 \n";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Complain(View view) {
        displayInfoCo(complainInfo);
    }


    public void General(View view) {
        displayInfoGe(generalInfo);

    }

    public void Orders(View view) {
        displayInfoCo(orderInfo);

    }

    public void displayInfoCo(String A){
        complain=(TextView)findViewById(R.id.Info);
        complain.setText(String.valueOf(A));
    }

    public void displayInfoGe(String A){
        general=(TextView)findViewById(R.id.Info);
        general.setText(String.valueOf(A));
    }

    public void displayInfoOr(String A){
        order=(TextView)findViewById(R.id.Info);
        order.setText(String.valueOf(A));
    }
}
