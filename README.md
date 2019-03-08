# MyUtils
封装了Android开发常用工具类

To get this project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.bfiring:MyUtils:v1.0.0'
	}

 Step 3.Init it in your Application class

    
	
	  @Override
    public void onCreate() {
        super.onCreate();
        MyUtilsConfiguration configuration=new MyUtilsConfiguration.Builder(this)
                .crashLogPath("***")
                .ideLogEnabled(BuildConfig.DEBUG)
                .fileLogEnabled(true)
                .build();
        MyUtils.init(configuration);
    }
#################################################
测试SSH22222222222222
测试3333333333333
