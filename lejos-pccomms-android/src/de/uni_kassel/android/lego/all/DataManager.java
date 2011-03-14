package de.uni_kassel.android.lego.all;

import java.util.Vector;

import android.bluetooth.BluetoothDevice;

public class DataManager {
	public static final int REQUEST_CHOICE_DEVICE = 200;
	public static final int REQUEST_SETTINGS = 300;
	public static final int REQUEST_CONNECT_DEVICE = 1;
	public static final int REQUEST_ENABLE_BT = 2;
	public static final int REQUEST_ENABLE_SCAN = 3;
	public static final int SCANTIME=10;
	public static final String LOG_TAG = "lejos_android";
	
	private static DataManager instance;
	
	private Vector<BluetoothDevice> bluetoothDevices;
	
	
	public static DataManager getInstance(){
		if(instance == null){
			instance = new DataManager();
		}
		return instance;
	}
	
	private DataManager(){
		setBluetoothDevices(new Vector<BluetoothDevice>());
	}

	public void setBluetoothDevices(Vector<BluetoothDevice> bluetoothDevices) {
		this.bluetoothDevices = bluetoothDevices;
	}

	public Vector<BluetoothDevice> getBluetoothDevices() {
		return bluetoothDevices;
	}
	
}