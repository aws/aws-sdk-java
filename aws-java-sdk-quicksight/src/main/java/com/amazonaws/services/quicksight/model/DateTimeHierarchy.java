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
 * The option that determines the hierarchy of any <code>DateTime</code> fields.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DateTimeHierarchy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateTimeHierarchy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hierarchy ID of the <code>DateTime</code> hierarchy.
     * </p>
     */
    private String hierarchyId;
    /**
     * <p>
     * The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
     * </p>
     */
    private java.util.List<DrillDownFilter> drillDownFilters;

    /**
     * <p>
     * The hierarchy ID of the <code>DateTime</code> hierarchy.
     * </p>
     * 
     * @param hierarchyId
     *        The hierarchy ID of the <code>DateTime</code> hierarchy.
     */

    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * <p>
     * The hierarchy ID of the <code>DateTime</code> hierarchy.
     * </p>
     * 
     * @return The hierarchy ID of the <code>DateTime</code> hierarchy.
     */

    public String getHierarchyId() {
        return this.hierarchyId;
    }

    /**
     * <p>
     * The hierarchy ID of the <code>DateTime</code> hierarchy.
     * </p>
     * 
     * @param hierarchyId
     *        The hierarchy ID of the <code>DateTime</code> hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeHierarchy withHierarchyId(String hierarchyId) {
        setHierarchyId(hierarchyId);
        return this;
    }

    /**
     * <p>
     * The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
     * </p>
     * 
     * @return The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
     */

    public java.util.List<DrillDownFilter> getDrillDownFilters() {
        return drillDownFilters;
    }

    /**
     * <p>
     * The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
     * </p>
     * 
     * @param drillDownFilters
     *        The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
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
     * The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDrillDownFilters(java.util.Collection)} or {@link #withDrillDownFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param drillDownFilters
     *        The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeHierarchy withDrillDownFilters(DrillDownFilter... drillDownFilters) {
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
     * The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
     * </p>
     * 
     * @param drillDownFilters
     *        The option that determines the drill down filters for the <code>DateTime</code> hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeHierarchy withDrillDownFilters(java.util.Collection<DrillDownFilter> drillDownFilters) {
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

        if (obj instanceof DateTimeHierarchy == false)
            return false;
        DateTimeHierarchy other = (DateTimeHierarchy) obj;
        if (other.getHierarchyId() == null ^ this.getHierarchyId() == null)
            return false;
        if (other.getHierarchyId() != null && other.getHierarchyId().equals(this.getHierarchyId()) == false)
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
        hashCode = prime * hashCode + ((getDrillDownFilters() == null) ? 0 : getDrillDownFilters().hashCode());
        return hashCode;
    }

    @Override
    public DateTimeHierarchy clone() {
        try {
            return (DateTimeHierarchy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DateTimeHierarchyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
