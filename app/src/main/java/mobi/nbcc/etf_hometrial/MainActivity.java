package mobi.nbcc.etf_hometrial;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void garageClicked(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, GarageActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void laundryClicked(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, LaundryActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void bedroomClicked(View v)
    {
        Intent myIntent = new Intent(MainActivity.this, BedroomActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
