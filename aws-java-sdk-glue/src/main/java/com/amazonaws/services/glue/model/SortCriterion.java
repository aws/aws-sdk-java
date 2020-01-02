/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a field to sort by and a sort order.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SortCriterion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SortCriterion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     */
    private String sort;

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * 
     * @param fieldName
     *        The name of the field on which to sort.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * 
     * @return The name of the field on which to sort.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The name of the field on which to sort.
     * </p>
     * 
     * @param fieldName
     *        The name of the field on which to sort.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SortCriterion withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * 
     * @param sort
     *        An ascending or descending sort.
     * @see Sort
     */

    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * 
     * @return An ascending or descending sort.
     * @see Sort
     */

    public String getSort() {
        return this.sort;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * 
     * @param sort
     *        An ascending or descending sort.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Sort
     */

    public SortCriterion withSort(String sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * An ascending or descending sort.
     * </p>
     * 
     * @param sort
     *        An ascending or descending sort.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Sort
     */

    public SortCriterion withSort(Sort sort) {
        this.sort = sort.toString();
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
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort());
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
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
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
        com.amazonaws.services.glue.model.transform.SortCriterionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
