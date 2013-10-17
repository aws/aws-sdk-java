/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>VirtualMFADevice</code> data type contains information about a virtual MFA device.
 * </p>
 */
public class VirtualMFADevice implements Serializable {

    /**
     * The serial number associated with <code>VirtualMFADevice</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * The Base32 seed defined as specified in <a
     * href="http://www.ietf.org/rfc/rfc3548.txt"
     * target="_blank">RFC3548</a>. The <code>Base32StringSeed</code> is
     * Base64-encoded.
     */
    private java.nio.ByteBuffer base32StringSeed;

    /**
     * A QR code PNG image that encodes
     * <i>otpauth://totp/$virtualMFADeviceName@$AccountName?
     * secret=$Base32String</i> where $virtualMFADeviceName is one of the
     * create call arguments, AccountName is the user name if set (accountId
     * otherwise), and Base32String is the seed in Base32 format. The
     * <code>Base32String</code> is Base64-encoded.
     */
    private java.nio.ByteBuffer qRCodePNG;

    /**
     * The User data type contains information about a user. <p> This data
     * type is used as a response element in the following actions: <ul>
     * <li><p><a>CreateUser</a></li> <li><p><a>GetUser</a></li>
     * <li><p><a>ListUsers</a></li> </ul>
     */
    private User user;

    private java.util.Date enableDate;

    /**
     * The serial number associated with <code>VirtualMFADevice</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return The serial number associated with <code>VirtualMFADevice</code>.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * The serial number associated with <code>VirtualMFADevice</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The serial number associated with <code>VirtualMFADevice</code>.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * The serial number associated with <code>VirtualMFADevice</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The serial number associated with <code>VirtualMFADevice</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VirtualMFADevice withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * The Base32 seed defined as specified in <a
     * href="http://www.ietf.org/rfc/rfc3548.txt"
     * target="_blank">RFC3548</a>. The <code>Base32StringSeed</code> is
     * Base64-encoded.
     *
     * @return The Base32 seed defined as specified in <a
     *         href="http://www.ietf.org/rfc/rfc3548.txt"
     *         target="_blank">RFC3548</a>. The <code>Base32StringSeed</code> is
     *         Base64-encoded.
     */
    public java.nio.ByteBuffer getBase32StringSeed() {
        return base32StringSeed;
    }
    
    /**
     * The Base32 seed defined as specified in <a
     * href="http://www.ietf.org/rfc/rfc3548.txt"
     * target="_blank">RFC3548</a>. The <code>Base32StringSeed</code> is
     * Base64-encoded.
     *
     * @param base32StringSeed The Base32 seed defined as specified in <a
     *         href="http://www.ietf.org/rfc/rfc3548.txt"
     *         target="_blank">RFC3548</a>. The <code>Base32StringSeed</code> is
     *         Base64-encoded.
     */
    public void setBase32StringSeed(java.nio.ByteBuffer base32StringSeed) {
        this.base32StringSeed = base32StringSeed;
    }
    
    /**
     * The Base32 seed defined as specified in <a
     * href="http://www.ietf.org/rfc/rfc3548.txt"
     * target="_blank">RFC3548</a>. The <code>Base32StringSeed</code> is
     * Base64-encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param base32StringSeed The Base32 seed defined as specified in <a
     *         href="http://www.ietf.org/rfc/rfc3548.txt"
     *         target="_blank">RFC3548</a>. The <code>Base32StringSeed</code> is
     *         Base64-encoded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VirtualMFADevice withBase32StringSeed(java.nio.ByteBuffer base32StringSeed) {
        this.base32StringSeed = base32StringSeed;
        return this;
    }

    /**
     * A QR code PNG image that encodes
     * <i>otpauth://totp/$virtualMFADeviceName@$AccountName?
     * secret=$Base32String</i> where $virtualMFADeviceName is one of the
     * create call arguments, AccountName is the user name if set (accountId
     * otherwise), and Base32String is the seed in Base32 format. The
     * <code>Base32String</code> is Base64-encoded.
     *
     * @return A QR code PNG image that encodes
     *         <i>otpauth://totp/$virtualMFADeviceName@$AccountName?
     *         secret=$Base32String</i> where $virtualMFADeviceName is one of the
     *         create call arguments, AccountName is the user name if set (accountId
     *         otherwise), and Base32String is the seed in Base32 format. The
     *         <code>Base32String</code> is Base64-encoded.
     */
    public java.nio.ByteBuffer getQRCodePNG() {
        return qRCodePNG;
    }
    
    /**
     * A QR code PNG image that encodes
     * <i>otpauth://totp/$virtualMFADeviceName@$AccountName?
     * secret=$Base32String</i> where $virtualMFADeviceName is one of the
     * create call arguments, AccountName is the user name if set (accountId
     * otherwise), and Base32String is the seed in Base32 format. The
     * <code>Base32String</code> is Base64-encoded.
     *
     * @param qRCodePNG A QR code PNG image that encodes
     *         <i>otpauth://totp/$virtualMFADeviceName@$AccountName?
     *         secret=$Base32String</i> where $virtualMFADeviceName is one of the
     *         create call arguments, AccountName is the user name if set (accountId
     *         otherwise), and Base32String is the seed in Base32 format. The
     *         <code>Base32String</code> is Base64-encoded.
     */
    public void setQRCodePNG(java.nio.ByteBuffer qRCodePNG) {
        this.qRCodePNG = qRCodePNG;
    }
    
