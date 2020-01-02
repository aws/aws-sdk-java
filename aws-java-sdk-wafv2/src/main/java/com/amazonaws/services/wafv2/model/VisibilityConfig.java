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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * Defines and enables Amazon CloudWatch metrics and web request sample collection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/VisibilityConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisibilityConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can
     * view the sampled requests through the AWS WAF console.
     * </p>
     */
    private Boolean sampledRequestsEnabled;
    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available
     * metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS WAF
     * Metrics</a>.
     * </p>
     */
    private Boolean cloudWatchMetricsEnabled;
    /**
     * <p>
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example
     * "All" and "Default_Action." You can't change a <code>MetricName</code> after you create a
     * <code>VisibilityConfig</code>.
     * </p>
     */
    private String metricName;

    /**
     * <p>
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can
     * view the sampled requests through the AWS WAF console.
     * </p>
     * 
     * @param sampledRequestsEnabled
     *        A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You
     *        can view the sampled requests through the AWS WAF console.
     */

    public void setSampledRequestsEnabled(Boolean sampledRequestsEnabled) {
        this.sampledRequestsEnabled = sampledRequestsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can
     * view the sampled requests through the AWS WAF console.
     * </p>
     * 
     * @return A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules.
     *         You can view the sampled requests through the AWS WAF console.
     */

    public Boolean getSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can
     * view the sampled requests through the AWS WAF console.
     * </p>
     * 
     * @param sampledRequestsEnabled
     *        A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You
     *        can view the sampled requests through the AWS WAF console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisibilityConfig withSampledRequestsEnabled(Boolean sampledRequestsEnabled) {
        setSampledRequestsEnabled(sampledRequestsEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can
     * view the sampled requests through the AWS WAF console.
     * </p>
     * 
     * @return A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules.
     *         You can view the sampled requests through the AWS WAF console.
     */

    public Boolean isSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available
     * metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS WAF
     * Metrics</a>.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of
     *        available metrics, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS
     *        WAF Metrics</a>.
     */

    public void setCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available
     * metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS WAF
     * Metrics</a>.
     * </p>
     * 
     * @return A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of
     *         available metrics, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS
     *         WAF Metrics</a>.
     */

    public Boolean getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available
     * metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS WAF
     * Metrics</a>.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of
     *        available metrics, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS
     *        WAF Metrics</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisibilityConfig withCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        setCloudWatchMetricsEnabled(cloudWatchMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available
     * metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS WAF
     * Metrics</a>.
     * </p>
     * 
     * @return A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of
     *         available metrics, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">AWS
     *         WAF Metrics</a>.
     */

    public Boolean isCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example
     * "All" and "Default_Action." You can't change a <code>MetricName</code> after you create a
     * <code>VisibilityConfig</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z,
     *        0-9), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS
     *        WAF, for example "All" and "Default_Action." You can't change a <code>MetricName</code> after you create a
     *        <code>VisibilityConfig</code>.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example
     * "All" and "Default_Action." You can't change a <code>MetricName</code> after you create a
     * <code>VisibilityConfig</code>.
     * </p>
     * 
     * @return A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z,
     *         0-9), with length from one to 128 characters. It can't contain whitespace or metric names reserved for
     *         AWS WAF, for example "All" and "Default_Action." You can't change a <code>MetricName</code> after you
     *         create a <code>VisibilityConfig</code>.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example
     * "All" and "Default_Action." You can't change a <code>MetricName</code> after you create a
     * <code>VisibilityConfig</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z,
     *        0-9), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS
     *        WAF, for example "All" and "Default_Action." You can't change a <code>MetricName</code> after you create a
     *        <code>VisibilityConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisibilityConfig withMetricName(String metricName) {
        setMetricName(metricName);
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
        if (getSampledRequestsEnabled() != null)
            sb.append("SampledRequestsEnabled: ").append(getSampledRequestsEnabled()).append(",");
        if (getCloudWatchMetricsEnabled() != null)
            sb.append("CloudWatchMetricsEnabled: ").append(getCloudWatchMetricsEnabled()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VisibilityConfig == false)
            return false;
        VisibilityConfig other = (VisibilityConfig) obj;
        if (other.getSampledRequestsEnabled() == null ^ this.getSampledRequestsEnabled() == null)
            return false;
        if (other.getSampledRequestsEnabled() != null && other.getSampledRequestsEnabled().equals(this.getSampledRequestsEnabled()) == false)
            return false;
        if (other.getCloudWatchMetricsEnabled() == null ^ this.getCloudWatchMetricsEnabled() == null)
            return false;
        if (other.getCloudWatchMetricsEnabled() != null && other.getCloudWatchMetricsEnabled().equals(this.getCloudWatchMetricsEnabled()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSampledRequestsEnabled() == null) ? 0 : getSampledRequestsEnabled().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchMetricsEnabled() == null) ? 0 : getCloudWatchMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public VisibilityConfig clone() {
        try {
            return (VisibilityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.VisibilityConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
