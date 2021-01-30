package com.example.forittestmodul3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainForCanvasXML extends AppCompatActivity implements View.OnClickListener {

    public String string;
    public int colorPaint=0;
    public int colorCanvas=0;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canvas);
        textView = findViewById(R.id.text);
        editText = findViewById(R.id.eT);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        btn26 = findViewById(R.id.btn26);
        btn27 = findViewById(R.id.btn27);
        btn28 = findViewById(R.id.btn28);
        btn29 = findViewById(R.id.btn29);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        //btn13.setOnClickListener(this);
        //btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
        //btn27.setOnClickListener(this);
        //btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);

    }

    public void getText() {
        string = String.valueOf(editText.getText());
        if (string != "") {
            textView.setText(string + "пт");
        }
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        getText();
        switch (v.getId()) {

            case R.id.btn1:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.Dark));
                btn27.setBackgroundColor(getColor(R.color.Dark));
                colorPaint += 1; //если colorPaint=1, то кисть чёрная
                break;
            case R.id.btn2:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.Grey));
                btn27.setBackgroundColor(getColor(R.color.Grey));
                colorPaint += 2; //если colorPaint=2, то кисть серая
                break;
            case R.id.btn3:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.Red));
                btn27.setBackgroundColor(getColor(R.color.Red));
                colorPaint += 3; //если colorPaint=3, то кисть красная
                break;
            case R.id.btn4:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.RedLight));
                btn27.setBackgroundColor(getColor(R.color.RedLight));
                colorPaint += 4; //если colorPaint=4, то кисть светло-красная
                break;
            case R.id.btn5:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.Orange));
                btn27.setBackgroundColor(getColor(R.color.Orange));
                colorPaint += 5; //если colorPaint=5, то кисть оранжевая
                break;
            case R.id.btn6:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.OrangeLight));
                btn27.setBackgroundColor(getColor(R.color.OrangeLight));
                colorPaint += 6; //если colorPaint=6, то кисть светло-оранжевая
                break;
            case R.id.btn7:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.GreenLight));
                btn27.setBackgroundColor(getColor(R.color.GreenLight));
                colorPaint += 7; //если colorPaint=7, то кисть светло-зелёная
                break;
            case R.id.btn8:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.Green));
                btn27.setBackgroundColor(getColor(R.color.Green));
                colorPaint += 8; //если colorPaint=8, то кисть зелёная
                break;
            case R.id.btn9:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.Bright));
                btn27.setBackgroundColor(getColor(R.color.Bright));
                colorPaint += 9; //если colorPaint=9, то кисть бирюзовая
                break;
            case R.id.btn10:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.BlueLight));
                btn27.setBackgroundColor(getColor(R.color.BlueLight));
                colorPaint += 10; //если colorPaint=10, то кисть светло-голубая
                break;
            case R.id.btn11:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.Blue));
                btn27.setBackgroundColor(getColor(R.color.Blue));
                colorPaint += 11; //если colorPaint=11, то кисть голубая
                break;
            case R.id.btn12:
                colorPaint = 0;
                btn13.setBackgroundColor(getColor(R.color.Purple));
                btn27.setBackgroundColor(getColor(R.color.Purple));
                colorPaint += 12; //если colorPaint=12, то кисть пурпурная
                break;
            case R.id.btn15:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.White));
                btn28.setBackgroundColor(getColor(R.color.White));
                colorCanvas += 1; //если colorCanvas=1, то холст белый
                break;
            case R.id.btn16:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.Dark));
                btn28.setBackgroundColor(getColor(R.color.Dark));
                colorCanvas += 2; //если colorCanvas=2, то холст чёрный
                break;
            case R.id.btn17:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.Red));
                btn28.setBackgroundColor(getColor(R.color.Red));
                colorCanvas += 3; //если colorCanvas=3, то холст красный
                break;
            case R.id.btn18:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.RedLight));
                btn28.setBackgroundColor(getColor(R.color.RedLight));
                colorCanvas += 4; //если colorCanvas=4, то холст светло-красный
                break;
            case R.id.btn19:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.Orange));
                btn28.setBackgroundColor(getColor(R.color.Orange));
                colorCanvas += 5; //если colorCanvas=5, то холст оранжевый
                break;
            case R.id.btn20:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.OrangeLight));
                btn28.setBackgroundColor(getColor(R.color.OrangeLight));
                colorCanvas += 6; //если colorCanvas=6, то холст светло-оранжевый
                break;
            case R.id.btn21:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.GreenLight));
                btn28.setBackgroundColor(getColor(R.color.GreenLight));
                colorCanvas += 7; //если colorCanvas=7, то холст светло-зелёный
                break;
            case R.id.btn22:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.Green));
                btn28.setBackgroundColor(getColor(R.color.Green));
                colorCanvas += 8; //если colorCanvas=8, то холст зелёный
                break;
            case R.id.btn23:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.Bright));
                btn28.setBackgroundColor(getColor(R.color.Bright));
                colorCanvas += 9; //если colorCanvas=9, то холст бирюзовый
                break;
            case R.id.btn24:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.BlueLight));
                btn28.setBackgroundColor(getColor(R.color.BlueLight));
                colorCanvas += 10; //если colorCanvas=10, то холст светло-голубой
                break;
            case R.id.btn25:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.Blue));
                btn28.setBackgroundColor(getColor(R.color.Blue));
                colorCanvas += 11; //если colorCanvas=11, то холст голубой
                break;
            case R.id.btn26:
                colorCanvas = 0;
                btn14.setBackgroundColor(getColor(R.color.Purple));
                btn28.setBackgroundColor(getColor(R.color.Purple));
                colorCanvas += 12; //если colorCanvas=12, то холст пурпурный
                break;
            case R.id.btn29:
                intent.putExtra("string", string);
                intent.putExtra("colorPaint", colorPaint);
                intent.putExtra("colorCanvas", colorCanvas);
                intent.setClass(MainForCanvasXML.this, MainForCanvas.class);
                startActivity(intent);
                break;

        }

    }
}