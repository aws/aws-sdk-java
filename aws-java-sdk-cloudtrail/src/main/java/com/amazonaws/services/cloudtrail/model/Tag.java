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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * A custom key-value pair associated with a resource such as a
 * CloudTrail trail.
 * </p>
 */
public class Tag implements Serializable, Cloneable {

    /**
     * The key in a key-value pair. The key must be must be no longer than
     * 128 Unicode characters. The key must be unique for the resource to
     * which it applies.
     */
    private String key;

    /**
     * The value in a key-value pair of a tag. The value must be no longer
     * than 256 Unicode characters.
     */
    private String value;

    /**
     * The key in a key-value pair. The key must be must be no longer than
     * 128 Unicode characters. The key must be unique for the resource to
     * which it applies.
     *
     * @return The key in a key-value pair. The key must be must be no longer than
     *         128 Unicode characters. The key must be unique for the resource to
     *         which it applies.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The key in a key-value pair. The key must be must be no longer than
     * 128 Unicode characters. The key must be unique for the resource to
     * which it applies.
     *
     * @param key The key in a key-value pair. The key must be must be no longer than
     *         128 Unicode characters. The key must be unique for the resource to
     *         which it applies.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The key in a key-value pair. The key must be must be no longer than
     * 128 Unicode characters. The key must be unique for the resource to
     * which it applies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key in a key-value pair. The key must be must be no longer than
     *         128 Unicode characters. The key must be unique for the resource to
     *         which it applies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The value in a key-value pair of a tag. The value must be no longer
     * than 256 Unicode characters.
     *
     * @return The value in a key-value pair of a tag. The value must be no longer
     *         than 256 Unicode characters.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value in a key-value pair of a tag. The value must be no longer
     * than 256 Unicode characters.
     *
     * @param value The value in a key-value pair of a tag. The value must be no longer
     *         than 256 Unicode characters.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value in a key-value pair of a tag. The value must be no longer
     * than 256 Unicode characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value in a key-value pair of a tag. The value must be no longer
     *         than 256 Unicode characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withValue(String value) {
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

        if (obj instanceof Tag == false) return false;
        Tag other = (Tag)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
    @Override
    public Tag clone() {
        try {
            return (Tag) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    