    /**
     * A QR code PNG image that encodes
     * <i>otpauth://totp/$virtualMFADeviceName@$AccountName?
     * secret=$Base32String</i> where $virtualMFADeviceName is one of the
     * create call arguments, AccountName is the user name if set (accountId
     * otherwise), and Base32String is the seed in Base32 format. The
     * <code>Base32String</code> is Base64-encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param qRCodePNG A QR code PNG image that encodes
     *         <i>otpauth://totp/$virtualMFADeviceName@$AccountName?
     *         secret=$Base32String</i> where $virtualMFADeviceName is one of the
     *         create call arguments, AccountName is the user name if set (accountId
     *         otherwise), and Base32String is the seed in Base32 format. The
     *         <code>Base32String</code> is Base64-encoded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VirtualMFADevice withQRCodePNG(java.nio.ByteBuffer qRCodePNG) {
        this.qRCodePNG = qRCodePNG;
        return this;
    }

    /**
     * The User data type contains information about a user. <p> This data
     * type is used as a response element in the following actions: <ul>
     * <li><p><a>CreateUser</a></li> <li><p><a>GetUser</a></li>
     * <li><p><a>ListUsers</a></li> </ul>
     *
     * @return The User data type contains information about a user. <p> This data
     *         type is used as a response element in the following actions: <ul>
     *         <li><p><a>CreateUser</a></li> <li><p><a>GetUser</a></li>
     *         <li><p><a>ListUsers</a></li> </ul>
     */
    public User getUser() {
        return user;
    }
    
    /**
     * The User data type contains information about a user. <p> This data
     * type is used as a response element in the following actions: <ul>
     * <li><p><a>CreateUser</a></li> <li><p><a>GetUser</a></li>
     * <li><p><a>ListUsers</a></li> </ul>
     *
     * @param user The User data type contains information about a user. <p> This data
     *         type is used as a response element in the following actions: <ul>
     *         <li><p><a>CreateUser</a></li> <li><p><a>GetUser</a></li>
     *         <li><p><a>ListUsers</a></li> </ul>
     */
    public void setUser(User user) {
        this.user = user;
    }
    
    /**
     * The User data type contains information about a user. <p> This data
     * type is used as a response element in the following actions: <ul>
     * <li><p><a>CreateUser</a></li> <li><p><a>GetUser</a></li>
     * <li><p><a>ListUsers</a></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param user The User data type contains information about a user. <p> This data
     *         type is used as a response element in the following actions: <ul>
     *         <li><p><a>CreateUser</a></li> <li><p><a>GetUser</a></li>
     *         <li><p><a>ListUsers</a></li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VirtualMFADevice withUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * Returns the value of the EnableDate property for this object.
     *
     * @return The value of the EnableDate property for this object.
     */
    public java.util.Date getEnableDate() {
        return enableDate;
    }
    
    /**
     * Sets the value of the EnableDate property for this object.
     *
     * @param enableDate The new value for the EnableDate property for this object.
     */
    public void setEnableDate(java.util.Date enableDate) {
        this.enableDate = enableDate;
    }
    
    /**
     * Sets the value of the EnableDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableDate The new value for the EnableDate property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VirtualMFADevice withEnableDate(java.util.Date enableDate) {
        this.enableDate = enableDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSerialNumber() != null) sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getBase32StringSeed() != null) sb.append("Base32StringSeed: " + getBase32StringSeed() + ",");
        if (getQRCodePNG() != null) sb.append("QRCodePNG: " + getQRCodePNG() + ",");
        if (getUser() != null) sb.append("User: " + getUser() + ",");
        if (getEnableDate() != null) sb.append("EnableDate: " + getEnableDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode()); 
        hashCode = prime * hashCode + ((getBase32StringSeed() == null) ? 0 : getBase32StringSeed().hashCode()); 
        hashCode = prime * hashCode + ((getQRCodePNG() == null) ? 0 : getQRCodePNG().hashCode()); 
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode()); 
        hashCode = prime * hashCode + ((getEnableDate() == null) ? 0 : getEnableDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VirtualMFADevice == false) return false;
        VirtualMFADevice other = (VirtualMFADevice)obj;
        
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null) return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false) return false; 
        if (other.getBase32StringSeed() == null ^ this.getBase32StringSeed() == null) return false;
        if (other.getBase32StringSeed() != null && other.getBase32StringSeed().equals(this.getBase32StringSeed()) == false) return false; 
        if (other.getQRCodePNG() == null ^ this.getQRCodePNG() == null) return false;
        if (other.getQRCodePNG() != null && other.getQRCodePNG().equals(this.getQRCodePNG()) == false) return false; 
        if (other.getUser() == null ^ this.getUser() == null) return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false) return false; 
        if (other.getEnableDate() == null ^ this.getEnableDate() == null) return false;
        if (other.getEnableDate() != null && other.getEnableDate().equals(this.getEnableDate()) == false) return false; 
        return true;
    }
    
}
    