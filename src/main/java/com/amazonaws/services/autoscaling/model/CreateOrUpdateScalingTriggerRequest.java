/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createOrUpdateScalingTrigger(CreateOrUpdateScalingTriggerRequest) CreateOrUpdateScalingTrigger operation}.
 * <p>
 * Sets the parameters that govern how and when to scale an AutoScaling
 * group.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createOrUpdateScalingTrigger(CreateOrUpdateScalingTriggerRequest)
 */
public class CreateOrUpdateScalingTriggerRequest extends AmazonWebServiceRequest {

    /**
     * The name for the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String triggerName;

    /**
     * The name of the <a>AutoScalingGroup</a> to be associated with the
     * trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The measure name associated with the metric used by the trigger to
     * determine when to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String measureName;

    /**
     * The statistic that the trigger when fetching metrics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Average|Sum|Minimum|Maximum)<br/>
     */
    private String statistic;

    /**
     * A list of dimensions associated with the metric used by the trigger to
     * determine whether to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<Dimension> dimensions;

    /**
     * The period, in seconds, associated witht he metric statistics.
     */
    private Integer period;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     */
    private String unit;

    /**
     * The standard unit of measurement for a given measure that the trigger
     * uses when fetching metrics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String customUnit;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\u0039\u003b-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String namespace;

    /**
     * The lower limit for the metric. If all data points in the last
     * BreachDuration seconds fall below the lower threshold or exceed the
     * upper threshold, the trigger activates.
     */
    private Double lowerThreshold;

    /**
     * The incremental amount to use when performing scaling activities after
     * the lower threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String lowerBreachScaleIncrement;

    /**
     * The upper limit for the metric. If all data points in the last
     * BreachDuration seconds fall below the lower threshold or exceed the
     * upper threshold, the trigger activates.
     */
    private Double upperThreshold;

    /**
     * The incremental amount to use when performing scaling activities after
     * the upper threshold has been breached. <note> If only a positive or
     * negative number is specified, then the AutoScaling group will increase
     * or decrease by the specified number of actual instances. If positive
     * or negative number followed by a percent sign is specified, the
     * AutoScaling group will increase or decrease as a percentage. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String upperBreachScaleIncrement;

    /**
     * The amount of time, in seconds, used to evaluate and determine if a
     * breach is occurring. The service will look at data between the current
     * time and the number of seconds specified in this parameter to see if a
     * breach has occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>120 - 86400<br/>
     */
    private Integer breachDuration;

    /**
     * The name for the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name for the trigger.
     */
    public String getTriggerName() {
        return triggerName;
    }
    
    /**
     * The name for the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param triggerName The name for the trigger.
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }
    
    /**
     * The name for the trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param triggerName The name for the trigger.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    
    
    /**
     * The name of the <a>AutoScalingGroup</a> to be associated with the
     * trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the <a>AutoScalingGroup</a> to be associated with the
     *         trigger.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the <a>AutoScalingGroup</a> to be associated with the
     * trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the <a>AutoScalingGroup</a> to be associated with the
     *         trigger.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the <a>AutoScalingGroup</a> to be associated with the
     * trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the <a>AutoScalingGroup</a> to be associated with the
     *         trigger.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The measure name associated with the metric used by the trigger to
     * determine when to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The measure name associated with the metric used by the trigger to
     *         determine when to fire. For more information, please see <a
     *         hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     *         documentation</a>.
     */
    public String getMeasureName() {
        return measureName;
    }
    
