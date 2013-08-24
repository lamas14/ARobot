package com.meroapps.framework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.SharedPreferences;

public interface FileIO {
	
	public InputStream readfile(String file) throws IOException;
	
	public OutputStream writefile(String file) throws IOException;
	
	public InputStream readAsset(String file) throws IOException;
	
	public SharedPreferences getSharedPref();

}
