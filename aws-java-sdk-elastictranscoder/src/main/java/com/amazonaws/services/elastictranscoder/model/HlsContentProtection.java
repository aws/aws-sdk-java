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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The HLS content protection settings, if any, that you want Elastic Transcoder to apply to your output files.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsContentProtection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content protection method for your output. The only valid value is: <code>aes-128</code>.
     * </p>
     * <p>
     * This value is written into the method attribute of the <code>EXT-X-KEY</code> metadata tag in the output
     * playlist.
     * </p>
     */
    private String method;
    /**
     * <p>
     * If you want Elastic Transcoder to generate a key for you, leave this field blank.
     * </p>
     * <p>
     * If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be base64-encoded,
     * and it must be one of the following bit lengths before being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * If Elastic Transcoder is generating your key for you, you must leave this field blank.
     * </p>
     * <p>
     * The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that you want
     * Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be
     * base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
     * </p>
     */
    private String keyMd5;
    /**
     * <p>
     * If Elastic Transcoder is generating your key for you, you must leave this field blank.
     * </p>
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you want
     * Elastic Transcoder to use to encrypt your output files. The initialization vector must be base64-encoded, and it
     * must be exactly 16 bytes before being base64-encoded.
     * </p>
     */
    private String initializationVector;
    /**
     * <p>
     * The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path, and is
     * referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
     * </p>
     */
    private String licenseAcquisitionUrl;
    /**
     * <p>
     * Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you choose
     * <code>WithVariantPlaylists</code>, <code>LicenseAcquisitionUrl</code> must be left blank and Elastic Transcoder
     * writes your data key into the same bucket as the associated playlist.
     * </p>
     */
    private String keyStoragePolicy;

    /**
     * <p>
     * The content protection method for your output. The only valid value is: <code>aes-128</code>.
     * </p>
     * <p>
     * This value is written into the method attribute of the <code>EXT-X-KEY</code> metadata tag in the output
     * playlist.
     * </p>
     * 
     * @param method
     *        The content protection method for your output. The only valid value is: <code>aes-128</code>.</p>
     *        <p>
     *        This value is written into the method attribute of the <code>EXT-X-KEY</code> metadata tag in the output
     *        playlist.
     */

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The content protection method for your output. The only valid value is: <code>aes-128</code>.
     * </p>
     * <p>
     * This value is written into the method attribute of the <code>EXT-X-KEY</code> metadata tag in the output
     * playlist.
     * </p>
     * 
     * @return The content protection method for your output. The only valid value is: <code>aes-128</code>.</p>
     *         <p>
     *         This value is written into the method attribute of the <code>EXT-X-KEY</code> metadata tag in the output
     *         playlist.
     */

    public String getMethod() {
        return this.method;
    }

    /**
     * <p>
     * The content protection method for your output. The only valid value is: <code>aes-128</code>.
     * </p>
     * <p>
     * This value is written into the method attribute of the <code>EXT-X-KEY</code> metadata tag in the output
     * playlist.
     * </p>
     * 
     * @param method
     *        The content protection method for your output. The only valid value is: <code>aes-128</code>.</p>
     *        <p>
     *        This value is written into the method attribute of the <code>EXT-X-KEY</code> metadata tag in the output
     *        playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsContentProtection withMethod(String method) {
        setMethod(method);
        return this;
    }

    /**
     * <p>
     * If you want Elastic Transcoder to generate a key for you, leave this field blank.
     * </p>
     * <p>
     * If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be base64-encoded,
     * and it must be one of the following bit lengths before being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * 
     * @param key
     *        If you want Elastic Transcoder to generate a key for you, leave this field blank.</p>
     *        <p>
     *        If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be
     *        base64-encoded, and it must be one of the following bit lengths before being base64-encoded:
     *        </p>
     *        <p>
     *        <code>128</code>, <code>192</code>, or <code>256</code>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * If you want Elastic Transcoder to generate a key for you, leave this field blank.
     * </p>
     * <p>
     * If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be base64-encoded,
     * and it must be one of the following bit lengths before being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * 
     * @return If you want Elastic Transcoder to generate a key for you, leave this field blank.</p>
     *         <p>
     *         If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be
     *         base64-encoded, and it must be one of the following bit lengths before being base64-encoded:
     *         </p>
     *         <p>
     *         <code>128</code>, <code>192</code>, or <code>256</code>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * If you want Elastic Transcoder to generate a key for you, leave this field blank.
     * </p>
     * <p>
     * If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be base64-encoded,
     * and it must be one of the following bit lengths before being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * 
     * @param key
     *        If you want Elastic Transcoder to generate a key for you, leave this field blank.</p>
     *        <p>
     *        If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be
     *        base64-encoded, and it must be one of the following bit lengths before being base64-encoded:
     *        </p>
     *        <p>
     *        <code>128</code>, <code>192</code>, or <code>256</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsContentProtection withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * If Elastic Transcoder is generating your key for you, you must leave this field blank.
     * </p>
     * <p>
     * The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that you want
     * Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be
     * base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
     * </p>
     * 
     * @param keyMd5
     *        If Elastic Transcoder is generating your key for you, you must leave this field blank.</p>
     *        <p>
     *        The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that
     *        you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The
     *        key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
     */

    public void setKeyMd5(String keyMd5) {
        this.keyMd5 = keyMd5;
    }

    /**
     * <p>
     * If Elastic Transcoder is generating your key for you, you must leave this field blank.
     * </p>
     * <p>
     * The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that you want
     * Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be
     * base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
     * </p>
     * 
     * @return If Elastic Transcoder is generating your key for you, you must leave this field blank.</p>
     *         <p>
     *         The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that
     *         you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The
     *         key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
     */

    public String getKeyMd5() {
        return this.keyMd5;
    }

    /**
     * <p>
     * If Elastic Transcoder is generating your key for you, you must leave this field blank.
     * </p>
     * <p>
     * The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that you want
     * Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be
     * base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
     * </p>
     * 
     * @param keyMd5
     *        If Elastic Transcoder is generating your key for you, you must leave this field blank.</p>
     *        <p>
     *        The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that
     *        you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The
     *        key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsContentProtection withKeyMd5(String keyMd5) {
        setKeyMd5(keyMd5);
        return this;
    }

    /**
     * <p>
     * If Elastic Transcoder is generating your key for you, you must leave this field blank.
     * </p>
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you want
     * Elastic Transcoder to use to encrypt your output files. The initialization vector must be base64-encoded, and it
     * must be exactly 16 bytes before being base64-encoded.
     * </p>
     * 
     * @param initializationVector
     *        If Elastic Transcoder is generating your key for you, you must leave this field blank.</p>
     *        <p>
     *        The series of random bits created by a random bit generator, unique for every encryption operation, that
     *        you want Elastic Transcoder to use to encrypt your output files. The initialization vector must be
     *        base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
     */

    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    /**
     * <p>
     * If Elastic Transcoder is generating your key for you, you must leave this field blank.
     * </p>
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you want
     * Elastic Transcoder to use to encrypt your output files. The initialization vector must be base64-encoded, and it
     * must be exactly 16 bytes before being base64-encoded.
     * </p>
     * 
     * @return If Elastic Transcoder is generating your key for you, you must leave this field blank.</p>
     *         <p>
     *         The series of random bits created by a random bit generator, unique for every encryption operation, that
     *         you want Elastic Transcoder to use to encrypt your output files. The initialization vector must be
     *         base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
     */

    public String getInitializationVector() {
        return this.initializationVector;
    }

    /**
     * <p>
     * If Elastic Transcoder is generating your key for you, you must leave this field blank.
     * </p>
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you want
     * Elastic Transcoder to use to encrypt your output files. The initialization vector must be base64-encoded, and it
     * must be exactly 16 bytes before being base64-encoded.
     * </p>
     * 
     * @param initializationVector
     *        If Elastic Transcoder is generating your key for you, you must leave this field blank.</p>
     *        <p>
     *        The series of random bits created by a random bit generator, unique for every encryption operation, that
     *        you want Elastic Transcoder to use to encrypt your output files. The initialization vector must be
     *        base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsContentProtection withInitializationVector(String initializationVector) {
        setInitializationVector(initializationVector);
        return this;
    }

    /**
     * <p>
     * The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path, and is
     * referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
     * </p>
     * 
     * @param licenseAcquisitionUrl
     *        The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path,
     *        and is referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
     */

    public void setLicenseAcquisitionUrl(String licenseAcquisitionUrl) {
        this.licenseAcquisitionUrl = licenseAcquisitionUrl;
    }

    /**
     * <p>
     * The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path, and is
     * referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
     * </p>
     * 
     * @return The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path,
     *         and is referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
     */

    public String getLicenseAcquisitionUrl() {
        return this.licenseAcquisitionUrl;
    }

    /**
     * <p>
     * The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path, and is
     * referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
     * </p>
     * 
     * @param licenseAcquisitionUrl
     *        The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path,
     *        and is referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsContentProtection withLicenseAcquisitionUrl(String licenseAcquisitionUrl) {
        setLicenseAcquisitionUrl(licenseAcquisitionUrl);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you choose
     * <code>WithVariantPlaylists</code>, <code>LicenseAcquisitionUrl</code> must be left blank and Elastic Transcoder
     * writes your data key into the same bucket as the associated playlist.
     * </p>
     * 
     * @param keyStoragePolicy
     *        Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you
     *        choose <code>WithVariantPlaylists</code>, <code>LicenseAcquisitionUrl</code> must be left blank and
     *        Elastic Transcoder writes your data key into the same bucket as the associated playlist.
     */

    public void setKeyStoragePolicy(String keyStoragePolicy) {
        this.keyStoragePolicy = keyStoragePolicy;
    }

    /**
     * <p>
     * Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you choose
     * <code>WithVariantPlaylists</code>, <code>LicenseAcquisitionUrl</code> must be left blank and Elastic Transcoder
     * writes your data key into the same bucket as the associated playlist.
     * </p>
     * 
     * @return Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you
     *         choose <code>WithVariantPlaylists</code>, <code>LicenseAcquisitionUrl</code> must be left blank and
     *         Elastic Transcoder writes your data key into the same bucket as the associated playlist.
     */

    public String getKeyStoragePolicy() {
        return this.keyStoragePolicy;
    }

    /**
     * <p>
     * Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you choose
     * <code>WithVariantPlaylists</code>, <code>LicenseAcquisitionUrl</code> must be left blank and Elastic Transcoder
     * writes your data key into the same bucket as the associated playlist.
     * </p>
     * 
     * @param keyStoragePolicy
     *        Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you
     *        choose <code>WithVariantPlaylists</code>, <code>LicenseAcquisitionUrl</code> must be left blank and
     *        Elastic Transcoder writes your data key into the same bucket as the associated playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsContentProtection withKeyStoragePolicy(String keyStoragePolicy) {
        setKeyStoragePolicy(keyStoragePolicy);
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
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getKeyMd5() != null)
            sb.append("KeyMd5: ").append(getKeyMd5()).append(",");
        if (getInitializationVector() != null)
            sb.append("InitializationVector: ").append(getInitializationVector()).append(",");
        if (getLicenseAcquisitionUrl() != null)
            sb.append("LicenseAcquisitionUrl: ").append(getLicenseAcquisitionUrl()).append(",");
        if (getKeyStoragePolicy() != null)
            sb.append("KeyStoragePolicy: ").append(getKeyStoragePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsContentProtection == false)
            return false;
        HlsContentProtection other = (HlsContentProtection) obj;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getKeyMd5() == null ^ this.getKeyMd5() == null)
            return false;
        if (other.getKeyMd5() != null && other.getKeyMd5().equals(this.getKeyMd5()) == false)
            return false;
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null)
            return false;
        if (other.getInitializationVector() != null && other.getInitializationVector().equals(this.getInitializationVector()) == false)
            return false;
        if (other.getLicenseAcquisitionUrl() == null ^ this.getLicenseAcquisitionUrl() == null)
            return false;
        if (other.getLicenseAcquisitionUrl() != null && other.getLicenseAcquisitionUrl().equals(this.getLicenseAcquisitionUrl()) == false)
            return false;
        if (other.getKeyStoragePolicy() == null ^ this.getKeyStoragePolicy() == null)
            return false;
        if (other.getKeyStoragePolicy() != null && other.getKeyStoragePolicy().equals(this.getKeyStoragePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getKeyMd5() == null) ? 0 : getKeyMd5().hashCode());
        hashCode = prime * hashCode + ((getInitializationVector() == null) ? 0 : getInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getLicenseAcquisitionUrl() == null) ? 0 : getLicenseAcquisitionUrl().hashCode());
        hashCode = prime * hashCode + ((getKeyStoragePolicy() == null) ? 0 : getKeyStoragePolicy().hashCode());
        return hashCode;
    }

    @Override
    public HlsContentProtection clone() {
        try {
            return (HlsContentProtection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.HlsContentProtectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
