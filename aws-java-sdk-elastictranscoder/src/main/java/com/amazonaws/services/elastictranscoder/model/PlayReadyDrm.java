/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * The PlayReady DRM settings, if any, that you want Elastic Transcoder
 * to apply to the output files associated with this playlist.
 * </p>
 * <p>
 * PlayReady DRM encrypts your media files using <code>AES-CTR</code>
 * encryption.
 * </p>
 * <p>
 * If you use DRM for an <code>HLSv3</code> playlist, your outputs must
 * have a master playlist.
 * </p>
 */
public class PlayReadyDrm implements Serializable, Cloneable {

    /**
     * The type of DRM, if any, that you want Elastic Transcoder to apply to
     * the output files associated with this playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^microsoft$)|(^discretix-3.0$)<br/>
     */
    private String format;

    /**
     * The DRM key for your file, provided by your DRM license provider. The
     * key must be base64-encoded, and it must be one of the following bit
     * lengths before being base64-encoded: <p><code>128</code>,
     * <code>192</code>, or <code>256</code>. <p>The key must also be
     * encrypted by using AWS KMS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)<br/>
     */
    private String key;

    /**
     * The MD5 digest of the key used for DRM on your file, and that you want
     * Elastic Transcoder to use as a checksum to make sure your key was not
     * corrupted in transit. The key MD5 must be base64-encoded, and it must
     * be exactly 16 bytes before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)<br/>
     */
    private String keyMd5;

    /**
     * The ID for your DRM key, so that your DRM license provider knows which
     * key to provide. <p>The key ID must be provided in big endian, and
     * Elastic Transcoder will convert it to little endian before inserting
     * it into the PlayReady DRM headers. If you are unsure whether your
     * license server provides your key ID in big or little endian, check
     * with your DRM provider.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$)|(^[0-9A-Fa-f]{32}$)<br/>
     */
    private String keyId;

    /**
     * The series of random bits created by a random bit generator, unique
     * for every encryption operation, that you want Elastic Transcoder to
     * use to encrypt your files. The initialization vector must be
     * base64-encoded, and it must be exactly 8 bytes long before being
     * base64-encoded. If no initialization vector is provided, Elastic
     * Transcoder generates one for you.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String initializationVector;

    /**
     * The location of the license key required to play DRM content. The URL
     * must be an absolute path, and is referenced by the PlayReady header.
     * The PlayReady header is referenced in the protection header of the
     * client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM
     * and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example
     * URL looks like this:
     * <programlisting>https://www.example.com/exampleKey/</programlisting>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String licenseAcquisitionUrl;

    /**
     * The type of DRM, if any, that you want Elastic Transcoder to apply to
     * the output files associated with this playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^microsoft$)|(^discretix-3.0$)<br/>
     *
     * @return The type of DRM, if any, that you want Elastic Transcoder to apply to
     *         the output files associated with this playlist.
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The type of DRM, if any, that you want Elastic Transcoder to apply to
     * the output files associated with this playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^microsoft$)|(^discretix-3.0$)<br/>
     *
     * @param format The type of DRM, if any, that you want Elastic Transcoder to apply to
     *         the output files associated with this playlist.
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The type of DRM, if any, that you want Elastic Transcoder to apply to
     * the output files associated with this playlist.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^microsoft$)|(^discretix-3.0$)<br/>
     *
     * @param format The type of DRM, if any, that you want Elastic Transcoder to apply to
     *         the output files associated with this playlist.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PlayReadyDrm withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The DRM key for your file, provided by your DRM license provider. The
     * key must be base64-encoded, and it must be one of the following bit
     * lengths before being base64-encoded: <p><code>128</code>,
     * <code>192</code>, or <code>256</code>. <p>The key must also be
     * encrypted by using AWS KMS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)<br/>
     *
     * @return The DRM key for your file, provided by your DRM license provider. The
     *         key must be base64-encoded, and it must be one of the following bit
     *         lengths before being base64-encoded: <p><code>128</code>,
     *         <code>192</code>, or <code>256</code>. <p>The key must also be
     *         encrypted by using AWS KMS.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The DRM key for your file, provided by your DRM license provider. The
     * key must be base64-encoded, and it must be one of the following bit
     * lengths before being base64-encoded: <p><code>128</code>,
     * <code>192</code>, or <code>256</code>. <p>The key must also be
     * encrypted by using AWS KMS.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)<br/>
     *
     * @param key The DRM key for your file, provided by your DRM license provider. The
     *         key must be base64-encoded, and it must be one of the following bit
     *         lengths before being base64-encoded: <p><code>128</code>,
     *         <code>192</code>, or <code>256</code>. <p>The key must also be
     *         encrypted by using AWS KMS.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The DRM key for your file, provided by your DRM license provider. The
     * key must be base64-encoded, and it must be one of the following bit
     * lengths before being base64-encoded: <p><code>128</code>,
     * <code>192</code>, or <code>256</code>. <p>The key must also be
     * encrypted by using AWS KMS.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)<br/>
     *
     * @param key The DRM key for your file, provided by your DRM license provider. The
     *         key must be base64-encoded, and it must be one of the following bit
     *         lengths before being base64-encoded: <p><code>128</code>,
     *         <code>192</code>, or <code>256</code>. <p>The key must also be
     *         encrypted by using AWS KMS.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PlayReadyDrm withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The MD5 digest of the key used for DRM on your file, and that you want
     * Elastic Transcoder to use as a checksum to make sure your key was not
     * corrupted in transit. The key MD5 must be base64-encoded, and it must
     * be exactly 16 bytes before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)<br/>
     *
     * @return The MD5 digest of the key used for DRM on your file, and that you want
     *         Elastic Transcoder to use as a checksum to make sure your key was not
     *         corrupted in transit. The key MD5 must be base64-encoded, and it must
     *         be exactly 16 bytes before being base64-encoded.
     */
    public String getKeyMd5() {
        return keyMd5;
    }
    
