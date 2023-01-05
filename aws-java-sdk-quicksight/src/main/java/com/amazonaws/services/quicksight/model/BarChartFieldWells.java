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
 * The field wells of a <code>BarChartVisual</code>.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BarChartFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BarChartFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field wells of a bar chart.
     * </p>
     */
    private BarChartAggregatedFieldWells barChartAggregatedFieldWells;

    /**
     * <p>
     * The aggregated field wells of a bar chart.
     * </p>
     * 
     * @param barChartAggregatedFieldWells
     *        The aggregated field wells of a bar chart.
     */

    public void setBarChartAggregatedFieldWells(BarChartAggregatedFieldWells barChartAggregatedFieldWells) {
        this.barChartAggregatedFieldWells = barChartAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a bar chart.
     * </p>
     * 
     * @return The aggregated field wells of a bar chart.
     */

    public BarChartAggregatedFieldWells getBarChartAggregatedFieldWells() {
        return this.barChartAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a bar chart.
     * </p>
     * 
     * @param barChartAggregatedFieldWells
     *        The aggregated field wells of a bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartFieldWells withBarChartAggregatedFieldWells(BarChartAggregatedFieldWells barChartAggregatedFieldWells) {
        setBarChartAggregatedFieldWells(barChartAggregatedFieldWells);
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
        if (getBarChartAggregatedFieldWells() != null)
            sb.append("BarChartAggregatedFieldWells: ").append(getBarChartAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BarChartFieldWells == false)
            return false;
        BarChartFieldWells other = (BarChartFieldWells) obj;
        if (other.getBarChartAggregatedFieldWells() == null ^ this.getBarChartAggregatedFieldWells() == null)
            return false;
        if (other.getBarChartAggregatedFieldWells() != null && other.getBarChartAggregatedFieldWells().equals(this.getBarChartAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBarChartAggregatedFieldWells() == null) ? 0 : getBarChartAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public BarChartFieldWells clone() {
        try {
            return (BarChartFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BarChartFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
