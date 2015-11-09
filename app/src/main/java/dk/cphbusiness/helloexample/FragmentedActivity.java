package dk.cphbusiness.helloexample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class FragmentedActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmented);
        }

    }
