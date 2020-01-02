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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetInsightRuleReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightRuleReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule that you want to see data from.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The period, in seconds, to use for the statistics in the <code>InsightRuleMetricDatapoint</code> results.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the default
     * of 10 is used.
     * </p>
     */
    private Integer maxContributorCount;
    /**
     * <p>
     * Specifies which metrics to use for aggregation of contributor values for the report. You can specify one or more
     * of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of the
     * contributor may change for each data point in the graph.
     * </p>
     * <p>
     * If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     * occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     * highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> -- the number of data points matched by the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimum</code> -- the minimum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> -- the maximum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> -- the average value from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> metrics;
    /**
     * <p>
     * Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
     * </p>
     */
    private String orderBy;

    /**
     * <p>
     * The name of the rule that you want to see data from.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule that you want to see data from.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule that you want to see data from.
     * </p>
     * 
     * @return The name of the rule that you want to see data from.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule that you want to see data from.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule that you want to see data from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportRequest withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param startTime
     *        The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     *        <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @return The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     *         <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param startTime
     *        The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     *        <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param endTime
     *        The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     *        <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @return The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     *         <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param endTime
     *        The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as
     *        <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The period, in seconds, to use for the statistics in the <code>InsightRuleMetricDatapoint</code> results.
     * </p>
     * 
     * @param period
     *        The period, in seconds, to use for the statistics in the <code>InsightRuleMetricDatapoint</code> results.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period, in seconds, to use for the statistics in the <code>InsightRuleMetricDatapoint</code> results.
     * </p>
     * 
     * @return The period, in seconds, to use for the statistics in the <code>InsightRuleMetricDatapoint</code> results.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period, in seconds, to use for the statistics in the <code>InsightRuleMetricDatapoint</code> results.
     * </p>
     * 
     * @param period
     *        The period, in seconds, to use for the statistics in the <code>InsightRuleMetricDatapoint</code> results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the default
     * of 10 is used.
     * </p>
     * 
     * @param maxContributorCount
     *        The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the
     *        default of 10 is used.
     */

    public void setMaxContributorCount(Integer maxContributorCount) {
        this.maxContributorCount = maxContributorCount;
    }

    /**
     * <p>
     * The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the default
     * of 10 is used.
     * </p>
     * 
     * @return The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the
     *         default of 10 is used.
     */

    public Integer getMaxContributorCount() {
        return this.maxContributorCount;
    }

    /**
     * <p>
     * The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the default
     * of 10 is used.
     * </p>
     * 
     * @param maxContributorCount
     *        The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the
     *        default of 10 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportRequest withMaxContributorCount(Integer maxContributorCount) {
        setMaxContributorCount(maxContributorCount);
        return this;
    }

    /**
     * <p>
     * Specifies which metrics to use for aggregation of contributor values for the report. You can specify one or more
     * of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of the
     * contributor may change for each data point in the graph.
     * </p>
     * <p>
     * If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     * occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     * highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> -- the number of data points matched by the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimum</code> -- the minimum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> -- the maximum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> -- the average value from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies which metrics to use for aggregation of contributor values for the report. You can specify one
     *         or more of the following metrics:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of
     *         the contributor may change for each data point in the graph.
     *         </p>
     *         <p>
     *         If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the
     *         most occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor
     *         with the highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SampleCount</code> -- the number of data points matched by the rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sum</code> -- the sum of the values from all contributors during the time period represented by
     *         that data point.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Minimum</code> -- the minimum value from a single observation during the time period represented by
     *         that data point.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maximum</code> -- the maximum value from a single observation during the time period represented by
     *         that data point.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> -- the average value from all contributors during the time period represented by
     *         that data point.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return metrics;
    }

    /**
     * <p>
     * Specifies which metrics to use for aggregation of contributor values for the report. You can specify one or more
     * of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of the
     * contributor may change for each data point in the graph.
     * </p>
     * <p>
     * If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     * occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     * highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> -- the number of data points matched by the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimum</code> -- the minimum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> -- the maximum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> -- the average value from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metrics
     *        Specifies which metrics to use for aggregation of contributor values for the report. You can specify one
     *        or more of the following metrics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of
     *        the contributor may change for each data point in the graph.
     *        </p>
     *        <p>
     *        If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     *        occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     *        highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> -- the number of data points matched by the rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that
     *        data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Minimum</code> -- the minimum value from a single observation during the time period represented by
     *        that data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> -- the maximum value from a single observation during the time period represented by
     *        that data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> -- the average value from all contributors during the time period represented by that
     *        data point.
     *        </p>
     *        </li>
     */

    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<String>(metrics);
    }

    /**
     * <p>
     * Specifies which metrics to use for aggregation of contributor values for the report. You can specify one or more
     * of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of the
     * contributor may change for each data point in the graph.
     * </p>
     * <p>
     * If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     * occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     * highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> -- the number of data points matched by the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimum</code> -- the minimum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> -- the maximum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> -- the average value from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        Specifies which metrics to use for aggregation of contributor values for the report. You can specify one
     *        or more of the following metrics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of
     *        the contributor may change for each data point in the graph.
     *        </p>
     *        <p>
     *        If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     *        occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     *        highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> -- the number of data points matched by the rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that
     *        data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Minimum</code> -- the minimum value from a single observation during the time period represented by
     *        that data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> -- the maximum value from a single observation during the time period represented by
     *        that data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> -- the average value from all contributors during the time period represented by that
     *        data point.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportRequest withMetrics(String... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<String>(metrics.length));
        }
        for (String ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies which metrics to use for aggregation of contributor values for the report. You can specify one or more
     * of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of the
     * contributor may change for each data point in the graph.
     * </p>
     * <p>
     * If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     * occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     * highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> -- the number of data points matched by the rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Minimum</code> -- the minimum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> -- the maximum value from a single observation during the time period represented by that
     * data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> -- the average value from all contributors during the time period represented by that data
     * point.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metrics
     *        Specifies which metrics to use for aggregation of contributor values for the report. You can specify one
     *        or more of the following metrics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UniqueContributors</code> -- the number of unique contributors for each data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MaxContributorValue</code> -- the value of the top contributor for each data point. The identity of
     *        the contributor may change for each data point in the graph.
     *        </p>
     *        <p>
     *        If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most
     *        occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the
     *        highest sum in the log field specified by the rule's <code>Value</code>, during that period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> -- the number of data points matched by the rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> -- the sum of the values from all contributors during the time period represented by that
     *        data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Minimum</code> -- the minimum value from a single observation during the time period represented by
     *        that data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> -- the maximum value from a single observation during the time period represented by
     *        that data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> -- the average value from all contributors during the time period represented by that
     *        data point.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
     * </p>
     * 
     * @param orderBy
     *        Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
     */

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
     * </p>
     * 
     * @return Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
     */

    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * <p>
     * Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
     * </p>
     * 
     * @param orderBy
     *        Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightRuleReportRequest withOrderBy(String orderBy) {
        setOrderBy(orderBy);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getMaxContributorCount() != null)
            sb.append("MaxContributorCount: ").append(getMaxContributorCount()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightRuleReportRequest == false)
            return false;
        GetInsightRuleReportRequest other = (GetInsightRuleReportRequest) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getMaxContributorCount() == null ^ this.getMaxContributorCount() == null)
            return false;
        if (other.getMaxContributorCount() != null && other.getMaxContributorCount().equals(this.getMaxContributorCount()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getMaxContributorCount() == null) ? 0 : getMaxContributorCount().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightRuleReportRequest clone() {
        return (GetInsightRuleReportRequest) super.clone();
    }

}
