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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a filter.
 * </p>
 */
public class DocumentFilter implements Serializable {

    /**
     * The name of the filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name
     */
    private String key;

    /**
     * The value of the filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String value;

    /**
     * The name of the filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name
     *
     * @return The name of the filter.
     *
     * @see DocumentFilterKey
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The name of the filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name
     *
     * @param key The name of the filter.
     *
     * @see DocumentFilterKey
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The name of the filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name
     *
     * @param key The name of the filter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DocumentFilterKey
     */
    public DocumentFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The name of the filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name
     *
     * @param key The name of the filter.
     *
     * @see DocumentFilterKey
     */
    public void setKey(DocumentFilterKey key) {
        this.key = key.toString();
    }
    
    /**
     * The name of the filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name
     *
     * @param key The name of the filter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DocumentFilterKey
     */
    public DocumentFilter withKey(DocumentFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * The value of the filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the filter.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of the filter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param value The value of the filter.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of the filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param value The value of the filter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DocumentFilter withValue(String value) {
        this.value = value;
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
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DocumentFilter == false) return false;
        DocumentFilter other = (DocumentFilter)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
}
    