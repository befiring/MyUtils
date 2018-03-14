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
	
Usage:
 1.In your Application File:
         MyUtilsConfiguration configuration=new MyUtilsConfiguration.Builder(this)
                .crashLogPath("***")
                .ideLogEnabled(BuildConfig.DEBUG)
                .fileLogEnabled(true)
                .build();
        MyUtils.init(configuration);
