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
 * Provides information about the tags that are associated with an S3 bucket or object. Each tag consists of a required
 * tag key and an associated tag value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/KeyValuePair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyValuePair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category for more
     * specific tag values.
     * </p>
     */
    private String key;
    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag value
     * can be an empty string.
     * </p>
     */
    private String value;

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category for more
     * specific tag values.
     * </p>
     * 
     * @param key
     *        One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category
     *        for more specific tag values.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category for more
     * specific tag values.
     * </p>
     * 
     * @return One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category
     *         for more specific tag values.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category for more
     * specific tag values.
     * </p>
     * 
     * @param key
     *        One part of a key-value pair that comprises a tag. A tag key is a general label that acts as a category
     *        for more specific tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValuePair withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag value
     * can be an empty string.
     * </p>
     * 
     * @param value
     *        One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag
     *        value can be an empty string.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag value
     * can be an empty string.
     * </p>
     * 
     * @return One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag
     *         value can be an empty string.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag value
     * can be an empty string.
     * </p>
     * 
     * @param value
     *        One part of a key-value pair that comprises a tag. A tag value acts as a descriptor for a tag key. A tag
     *        value can be an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValuePair withValue(String value) {
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

        if (obj instanceof KeyValuePair == false)
            return false;
        KeyValuePair other = (KeyValuePair) obj;
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
    public KeyValuePair clone() {
        try {
            return (KeyValuePair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.KeyValuePairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
