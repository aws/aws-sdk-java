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
 * The field well configuration of a scatter plot.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ScatterPlotFieldWells" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScatterPlotFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field wells of a scatter plot. Scatter plots that have a field in the category (group/color) field
     * will have aggregated field wells. The x and y-axes of these scatter plots are aggregated by category.
     * </p>
     */
    private ScatterPlotCategoricallyAggregatedFieldWells scatterPlotCategoricallyAggregatedFieldWells;
    /**
     * <p>
     * The unaggregated field wells of a scatter plot. Scatter plots without a category field well have unaggregated
     * field wells. The x and y-axes of these scatter plots are unaggregated.
     * </p>
     */
    private ScatterPlotUnaggregatedFieldWells scatterPlotUnaggregatedFieldWells;

    /**
     * <p>
     * The aggregated field wells of a scatter plot. Scatter plots that have a field in the category (group/color) field
     * will have aggregated field wells. The x and y-axes of these scatter plots are aggregated by category.
     * </p>
     * 
     * @param scatterPlotCategoricallyAggregatedFieldWells
     *        The aggregated field wells of a scatter plot. Scatter plots that have a field in the category
     *        (group/color) field will have aggregated field wells. The x and y-axes of these scatter plots are
     *        aggregated by category.
     */

    public void setScatterPlotCategoricallyAggregatedFieldWells(ScatterPlotCategoricallyAggregatedFieldWells scatterPlotCategoricallyAggregatedFieldWells) {
        this.scatterPlotCategoricallyAggregatedFieldWells = scatterPlotCategoricallyAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a scatter plot. Scatter plots that have a field in the category (group/color) field
     * will have aggregated field wells. The x and y-axes of these scatter plots are aggregated by category.
     * </p>
     * 
     * @return The aggregated field wells of a scatter plot. Scatter plots that have a field in the category
     *         (group/color) field will have aggregated field wells. The x and y-axes of these scatter plots are
     *         aggregated by category.
     */

    public ScatterPlotCategoricallyAggregatedFieldWells getScatterPlotCategoricallyAggregatedFieldWells() {
        return this.scatterPlotCategoricallyAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a scatter plot. Scatter plots that have a field in the category (group/color) field
     * will have aggregated field wells. The x and y-axes of these scatter plots are aggregated by category.
     * </p>
     * 
     * @param scatterPlotCategoricallyAggregatedFieldWells
     *        The aggregated field wells of a scatter plot. Scatter plots that have a field in the category
     *        (group/color) field will have aggregated field wells. The x and y-axes of these scatter plots are
     *        aggregated by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotFieldWells withScatterPlotCategoricallyAggregatedFieldWells(
            ScatterPlotCategoricallyAggregatedFieldWells scatterPlotCategoricallyAggregatedFieldWells) {
        setScatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells);
        return this;
    }

    /**
     * <p>
     * The unaggregated field wells of a scatter plot. Scatter plots without a category field well have unaggregated
     * field wells. The x and y-axes of these scatter plots are unaggregated.
     * </p>
     * 
     * @param scatterPlotUnaggregatedFieldWells
     *        The unaggregated field wells of a scatter plot. Scatter plots without a category field well have
     *        unaggregated field wells. The x and y-axes of these scatter plots are unaggregated.
     */

    public void setScatterPlotUnaggregatedFieldWells(ScatterPlotUnaggregatedFieldWells scatterPlotUnaggregatedFieldWells) {
        this.scatterPlotUnaggregatedFieldWells = scatterPlotUnaggregatedFieldWells;
    }

    /**
     * <p>
     * The unaggregated field wells of a scatter plot. Scatter plots without a category field well have unaggregated
     * field wells. The x and y-axes of these scatter plots are unaggregated.
     * </p>
     * 
     * @return The unaggregated field wells of a scatter plot. Scatter plots without a category field well have
     *         unaggregated field wells. The x and y-axes of these scatter plots are unaggregated.
     */

    public ScatterPlotUnaggregatedFieldWells getScatterPlotUnaggregatedFieldWells() {
        return this.scatterPlotUnaggregatedFieldWells;
    }

    /**
     * <p>
     * The unaggregated field wells of a scatter plot. Scatter plots without a category field well have unaggregated
     * field wells. The x and y-axes of these scatter plots are unaggregated.
     * </p>
     * 
     * @param scatterPlotUnaggregatedFieldWells
     *        The unaggregated field wells of a scatter plot. Scatter plots without a category field well have
     *        unaggregated field wells. The x and y-axes of these scatter plots are unaggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotFieldWells withScatterPlotUnaggregatedFieldWells(ScatterPlotUnaggregatedFieldWells scatterPlotUnaggregatedFieldWells) {
        setScatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells);
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
        if (getScatterPlotCategoricallyAggregatedFieldWells() != null)
            sb.append("ScatterPlotCategoricallyAggregatedFieldWells: ").append(getScatterPlotCategoricallyAggregatedFieldWells()).append(",");
        if (getScatterPlotUnaggregatedFieldWells() != null)
            sb.append("ScatterPlotUnaggregatedFieldWells: ").append(getScatterPlotUnaggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScatterPlotFieldWells == false)
            return false;
        ScatterPlotFieldWells other = (ScatterPlotFieldWells) obj;
        if (other.getScatterPlotCategoricallyAggregatedFieldWells() == null ^ this.getScatterPlotCategoricallyAggregatedFieldWells() == null)
            return false;
        if (other.getScatterPlotCategoricallyAggregatedFieldWells() != null
                && other.getScatterPlotCategoricallyAggregatedFieldWells().equals(this.getScatterPlotCategoricallyAggregatedFieldWells()) == false)
            return false;
        if (other.getScatterPlotUnaggregatedFieldWells() == null ^ this.getScatterPlotUnaggregatedFieldWells() == null)
            return false;
        if (other.getScatterPlotUnaggregatedFieldWells() != null
                && other.getScatterPlotUnaggregatedFieldWells().equals(this.getScatterPlotUnaggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScatterPlotCategoricallyAggregatedFieldWells() == null) ? 0 : getScatterPlotCategoricallyAggregatedFieldWells().hashCode());
        hashCode = prime * hashCode + ((getScatterPlotUnaggregatedFieldWells() == null) ? 0 : getScatterPlotUnaggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public ScatterPlotFieldWells clone() {
        try {
            return (ScatterPlotFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ScatterPlotFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
