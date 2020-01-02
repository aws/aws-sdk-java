/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that specifies whether cloud metrics are collected in a deployment and, if so, what role is used to collect
 * metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/MetricsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean that specifies whether cloud metrics are collected.
     * </p>
     */
    private Boolean cloudMetricEnabled;
    /**
     * <p>
     * The ARN of the role that is used to collect cloud metrics.
     * </p>
     */
    private String metricRuleRoleArn;

    /**
     * <p>
     * A Boolean that specifies whether cloud metrics are collected.
     * </p>
     * 
     * @param cloudMetricEnabled
     *        A Boolean that specifies whether cloud metrics are collected.
     */

    public void setCloudMetricEnabled(Boolean cloudMetricEnabled) {
        this.cloudMetricEnabled = cloudMetricEnabled;
    }

    /**
     * <p>
     * A Boolean that specifies whether cloud metrics are collected.
     * </p>
     * 
     * @return A Boolean that specifies whether cloud metrics are collected.
     */

    public Boolean getCloudMetricEnabled() {
        return this.cloudMetricEnabled;
    }

    /**
     * <p>
     * A Boolean that specifies whether cloud metrics are collected.
     * </p>
     * 
     * @param cloudMetricEnabled
     *        A Boolean that specifies whether cloud metrics are collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsConfiguration withCloudMetricEnabled(Boolean cloudMetricEnabled) {
        setCloudMetricEnabled(cloudMetricEnabled);
        return this;
    }

    /**
     * <p>
     * A Boolean that specifies whether cloud metrics are collected.
     * </p>
     * 
     * @return A Boolean that specifies whether cloud metrics are collected.
     */

    public Boolean isCloudMetricEnabled() {
        return this.cloudMetricEnabled;
    }

    /**
     * <p>
     * The ARN of the role that is used to collect cloud metrics.
     * </p>
     * 
     * @param metricRuleRoleArn
     *        The ARN of the role that is used to collect cloud metrics.
     */

    public void setMetricRuleRoleArn(String metricRuleRoleArn) {
        this.metricRuleRoleArn = metricRuleRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that is used to collect cloud metrics.
     * </p>
     * 
     * @return The ARN of the role that is used to collect cloud metrics.
     */

    public String getMetricRuleRoleArn() {
        return this.metricRuleRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that is used to collect cloud metrics.
     * </p>
     * 
     * @param metricRuleRoleArn
     *        The ARN of the role that is used to collect cloud metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsConfiguration withMetricRuleRoleArn(String metricRuleRoleArn) {
        setMetricRuleRoleArn(metricRuleRoleArn);
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
        if (getCloudMetricEnabled() != null)
            sb.append("CloudMetricEnabled: ").append(getCloudMetricEnabled()).append(",");
        if (getMetricRuleRoleArn() != null)
            sb.append("MetricRuleRoleArn: ").append(getMetricRuleRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricsConfiguration == false)
            return false;
        MetricsConfiguration other = (MetricsConfiguration) obj;
        if (other.getCloudMetricEnabled() == null ^ this.getCloudMetricEnabled() == null)
            return false;
        if (other.getCloudMetricEnabled() != null && other.getCloudMetricEnabled().equals(this.getCloudMetricEnabled()) == false)
            return false;
        if (other.getMetricRuleRoleArn() == null ^ this.getMetricRuleRoleArn() == null)
            return false;
        if (other.getMetricRuleRoleArn() != null && other.getMetricRuleRoleArn().equals(this.getMetricRuleRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudMetricEnabled() == null) ? 0 : getCloudMetricEnabled().hashCode());
        hashCode = prime * hashCode + ((getMetricRuleRoleArn() == null) ? 0 : getMetricRuleRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public MetricsConfiguration clone() {
        try {
            return (MetricsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.MetricsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
