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
 * Represents an alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricAlarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricAlarm implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alarm.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     */
    private String alarmArn;
    /**
     * <p>
     * The description of the alarm.
     * </p>
     */
    private String alarmDescription;
    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     */
    private java.util.Date alarmConfigurationUpdatedTimestamp;
    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     */
    private Boolean actionsEnabled;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> oKActions;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmActions;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> insufficientDataActions;
    /**
     * <p>
     * The state value for the alarm.
     * </p>
     */
    private String stateValue;
    /**
     * <p>
     * An explanation for the alarm state, in text format.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * An explanation for the alarm state, in JSON format.
     * </p>
     */
    private String stateReasonData;
    /**
     * <p>
     * The time stamp of the last update to the alarm state.
     * </p>
     */
    private java.util.Date stateUpdatedTimestamp;
    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the metric associated with the alarm.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * </p>
     */
    private String extendedStatistic;
    /**
     * <p>
     * The dimensions for the metric associated with the alarm.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm.
     * </p>
     */
    private Integer datapointsToAlarm;
    /**
     * <p>
     * The value to compare with the specified statistic.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic
     * value is used as the first operand.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of
     * <code>missing</code> is used.
     * </p>
     */
    private String treatMissingData;
    /**
     * <p>
     * Used only for alarms based on percentiles. If <code>ignore</code>, the alarm state does not change during periods
     * with too few data points to be statistically significant. If <code>evaluate</code> or this parameter is not used,
     * the alarm is always evaluated and possibly changes state no matter how many data points are available.
     * </p>
     */
    private String evaluateLowSampleCountPercentile;
    /** <p/> */
    private com.amazonaws.internal.SdkInternalList<MetricDataQuery> metrics;

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @return The name of the alarm.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @param alarmArn
     *        The Amazon Resource Name (ARN) of the alarm.
     */

    public void setAlarmArn(String alarmArn) {
        this.alarmArn = alarmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the alarm.
     */

    public String getAlarmArn() {
        return this.alarmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the alarm.
     * </p>
     * 
     * @param alarmArn
     *        The Amazon Resource Name (ARN) of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withAlarmArn(String alarmArn) {
        setAlarmArn(alarmArn);
        return this;
    }

    /**
     * <p>
     * The description of the alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description of the alarm.
     */

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    /**
     * <p>
     * The description of the alarm.
     * </p>
     * 
     * @return The description of the alarm.
     */

    public String getAlarmDescription() {
        return this.alarmDescription;
    }

    /**
     * <p>
     * The description of the alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withAlarmDescription(String alarmDescription) {
        setAlarmDescription(alarmDescription);
        return this;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     * 
     * @param alarmConfigurationUpdatedTimestamp
     *        The time stamp of the last update to the alarm configuration.
     */

    public void setAlarmConfigurationUpdatedTimestamp(java.util.Date alarmConfigurationUpdatedTimestamp) {
        this.alarmConfigurationUpdatedTimestamp = alarmConfigurationUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     * 
     * @return The time stamp of the last update to the alarm configuration.
     */

    public java.util.Date getAlarmConfigurationUpdatedTimestamp() {
        return this.alarmConfigurationUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     * 
     * @param alarmConfigurationUpdatedTimestamp
     *        The time stamp of the last update to the alarm configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withAlarmConfigurationUpdatedTimestamp(java.util.Date alarmConfigurationUpdatedTimestamp) {
        setAlarmConfigurationUpdatedTimestamp(alarmConfigurationUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether actions should be executed during any changes to the alarm state.
     */

    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     * 
     * @return Indicates whether actions should be executed during any changes to the alarm state.
     */

    public Boolean getActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether actions should be executed during any changes to the alarm state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withActionsEnabled(Boolean actionsEnabled) {
        setActionsEnabled(actionsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     * 
     * @return Indicates whether actions should be executed during any changes to the alarm state.
     */

    public Boolean isActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>OK</code> state from any other state.
     *         Each action is specified as an Amazon Resource Name (ARN).
     */

    public java.util.List<String> getOKActions() {
        if (oKActions == null) {
            oKActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return oKActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).
     */

    public void setOKActions(java.util.Collection<String> oKActions) {
        if (oKActions == null) {
            this.oKActions = null;
            return;
        }

        this.oKActions = new com.amazonaws.internal.SdkInternalList<String>(oKActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOKActions(java.util.Collection)} or {@link #withOKActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withOKActions(String... oKActions) {
        if (this.oKActions == null) {
            setOKActions(new com.amazonaws.internal.SdkInternalList<String>(oKActions.length));
        }
        for (String ele : oKActions) {
            this.oKActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withOKActions(java.util.Collection<String> oKActions) {
        setOKActions(oKActions);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *         Each action is specified as an Amazon Resource Name (ARN).
     */

    public java.util.List<String> getAlarmActions() {
        if (alarmActions == null) {
            alarmActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).
     */

    public void setAlarmActions(java.util.Collection<String> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
            return;
        }

        this.alarmActions = new com.amazonaws.internal.SdkInternalList<String>(alarmActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmActions(java.util.Collection)} or {@link #withAlarmActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withAlarmActions(String... alarmActions) {
        if (this.alarmActions == null) {
            setAlarmActions(new com.amazonaws.internal.SdkInternalList<String>(alarmActions.length));
        }
        for (String ele : alarmActions) {
            this.alarmActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withAlarmActions(java.util.Collection<String> alarmActions) {
        setAlarmActions(alarmActions);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *         other state. Each action is specified as an Amazon Resource Name (ARN).
     */

    public java.util.List<String> getInsufficientDataActions() {
        if (insufficientDataActions == null) {
            insufficientDataActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return insufficientDataActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).
     */

    public void setInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        if (insufficientDataActions == null) {
            this.insufficientDataActions = null;
            return;
        }

        this.insufficientDataActions = new com.amazonaws.internal.SdkInternalList<String>(insufficientDataActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsufficientDataActions(java.util.Collection)} or
     * {@link #withInsufficientDataActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withInsufficientDataActions(String... insufficientDataActions) {
        if (this.insufficientDataActions == null) {
            setInsufficientDataActions(new com.amazonaws.internal.SdkInternalList<String>(insufficientDataActions.length));
        }
        for (String ele : insufficientDataActions) {
            this.insufficientDataActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        setInsufficientDataActions(insufficientDataActions);
        return this;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @param stateValue
     *        The state value for the alarm.
     * @see StateValue
     */

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @return The state value for the alarm.
     * @see StateValue
     */

    public String getStateValue() {
        return this.stateValue;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @param stateValue
     *        The state value for the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateValue
     */

    public MetricAlarm withStateValue(String stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @param stateValue
     *        The state value for the alarm.
     * @see StateValue
     */

    public void setStateValue(StateValue stateValue) {
        withStateValue(stateValue);
    }

    /**
     * <p>
     * The state value for the alarm.
     * </p>
     * 
     * @param stateValue
     *        The state value for the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateValue
     */

    public MetricAlarm withStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
        return this;
    }

    /**
     * <p>
     * An explanation for the alarm state, in text format.
     * </p>
     * 
     * @param stateReason
     *        An explanation for the alarm state, in text format.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * An explanation for the alarm state, in text format.
     * </p>
     * 
     * @return An explanation for the alarm state, in text format.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * An explanation for the alarm state, in text format.
     * </p>
     * 
     * @param stateReason
     *        An explanation for the alarm state, in text format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * An explanation for the alarm state, in JSON format.
     * </p>
     * 
     * @param stateReasonData
     *        An explanation for the alarm state, in JSON format.
     */

    public void setStateReasonData(String stateReasonData) {
        this.stateReasonData = stateReasonData;
    }

    /**
     * <p>
     * An explanation for the alarm state, in JSON format.
     * </p>
     * 
     * @return An explanation for the alarm state, in JSON format.
     */

    public String getStateReasonData() {
        return this.stateReasonData;
    }

    /**
     * <p>
     * An explanation for the alarm state, in JSON format.
     * </p>
     * 
     * @param stateReasonData
     *        An explanation for the alarm state, in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withStateReasonData(String stateReasonData) {
        setStateReasonData(stateReasonData);
        return this;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm state.
     * </p>
     * 
     * @param stateUpdatedTimestamp
     *        The time stamp of the last update to the alarm state.
     */

    public void setStateUpdatedTimestamp(java.util.Date stateUpdatedTimestamp) {
        this.stateUpdatedTimestamp = stateUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm state.
     * </p>
     * 
     * @return The time stamp of the last update to the alarm state.
     */

    public java.util.Date getStateUpdatedTimestamp() {
        return this.stateUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm state.
     * </p>
     * 
     * @param stateUpdatedTimestamp
     *        The time stamp of the last update to the alarm state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withStateUpdatedTimestamp(java.util.Date stateUpdatedTimestamp) {
        setStateUpdatedTimestamp(stateUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the alarm.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     * 
     * @return The name of the metric associated with the alarm.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the metric associated with the alarm.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric associated with the alarm.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric associated with the alarm.
     * </p>
     * 
     * @return The namespace of the metric associated with the alarm.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric associated with the alarm.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm, other than percentile. For percentile statistics,
     *        use <code>ExtendedStatistic</code>.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * 
     * @return The statistic for the metric associated with the alarm, other than percentile. For percentile statistics,
     *         use <code>ExtendedStatistic</code>.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm, other than percentile. For percentile statistics,
     *        use <code>ExtendedStatistic</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public MetricAlarm withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm, other than percentile. For percentile statistics,
     *        use <code>ExtendedStatistic</code>.
     * @see Statistic
     */

    public void setStatistic(Statistic statistic) {
        withStatistic(statistic);
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm, other than percentile. For percentile statistics,
     *        use <code>ExtendedStatistic</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public MetricAlarm withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * </p>
     * 
     * @param extendedStatistic
     *        The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     */

    public void setExtendedStatistic(String extendedStatistic) {
        this.extendedStatistic = extendedStatistic;
    }

    /**
     * <p>
     * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * </p>
     * 
     * @return The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     */

    public String getExtendedStatistic() {
        return this.extendedStatistic;
    }

    /**
     * <p>
     * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * </p>
     * 
     * @param extendedStatistic
     *        The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withExtendedStatistic(String extendedStatistic) {
        setExtendedStatistic(extendedStatistic);
        return this;
    }

    /**
     * <p>
     * The dimensions for the metric associated with the alarm.
     * </p>
     * 
     * @return The dimensions for the metric associated with the alarm.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The dimensions for the metric associated with the alarm.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric associated with the alarm.
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
     * The dimensions for the metric associated with the alarm.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withDimensions(Dimension... dimensions) {
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
     * The dimensions for the metric associated with the alarm.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * 
     * @param period
     *        The period, in seconds, over which the statistic is applied.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * 
     * @return The period, in seconds, over which the statistic is applied.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied.
     * </p>
     * 
     * @param period
     *        The period, in seconds, over which the statistic is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @param unit
     *        The unit of the metric associated with the alarm.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @return The unit of the metric associated with the alarm.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @param unit
     *        The unit of the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricAlarm withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @param unit
     *        The unit of the metric associated with the alarm.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        withUnit(unit);
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @param unit
     *        The unit of the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricAlarm withUnit(StandardUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified threshold.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     * 
     * @return The number of periods over which data is compared to the specified threshold.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm.
     * </p>
     * 
     * @param datapointsToAlarm
     *        The number of datapoints that must be breaching to trigger the alarm.
     */

    public void setDatapointsToAlarm(Integer datapointsToAlarm) {
        this.datapointsToAlarm = datapointsToAlarm;
    }

    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm.
     * </p>
     * 
     * @return The number of datapoints that must be breaching to trigger the alarm.
     */

    public Integer getDatapointsToAlarm() {
        return this.datapointsToAlarm;
    }

    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm.
     * </p>
     * 
     * @param datapointsToAlarm
     *        The number of datapoints that must be breaching to trigger the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withDatapointsToAlarm(Integer datapointsToAlarm) {
        setDatapointsToAlarm(datapointsToAlarm);
        return this;
    }

    /**
     * <p>
     * The value to compare with the specified statistic.
     * </p>
     * 
     * @param threshold
     *        The value to compare with the specified statistic.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value to compare with the specified statistic.
     * </p>
     * 
     * @return The value to compare with the specified statistic.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value to compare with the specified statistic.
     * </p>
     * 
     * @param threshold
     *        The value to compare with the specified statistic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic
     * value is used as the first operand.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified statistic and threshold. The specified
     *        statistic value is used as the first operand.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic
     * value is used as the first operand.
     * </p>
     * 
     * @return The arithmetic operation to use when comparing the specified statistic and threshold. The specified
     *         statistic value is used as the first operand.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic
     * value is used as the first operand.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified statistic and threshold. The specified
     *        statistic value is used as the first operand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public MetricAlarm withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic
     * value is used as the first operand.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified statistic and threshold. The specified
     *        statistic value is used as the first operand.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        withComparisonOperator(comparisonOperator);
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic
     * value is used as the first operand.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified statistic and threshold. The specified
     *        statistic value is used as the first operand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public MetricAlarm withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of
     * <code>missing</code> is used.
     * </p>
     * 
     * @param treatMissingData
     *        Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior
     *        of <code>missing</code> is used.
     */

    public void setTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of
     * <code>missing</code> is used.
     * </p>
     * 
     * @return Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior
     *         of <code>missing</code> is used.
     */

    public String getTreatMissingData() {
        return this.treatMissingData;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of
     * <code>missing</code> is used.
     * </p>
     * 
     * @param treatMissingData
     *        Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior
     *        of <code>missing</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withTreatMissingData(String treatMissingData) {
        setTreatMissingData(treatMissingData);
        return this;
    }

    /**
     * <p>
     * Used only for alarms based on percentiles. If <code>ignore</code>, the alarm state does not change during periods
     * with too few data points to be statistically significant. If <code>evaluate</code> or this parameter is not used,
     * the alarm is always evaluated and possibly changes state no matter how many data points are available.
     * </p>
     * 
     * @param evaluateLowSampleCountPercentile
     *        Used only for alarms based on percentiles. If <code>ignore</code>, the alarm state does not change during
     *        periods with too few data points to be statistically significant. If <code>evaluate</code> or this
     *        parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data
     *        points are available.
     */

    public void setEvaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
        this.evaluateLowSampleCountPercentile = evaluateLowSampleCountPercentile;
    }

    /**
     * <p>
     * Used only for alarms based on percentiles. If <code>ignore</code>, the alarm state does not change during periods
     * with too few data points to be statistically significant. If <code>evaluate</code> or this parameter is not used,
     * the alarm is always evaluated and possibly changes state no matter how many data points are available.
     * </p>
     * 
     * @return Used only for alarms based on percentiles. If <code>ignore</code>, the alarm state does not change during
     *         periods with too few data points to be statistically significant. If <code>evaluate</code> or this
     *         parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data
     *         points are available.
     */

    public String getEvaluateLowSampleCountPercentile() {
        return this.evaluateLowSampleCountPercentile;
    }

    /**
     * <p>
     * Used only for alarms based on percentiles. If <code>ignore</code>, the alarm state does not change during periods
     * with too few data points to be statistically significant. If <code>evaluate</code> or this parameter is not used,
     * the alarm is always evaluated and possibly changes state no matter how many data points are available.
     * </p>
     * 
     * @param evaluateLowSampleCountPercentile
     *        Used only for alarms based on percentiles. If <code>ignore</code>, the alarm state does not change during
     *        periods with too few data points to be statistically significant. If <code>evaluate</code> or this
     *        parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data
     *        points are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withEvaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
        setEvaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<MetricDataQuery> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<MetricDataQuery>();
        }
        return metrics;
    }

    /**
     * <p/>
     * 
     * @param metrics
     */

    public void setMetrics(java.util.Collection<MetricDataQuery> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<MetricDataQuery>(metrics);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withMetrics(MetricDataQuery... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<MetricDataQuery>(metrics.length));
        }
        for (MetricDataQuery ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param metrics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricAlarm withMetrics(java.util.Collection<MetricDataQuery> metrics) {
        setMetrics(metrics);
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
        if (getAlarmName() != null)
            sb.append("AlarmName: ").append(getAlarmName()).append(",");
        if (getAlarmArn() != null)
            sb.append("AlarmArn: ").append(getAlarmArn()).append(",");
        if (getAlarmDescription() != null)
            sb.append("AlarmDescription: ").append(getAlarmDescription()).append(",");
        if (getAlarmConfigurationUpdatedTimestamp() != null)
            sb.append("AlarmConfigurationUpdatedTimestamp: ").append(getAlarmConfigurationUpdatedTimestamp()).append(",");
        if (getActionsEnabled() != null)
            sb.append("ActionsEnabled: ").append(getActionsEnabled()).append(",");
        if (getOKActions() != null)
            sb.append("OKActions: ").append(getOKActions()).append(",");
        if (getAlarmActions() != null)
            sb.append("AlarmActions: ").append(getAlarmActions()).append(",");
        if (getInsufficientDataActions() != null)
            sb.append("InsufficientDataActions: ").append(getInsufficientDataActions()).append(",");
        if (getStateValue() != null)
            sb.append("StateValue: ").append(getStateValue()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getStateReasonData() != null)
            sb.append("StateReasonData: ").append(getStateReasonData()).append(",");
        if (getStateUpdatedTimestamp() != null)
            sb.append("StateUpdatedTimestamp: ").append(getStateUpdatedTimestamp()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getExtendedStatistic() != null)
            sb.append("ExtendedStatistic: ").append(getExtendedStatistic()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: ").append(getEvaluationPeriods()).append(",");
        if (getDatapointsToAlarm() != null)
            sb.append("DatapointsToAlarm: ").append(getDatapointsToAlarm()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getTreatMissingData() != null)
            sb.append("TreatMissingData: ").append(getTreatMissingData()).append(",");
        if (getEvaluateLowSampleCountPercentile() != null)
            sb.append("EvaluateLowSampleCountPercentile: ").append(getEvaluateLowSampleCountPercentile()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricAlarm == false)
            return false;
        MetricAlarm other = (MetricAlarm) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmArn() == null ^ this.getAlarmArn() == null)
            return false;
        if (other.getAlarmArn() != null && other.getAlarmArn().equals(this.getAlarmArn()) == false)
            return false;
        if (other.getAlarmDescription() == null ^ this.getAlarmDescription() == null)
            return false;
        if (other.getAlarmDescription() != null && other.getAlarmDescription().equals(this.getAlarmDescription()) == false)
            return false;
        if (other.getAlarmConfigurationUpdatedTimestamp() == null ^ this.getAlarmConfigurationUpdatedTimestamp() == null)
            return false;
        if (other.getAlarmConfigurationUpdatedTimestamp() != null
                && other.getAlarmConfigurationUpdatedTimestamp().equals(this.getAlarmConfigurationUpdatedTimestamp()) == false)
            return false;
        if (other.getActionsEnabled() == null ^ this.getActionsEnabled() == null)
            return false;
        if (other.getActionsEnabled() != null && other.getActionsEnabled().equals(this.getActionsEnabled()) == false)
            return false;
        if (other.getOKActions() == null ^ this.getOKActions() == null)
            return false;
        if (other.getOKActions() != null && other.getOKActions().equals(this.getOKActions()) == false)
            return false;
        if (other.getAlarmActions() == null ^ this.getAlarmActions() == null)
            return false;
        if (other.getAlarmActions() != null && other.getAlarmActions().equals(this.getAlarmActions()) == false)
            return false;
        if (other.getInsufficientDataActions() == null ^ this.getInsufficientDataActions() == null)
            return false;
        if (other.getInsufficientDataActions() != null && other.getInsufficientDataActions().equals(this.getInsufficientDataActions()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateReasonData() == null ^ this.getStateReasonData() == null)
            return false;
        if (other.getStateReasonData() != null && other.getStateReasonData().equals(this.getStateReasonData()) == false)
            return false;
        if (other.getStateUpdatedTimestamp() == null ^ this.getStateUpdatedTimestamp() == null)
            return false;
        if (other.getStateUpdatedTimestamp() != null && other.getStateUpdatedTimestamp().equals(this.getStateUpdatedTimestamp()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getExtendedStatistic() == null ^ this.getExtendedStatistic() == null)
            return false;
        if (other.getExtendedStatistic() != null && other.getExtendedStatistic().equals(this.getExtendedStatistic()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getDatapointsToAlarm() == null ^ this.getDatapointsToAlarm() == null)
            return false;
        if (other.getDatapointsToAlarm() != null && other.getDatapointsToAlarm().equals(this.getDatapointsToAlarm()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getTreatMissingData() == null ^ this.getTreatMissingData() == null)
            return false;
        if (other.getTreatMissingData() != null && other.getTreatMissingData().equals(this.getTreatMissingData()) == false)
            return false;
        if (other.getEvaluateLowSampleCountPercentile() == null ^ this.getEvaluateLowSampleCountPercentile() == null)
            return false;
        if (other.getEvaluateLowSampleCountPercentile() != null
                && other.getEvaluateLowSampleCountPercentile().equals(this.getEvaluateLowSampleCountPercentile()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getAlarmArn() == null) ? 0 : getAlarmArn().hashCode());
        hashCode = prime * hashCode + ((getAlarmDescription() == null) ? 0 : getAlarmDescription().hashCode());
        hashCode = prime * hashCode + ((getAlarmConfigurationUpdatedTimestamp() == null) ? 0 : getAlarmConfigurationUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getActionsEnabled() == null) ? 0 : getActionsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOKActions() == null) ? 0 : getOKActions().hashCode());
        hashCode = prime * hashCode + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode());
        hashCode = prime * hashCode + ((getInsufficientDataActions() == null) ? 0 : getInsufficientDataActions().hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getStateReasonData() == null) ? 0 : getStateReasonData().hashCode());
        hashCode = prime * hashCode + ((getStateUpdatedTimestamp() == null) ? 0 : getStateUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getExtendedStatistic() == null) ? 0 : getExtendedStatistic().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getDatapointsToAlarm() == null) ? 0 : getDatapointsToAlarm().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getTreatMissingData() == null) ? 0 : getTreatMissingData().hashCode());
        hashCode = prime * hashCode + ((getEvaluateLowSampleCountPercentile() == null) ? 0 : getEvaluateLowSampleCountPercentile().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public MetricAlarm clone() {
        try {
            return (MetricAlarm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
