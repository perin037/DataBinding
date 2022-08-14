package rs.ac.ni.pmf.databinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import rs.ac.ni.pmf.databinding.databinding.UserDetailsFragmentBinding;

public class UserDetailsFragment extends Fragment {
    private UserDetailsFragmentBinding _binding;

    private User _selectedUser = UsersRepository.INSTANCE.getUser(0);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        _binding = DataBindingUtil.inflate(inflater, R.layout.user_details_fragment, container, false);
        _binding.setUser(_selectedUser);
        return _binding.getRoot();
    }
}
