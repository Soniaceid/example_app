package com.mapping;
import android.app.Activity;

public class WhereActivity extends Activity {

    // App preference values
    public static final String APP_PREFERENCES = "GamePrefs";
    public static final String APP_PREFERENCES_NICKNAME = "Nickname"; // String
    public static final String APP_PREFERENCES_EMAIL = "Email"; // String
    public static final String APP_PREFERENCES_PASSWORD = "Password"; // String
    public static final String APP_PREFERENCES_DOB = "DOB"; // Long
    public static final String APP_PREFERENCES_GENDER = "Gender";  // Integer, in array order: Male (1), Female (2), and Undisclosed (0)
   
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final String DEBUG_TAG = "Where am I! Activity Log";
}