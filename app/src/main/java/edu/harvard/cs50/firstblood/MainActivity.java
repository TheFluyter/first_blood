package edu.harvard.cs50.firstblood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int lifeCounter1;
    private int lifeCounter2;
    private TextView textLifePlayer1;
    private TextView textLifePlayer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLifePlayer1 = findViewById(R.id.textViewPlayer1);
        textLifePlayer2 = findViewById(R.id.textViewPlayer2);
        lifeCounter1 = 20;
        lifeCounter2 = 20;
    }

    public int plusLife(int life, TextView textView) {
        life++;
        textView.setText(Integer.toString(life));
        return life;
    }

    public int minLife(int life, TextView textView) {
        life--;
        textView.setText(Integer.toString(life));
        return life;
    }

    public void restartLife(View view) {
        textLifePlayer1.setText("20");
        textLifePlayer2.setText("20");
        lifeCounter1 = 20;
        lifeCounter2 = 20;
    }

    public void plusLifePlayer1(View view) {
        lifeCounter1 = plusLife(lifeCounter1, textLifePlayer1);
    }

    public void minLifePlayer1(View view) {
        lifeCounter1 = minLife(lifeCounter1, textLifePlayer1);
    }

    public void plusLifePlayer2(View view) {
        lifeCounter2 = plusLife(lifeCounter2, textLifePlayer2);
    }

    public void minLifePlayer2(View view) {
        lifeCounter2 = minLife(lifeCounter2, textLifePlayer2);
    }
}
