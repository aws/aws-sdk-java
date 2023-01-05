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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The optional metadata that you apply to resources to help you categorize and organize them. Each tag consists of a
 * key and an optional value, both of which you define. For more information see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">Tagging Personalize resources</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * The optional part of a key-value pair that makes up a tag. A value acts as a descriptor within a tag category
     * (key).
     * </p>
     */
    private String tagValue;

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @param tagKey
     *        One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for
     *        more specific tag values.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @return One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for
     *         more specific tag values.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more
     * specific tag values.
     * </p>
     * 
     * @param tagKey
     *        One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for
     *        more specific tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * The optional part of a key-value pair that makes up a tag. A value acts as a descriptor within a tag category
     * (key).
     * </p>
     * 
     * @param tagValue
     *        The optional part of a key-value pair that makes up a tag. A value acts as a descriptor within a tag
     *        category (key).
     */

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * <p>
     * The optional part of a key-value pair that makes up a tag. A value acts as a descriptor within a tag category
     * (key).
     * </p>
     * 
     * @return The optional part of a key-value pair that makes up a tag. A value acts as a descriptor within a tag
     *         category (key).
     */

    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * <p>
     * The optional part of a key-value pair that makes up a tag. A value acts as a descriptor within a tag category
     * (key).
     * </p>
     * 
     * @param tagValue
     *        The optional part of a key-value pair that makes up a tag. A value acts as a descriptor within a tag
     *        category (key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withTagValue(String tagValue) {
        setTagValue(tagValue);
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getTagValue() != null)
            sb.append("TagValue: ").append(getTagValue());
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
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValue() == null ^ this.getTagValue() == null)
            return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValue() == null) ? 0 : getTagValue().hashCode());
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
        com.amazonaws.services.personalize.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
