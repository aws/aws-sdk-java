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

/**
 * <p>
 * The Trigger data type.
 * </p>
 */
public class Trigger {

    /**
     * Contains the name of the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String triggerName;

    /**
     * Contains the name of the <a>AutoScalingGroup</a> to which the trigger
     * belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * Contains the measure name used by the trigger to determine when to
     * fire.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String measureName;

    /**
     * Contains the statistic used by the trigger to determine which metric
     * statistics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Average|Sum|Minimum|Maximum)<br/>
     */
    private String statistic;

    /**
     * Contains the dimensions used to retrieve metric statistics that the
     * trigger uses to determine when to fire.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<Dimension> dimensions;

    /**
     * Specifies the period used in retrieving metric statistics used by the
     * trigger to determine when to fire.
     */
    private Integer period;

    /**
     * Contains the standard unit associated with a measure; used by the
     * trigger when fetching the metric statistics it uses to determine when
     * to activate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     */
    private String unit;

    /**
     * 
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
     * Specifies the lower limit for the metric.
     */
    private Double lowerThreshold;

    /**
     * Specifies the incremental amount to use when performing scaling
     * activities when the lower threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String lowerBreachScaleIncrement;

    /**
     * Specifies the upper limit of the metric used.
     */
    private Double upperThreshold;

    /**
     * Specifies the incremental amount to use when performing scaling
     * activities when the upper threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String upperBreachScaleIncrement;

    /**
     * Specifies the amount of time to wait while the trigger is firing
     * before performing scaling activities in response to the breach.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>120 - 86400<br/>
     */
    private Integer breachDuration;

    /**
     * Provides the current status of the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String status;

    /**
     * Contains the creation date and time for the trigger.
     */
    private java.util.Date createdTime;

    /**
     * Contains the name of the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains the name of the trigger.
     */
    public String getTriggerName() {
        return triggerName;
    }
    
    /**
     * Contains the name of the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param triggerName Contains the name of the trigger.
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }
    
    /**
     * Contains the name of the trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param triggerName Contains the name of the trigger.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    
    
    /**
     * Contains the name of the <a>AutoScalingGroup</a> to which the trigger
     * belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains the name of the <a>AutoScalingGroup</a> to which the trigger
     *         belongs.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * Contains the name of the <a>AutoScalingGroup</a> to which the trigger
     * belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName Contains the name of the <a>AutoScalingGroup</a> to which the trigger
     *         belongs.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * Contains the name of the <a>AutoScalingGroup</a> to which the trigger
     * belongs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName Contains the name of the <a>AutoScalingGroup</a> to which the trigger
     *         belongs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * Contains the measure name used by the trigger to determine when to
     * fire.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains the measure name used by the trigger to determine when to
     *         fire.
     */
    public String getMeasureName() {
        return measureName;
    }
    
