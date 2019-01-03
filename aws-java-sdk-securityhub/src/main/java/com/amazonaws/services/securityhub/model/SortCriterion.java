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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of attributes used for sorting findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SortCriterion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SortCriterion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The finding attribute used for sorting findings.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The order used for sorting findings.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The finding attribute used for sorting findings.
     * </p>
     * 
     * @param field
     *        The finding attribute used for sorting findings.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The finding attribute used for sorting findings.
     * </p>
     * 
     * @return The finding attribute used for sorting findings.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The finding attribute used for sorting findings.
     * </p>
     * 
     * @param field
     *        The finding attribute used for sorting findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SortCriterion withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The order used for sorting findings.
     * </p>
     * 
     * @param sortOrder
     *        The order used for sorting findings.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order used for sorting findings.
     * </p>
     * 
     * @return The order used for sorting findings.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order used for sorting findings.
     * </p>
     * 
     * @param sortOrder
     *        The order used for sorting findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortCriterion withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order used for sorting findings.
     * </p>
     * 
     * @param sortOrder
     *        The order used for sorting findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortCriterion withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SortCriterion == false)
            return false;
        SortCriterion other = (SortCriterion) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public SortCriterion clone() {
        try {
            return (SortCriterion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SortCriterionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
