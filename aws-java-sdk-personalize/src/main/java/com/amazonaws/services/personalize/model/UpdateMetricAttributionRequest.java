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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateMetricAttribution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMetricAttributionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Add new metric attributes to the metric attribution.
     * </p>
     */
    private java.util.List<MetricAttribute> addMetrics;
    /**
     * <p>
     * Remove metric attributes from the metric attribution.
     * </p>
     */
    private java.util.List<String> removeMetrics;
    /**
     * <p>
     * An output config for the metric attribution.
     * </p>
     */
    private MetricAttributionOutput metricsOutputConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the metric attribution to update.
     * </p>
     */
    private String metricAttributionArn;

    /**
     * <p>
     * Add new metric attributes to the metric attribution.
     * </p>
     * 
     * @return Add new metric attributes to the metric attribution.
     */

    public java.util.List<MetricAttribute> getAddMetrics() {
        return addMetrics;
    }

    /**
     * <p>
     * Add new metric attributes to the metric attribution.
     * </p>
     * 
     * @param addMetrics
     *        Add new metric attributes to the metric attribution.
     */

    public void setAddMetrics(java.util.Collection<MetricAttribute> addMetrics) {
        if (addMetrics == null) {
            this.addMetrics = null;
            return;
        }

        this.addMetrics = new java.util.ArrayList<MetricAttribute>(addMetrics);
    }

    /**
     * <p>
     * Add new metric attributes to the metric attribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddMetrics(java.util.Collection)} or {@link #withAddMetrics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addMetrics
     *        Add new metric attributes to the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricAttributionRequest withAddMetrics(MetricAttribute... addMetrics) {
        if (this.addMetrics == null) {
            setAddMetrics(new java.util.ArrayList<MetricAttribute>(addMetrics.length));
        }
        for (MetricAttribute ele : addMetrics) {
            this.addMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Add new metric attributes to the metric attribution.
     * </p>
     * 
     * @param addMetrics
     *        Add new metric attributes to the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricAttributionRequest withAddMetrics(java.util.Collection<MetricAttribute> addMetrics) {
        setAddMetrics(addMetrics);
        return this;
    }

    /**
     * <p>
     * Remove metric attributes from the metric attribution.
     * </p>
     * 
     * @return Remove metric attributes from the metric attribution.
     */

    public java.util.List<String> getRemoveMetrics() {
        return removeMetrics;
    }

    /**
     * <p>
     * Remove metric attributes from the metric attribution.
     * </p>
     * 
     * @param removeMetrics
     *        Remove metric attributes from the metric attribution.
     */

    public void setRemoveMetrics(java.util.Collection<String> removeMetrics) {
        if (removeMetrics == null) {
            this.removeMetrics = null;
            return;
        }

        this.removeMetrics = new java.util.ArrayList<String>(removeMetrics);
    }

    /**
     * <p>
     * Remove metric attributes from the metric attribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveMetrics(java.util.Collection)} or {@link #withRemoveMetrics(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param removeMetrics
     *        Remove metric attributes from the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricAttributionRequest withRemoveMetrics(String... removeMetrics) {
        if (this.removeMetrics == null) {
            setRemoveMetrics(new java.util.ArrayList<String>(removeMetrics.length));
        }
        for (String ele : removeMetrics) {
            this.removeMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Remove metric attributes from the metric attribution.
     * </p>
     * 
     * @param removeMetrics
     *        Remove metric attributes from the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricAttributionRequest withRemoveMetrics(java.util.Collection<String> removeMetrics) {
        setRemoveMetrics(removeMetrics);
        return this;
    }

    /**
     * <p>
     * An output config for the metric attribution.
     * </p>
     * 
     * @param metricsOutputConfig
     *        An output config for the metric attribution.
     */

    public void setMetricsOutputConfig(MetricAttributionOutput metricsOutputConfig) {
        this.metricsOutputConfig = metricsOutputConfig;
    }

    /**
     * <p>
     * An output config for the metric attribution.
     * </p>
     * 
     * @return An output config for the metric attribution.
     */

    public MetricAttributionOutput getMetricsOutputConfig() {
        return this.metricsOutputConfig;
    }

    /**
     * <p>
     * An output config for the metric attribution.
     * </p>
     * 
     * @param metricsOutputConfig
     *        An output config for the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricAttributionRequest withMetricsOutputConfig(MetricAttributionOutput metricsOutputConfig) {
        setMetricsOutputConfig(metricsOutputConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the metric attribution to update.
     * </p>
     * 
     * @param metricAttributionArn
     *        The Amazon Resource Name (ARN) for the metric attribution to update.
     */

    public void setMetricAttributionArn(String metricAttributionArn) {
        this.metricAttributionArn = metricAttributionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the metric attribution to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the metric attribution to update.
     */

    public String getMetricAttributionArn() {
        return this.metricAttributionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the metric attribution to update.
     * </p>
     * 
     * @param metricAttributionArn
     *        The Amazon Resource Name (ARN) for the metric attribution to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMetricAttributionRequest withMetricAttributionArn(String metricAttributionArn) {
        setMetricAttributionArn(metricAttributionArn);
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
        if (getAddMetrics() != null)
            sb.append("AddMetrics: ").append(getAddMetrics()).append(",");
        if (getRemoveMetrics() != null)
            sb.append("RemoveMetrics: ").append(getRemoveMetrics()).append(",");
        if (getMetricsOutputConfig() != null)
            sb.append("MetricsOutputConfig: ").append(getMetricsOutputConfig()).append(",");
        if (getMetricAttributionArn() != null)
            sb.append("MetricAttributionArn: ").append(getMetricAttributionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMetricAttributionRequest == false)
            return false;
        UpdateMetricAttributionRequest other = (UpdateMetricAttributionRequest) obj;
        if (other.getAddMetrics() == null ^ this.getAddMetrics() == null)
            return false;
        if (other.getAddMetrics() != null && other.getAddMetrics().equals(this.getAddMetrics()) == false)
            return false;
        if (other.getRemoveMetrics() == null ^ this.getRemoveMetrics() == null)
            return false;
        if (other.getRemoveMetrics() != null && other.getRemoveMetrics().equals(this.getRemoveMetrics()) == false)
            return false;
        if (other.getMetricsOutputConfig() == null ^ this.getMetricsOutputConfig() == null)
            return false;
        if (other.getMetricsOutputConfig() != null && other.getMetricsOutputConfig().equals(this.getMetricsOutputConfig()) == false)
            return false;
        if (other.getMetricAttributionArn() == null ^ this.getMetricAttributionArn() == null)
            return false;
        if (other.getMetricAttributionArn() != null && other.getMetricAttributionArn().equals(this.getMetricAttributionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddMetrics() == null) ? 0 : getAddMetrics().hashCode());
        hashCode = prime * hashCode + ((getRemoveMetrics() == null) ? 0 : getRemoveMetrics().hashCode());
        hashCode = prime * hashCode + ((getMetricsOutputConfig() == null) ? 0 : getMetricsOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getMetricAttributionArn() == null) ? 0 : getMetricAttributionArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMetricAttributionRequest clone() {
        return (UpdateMetricAttributionRequest) super.clone();
    }

}
