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
 * The field wells of a <code>BoxPlotVisual</code>.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BoxPlotFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BoxPlotFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field wells of a box plot.
     * </p>
     */
    private BoxPlotAggregatedFieldWells boxPlotAggregatedFieldWells;

    /**
     * <p>
     * The aggregated field wells of a box plot.
     * </p>
     * 
     * @param boxPlotAggregatedFieldWells
     *        The aggregated field wells of a box plot.
     */

    public void setBoxPlotAggregatedFieldWells(BoxPlotAggregatedFieldWells boxPlotAggregatedFieldWells) {
        this.boxPlotAggregatedFieldWells = boxPlotAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a box plot.
     * </p>
     * 
     * @return The aggregated field wells of a box plot.
     */

    public BoxPlotAggregatedFieldWells getBoxPlotAggregatedFieldWells() {
        return this.boxPlotAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a box plot.
     * </p>
     * 
     * @param boxPlotAggregatedFieldWells
     *        The aggregated field wells of a box plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotFieldWells withBoxPlotAggregatedFieldWells(BoxPlotAggregatedFieldWells boxPlotAggregatedFieldWells) {
        setBoxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells);
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
        if (getBoxPlotAggregatedFieldWells() != null)
            sb.append("BoxPlotAggregatedFieldWells: ").append(getBoxPlotAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BoxPlotFieldWells == false)
            return false;
        BoxPlotFieldWells other = (BoxPlotFieldWells) obj;
        if (other.getBoxPlotAggregatedFieldWells() == null ^ this.getBoxPlotAggregatedFieldWells() == null)
            return false;
        if (other.getBoxPlotAggregatedFieldWells() != null && other.getBoxPlotAggregatedFieldWells().equals(this.getBoxPlotAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoxPlotAggregatedFieldWells() == null) ? 0 : getBoxPlotAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public BoxPlotFieldWells clone() {
        try {
            return (BoxPlotFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BoxPlotFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
