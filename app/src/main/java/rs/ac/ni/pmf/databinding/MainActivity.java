package rs.ac.ni.pmf.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;

import rs.ac.ni.pmf.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final User _user = new User("Stefan", "Radovanovic", "perin", 25, true);
    private final User _user2 = new User("Marko", "Markovic", "mare", 33, false);

    //private ActivityMainBinding activityMainBinding;
    private ActivityMainBinding _binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        _binding.setUser(_user);

        Button buttonChange = findViewById(R.id.buttonChange);
        buttonChange.setOnClickListener(view -> changeUser());

        /*activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.textFirstName.setText(_user.getFirstName());
        activityMainBinding.textLastName.setText(_user.getLastName());
        activityMainBinding.textUsername.setText(_user.getUsername());
        activityMainBinding.buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.buttonChange.setText("tralala");
            }
        });*/

    }

    private void changeUser() {
        _binding.setUser(_user2);
    }
}