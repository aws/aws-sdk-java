/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <i>tag</i> is a label that you can define and associate with Amazon Web Services resources, including certain types
 * of Amazon Security Lake resources. Tags can help you identify, categorize, and manage resources in different ways,
 * such as by owner, environment, or other criteria. You can associate tags with the following types of Security Lake
 * resources: subscribers, and the data lake configuration for your Amazon Web Services account in individual Amazon Web
 * Services Regions.
 * </p>
 * <p>
 * A resource can have up to 50 tags. Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>.
 * A <i>tag key</i> is a general label that acts as a category for a more specific tag value. Each tag key must be
 * unique and it can have only one tag value. A <i>tag value</i> acts as a descriptor for a tag key. Tag keys and values
 * are case sensitive. They can contain letters, numbers, spaces, or the following symbols: _ . : / = + @ -
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/security-lake/latest/userguide/tagging-resources.html">Tagging Amazon Security Lake
 * resources</a> in the <i>Amazon Security Lake User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the tag. This is a general label that acts as a category for a more specific tag value (
     * <code>value</code>).
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value that’s associated with the specified tag key (<code>key</code>). This value acts as a descriptor for
     * the tag key. A tag value cannot be null, but it can be an empty string.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the tag. This is a general label that acts as a category for a more specific tag value (
     * <code>value</code>).
     * </p>
     * 
     * @param key
     *        The name of the tag. This is a general label that acts as a category for a more specific tag value (
     *        <code>value</code>).
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the tag. This is a general label that acts as a category for a more specific tag value (
     * <code>value</code>).
     * </p>
     * 
     * @return The name of the tag. This is a general label that acts as a category for a more specific tag value (
     *         <code>value</code>).
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the tag. This is a general label that acts as a category for a more specific tag value (
     * <code>value</code>).
     * </p>
     * 
     * @param key
     *        The name of the tag. This is a general label that acts as a category for a more specific tag value (
     *        <code>value</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value that’s associated with the specified tag key (<code>key</code>). This value acts as a descriptor for
     * the tag key. A tag value cannot be null, but it can be an empty string.
     * </p>
     * 
     * @param value
     *        The value that’s associated with the specified tag key (<code>key</code>). This value acts as a descriptor
     *        for the tag key. A tag value cannot be null, but it can be an empty string.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value that’s associated with the specified tag key (<code>key</code>). This value acts as a descriptor for
     * the tag key. A tag value cannot be null, but it can be an empty string.
     * </p>
     * 
     * @return The value that’s associated with the specified tag key (<code>key</code>). This value acts as a
     *         descriptor for the tag key. A tag value cannot be null, but it can be an empty string.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value that’s associated with the specified tag key (<code>key</code>). This value acts as a descriptor for
     * the tag key. A tag value cannot be null, but it can be an empty string.
     * </p>
     * 
     * @param value
     *        The value that’s associated with the specified tag key (<code>key</code>). This value acts as a descriptor
     *        for the tag key. A tag value cannot be null, but it can be an empty string.
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
        com.amazonaws.services.securitylake.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
