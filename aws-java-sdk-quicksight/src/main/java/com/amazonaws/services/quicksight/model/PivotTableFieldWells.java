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
 * The field wells for a pivot table visual.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableFieldWells" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field well for the pivot table.
     * </p>
     */
    private PivotTableAggregatedFieldWells pivotTableAggregatedFieldWells;

    /**
     * <p>
     * The aggregated field well for the pivot table.
     * </p>
     * 
     * @param pivotTableAggregatedFieldWells
     *        The aggregated field well for the pivot table.
     */

    public void setPivotTableAggregatedFieldWells(PivotTableAggregatedFieldWells pivotTableAggregatedFieldWells) {
        this.pivotTableAggregatedFieldWells = pivotTableAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field well for the pivot table.
     * </p>
     * 
     * @return The aggregated field well for the pivot table.
     */

    public PivotTableAggregatedFieldWells getPivotTableAggregatedFieldWells() {
        return this.pivotTableAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field well for the pivot table.
     * </p>
     * 
     * @param pivotTableAggregatedFieldWells
     *        The aggregated field well for the pivot table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldWells withPivotTableAggregatedFieldWells(PivotTableAggregatedFieldWells pivotTableAggregatedFieldWells) {
        setPivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells);
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
        if (getPivotTableAggregatedFieldWells() != null)
            sb.append("PivotTableAggregatedFieldWells: ").append(getPivotTableAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableFieldWells == false)
            return false;
        PivotTableFieldWells other = (PivotTableFieldWells) obj;
        if (other.getPivotTableAggregatedFieldWells() == null ^ this.getPivotTableAggregatedFieldWells() == null)
            return false;
        if (other.getPivotTableAggregatedFieldWells() != null
                && other.getPivotTableAggregatedFieldWells().equals(this.getPivotTableAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPivotTableAggregatedFieldWells() == null) ? 0 : getPivotTableAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableFieldWells clone() {
        try {
            return (PivotTableFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
