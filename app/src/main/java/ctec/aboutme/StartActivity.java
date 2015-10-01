package ctec.aboutme;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class StartActivity extends AppCompatActivity {

        private Button gameButton;
        private Button famButton;
        private Button meButton;
        private Button bookButton;
        private Button foodButton;
        private ImageView meImage;
        private ImageView book1Image;
        private ImageView book2Image;
        private ImageView food1Image;
        private ImageView food2Image;
        private ImageView gameImage;
        private ImageView familyImage;
        private TextView gameView;
        private TextView meView;
        private TextView familyView;
        private TextView bookView;
        private TextView foodView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        famButton = (Button) findViewById(R.id.familyButton);
        gameButton = (Button) findViewById(R.id.videoGamesButton);
        meButton = (Button) findViewById(R.id.meButton);
        foodButton = (Button) findViewById(R.id.foodButton);
        bookButton = (Button) findViewById(R.id.booksButton);
        book1Image = (ImageView) findViewById(R.id.book1Image);
        book2Image = (ImageView) findViewById(R.id.book2Image);
        food1Image = (ImageView) findViewById(R.id.food1Image);
        food2Image = (ImageView) findViewById(R.id.food2Image);
        gameImage = (ImageView) findViewById(R.id.gameImage);
        meImage = (ImageView) findViewById(R.id.meImage);
        familyImage = (ImageView) findViewById(R.id.familyImage);
        meView = (TextView) findViewById(R.id.meView);
        familyView = (TextView) findViewById(R.id.familyView);
        foodView = (TextView) findViewById(R.id.foodView);
        bookView = (TextView) findViewById(R.id.bookView);
        gameView = (TextView) findViewById(R.id.gameView);





        setupBookListeners();
        setupFamilyListeners();
        setupGameListeners();
        setupMeListeners();
        setupFoodListeners();
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

    private void changeBookVisibility()
    {
        if(book1Image.getVisibility() == View.GONE && book2Image.getVisibility() == View.GONE && bookView.getVisibility() == View.GONE)
        {
            book1Image.setVisibility(View.VISIBLE);
            book2Image.setVisibility(View.VISIBLE);
            bookView.setVisibility(View.VISIBLE);
            food2Image.setVisibility(View.GONE);
            food1Image.setVisibility(View.GONE);
            foodView.setVisibility(View.GONE);
            gameImage.setVisibility(View.GONE);
            meImage.setVisibility(View.GONE);
            gameView.setVisibility(View.GONE);
            meView.setVisibility(View.GONE);
            familyView.setVisibility(View.GONE);
            familyImage.setVisibility(View.GONE);

        }
        else
        {
            book2Image.setVisibility(View.GONE);
            book1Image.setVisibility(View.GONE);
            bookView.setVisibility(View.GONE);

        }
    }

    private void changeFamilyVisibility()
    {
        if(familyImage.getVisibility() == View.GONE && familyView.getVisibility() == View.GONE)
        {
            book1Image.setVisibility(View.GONE);
            book2Image.setVisibility(View.GONE);
            bookView.setVisibility(View.GONE);
            food2Image.setVisibility(View.GONE);
            food1Image.setVisibility(View.GONE);
            foodView.setVisibility(View.GONE);
            gameImage.setVisibility(View.GONE);
            meImage.setVisibility(View.GONE);
            gameView.setVisibility(View.GONE);
            meView.setVisibility(View.GONE);
            familyView.setVisibility(View.VISIBLE);
            familyImage.setVisibility(View.VISIBLE);
        }
        else
        {
            familyView.setVisibility(View.GONE);
            familyImage.setVisibility(View.GONE);
        }
    }

    private void changeGameVisibility()
    {
        if(gameImage.getVisibility() == View.GONE && gameView.getVisibility() == bookView.GONE)
        {
            book1Image.setVisibility(View.GONE);
            book2Image.setVisibility(View.GONE);
            bookView.setVisibility(View.GONE);
            food2Image.setVisibility(View.GONE);
            food1Image.setVisibility(View.GONE);
            foodView.setVisibility(View.GONE);
            gameImage.setVisibility(View.VISIBLE);
            meImage.setVisibility(View.GONE);
            gameView.setVisibility(View.VISIBLE);
            meView.setVisibility(View.GONE);
            familyView.setVisibility(View.GONE);
            familyImage.setVisibility(View.GONE);
        }
        else
        {
            gameView.setVisibility(View.GONE);
            gameImage.setVisibility(View.GONE);
        }
    }

    private void changeMeVisibility()
    {
        if(meImage.getVisibility() == View.GONE && meView.getVisibility() == View.GONE)
        {
            book1Image.setVisibility(View.GONE);
            book2Image.setVisibility(View.GONE);
            bookView.setVisibility(View.GONE);
            food2Image.setVisibility(View.GONE);
            food1Image.setVisibility(View.GONE);
            foodView.setVisibility(View.GONE);
            gameImage.setVisibility(View.GONE);
            meImage.setVisibility(View.VISIBLE);
            gameView.setVisibility(View.GONE);
            meView.setVisibility(View.VISIBLE);
            familyView.setVisibility(View.GONE);
            familyImage.setVisibility(View.GONE);
        }
        else
        {
            meView.setVisibility(View.GONE);
            meImage.setVisibility(View.GONE);
        }

    }

    private void changeFoodVisibility()
    {
        if(food1Image.getVisibility() == View.GONE && food2Image.getVisibility() == View.GONE && foodView.getVisibility() == View.GONE)
        {
            book1Image.setVisibility(View.GONE);
            book2Image.setVisibility(View.GONE);
            bookView.setVisibility(View.GONE);
            food2Image.setVisibility(View.VISIBLE);
            food1Image.setVisibility(View.VISIBLE);
            foodView.setVisibility(View.VISIBLE);
            gameImage.setVisibility(View.GONE);
            meImage.setVisibility(View.GONE);
            gameView.setVisibility(View.GONE);
            meView.setVisibility(View.GONE);
            familyView.setVisibility(View.GONE);
            familyImage.setVisibility(View.GONE);
        }
        else
        {
            food2Image.setVisibility(View.GONE);
            food1Image.setVisibility(View.GONE);
            foodView.setVisibility(View.GONE);
        }
    }


    private void setupBookListeners()
    {
        bookButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeBookVisibility();
            }
        });
    }

    private void setupFamilyListeners()
    {
        famButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeFamilyVisibility();
            }
        });
    }

    private void setupGameListeners()
    {
        gameButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeGameVisibility();
            }
        });
    }

    private void setupFoodListeners()
    {
        foodButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeFoodVisibility();
            }
        });
    }
    private void setupMeListeners()
    {
        meButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeMeVisibility();
            }
        });
    }




}
