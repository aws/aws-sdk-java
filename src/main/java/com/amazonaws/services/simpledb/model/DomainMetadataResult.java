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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;


/**
 * Domain Metadata Result
 */
public class DomainMetadataResult implements Serializable {

    /**
     * The number of all items in the domain.
     */
    private Integer itemCount;

    /**
     * The total size of all item names in the domain, in bytes.
     */
    private Long itemNamesSizeBytes;

    /**
     * The number of unique attribute names in the domain.
     */
    private Integer attributeNameCount;

    /**
     * The total size of all unique attribute names in the domain, in bytes.
     */
    private Long attributeNamesSizeBytes;

    /**
     * The number of all attribute name/value pairs in the domain.
     */
    private Integer attributeValueCount;

    /**
     * The total size of all attribute values in the domain, in bytes.
     */
    private Long attributeValuesSizeBytes;

    /**
     * The data and time when metadata was calculated, in Epoch (UNIX)
     * seconds.
     */
    private Integer timestamp;

    /**
     * The number of all items in the domain.
     *
     * @return The number of all items in the domain.
     */
    public Integer getItemCount() {
        return itemCount;
    }
    
    /**
     * The number of all items in the domain.
     *
     * @param itemCount The number of all items in the domain.
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }
    
    /**
     * The number of all items in the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemCount The number of all items in the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainMetadataResult withItemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * The total size of all item names in the domain, in bytes.
     *
     * @return The total size of all item names in the domain, in bytes.
     */
    public Long getItemNamesSizeBytes() {
        return itemNamesSizeBytes;
    }
    
    /**
     * The total size of all item names in the domain, in bytes.
     *
     * @param itemNamesSizeBytes The total size of all item names in the domain, in bytes.
     */
    public void setItemNamesSizeBytes(Long itemNamesSizeBytes) {
        this.itemNamesSizeBytes = itemNamesSizeBytes;
    }
    
    /**
     * The total size of all item names in the domain, in bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemNamesSizeBytes The total size of all item names in the domain, in bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainMetadataResult withItemNamesSizeBytes(Long itemNamesSizeBytes) {
        this.itemNamesSizeBytes = itemNamesSizeBytes;
        return this;
    }

    /**
     * The number of unique attribute names in the domain.
     *
     * @return The number of unique attribute names in the domain.
     */
    public Integer getAttributeNameCount() {
        return attributeNameCount;
    }
    
    /**
     * The number of unique attribute names in the domain.
     *
     * @param attributeNameCount The number of unique attribute names in the domain.
     */
    public void setAttributeNameCount(Integer attributeNameCount) {
        this.attributeNameCount = attributeNameCount;
    }
    
    /**
     * The number of unique attribute names in the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNameCount The number of unique attribute names in the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainMetadataResult withAttributeNameCount(Integer attributeNameCount) {
        this.attributeNameCount = attributeNameCount;
        return this;
    }

    /**
     * The total size of all unique attribute names in the domain, in bytes.
     *
     * @return The total size of all unique attribute names in the domain, in bytes.
     */
    public Long getAttributeNamesSizeBytes() {
        return attributeNamesSizeBytes;
    }
    
    /**
     * The total size of all unique attribute names in the domain, in bytes.
     *
     * @param attributeNamesSizeBytes The total size of all unique attribute names in the domain, in bytes.
     */
    public void setAttributeNamesSizeBytes(Long attributeNamesSizeBytes) {
        this.attributeNamesSizeBytes = attributeNamesSizeBytes;
    }
    
    /**
     * The total size of all unique attribute names in the domain, in bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNamesSizeBytes The total size of all unique attribute names in the domain, in bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainMetadataResult withAttributeNamesSizeBytes(Long attributeNamesSizeBytes) {
        this.attributeNamesSizeBytes = attributeNamesSizeBytes;
        return this;
    }

    /**
     * The number of all attribute name/value pairs in the domain.
     *
     * @return The number of all attribute name/value pairs in the domain.
     */
    public Integer getAttributeValueCount() {
        return attributeValueCount;
    }
    
    /**
     * The number of all attribute name/value pairs in the domain.
     *
     * @param attributeValueCount The number of all attribute name/value pairs in the domain.
     */
    public void setAttributeValueCount(Integer attributeValueCount) {
        this.attributeValueCount = attributeValueCount;
    }
    
    /**
     * The number of all attribute name/value pairs in the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueCount The number of all attribute name/value pairs in the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainMetadataResult withAttributeValueCount(Integer attributeValueCount) {
        this.attributeValueCount = attributeValueCount;
        return this;
    }

    /**
     * The total size of all attribute values in the domain, in bytes.
     *
     * @return The total size of all attribute values in the domain, in bytes.
     */
    public Long getAttributeValuesSizeBytes() {
        return attributeValuesSizeBytes;
    }
    
