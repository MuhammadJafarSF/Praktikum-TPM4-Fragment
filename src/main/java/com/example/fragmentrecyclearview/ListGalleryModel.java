package com.example.fragmentrecyclearview;

public class ListGalleryModel {
    private String MountName;
    private int mountPhoto;
    private String mountDetail;

    public String getMountName() {
        return MountName;
    }

    public void setMountName(String vegetableName) {
        MountName = vegetableName;
    }

    public int getMountPhoto() {
        return mountPhoto;
    }

    public void setMountPhoto(int mountPhoto) {
        this.mountPhoto = mountPhoto;
    }

    public String getMountDetail() {
        return mountDetail;
    }

    public void setMountDetail(String mountDetail) {
        this.mountDetail = mountDetail;
    }
}
