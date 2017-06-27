package viladrich.arnau.pistoler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boto1, boto2, boto3;
    TextView text;
    public static final String TAG = "MainActivity";

    private void setText(String texte){
        text.setText(texte);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boto1 = (Button) findViewById(R.id.button1); //cal dir que el que enviaras serà un botó
        boto2 = (Button) findViewById(R.id.button2);
        boto3 = (Button) findViewById(R.id.button3);
        text = (TextView) findViewById(R.id.text);

        text.setText("HOLA"); //POSEM EL BOTÓ un nom d'inici

        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("pulsem el boto 1");
            }
        });

        boto2.setOnClickListener(this);
        boto3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) { //ara està referit a nomes el 2n boto
        switch (v.getId()){
            case R.id.button1:
                Log.v(TAG, "soc el boto 1 en this");//aquesta funció no és cridada
                setText("pulsem el boto 1");
                break;
            case R.id.button2:
                Log.v(TAG, "soc el boto 2");
                setText("pulsem el boto 2");
                break;
            case R.id.button3:
                Log.v(TAG, "soc el boto 3");
                setText("pulsem el boto 3");
                break;
        }
    }

    public void mHanClicat(View v){
        Log.v(TAG, "soc el boto 4");
        setText("pulsem el boto 4");
    }
}
