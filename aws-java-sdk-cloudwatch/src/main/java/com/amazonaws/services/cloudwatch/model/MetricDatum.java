/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Encapsulates the information sent to either create a metric or add new values to be aggregated into an existing
 * metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricDatum" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatum implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The dimensions associated with the metric.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The value for the metric.
     * </p>
     * <p>
     * Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too
     * large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In
     * addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * The statistical values for the metric.
     * </p>
     */
    private StatisticSet statisticValues;
    /**
     * <p>
     * Array of numbers representing the values for the metric during the period. Each unique value is listed just once
     * in this array, and the corresponding number in the <code>Counts</code> array specifies the number of times that
     * value occurred during the period. You can include up to 150 unique values in each <code>PutMetricData</code>
     * action that specifies a <code>Values</code> array.
     * </p>
     * <p>
     * Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects values
     * that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10)
     * or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not
     * supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Double> values;
    /**
     * <p>
     * Array of numbers that is used along with the <code>Values</code> array. Each number in the <code>Count</code>
     * array is the number of times the corresponding value in the <code>Values</code> array occurred during the period.
     * </p>
     * <p>
     * If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you include a
     * <code>Counts</code> array, it must include the same amount of values as the <code>Values</code> array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Double> counts;
    /**
     * <p>
     * The unit of the metric.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that
     * CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies this
     * metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently, high resolution
     * is available only for custom metrics. For more information about high-resolution metrics, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#high-resolution-metrics"
     * >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * This field is optional, if you do not specify it the default of 60 is used.
     * </p>
     */
    private Integer storageResolution;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The dimensions associated with the metric.
     * </p>
     * 
     * @return The dimensions associated with the metric.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The dimensions associated with the metric.
     * </p>
     * 
     * @param dimensions
     *        The dimensions associated with the metric.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions);
    }

    /**
     * <p>
     * The dimensions associated with the metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions associated with the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions associated with the metric.
     * </p>
     * 
     * @param dimensions
     *        The dimensions associated with the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     *        UTC.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     *         UTC.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00
     *        UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The value for the metric.
     * </p>
     * <p>
     * Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too
     * large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In
     * addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * 
     * @param value
     *        The value for the metric.</p>
     *        <p>
     *        Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small
     *        or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360
     *        (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the metric.
     * </p>
     * <p>
     * Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too
     * large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In
     * addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * 
     * @return The value for the metric.</p>
     *         <p>
     *         Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too
     *         small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to
     *         2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the metric.
     * </p>
     * <p>
     * Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too
     * large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In
     * addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
     * </p>
     * 
     * @param value
     *        The value for the metric.</p>
     *        <p>
     *        Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small
     *        or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360
     *        (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The statistical values for the metric.
     * </p>
     * 
     * @param statisticValues
     *        The statistical values for the metric.
     */

    public void setStatisticValues(StatisticSet statisticValues) {
        this.statisticValues = statisticValues;
    }

    /**
     * <p>
     * The statistical values for the metric.
     * </p>
     * 
     * @return The statistical values for the metric.
     */

    public StatisticSet getStatisticValues() {
        return this.statisticValues;
    }

    /**
     * <p>
     * The statistical values for the metric.
     * </p>
     * 
     * @param statisticValues
     *        The statistical values for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withStatisticValues(StatisticSet statisticValues) {
        setStatisticValues(statisticValues);
        return this;
    }

    /**
     * <p>
     * Array of numbers representing the values for the metric during the period. Each unique value is listed just once
     * in this array, and the corresponding number in the <code>Counts</code> array specifies the number of times that
     * value occurred during the period. You can include up to 150 unique values in each <code>PutMetricData</code>
     * action that specifies a <code>Values</code> array.
     * </p>
     * <p>
     * Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects values
     * that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10)
     * or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not
     * supported.
     * </p>
     * 
     * @return Array of numbers representing the values for the metric during the period. Each unique value is listed
     *         just once in this array, and the corresponding number in the <code>Counts</code> array specifies the
     *         number of times that value occurred during the period. You can include up to 150 unique values in each
     *         <code>PutMetricData</code> action that specifies a <code>Values</code> array.</p>
     *         <p>
     *         Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects
     *         values that are either too small or too large. Values must be in the range of 8.515920e-109 to
     *         1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN,
     *         +Infinity, -Infinity) are not supported.
     */

    public java.util.List<Double> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<Double>();
        }
        return values;
    }

    /**
     * <p>
     * Array of numbers representing the values for the metric during the period. Each unique value is listed just once
     * in this array, and the corresponding number in the <code>Counts</code> array specifies the number of times that
     * value occurred during the period. You can include up to 150 unique values in each <code>PutMetricData</code>
     * action that specifies a <code>Values</code> array.
     * </p>
     * <p>
     * Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects values
     * that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10)
     * or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not
     * supported.
     * </p>
     * 
     * @param values
     *        Array of numbers representing the values for the metric during the period. Each unique value is listed
     *        just once in this array, and the corresponding number in the <code>Counts</code> array specifies the
     *        number of times that value occurred during the period. You can include up to 150 unique values in each
     *        <code>PutMetricData</code> action that specifies a <code>Values</code> array.</p>
     *        <p>
     *        Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects
     *        values that are either too small or too large. Values must be in the range of 8.515920e-109 to
     *        1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN,
     *        +Infinity, -Infinity) are not supported.
     */

    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<Double>(values);
    }

    /**
     * <p>
     * Array of numbers representing the values for the metric during the period. Each unique value is listed just once
     * in this array, and the corresponding number in the <code>Counts</code> array specifies the number of times that
     * value occurred during the period. You can include up to 150 unique values in each <code>PutMetricData</code>
     * action that specifies a <code>Values</code> array.
     * </p>
     * <p>
     * Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects values
     * that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10)
     * or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not
     * supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        Array of numbers representing the values for the metric during the period. Each unique value is listed
     *        just once in this array, and the corresponding number in the <code>Counts</code> array specifies the
     *        number of times that value occurred during the period. You can include up to 150 unique values in each
     *        <code>PutMetricData</code> action that specifies a <code>Values</code> array.</p>
     *        <p>
     *        Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects
     *        values that are either too small or too large. Values must be in the range of 8.515920e-109 to
     *        1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN,
     *        +Infinity, -Infinity) are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withValues(Double... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<Double>(values.length));
        }
        for (Double ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of numbers representing the values for the metric during the period. Each unique value is listed just once
     * in this array, and the corresponding number in the <code>Counts</code> array specifies the number of times that
     * value occurred during the period. You can include up to 150 unique values in each <code>PutMetricData</code>
     * action that specifies a <code>Values</code> array.
     * </p>
     * <p>
     * Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects values
     * that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10)
     * or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, +Infinity, -Infinity) are not
     * supported.
     * </p>
     * 
     * @param values
     *        Array of numbers representing the values for the metric during the period. Each unique value is listed
     *        just once in this array, and the corresponding number in the <code>Counts</code> array specifies the
     *        number of times that value occurred during the period. You can include up to 150 unique values in each
     *        <code>PutMetricData</code> action that specifies a <code>Values</code> array.</p>
     *        <p>
     *        Although the <code>Values</code> array accepts numbers of type <code>Double</code>, CloudWatch rejects
     *        values that are either too small or too large. Values must be in the range of 8.515920e-109 to
     *        1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN,
     *        +Infinity, -Infinity) are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withValues(java.util.Collection<Double> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * Array of numbers that is used along with the <code>Values</code> array. Each number in the <code>Count</code>
     * array is the number of times the corresponding value in the <code>Values</code> array occurred during the period.
     * </p>
     * <p>
     * If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you include a
     * <code>Counts</code> array, it must include the same amount of values as the <code>Values</code> array.
     * </p>
     * 
     * @return Array of numbers that is used along with the <code>Values</code> array. Each number in the
     *         <code>Count</code> array is the number of times the corresponding value in the <code>Values</code> array
     *         occurred during the period. </p>
     *         <p>
     *         If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you
     *         include a <code>Counts</code> array, it must include the same amount of values as the <code>Values</code>
     *         array.
     */

    public java.util.List<Double> getCounts() {
        if (counts == null) {
            counts = new com.amazonaws.internal.SdkInternalList<Double>();
        }
        return counts;
    }

    /**
     * <p>
     * Array of numbers that is used along with the <code>Values</code> array. Each number in the <code>Count</code>
     * array is the number of times the corresponding value in the <code>Values</code> array occurred during the period.
     * </p>
     * <p>
     * If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you include a
     * <code>Counts</code> array, it must include the same amount of values as the <code>Values</code> array.
     * </p>
     * 
     * @param counts
     *        Array of numbers that is used along with the <code>Values</code> array. Each number in the
     *        <code>Count</code> array is the number of times the corresponding value in the <code>Values</code> array
     *        occurred during the period. </p>
     *        <p>
     *        If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you
     *        include a <code>Counts</code> array, it must include the same amount of values as the <code>Values</code>
     *        array.
     */

    public void setCounts(java.util.Collection<Double> counts) {
        if (counts == null) {
            this.counts = null;
            return;
        }

        this.counts = new com.amazonaws.internal.SdkInternalList<Double>(counts);
    }

    /**
     * <p>
     * Array of numbers that is used along with the <code>Values</code> array. Each number in the <code>Count</code>
     * array is the number of times the corresponding value in the <code>Values</code> array occurred during the period.
     * </p>
     * <p>
     * If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you include a
     * <code>Counts</code> array, it must include the same amount of values as the <code>Values</code> array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCounts(java.util.Collection)} or {@link #withCounts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param counts
     *        Array of numbers that is used along with the <code>Values</code> array. Each number in the
     *        <code>Count</code> array is the number of times the corresponding value in the <code>Values</code> array
     *        occurred during the period. </p>
     *        <p>
     *        If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you
     *        include a <code>Counts</code> array, it must include the same amount of values as the <code>Values</code>
     *        array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withCounts(Double... counts) {
        if (this.counts == null) {
            setCounts(new com.amazonaws.internal.SdkInternalList<Double>(counts.length));
        }
        for (Double ele : counts) {
            this.counts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of numbers that is used along with the <code>Values</code> array. Each number in the <code>Count</code>
     * array is the number of times the corresponding value in the <code>Values</code> array occurred during the period.
     * </p>
     * <p>
     * If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you include a
     * <code>Counts</code> array, it must include the same amount of values as the <code>Values</code> array.
     * </p>
     * 
     * @param counts
     *        Array of numbers that is used along with the <code>Values</code> array. Each number in the
     *        <code>Count</code> array is the number of times the corresponding value in the <code>Values</code> array
     *        occurred during the period. </p>
     *        <p>
     *        If you omit the <code>Counts</code> array, the default of 1 is used as the value for each count. If you
     *        include a <code>Counts</code> array, it must include the same amount of values as the <code>Values</code>
     *        array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withCounts(java.util.Collection<Double> counts) {
        setCounts(counts);
        return this;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @return The unit of the metric.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricDatum withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        withUnit(unit);
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricDatum withUnit(StandardUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that
     * CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies this
     * metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently, high resolution
     * is available only for custom metrics. For more information about high-resolution metrics, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#high-resolution-metrics"
     * >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * This field is optional, if you do not specify it the default of 60 is used.
     * </p>
     * 
     * @param storageResolution
     *        Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that
     *        CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies
     *        this metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently,
     *        high resolution is available only for custom metrics. For more information about high-resolution metrics,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#high-resolution-metrics"
     *        >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>. </p>
     *        <p>
     *        This field is optional, if you do not specify it the default of 60 is used.
     */

    public void setStorageResolution(Integer storageResolution) {
        this.storageResolution = storageResolution;
    }

    /**
     * <p>
     * Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that
     * CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies this
     * metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently, high resolution
     * is available only for custom metrics. For more information about high-resolution metrics, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#high-resolution-metrics"
     * >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * This field is optional, if you do not specify it the default of 60 is used.
     * </p>
     * 
     * @return Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that
     *         CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies
     *         this metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently,
     *         high resolution is available only for custom metrics. For more information about high-resolution metrics,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#high-resolution-metrics"
     *         >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>. </p>
     *         <p>
     *         This field is optional, if you do not specify it the default of 60 is used.
     */

    public Integer getStorageResolution() {
        return this.storageResolution;
    }

    /**
     * <p>
     * Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that
     * CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies this
     * metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently, high resolution
     * is available only for custom metrics. For more information about high-resolution metrics, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#high-resolution-metrics"
     * >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * This field is optional, if you do not specify it the default of 60 is used.
     * </p>
     * 
     * @param storageResolution
     *        Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that
     *        CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies
     *        this metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently,
     *        high resolution is available only for custom metrics. For more information about high-resolution metrics,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#high-resolution-metrics"
     *        >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>. </p>
     *        <p>
     *        This field is optional, if you do not specify it the default of 60 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withStorageResolution(Integer storageResolution) {
        setStorageResolution(storageResolution);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getStatisticValues() != null)
            sb.append("StatisticValues: ").append(getStatisticValues()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getCounts() != null)
            sb.append("Counts: ").append(getCounts()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getStorageResolution() != null)
            sb.append("StorageResolution: ").append(getStorageResolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDatum == false)
            return false;
        MetricDatum other = (MetricDatum) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStatisticValues() == null ^ this.getStatisticValues() == null)
            return false;
        if (other.getStatisticValues() != null && other.getStatisticValues().equals(this.getStatisticValues()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getCounts() == null ^ this.getCounts() == null)
            return false;
        if (other.getCounts() != null && other.getCounts().equals(this.getCounts()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getStorageResolution() == null ^ this.getStorageResolution() == null)
            return false;
        if (other.getStorageResolution() != null && other.getStorageResolution().equals(this.getStorageResolution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStatisticValues() == null) ? 0 : getStatisticValues().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getCounts() == null) ? 0 : getCounts().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getStorageResolution() == null) ? 0 : getStorageResolution().hashCode());
        return hashCode;
    }

    @Override
    public MetricDatum clone() {
        try {
            return (MetricDatum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
