package android.studioprojects.bluetoothfinder.bluetooth;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothHearingAid;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;

public class bluetooth {

    BluetoothAdapter bluetoothAdapter;
    BluetoothManager bluetoothManager;
    BluetoothProfile bluetoothProfile;
    BluetoothGatt bluetoothGatt;
    BluetoothHeadset bluetoothHeadset;
    BluetoothA2dp bluetoothA2dp;
    BluetoothHearingAid bluetoothHearingAid;

    public bluetooth() {
    }

    public bluetooth(BluetoothAdapter bluetoothAdapter, BluetoothManager bluetoothManager, BluetoothProfile bluetoothProfile, BluetoothGatt bluetoothGatt, BluetoothHeadset bluetoothHeadset, BluetoothA2dp bluetoothA2dp, BluetoothHearingAid bluetoothHearingAid) {
        this.bluetoothAdapter = bluetoothAdapter;
        this.bluetoothManager = bluetoothManager;
        this.bluetoothProfile = bluetoothProfile;
        this.bluetoothGatt = bluetoothGatt;
        this.bluetoothHeadset = bluetoothHeadset;
        this.bluetoothA2dp = bluetoothA2dp;
        this.bluetoothHearingAid = bluetoothHearingAid;
    }

    public BluetoothAdapter getBluetoothAdapter() {
        return bluetoothAdapter;
    }

    public void setBluetoothAdapter(BluetoothAdapter bluetoothAdapter) {
        this.bluetoothAdapter = bluetoothAdapter;
    }

    public BluetoothManager getBluetoothManager() {
        return bluetoothManager;
    }

    public void setBluetoothManager(BluetoothManager bluetoothManager) {
        this.bluetoothManager = bluetoothManager;
    }

    public BluetoothProfile getBluetoothProfile() {
        return bluetoothProfile;
    }

    public void setBluetoothProfile(BluetoothProfile bluetoothProfile) {
        this.bluetoothProfile = bluetoothProfile;
    }

    public BluetoothGatt getBluetoothGatt() {
        return bluetoothGatt;
    }

    public void setBluetoothGatt(BluetoothGatt bluetoothGatt) {
        this.bluetoothGatt = bluetoothGatt;
    }

    public BluetoothHeadset getBluetoothHeadset() {
        return bluetoothHeadset;
    }

    public void setBluetoothHeadset(BluetoothHeadset bluetoothHeadset) {
        this.bluetoothHeadset = bluetoothHeadset;
    }

    public BluetoothA2dp getBluetoothA2dp() {
        return bluetoothA2dp;
    }

    public void setBluetoothA2dp(BluetoothA2dp bluetoothA2dp) {
        this.bluetoothA2dp = bluetoothA2dp;
    }

    public BluetoothHearingAid getBluetoothHearingAid() {
        return bluetoothHearingAid;
    }

    public void setBluetoothHearingAid(BluetoothHearingAid bluetoothHearingAid) {
        this.bluetoothHearingAid = bluetoothHearingAid;
    }
}
