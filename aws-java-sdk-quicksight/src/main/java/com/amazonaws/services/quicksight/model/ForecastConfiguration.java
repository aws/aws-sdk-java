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
 * The forecast configuration that is used in a line chart's display properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ForecastConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForecastConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The forecast properties setup of a forecast in the line chart.
     * </p>
     */
    private TimeBasedForecastProperties forecastProperties;
    /**
     * <p>
     * The forecast scenario of a forecast in the line chart.
     * </p>
     */
    private ForecastScenario scenario;

    /**
     * <p>
     * The forecast properties setup of a forecast in the line chart.
     * </p>
     * 
     * @param forecastProperties
     *        The forecast properties setup of a forecast in the line chart.
     */

    public void setForecastProperties(TimeBasedForecastProperties forecastProperties) {
        this.forecastProperties = forecastProperties;
    }

    /**
     * <p>
     * The forecast properties setup of a forecast in the line chart.
     * </p>
     * 
     * @return The forecast properties setup of a forecast in the line chart.
     */

    public TimeBasedForecastProperties getForecastProperties() {
        return this.forecastProperties;
    }

    /**
     * <p>
     * The forecast properties setup of a forecast in the line chart.
     * </p>
     * 
     * @param forecastProperties
     *        The forecast properties setup of a forecast in the line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastConfiguration withForecastProperties(TimeBasedForecastProperties forecastProperties) {
        setForecastProperties(forecastProperties);
        return this;
    }

    /**
     * <p>
     * The forecast scenario of a forecast in the line chart.
     * </p>
     * 
     * @param scenario
     *        The forecast scenario of a forecast in the line chart.
     */

    public void setScenario(ForecastScenario scenario) {
        this.scenario = scenario;
    }

    /**
     * <p>
     * The forecast scenario of a forecast in the line chart.
     * </p>
     * 
     * @return The forecast scenario of a forecast in the line chart.
     */

    public ForecastScenario getScenario() {
        return this.scenario;
    }

    /**
     * <p>
     * The forecast scenario of a forecast in the line chart.
     * </p>
     * 
     * @param scenario
     *        The forecast scenario of a forecast in the line chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForecastConfiguration withScenario(ForecastScenario scenario) {
        setScenario(scenario);
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
        if (getForecastProperties() != null)
            sb.append("ForecastProperties: ").append(getForecastProperties()).append(",");
        if (getScenario() != null)
            sb.append("Scenario: ").append(getScenario());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastConfiguration == false)
            return false;
        ForecastConfiguration other = (ForecastConfiguration) obj;
        if (other.getForecastProperties() == null ^ this.getForecastProperties() == null)
            return false;
        if (other.getForecastProperties() != null && other.getForecastProperties().equals(this.getForecastProperties()) == false)
            return false;
        if (other.getScenario() == null ^ this.getScenario() == null)
            return false;
        if (other.getScenario() != null && other.getScenario().equals(this.getScenario()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForecastProperties() == null) ? 0 : getForecastProperties().hashCode());
        hashCode = prime * hashCode + ((getScenario() == null) ? 0 : getScenario().hashCode());
        return hashCode;
    }

    @Override
    public ForecastConfiguration clone() {
        try {
            return (ForecastConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ForecastConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
