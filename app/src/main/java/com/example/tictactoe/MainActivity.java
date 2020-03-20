package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int xo=0;
    String winner="";
    String tag;
    int gameactive=1;
    int pos[] = {2,2,2,2,2,2,2,2,2};

    public void tap(View view)
    {

        ImageView img1 = (ImageView) view;
        tag = img1.getTag().toString();
        if(pos[Integer.parseInt(tag)]==2 && gameactive==1) {


            img1.setTranslationY(-1000);
            img1.animate().translationYBy(1000).rotation(3600).setDuration(300);


                if (xo == 0) {
                    img1.setImageResource(R.drawable.o);
                    xo = 1;
                } else {
                    img1.setImageResource(R.drawable.x);
                    xo = 0;
                }


            pos[Integer.parseInt(tag)] = xo;


            if (xo == 0)
                winner = "Player X";
            else
                winner = "Player O";


            if (pos[0] == pos[1] && pos[1] == pos[2] && pos[0] != 2 && pos[1] != 2 && pos[2] != 2) {
                Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                gameactive=0;
            }
            else if (pos[3] == pos[4] && pos[4] == pos[5] && pos[3] != 2 && pos[4] != 2 && pos[5] != 2) {

                Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                gameactive=0;
            }
            else if (pos[6] == pos[7] && pos[7] == pos[8] && pos[6] != 2 && pos[7] != 2 && pos[8] != 2) {
                Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                gameactive=0;
            }
            else if (pos[0] == pos[4] && pos[4] == pos[8] && pos[0] != 2 && pos[4] != 2 && pos[8] != 2) {
                Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                gameactive=0;
            }
            else if (pos[2] == pos[4] && pos[4] == pos[6] && pos[2] != 2 && pos[4] != 2 && pos[6] != 2) {
                Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                gameactive=0;
            }
            else if (pos[0] == pos[3] && pos[3] == pos[6] && pos[0] != 2 && pos[3] != 2 && pos[6] != 2) {
                Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                gameactive=0;
            }
            else if (pos[1] == pos[4] && pos[4] == pos[7] && pos[0] != 2 && pos[4] != 2 && pos[7] != 2) {
                Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                gameactive=0;
            }
            else if (pos[2] == pos[5] && pos[5] == pos[8] && pos[2] != 2 && pos[5] != 2 && pos[7] != 2) {
                Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                gameactive=0;
            }


        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
