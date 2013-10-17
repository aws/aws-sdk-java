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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Disk Image Detail
 */
public class DiskImageDetail implements Serializable {

    private String format;

    private Long bytes;

    private String importManifestUrl;

    /**
     * Returns the value of the Format property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @return The value of the Format property for this object.
     *
     * @see DiskImageFormat
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * Sets the value of the Format property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format The new value for the Format property for this object.
     *
     * @see DiskImageFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * Sets the value of the Format property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format The new value for the Format property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DiskImageFormat
     */
    public DiskImageDetail withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Sets the value of the Format property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format The new value for the Format property for this object.
     *
     * @see DiskImageFormat
     */
    public void setFormat(DiskImageFormat format) {
        this.format = format.toString();
    }
    
    /**
     * Sets the value of the Format property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param format The new value for the Format property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DiskImageFormat
     */
    public DiskImageDetail withFormat(DiskImageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * Returns the value of the Bytes property for this object.
     *
     * @return The value of the Bytes property for this object.
     */
    public Long getBytes() {
        return bytes;
    }
    
    /**
     * Sets the value of the Bytes property for this object.
     *
     * @param bytes The new value for the Bytes property for this object.
     */
    public void setBytes(Long bytes) {
        this.bytes = bytes;
    }
    
    /**
     * Sets the value of the Bytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bytes The new value for the Bytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DiskImageDetail withBytes(Long bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * Returns the value of the ImportManifestUrl property for this object.
     *
     * @return The value of the ImportManifestUrl property for this object.
     */
    public String getImportManifestUrl() {
        return importManifestUrl;
    }
    
    /**
     * Sets the value of the ImportManifestUrl property for this object.
     *
     * @param importManifestUrl The new value for the ImportManifestUrl property for this object.
     */
    public void setImportManifestUrl(String importManifestUrl) {
        this.importManifestUrl = importManifestUrl;
    }
    
    /**
     * Sets the value of the ImportManifestUrl property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importManifestUrl The new value for the ImportManifestUrl property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DiskImageDetail withImportManifestUrl(String importManifestUrl) {
        this.importManifestUrl = importManifestUrl;
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
        if (getBytes() != null) sb.append("Bytes: " + getBytes() + ",");
        if (getImportManifestUrl() != null) sb.append("ImportManifestUrl: " + getImportManifestUrl() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode()); 
        hashCode = prime * hashCode + ((getImportManifestUrl() == null) ? 0 : getImportManifestUrl().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DiskImageDetail == false) return false;
        DiskImageDetail other = (DiskImageDetail)obj;
        
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getBytes() == null ^ this.getBytes() == null) return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false) return false; 
        if (other.getImportManifestUrl() == null ^ this.getImportManifestUrl() == null) return false;
        if (other.getImportManifestUrl() != null && other.getImportManifestUrl().equals(this.getImportManifestUrl()) == false) return false; 
        return true;
    }
    
}
    