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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The field sort options in a chart configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FieldSortOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldSortOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort configuration for a field in a field well.
     * </p>
     */
    private FieldSort fieldSort;
    /**
     * <p>
     * The sort configuration for a column that is not used in a field well.
     * </p>
     */
    private ColumnSort columnSort;

    /**
     * <p>
     * The sort configuration for a field in a field well.
     * </p>
     * 
     * @param fieldSort
     *        The sort configuration for a field in a field well.
     */

    public void setFieldSort(FieldSort fieldSort) {
        this.fieldSort = fieldSort;
    }

    /**
     * <p>
     * The sort configuration for a field in a field well.
     * </p>
     * 
     * @return The sort configuration for a field in a field well.
     */

    public FieldSort getFieldSort() {
        return this.fieldSort;
    }

    /**
     * <p>
     * The sort configuration for a field in a field well.
     * </p>
     * 
     * @param fieldSort
     *        The sort configuration for a field in a field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSortOptions withFieldSort(FieldSort fieldSort) {
        setFieldSort(fieldSort);
        return this;
    }

    /**
     * <p>
     * The sort configuration for a column that is not used in a field well.
     * </p>
     * 
     * @param columnSort
     *        The sort configuration for a column that is not used in a field well.
     */

    public void setColumnSort(ColumnSort columnSort) {
        this.columnSort = columnSort;
    }

    /**
     * <p>
     * The sort configuration for a column that is not used in a field well.
     * </p>
     * 
     * @return The sort configuration for a column that is not used in a field well.
     */

    public ColumnSort getColumnSort() {
        return this.columnSort;
    }

    /**
     * <p>
     * The sort configuration for a column that is not used in a field well.
     * </p>
     * 
     * @param columnSort
     *        The sort configuration for a column that is not used in a field well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSortOptions withColumnSort(ColumnSort columnSort) {
        setColumnSort(columnSort);
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
        if (getFieldSort() != null)
            sb.append("FieldSort: ").append(getFieldSort()).append(",");
        if (getColumnSort() != null)
            sb.append("ColumnSort: ").append(getColumnSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldSortOptions == false)
            return false;
        FieldSortOptions other = (FieldSortOptions) obj;
        if (other.getFieldSort() == null ^ this.getFieldSort() == null)
            return false;
        if (other.getFieldSort() != null && other.getFieldSort().equals(this.getFieldSort()) == false)
            return false;
        if (other.getColumnSort() == null ^ this.getColumnSort() == null)
            return false;
        if (other.getColumnSort() != null && other.getColumnSort().equals(this.getColumnSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldSort() == null) ? 0 : getFieldSort().hashCode());
        hashCode = prime * hashCode + ((getColumnSort() == null) ? 0 : getColumnSort().hashCode());
        return hashCode;
    }

    @Override
    public FieldSortOptions clone() {
        try {
            return (FieldSortOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FieldSortOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
