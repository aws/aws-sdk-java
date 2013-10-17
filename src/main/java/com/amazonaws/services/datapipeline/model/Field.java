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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * A key-value pair that describes a property of a pipeline object. The value is specified as either a string value ( <code>StringValue</code> ) or a
 * reference to another object ( <code>RefValue</code> ) but not as both.
 * </p>
 */
public class Field implements Serializable {

    /**
     * The field identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String key;

    /**
     * The field value, expressed as a String.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String stringValue;

    /**
     * The field value, expressed as the identifier of another object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String refValue;

    /**
     * The field identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The field identifier.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The field identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param key The field identifier.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The field identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param key The field identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Field withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The field value, expressed as a String.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The field value, expressed as a String.
     */
    public String getStringValue() {
        return stringValue;
    }
    
    /**
     * The field value, expressed as a String.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param stringValue The field value, expressed as a String.
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    /**
     * The field value, expressed as a String.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10240<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param stringValue The field value, expressed as a String.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Field withStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * The field value, expressed as the identifier of another object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The field value, expressed as the identifier of another object.
     */
    public String getRefValue() {
        return refValue;
    }
    
    /**
     * The field value, expressed as the identifier of another object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param refValue The field value, expressed as the identifier of another object.
     */
    public void setRefValue(String refValue) {
        this.refValue = refValue;
    }
    
    /**
     * The field value, expressed as the identifier of another object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param refValue The field value, expressed as the identifier of another object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Field withRefValue(String refValue) {
        this.refValue = refValue;
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
        if (getStringValue() != null) sb.append("StringValue: " + getStringValue() + ",");
        if (getRefValue() != null) sb.append("RefValue: " + getRefValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode()); 
        hashCode = prime * hashCode + ((getRefValue() == null) ? 0 : getRefValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Field == false) return false;
        Field other = (Field)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getStringValue() == null ^ this.getStringValue() == null) return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false) return false; 
        if (other.getRefValue() == null ^ this.getRefValue() == null) return false;
        if (other.getRefValue() != null && other.getRefValue().equals(this.getRefValue()) == false) return false; 
        return true;
    }
    
}
    