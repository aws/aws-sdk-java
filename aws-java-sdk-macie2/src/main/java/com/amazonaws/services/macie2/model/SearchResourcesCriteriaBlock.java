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
 * Specifies property- and tag-based conditions that define filter criteria for including or excluding Amazon Web
 * Services resources from the query results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SearchResourcesCriteriaBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourcesCriteriaBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects, one for each property- or tag-based condition that includes or excludes resources from the
     * query results. If you specify more than one condition, Amazon Macie uses AND logic to join the conditions.
     * </p>
     */
    private java.util.List<SearchResourcesCriteria> and;

    /**
     * <p>
     * An array of objects, one for each property- or tag-based condition that includes or excludes resources from the
     * query results. If you specify more than one condition, Amazon Macie uses AND logic to join the conditions.
     * </p>
     * 
     * @return An array of objects, one for each property- or tag-based condition that includes or excludes resources
     *         from the query results. If you specify more than one condition, Amazon Macie uses AND logic to join the
     *         conditions.
     */

    public java.util.List<SearchResourcesCriteria> getAnd() {
        return and;
    }

    /**
     * <p>
     * An array of objects, one for each property- or tag-based condition that includes or excludes resources from the
     * query results. If you specify more than one condition, Amazon Macie uses AND logic to join the conditions.
     * </p>
     * 
     * @param and
     *        An array of objects, one for each property- or tag-based condition that includes or excludes resources
     *        from the query results. If you specify more than one condition, Amazon Macie uses AND logic to join the
     *        conditions.
     */

    public void setAnd(java.util.Collection<SearchResourcesCriteria> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<SearchResourcesCriteria>(and);
    }

    /**
     * <p>
     * An array of objects, one for each property- or tag-based condition that includes or excludes resources from the
     * query results. If you specify more than one condition, Amazon Macie uses AND logic to join the conditions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnd(java.util.Collection)} or {@link #withAnd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param and
     *        An array of objects, one for each property- or tag-based condition that includes or excludes resources
     *        from the query results. If you specify more than one condition, Amazon Macie uses AND logic to join the
     *        conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesCriteriaBlock withAnd(SearchResourcesCriteria... and) {
        if (this.and == null) {
            setAnd(new java.util.ArrayList<SearchResourcesCriteria>(and.length));
        }
        for (SearchResourcesCriteria ele : and) {
            this.and.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each property- or tag-based condition that includes or excludes resources from the
     * query results. If you specify more than one condition, Amazon Macie uses AND logic to join the conditions.
     * </p>
     * 
     * @param and
     *        An array of objects, one for each property- or tag-based condition that includes or excludes resources
     *        from the query results. If you specify more than one condition, Amazon Macie uses AND logic to join the
     *        conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesCriteriaBlock withAnd(java.util.Collection<SearchResourcesCriteria> and) {
        setAnd(and);
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
        if (getAnd() != null)
            sb.append("And: ").append(getAnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchResourcesCriteriaBlock == false)
            return false;
        SearchResourcesCriteriaBlock other = (SearchResourcesCriteriaBlock) obj;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        return hashCode;
    }

    @Override
    public SearchResourcesCriteriaBlock clone() {
        try {
            return (SearchResourcesCriteriaBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SearchResourcesCriteriaBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
