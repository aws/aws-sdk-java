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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Represents the criteria used for sorting findings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/SortCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SortCriteria implements Serializable, Cloneable, StructuredPojo {

    /** Represents the finding attribute (for example, accountId) by which to sort findings. */
    private String attributeName;
    /** Order by which the sorted findings are to be displayed. */
    private String orderBy;

    /**
     * Represents the finding attribute (for example, accountId) by which to sort findings.
     * 
     * @param attributeName
     *        Represents the finding attribute (for example, accountId) by which to sort findings.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * Represents the finding attribute (for example, accountId) by which to sort findings.
     * 
     * @return Represents the finding attribute (for example, accountId) by which to sort findings.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * Represents the finding attribute (for example, accountId) by which to sort findings.
     * 
     * @param attributeName
     *        Represents the finding attribute (for example, accountId) by which to sort findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SortCriteria withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * Order by which the sorted findings are to be displayed.
     * 
     * @param orderBy
     *        Order by which the sorted findings are to be displayed.
     * @see OrderBy
     */

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * Order by which the sorted findings are to be displayed.
     * 
     * @return Order by which the sorted findings are to be displayed.
     * @see OrderBy
     */

    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * Order by which the sorted findings are to be displayed.
     * 
     * @param orderBy
     *        Order by which the sorted findings are to be displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public SortCriteria withOrderBy(String orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * Order by which the sorted findings are to be displayed.
     * 
     * @param orderBy
     *        Order by which the sorted findings are to be displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public SortCriteria withOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SortCriteria == false)
            return false;
        SortCriteria other = (SortCriteria) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        return hashCode;
    }

    @Override
    public SortCriteria clone() {
        try {
            return (SortCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.SortCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
