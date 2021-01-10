package android.studioprojects.bluetoothfinder.app.home;

import android.content.Intent;
import android.os.Bundle;
import android.studioprojects.bluetoothfinder.app.activity.FindDevice;
import android.studioprojects.bluetoothfinder.app.activity.ManageDevices;
import android.studioprojects.bluetoothfinder.app.activity.RegisterDevice;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.studioprojects.bluetoothfinder.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    public Button registerButton, manageButton, findButton;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) { textView.setText(s); }
                });

        registerButton = (Button) root.findViewById(R.id.registerButton);
        manageButton = (Button) root.findViewById(R.id.manageButton);
        findButton = (Button) root.findViewById(R.id.findButton);

        registerButton.setOnClickListener(this);
        manageButton.setOnClickListener(this);
        findButton.setOnClickListener(this);

        return root;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.registerButton:
                startActivity(new Intent(getActivity(), RegisterDevice.class));
                break;

            case R.id.manageButton:
                startActivity(new Intent(getActivity(), ManageDevices.class));
                break;

            case R.id.findButton:
                startActivity(new Intent(getActivity(), FindDevice.class));
                break;

            default:
                break;

        }

    }
}