    /**
     * The measure name associated with the metric used by the trigger to
     * determine when to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param measureName The measure name associated with the metric used by the trigger to
     *         determine when to fire. For more information, please see <a
     *         hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     *         documentation</a>.
     */
    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }
    
    /**
     * The measure name associated with the metric used by the trigger to
     * determine when to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param measureName The measure name associated with the metric used by the trigger to
     *         determine when to fire. For more information, please see <a
     *         hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     *         documentation</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withMeasureName(String measureName) {
        this.measureName = measureName;
        return this;
    }
    
    
    /**
     * The statistic that the trigger when fetching metrics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Average|Sum|Minimum|Maximum)<br/>
     *
     * @return The statistic that the trigger when fetching metrics to examine.
     */
    public String getStatistic() {
        return statistic;
    }
    
    /**
     * The statistic that the trigger when fetching metrics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Average|Sum|Minimum|Maximum)<br/>
     *
     * @param statistic The statistic that the trigger when fetching metrics to examine.
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }
    
    /**
     * The statistic that the trigger when fetching metrics to examine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Average|Sum|Minimum|Maximum)<br/>
     *
     * @param statistic The statistic that the trigger when fetching metrics to examine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }
    
    
    /**
     * A list of dimensions associated with the metric used by the trigger to
     * determine whether to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A list of dimensions associated with the metric used by the trigger to
     *         determine whether to fire. For more information, please see <a
     *         hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     *         documentation</a>.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new java.util.ArrayList<Dimension>();
        }
        return dimensions;
    }
    
    /**
     * A list of dimensions associated with the metric used by the trigger to
     * determine whether to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param dimensions A list of dimensions associated with the metric used by the trigger to
     *         determine whether to fire. For more information, please see <a
     *         hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     *         documentation</a>.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * A list of dimensions associated with the metric used by the trigger to
     * determine whether to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param dimensions A list of dimensions associated with the metric used by the trigger to
     *         determine whether to fire. For more information, please see <a
     *         hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     *         documentation</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withDimensions(Dimension... dimensions) {
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * A list of dimensions associated with the metric used by the trigger to
     * determine whether to fire. For more information, please see <a
     * hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     * documentation</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param dimensions A list of dimensions associated with the metric used by the trigger to
     *         determine whether to fire. For more information, please see <a
     *         hlink="http://aws.amazon.com/cloudwatch/"> Amazon CloudWatch product
     *         documentation</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;

        return this;
    }
    
    /**
     * The period, in seconds, associated witht he metric statistics.
     *
     * @return The period, in seconds, associated witht he metric statistics.
     */
    public Integer getPeriod() {
        return period;
    }
    
    /**
     * The period, in seconds, associated witht he metric statistics.
     *
     * @param period The period, in seconds, associated witht he metric statistics.
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }
    
    /**
     * The period, in seconds, associated witht he metric statistics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param period The period, in seconds, associated witht he metric statistics.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @return 
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @param unit 
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @param unit 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }
    
    
    /**
     * The standard unit of measurement for a given measure that the trigger
     * uses when fetching metrics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The standard unit of measurement for a given measure that the trigger
     *         uses when fetching metrics to examine.
     */
    public String getCustomUnit() {
        return customUnit;
    }
    
    /**
     * The standard unit of measurement for a given measure that the trigger
     * uses when fetching metrics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param customUnit The standard unit of measurement for a given measure that the trigger
     *         uses when fetching metrics to examine.
     */
    public void setCustomUnit(String customUnit) {
        this.customUnit = customUnit;
    }
    
    /**
     * The standard unit of measurement for a given measure that the trigger
     * uses when fetching metrics to examine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param customUnit The standard unit of measurement for a given measure that the trigger
     *         uses when fetching metrics to examine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withCustomUnit(String customUnit) {
        this.customUnit = customUnit;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\u0039\u003b-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return 
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\u0039\u003b-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param namespace 
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\u0039\u003b-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param namespace 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    
    /**
     * The lower limit for the metric. If all data points in the last
     * BreachDuration seconds fall below the lower threshold or exceed the
     * upper threshold, the trigger activates.
     *
     * @return The lower limit for the metric. If all data points in the last
     *         BreachDuration seconds fall below the lower threshold or exceed the
     *         upper threshold, the trigger activates.
     */
    public Double getLowerThreshold() {
        return lowerThreshold;
    }
    
    /**
     * The lower limit for the metric. If all data points in the last
     * BreachDuration seconds fall below the lower threshold or exceed the
     * upper threshold, the trigger activates.
     *
     * @param lowerThreshold The lower limit for the metric. If all data points in the last
     *         BreachDuration seconds fall below the lower threshold or exceed the
     *         upper threshold, the trigger activates.
     */
    public void setLowerThreshold(Double lowerThreshold) {
        this.lowerThreshold = lowerThreshold;
    }
    
    /**
     * The lower limit for the metric. If all data points in the last
     * BreachDuration seconds fall below the lower threshold or exceed the
     * upper threshold, the trigger activates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lowerThreshold The lower limit for the metric. If all data points in the last
     *         BreachDuration seconds fall below the lower threshold or exceed the
     *         upper threshold, the trigger activates.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withLowerThreshold(Double lowerThreshold) {
        this.lowerThreshold = lowerThreshold;
        return this;
    }
    
    
    /**
     * The incremental amount to use when performing scaling activities after
     * the lower threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The incremental amount to use when performing scaling activities after
     *         the lower threshold has been breached.
     */
    public String getLowerBreachScaleIncrement() {
        return lowerBreachScaleIncrement;
    }
    
    /**
     * The incremental amount to use when performing scaling activities after
     * the lower threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lowerBreachScaleIncrement The incremental amount to use when performing scaling activities after
     *         the lower threshold has been breached.
     */
    public void setLowerBreachScaleIncrement(String lowerBreachScaleIncrement) {
        this.lowerBreachScaleIncrement = lowerBreachScaleIncrement;
    }
    
    /**
     * The incremental amount to use when performing scaling activities after
     * the lower threshold has been breached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lowerBreachScaleIncrement The incremental amount to use when performing scaling activities after
     *         the lower threshold has been breached.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withLowerBreachScaleIncrement(String lowerBreachScaleIncrement) {
        this.lowerBreachScaleIncrement = lowerBreachScaleIncrement;
        return this;
    }
    
    
    /**
     * The upper limit for the metric. If all data points in the last
     * BreachDuration seconds fall below the lower threshold or exceed the
     * upper threshold, the trigger activates.
     *
     * @return The upper limit for the metric. If all data points in the last
     *         BreachDuration seconds fall below the lower threshold or exceed the
     *         upper threshold, the trigger activates.
     */
    public Double getUpperThreshold() {
        return upperThreshold;
    }
    
    /**
     * The upper limit for the metric. If all data points in the last
     * BreachDuration seconds fall below the lower threshold or exceed the
     * upper threshold, the trigger activates.
     *
     * @param upperThreshold The upper limit for the metric. If all data points in the last
     *         BreachDuration seconds fall below the lower threshold or exceed the
     *         upper threshold, the trigger activates.
     */
    public void setUpperThreshold(Double upperThreshold) {
        this.upperThreshold = upperThreshold;
    }
    
    /**
     * The upper limit for the metric. If all data points in the last
     * BreachDuration seconds fall below the lower threshold or exceed the
     * upper threshold, the trigger activates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param upperThreshold The upper limit for the metric. If all data points in the last
     *         BreachDuration seconds fall below the lower threshold or exceed the
     *         upper threshold, the trigger activates.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withUpperThreshold(Double upperThreshold) {
        this.upperThreshold = upperThreshold;
        return this;
    }
    
    
    /**
     * The incremental amount to use when performing scaling activities after
     * the upper threshold has been breached. <note> If only a positive or
     * negative number is specified, then the AutoScaling group will increase
     * or decrease by the specified number of actual instances. If positive
     * or negative number followed by a percent sign is specified, the
     * AutoScaling group will increase or decrease as a percentage. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The incremental amount to use when performing scaling activities after
     *         the upper threshold has been breached. <note> If only a positive or
     *         negative number is specified, then the AutoScaling group will increase
     *         or decrease by the specified number of actual instances. If positive
     *         or negative number followed by a percent sign is specified, the
     *         AutoScaling group will increase or decrease as a percentage. </note>
     */
    public String getUpperBreachScaleIncrement() {
        return upperBreachScaleIncrement;
    }
    
    /**
     * The incremental amount to use when performing scaling activities after
     * the upper threshold has been breached. <note> If only a positive or
     * negative number is specified, then the AutoScaling group will increase
     * or decrease by the specified number of actual instances. If positive
     * or negative number followed by a percent sign is specified, the
     * AutoScaling group will increase or decrease as a percentage. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param upperBreachScaleIncrement The incremental amount to use when performing scaling activities after
     *         the upper threshold has been breached. <note> If only a positive or
     *         negative number is specified, then the AutoScaling group will increase
     *         or decrease by the specified number of actual instances. If positive
     *         or negative number followed by a percent sign is specified, the
     *         AutoScaling group will increase or decrease as a percentage. </note>
     */
    public void setUpperBreachScaleIncrement(String upperBreachScaleIncrement) {
        this.upperBreachScaleIncrement = upperBreachScaleIncrement;
    }
    
    /**
     * The incremental amount to use when performing scaling activities after
     * the upper threshold has been breached. <note> If only a positive or
     * negative number is specified, then the AutoScaling group will increase
     * or decrease by the specified number of actual instances. If positive
     * or negative number followed by a percent sign is specified, the
     * AutoScaling group will increase or decrease as a percentage. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param upperBreachScaleIncrement The incremental amount to use when performing scaling activities after
     *         the upper threshold has been breached. <note> If only a positive or
     *         negative number is specified, then the AutoScaling group will increase
     *         or decrease by the specified number of actual instances. If positive
     *         or negative number followed by a percent sign is specified, the
     *         AutoScaling group will increase or decrease as a percentage. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withUpperBreachScaleIncrement(String upperBreachScaleIncrement) {
        this.upperBreachScaleIncrement = upperBreachScaleIncrement;
        return this;
    }
    
    
    /**
     * The amount of time, in seconds, used to evaluate and determine if a
     * breach is occurring. The service will look at data between the current
     * time and the number of seconds specified in this parameter to see if a
     * breach has occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>120 - 86400<br/>
     *
     * @return The amount of time, in seconds, used to evaluate and determine if a
     *         breach is occurring. The service will look at data between the current
     *         time and the number of seconds specified in this parameter to see if a
     *         breach has occurred.
     */
    public Integer getBreachDuration() {
        return breachDuration;
    }
    
    /**
     * The amount of time, in seconds, used to evaluate and determine if a
     * breach is occurring. The service will look at data between the current
     * time and the number of seconds specified in this parameter to see if a
     * breach has occurred.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>120 - 86400<br/>
     *
     * @param breachDuration The amount of time, in seconds, used to evaluate and determine if a
     *         breach is occurring. The service will look at data between the current
     *         time and the number of seconds specified in this parameter to see if a
     *         breach has occurred.
     */
    public void setBreachDuration(Integer breachDuration) {
        this.breachDuration = breachDuration;
    }
    
    /**
     * The amount of time, in seconds, used to evaluate and determine if a
     * breach is occurring. The service will look at data between the current
     * time and the number of seconds specified in this parameter to see if a
     * breach has occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>120 - 86400<br/>
     *
     * @param breachDuration The amount of time, in seconds, used to evaluate and determine if a
     *         breach is occurring. The service will look at data between the current
     *         time and the number of seconds specified in this parameter to see if a
     *         breach has occurred.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOrUpdateScalingTriggerRequest withBreachDuration(Integer breachDuration) {
        this.breachDuration = breachDuration;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("TriggerName: " + triggerName + ", ");
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("MeasureName: " + measureName + ", ");
        sb.append("Statistic: " + statistic + ", ");
        sb.append("Dimensions: " + dimensions + ", ");
        sb.append("Period: " + period + ", ");
        sb.append("Unit: " + unit + ", ");
        sb.append("CustomUnit: " + customUnit + ", ");
        sb.append("Namespace: " + namespace + ", ");
        sb.append("LowerThreshold: " + lowerThreshold + ", ");
        sb.append("LowerBreachScaleIncrement: " + lowerBreachScaleIncrement + ", ");
        sb.append("UpperThreshold: " + upperThreshold + ", ");
        sb.append("UpperBreachScaleIncrement: " + upperBreachScaleIncrement + ", ");
        sb.append("BreachDuration: " + breachDuration + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    