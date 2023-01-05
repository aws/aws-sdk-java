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
 * The series axis configuration of a line chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LineSeriesAxisDisplayOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineSeriesAxisDisplayOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the presentation of the line series axis.
     * </p>
     */
    private AxisDisplayOptions axisOptions;
    /**
     * <p>
     * The configuration options that determine how missing data is treated during the rendering of a line chart.
     * </p>
     */
    private java.util.List<MissingDataConfiguration> missingDataConfigurations;

    /**
     * <p>
     * The options that determine the presentation of the line series axis.
     * </p>
     * 
     * @param axisOptions
     *        The options that determine the presentation of the line series axis.
     */

    public void setAxisOptions(AxisDisplayOptions axisOptions) {
        this.axisOptions = axisOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the line series axis.
     * </p>
     * 
     * @return The options that determine the presentation of the line series axis.
     */

    public AxisDisplayOptions getAxisOptions() {
        return this.axisOptions;
    }

    /**
     * <p>
     * The options that determine the presentation of the line series axis.
     * </p>
     * 
     * @param axisOptions
     *        The options that determine the presentation of the line series axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineSeriesAxisDisplayOptions withAxisOptions(AxisDisplayOptions axisOptions) {
        setAxisOptions(axisOptions);
        return this;
    }

    /**
     * <p>
     * The configuration options that determine how missing data is treated during the rendering of a line chart.
     * </p>
     * 
     * @return The configuration options that determine how missing data is treated during the rendering of a line
     *         chart.
     */

    public java.util.List<MissingDataConfiguration> getMissingDataConfigurations() {
        return missingDataConfigurations;
    }

    /**
     * <p>
     * The configuration options that determine how missing data is treated during the rendering of a line chart.
     * </p>
     * 
     * @param missingDataConfigurations
     *        The configuration options that determine how missing data is treated during the rendering of a line chart.
     */

    public void setMissingDataConfigurations(java.util.Collection<MissingDataConfiguration> missingDataConfigurations) {
        if (missingDataConfigurations == null) {
            this.missingDataConfigurations = null;
            return;
        }

        this.missingDataConfigurations = new java.util.ArrayList<MissingDataConfiguration>(missingDataConfigurations);
    }

    /**
     * <p>
     * The configuration options that determine how missing data is treated during the rendering of a line chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMissingDataConfigurations(java.util.Collection)} or
     * {@link #withMissingDataConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param missingDataConfigurations
     *        The configuration options that determine how missing data is treated during the rendering of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineSeriesAxisDisplayOptions withMissingDataConfigurations(MissingDataConfiguration... missingDataConfigurations) {
        if (this.missingDataConfigurations == null) {
            setMissingDataConfigurations(new java.util.ArrayList<MissingDataConfiguration>(missingDataConfigurations.length));
        }
        for (MissingDataConfiguration ele : missingDataConfigurations) {
            this.missingDataConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration options that determine how missing data is treated during the rendering of a line chart.
     * </p>
     * 
     * @param missingDataConfigurations
     *        The configuration options that determine how missing data is treated during the rendering of a line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineSeriesAxisDisplayOptions withMissingDataConfigurations(java.util.Collection<MissingDataConfiguration> missingDataConfigurations) {
        setMissingDataConfigurations(missingDataConfigurations);
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
        if (getAxisOptions() != null)
            sb.append("AxisOptions: ").append(getAxisOptions()).append(",");
        if (getMissingDataConfigurations() != null)
            sb.append("MissingDataConfigurations: ").append(getMissingDataConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineSeriesAxisDisplayOptions == false)
            return false;
        LineSeriesAxisDisplayOptions other = (LineSeriesAxisDisplayOptions) obj;
        if (other.getAxisOptions() == null ^ this.getAxisOptions() == null)
            return false;
        if (other.getAxisOptions() != null && other.getAxisOptions().equals(this.getAxisOptions()) == false)
            return false;
        if (other.getMissingDataConfigurations() == null ^ this.getMissingDataConfigurations() == null)
            return false;
        if (other.getMissingDataConfigurations() != null && other.getMissingDataConfigurations().equals(this.getMissingDataConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAxisOptions() == null) ? 0 : getAxisOptions().hashCode());
        hashCode = prime * hashCode + ((getMissingDataConfigurations() == null) ? 0 : getMissingDataConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public LineSeriesAxisDisplayOptions clone() {
        try {
            return (LineSeriesAxisDisplayOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LineSeriesAxisDisplayOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
