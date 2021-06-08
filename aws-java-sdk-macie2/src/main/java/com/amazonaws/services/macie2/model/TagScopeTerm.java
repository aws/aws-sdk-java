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
 * Specifies a tag-based condition that determines whether an S3 object is included or excluded from a classification
 * job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TagScopeTerm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagScopeTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * </p>
     */
    private String comparator;
    /**
     * <p>
     * The object property to use in the condition. The only valid value is TAG.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition, specify
     * the keys in this array and set the value for each associated tag value to an empty string.
     * </p>
     */
    private java.util.List<TagValuePair> tagValues;
    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * @see JobComparator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * </p>
     * 
     * @return The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * @see JobComparator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobComparator
     */

    public TagScopeTerm withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) or NE (not equals).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobComparator
     */

    public TagScopeTerm withComparator(JobComparator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The object property to use in the condition. The only valid value is TAG.
     * </p>
     * 
     * @param key
     *        The object property to use in the condition. The only valid value is TAG.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The object property to use in the condition. The only valid value is TAG.
     * </p>
     * 
     * @return The object property to use in the condition. The only valid value is TAG.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The object property to use in the condition. The only valid value is TAG.
     * </p>
     * 
     * @param key
     *        The object property to use in the condition. The only valid value is TAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagScopeTerm withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition, specify
     * the keys in this array and set the value for each associated tag value to an empty string.
     * </p>
     * 
     * @return The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition,
     *         specify the keys in this array and set the value for each associated tag value to an empty string.
     */

    public java.util.List<TagValuePair> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition, specify
     * the keys in this array and set the value for each associated tag value to an empty string.
     * </p>
     * 
     * @param tagValues
     *        The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition,
     *        specify the keys in this array and set the value for each associated tag value to an empty string.
     */

    public void setTagValues(java.util.Collection<TagValuePair> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<TagValuePair>(tagValues);
    }

    /**
     * <p>
     * The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition, specify
     * the keys in this array and set the value for each associated tag value to an empty string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition,
     *        specify the keys in this array and set the value for each associated tag value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagScopeTerm withTagValues(TagValuePair... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new java.util.ArrayList<TagValuePair>(tagValues.length));
        }
        for (TagValuePair ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition, specify
     * the keys in this array and set the value for each associated tag value to an empty string.
     * </p>
     * 
     * @param tagValues
     *        The tag keys or tag key and value pairs to use in the condition. To specify only tag keys in a condition,
     *        specify the keys in this array and set the value for each associated tag value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagScopeTerm withTagValues(java.util.Collection<TagValuePair> tagValues) {
        setTagValues(tagValues);
        return this;
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * 
     * @param target
     *        The type of object to apply the condition to.
     * @see TagTarget
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * 
     * @return The type of object to apply the condition to.
     * @see TagTarget
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * 
     * @param target
     *        The type of object to apply the condition to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagTarget
     */

    public TagScopeTerm withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The type of object to apply the condition to.
     * </p>
     * 
     * @param target
     *        The type of object to apply the condition to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TagTarget
     */

    public TagScopeTerm withTarget(TagTarget target) {
        this.target = target.toString();
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
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getTagValues() != null)
            sb.append("TagValues: ").append(getTagValues()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagScopeTerm == false)
            return false;
        TagScopeTerm other = (TagScopeTerm) obj;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public TagScopeTerm clone() {
        try {
            return (TagScopeTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.TagScopeTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
