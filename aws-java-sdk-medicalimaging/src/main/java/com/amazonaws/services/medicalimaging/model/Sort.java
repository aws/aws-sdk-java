/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sort search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/Sort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Sort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort order for search criteria.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The sort field for search criteria.
     * </p>
     */
    private String sortField;

    /**
     * <p>
     * The sort order for search criteria.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for search criteria.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for search criteria.
     * </p>
     * 
     * @return The sort order for search criteria.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for search criteria.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public Sort withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for search criteria.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public Sort withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The sort field for search criteria.
     * </p>
     * 
     * @param sortField
     *        The sort field for search criteria.
     * @see SortField
     */

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    /**
     * <p>
     * The sort field for search criteria.
     * </p>
     * 
     * @return The sort field for search criteria.
     * @see SortField
     */

    public String getSortField() {
        return this.sortField;
    }

    /**
     * <p>
     * The sort field for search criteria.
     * </p>
     * 
     * @param sortField
     *        The sort field for search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortField
     */

    public Sort withSortField(String sortField) {
        setSortField(sortField);
        return this;
    }

    /**
     * <p>
     * The sort field for search criteria.
     * </p>
     * 
     * @param sortField
     *        The sort field for search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortField
     */

    public Sort withSortField(SortField sortField) {
        this.sortField = sortField.toString();
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
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortField() != null)
            sb.append("SortField: ").append(getSortField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Sort == false)
            return false;
        Sort other = (Sort) obj;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortField() == null ^ this.getSortField() == null)
            return false;
        if (other.getSortField() != null && other.getSortField().equals(this.getSortField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortField() == null) ? 0 : getSortField().hashCode());
        return hashCode;
    }

    @Override
    public Sort clone() {
        try {
            return (Sort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.SortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
