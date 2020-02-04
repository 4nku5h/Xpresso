# Xpresso
A library for Binding View

# Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
# Add the dependency

	dependencies {
	        implementation 'com.github.4nku5h:Xpresso:0.1.0'
	}
# Init Class
        InitViews initViews=new InitViews(getApplicationContext(),getWindow().getDecorView().getRootView());

# Init Views
        Button btn=initViews.InitButton(R.id.button);
