package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by james on 12/7/15.
 */
public class ResultActivity extends AppCompatActivity {
    private Button mBackButton;
    private TextView mResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent getThem = getIntent();
        String[] theWords = getThem.getStringArrayExtra("WORDS");

        mResults = (TextView) findViewById(R.id.result_textview);
        mResults.setText("Hello");


        mBackButton = (Button) findViewById(R.id.back_button);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
