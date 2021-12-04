package com.mirea.kuznetsov.mireaproject.ui.browser;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Base64;

public class BrowserViewModel extends ViewModel {

    // feature, not bug
    public final String homePage = "https://rt.pornhub.com";
    private MutableLiveData<String> currentPage;


    public BrowserViewModel() {
        currentPage = new MutableLiveData<>();
        currentPage.setValue(homePage);
    }

    public LiveData<String> getCurrentPage() {
        return currentPage;
    }

}
