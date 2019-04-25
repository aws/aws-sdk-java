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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
 * </p>
 * <p>
 * AWS-assigned tag names and values are automatically assigned the aws: prefix, which the user cannot assign.
 * AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix user: in the
 * Cost Allocation Report. You cannot backdate the application of a tag.
 * </p>
 * <p>
 * For an overview on tagging DynamoDB resources, see <a
 * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in the
 * <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same
     * key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value of the tag. Tag values are case-sensitive and can be null.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same
     * key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value.
     * </p>
     * 
     * @param key
     *        The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the
     *        same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new
     *        value.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same
     * key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value.
     * </p>
     * 
     * @return The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the
     *         same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new
     *         value.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same
     * key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value.
     * </p>
     * 
     * @param key
     *        The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the
     *        same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the tag. Tag values are case-sensitive and can be null.
     * </p>
     * 
     * @param value
     *        The value of the tag. Tag values are case-sensitive and can be null.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the tag. Tag values are case-sensitive and can be null.
     * </p>
     * 
     * @return The value of the tag. Tag values are case-sensitive and can be null.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the tag. Tag values are case-sensitive and can be null.
     * </p>
     * 
     * @param value
     *        The value of the tag. Tag values are case-sensitive and can be null.
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
        com.amazonaws.services.dynamodbv2.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
