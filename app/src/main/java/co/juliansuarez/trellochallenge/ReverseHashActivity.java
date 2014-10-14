package co.juliansuarez.trellochallenge;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;


public class ReverseHashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_hash);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new ReverseHashFragment())
                    .commit();
        }
    }

}
