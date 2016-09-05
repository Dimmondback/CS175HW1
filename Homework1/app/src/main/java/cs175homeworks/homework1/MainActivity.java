package cs175homeworks.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  String[] fortuneList;
  TextView resultArea;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    fortuneList = setFortunes();
    resultArea = (TextView) findViewById(R.id.resultArea);
    Button button = (Button) findViewById(R.id.fortuneButton);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        resultArea.setText(RandomFortune());
      }
    });
  }

  private String[] setFortunes() {
    String[] newList = new String[8];
    newList[0] = getResources().getString(R.string.fortuneOne);
    newList[1] = getResources().getString(R.string.fortuneTwo);
    newList[2] = getResources().getString(R.string.fortuneThree);
    newList[3] = getResources().getString(R.string.fortuneFour);
    newList[4] = getResources().getString(R.string.fortuneFive);
    newList[5] = getResources().getString(R.string.fortuneSix);
    newList[6] = getResources().getString(R.string.fortuneSeven);
    newList[7] = getResources().getString(R.string.fortuneEight);
    return newList;
  }

  private String RandomFortune() {
    return fortuneList[(int) (Math.random() * 8)];
  }
}
