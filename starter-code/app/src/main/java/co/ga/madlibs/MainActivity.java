package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText mNoun1;
    private EditText mNoun2;
    private EditText mAdjective1;
    private EditText mAdjective2;
    private EditText mAnimal;
    private EditText mGame;
    private Button mSubmit;

    EditText[] words = new EditText[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNoun1 = (EditText) findViewById(R.id.form1);
        mNoun2 = (EditText) findViewById(R.id.form2);
        mAdjective1 = (EditText) findViewById(R.id.form3);
        mAdjective2 = (EditText) findViewById(R.id.form4);
        mAnimal = (EditText) findViewById(R.id.form5);
        mGame = (EditText) findViewById(R.id.form6);
        mSubmit = (Button) findViewById(R.id.submit);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                words[0] = mNoun1;
                words[1] = mNoun2;
                words[2] = mAdjective1;
                words[3] = mAdjective2;
                words[4] = mAnimal;
                words[5] = mGame;

                String[] wordsToTransfer = new String[6];

                for (int i = 0; i < words.length; i++) {
                    wordsToTransfer[i] = words[i].getText().toString();
                }

                Intent transferWords = new Intent(MainActivity.this, ResultActivity.class);
                transferWords.putExtra("WORDS", wordsToTransfer);
                startActivity(transferWords);
            }
        });



    }
}
