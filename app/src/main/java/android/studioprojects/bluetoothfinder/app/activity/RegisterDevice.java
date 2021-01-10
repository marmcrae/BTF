package android.studioprojects.bluetoothfinder.app.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.studioprojects.bluetoothfinder.R;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Set;

public class RegisterDevice extends AppCompatActivity implements BluetoothProfile.ServiceListener {

    private static final int REQUEST_ENABLE_BLUETOOTH = 0;
    private static final int REQUEST_DISCOVER_BLUETOOTH = 1;

    private TextView tempLv;
    BluetoothAdapter bluetoothAdapter;
    BluetoothManager bluetoothManager;
    BluetoothProfile bluetoothProfile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_device);


        tempLv = (TextView) findViewById(R.id.tempListView);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        bluetoothManager = (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);

    }

    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    public void showPairedDevices(View view) {
        Toast.makeText(getApplicationContext(), "Bluetooth must be on in order to show devices", Toast.LENGTH_SHORT).show();

        if (bluetoothAdapter == null) {
            showToast("Please turn Bluetooth on for list of devices");
        }

        //? for loop new [] isConnected? or STATE.CONNECTED . create new array list of connected devices. 


        if (bluetoothAdapter.isEnabled()) {

            Set<BluetoothDevice> devices = bluetoothAdapter.getBondedDevices();
            for (BluetoothDevice device : devices) {


                tempLv.append("\n" + "DEVICE NAME: " + device.getName() + " , " + device);
            }

        }
    }




        @Override
        protected void onActivityResult ( int requestCode, int resultCode, @Nullable Intent data){

            switch (requestCode) {

                case REQUEST_ENABLE_BLUETOOTH:

                    if (resultCode == RESULT_OK) {
                        showToast("Bluetooth is on");

                    } else {
                        showToast("Bluetooth is off");
                    }
                    break;

            }
            super.onActivityResult(requestCode, resultCode, data);


        }


    @Override
    public void onServiceConnected ( int profile, BluetoothProfile bluetoothProfile){


    }
    @Override
    public void onServiceDisconnected ( int i){

    }
}



