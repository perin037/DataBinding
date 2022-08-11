package rs.ac.ni.pmf.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import rs.ac.ni.pmf.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements UsersHandler{

    //private ActivityMainBinding activityMainBinding;
    private ActivityMainBinding _binding;

    private UsersRepository _userRepository = UsersRepository.INSTANCE;
    private int _currentUser = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        _binding.setUser(_userRepository.getUser(_currentUser));
        _binding.setUsers(_userRepository.getUsers());
        _binding.setHandlers(this);

        /*Button buttonChange = findViewById(R.id.button_next);
        buttonChange.setOnClickListener(view -> nextUser());*/



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

    @Override
    public void nextUser() {
        if(_currentUser < _userRepository.count() - 1){
            _currentUser++;
            _binding.setUser(_userRepository.getUser(_currentUser));
        }
    }

    @Override
    public void previousUser() {
        if(_currentUser > 0){
            _currentUser--;
            _binding.setUser(_userRepository.getUser(_currentUser));
        }
    }

    @Override
    public void toastValue(int value){
        Toast.makeText(this, "Value: " + value, Toast.LENGTH_SHORT).show();
    }
}