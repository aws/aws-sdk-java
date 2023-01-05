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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A map that contains tag keys and tag values to attach to an Amazon Web Services X-Ray group or sampling rule. For
 * more information about ways to use tags, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a> in
 * the <i>Amazon Web Services General Reference</i>.
 * </p>
 * <p>
 * The following restrictions apply to tags:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Maximum number of user-applied tags per resource: 50
 * </p>
 * </li>
 * <li>
 * <p>
 * Tag keys and values are case sensitive.
 * </p>
 * </li>
 * <li>
 * <p>
 * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use. You cannot edit or
 * delete system tags.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A tag key, such as <code>Stage</code> or <code>Name</code>. A tag key cannot be empty. The key can be a maximum
     * of 128 characters, and can contain only Unicode letters, numbers, or separators, or the following special
     * characters: <code>+ - = . _ : /</code>
     * </p>
     */
    private String key;
    /**
     * <p>
     * An optional tag value, such as <code>Production</code> or <code>test-only</code>. The value can be a maximum of
     * 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     */
    private String value;

    /**
     * <p>
     * A tag key, such as <code>Stage</code> or <code>Name</code>. A tag key cannot be empty. The key can be a maximum
     * of 128 characters, and can contain only Unicode letters, numbers, or separators, or the following special
     * characters: <code>+ - = . _ : /</code>
     * </p>
     * 
     * @param key
     *        A tag key, such as <code>Stage</code> or <code>Name</code>. A tag key cannot be empty. The key can be a
     *        maximum of 128 characters, and can contain only Unicode letters, numbers, or separators, or the following
     *        special characters: <code>+ - = . _ : /</code>
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * A tag key, such as <code>Stage</code> or <code>Name</code>. A tag key cannot be empty. The key can be a maximum
     * of 128 characters, and can contain only Unicode letters, numbers, or separators, or the following special
     * characters: <code>+ - = . _ : /</code>
     * </p>
     * 
     * @return A tag key, such as <code>Stage</code> or <code>Name</code>. A tag key cannot be empty. The key can be a
     *         maximum of 128 characters, and can contain only Unicode letters, numbers, or separators, or the following
     *         special characters: <code>+ - = . _ : /</code>
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * A tag key, such as <code>Stage</code> or <code>Name</code>. A tag key cannot be empty. The key can be a maximum
     * of 128 characters, and can contain only Unicode letters, numbers, or separators, or the following special
     * characters: <code>+ - = . _ : /</code>
     * </p>
     * 
     * @param key
     *        A tag key, such as <code>Stage</code> or <code>Name</code>. A tag key cannot be empty. The key can be a
     *        maximum of 128 characters, and can contain only Unicode letters, numbers, or separators, or the following
     *        special characters: <code>+ - = . _ : /</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * An optional tag value, such as <code>Production</code> or <code>test-only</code>. The value can be a maximum of
     * 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * 
     * @param value
     *        An optional tag value, such as <code>Production</code> or <code>test-only</code>. The value can be a
     *        maximum of 255 characters, and contain only Unicode letters, numbers, or separators, or the following
     *        special characters: <code>+ - = . _ : /</code>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * An optional tag value, such as <code>Production</code> or <code>test-only</code>. The value can be a maximum of
     * 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * 
     * @return An optional tag value, such as <code>Production</code> or <code>test-only</code>. The value can be a
     *         maximum of 255 characters, and contain only Unicode letters, numbers, or separators, or the following
     *         special characters: <code>+ - = . _ : /</code>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * An optional tag value, such as <code>Production</code> or <code>test-only</code>. The value can be a maximum of
     * 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters:
     * <code>+ - = . _ : /</code>
     * </p>
     * 
     * @param value
     *        An optional tag value, such as <code>Production</code> or <code>test-only</code>. The value can be a
     *        maximum of 255 characters, and contain only Unicode letters, numbers, or separators, or the following
     *        special characters: <code>+ - = . _ : /</code>
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
        com.amazonaws.services.xray.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
