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
 * The total options for a pivot table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableTotalOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableTotalOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The row subtotal options.
     * </p>
     */
    private SubtotalOptions rowSubtotalOptions;
    /**
     * <p>
     * The column subtotal options.
     * </p>
     */
    private SubtotalOptions columnSubtotalOptions;
    /**
     * <p>
     * The row total options.
     * </p>
     */
    private PivotTotalOptions rowTotalOptions;
    /**
     * <p>
     * The column total options.
     * </p>
     */
    private PivotTotalOptions columnTotalOptions;

    /**
     * <p>
     * The row subtotal options.
     * </p>
     * 
     * @param rowSubtotalOptions
     *        The row subtotal options.
     */

    public void setRowSubtotalOptions(SubtotalOptions rowSubtotalOptions) {
        this.rowSubtotalOptions = rowSubtotalOptions;
    }

    /**
     * <p>
     * The row subtotal options.
     * </p>
     * 
     * @return The row subtotal options.
     */

    public SubtotalOptions getRowSubtotalOptions() {
        return this.rowSubtotalOptions;
    }

    /**
     * <p>
     * The row subtotal options.
     * </p>
     * 
     * @param rowSubtotalOptions
     *        The row subtotal options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableTotalOptions withRowSubtotalOptions(SubtotalOptions rowSubtotalOptions) {
        setRowSubtotalOptions(rowSubtotalOptions);
        return this;
    }

    /**
     * <p>
     * The column subtotal options.
     * </p>
     * 
     * @param columnSubtotalOptions
     *        The column subtotal options.
     */

    public void setColumnSubtotalOptions(SubtotalOptions columnSubtotalOptions) {
        this.columnSubtotalOptions = columnSubtotalOptions;
    }

    /**
     * <p>
     * The column subtotal options.
     * </p>
     * 
     * @return The column subtotal options.
     */

    public SubtotalOptions getColumnSubtotalOptions() {
        return this.columnSubtotalOptions;
    }

    /**
     * <p>
     * The column subtotal options.
     * </p>
     * 
     * @param columnSubtotalOptions
     *        The column subtotal options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableTotalOptions withColumnSubtotalOptions(SubtotalOptions columnSubtotalOptions) {
        setColumnSubtotalOptions(columnSubtotalOptions);
        return this;
    }

    /**
     * <p>
     * The row total options.
     * </p>
     * 
     * @param rowTotalOptions
     *        The row total options.
     */

    public void setRowTotalOptions(PivotTotalOptions rowTotalOptions) {
        this.rowTotalOptions = rowTotalOptions;
    }

    /**
     * <p>
     * The row total options.
     * </p>
     * 
     * @return The row total options.
     */

    public PivotTotalOptions getRowTotalOptions() {
        return this.rowTotalOptions;
    }

    /**
     * <p>
     * The row total options.
     * </p>
     * 
     * @param rowTotalOptions
     *        The row total options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableTotalOptions withRowTotalOptions(PivotTotalOptions rowTotalOptions) {
        setRowTotalOptions(rowTotalOptions);
        return this;
    }

    /**
     * <p>
     * The column total options.
     * </p>
     * 
     * @param columnTotalOptions
     *        The column total options.
     */

    public void setColumnTotalOptions(PivotTotalOptions columnTotalOptions) {
        this.columnTotalOptions = columnTotalOptions;
    }

    /**
     * <p>
     * The column total options.
     * </p>
     * 
     * @return The column total options.
     */

    public PivotTotalOptions getColumnTotalOptions() {
        return this.columnTotalOptions;
    }

    /**
     * <p>
     * The column total options.
     * </p>
     * 
     * @param columnTotalOptions
     *        The column total options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableTotalOptions withColumnTotalOptions(PivotTotalOptions columnTotalOptions) {
        setColumnTotalOptions(columnTotalOptions);
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
        if (getRowSubtotalOptions() != null)
            sb.append("RowSubtotalOptions: ").append(getRowSubtotalOptions()).append(",");
        if (getColumnSubtotalOptions() != null)
            sb.append("ColumnSubtotalOptions: ").append(getColumnSubtotalOptions()).append(",");
        if (getRowTotalOptions() != null)
            sb.append("RowTotalOptions: ").append(getRowTotalOptions()).append(",");
        if (getColumnTotalOptions() != null)
            sb.append("ColumnTotalOptions: ").append(getColumnTotalOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableTotalOptions == false)
            return false;
        PivotTableTotalOptions other = (PivotTableTotalOptions) obj;
        if (other.getRowSubtotalOptions() == null ^ this.getRowSubtotalOptions() == null)
            return false;
        if (other.getRowSubtotalOptions() != null && other.getRowSubtotalOptions().equals(this.getRowSubtotalOptions()) == false)
            return false;
        if (other.getColumnSubtotalOptions() == null ^ this.getColumnSubtotalOptions() == null)
            return false;
        if (other.getColumnSubtotalOptions() != null && other.getColumnSubtotalOptions().equals(this.getColumnSubtotalOptions()) == false)
            return false;
        if (other.getRowTotalOptions() == null ^ this.getRowTotalOptions() == null)
            return false;
        if (other.getRowTotalOptions() != null && other.getRowTotalOptions().equals(this.getRowTotalOptions()) == false)
            return false;
        if (other.getColumnTotalOptions() == null ^ this.getColumnTotalOptions() == null)
            return false;
        if (other.getColumnTotalOptions() != null && other.getColumnTotalOptions().equals(this.getColumnTotalOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowSubtotalOptions() == null) ? 0 : getRowSubtotalOptions().hashCode());
        hashCode = prime * hashCode + ((getColumnSubtotalOptions() == null) ? 0 : getColumnSubtotalOptions().hashCode());
        hashCode = prime * hashCode + ((getRowTotalOptions() == null) ? 0 : getRowTotalOptions().hashCode());
        hashCode = prime * hashCode + ((getColumnTotalOptions() == null) ? 0 : getColumnTotalOptions().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableTotalOptions clone() {
        try {
            return (PivotTableTotalOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableTotalOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
