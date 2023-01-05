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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * By default, a metric stream always sends the <code>MAX</code>, <code>MIN</code>, <code>SUM</code>, and
 * <code>SAMPLECOUNT</code> statistics for each metric that is streamed. This structure contains information for one
 * metric that includes additional statistics in the stream. For more information about statistics, see CloudWatch,
 * listed in <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
 * CloudWatch statistics definitions</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricStreamStatisticsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricStreamStatisticsConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * An array of metric name and namespace pairs that stream the additional statistics listed in the value of the
     * <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.
     * </p>
     * <p>
     * All metrics that match the combination of metric name and namespace will be streamed with the additional
     * statistics, no matter their dimensions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricStreamStatisticsMetric> includeMetrics;
    /**
     * <p>
     * The list of additional statistics that are to be streamed for the metrics listed in the
     * <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values are
     * <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the abbreviations
     * for all of the statistics listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     * CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     * <code>PR(:300)</code>, and so on.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> additionalStatistics;

    /**
     * <p>
     * An array of metric name and namespace pairs that stream the additional statistics listed in the value of the
     * <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.
     * </p>
     * <p>
     * All metrics that match the combination of metric name and namespace will be streamed with the additional
     * statistics, no matter their dimensions.
     * </p>
     * 
     * @return An array of metric name and namespace pairs that stream the additional statistics listed in the value of
     *         the <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.</p>
     *         <p>
     *         All metrics that match the combination of metric name and namespace will be streamed with the additional
     *         statistics, no matter their dimensions.
     */

    public java.util.List<MetricStreamStatisticsMetric> getIncludeMetrics() {
        if (includeMetrics == null) {
            includeMetrics = new com.amazonaws.internal.SdkInternalList<MetricStreamStatisticsMetric>();
        }
        return includeMetrics;
    }

    /**
     * <p>
     * An array of metric name and namespace pairs that stream the additional statistics listed in the value of the
     * <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.
     * </p>
     * <p>
     * All metrics that match the combination of metric name and namespace will be streamed with the additional
     * statistics, no matter their dimensions.
     * </p>
     * 
     * @param includeMetrics
     *        An array of metric name and namespace pairs that stream the additional statistics listed in the value of
     *        the <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.</p>
     *        <p>
     *        All metrics that match the combination of metric name and namespace will be streamed with the additional
     *        statistics, no matter their dimensions.
     */

    public void setIncludeMetrics(java.util.Collection<MetricStreamStatisticsMetric> includeMetrics) {
        if (includeMetrics == null) {
            this.includeMetrics = null;
            return;
        }

        this.includeMetrics = new com.amazonaws.internal.SdkInternalList<MetricStreamStatisticsMetric>(includeMetrics);
    }

    /**
     * <p>
     * An array of metric name and namespace pairs that stream the additional statistics listed in the value of the
     * <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.
     * </p>
     * <p>
     * All metrics that match the combination of metric name and namespace will be streamed with the additional
     * statistics, no matter their dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeMetrics(java.util.Collection)} or {@link #withIncludeMetrics(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param includeMetrics
     *        An array of metric name and namespace pairs that stream the additional statistics listed in the value of
     *        the <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.</p>
     *        <p>
     *        All metrics that match the combination of metric name and namespace will be streamed with the additional
     *        statistics, no matter their dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamStatisticsConfiguration withIncludeMetrics(MetricStreamStatisticsMetric... includeMetrics) {
        if (this.includeMetrics == null) {
            setIncludeMetrics(new com.amazonaws.internal.SdkInternalList<MetricStreamStatisticsMetric>(includeMetrics.length));
        }
        for (MetricStreamStatisticsMetric ele : includeMetrics) {
            this.includeMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of metric name and namespace pairs that stream the additional statistics listed in the value of the
     * <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.
     * </p>
     * <p>
     * All metrics that match the combination of metric name and namespace will be streamed with the additional
     * statistics, no matter their dimensions.
     * </p>
     * 
     * @param includeMetrics
     *        An array of metric name and namespace pairs that stream the additional statistics listed in the value of
     *        the <code>AdditionalStatistics</code> parameter. There can be as many as 100 pairs in the array.</p>
     *        <p>
     *        All metrics that match the combination of metric name and namespace will be streamed with the additional
     *        statistics, no matter their dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamStatisticsConfiguration withIncludeMetrics(java.util.Collection<MetricStreamStatisticsMetric> includeMetrics) {
        setIncludeMetrics(includeMetrics);
        return this;
    }

    /**
     * <p>
     * The list of additional statistics that are to be streamed for the metrics listed in the
     * <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values are
     * <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the abbreviations
     * for all of the statistics listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     * CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     * <code>PR(:300)</code>, and so on.
     * </p>
     * 
     * @return The list of additional statistics that are to be streamed for the metrics listed in the
     *         <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.</p>
     *         <p>
     *         If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values
     *         are <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     *         </p>
     *         <p>
     *         If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the
     *         abbreviations for all of the statistics listed in <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     *         CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     *         <code>PR(:300)</code>, and so on.
     */

    public java.util.List<String> getAdditionalStatistics() {
        if (additionalStatistics == null) {
            additionalStatistics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return additionalStatistics;
    }

    /**
     * <p>
     * The list of additional statistics that are to be streamed for the metrics listed in the
     * <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values are
     * <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the abbreviations
     * for all of the statistics listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     * CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     * <code>PR(:300)</code>, and so on.
     * </p>
     * 
     * @param additionalStatistics
     *        The list of additional statistics that are to be streamed for the metrics listed in the
     *        <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.</p>
     *        <p>
     *        If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values
     *        are <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     *        </p>
     *        <p>
     *        If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the
     *        abbreviations for all of the statistics listed in <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     *        CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     *        <code>PR(:300)</code>, and so on.
     */

    public void setAdditionalStatistics(java.util.Collection<String> additionalStatistics) {
        if (additionalStatistics == null) {
            this.additionalStatistics = null;
            return;
        }

        this.additionalStatistics = new com.amazonaws.internal.SdkInternalList<String>(additionalStatistics);
    }

    /**
     * <p>
     * The list of additional statistics that are to be streamed for the metrics listed in the
     * <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values are
     * <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the abbreviations
     * for all of the statistics listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     * CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     * <code>PR(:300)</code>, and so on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalStatistics(java.util.Collection)} or {@link #withAdditionalStatistics(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalStatistics
     *        The list of additional statistics that are to be streamed for the metrics listed in the
     *        <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.</p>
     *        <p>
     *        If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values
     *        are <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     *        </p>
     *        <p>
     *        If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the
     *        abbreviations for all of the statistics listed in <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     *        CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     *        <code>PR(:300)</code>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamStatisticsConfiguration withAdditionalStatistics(String... additionalStatistics) {
        if (this.additionalStatistics == null) {
            setAdditionalStatistics(new com.amazonaws.internal.SdkInternalList<String>(additionalStatistics.length));
        }
        for (String ele : additionalStatistics) {
            this.additionalStatistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of additional statistics that are to be streamed for the metrics listed in the
     * <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values are
     * <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     * </p>
     * <p>
     * If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the abbreviations
     * for all of the statistics listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     * CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     * <code>PR(:300)</code>, and so on.
     * </p>
     * 
     * @param additionalStatistics
     *        The list of additional statistics that are to be streamed for the metrics listed in the
     *        <code>IncludeMetrics</code> array in this structure. This list can include as many as 20 statistics.</p>
     *        <p>
     *        If the <code>OutputFormat</code> for the stream is <code>opentelemetry0.7</code>, the only valid values
     *        are <code>p<i>??</i> </code> percentile statistics such as <code>p90</code>, <code>p99</code> and so on.
     *        </p>
     *        <p>
     *        If the <code>OutputFormat</code> for the stream is <code>json</code>, the valid values include the
     *        abbreviations for all of the statistics listed in <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html.html">
     *        CloudWatch statistics definitions</a>. For example, this includes <code>tm98, </code> <code>wm90</code>,
     *        <code>PR(:300)</code>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamStatisticsConfiguration withAdditionalStatistics(java.util.Collection<String> additionalStatistics) {
        setAdditionalStatistics(additionalStatistics);
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
        if (getIncludeMetrics() != null)
            sb.append("IncludeMetrics: ").append(getIncludeMetrics()).append(",");
        if (getAdditionalStatistics() != null)
            sb.append("AdditionalStatistics: ").append(getAdditionalStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricStreamStatisticsConfiguration == false)
            return false;
        MetricStreamStatisticsConfiguration other = (MetricStreamStatisticsConfiguration) obj;
        if (other.getIncludeMetrics() == null ^ this.getIncludeMetrics() == null)
            return false;
        if (other.getIncludeMetrics() != null && other.getIncludeMetrics().equals(this.getIncludeMetrics()) == false)
            return false;
        if (other.getAdditionalStatistics() == null ^ this.getAdditionalStatistics() == null)
            return false;
        if (other.getAdditionalStatistics() != null && other.getAdditionalStatistics().equals(this.getAdditionalStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeMetrics() == null) ? 0 : getIncludeMetrics().hashCode());
        hashCode = prime * hashCode + ((getAdditionalStatistics() == null) ? 0 : getAdditionalStatistics().hashCode());
        return hashCode;
    }

    @Override
    public MetricStreamStatisticsConfiguration clone() {
        try {
            return (MetricStreamStatisticsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
