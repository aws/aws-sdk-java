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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DisableAwsNetworkPerformanceMetricSubscriptionRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableAwsNetworkPerformanceMetricSubscriptionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DisableAwsNetworkPerformanceMetricSubscriptionRequest> {

    /**
     * <p>
     * The source Region or Availability Zone that the metric subscription is disabled for. For example,
     * <code>us-east-1</code>.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The target Region or Availability Zone that the metric subscription is disabled for. For example,
     * <code>eu-north-1</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The metric used for the disabled subscription.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The statistic used for the disabled subscription.
     * </p>
     */
    private String statistic;

    /**
     * <p>
     * The source Region or Availability Zone that the metric subscription is disabled for. For example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @param source
     *        The source Region or Availability Zone that the metric subscription is disabled for. For example,
     *        <code>us-east-1</code>.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source Region or Availability Zone that the metric subscription is disabled for. For example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @return The source Region or Availability Zone that the metric subscription is disabled for. For example,
     *         <code>us-east-1</code>.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source Region or Availability Zone that the metric subscription is disabled for. For example,
     * <code>us-east-1</code>.
     * </p>
     * 
     * @param source
     *        The source Region or Availability Zone that the metric subscription is disabled for. For example,
     *        <code>us-east-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAwsNetworkPerformanceMetricSubscriptionRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The target Region or Availability Zone that the metric subscription is disabled for. For example,
     * <code>eu-north-1</code>.
     * </p>
     * 
     * @param destination
     *        The target Region or Availability Zone that the metric subscription is disabled for. For example,
     *        <code>eu-north-1</code>.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The target Region or Availability Zone that the metric subscription is disabled for. For example,
     * <code>eu-north-1</code>.
     * </p>
     * 
     * @return The target Region or Availability Zone that the metric subscription is disabled for. For example,
     *         <code>eu-north-1</code>.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The target Region or Availability Zone that the metric subscription is disabled for. For example,
     * <code>eu-north-1</code>.
     * </p>
     * 
     * @param destination
     *        The target Region or Availability Zone that the metric subscription is disabled for. For example,
     *        <code>eu-north-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAwsNetworkPerformanceMetricSubscriptionRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The metric used for the disabled subscription.
     * </p>
     * 
     * @param metric
     *        The metric used for the disabled subscription.
     * @see MetricType
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The metric used for the disabled subscription.
     * </p>
     * 
     * @return The metric used for the disabled subscription.
     * @see MetricType
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The metric used for the disabled subscription.
     * </p>
     * 
     * @param metric
     *        The metric used for the disabled subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public DisableAwsNetworkPerformanceMetricSubscriptionRequest withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The metric used for the disabled subscription.
     * </p>
     * 
     * @param metric
     *        The metric used for the disabled subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public DisableAwsNetworkPerformanceMetricSubscriptionRequest withMetric(MetricType metric) {
        this.metric = metric.toString();
        return this;
    }

    /**
     * <p>
     * The statistic used for the disabled subscription.
     * </p>
     * 
     * @param statistic
     *        The statistic used for the disabled subscription.
     * @see StatisticType
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic used for the disabled subscription.
     * </p>
     * 
     * @return The statistic used for the disabled subscription.
     * @see StatisticType
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic used for the disabled subscription.
     * </p>
     * 
     * @param statistic
     *        The statistic used for the disabled subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticType
     */

    public DisableAwsNetworkPerformanceMetricSubscriptionRequest withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic used for the disabled subscription.
     * </p>
     * 
     * @param statistic
     *        The statistic used for the disabled subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticType
     */

    public DisableAwsNetworkPerformanceMetricSubscriptionRequest withStatistic(StatisticType statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisableAwsNetworkPerformanceMetricSubscriptionRequest> getDryRunRequest() {
        Request<DisableAwsNetworkPerformanceMetricSubscriptionRequest> request = new DisableAwsNetworkPerformanceMetricSubscriptionRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableAwsNetworkPerformanceMetricSubscriptionRequest == false)
            return false;
        DisableAwsNetworkPerformanceMetricSubscriptionRequest other = (DisableAwsNetworkPerformanceMetricSubscriptionRequest) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        return hashCode;
    }

    @Override
    public DisableAwsNetworkPerformanceMetricSubscriptionRequest clone() {
        return (DisableAwsNetworkPerformanceMetricSubscriptionRequest) super.clone();
    }
}
