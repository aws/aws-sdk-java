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
 * The field well configuration of a heat map.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HeatMapFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeatMapFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field wells of a heat map.
     * </p>
     */
    private HeatMapAggregatedFieldWells heatMapAggregatedFieldWells;

    /**
     * <p>
     * The aggregated field wells of a heat map.
     * </p>
     * 
     * @param heatMapAggregatedFieldWells
     *        The aggregated field wells of a heat map.
     */

    public void setHeatMapAggregatedFieldWells(HeatMapAggregatedFieldWells heatMapAggregatedFieldWells) {
        this.heatMapAggregatedFieldWells = heatMapAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a heat map.
     * </p>
     * 
     * @return The aggregated field wells of a heat map.
     */

    public HeatMapAggregatedFieldWells getHeatMapAggregatedFieldWells() {
        return this.heatMapAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a heat map.
     * </p>
     * 
     * @param heatMapAggregatedFieldWells
     *        The aggregated field wells of a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapFieldWells withHeatMapAggregatedFieldWells(HeatMapAggregatedFieldWells heatMapAggregatedFieldWells) {
        setHeatMapAggregatedFieldWells(heatMapAggregatedFieldWells);
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
        if (getHeatMapAggregatedFieldWells() != null)
            sb.append("HeatMapAggregatedFieldWells: ").append(getHeatMapAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeatMapFieldWells == false)
            return false;
        HeatMapFieldWells other = (HeatMapFieldWells) obj;
        if (other.getHeatMapAggregatedFieldWells() == null ^ this.getHeatMapAggregatedFieldWells() == null)
            return false;
        if (other.getHeatMapAggregatedFieldWells() != null && other.getHeatMapAggregatedFieldWells().equals(this.getHeatMapAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeatMapAggregatedFieldWells() == null) ? 0 : getHeatMapAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public HeatMapFieldWells clone() {
        try {
            return (HeatMapFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HeatMapFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
