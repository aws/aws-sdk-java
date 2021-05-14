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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a tag key or tag key and value pair to use in a tag-based condition that determines whether an S3 object is
 * included or excluded from a classification job. Tag keys and values are case sensitive. Also, Amazon Macie doesn't
 * support use of partial values or wildcard characters in tag-based conditions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TagValuePair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagValuePair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value for the tag key to use in the condition.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The tag value, associated with the specified tag key (key), to use in the condition. To specify only a tag key
     * for a condition, specify the tag key for the key property and set this value to an empty string.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The value for the tag key to use in the condition.
     * </p>
     * 
     * @param key
     *        The value for the tag key to use in the condition.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The value for the tag key to use in the condition.
     * </p>
     * 
     * @return The value for the tag key to use in the condition.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The value for the tag key to use in the condition.
     * </p>
     * 
     * @param key
     *        The value for the tag key to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagValuePair withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The tag value, associated with the specified tag key (key), to use in the condition. To specify only a tag key
     * for a condition, specify the tag key for the key property and set this value to an empty string.
     * </p>
     * 
     * @param value
     *        The tag value, associated with the specified tag key (key), to use in the condition. To specify only a tag
     *        key for a condition, specify the tag key for the key property and set this value to an empty string.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag value, associated with the specified tag key (key), to use in the condition. To specify only a tag key
     * for a condition, specify the tag key for the key property and set this value to an empty string.
     * </p>
     * 
     * @return The tag value, associated with the specified tag key (key), to use in the condition. To specify only a
     *         tag key for a condition, specify the tag key for the key property and set this value to an empty string.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The tag value, associated with the specified tag key (key), to use in the condition. To specify only a tag key
     * for a condition, specify the tag key for the key property and set this value to an empty string.
     * </p>
     * 
     * @param value
     *        The tag value, associated with the specified tag key (key), to use in the condition. To specify only a tag
     *        key for a condition, specify the tag key for the key property and set this value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagValuePair withValue(String value) {
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

        if (obj instanceof TagValuePair == false)
            return false;
        TagValuePair other = (TagValuePair) obj;
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
    public TagValuePair clone() {
        try {
            return (TagValuePair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.TagValuePairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
