package local.uri.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView left_dice;
    ImageView right_dice;

    final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
            R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.rollButton);
        left_dice = findViewById(R.id.image_leftDice);
        right_dice = findViewById(R.id.image_rightDice);

        rollButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                left_dice.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                right_dice.setImageResource(diceArray[number]);
            }

        });
    }
}