    /**
     * Contains the measure name used by the trigger to determine when to
     * fire.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param measureName Contains the measure name used by the trigger to determine when to
     *         fire.
     */
    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }
    
    /**
     * Contains the measure name used by the trigger to determine when to
     * fire.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param measureName Contains the measure name used by the trigger to determine when to
     *         fire.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withMeasureName(String measureName) {
        this.measureName = measureName;
        return this;
    }
    
    
    /**
     * Contains the statistic used by the trigger to determine which metric
     * statistics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Average|Sum|Minimum|Maximum)<br/>
     *
     * @return Contains the statistic used by the trigger to determine which metric
     *         statistics to examine.
     */
    public String getStatistic() {
        return statistic;
    }
    
    /**
     * Contains the statistic used by the trigger to determine which metric
     * statistics to examine.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Average|Sum|Minimum|Maximum)<br/>
     *
     * @param statistic Contains the statistic used by the trigger to determine which metric
     *         statistics to examine.
     */
    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }
    
    /**
     * Contains the statistic used by the trigger to determine which metric
     * statistics to examine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Average|Sum|Minimum|Maximum)<br/>
     *
     * @param statistic Contains the statistic used by the trigger to determine which metric
     *         statistics to examine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }
    
    
    /**
     * Contains the dimensions used to retrieve metric statistics that the
     * trigger uses to determine when to fire.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Contains the dimensions used to retrieve metric statistics that the
     *         trigger uses to determine when to fire.
     */
    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new java.util.ArrayList<Dimension>();
        }
        return dimensions;
    }
    
    /**
     * Contains the dimensions used to retrieve metric statistics that the
     * trigger uses to determine when to fire.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param dimensions Contains the dimensions used to retrieve metric statistics that the
     *         trigger uses to determine when to fire.
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;
    }
    
    /**
     * Contains the dimensions used to retrieve metric statistics that the
     * trigger uses to determine when to fire.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param dimensions Contains the dimensions used to retrieve metric statistics that the
     *         trigger uses to determine when to fire.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withDimensions(Dimension... dimensions) {
        for (Dimension value : dimensions) {
            getDimensions().add(value);
        }
        return this;
    }
    
    /**
     * Contains the dimensions used to retrieve metric statistics that the
     * trigger uses to determine when to fire.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param dimensions Contains the dimensions used to retrieve metric statistics that the
     *         trigger uses to determine when to fire.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withDimensions(java.util.Collection<Dimension> dimensions) {
        java.util.List<Dimension> dimensionsCopy = new java.util.ArrayList<Dimension>();
        if (dimensions != null) {
            dimensionsCopy.addAll(dimensions);
        }
        this.dimensions = dimensionsCopy;

        return this;
    }
    
    /**
     * Specifies the period used in retrieving metric statistics used by the
     * trigger to determine when to fire.
     *
     * @return Specifies the period used in retrieving metric statistics used by the
     *         trigger to determine when to fire.
     */
    public Integer getPeriod() {
        return period;
    }
    
    /**
     * Specifies the period used in retrieving metric statistics used by the
     * trigger to determine when to fire.
     *
     * @param period Specifies the period used in retrieving metric statistics used by the
     *         trigger to determine when to fire.
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }
    
    /**
     * Specifies the period used in retrieving metric statistics used by the
     * trigger to determine when to fire.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param period Specifies the period used in retrieving metric statistics used by the
     *         trigger to determine when to fire.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withPeriod(Integer period) {
        this.period = period;
        return this;
    }
    
    
    /**
     * Contains the standard unit associated with a measure; used by the
     * trigger when fetching the metric statistics it uses to determine when
     * to activate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @return Contains the standard unit associated with a measure; used by the
     *         trigger when fetching the metric statistics it uses to determine when
     *         to activate.
     */
    public String getUnit() {
        return unit;
    }
    
    /**
     * Contains the standard unit associated with a measure; used by the
     * trigger when fetching the metric statistics it uses to determine when
     * to activate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @param unit Contains the standard unit associated with a measure; used by the
     *         trigger when fetching the metric statistics it uses to determine when
     *         to activate.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * Contains the standard unit associated with a measure; used by the
     * trigger when fetching the metric statistics it uses to determine when
     * to activate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(Seconds|Bytes|Bits|Percent|Count|Bytes/Second|Bits/Second|Count/Second|None)<br/>
     *
     * @param unit Contains the standard unit associated with a measure; used by the
     *         trigger when fetching the metric statistics it uses to determine when
     *         to activate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withUnit(String unit) {
        this.unit = unit;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return 
     */
    public String getCustomUnit() {
        return customUnit;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param customUnit 
     */
    public void setCustomUnit(String customUnit) {
        this.customUnit = customUnit;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param customUnit 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withCustomUnit(String customUnit) {
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
    public Trigger withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    
    /**
     * Specifies the lower limit for the metric.
     *
     * @return Specifies the lower limit for the metric.
     */
    public Double getLowerThreshold() {
        return lowerThreshold;
    }
    
    /**
     * Specifies the lower limit for the metric.
     *
     * @param lowerThreshold Specifies the lower limit for the metric.
     */
    public void setLowerThreshold(Double lowerThreshold) {
        this.lowerThreshold = lowerThreshold;
    }
    
    /**
     * Specifies the lower limit for the metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lowerThreshold Specifies the lower limit for the metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withLowerThreshold(Double lowerThreshold) {
        this.lowerThreshold = lowerThreshold;
        return this;
    }
    
    
    /**
     * Specifies the incremental amount to use when performing scaling
     * activities when the lower threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the incremental amount to use when performing scaling
     *         activities when the lower threshold has been breached.
     */
    public String getLowerBreachScaleIncrement() {
        return lowerBreachScaleIncrement;
    }
    
    /**
     * Specifies the incremental amount to use when performing scaling
     * activities when the lower threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lowerBreachScaleIncrement Specifies the incremental amount to use when performing scaling
     *         activities when the lower threshold has been breached.
     */
    public void setLowerBreachScaleIncrement(String lowerBreachScaleIncrement) {
        this.lowerBreachScaleIncrement = lowerBreachScaleIncrement;
    }
    
    /**
     * Specifies the incremental amount to use when performing scaling
     * activities when the lower threshold has been breached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lowerBreachScaleIncrement Specifies the incremental amount to use when performing scaling
     *         activities when the lower threshold has been breached.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withLowerBreachScaleIncrement(String lowerBreachScaleIncrement) {
        this.lowerBreachScaleIncrement = lowerBreachScaleIncrement;
        return this;
    }
    
    
    /**
     * Specifies the upper limit of the metric used.
     *
     * @return Specifies the upper limit of the metric used.
     */
    public Double getUpperThreshold() {
        return upperThreshold;
    }
    
    /**
     * Specifies the upper limit of the metric used.
     *
     * @param upperThreshold Specifies the upper limit of the metric used.
     */
    public void setUpperThreshold(Double upperThreshold) {
        this.upperThreshold = upperThreshold;
    }
    
    /**
     * Specifies the upper limit of the metric used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param upperThreshold Specifies the upper limit of the metric used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withUpperThreshold(Double upperThreshold) {
        this.upperThreshold = upperThreshold;
        return this;
    }
    
    
    /**
     * Specifies the incremental amount to use when performing scaling
     * activities when the upper threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the incremental amount to use when performing scaling
     *         activities when the upper threshold has been breached.
     */
    public String getUpperBreachScaleIncrement() {
        return upperBreachScaleIncrement;
    }
    
    /**
     * Specifies the incremental amount to use when performing scaling
     * activities when the upper threshold has been breached.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param upperBreachScaleIncrement Specifies the incremental amount to use when performing scaling
     *         activities when the upper threshold has been breached.
     */
    public void setUpperBreachScaleIncrement(String upperBreachScaleIncrement) {
        this.upperBreachScaleIncrement = upperBreachScaleIncrement;
    }
    
    /**
     * Specifies the incremental amount to use when performing scaling
     * activities when the upper threshold has been breached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param upperBreachScaleIncrement Specifies the incremental amount to use when performing scaling
     *         activities when the upper threshold has been breached.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withUpperBreachScaleIncrement(String upperBreachScaleIncrement) {
        this.upperBreachScaleIncrement = upperBreachScaleIncrement;
        return this;
    }
    
    
    /**
     * Specifies the amount of time to wait while the trigger is firing
     * before performing scaling activities in response to the breach.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>120 - 86400<br/>
     *
     * @return Specifies the amount of time to wait while the trigger is firing
     *         before performing scaling activities in response to the breach.
     */
    public Integer getBreachDuration() {
        return breachDuration;
    }
    
    /**
     * Specifies the amount of time to wait while the trigger is firing
     * before performing scaling activities in response to the breach.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>120 - 86400<br/>
     *
     * @param breachDuration Specifies the amount of time to wait while the trigger is firing
     *         before performing scaling activities in response to the breach.
     */
    public void setBreachDuration(Integer breachDuration) {
        this.breachDuration = breachDuration;
    }
    
    /**
     * Specifies the amount of time to wait while the trigger is firing
     * before performing scaling activities in response to the breach.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>120 - 86400<br/>
     *
     * @param breachDuration Specifies the amount of time to wait while the trigger is firing
     *         before performing scaling activities in response to the breach.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withBreachDuration(Integer breachDuration) {
        this.breachDuration = breachDuration;
        return this;
    }
    
    
    /**
     * Provides the current status of the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Provides the current status of the trigger.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Provides the current status of the trigger.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param status Provides the current status of the trigger.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Provides the current status of the trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param status Provides the current status of the trigger.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * Contains the creation date and time for the trigger.
     *
     * @return Contains the creation date and time for the trigger.
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }
    
    /**
     * Contains the creation date and time for the trigger.
     *
     * @param createdTime Contains the creation date and time for the trigger.
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }
    
    /**
     * Contains the creation date and time for the trigger.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTime Contains the creation date and time for the trigger.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Trigger withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
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
        sb.append("Status: " + status + ", ");
        sb.append("CreatedTime: " + createdTime + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    