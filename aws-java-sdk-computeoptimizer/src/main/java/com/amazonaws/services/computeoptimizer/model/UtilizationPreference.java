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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The preference to control the resource’s CPU utilization thresholds - threshold and headroom.
 * </p>
 * <note>
 * <p>
 * This preference is only available for the Amazon EC2 instance resource type.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/UtilizationPreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtilizationPreference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource utilization metric name to customize.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The parameters to set when customizing the resource utilization thresholds.
     * </p>
     */
    private CustomizableMetricParameters metricParameters;

    /**
     * <p>
     * The name of the resource utilization metric name to customize.
     * </p>
     * 
     * @param metricName
     *        The name of the resource utilization metric name to customize.
     * @see CustomizableMetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the resource utilization metric name to customize.
     * </p>
     * 
     * @return The name of the resource utilization metric name to customize.
     * @see CustomizableMetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the resource utilization metric name to customize.
     * </p>
     * 
     * @param metricName
     *        The name of the resource utilization metric name to customize.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizableMetricName
     */

    public UtilizationPreference withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the resource utilization metric name to customize.
     * </p>
     * 
     * @param metricName
     *        The name of the resource utilization metric name to customize.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizableMetricName
     */

    public UtilizationPreference withMetricName(CustomizableMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The parameters to set when customizing the resource utilization thresholds.
     * </p>
     * 
     * @param metricParameters
     *        The parameters to set when customizing the resource utilization thresholds.
     */

    public void setMetricParameters(CustomizableMetricParameters metricParameters) {
        this.metricParameters = metricParameters;
    }

    /**
     * <p>
     * The parameters to set when customizing the resource utilization thresholds.
     * </p>
     * 
     * @return The parameters to set when customizing the resource utilization thresholds.
     */

    public CustomizableMetricParameters getMetricParameters() {
        return this.metricParameters;
    }

    /**
     * <p>
     * The parameters to set when customizing the resource utilization thresholds.
     * </p>
     * 
     * @param metricParameters
     *        The parameters to set when customizing the resource utilization thresholds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtilizationPreference withMetricParameters(CustomizableMetricParameters metricParameters) {
        setMetricParameters(metricParameters);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMetricParameters() != null)
            sb.append("MetricParameters: ").append(getMetricParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtilizationPreference == false)
            return false;
        UtilizationPreference other = (UtilizationPreference) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricParameters() == null ^ this.getMetricParameters() == null)
            return false;
        if (other.getMetricParameters() != null && other.getMetricParameters().equals(this.getMetricParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricParameters() == null) ? 0 : getMetricParameters().hashCode());
        return hashCode;
    }

    @Override
    public UtilizationPreference clone() {
        try {
            return (UtilizationPreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.UtilizationPreferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
