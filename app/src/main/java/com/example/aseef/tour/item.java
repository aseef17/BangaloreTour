package com.example.aseef.tour;

/**
 * {@link item} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the Header, Description and image file for that word.
 */

public class item {

    private int mPhoneId,mMapId,mLinkId;


    private boolean mHasNumber = false;

    private boolean mHasWebsite=false;

    /**
     * String resource ID for the Header Text
     */
    private int mHeaderTextId;

    /**
     * String resource ID for the Phone Number
     */
    private int mPhoneNumberId;

    /**
     * String resource ID for the Address
     */
    private int mAddressId;

    /**
     * String resource ID for the Description
     */
    private int mDescriptionTextId;

    private int mWebsiteTextId;

    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param HeaderTextId      is the string resource ID for the name of the place
     * @param DescriptionTextId is the string resource Id for the description of the place
     * @param imageResourceId   is the resource ID for the image file associated with the place
     * @param PhoneNumberId     is the string resource ID for the phonenumber of the place
     * @param AddressId         is the string resource ID for the address of the place
     */
    public item(int HeaderTextId, int PhoneNumberId, int AddressId, int WebsiteTextId , int DescriptionTextId, int imageResourceId, int phoneId, int mapId,int linkId) {
        mHeaderTextId = HeaderTextId;
        mPhoneNumberId = PhoneNumberId;
        mAddressId = AddressId;
        mDescriptionTextId = DescriptionTextId;
        mWebsiteTextId=WebsiteTextId;
        mImageResourceId = imageResourceId;
        mMapId=mapId;
        mPhoneId=phoneId;
        mLinkId=linkId;
        mHasNumber = true;
        mHasWebsite=true;
    }


    public item(int HeaderTextId, int AddressId, int DescriptionTextId, int imageResourceId, int mapId) {
        mHeaderTextId = HeaderTextId;
        mAddressId = AddressId;
        mDescriptionTextId = DescriptionTextId;
        mImageResourceId = imageResourceId;
        mMapId=mapId;
    }

    public item(int HeaderTextId,int PhoneNumberId, int AddressId, int DescriptionTextId, int imageResourceId,int phoneId,int mapId) {
        mHeaderTextId = HeaderTextId;
        mAddressId = AddressId;
        mPhoneNumberId = PhoneNumberId;
        mDescriptionTextId = DescriptionTextId;
        mImageResourceId = imageResourceId;
        mMapId=mapId;
        mPhoneId=phoneId;
        mHasNumber = true;
    }
    /**
     * Get the string resource ID for the header
     */
    public int getHeaderTextId() {
        return mHeaderTextId;
    }

    /**
     * Get the string resource ID for the phone number
     */
    public int getPhoneNumberId () {
        return mPhoneNumberId;
    }

    /**
     * Get the string resource ID for the address
     */
    public int getAddressId() {
        return mAddressId;
    }

    /**
     * Get the string resource ID for the description.
     */
    public int getDescriptionTextId() {
        return mDescriptionTextId;
    }

    /**
     * Return the image resource ID of the image.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //check for iomage view
    public boolean hasNumber(){
        return mHasNumber;
    }

    public boolean hasWebsite(){ return mHasWebsite;}

    public int getPhoneId () {
        return mPhoneId;
    }

    public int getMapId () {
        return mMapId;
    }

    public int getWebsiteTextId() {
        return mWebsiteTextId;
    }

    public int getLinkId () {
        return mLinkId;
    }



}