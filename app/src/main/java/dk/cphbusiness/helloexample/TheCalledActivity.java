package dk.cphbusiness.helloexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TheCalledActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_called);
        Intent intent = getIntent();
        TextView label = (TextView)findViewById(R.id.ctext);
        label.setText(label.getText()+" "+intent.getStringExtra("Kurt"));
        }

    @Override
    public void finish() {
        Intent data = new Intent();
        EditText edit = (EditText)findViewById(R.id.etext);
        data.putExtra("answer", edit.getText().toString());
        setResult(RESULT_OK, data);
        super.finish();
        }

    }
