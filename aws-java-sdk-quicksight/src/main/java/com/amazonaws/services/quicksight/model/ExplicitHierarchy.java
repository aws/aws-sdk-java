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
 * The option that determines the hierarchy of the fields that are built within a visual's field wells. These fields
 * can't be duplicated to other visuals.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ExplicitHierarchy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExplicitHierarchy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hierarchy ID of the explicit hierarchy.
     * </p>
     */
    private String hierarchyId;
    /**
     * <p>
     * The list of columns that define the explicit hierarchy.
     * </p>
     */
    private java.util.List<ColumnIdentifier> columns;
    /**
     * <p>
     * The option that determines the drill down filters for the explicit hierarchy.
     * </p>
     */
    private java.util.List<DrillDownFilter> drillDownFilters;

    /**
     * <p>
     * The hierarchy ID of the explicit hierarchy.
     * </p>
     * 
     * @param hierarchyId
     *        The hierarchy ID of the explicit hierarchy.
     */

    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * <p>
     * The hierarchy ID of the explicit hierarchy.
     * </p>
     * 
     * @return The hierarchy ID of the explicit hierarchy.
     */

    public String getHierarchyId() {
        return this.hierarchyId;
    }

    /**
     * <p>
     * The hierarchy ID of the explicit hierarchy.
     * </p>
     * 
     * @param hierarchyId
     *        The hierarchy ID of the explicit hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplicitHierarchy withHierarchyId(String hierarchyId) {
        setHierarchyId(hierarchyId);
        return this;
    }

    /**
     * <p>
     * The list of columns that define the explicit hierarchy.
     * </p>
     * 
     * @return The list of columns that define the explicit hierarchy.
     */

    public java.util.List<ColumnIdentifier> getColumns() {
        return columns;
    }

    /**
     * <p>
     * The list of columns that define the explicit hierarchy.
     * </p>
     * 
     * @param columns
     *        The list of columns that define the explicit hierarchy.
     */

    public void setColumns(java.util.Collection<ColumnIdentifier> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<ColumnIdentifier>(columns);
    }

    /**
     * <p>
     * The list of columns that define the explicit hierarchy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        The list of columns that define the explicit hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplicitHierarchy withColumns(ColumnIdentifier... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<ColumnIdentifier>(columns.length));
        }
        for (ColumnIdentifier ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of columns that define the explicit hierarchy.
     * </p>
     * 
     * @param columns
     *        The list of columns that define the explicit hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplicitHierarchy withColumns(java.util.Collection<ColumnIdentifier> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * The option that determines the drill down filters for the explicit hierarchy.
     * </p>
     * 
     * @return The option that determines the drill down filters for the explicit hierarchy.
     */

    public java.util.List<DrillDownFilter> getDrillDownFilters() {
        return drillDownFilters;
    }

    /**
     * <p>
     * The option that determines the drill down filters for the explicit hierarchy.
     * </p>
     * 
     * @param drillDownFilters
     *        The option that determines the drill down filters for the explicit hierarchy.
     */

    public void setDrillDownFilters(java.util.Collection<DrillDownFilter> drillDownFilters) {
        if (drillDownFilters == null) {
            this.drillDownFilters = null;
            return;
        }

        this.drillDownFilters = new java.util.ArrayList<DrillDownFilter>(drillDownFilters);
    }

    /**
     * <p>
     * The option that determines the drill down filters for the explicit hierarchy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDrillDownFilters(java.util.Collection)} or {@link #withDrillDownFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param drillDownFilters
     *        The option that determines the drill down filters for the explicit hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplicitHierarchy withDrillDownFilters(DrillDownFilter... drillDownFilters) {
        if (this.drillDownFilters == null) {
            setDrillDownFilters(new java.util.ArrayList<DrillDownFilter>(drillDownFilters.length));
        }
        for (DrillDownFilter ele : drillDownFilters) {
            this.drillDownFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The option that determines the drill down filters for the explicit hierarchy.
     * </p>
     * 
     * @param drillDownFilters
     *        The option that determines the drill down filters for the explicit hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplicitHierarchy withDrillDownFilters(java.util.Collection<DrillDownFilter> drillDownFilters) {
        setDrillDownFilters(drillDownFilters);
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
        if (getHierarchyId() != null)
            sb.append("HierarchyId: ").append(getHierarchyId()).append(",");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getDrillDownFilters() != null)
            sb.append("DrillDownFilters: ").append(getDrillDownFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExplicitHierarchy == false)
            return false;
        ExplicitHierarchy other = (ExplicitHierarchy) obj;
        if (other.getHierarchyId() == null ^ this.getHierarchyId() == null)
            return false;
        if (other.getHierarchyId() != null && other.getHierarchyId().equals(this.getHierarchyId()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getDrillDownFilters() == null ^ this.getDrillDownFilters() == null)
            return false;
        if (other.getDrillDownFilters() != null && other.getDrillDownFilters().equals(this.getDrillDownFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHierarchyId() == null) ? 0 : getHierarchyId().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getDrillDownFilters() == null) ? 0 : getDrillDownFilters().hashCode());
        return hashCode;
    }

    @Override
    public ExplicitHierarchy clone() {
        try {
            return (ExplicitHierarchy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ExplicitHierarchyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
