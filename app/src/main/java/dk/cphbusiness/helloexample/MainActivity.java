package dk.cphbusiness.helloexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Tjuhej");
        TextView hw = (TextView)findViewById(R.id.hw);
        hw.setText("Det kan du selv være");

        Button okButton = (Button)findViewById(R.id.okButton);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Knappen er "+v.getId(), Toast.LENGTH_LONG).show();
                }
            });

    }

    public void onCallOtherClicked(View v) {
        Toast.makeText(getApplicationContext(), "Calling you", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, TheCalledActivity.class);
        intent.putExtra("Kurt", "Hansen");
        //startActivity(intent);
        startActivityForResult(intent, 4711);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        TextView hw = (TextView)findViewById(R.id.hw);
        hw.setText(data.getStringExtra("answer"));
        super.onActivityResult(requestCode, resultCode, data);
        }
}
