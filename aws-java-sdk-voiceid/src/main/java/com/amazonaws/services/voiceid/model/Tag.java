/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
 * "key2":"value2"} }.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * 'Department':'Sales', the key is 'Department'.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * 'Department':'Sales', the value is 'Sales'.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * 'Department':'Sales', the key is 'Department'.
     * </p>
     * 
     * @param key
     *        The first part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *        tag 'Department':'Sales', the key is 'Department'.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * 'Department':'Sales', the key is 'Department'.
     * </p>
     * 
     * @return The first part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *         tag 'Department':'Sales', the key is 'Department'.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * 'Department':'Sales', the key is 'Department'.
     * </p>
     * 
     * @param key
     *        The first part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *        tag 'Department':'Sales', the key is 'Department'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * 'Department':'Sales', the value is 'Sales'.
     * </p>
     * 
     * @param value
     *        The second part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *        tag 'Department':'Sales', the value is 'Sales'.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * 'Department':'Sales', the value is 'Sales'.
     * </p>
     * 
     * @return The second part of a key:value pair that forms a tag associated with a given resource. For example, in
     *         the tag 'Department':'Sales', the value is 'Sales'.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * 'Department':'Sales', the value is 'Sales'.
     * </p>
     * 
     * @param value
     *        The second part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *        tag 'Department':'Sales', the value is 'Sales'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withValue(String value) {
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
        if (getKey() != null)
            sb.append("Key: ").append("***Sensitive Data Redacted***").append(",");
        if (getValue() != null)
            sb.append("Value: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
