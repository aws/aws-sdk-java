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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetInsightRuleReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightRuleReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     * contributors. If the rule contains more than one key, then each unique combination of values for the keys is
     * counted as a unique contributor.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> keyLabels;
    /**
     * <p>
     * Specifies whether this rule aggregates contributor data by COUNT or SUM.
     * </p>
     */
    private String aggregationStatistic;
    /**
     * <p>
     * The sum of the values from all individual contributors that match the rule.
     * </p>
     */
    private Double aggregateValue;
    /**
     * <p>
     * An approximate count of the unique contributors found by this rule in this time period.
     * </p>
     */
    private Long approximateUniqueCount;
    /**
     * <p>
     * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys,
     * each combination of values for the keys counts as a unique contributor.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InsightRuleContributor> contributors;
    /**
     * <p>
     * A time series of metric data points that matches the time period in the rule request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InsightRuleMetricDatapoint> metricDatapoints;

    /**
     * <p>
     * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     * contributors. If the rule contains more than one key, then each unique combination of values for the keys is
     * counted as a unique contributor.
     * </p>
     * 
     * @return An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     *         contributors. If the rule contains more than one key, then each unique combination of values for the keys
     *         is counted as a unique contributor.
     */

    public java.util.List<String> getKeyLabels() {
        if (keyLabels == null) {
            keyLabels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return keyLabels;
    }

    /**
     * <p>
     * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     * contributors. If the rule contains more than one key, then each unique combination of values for the keys is
     * counted as a unique contributor.
     * </p>
     * 
     * @param keyLabels
     *        An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     *        contributors. If the rule contains more than one key, then each unique combination of values for the keys
     *        is counted as a unique contributor.
     */

    public void setKeyLabels(java.util.Collection<String> keyLabels) {
        if (keyLabels == null) {
            this.keyLabels = null;
            return;
        }

        this.keyLabels = new com.amazonaws.internal.SdkInternalList<String>(keyLabels);
    }

    /**
     * <p>
     * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     * contributors. If the rule contains more than one key, then each unique combination of values for the keys is
     * counted as a unique contributor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyLabels(java.util.Collection)} or {@link #withKeyLabels(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyLabels
     *        An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     *        contributors. If the rule contains more than one key, then each unique combination of values for the keys
     *        is counted as a unique contributor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withKeyLabels(String... keyLabels) {
        if (this.keyLabels == null) {
            setKeyLabels(new com.amazonaws.internal.SdkInternalList<String>(keyLabels.length));
        }
        for (String ele : keyLabels) {
            this.keyLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     * contributors. If the rule contains more than one key, then each unique combination of values for the keys is
     * counted as a unique contributor.
     * </p>
     * 
     * @param keyLabels
     *        An array of the strings used as the keys for this rule. The keys are the dimensions used to classify
     *        contributors. If the rule contains more than one key, then each unique combination of values for the keys
     *        is counted as a unique contributor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withKeyLabels(java.util.Collection<String> keyLabels) {
        setKeyLabels(keyLabels);
        return this;
    }

    /**
     * <p>
     * Specifies whether this rule aggregates contributor data by COUNT or SUM.
     * </p>
     * 
     * @param aggregationStatistic
     *        Specifies whether this rule aggregates contributor data by COUNT or SUM.
     */

    public void setAggregationStatistic(String aggregationStatistic) {
        this.aggregationStatistic = aggregationStatistic;
    }

    /**
     * <p>
     * Specifies whether this rule aggregates contributor data by COUNT or SUM.
     * </p>
     * 
     * @return Specifies whether this rule aggregates contributor data by COUNT or SUM.
     */

    public String getAggregationStatistic() {
        return this.aggregationStatistic;
    }

    /**
     * <p>
     * Specifies whether this rule aggregates contributor data by COUNT or SUM.
     * </p>
     * 
     * @param aggregationStatistic
     *        Specifies whether this rule aggregates contributor data by COUNT or SUM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withAggregationStatistic(String aggregationStatistic) {
        setAggregationStatistic(aggregationStatistic);
        return this;
    }

    /**
     * <p>
     * The sum of the values from all individual contributors that match the rule.
     * </p>
     * 
     * @param aggregateValue
     *        The sum of the values from all individual contributors that match the rule.
     */

    public void setAggregateValue(Double aggregateValue) {
        this.aggregateValue = aggregateValue;
    }

    /**
     * <p>
     * The sum of the values from all individual contributors that match the rule.
     * </p>
     * 
     * @return The sum of the values from all individual contributors that match the rule.
     */

    public Double getAggregateValue() {
        return this.aggregateValue;
    }

    /**
     * <p>
     * The sum of the values from all individual contributors that match the rule.
     * </p>
     * 
     * @param aggregateValue
     *        The sum of the values from all individual contributors that match the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withAggregateValue(Double aggregateValue) {
        setAggregateValue(aggregateValue);
        return this;
    }

    /**
     * <p>
     * An approximate count of the unique contributors found by this rule in this time period.
     * </p>
     * 
     * @param approximateUniqueCount
     *        An approximate count of the unique contributors found by this rule in this time period.
     */

    public void setApproximateUniqueCount(Long approximateUniqueCount) {
        this.approximateUniqueCount = approximateUniqueCount;
    }

    /**
     * <p>
     * An approximate count of the unique contributors found by this rule in this time period.
     * </p>
     * 
     * @return An approximate count of the unique contributors found by this rule in this time period.
     */

    public Long getApproximateUniqueCount() {
        return this.approximateUniqueCount;
    }

    /**
     * <p>
     * An approximate count of the unique contributors found by this rule in this time period.
     * </p>
     * 
     * @param approximateUniqueCount
     *        An approximate count of the unique contributors found by this rule in this time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withApproximateUniqueCount(Long approximateUniqueCount) {
        setApproximateUniqueCount(approximateUniqueCount);
        return this;
    }

    /**
     * <p>
     * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys,
     * each combination of values for the keys counts as a unique contributor.
     * </p>
     * 
     * @return An array of the unique contributors found by this rule in this time period. If the rule contains multiple
     *         keys, each combination of values for the keys counts as a unique contributor.
     */

    public java.util.List<InsightRuleContributor> getContributors() {
        if (contributors == null) {
            contributors = new com.amazonaws.internal.SdkInternalList<InsightRuleContributor>();
        }
        return contributors;
    }

    /**
     * <p>
     * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys,
     * each combination of values for the keys counts as a unique contributor.
     * </p>
     * 
     * @param contributors
     *        An array of the unique contributors found by this rule in this time period. If the rule contains multiple
     *        keys, each combination of values for the keys counts as a unique contributor.
     */

    public void setContributors(java.util.Collection<InsightRuleContributor> contributors) {
        if (contributors == null) {
            this.contributors = null;
            return;
        }

        this.contributors = new com.amazonaws.internal.SdkInternalList<InsightRuleContributor>(contributors);
    }

    /**
     * <p>
     * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys,
     * each combination of values for the keys counts as a unique contributor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContributors(java.util.Collection)} or {@link #withContributors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contributors
     *        An array of the unique contributors found by this rule in this time period. If the rule contains multiple
     *        keys, each combination of values for the keys counts as a unique contributor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withContributors(InsightRuleContributor... contributors) {
        if (this.contributors == null) {
            setContributors(new com.amazonaws.internal.SdkInternalList<InsightRuleContributor>(contributors.length));
        }
        for (InsightRuleContributor ele : contributors) {
            this.contributors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys,
     * each combination of values for the keys counts as a unique contributor.
     * </p>
     * 
     * @param contributors
     *        An array of the unique contributors found by this rule in this time period. If the rule contains multiple
     *        keys, each combination of values for the keys counts as a unique contributor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withContributors(java.util.Collection<InsightRuleContributor> contributors) {
        setContributors(contributors);
        return this;
    }

    /**
     * <p>
     * A time series of metric data points that matches the time period in the rule request.
     * </p>
     * 
     * @return A time series of metric data points that matches the time period in the rule request.
     */

    public java.util.List<InsightRuleMetricDatapoint> getMetricDatapoints() {
        if (metricDatapoints == null) {
            metricDatapoints = new com.amazonaws.internal.SdkInternalList<InsightRuleMetricDatapoint>();
        }
        return metricDatapoints;
    }

    /**
     * <p>
     * A time series of metric data points that matches the time period in the rule request.
     * </p>
     * 
     * @param metricDatapoints
     *        A time series of metric data points that matches the time period in the rule request.
     */

    public void setMetricDatapoints(java.util.Collection<InsightRuleMetricDatapoint> metricDatapoints) {
        if (metricDatapoints == null) {
            this.metricDatapoints = null;
            return;
        }

        this.metricDatapoints = new com.amazonaws.internal.SdkInternalList<InsightRuleMetricDatapoint>(metricDatapoints);
    }

    /**
     * <p>
     * A time series of metric data points that matches the time period in the rule request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDatapoints(java.util.Collection)} or {@link #withMetricDatapoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param metricDatapoints
     *        A time series of metric data points that matches the time period in the rule request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withMetricDatapoints(InsightRuleMetricDatapoint... metricDatapoints) {
        if (this.metricDatapoints == null) {
            setMetricDatapoints(new com.amazonaws.internal.SdkInternalList<InsightRuleMetricDatapoint>(metricDatapoints.length));
        }
        for (InsightRuleMetricDatapoint ele : metricDatapoints) {
            this.metricDatapoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A time series of metric data points that matches the time period in the rule request.
     * </p>
     * 
     * @param metricDatapoints
     *        A time series of metric data points that matches the time period in the rule request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportResult withMetricDatapoints(java.util.Collection<InsightRuleMetricDatapoint> metricDatapoints) {
        setMetricDatapoints(metricDatapoints);
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
        if (getKeyLabels() != null)
            sb.append("KeyLabels: ").append(getKeyLabels()).append(",");
        if (getAggregationStatistic() != null)
            sb.append("AggregationStatistic: ").append(getAggregationStatistic()).append(",");
        if (getAggregateValue() != null)
            sb.append("AggregateValue: ").append(getAggregateValue()).append(",");
        if (getApproximateUniqueCount() != null)
            sb.append("ApproximateUniqueCount: ").append(getApproximateUniqueCount()).append(",");
        if (getContributors() != null)
            sb.append("Contributors: ").append(getContributors()).append(",");
        if (getMetricDatapoints() != null)
            sb.append("MetricDatapoints: ").append(getMetricDatapoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightRuleReportResult == false)
            return false;
        GetInsightRuleReportResult other = (GetInsightRuleReportResult) obj;
        if (other.getKeyLabels() == null ^ this.getKeyLabels() == null)
            return false;
        if (other.getKeyLabels() != null && other.getKeyLabels().equals(this.getKeyLabels()) == false)
            return false;
        if (other.getAggregationStatistic() == null ^ this.getAggregationStatistic() == null)
            return false;
        if (other.getAggregationStatistic() != null && other.getAggregationStatistic().equals(this.getAggregationStatistic()) == false)
            return false;
        if (other.getAggregateValue() == null ^ this.getAggregateValue() == null)
            return false;
        if (other.getAggregateValue() != null && other.getAggregateValue().equals(this.getAggregateValue()) == false)
            return false;
        if (other.getApproximateUniqueCount() == null ^ this.getApproximateUniqueCount() == null)
            return false;
        if (other.getApproximateUniqueCount() != null && other.getApproximateUniqueCount().equals(this.getApproximateUniqueCount()) == false)
            return false;
        if (other.getContributors() == null ^ this.getContributors() == null)
            return false;
        if (other.getContributors() != null && other.getContributors().equals(this.getContributors()) == false)
            return false;
        if (other.getMetricDatapoints() == null ^ this.getMetricDatapoints() == null)
            return false;
        if (other.getMetricDatapoints() != null && other.getMetricDatapoints().equals(this.getMetricDatapoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyLabels() == null) ? 0 : getKeyLabels().hashCode());
        hashCode = prime * hashCode + ((getAggregationStatistic() == null) ? 0 : getAggregationStatistic().hashCode());
        hashCode = prime * hashCode + ((getAggregateValue() == null) ? 0 : getAggregateValue().hashCode());
        hashCode = prime * hashCode + ((getApproximateUniqueCount() == null) ? 0 : getApproximateUniqueCount().hashCode());
        hashCode = prime * hashCode + ((getContributors() == null) ? 0 : getContributors().hashCode());
        hashCode = prime * hashCode + ((getMetricDatapoints() == null) ? 0 : getMetricDatapoints().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightRuleReportResult clone() {
        try {
            return (GetInsightRuleReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
