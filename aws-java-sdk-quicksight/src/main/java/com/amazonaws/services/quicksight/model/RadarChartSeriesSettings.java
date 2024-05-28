/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The series settings of a radar chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RadarChartSeriesSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RadarChartSeriesSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The area style settings of a radar chart.
     * </p>
     */
    private RadarChartAreaStyleSettings areaStyleSettings;

    /**
     * <p>
     * The area style settings of a radar chart.
     * </p>
     * 
     * @param areaStyleSettings
     *        The area style settings of a radar chart.
     */

    public void setAreaStyleSettings(RadarChartAreaStyleSettings areaStyleSettings) {
        this.areaStyleSettings = areaStyleSettings;
    }

    /**
     * <p>
     * The area style settings of a radar chart.
     * </p>
     * 
     * @return The area style settings of a radar chart.
     */

    public RadarChartAreaStyleSettings getAreaStyleSettings() {
        return this.areaStyleSettings;
    }

    /**
     * <p>
     * The area style settings of a radar chart.
     * </p>
     * 
     * @param areaStyleSettings
     *        The area style settings of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartSeriesSettings withAreaStyleSettings(RadarChartAreaStyleSettings areaStyleSettings) {
        setAreaStyleSettings(areaStyleSettings);
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
        if (getAreaStyleSettings() != null)
            sb.append("AreaStyleSettings: ").append(getAreaStyleSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RadarChartSeriesSettings == false)
            return false;
        RadarChartSeriesSettings other = (RadarChartSeriesSettings) obj;
        if (other.getAreaStyleSettings() == null ^ this.getAreaStyleSettings() == null)
            return false;
        if (other.getAreaStyleSettings() != null && other.getAreaStyleSettings().equals(this.getAreaStyleSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAreaStyleSettings() == null) ? 0 : getAreaStyleSettings().hashCode());
        return hashCode;
    }

    @Override
    public RadarChartSeriesSettings clone() {
        try {
            return (RadarChartSeriesSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RadarChartSeriesSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
