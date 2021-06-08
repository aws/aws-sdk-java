/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/PublishMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Publishes environment metric data to Amazon CloudWatch.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
     * metrica.
     * </p>
     */
    private java.util.List<MetricDatum> metricData;

    /**
     * <p>
     * Publishes environment metric data to Amazon CloudWatch.
     * </p>
     * 
     * @param environmentName
     *        Publishes environment metric data to Amazon CloudWatch.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * Publishes environment metric data to Amazon CloudWatch.
     * </p>
     * 
     * @return Publishes environment metric data to Amazon CloudWatch.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * Publishes environment metric data to Amazon CloudWatch.
     * </p>
     * 
     * @param environmentName
     *        Publishes environment metric data to Amazon CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishMetricsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
     * metrica.
     * </p>
     * 
     * @return Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the
     *         specified metrica.
     */

    public java.util.List<MetricDatum> getMetricData() {
        return metricData;
    }

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
     * metrica.
     * </p>
     * 
     * @param metricData
     *        Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the
     *        specified metrica.
     */

    public void setMetricData(java.util.Collection<MetricDatum> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new java.util.ArrayList<MetricDatum>(metricData);
    }

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
     * metrica.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricData(java.util.Collection)} or {@link #withMetricData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricData
     *        Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the
     *        specified metrica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishMetricsRequest withMetricData(MetricDatum... metricData) {
        if (this.metricData == null) {
            setMetricData(new java.util.ArrayList<MetricDatum>(metricData.length));
        }
        for (MetricDatum ele : metricData) {
            this.metricData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
     * metrica.
     * </p>
     * 
     * @param metricData
     *        Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the
     *        specified metrica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishMetricsRequest withMetricData(java.util.Collection<MetricDatum> metricData) {
        setMetricData(metricData);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getMetricData() != null)
            sb.append("MetricData: ").append(getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishMetricsRequest == false)
            return false;
        PublishMetricsRequest other = (PublishMetricsRequest) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public PublishMetricsRequest clone() {
        return (PublishMetricsRequest) super.clone();
    }

}
