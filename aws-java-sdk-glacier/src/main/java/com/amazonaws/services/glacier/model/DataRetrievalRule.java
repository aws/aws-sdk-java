/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Data retrieval policy rule.
 * </p>
 */
public class DataRetrievalRule implements Serializable, Cloneable {

    /**
     * The type of data retrieval policy to set. <p>Valid values:
     * BytesPerHour|FreeTier|None
     */
    private String strategy;

    /**
     * The maximum number of bytes that can be retrieved in an hour. <p>This
     * field is required only if the value of the Strategy field is
     * <code>BytesPerHour</code>. Your PUT operation will be rejected if the
     * Strategy field is not set to <code>BytesPerHour</code> and you set
     * this field.
     */
    private Long bytesPerHour;

    /**
     * The type of data retrieval policy to set. <p>Valid values:
     * BytesPerHour|FreeTier|None
     *
     * @return The type of data retrieval policy to set. <p>Valid values:
     *         BytesPerHour|FreeTier|None
     */
    public String getStrategy() {
        return strategy;
    }
    
    /**
     * The type of data retrieval policy to set. <p>Valid values:
     * BytesPerHour|FreeTier|None
     *
     * @param strategy The type of data retrieval policy to set. <p>Valid values:
     *         BytesPerHour|FreeTier|None
     */
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
    
    /**
     * The type of data retrieval policy to set. <p>Valid values:
     * BytesPerHour|FreeTier|None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param strategy The type of data retrieval policy to set. <p>Valid values:
     *         BytesPerHour|FreeTier|None
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DataRetrievalRule withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * The maximum number of bytes that can be retrieved in an hour. <p>This
     * field is required only if the value of the Strategy field is
     * <code>BytesPerHour</code>. Your PUT operation will be rejected if the
     * Strategy field is not set to <code>BytesPerHour</code> and you set
     * this field.
     *
     * @return The maximum number of bytes that can be retrieved in an hour. <p>This
     *         field is required only if the value of the Strategy field is
     *         <code>BytesPerHour</code>. Your PUT operation will be rejected if the
     *         Strategy field is not set to <code>BytesPerHour</code> and you set
     *         this field.
     */
    public Long getBytesPerHour() {
        return bytesPerHour;
    }
    
    /**
     * The maximum number of bytes that can be retrieved in an hour. <p>This
     * field is required only if the value of the Strategy field is
     * <code>BytesPerHour</code>. Your PUT operation will be rejected if the
     * Strategy field is not set to <code>BytesPerHour</code> and you set
     * this field.
     *
     * @param bytesPerHour The maximum number of bytes that can be retrieved in an hour. <p>This
     *         field is required only if the value of the Strategy field is
     *         <code>BytesPerHour</code>. Your PUT operation will be rejected if the
     *         Strategy field is not set to <code>BytesPerHour</code> and you set
     *         this field.
     */
    public void setBytesPerHour(Long bytesPerHour) {
        this.bytesPerHour = bytesPerHour;
    }
    
    /**
     * The maximum number of bytes that can be retrieved in an hour. <p>This
     * field is required only if the value of the Strategy field is
     * <code>BytesPerHour</code>. Your PUT operation will be rejected if the
     * Strategy field is not set to <code>BytesPerHour</code> and you set
     * this field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bytesPerHour The maximum number of bytes that can be retrieved in an hour. <p>This
     *         field is required only if the value of the Strategy field is
     *         <code>BytesPerHour</code>. Your PUT operation will be rejected if the
     *         Strategy field is not set to <code>BytesPerHour</code> and you set
     *         this field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DataRetrievalRule withBytesPerHour(Long bytesPerHour) {
        this.bytesPerHour = bytesPerHour;
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
        if (getStrategy() != null) sb.append("Strategy: " + getStrategy() + ",");
        if (getBytesPerHour() != null) sb.append("BytesPerHour: " + getBytesPerHour() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode()); 
        hashCode = prime * hashCode + ((getBytesPerHour() == null) ? 0 : getBytesPerHour().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DataRetrievalRule == false) return false;
        DataRetrievalRule other = (DataRetrievalRule)obj;
        
        if (other.getStrategy() == null ^ this.getStrategy() == null) return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false) return false; 
        if (other.getBytesPerHour() == null ^ this.getBytesPerHour() == null) return false;
        if (other.getBytesPerHour() != null && other.getBytesPerHour().equals(this.getBytesPerHour()) == false) return false; 
        return true;
    }
    
    @Override
    public DataRetrievalRule clone() {
        try {
            return (DataRetrievalRule) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    