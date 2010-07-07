/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Domain Metadata Result
 */
public class DomainMetadataResult {

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
     * The data and time when metadata was calculated in Epoch (UNIX) time.
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
     * The data and time when metadata was calculated in Epoch (UNIX) time.
     *
     * @return The data and time when metadata was calculated in Epoch (UNIX) time.
     */
    public Integer getTimestamp() {
        return timestamp;
    }
    
    /**
     * The data and time when metadata was calculated in Epoch (UNIX) time.
     *
     * @param timestamp The data and time when metadata was calculated in Epoch (UNIX) time.
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }
    
    /**
     * The data and time when metadata was calculated in Epoch (UNIX) time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timestamp The data and time when metadata was calculated in Epoch (UNIX) time.
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
        sb.append("ItemCount: " + itemCount + ", ");
        sb.append("ItemNamesSizeBytes: " + itemNamesSizeBytes + ", ");
        sb.append("AttributeNameCount: " + attributeNameCount + ", ");
        sb.append("AttributeNamesSizeBytes: " + attributeNamesSizeBytes + ", ");
        sb.append("AttributeValueCount: " + attributeValueCount + ", ");
        sb.append("AttributeValuesSizeBytes: " + attributeValuesSizeBytes + ", ");
        sb.append("Timestamp: " + timestamp + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    