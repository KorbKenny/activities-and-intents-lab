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
        mResults.setText(Html.fromHtml("The two were running through the jungle as fast as they could, away from the <b>" +theWords[4] +
                "</b> that were quickly catching up to them. Suddenly, they tripped over a large <b>" + theWords[0] +
                "</b> on the path, and they tumbled off an extremely high and extremely <b>" + theWords[2] + "</b> cliff. The two really hoped" +
                "that they didn't land on a <b>" + theWords[1] + "</b> or anything like that. \"This is pretty <b>" + theWords[3] +
        "</b>, wouldn'tcha say?\" Jeffery said to Janet. Both got bored while falling and started to play <b>" + theWords[5]
        + "</b> on the way down. They got through two full games before safely landing on a large stack of pillows, where they got through one more game."));



        mBackButton = (Button) findViewById(R.id.back_button);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