    /**
     * The total size of all attribute values in the domain, in bytes.
     *
     * @param attributeValuesSizeBytes The total size of all attribute values in the domain, in bytes.
     */
    public void setAttributeValuesSizeBytes(Long attributeValuesSizeBytes) {
        this.attributeValuesSizeBytes = attributeValuesSizeBytes;
    }
    
    /**
     * The total size of all attribute values in the domain, in bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValuesSizeBytes The total size of all attribute values in the domain, in bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainMetadataResult withAttributeValuesSizeBytes(Long attributeValuesSizeBytes) {
        this.attributeValuesSizeBytes = attributeValuesSizeBytes;
        return this;
    }

    /**
     * The data and time when metadata was calculated, in Epoch (UNIX)
     * seconds.
     *
     * @return The data and time when metadata was calculated, in Epoch (UNIX)
     *         seconds.
     */
    public Integer getTimestamp() {
        return timestamp;
    }
    
    /**
     * The data and time when metadata was calculated, in Epoch (UNIX)
     * seconds.
     *
     * @param timestamp The data and time when metadata was calculated, in Epoch (UNIX)
     *         seconds.
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * The data and time when metadata was calculated, in Epoch (UNIX)
     * seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The data and time when metadata was calculated, in Epoch (UNIX)
     *         seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainMetadataResult withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
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
        if (getItemCount() != null) sb.append("ItemCount: " + getItemCount() + ",");
        if (getItemNamesSizeBytes() != null) sb.append("ItemNamesSizeBytes: " + getItemNamesSizeBytes() + ",");
        if (getAttributeNameCount() != null) sb.append("AttributeNameCount: " + getAttributeNameCount() + ",");
        if (getAttributeNamesSizeBytes() != null) sb.append("AttributeNamesSizeBytes: " + getAttributeNamesSizeBytes() + ",");
        if (getAttributeValueCount() != null) sb.append("AttributeValueCount: " + getAttributeValueCount() + ",");
        if (getAttributeValuesSizeBytes() != null) sb.append("AttributeValuesSizeBytes: " + getAttributeValuesSizeBytes() + ",");
        if (getTimestamp() != null) sb.append("Timestamp: " + getTimestamp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode()); 
        hashCode = prime * hashCode + ((getItemNamesSizeBytes() == null) ? 0 : getItemNamesSizeBytes().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeNameCount() == null) ? 0 : getAttributeNameCount().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeNamesSizeBytes() == null) ? 0 : getAttributeNamesSizeBytes().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeValueCount() == null) ? 0 : getAttributeValueCount().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeValuesSizeBytes() == null) ? 0 : getAttributeValuesSizeBytes().hashCode()); 
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DomainMetadataResult == false) return false;
        DomainMetadataResult other = (DomainMetadataResult)obj;
        
        if (other.getItemCount() == null ^ this.getItemCount() == null) return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false) return false; 
        if (other.getItemNamesSizeBytes() == null ^ this.getItemNamesSizeBytes() == null) return false;
        if (other.getItemNamesSizeBytes() != null && other.getItemNamesSizeBytes().equals(this.getItemNamesSizeBytes()) == false) return false; 
        if (other.getAttributeNameCount() == null ^ this.getAttributeNameCount() == null) return false;
        if (other.getAttributeNameCount() != null && other.getAttributeNameCount().equals(this.getAttributeNameCount()) == false) return false; 
        if (other.getAttributeNamesSizeBytes() == null ^ this.getAttributeNamesSizeBytes() == null) return false;
        if (other.getAttributeNamesSizeBytes() != null && other.getAttributeNamesSizeBytes().equals(this.getAttributeNamesSizeBytes()) == false) return false; 
        if (other.getAttributeValueCount() == null ^ this.getAttributeValueCount() == null) return false;
        if (other.getAttributeValueCount() != null && other.getAttributeValueCount().equals(this.getAttributeValueCount()) == false) return false; 
        if (other.getAttributeValuesSizeBytes() == null ^ this.getAttributeValuesSizeBytes() == null) return false;
        if (other.getAttributeValuesSizeBytes() != null && other.getAttributeValuesSizeBytes().equals(this.getAttributeValuesSizeBytes()) == false) return false; 
        if (other.getTimestamp() == null ^ this.getTimestamp() == null) return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false) return false; 
        return true;
    }
    
}
    