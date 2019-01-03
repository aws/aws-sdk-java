/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Creates a key-value pair for a specific resource. Tags are metadata that you can use to search for and group a
 * resource for various purposes. You can apply tags to servers, users, and roles. A tag key can take more than one
 * value. For example, to group servers for accounting purposes, you might create a tag called <code>Group</code> and
 * assign the values <code>Research</code> and <code>Accounting</code> to that group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name assigned to the tag that you create.
     * </p>
     */
    private String key;
    /**
     * <p>
     * This property contains one or more values that you assigned to the key name you create.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name assigned to the tag that you create.
     * </p>
     * 
     * @param key
     *        The name assigned to the tag that you create.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name assigned to the tag that you create.
     * </p>
     * 
     * @return The name assigned to the tag that you create.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name assigned to the tag that you create.
     * </p>
     * 
     * @param key
     *        The name assigned to the tag that you create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * This property contains one or more values that you assigned to the key name you create.
     * </p>
     * 
     * @param value
     *        This property contains one or more values that you assigned to the key name you create.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * This property contains one or more values that you assigned to the key name you create.
     * </p>
     * 
     * @return This property contains one or more values that you assigned to the key name you create.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * This property contains one or more values that you assigned to the key name you create.
     * </p>
     * 
     * @param value
     *        This property contains one or more values that you assigned to the key name you create.
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
            sb.append("Key: ").append(getKey()).append(",");
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
        com.amazonaws.services.transfer.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
