
package com.utility.mycollection;
import java.util.HashMap;
import com.example.mycollection.LoginScreenActivity;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
public class SessionManager {
	
//declaration of the variables.
	SharedPreferences sharedpreferences;
	Editor editor;
	SharedPreferences pref;
	Context _context;
	
 @SuppressLint("CommitPrefEdits") public void Sessionmanager(Context context){	 
///initialization.
	    this._context = context;
///instantiation of the class.
	    sharedpreferences = _context.getSharedPreferences(Constants.KEY_EMAIL,0);
	    editor = sharedpreferences.edit();
	    
 }    
 // This function simply stores name, email, password in shared preferences.
public void createLoginSession(String name, String email, String password, String phonenumber){
	
	editor.putString("constants.KEY_EMAIL",email);// Storing email in pref	
	editor.putString("constants.KEY_PASSWORD",password);// Storing name in pref
    editor.putString("constants.KEY_FIRST",name);
    editor.putString("constants.KEY_PHONE",phonenumber);
    
    // commit changes
    editor.commit();
}
///creating login session
public void CreateLoginSession(String email, String password){
sharedpreferences.getString(Constants.KEY_EMAIL,email);
sharedpreferences.getString(Constants.KEY_PASSWORD,password);
}
///Get stored session data
public HashMap<String, String> getUserDetails(){
   HashMap<String, String> user = new HashMap<String, String>();
   
 user.put(Constants.KEY_FIRST, null);//user first name.
 user.put(Constants.KEY_PHONE, null);
 user.put(Constants.KEY_EMAIL, null);//user email
 user.put(Constants.KEY_PASSWORD, null);//user password.
 
                // return user
                 return user;
}
public void checkLogin(){
// Checking the login status
// user is not logged in.
        Intent i = new Intent(_context, LoginScreenActivity.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
         
        // Add new Flag to start new Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
         
        // Staring Login Activity
        _context.startActivity(i);
    }

///Clear session details.
public void logoutUser(){
   // Clearing all data from Shared Preferences
   editor.clear();
   editor.commit();
    
   // After logout redirect user to LoingScreen Activity
   Intent i = new Intent(_context, LoginScreenActivity.class);
   // Closing all the Activities
   i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    
   // Add new Flag to start new Activity
   i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    
   // Staring Login Activity
   _context.startActivity(i);
}
	
}

