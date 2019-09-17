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
 * The PlayReady DRM settings, if any, that you want Elastic Transcoder to apply to the output files associated with
 * this playlist.
 * </p>
 * <p>
 * PlayReady DRM encrypts your media files using <code>aes-ctr</code> encryption.
 * </p>
 * <p>
 * If you use DRM for an <code>HLSv3</code> playlist, your outputs must have a master playlist.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlayReadyDrm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with this
     * playlist.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it must be
     * one of the following bit lengths before being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * <p>
     * The key must also be encrypted by using AWS KMS.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a checksum to
     * make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16
     * bytes before being base64-encoded.
     * </p>
     */
    private String keyMd5;
    /**
     * <p>
     * The ID for your DRM key, so that your DRM license provider knows which key to provide.
     * </p>
     * <p>
     * The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before inserting
     * it into the PlayReady DRM headers. If you are unsure whether your license server provides your key ID in big or
     * little endian, check with your DRM provider.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you want
     * Elastic Transcoder to use to encrypt your files. The initialization vector must be base64-encoded, and it must be
     * exactly 8 bytes long before being base64-encoded. If no initialization vector is provided, Elastic Transcoder
     * generates one for you.
     * </p>
     */
    private String initializationVector;
    /**
     * <p>
     * The location of the license key required to play DRM content. The URL must be an absolute path, and is referenced
     * by the PlayReady header. The PlayReady header is referenced in the protection header of the client manifest for
     * Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An
     * example URL looks like this: <code>https://www.example.com/exampleKey/</code>
     * </p>
     */
    private String licenseAcquisitionUrl;

    /**
     * <p>
     * The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with this
     * playlist.
     * </p>
     * 
     * @param format
     *        The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with
     *        this playlist.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with this
     * playlist.
     * </p>
     * 
     * @return The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with
     *         this playlist.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with this
     * playlist.
     * </p>
     * 
     * @param format
     *        The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with
     *        this playlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayReadyDrm withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it must be
     * one of the following bit lengths before being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * <p>
     * The key must also be encrypted by using AWS KMS.
     * </p>
     * 
     * @param key
     *        The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it
     *        must be one of the following bit lengths before being base64-encoded:</p>
     *        <p>
     *        <code>128</code>, <code>192</code>, or <code>256</code>.
     *        </p>
     *        <p>
     *        The key must also be encrypted by using AWS KMS.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it must be
     * one of the following bit lengths before being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * <p>
     * The key must also be encrypted by using AWS KMS.
     * </p>
     * 
     * @return The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it
     *         must be one of the following bit lengths before being base64-encoded:</p>
     *         <p>
     *         <code>128</code>, <code>192</code>, or <code>256</code>.
     *         </p>
     *         <p>
     *         The key must also be encrypted by using AWS KMS.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it must be
     * one of the following bit lengths before being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * <p>
     * The key must also be encrypted by using AWS KMS.
     * </p>
     * 
     * @param key
     *        The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it
     *        must be one of the following bit lengths before being base64-encoded:</p>
     *        <p>
     *        <code>128</code>, <code>192</code>, or <code>256</code>.
     *        </p>
     *        <p>
     *        The key must also be encrypted by using AWS KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayReadyDrm withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a checksum to
     * make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16
     * bytes before being base64-encoded.
     * </p>
     * 
     * @param keyMd5
     *        The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a
     *        checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it
     *        must be exactly 16 bytes before being base64-encoded.
     */

    public void setKeyMd5(String keyMd5) {
        this.keyMd5 = keyMd5;
    }

    /**
     * <p>
     * The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a checksum to
     * make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16
     * bytes before being base64-encoded.
     * </p>
     * 
     * @return The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a
     *         checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it
     *         must be exactly 16 bytes before being base64-encoded.
     */

    public String getKeyMd5() {
        return this.keyMd5;
    }

    /**
     * <p>
     * The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a checksum to
     * make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16
     * bytes before being base64-encoded.
     * </p>
     * 
     * @param keyMd5
     *        The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a
     *        checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it
     *        must be exactly 16 bytes before being base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayReadyDrm withKeyMd5(String keyMd5) {
        setKeyMd5(keyMd5);
        return this;
    }

    /**
     * <p>
     * The ID for your DRM key, so that your DRM license provider knows which key to provide.
     * </p>
     * <p>
     * The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before inserting
     * it into the PlayReady DRM headers. If you are unsure whether your license server provides your key ID in big or
     * little endian, check with your DRM provider.
     * </p>
     * 
     * @param keyId
     *        The ID for your DRM key, so that your DRM license provider knows which key to provide.</p>
     *        <p>
     *        The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before
     *        inserting it into the PlayReady DRM headers. If you are unsure whether your license server provides your
     *        key ID in big or little endian, check with your DRM provider.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The ID for your DRM key, so that your DRM license provider knows which key to provide.
     * </p>
     * <p>
     * The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before inserting
     * it into the PlayReady DRM headers. If you are unsure whether your license server provides your key ID in big or
     * little endian, check with your DRM provider.
     * </p>
     * 
     * @return The ID for your DRM key, so that your DRM license provider knows which key to provide.</p>
     *         <p>
     *         The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before
     *         inserting it into the PlayReady DRM headers. If you are unsure whether your license server provides your
     *         key ID in big or little endian, check with your DRM provider.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The ID for your DRM key, so that your DRM license provider knows which key to provide.
     * </p>
     * <p>
     * The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before inserting
     * it into the PlayReady DRM headers. If you are unsure whether your license server provides your key ID in big or
     * little endian, check with your DRM provider.
     * </p>
     * 
     * @param keyId
     *        The ID for your DRM key, so that your DRM license provider knows which key to provide.</p>
     *        <p>
     *        The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before
     *        inserting it into the PlayReady DRM headers. If you are unsure whether your license server provides your
     *        key ID in big or little endian, check with your DRM provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayReadyDrm withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you want
     * Elastic Transcoder to use to encrypt your files. The initialization vector must be base64-encoded, and it must be
     * exactly 8 bytes long before being base64-encoded. If no initialization vector is provided, Elastic Transcoder
     * generates one for you.
     * </p>
     * 
     * @param initializationVector
     *        The series of random bits created by a random bit generator, unique for every encryption operation, that
     *        you want Elastic Transcoder to use to encrypt your files. The initialization vector must be
     *        base64-encoded, and it must be exactly 8 bytes long before being base64-encoded. If no initialization
     *        vector is provided, Elastic Transcoder generates one for you.
     */

    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    /**
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you want
     * Elastic Transcoder to use to encrypt your files. The initialization vector must be base64-encoded, and it must be
     * exactly 8 bytes long before being base64-encoded. If no initialization vector is provided, Elastic Transcoder
     * generates one for you.
     * </p>
     * 
     * @return The series of random bits created by a random bit generator, unique for every encryption operation, that
     *         you want Elastic Transcoder to use to encrypt your files. The initialization vector must be
     *         base64-encoded, and it must be exactly 8 bytes long before being base64-encoded. If no initialization
     *         vector is provided, Elastic Transcoder generates one for you.
     */

    public String getInitializationVector() {
        return this.initializationVector;
    }

    /**
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you want
     * Elastic Transcoder to use to encrypt your files. The initialization vector must be base64-encoded, and it must be
     * exactly 8 bytes long before being base64-encoded. If no initialization vector is provided, Elastic Transcoder
     * generates one for you.
     * </p>
     * 
     * @param initializationVector
     *        The series of random bits created by a random bit generator, unique for every encryption operation, that
     *        you want Elastic Transcoder to use to encrypt your files. The initialization vector must be
     *        base64-encoded, and it must be exactly 8 bytes long before being base64-encoded. If no initialization
     *        vector is provided, Elastic Transcoder generates one for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayReadyDrm withInitializationVector(String initializationVector) {
        setInitializationVector(initializationVector);
        return this;
    }

    /**
     * <p>
     * The location of the license key required to play DRM content. The URL must be an absolute path, and is referenced
     * by the PlayReady header. The PlayReady header is referenced in the protection header of the client manifest for
     * Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An
     * example URL looks like this: <code>https://www.example.com/exampleKey/</code>
     * </p>
     * 
     * @param licenseAcquisitionUrl
     *        The location of the license key required to play DRM content. The URL must be an absolute path, and is
     *        referenced by the PlayReady header. The PlayReady header is referenced in the protection header of the
     *        client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for
     *        HLS playlist outputs. An example URL looks like this: <code>https://www.example.com/exampleKey/</code>
     */

    public void setLicenseAcquisitionUrl(String licenseAcquisitionUrl) {
        this.licenseAcquisitionUrl = licenseAcquisitionUrl;
    }

    /**
     * <p>
     * The location of the license key required to play DRM content. The URL must be an absolute path, and is referenced
     * by the PlayReady header. The PlayReady header is referenced in the protection header of the client manifest for
     * Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An
     * example URL looks like this: <code>https://www.example.com/exampleKey/</code>
     * </p>
     * 
     * @return The location of the license key required to play DRM content. The URL must be an absolute path, and is
     *         referenced by the PlayReady header. The PlayReady header is referenced in the protection header of the
     *         client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for
     *         HLS playlist outputs. An example URL looks like this: <code>https://www.example.com/exampleKey/</code>
     */

    public String getLicenseAcquisitionUrl() {
        return this.licenseAcquisitionUrl;
    }

    /**
     * <p>
     * The location of the license key required to play DRM content. The URL must be an absolute path, and is referenced
     * by the PlayReady header. The PlayReady header is referenced in the protection header of the client manifest for
     * Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An
     * example URL looks like this: <code>https://www.example.com/exampleKey/</code>
     * </p>
     * 
     * @param licenseAcquisitionUrl
     *        The location of the license key required to play DRM content. The URL must be an absolute path, and is
     *        referenced by the PlayReady header. The PlayReady header is referenced in the protection header of the
     *        client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for
     *        HLS playlist outputs. An example URL looks like this: <code>https://www.example.com/exampleKey/</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayReadyDrm withLicenseAcquisitionUrl(String licenseAcquisitionUrl) {
        setLicenseAcquisitionUrl(licenseAcquisitionUrl);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getKeyMd5() != null)
            sb.append("KeyMd5: ").append(getKeyMd5()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getInitializationVector() != null)
            sb.append("InitializationVector: ").append(getInitializationVector()).append(",");
        if (getLicenseAcquisitionUrl() != null)
            sb.append("LicenseAcquisitionUrl: ").append(getLicenseAcquisitionUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlayReadyDrm == false)
            return false;
        PlayReadyDrm other = (PlayReadyDrm) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getKeyMd5() == null ^ this.getKeyMd5() == null)
            return false;
        if (other.getKeyMd5() != null && other.getKeyMd5().equals(this.getKeyMd5()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null)
            return false;
        if (other.getInitializationVector() != null && other.getInitializationVector().equals(this.getInitializationVector()) == false)
            return false;
        if (other.getLicenseAcquisitionUrl() == null ^ this.getLicenseAcquisitionUrl() == null)
            return false;
        if (other.getLicenseAcquisitionUrl() != null && other.getLicenseAcquisitionUrl().equals(this.getLicenseAcquisitionUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getKeyMd5() == null) ? 0 : getKeyMd5().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getInitializationVector() == null) ? 0 : getInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getLicenseAcquisitionUrl() == null) ? 0 : getLicenseAcquisitionUrl().hashCode());
        return hashCode;
    }

    @Override
    public PlayReadyDrm clone() {
        try {
            return (PlayReadyDrm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.PlayReadyDrmMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
