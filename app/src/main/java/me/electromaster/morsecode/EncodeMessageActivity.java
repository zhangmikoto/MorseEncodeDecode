package me.electromaster.morsecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EncodeMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encode_message);

        // Get the Intent that started this activity and extract the string.
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        message = Encode(message);
        // Capture the layout's textView and set the string as its text.
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(message);
    }
    protected String Encode(final String input){
        char[] str = input.toLowerCase().toCharArray();
        String str2 = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a') {
                str2+=".- ";
            }
            if(str[i] == 'b') {
                str2+="-... ";
            }
            if(str[i] == 'c') {
                str2+="-.-. ";
            }
            if(str[i] == 'd') {
                str2+="-.. ";
            }
            if(str[i] == 'e') {
                str2+=". ";
            }
            if(str[i] == 'f') {
                str2+="..-. ";
            }
            if(str[i] == 'g') {
                str2+="--. ";
            }
            if(str[i] == 'h') {
                str2+=".... ";
            }
            if(str[i] == 'i') {
                str2+=".. ";
            }
            if(str[i] == 'j') {
                str2+=".--- ";
            }

            if (str[i] == 'k') {
                str2+="-.- ";
            }
            if(str[i] == 'l') {
                str2+=".-.. ";
            }
            if(str[i] == 'm') {
                str2+="-- ";
            }
            if(str[i] == 'n') {
                str2+="-. ";
            }
            if(str[i] == 'o') {
                str2+="--- ";
            }
            if(str[i] == 'p') {
                str2+=".--. ";
            }
            if(str[i] == 'q') {
                str2+="--.- ";
            }
            if(str[i] == 'r') {
                str2+=".-. ";
            }
            if(str[i] == 's') {
                str2+="... ";
            }
            if(str[i] == 't') {
                str2+="- ";
            }
            if (str[i] == 'u') {
                str2+="..- ";
            }
            if(str[i] == 'v') {
                str2+="...- ";
            }
            if(str[i] == 'w') {
                str2+=".-- ";
            }
            if(str[i] == 'x') {
                str2+="-..- ";
            }
            if(str[i] == 'y') {
                str2+="-.-- ";
            }
            if(str[i] == 'z') {
                str2+="--.. ";
            }
            if(str[i] == '0') {
                str2+="----- ";
            }
            if(str[i] == '1') {
                str2+=".---- ";
            }
            if(str[i] == '2') {
                str2+="..--- ";
            }
            if(str[i] == '3') {
                str2+="...-- ";
            }
            if(str[i] == '4') {
                str2+="....- ";
            }
            if(str[i] == '5') {
                str2+="..... ";
            }
            if(str[i] == '6') {
                str2+="-.... ";
            }
            if(str[i] == '7') {
                str2+="--... ";
            }
            if(str[i] == '8') {
                str2+="---.. ";
            }
            if(str[i] == '9') {
                str2+="----. ";
            }
        }
        return str2;
    }
}