    /**
     * The MD5 digest of the key used for DRM on your file, and that you want
     * Elastic Transcoder to use as a checksum to make sure your key was not
     * corrupted in transit. The key MD5 must be base64-encoded, and it must
     * be exactly 16 bytes before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)<br/>
     *
     * @param keyMd5 The MD5 digest of the key used for DRM on your file, and that you want
     *         Elastic Transcoder to use as a checksum to make sure your key was not
     *         corrupted in transit. The key MD5 must be base64-encoded, and it must
     *         be exactly 16 bytes before being base64-encoded.
     */
    public void setKeyMd5(String keyMd5) {
        this.keyMd5 = keyMd5;
    }
    
    /**
     * The MD5 digest of the key used for DRM on your file, and that you want
     * Elastic Transcoder to use as a checksum to make sure your key was not
     * corrupted in transit. The key MD5 must be base64-encoded, and it must
     * be exactly 16 bytes before being base64-encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$)<br/>
     *
     * @param keyMd5 The MD5 digest of the key used for DRM on your file, and that you want
     *         Elastic Transcoder to use as a checksum to make sure your key was not
     *         corrupted in transit. The key MD5 must be base64-encoded, and it must
     *         be exactly 16 bytes before being base64-encoded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PlayReadyDrm withKeyMd5(String keyMd5) {
        this.keyMd5 = keyMd5;
        return this;
    }

    /**
     * The ID for your DRM key, so that your DRM license provider knows which
     * key to provide. <p>The key ID must be provided in big endian, and
     * Elastic Transcoder will convert it to little endian before inserting
     * it into the PlayReady DRM headers. If you are unsure whether your
     * license server provides your key ID in big or little endian, check
     * with your DRM provider.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$)|(^[0-9A-Fa-f]{32}$)<br/>
     *
     * @return The ID for your DRM key, so that your DRM license provider knows which
     *         key to provide. <p>The key ID must be provided in big endian, and
     *         Elastic Transcoder will convert it to little endian before inserting
     *         it into the PlayReady DRM headers. If you are unsure whether your
     *         license server provides your key ID in big or little endian, check
     *         with your DRM provider.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * The ID for your DRM key, so that your DRM license provider knows which
     * key to provide. <p>The key ID must be provided in big endian, and
     * Elastic Transcoder will convert it to little endian before inserting
     * it into the PlayReady DRM headers. If you are unsure whether your
     * license server provides your key ID in big or little endian, check
     * with your DRM provider.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$)|(^[0-9A-Fa-f]{32}$)<br/>
     *
     * @param keyId The ID for your DRM key, so that your DRM license provider knows which
     *         key to provide. <p>The key ID must be provided in big endian, and
     *         Elastic Transcoder will convert it to little endian before inserting
     *         it into the PlayReady DRM headers. If you are unsure whether your
     *         license server provides your key ID in big or little endian, check
     *         with your DRM provider.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * The ID for your DRM key, so that your DRM license provider knows which
     * key to provide. <p>The key ID must be provided in big endian, and
     * Elastic Transcoder will convert it to little endian before inserting
     * it into the PlayReady DRM headers. If you are unsure whether your
     * license server provides your key ID in big or little endian, check
     * with your DRM provider.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$)|(^[0-9A-Fa-f]{32}$)<br/>
     *
     * @param keyId The ID for your DRM key, so that your DRM license provider knows which
     *         key to provide. <p>The key ID must be provided in big endian, and
     *         Elastic Transcoder will convert it to little endian before inserting
     *         it into the PlayReady DRM headers. If you are unsure whether your
     *         license server provides your key ID in big or little endian, check
     *         with your DRM provider.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PlayReadyDrm withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * The series of random bits created by a random bit generator, unique
     * for every encryption operation, that you want Elastic Transcoder to
     * use to encrypt your files. The initialization vector must be
     * base64-encoded, and it must be exactly 8 bytes long before being
     * base64-encoded. If no initialization vector is provided, Elastic
     * Transcoder generates one for you.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The series of random bits created by a random bit generator, unique
     *         for every encryption operation, that you want Elastic Transcoder to
     *         use to encrypt your files. The initialization vector must be
     *         base64-encoded, and it must be exactly 8 bytes long before being
     *         base64-encoded. If no initialization vector is provided, Elastic
     *         Transcoder generates one for you.
     */
    public String getInitializationVector() {
        return initializationVector;
    }
    
