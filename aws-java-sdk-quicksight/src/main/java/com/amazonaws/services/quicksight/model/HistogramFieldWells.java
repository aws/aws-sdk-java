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
 * The field well configuration of a histogram.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HistogramFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistogramFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field well configuration of a histogram.
     * </p>
     */
    private HistogramAggregatedFieldWells histogramAggregatedFieldWells;

    /**
     * <p>
     * The field well configuration of a histogram.
     * </p>
     * 
     * @param histogramAggregatedFieldWells
     *        The field well configuration of a histogram.
     */

    public void setHistogramAggregatedFieldWells(HistogramAggregatedFieldWells histogramAggregatedFieldWells) {
        this.histogramAggregatedFieldWells = histogramAggregatedFieldWells;
    }

    /**
     * <p>
     * The field well configuration of a histogram.
     * </p>
     * 
     * @return The field well configuration of a histogram.
     */

    public HistogramAggregatedFieldWells getHistogramAggregatedFieldWells() {
        return this.histogramAggregatedFieldWells;
    }

    /**
     * <p>
     * The field well configuration of a histogram.
     * </p>
     * 
     * @param histogramAggregatedFieldWells
     *        The field well configuration of a histogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramFieldWells withHistogramAggregatedFieldWells(HistogramAggregatedFieldWells histogramAggregatedFieldWells) {
        setHistogramAggregatedFieldWells(histogramAggregatedFieldWells);
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
        if (getHistogramAggregatedFieldWells() != null)
            sb.append("HistogramAggregatedFieldWells: ").append(getHistogramAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistogramFieldWells == false)
            return false;
        HistogramFieldWells other = (HistogramFieldWells) obj;
        if (other.getHistogramAggregatedFieldWells() == null ^ this.getHistogramAggregatedFieldWells() == null)
            return false;
        if (other.getHistogramAggregatedFieldWells() != null
                && other.getHistogramAggregatedFieldWells().equals(this.getHistogramAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHistogramAggregatedFieldWells() == null) ? 0 : getHistogramAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public HistogramFieldWells clone() {
        try {
            return (HistogramFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HistogramFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
