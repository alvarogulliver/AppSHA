package appsha.usp.com.myappsha;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCaptureData = (Button) findViewById(R.id.button);
        Button btnCreatePerson = (Button) findViewById(R.id.button2);
        Button btnSelectPerson = (Button) findViewById(R.id.button3);
        Button btnGenerateDiagnostic = (Button) findViewById(R.id.button4);

        // OnClick Event Capture Data
        btnCaptureData.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), CaptureData.class);
                startActivityForResult(myIntent, 0);
            }
        });

        // OnClick Event Create New Person
        btnCreatePerson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), CreateNewPerson.class);
                startActivityForResult(myIntent, 0);
            }
        });

        // OnClick Event Select Person
        btnSelectPerson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), SelectPerson.class);
                startActivityForResult(myIntent, 0);
            }
        });

        // OnClick Event Generate Diagnostic Report
        btnGenerateDiagnostic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent( view.getContext(), GenerateDiagnosticReport.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


}
