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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A transform operation that projects columns. Operations that come after a projection can only refer to projected
 * columns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ProjectOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Projected columns.
     * </p>
     */
    private java.util.List<String> projectedColumns;

    /**
     * <p>
     * Projected columns.
     * </p>
     * 
     * @return Projected columns.
     */

    public java.util.List<String> getProjectedColumns() {
        return projectedColumns;
    }

    /**
     * <p>
     * Projected columns.
     * </p>
     * 
     * @param projectedColumns
     *        Projected columns.
     */

    public void setProjectedColumns(java.util.Collection<String> projectedColumns) {
        if (projectedColumns == null) {
            this.projectedColumns = null;
            return;
        }

        this.projectedColumns = new java.util.ArrayList<String>(projectedColumns);
    }

    /**
     * <p>
     * Projected columns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedColumns(java.util.Collection)} or {@link #withProjectedColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param projectedColumns
     *        Projected columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectOperation withProjectedColumns(String... projectedColumns) {
        if (this.projectedColumns == null) {
            setProjectedColumns(new java.util.ArrayList<String>(projectedColumns.length));
        }
        for (String ele : projectedColumns) {
            this.projectedColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Projected columns.
     * </p>
     * 
     * @param projectedColumns
     *        Projected columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectOperation withProjectedColumns(java.util.Collection<String> projectedColumns) {
        setProjectedColumns(projectedColumns);
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
        if (getProjectedColumns() != null)
            sb.append("ProjectedColumns: ").append(getProjectedColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectOperation == false)
            return false;
        ProjectOperation other = (ProjectOperation) obj;
        if (other.getProjectedColumns() == null ^ this.getProjectedColumns() == null)
            return false;
        if (other.getProjectedColumns() != null && other.getProjectedColumns().equals(this.getProjectedColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectedColumns() == null) ? 0 : getProjectedColumns().hashCode());
        return hashCode;
    }

    @Override
    public ProjectOperation clone() {
        try {
            return (ProjectOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ProjectOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
