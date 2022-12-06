package com.codemotionapps.reactnativehelpscout;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

public class HelpScoutPackage implements ReactPackage {
	@Override
	public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
		return Arrays.<NativeModule>asList(new HelpScoutModule(reactContext));
	}

	@NonNull
	@Override
	public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
		return Collections.emptyList();
	}
}
