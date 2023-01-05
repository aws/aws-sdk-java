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
 * The field wells for a table visual.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field well for the table.
     * </p>
     */
    private TableAggregatedFieldWells tableAggregatedFieldWells;
    /**
     * <p>
     * The unaggregated field well for the table.
     * </p>
     */
    private TableUnaggregatedFieldWells tableUnaggregatedFieldWells;

    /**
     * <p>
     * The aggregated field well for the table.
     * </p>
     * 
     * @param tableAggregatedFieldWells
     *        The aggregated field well for the table.
     */

    public void setTableAggregatedFieldWells(TableAggregatedFieldWells tableAggregatedFieldWells) {
        this.tableAggregatedFieldWells = tableAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field well for the table.
     * </p>
     * 
     * @return The aggregated field well for the table.
     */

    public TableAggregatedFieldWells getTableAggregatedFieldWells() {
        return this.tableAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field well for the table.
     * </p>
     * 
     * @param tableAggregatedFieldWells
     *        The aggregated field well for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldWells withTableAggregatedFieldWells(TableAggregatedFieldWells tableAggregatedFieldWells) {
        setTableAggregatedFieldWells(tableAggregatedFieldWells);
        return this;
    }

    /**
     * <p>
     * The unaggregated field well for the table.
     * </p>
     * 
     * @param tableUnaggregatedFieldWells
     *        The unaggregated field well for the table.
     */

    public void setTableUnaggregatedFieldWells(TableUnaggregatedFieldWells tableUnaggregatedFieldWells) {
        this.tableUnaggregatedFieldWells = tableUnaggregatedFieldWells;
    }

    /**
     * <p>
     * The unaggregated field well for the table.
     * </p>
     * 
     * @return The unaggregated field well for the table.
     */

    public TableUnaggregatedFieldWells getTableUnaggregatedFieldWells() {
        return this.tableUnaggregatedFieldWells;
    }

    /**
     * <p>
     * The unaggregated field well for the table.
     * </p>
     * 
     * @param tableUnaggregatedFieldWells
     *        The unaggregated field well for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldWells withTableUnaggregatedFieldWells(TableUnaggregatedFieldWells tableUnaggregatedFieldWells) {
        setTableUnaggregatedFieldWells(tableUnaggregatedFieldWells);
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
        if (getTableAggregatedFieldWells() != null)
            sb.append("TableAggregatedFieldWells: ").append(getTableAggregatedFieldWells()).append(",");
        if (getTableUnaggregatedFieldWells() != null)
            sb.append("TableUnaggregatedFieldWells: ").append(getTableUnaggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableFieldWells == false)
            return false;
        TableFieldWells other = (TableFieldWells) obj;
        if (other.getTableAggregatedFieldWells() == null ^ this.getTableAggregatedFieldWells() == null)
            return false;
        if (other.getTableAggregatedFieldWells() != null && other.getTableAggregatedFieldWells().equals(this.getTableAggregatedFieldWells()) == false)
            return false;
        if (other.getTableUnaggregatedFieldWells() == null ^ this.getTableUnaggregatedFieldWells() == null)
            return false;
        if (other.getTableUnaggregatedFieldWells() != null && other.getTableUnaggregatedFieldWells().equals(this.getTableUnaggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableAggregatedFieldWells() == null) ? 0 : getTableAggregatedFieldWells().hashCode());
        hashCode = prime * hashCode + ((getTableUnaggregatedFieldWells() == null) ? 0 : getTableUnaggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public TableFieldWells clone() {
        try {
            return (TableFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
