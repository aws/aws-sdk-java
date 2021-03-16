/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single element in a path through the JSON representation of a policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/PathElement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Refers to an index in a JSON array.
     * </p>
     */
    private Integer index;
    /**
     * <p>
     * Refers to a key in a JSON object.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Refers to a substring of a literal string in a JSON object.
     * </p>
     */
    private Substring substring;
    /**
     * <p>
     * Refers to the value associated with a given key in a JSON object.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Refers to an index in a JSON array.
     * </p>
     * 
     * @param index
     *        Refers to an index in a JSON array.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * Refers to an index in a JSON array.
     * </p>
     * 
     * @return Refers to an index in a JSON array.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * Refers to an index in a JSON array.
     * </p>
     * 
     * @param index
     *        Refers to an index in a JSON array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathElement withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * Refers to a key in a JSON object.
     * </p>
     * 
     * @param key
     *        Refers to a key in a JSON object.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Refers to a key in a JSON object.
     * </p>
     * 
     * @return Refers to a key in a JSON object.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Refers to a key in a JSON object.
     * </p>
     * 
     * @param key
     *        Refers to a key in a JSON object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathElement withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Refers to a substring of a literal string in a JSON object.
     * </p>
     * 
     * @param substring
     *        Refers to a substring of a literal string in a JSON object.
     */

    public void setSubstring(Substring substring) {
        this.substring = substring;
    }

    /**
     * <p>
     * Refers to a substring of a literal string in a JSON object.
     * </p>
     * 
     * @return Refers to a substring of a literal string in a JSON object.
     */

    public Substring getSubstring() {
        return this.substring;
    }

    /**
     * <p>
     * Refers to a substring of a literal string in a JSON object.
     * </p>
     * 
     * @param substring
     *        Refers to a substring of a literal string in a JSON object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathElement withSubstring(Substring substring) {
        setSubstring(substring);
        return this;
    }

    /**
     * <p>
     * Refers to the value associated with a given key in a JSON object.
     * </p>
     * 
     * @param value
     *        Refers to the value associated with a given key in a JSON object.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Refers to the value associated with a given key in a JSON object.
     * </p>
     * 
     * @return Refers to the value associated with a given key in a JSON object.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Refers to the value associated with a given key in a JSON object.
     * </p>
     * 
     * @param value
     *        Refers to the value associated with a given key in a JSON object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathElement withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getSubstring() != null)
            sb.append("Substring: ").append(getSubstring()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathElement == false)
            return false;
        PathElement other = (PathElement) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getSubstring() == null ^ this.getSubstring() == null)
            return false;
        if (other.getSubstring() != null && other.getSubstring().equals(this.getSubstring()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getSubstring() == null) ? 0 : getSubstring().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public PathElement clone() {
        try {
            return (PathElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.PathElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
