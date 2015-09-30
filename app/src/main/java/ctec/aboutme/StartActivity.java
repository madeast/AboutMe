package ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

        private Button gameButton;
        private Button famButton;
        private Button hobButton;
        private Button bookButton;
        private Button foodButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        famButton = (Button) findViewById(R.id.familyButton);
        gameButton = (Button) findViewById(R.id.videoGamesButton);
        hobButton = (Button) findViewById(R.id.hobbyButton);
        foodButton = (Button) findViewById(R.id.foodButton);
        bookButton = (Button) findViewById(R.id.booksButton);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        bookButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {

            }
        });
    }


}
