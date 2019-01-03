/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about a virtual MFA device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/VirtualMFADevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualMFADevice implements Serializable, Cloneable {

    /**
     * <p>
     * The serial number associated with <code>VirtualMFADevice</code>.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The base32 seed defined as specified in <a href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     * <code>Base32StringSeed</code> is base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer base32StringSeed;
    /**
     * <p>
     * A QR code PNG image that encodes
     * <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code> where
     * <code>$virtualMFADeviceName</code> is one of the create call arguments. <code>AccountName</code> is the user name
     * if set (otherwise, the account ID otherwise), and <code>Base32String</code> is the seed in base32 format. The
     * <code>Base32String</code> value is base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer qRCodePNG;
    /**
     * <p>
     * The IAM user associated with this virtual MFA device.
     * </p>
     */
    private User user;
    /**
     * <p>
     * The date and time on which the virtual MFA device was enabled.
     * </p>
     */
    private java.util.Date enableDate;

    /**
     * <p>
     * The serial number associated with <code>VirtualMFADevice</code>.
     * </p>
     * 
     * @param serialNumber
     *        The serial number associated with <code>VirtualMFADevice</code>.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number associated with <code>VirtualMFADevice</code>.
     * </p>
     * 
     * @return The serial number associated with <code>VirtualMFADevice</code>.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The serial number associated with <code>VirtualMFADevice</code>.
     * </p>
     * 
     * @param serialNumber
     *        The serial number associated with <code>VirtualMFADevice</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMFADevice withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The base32 seed defined as specified in <a href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     * <code>Base32StringSeed</code> is base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param base32StringSeed
     *        The base32 seed defined as specified in <a href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     *        <code>Base32StringSeed</code> is base64-encoded.
     */

    public void setBase32StringSeed(java.nio.ByteBuffer base32StringSeed) {
        this.base32StringSeed = base32StringSeed;
    }

    /**
     * <p>
     * The base32 seed defined as specified in <a href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     * <code>Base32StringSeed</code> is base64-encoded.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The base32 seed defined as specified in <a href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>.
     *         The <code>Base32StringSeed</code> is base64-encoded.
     */

    public java.nio.ByteBuffer getBase32StringSeed() {
        return this.base32StringSeed;
    }

    /**
     * <p>
     * The base32 seed defined as specified in <a href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     * <code>Base32StringSeed</code> is base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param base32StringSeed
     *        The base32 seed defined as specified in <a href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     *        <code>Base32StringSeed</code> is base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMFADevice withBase32StringSeed(java.nio.ByteBuffer base32StringSeed) {
        setBase32StringSeed(base32StringSeed);
        return this;
    }

    /**
     * <p>
     * A QR code PNG image that encodes
     * <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code> where
     * <code>$virtualMFADeviceName</code> is one of the create call arguments. <code>AccountName</code> is the user name
     * if set (otherwise, the account ID otherwise), and <code>Base32String</code> is the seed in base32 format. The
     * <code>Base32String</code> value is base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param qRCodePNG
     *        A QR code PNG image that encodes
     *        <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code> where
     *        <code>$virtualMFADeviceName</code> is one of the create call arguments. <code>AccountName</code> is the
     *        user name if set (otherwise, the account ID otherwise), and <code>Base32String</code> is the seed in
     *        base32 format. The <code>Base32String</code> value is base64-encoded.
     */

    public void setQRCodePNG(java.nio.ByteBuffer qRCodePNG) {
        this.qRCodePNG = qRCodePNG;
    }

    /**
     * <p>
     * A QR code PNG image that encodes
     * <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code> where
     * <code>$virtualMFADeviceName</code> is one of the create call arguments. <code>AccountName</code> is the user name
     * if set (otherwise, the account ID otherwise), and <code>Base32String</code> is the seed in base32 format. The
     * <code>Base32String</code> value is base64-encoded.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A QR code PNG image that encodes
     *         <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code> where
     *         <code>$virtualMFADeviceName</code> is one of the create call arguments. <code>AccountName</code> is the
     *         user name if set (otherwise, the account ID otherwise), and <code>Base32String</code> is the seed in
     *         base32 format. The <code>Base32String</code> value is base64-encoded.
     */

    public java.nio.ByteBuffer getQRCodePNG() {
        return this.qRCodePNG;
    }

    /**
     * <p>
     * A QR code PNG image that encodes
     * <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code> where
     * <code>$virtualMFADeviceName</code> is one of the create call arguments. <code>AccountName</code> is the user name
     * if set (otherwise, the account ID otherwise), and <code>Base32String</code> is the seed in base32 format. The
     * <code>Base32String</code> value is base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param qRCodePNG
     *        A QR code PNG image that encodes
     *        <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code> where
     *        <code>$virtualMFADeviceName</code> is one of the create call arguments. <code>AccountName</code> is the
     *        user name if set (otherwise, the account ID otherwise), and <code>Base32String</code> is the seed in
     *        base32 format. The <code>Base32String</code> value is base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMFADevice withQRCodePNG(java.nio.ByteBuffer qRCodePNG) {
        setQRCodePNG(qRCodePNG);
        return this;
    }

    /**
     * <p>
     * The IAM user associated with this virtual MFA device.
     * </p>
     * 
     * @param user
     *        The IAM user associated with this virtual MFA device.
     */

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * <p>
     * The IAM user associated with this virtual MFA device.
     * </p>
     * 
     * @return The IAM user associated with this virtual MFA device.
     */

    public User getUser() {
        return this.user;
    }

    /**
     * <p>
     * The IAM user associated with this virtual MFA device.
     * </p>
     * 
     * @param user
     *        The IAM user associated with this virtual MFA device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMFADevice withUser(User user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The date and time on which the virtual MFA device was enabled.
     * </p>
     * 
     * @param enableDate
     *        The date and time on which the virtual MFA device was enabled.
     */

    public void setEnableDate(java.util.Date enableDate) {
        this.enableDate = enableDate;
    }

    /**
     * <p>
     * The date and time on which the virtual MFA device was enabled.
     * </p>
     * 
     * @return The date and time on which the virtual MFA device was enabled.
     */

    public java.util.Date getEnableDate() {
        return this.enableDate;
    }

    /**
     * <p>
     * The date and time on which the virtual MFA device was enabled.
     * </p>
     * 
     * @param enableDate
     *        The date and time on which the virtual MFA device was enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMFADevice withEnableDate(java.util.Date enableDate) {
        setEnableDate(enableDate);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getBase32StringSeed() != null)
            sb.append("Base32StringSeed: ").append("***Sensitive Data Redacted***").append(",");
        if (getQRCodePNG() != null)
            sb.append("QRCodePNG: ").append("***Sensitive Data Redacted***").append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getEnableDate() != null)
            sb.append("EnableDate: ").append(getEnableDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualMFADevice == false)
            return false;
        VirtualMFADevice other = (VirtualMFADevice) obj;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getBase32StringSeed() == null ^ this.getBase32StringSeed() == null)
            return false;
        if (other.getBase32StringSeed() != null && other.getBase32StringSeed().equals(this.getBase32StringSeed()) == false)
            return false;
        if (other.getQRCodePNG() == null ^ this.getQRCodePNG() == null)
            return false;
        if (other.getQRCodePNG() != null && other.getQRCodePNG().equals(this.getQRCodePNG()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getEnableDate() == null ^ this.getEnableDate() == null)
            return false;
        if (other.getEnableDate() != null && other.getEnableDate().equals(this.getEnableDate()) == false)
            return false;
        return true;
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
    public VirtualMFADevice clone() {
        try {
            return (VirtualMFADevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
