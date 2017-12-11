package me.electromaster.morsecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DecodeMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decode_message);

        // Get the Intent that started this activity and extract the string.
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        message = Encode(message);
        // Capture the layout's textView and set the string as its text.
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(message);
    }
    protected String Encode(final String input){
        String[] temp = input.split(" ");
        String out = "";
        for (int i = 0; i < temp.length; i++) {
            switch (temp[i]) {
                case ".-" : out += "A";
                    break;
                case "-..." : out += "B";
                    break;
                case "-.-." : out += "C";
                    break;
                case "-.." : out += "D";
                    break;
                case "." : out += "E";
                    break;
                case "..-." : out += "F";
                    break;
                case "--." : out += "G";
                    break;
                case "...." : out += "H";
                    break;
                case ".." : out += "I";
                    break;
                case ".---" : out += "J";
                    break;
                case "-.-" : out += "K";
                    break;
                case ".-.." : out += "L";
                    break;
                case "--" : out += "M";
                    break;
                case "-." : out += "N";
                    break;
                case "---" : out += "O";
                    break;
                case ".--." : out += "P";
                    break;
                case "--.-" : out += "Q";
                    break;
                case ".-." : out += "R";
                    break;
                case "..." : out += "S";
                    break;
                case "-" : out += "T";
                    break;
                case "..-" : out += "U";
                    break;
                case "...-" : out += "V";
                    break;
                case ".--" : out += "W";
                    break;
                case "-..-" : out += "X";
                    break;
                case "-.--" : out += "Y";
                    break;
                case "--.." : out += "Z";
                    break;
                case ".----" : out += "1";
                    break;
                case "..---" : out += "2";
                    break;
                case "...--" : out += "3";
                    break;
                case "....-" : out += "4";
                    break;
                case "....." : out += "5";
                    break;
                case "-...." : out += "6";
                    break;
                case "--..." : out += "7";
                    break;
                case "---.." : out += "8";
                    break;
                case "----." : out += "9";
                    break;
                case "-----" : out += "0";
                    break;
            }
        }
        return out;
    }
}