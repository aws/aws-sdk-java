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
 * Disk Image Description
 */
public class DiskImageDescription implements Serializable {

    private String format;

    private Long size;

    private String importManifestUrl;

    private String checksum;

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
    public DiskImageDescription withFormat(String format) {
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
    public DiskImageDescription withFormat(DiskImageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * Returns the value of the Size property for this object.
     *
     * @return The value of the Size property for this object.
     */
    public Long getSize() {
        return size;
    }
    
    /**
     * Sets the value of the Size property for this object.
     *
     * @param size The new value for the Size property for this object.
     */
    public void setSize(Long size) {
        this.size = size;
    }
    
    /**
     * Sets the value of the Size property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param size The new value for the Size property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DiskImageDescription withSize(Long size) {
        this.size = size;
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
    public DiskImageDescription withImportManifestUrl(String importManifestUrl) {
        this.importManifestUrl = importManifestUrl;
        return this;
    }

    /**
     * Returns the value of the Checksum property for this object.
     *
     * @return The value of the Checksum property for this object.
     */
    public String getChecksum() {
        return checksum;
    }
    
    /**
     * Sets the value of the Checksum property for this object.
     *
     * @param checksum The new value for the Checksum property for this object.
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
    
    /**
     * Sets the value of the Checksum property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checksum The new value for the Checksum property for this object.
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
    