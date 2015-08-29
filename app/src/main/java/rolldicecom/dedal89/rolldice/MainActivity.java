package rolldicecom.dedal89.rolldice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /** Called when the user clicks the Send button */
    public void roll (View view) {

        String roll = Integer.toString(this._rollDice());

        // Create the text view
        TextView scored = (TextView) findViewById(R.id.scored);
        scored.setText(roll);

        // setContentView va chiamato solo una volta nel onCreate!
        // setContentView(scored);
    }

    private int _rollDice() {
        int maxValue = 6;
        int minValue = 1;
        return (int)(maxValue * Math.random()) + minValue;
    }
}
