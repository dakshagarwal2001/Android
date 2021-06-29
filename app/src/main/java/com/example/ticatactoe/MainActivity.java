package com.example.ticatactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ImageView reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView3);
        tv.setText("O's Turn");
        reset = findViewById(R.drawable.reset2);
    }
    int active = 0;
    int[] occ = {2,2,2,2,2,2,2,2,2};
    public boolean winner(int x)
    {
        if(occ[0]!=2 && occ[0]==occ[4] && occ[0]==occ[8])
        {
            return true;
        }
        if(occ[2]!=2 && occ[2]==occ[4] && occ[2]==occ[6])
        {
            return true;
        }
        if(occ[0]!=2 && occ[0]==occ[1] && occ[2]==occ[0])
        {
            return true;
        }
        if(occ[3]!=2 && occ[3]==occ[4] && occ[3]==occ[5])
        {
            return true;
        }
        if(occ[6]!=2 && occ[6]==occ[7] && occ[8]==occ[6])
        {
            return true;
        }
        if(occ[0]!=2 && occ[0]==occ[3] && occ[0]==occ[6])
        {
            return true;
        }
        if(occ[1]!=2 && occ[1]==occ[4] && occ[1]==occ[7])
        {
            return true;
        }
        if(occ[2]!=2 && occ[2]==occ[5] && occ[2]==occ[8])
        {
            return true;
        }
        return false;
    }

    public void ticTacToe(View view) {
        ImageView img = (ImageView)(view);

        int index = Integer.parseInt(img.getTag().toString());
        if(occ[index]==2 && active == 0)
        {
            img.setImageResource(R.drawable.o);
            active = 1;
            occ[index] = 0;
            if(winner(0))
            {
                tv.setText("'O' won the game !!!");
                Arrays.fill(occ,1);
            }
            else tv.setText("X's Turn");
        }
        else if(occ[index]==2 && active == 1)
        {
            img.setImageResource(R.drawable.x);
            active = 0;
            occ[index] = 1;
            if(winner(1))
            {
                tv.setText("'X' won the game !!!");
                Arrays.fill(occ,1);
            }
            else tv.setText("O's Turn");
        }

    }

    public void reset(View view) {
        Arrays.fill(occ,2);
        tv.setText("O's Turn");
        active = 0;
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView9)).setImageResource(0);
    }
}













