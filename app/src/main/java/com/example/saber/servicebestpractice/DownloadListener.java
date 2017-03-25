package com.example.saber.servicebestpractice;

/**
 * Created by saber on 2017/3/25.
 */

public interface DownloadListener {

    public void onProgress(int progress);

    public void onSuccess();

    public void onFailed();

    public void onPaused();

    public void onCanceled();

}
