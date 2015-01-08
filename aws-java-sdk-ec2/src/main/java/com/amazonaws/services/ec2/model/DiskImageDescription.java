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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class DiskImageDescription implements Serializable {

    /**
     * The disk image format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     */
    private String format;

    /**
     * The size of the disk image.
     */
    private Long size;

    /**
     * A presigned URL for the import manifest stored in Amazon S3. For
     * information about creating a presigned URL for an Amazon S3 object,
     * read the "Query String Request Authentication Alternative" section of
     * the <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating
     * REST Requests</a> topic in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     */
    private String importManifestUrl;

    /**
     * The checksum computed for the disk image.
     */
    private String checksum;

    /**
     * The disk image format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @return The disk image format.
     *
     * @see DiskImageFormat
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The disk image format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format The disk image format.
     *
     * @see DiskImageFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The disk image format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format The disk image format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DiskImageFormat
     */
    public DiskImageDescription withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The disk image format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format The disk image format.
     *
     * @see DiskImageFormat
     */
    public void setFormat(DiskImageFormat format) {
        this.format = format.toString();
    }
    
    /**
     * The disk image format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format The disk image format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DiskImageFormat
     */
    public DiskImageDescription withFormat(DiskImageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * The size of the disk image.
     *
     * @return The size of the disk image.
     */
    public Long getSize() {
        return size;
    }
    
    /**
     * The size of the disk image.
     *
     * @param size The size of the disk image.
     */
    public void setSize(Long size) {
        this.size = size;
    }
    
    /**
     * The size of the disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The size of the disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DiskImageDescription withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * A presigned URL for the import manifest stored in Amazon S3. For
     * information about creating a presigned URL for an Amazon S3 object,
     * read the "Query String Request Authentication Alternative" section of
     * the <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating
     * REST Requests</a> topic in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     *
     * @return A presigned URL for the import manifest stored in Amazon S3. For
     *         information about creating a presigned URL for an Amazon S3 object,
     *         read the "Query String Request Authentication Alternative" section of
     *         the <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating
     *         REST Requests</a> topic in the <i>Amazon Simple Storage Service
     *         Developer Guide</i>.
     */
    public String getImportManifestUrl() {
        return importManifestUrl;
    }
    
    /**
     * A presigned URL for the import manifest stored in Amazon S3. For
     * information about creating a presigned URL for an Amazon S3 object,
     * read the "Query String Request Authentication Alternative" section of
     * the <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating
     * REST Requests</a> topic in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     *
     * @param importManifestUrl A presigned URL for the import manifest stored in Amazon S3. For
     *         information about creating a presigned URL for an Amazon S3 object,
     *         read the "Query String Request Authentication Alternative" section of
     *         the <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating
     *         REST Requests</a> topic in the <i>Amazon Simple Storage Service
     *         Developer Guide</i>.
     */
    public void setImportManifestUrl(String importManifestUrl) {
        this.importManifestUrl = importManifestUrl;
    }
    
    /**
     * A presigned URL for the import manifest stored in Amazon S3. For
     * information about creating a presigned URL for an Amazon S3 object,
     * read the "Query String Request Authentication Alternative" section of
     * the <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating
     * REST Requests</a> topic in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importManifestUrl A presigned URL for the import manifest stored in Amazon S3. For
     *         information about creating a presigned URL for an Amazon S3 object,
     *         read the "Query String Request Authentication Alternative" section of
     *         the <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">Authenticating
     *         REST Requests</a> topic in the <i>Amazon Simple Storage Service
     *         Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DiskImageDescription withImportManifestUrl(String importManifestUrl) {
        this.importManifestUrl = importManifestUrl;
        return this;
    }

    /**
     * The checksum computed for the disk image.
     *
     * @return The checksum computed for the disk image.
     */
    public String getChecksum() {
        return checksum;
    }
    
    /**
     * The checksum computed for the disk image.
     *
     * @param checksum The checksum computed for the disk image.
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
    
    /**
     * The checksum computed for the disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checksum The checksum computed for the disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DiskImageDescription withChecksum(String checksum) {
        this.checksum = checksum;
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
        if (getSize() != null) sb.append("Size: " + getSize() + ",");
        if (getImportManifestUrl() != null) sb.append("ImportManifestUrl: " + getImportManifestUrl() + ",");
        if (getChecksum() != null) sb.append("Checksum: " + getChecksum() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode()); 
        hashCode = prime * hashCode + ((getImportManifestUrl() == null) ? 0 : getImportManifestUrl().hashCode()); 
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DiskImageDescription == false) return false;
        DiskImageDescription other = (DiskImageDescription)obj;
        
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getSize() == null ^ this.getSize() == null) return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false) return false; 
        if (other.getImportManifestUrl() == null ^ this.getImportManifestUrl() == null) return false;
        if (other.getImportManifestUrl() != null && other.getImportManifestUrl().equals(this.getImportManifestUrl()) == false) return false; 
        if (other.getChecksum() == null ^ this.getChecksum() == null) return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false) return false; 
        return true;
    }
    
}
    