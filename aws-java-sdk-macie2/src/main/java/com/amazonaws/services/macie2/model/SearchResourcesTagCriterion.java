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
 * Specifies a tag-based filter condition that determines which Amazon Web Services resources are included or excluded
 * from the query results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SearchResourcesTagCriterion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourcesTagCriterion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     */
    private String comparator;
    /**
     * <p>
     * The tag keys, tag values, or tag key and value pairs to use in the condition.
     * </p>
     */
    private java.util.List<SearchResourcesTagCriterionPair> tagValues;

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * @see SearchResourcesComparator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     * 
     * @return The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * @see SearchResourcesComparator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchResourcesComparator
     */

    public SearchResourcesTagCriterion withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. Valid values are EQ (equals) and NE (not equals).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchResourcesComparator
     */

    public SearchResourcesTagCriterion withComparator(SearchResourcesComparator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys, tag values, or tag key and value pairs to use in the condition.
     * </p>
     * 
     * @return The tag keys, tag values, or tag key and value pairs to use in the condition.
     */

    public java.util.List<SearchResourcesTagCriterionPair> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * The tag keys, tag values, or tag key and value pairs to use in the condition.
     * </p>
     * 
     * @param tagValues
     *        The tag keys, tag values, or tag key and value pairs to use in the condition.
     */

    public void setTagValues(java.util.Collection<SearchResourcesTagCriterionPair> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<SearchResourcesTagCriterionPair>(tagValues);
    }

    /**
     * <p>
     * The tag keys, tag values, or tag key and value pairs to use in the condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        The tag keys, tag values, or tag key and value pairs to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesTagCriterion withTagValues(SearchResourcesTagCriterionPair... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new java.util.ArrayList<SearchResourcesTagCriterionPair>(tagValues.length));
        }
        for (SearchResourcesTagCriterionPair ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys, tag values, or tag key and value pairs to use in the condition.
     * </p>
     * 
     * @param tagValues
     *        The tag keys, tag values, or tag key and value pairs to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesTagCriterion withTagValues(java.util.Collection<SearchResourcesTagCriterionPair> tagValues) {
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
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
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

        if (obj instanceof SearchResourcesTagCriterion == false)
            return false;
        SearchResourcesTagCriterion other = (SearchResourcesTagCriterion) obj;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
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

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public SearchResourcesTagCriterion clone() {
        try {
            return (SearchResourcesTagCriterion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SearchResourcesTagCriterionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
