package rs.ac.ni.pmf.databinding;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class UsersListFragment extends ListFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setListAdapter(new UsersListAdapter(getActivity(), UsersRepository.INSTANCE.getUsers()));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        final User selectedUser = UsersRepository.INSTANCE.getUser((int) id);
        Toast.makeText(getContext(), "Selected user: " + selectedUser.getUsername(), Toast.LENGTH_SHORT).show();

    }
}
