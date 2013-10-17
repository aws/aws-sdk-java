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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;


/**
 * <p>
 * The Tag type is used by <code>CreateStack</code> in the <code>Tags</code> parameter. It allows you to specify a key/value pair that can be used to
 * store information related to cost allocation for an AWS CloudFormation stack.
 * </p>
 */
public class Tag implements Serializable {

    /**
     * <i>Required</i>. A string used to identify this tag. You can specify a
     * maximum of 128 characters for a tag key. Tags owned by Amazon Web
     * Services (AWS) have the reserved prefix: <code>aws:</code>.
     */
    private String key;

    /**
     * <i>Required</i>. A string containing the value for this tag. You can
     * specify a maximum of 256 characters for a tag value.
     */
    private String value;

    /**
     * <i>Required</i>. A string used to identify this tag. You can specify a
     * maximum of 128 characters for a tag key. Tags owned by Amazon Web
     * Services (AWS) have the reserved prefix: <code>aws:</code>.
     *
     * @return <i>Required</i>. A string used to identify this tag. You can specify a
     *         maximum of 128 characters for a tag key. Tags owned by Amazon Web
     *         Services (AWS) have the reserved prefix: <code>aws:</code>.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * <i>Required</i>. A string used to identify this tag. You can specify a
     * maximum of 128 characters for a tag key. Tags owned by Amazon Web
     * Services (AWS) have the reserved prefix: <code>aws:</code>.
     *
     * @param key <i>Required</i>. A string used to identify this tag. You can specify a
     *         maximum of 128 characters for a tag key. Tags owned by Amazon Web
     *         Services (AWS) have the reserved prefix: <code>aws:</code>.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * <i>Required</i>. A string used to identify this tag. You can specify a
     * maximum of 128 characters for a tag key. Tags owned by Amazon Web
     * Services (AWS) have the reserved prefix: <code>aws:</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key <i>Required</i>. A string used to identify this tag. You can specify a
     *         maximum of 128 characters for a tag key. Tags owned by Amazon Web
     *         Services (AWS) have the reserved prefix: <code>aws:</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <i>Required</i>. A string containing the value for this tag. You can
     * specify a maximum of 256 characters for a tag value.
     *
     * @return <i>Required</i>. A string containing the value for this tag. You can
     *         specify a maximum of 256 characters for a tag value.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * <i>Required</i>. A string containing the value for this tag. You can
     * specify a maximum of 256 characters for a tag value.
     *
     * @param value <i>Required</i>. A string containing the value for this tag. You can
     *         specify a maximum of 256 characters for a tag value.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * <i>Required</i>. A string containing the value for this tag. You can
     * specify a maximum of 256 characters for a tag value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value <i>Required</i>. A string containing the value for this tag. You can
     *         specify a maximum of 256 characters for a tag value.
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
    
}
    