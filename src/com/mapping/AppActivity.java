package com.mapping;




import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;



public class AppActivity extends WhereActivity {

  //  @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
    //  startAnimating();
      Button btnNextScreen = (Button) findViewById(R.id.btnNextScreen);
    
      //Listening to button event
      btnNextScreen.setOnClickListener(new View.OnClickListener() {

          public void onClick(View arg0) {
              //Starting a new Intent
              Intent nextScreen = new Intent(getApplicationContext(), LoginActivity.class);

     


              startActivity(nextScreen);
              AppActivity.this.finish();
          }
      });
    }

    /*private void startAnimating() {
      TextView logo1 = (TextView) findViewById(R.id.TextViewTopTitle);
      Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade1);
      logo1.startAnimation(fade1);
      TextView logo2 = (TextView) findViewById(R.id.TextViewBottomTitle);
      Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fade2);
      logo2.startAnimation(fade2);
      // Transition to Main Menu when bottom title finishes animating
      fade2.setAnimationListener(new AnimationListener() {
          public void onAnimationEnd(Animation animation) {
              // The animation has ended, transition to the Main Menu screen
              startActivity(new Intent(AppActivity.this, MenuActivity.class));
              AppActivity.this.finish();
          
          }

		@Override
		public void onAnimationRepeat(Animation animation) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onAnimationStart(Animation animation) {
			// TODO Auto-generated method stub
			
		}
          });}
    
    protected void onPause() {
    	super.onPause();
    	// Stop the animation
    	TextView logo1 = (TextView) findViewById(R.id.TextViewTopTitle);
    	logo1.clearAnimation();
    	TextView logo2 = (TextView) findViewById(R.id.TextViewBottomTitle);
    	logo2.clearAnimation();
    	
    	}

   // @Override
 //   public boolean onCreateOptionsMenu(Menu menu) {
   //     getMenuInflater().inflate(R.menu.main, menu);
     //   return true;
    //}

    protected void onResume() {
        super.onResume();

        // Start animating at the beginning so we get the full splash screen experience
        startAnimating();
    }*/

}