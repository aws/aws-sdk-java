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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;


/**
 * <p>
 * A list of the part sizes of the multipart upload.
 * </p>
 */
public class PartListElement implements Serializable {

    /**
     * The byte range of a part, inclusive of the upper value of the range.
     */
    private String rangeInBytes;

    /**
     * The SHA256 tree hash value that Amazon Glacier calculated for the
     * part. This field is never <code>null</code>.
     */
    private String sHA256TreeHash;

    /**
     * Default constructor for a new PartListElement object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PartListElement() {}
    
    /**
     * The byte range of a part, inclusive of the upper value of the range.
     *
     * @return The byte range of a part, inclusive of the upper value of the range.
     */
    public String getRangeInBytes() {
        return rangeInBytes;
    }
    
    /**
     * The byte range of a part, inclusive of the upper value of the range.
     *
     * @param rangeInBytes The byte range of a part, inclusive of the upper value of the range.
     */
    public void setRangeInBytes(String rangeInBytes) {
        this.rangeInBytes = rangeInBytes;
    }
    
    /**
     * The byte range of a part, inclusive of the upper value of the range.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rangeInBytes The byte range of a part, inclusive of the upper value of the range.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PartListElement withRangeInBytes(String rangeInBytes) {
        this.rangeInBytes = rangeInBytes;
        return this;
    }

    /**
     * The SHA256 tree hash value that Amazon Glacier calculated for the
     * part. This field is never <code>null</code>.
     *
     * @return The SHA256 tree hash value that Amazon Glacier calculated for the
     *         part. This field is never <code>null</code>.
     */
    public String getSHA256TreeHash() {
        return sHA256TreeHash;
    }
    
    /**
     * The SHA256 tree hash value that Amazon Glacier calculated for the
     * part. This field is never <code>null</code>.
     *
     * @param sHA256TreeHash The SHA256 tree hash value that Amazon Glacier calculated for the
     *         part. This field is never <code>null</code>.
     */
    public void setSHA256TreeHash(String sHA256TreeHash) {
        this.sHA256TreeHash = sHA256TreeHash;
    }
    
    /**
     * The SHA256 tree hash value that Amazon Glacier calculated for the
     * part. This field is never <code>null</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sHA256TreeHash The SHA256 tree hash value that Amazon Glacier calculated for the
     *         part. This field is never <code>null</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PartListElement withSHA256TreeHash(String sHA256TreeHash) {
        this.sHA256TreeHash = sHA256TreeHash;
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
        if (getRangeInBytes() != null) sb.append("RangeInBytes: " + getRangeInBytes() + ",");
        if (getSHA256TreeHash() != null) sb.append("SHA256TreeHash: " + getSHA256TreeHash() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRangeInBytes() == null) ? 0 : getRangeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getSHA256TreeHash() == null) ? 0 : getSHA256TreeHash().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PartListElement == false) return false;
        PartListElement other = (PartListElement)obj;
        
        if (other.getRangeInBytes() == null ^ this.getRangeInBytes() == null) return false;
        if (other.getRangeInBytes() != null && other.getRangeInBytes().equals(this.getRangeInBytes()) == false) return false; 
        if (other.getSHA256TreeHash() == null ^ this.getSHA256TreeHash() == null) return false;
        if (other.getSHA256TreeHash() != null && other.getSHA256TreeHash().equals(this.getSHA256TreeHash()) == false) return false; 
        return true;
    }
    
}
    