    /**
     * The series of random bits created by a random bit generator, unique
     * for every encryption operation, that you want Elastic Transcoder to
     * use to encrypt your files. The initialization vector must be
     * base64-encoded, and it must be exactly 8 bytes long before being
     * base64-encoded. If no initialization vector is provided, Elastic
     * Transcoder generates one for you.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param initializationVector The series of random bits created by a random bit generator, unique
     *         for every encryption operation, that you want Elastic Transcoder to
     *         use to encrypt your files. The initialization vector must be
     *         base64-encoded, and it must be exactly 8 bytes long before being
     *         base64-encoded. If no initialization vector is provided, Elastic
     *         Transcoder generates one for you.
     */
    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }
    
    /**
     * The series of random bits created by a random bit generator, unique
     * for every encryption operation, that you want Elastic Transcoder to
     * use to encrypt your files. The initialization vector must be
     * base64-encoded, and it must be exactly 8 bytes long before being
     * base64-encoded. If no initialization vector is provided, Elastic
     * Transcoder generates one for you.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param initializationVector The series of random bits created by a random bit generator, unique
     *         for every encryption operation, that you want Elastic Transcoder to
     *         use to encrypt your files. The initialization vector must be
     *         base64-encoded, and it must be exactly 8 bytes long before being
     *         base64-encoded. If no initialization vector is provided, Elastic
     *         Transcoder generates one for you.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PlayReadyDrm withInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
        return this;
    }

    /**
     * The location of the license key required to play DRM content. The URL
     * must be an absolute path, and is referenced by the PlayReady header.
     * The PlayReady header is referenced in the protection header of the
     * client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM
     * and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example
     * URL looks like this:
     * <programlisting>https://www.example.com/exampleKey/</programlisting>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The location of the license key required to play DRM content. The URL
     *         must be an absolute path, and is referenced by the PlayReady header.
     *         The PlayReady header is referenced in the protection header of the
     *         client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM
     *         and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example
     *         URL looks like this:
     *         <programlisting>https://www.example.com/exampleKey/</programlisting>
     */
    public String getLicenseAcquisitionUrl() {
        return licenseAcquisitionUrl;
    }
    
    /**
     * The location of the license key required to play DRM content. The URL
     * must be an absolute path, and is referenced by the PlayReady header.
     * The PlayReady header is referenced in the protection header of the
     * client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM
     * and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example
     * URL looks like this:
     * <programlisting>https://www.example.com/exampleKey/</programlisting>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param licenseAcquisitionUrl The location of the license key required to play DRM content. The URL
     *         must be an absolute path, and is referenced by the PlayReady header.
     *         The PlayReady header is referenced in the protection header of the
     *         client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM
     *         and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example
     *         URL looks like this:
     *         <programlisting>https://www.example.com/exampleKey/</programlisting>
     */
    public void setLicenseAcquisitionUrl(String licenseAcquisitionUrl) {
        this.licenseAcquisitionUrl = licenseAcquisitionUrl;
    }
    
    /**
     * The location of the license key required to play DRM content. The URL
     * must be an absolute path, and is referenced by the PlayReady header.
     * The PlayReady header is referenced in the protection header of the
     * client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM
     * and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example
     * URL looks like this:
     * <programlisting>https://www.example.com/exampleKey/</programlisting>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param licenseAcquisitionUrl The location of the license key required to play DRM content. The URL
     *         must be an absolute path, and is referenced by the PlayReady header.
     *         The PlayReady header is referenced in the protection header of the
     *         client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM
     *         and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example
     *         URL looks like this:
     *         <programlisting>https://www.example.com/exampleKey/</programlisting>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PlayReadyDrm withLicenseAcquisitionUrl(String licenseAcquisitionUrl) {
        this.licenseAcquisitionUrl = licenseAcquisitionUrl;
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
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getKeyMd5() != null) sb.append("KeyMd5: " + getKeyMd5() + ",");
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() + ",");
        if (getInitializationVector() != null) sb.append("InitializationVector: " + getInitializationVector() + ",");
        if (getLicenseAcquisitionUrl() != null) sb.append("LicenseAcquisitionUrl: " + getLicenseAcquisitionUrl() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PlayReadyDrm == false) return false;
        PlayReadyDrm other = (PlayReadyDrm)obj;
        
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getKeyMd5() == null ^ this.getKeyMd5() == null) return false;
        if (other.getKeyMd5() != null && other.getKeyMd5().equals(this.getKeyMd5()) == false) return false; 
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null) return false;
        if (other.getInitializationVector() != null && other.getInitializationVector().equals(this.getInitializationVector()) == false) return false; 
        if (other.getLicenseAcquisitionUrl() == null ^ this.getLicenseAcquisitionUrl() == null) return false;
        if (other.getLicenseAcquisitionUrl() != null && other.getLicenseAcquisitionUrl().equals(this.getLicenseAcquisitionUrl()) == false) return false; 
        return true;
    }
    
    @Override
    public PlayReadyDrm clone() {
        try {
            return (PlayReadyDrm) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    