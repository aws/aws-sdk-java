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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structured set of sort terms.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/Sort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Sort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier of a field.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * A structured set of sort terms
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Unique identifier of a field.
     * </p>
     * 
     * @param fieldId
     *        Unique identifier of a field.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * Unique identifier of a field.
     * </p>
     * 
     * @return Unique identifier of a field.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * Unique identifier of a field.
     * </p>
     * 
     * @param fieldId
     *        Unique identifier of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sort withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * A structured set of sort terms
     * </p>
     * 
     * @param sortOrder
     *        A structured set of sort terms
     * @see Order
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * A structured set of sort terms
     * </p>
     * 
     * @return A structured set of sort terms
     * @see Order
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * A structured set of sort terms
     * </p>
     * 
     * @param sortOrder
     *        A structured set of sort terms
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public Sort withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * A structured set of sort terms
     * </p>
     * 
     * @param sortOrder
     *        A structured set of sort terms
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public Sort withSortOrder(Order sortOrder) {
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
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
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

        if (obj instanceof Sort == false)
            return false;
        Sort other = (Sort) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
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

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
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
        com.amazonaws.services.connectcases.model.transform.SortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
