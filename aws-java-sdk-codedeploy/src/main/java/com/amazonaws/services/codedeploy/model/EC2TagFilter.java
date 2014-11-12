/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an Amazon EC2 tag filter.
 * </p>
 */
public class EC2TagFilter implements Serializable {

    /**
     * The Amazon EC2 tag filter key.
     */
    private String key;

    /**
     * The Amazon EC2 tag filter value.
     */
    private String value;

    /**
     * The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     * value.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     */
    private String type;

    /**
     * The Amazon EC2 tag filter key.
     *
     * @return The Amazon EC2 tag filter key.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The Amazon EC2 tag filter key.
     *
     * @param key The Amazon EC2 tag filter key.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The Amazon EC2 tag filter key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The Amazon EC2 tag filter key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EC2TagFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The Amazon EC2 tag filter value.
     *
     * @return The Amazon EC2 tag filter value.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The Amazon EC2 tag filter value.
     *
     * @param value The Amazon EC2 tag filter value.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The Amazon EC2 tag filter value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The Amazon EC2 tag filter value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EC2TagFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     * value.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @return The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     *         <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     *         value.</li> </ul>
     *
     * @see EC2TagFilterType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     * value.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @param type The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     *         <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     *         value.</li> </ul>
     *
     * @see EC2TagFilterType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     * value.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @param type The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     *         <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     *         value.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EC2TagFilterType
     */
    public EC2TagFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     * value.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @param type The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     *         <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     *         value.</li> </ul>
     *
     * @see EC2TagFilterType
     */
    public void setType(EC2TagFilterType type) {
        this.type = type.toString();
    }
    
    /**
     * The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     * <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     * value.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @param type The Amazon EC2 tag filter type: <ul> <li>KEY_ONLY: Key only.</li>
     *         <li>VALUE_ONLY: Value only.</li> <li>KEY_AND_VALUE: Key and
     *         value.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EC2TagFilterType
     */
    public EC2TagFilter withType(EC2TagFilterType type) {
        this.type = type.toString();
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
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getType() != null) sb.append("Type: " + getType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EC2TagFilter == false) return false;
        EC2TagFilter other = (EC2TagFilter)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        return true;
    }
    
}
    