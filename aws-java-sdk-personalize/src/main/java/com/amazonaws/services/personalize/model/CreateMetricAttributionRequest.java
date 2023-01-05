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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateMetricAttribution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMetricAttributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the metric attribution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination dataset group for the metric attribution.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to track
     * and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM() functions,
     * provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     */
    private java.util.List<MetricAttribute> metrics;
    /**
     * <p>
     * The output configuration details for the metric attribution.
     * </p>
     */
    private MetricAttributionOutput metricsOutputConfig;

    /**
     * <p>
     * A name for the metric attribution.
     * </p>
     * 
     * @param name
     *        A name for the metric attribution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the metric attribution.
     * </p>
     * 
     * @return A name for the metric attribution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the metric attribution.
     * </p>
     * 
     * @param name
     *        A name for the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricAttributionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination dataset group for the metric attribution.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the destination dataset group for the metric attribution.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination dataset group for the metric attribution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the destination dataset group for the metric attribution.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination dataset group for the metric attribution.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the destination dataset group for the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricAttributionRequest withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to track
     * and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM() functions,
     * provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     * 
     * @return A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to
     *         track and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM()
     *         functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For
     *         example SUM(Items.PRICE).
     */

    public java.util.List<MetricAttribute> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to track
     * and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM() functions,
     * provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     * 
     * @param metrics
     *        A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to
     *        track and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM()
     *        functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For
     *        example SUM(Items.PRICE).
     */

    public void setMetrics(java.util.Collection<MetricAttribute> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<MetricAttribute>(metrics);
    }

    /**
     * <p>
     * A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to track
     * and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM() functions,
     * provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to
     *        track and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM()
     *        functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For
     *        example SUM(Items.PRICE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricAttributionRequest withMetrics(MetricAttribute... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<MetricAttribute>(metrics.length));
        }
        for (MetricAttribute ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to track
     * and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM() functions,
     * provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example
     * SUM(Items.PRICE).
     * </p>
     * 
     * @param metrics
     *        A list of metric attributes for the metric attribution. Each metric attribute specifies an event type to
     *        track and a function. Available functions are <code>SUM()</code> or <code>SAMPLECOUNT()</code>. For SUM()
     *        functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For
     *        example SUM(Items.PRICE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricAttributionRequest withMetrics(java.util.Collection<MetricAttribute> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The output configuration details for the metric attribution.
     * </p>
     * 
     * @param metricsOutputConfig
     *        The output configuration details for the metric attribution.
     */

    public void setMetricsOutputConfig(MetricAttributionOutput metricsOutputConfig) {
        this.metricsOutputConfig = metricsOutputConfig;
    }

    /**
     * <p>
     * The output configuration details for the metric attribution.
     * </p>
     * 
     * @return The output configuration details for the metric attribution.
     */

    public MetricAttributionOutput getMetricsOutputConfig() {
        return this.metricsOutputConfig;
    }

    /**
     * <p>
     * The output configuration details for the metric attribution.
     * </p>
     * 
     * @param metricsOutputConfig
     *        The output configuration details for the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMetricAttributionRequest withMetricsOutputConfig(MetricAttributionOutput metricsOutputConfig) {
        setMetricsOutputConfig(metricsOutputConfig);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getMetricsOutputConfig() != null)
            sb.append("MetricsOutputConfig: ").append(getMetricsOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMetricAttributionRequest == false)
            return false;
        CreateMetricAttributionRequest other = (CreateMetricAttributionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getMetricsOutputConfig() == null ^ this.getMetricsOutputConfig() == null)
            return false;
        if (other.getMetricsOutputConfig() != null && other.getMetricsOutputConfig().equals(this.getMetricsOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getMetricsOutputConfig() == null) ? 0 : getMetricsOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateMetricAttributionRequest clone() {
        return (CreateMetricAttributionRequest) super.clone();
    }

}
