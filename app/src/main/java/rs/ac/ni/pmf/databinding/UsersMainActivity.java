package rs.ac.ni.pmf.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class UsersMainActivity extends AppCompatActivity implements UsersListFragment.UserSelectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_main);
    }

    @Override
    public void onUserSelected(User user) {
        //Toast.makeText(getApplicationContext(), "Selected user: " + user.toString(), Toast.LENGTH_SHORT).show();
        if(findViewById(R.id.portrait_fragment_container) != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.portrait_fragment_container, UserDetailsFragment.class, null)
                    .addToBackStack(null)
                    .commit();
        }
    }
}