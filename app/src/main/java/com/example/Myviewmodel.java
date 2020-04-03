package com.example;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.SavedStateHandle;

public class Myviewmodel extends ViewModel {

    //private MutableLiveData<String> foo;
    private  SavedStateHandle handle;
    public Myviewmodel(SavedStateHandle handle){
        this.handle=handle;
    }
    public MutableLiveData<String> getFoo() {
        if (!handle.contains(MainActivity.SD_GT)) {
            handle.set(MainActivity.SD_GT,"STRING");

        }
        return handle.getLiveData(MainActivity.SD_GT);
    }
    public void add(){
        getFoo().setValue(getFoo().getValue()+"s");
    }
}
