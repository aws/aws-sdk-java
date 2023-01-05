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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines and enables Amazon CloudWatch metrics and web request sample collection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2VisibilityConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2VisibilityConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     * available metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF metrics
     * and dimensions</a> in the <i>WAF Developer Guide</i>.
     * </p>
     */
    private Boolean cloudWatchMetricsEnabled;
    /**
     * <p>
     * A name of the Amazon CloudWatch metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can view
     * the sampled requests through the WAF console.
     * </p>
     */
    private Boolean sampledRequestsEnabled;

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     * available metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF metrics
     * and dimensions</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     *        available metrics, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF
     *        metrics and dimensions</a> in the <i>WAF Developer Guide</i>.
     */

    public void setCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     * available metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF metrics
     * and dimensions</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @return A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     *         available metrics, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF
     *         metrics and dimensions</a> in the <i>WAF Developer Guide</i>.
     */

    public Boolean getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     * available metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF metrics
     * and dimensions</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param cloudWatchMetricsEnabled
     *        A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     *        available metrics, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF
     *        metrics and dimensions</a> in the <i>WAF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2VisibilityConfigDetails withCloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
        setCloudWatchMetricsEnabled(cloudWatchMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     * available metrics, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF metrics
     * and dimensions</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @return A boolean indicating whether the associated resource sends metrics to Amazon CloudWatch. For the list of
     *         available metrics, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics">WAF
     *         metrics and dimensions</a> in the <i>WAF Developer Guide</i>.
     */

    public Boolean isCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }

    /**
     * <p>
     * A name of the Amazon CloudWatch metric.
     * </p>
     * 
     * @param metricName
     *        A name of the Amazon CloudWatch metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A name of the Amazon CloudWatch metric.
     * </p>
     * 
     * @return A name of the Amazon CloudWatch metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * A name of the Amazon CloudWatch metric.
     * </p>
     * 
     * @param metricName
     *        A name of the Amazon CloudWatch metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2VisibilityConfigDetails withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can view
     * the sampled requests through the WAF console.
     * </p>
     * 
     * @param sampledRequestsEnabled
     *        A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can
     *        view the sampled requests through the WAF console.
     */

    public void setSampledRequestsEnabled(Boolean sampledRequestsEnabled) {
        this.sampledRequestsEnabled = sampledRequestsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can view
     * the sampled requests through the WAF console.
     * </p>
     * 
     * @return A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You
     *         can view the sampled requests through the WAF console.
     */

    public Boolean getSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    /**
     * <p>
     * A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can view
     * the sampled requests through the WAF console.
     * </p>
     * 
     * @param sampledRequestsEnabled
     *        A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can
     *        view the sampled requests through the WAF console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2VisibilityConfigDetails withSampledRequestsEnabled(Boolean sampledRequestsEnabled) {
        setSampledRequestsEnabled(sampledRequestsEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You can view
     * the sampled requests through the WAF console.
     * </p>
     * 
     * @return A boolean indicating whether WAF should store a sampling of the web requests that match the rules. You
     *         can view the sampled requests through the WAF console.
     */

    public Boolean isSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
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
        if (getCloudWatchMetricsEnabled() != null)
            sb.append("CloudWatchMetricsEnabled: ").append(getCloudWatchMetricsEnabled()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getSampledRequestsEnabled() != null)
            sb.append("SampledRequestsEnabled: ").append(getSampledRequestsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafv2VisibilityConfigDetails == false)
            return false;
        AwsWafv2VisibilityConfigDetails other = (AwsWafv2VisibilityConfigDetails) obj;
        if (other.getCloudWatchMetricsEnabled() == null ^ this.getCloudWatchMetricsEnabled() == null)
            return false;
        if (other.getCloudWatchMetricsEnabled() != null && other.getCloudWatchMetricsEnabled().equals(this.getCloudWatchMetricsEnabled()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getSampledRequestsEnabled() == null ^ this.getSampledRequestsEnabled() == null)
            return false;
        if (other.getSampledRequestsEnabled() != null && other.getSampledRequestsEnabled().equals(this.getSampledRequestsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchMetricsEnabled() == null) ? 0 : getCloudWatchMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getSampledRequestsEnabled() == null) ? 0 : getSampledRequestsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafv2VisibilityConfigDetails clone() {
        try {
            return (AwsWafv2VisibilityConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2VisibilityConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
