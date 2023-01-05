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
 * The field well configuration of a line chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LineChartFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineChartFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a line chart.
     * </p>
     */
    private LineChartAggregatedFieldWells lineChartAggregatedFieldWells;

    /**
     * <p>
     * The field well configuration of a line chart.
     * </p>
     * 
     * @param lineChartAggregatedFieldWells
     *        The field well configuration of a line chart.
     */

    public void setLineChartAggregatedFieldWells(LineChartAggregatedFieldWells lineChartAggregatedFieldWells) {
        this.lineChartAggregatedFieldWells = lineChartAggregatedFieldWells;
    }

    /**
     * <p>
     * The field well configuration of a line chart.
     * </p>
     * 
     * @return The field well configuration of a line chart.
     */

    public LineChartAggregatedFieldWells getLineChartAggregatedFieldWells() {
        return this.lineChartAggregatedFieldWells;
    }

    /**
     * <p>
     * The field well configuration of a line chart.
     * </p>
     * 
     * @param lineChartAggregatedFieldWells
     *        The field well configuration of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineChartFieldWells withLineChartAggregatedFieldWells(LineChartAggregatedFieldWells lineChartAggregatedFieldWells) {
        setLineChartAggregatedFieldWells(lineChartAggregatedFieldWells);
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
        if (getLineChartAggregatedFieldWells() != null)
            sb.append("LineChartAggregatedFieldWells: ").append(getLineChartAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineChartFieldWells == false)
            return false;
        LineChartFieldWells other = (LineChartFieldWells) obj;
        if (other.getLineChartAggregatedFieldWells() == null ^ this.getLineChartAggregatedFieldWells() == null)
            return false;
        if (other.getLineChartAggregatedFieldWells() != null
                && other.getLineChartAggregatedFieldWells().equals(this.getLineChartAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineChartAggregatedFieldWells() == null) ? 0 : getLineChartAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public LineChartFieldWells clone() {
        try {
            return (LineChartFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LineChartFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
