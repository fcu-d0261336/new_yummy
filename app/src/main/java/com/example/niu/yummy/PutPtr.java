package com.example.niu.yummy;

/**
 * Created by 路人 on 2017/6/19.
 */

public class PutPtr {
    private int ptrID;
    private String ptrUrl;


    public PutPtr(int ptrID, String ptrUrl) {
        this.ptrID = ptrID;
        this.ptrUrl = ptrUrl;
    }

    public String getPtrUrl() {
        return ptrUrl;
    }

    public void setPtrUrl(String ptrUrl) {
        this.ptrUrl = ptrUrl;
    }

    public int getPtrID() {
        return ptrID;
    }

    public void setPtrID(int ptrID) {
        this.ptrID = ptrID;
    }
}
