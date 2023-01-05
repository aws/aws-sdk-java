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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A tag key and optional list of possible values that you can use to filter results for tagged resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/TagFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tag key. This must have a valid string value and can't be empty.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * A list of zero or more tag values. If no values are provided, then the filter matches any tag with the specified
     * key, regardless of its value.
     * </p>
     */
    private java.util.List<String> tagValues;

    /**
     * <p>
     * The tag key. This must have a valid string value and can't be empty.
     * </p>
     * 
     * @param tagKey
     *        The tag key. This must have a valid string value and can't be empty.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The tag key. This must have a valid string value and can't be empty.
     * </p>
     * 
     * @return The tag key. This must have a valid string value and can't be empty.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The tag key. This must have a valid string value and can't be empty.
     * </p>
     * 
     * @param tagKey
     *        The tag key. This must have a valid string value and can't be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * A list of zero or more tag values. If no values are provided, then the filter matches any tag with the specified
     * key, regardless of its value.
     * </p>
     * 
     * @return A list of zero or more tag values. If no values are provided, then the filter matches any tag with the
     *         specified key, regardless of its value.
     */

    public java.util.List<String> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * A list of zero or more tag values. If no values are provided, then the filter matches any tag with the specified
     * key, regardless of its value.
     * </p>
     * 
     * @param tagValues
     *        A list of zero or more tag values. If no values are provided, then the filter matches any tag with the
     *        specified key, regardless of its value.
     */

    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<String>(tagValues);
    }

    /**
     * <p>
     * A list of zero or more tag values. If no values are provided, then the filter matches any tag with the specified
     * key, regardless of its value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        A list of zero or more tag values. If no values are provided, then the filter matches any tag with the
     *        specified key, regardless of its value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withTagValues(String... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new java.util.ArrayList<String>(tagValues.length));
        }
        for (String ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of zero or more tag values. If no values are provided, then the filter matches any tag with the specified
     * key, regardless of its value.
     * </p>
     * 
     * @param tagValues
     *        A list of zero or more tag values. If no values are provided, then the filter matches any tag with the
     *        specified key, regardless of its value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagFilter withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getTagValues() != null)
            sb.append("TagValues: ").append(getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagFilter == false)
            return false;
        TagFilter other = (TagFilter) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public TagFilter clone() {
        try {
            return (TagFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.TagFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
