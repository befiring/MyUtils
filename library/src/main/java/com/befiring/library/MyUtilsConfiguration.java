package com.befiring.library;

import android.content.Context;

/**
 * Created by wyman on 2018/3/13.
 */

public class MyUtilsConfiguration {
    private Context context;

    private   String crashLogPath;

    private  boolean ideLogEnabled;

    private  boolean fileLogEnabled;

    private String fileLogPath;

    public Context getContext() {
        return context;
    }

    String getCrashLogPath() {
        return crashLogPath;
    }

    boolean isIdeLogEnabled() {
        return ideLogEnabled;
    }

    boolean isFileLogEnabled() {
        return fileLogEnabled;
    }

    private MyUtilsConfiguration() {
    }


    public static class Builder {
        private Context context;

        private  String CRASH_LOG_PATH;

        private  boolean IDE_LOG_ENABLED;

        private  boolean FILE_LOG_ENABLED;

        private String FILE_LOG_PATH;

        public Builder(Context context) {
            this.context=context;
        }

        public Builder crashLogPath(String path){
            this.CRASH_LOG_PATH = path;
            return this;
        }

        public Builder ideLogEnabled(boolean enabled){
            this.IDE_LOG_ENABLED = enabled;
            return this;
        }

        public Builder fileLogEnabled(boolean enabled){
            this.FILE_LOG_ENABLED = enabled;
            return this;
        }

        public Builder fileLogPath(String path){
            this.FILE_LOG_PATH = path;
            this.FILE_LOG_ENABLED = true;
            return this;
        }

        private void applyConfig(MyUtilsConfiguration configuration){
            configuration.crashLogPath = CRASH_LOG_PATH;
            configuration.ideLogEnabled = IDE_LOG_ENABLED;
            configuration.fileLogEnabled = FILE_LOG_ENABLED;
            configuration.fileLogPath = FILE_LOG_PATH;
            configuration.context = context;
        }

        public MyUtilsConfiguration build(){
            MyUtilsConfiguration configuration=new MyUtilsConfiguration();
            applyConfig(configuration);
            return configuration;
        }

    }
}
