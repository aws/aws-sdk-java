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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an alarm and associates it with the specified metric or metric math expression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudWatchAlarmDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudWatchAlarmDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state.
     * </p>
     */
    private Boolean actionsEnabled;
    /**
     * <p>
     * The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state.
     * </p>
     */
    private java.util.List<String> alarmActions;
    /**
     * <p>
     * The ARN of the alarm.
     * </p>
     */
    private String alarmArn;
    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     */
    private String alarmConfigurationUpdatedTimestamp;
    /**
     * <p>
     * The description of the alarm.
     * </p>
     */
    private String alarmDescription;
    /**
     * <p>
     * The name of the alarm. If you don't specify a name, CloudFront generates a unique physical ID and uses that ID
     * for the alarm name.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic
     * value is used as the first operand.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm.
     * </p>
     */
    private Integer datapointsToAlarm;
    /**
     * <p>
     * The dimensions for the metric associated with the alarm.
     * </p>
     */
    private java.util.List<AwsCloudWatchAlarmDimensionsDetails> dimensions;
    /**
     * <p>
     * Used only for alarms based on percentiles. If <code>ignore</code>, the alarm state does not change during periods
     * with too few data points to be statistically significant. If <code>evaluate</code> or this parameter is not used,
     * the alarm is always evaluated and possibly changes state no matter how many data points are available.
     * </p>
     */
    private String evaluateLowSampleCountPercentile;
    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * The percentile statistic for the metric associated with the alarm.
     * </p>
     */
    private String extendedStatistic;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an ARN.
     * </p>
     */
    private java.util.List<String> insufficientDataActions;
    /**
     * <p>
     * The name of the metric associated with the alarm. This is required for an alarm based on a metric. For an alarm
     * based on a math expression, you use <code>Metrics</code> instead and you can't specify <code>MetricName</code>.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the metric associated with the alarm. This is required for an alarm based on a metric. For an
     * alarm based on a math expression, you can't specify <code>Namespace</code> and you use <code>Metrics</code>
     * instead.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an ARN.
     * </p>
     */
    private java.util.List<String> okActions;
    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. This is required for an alarm based on a metric.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * <p>
     * For an alarm based on a metric, you must specify either <code>Statistic</code> or <code>ExtendedStatistic</code>
     * but not both.
     * </p>
     * <p>
     * For an alarm based on a math expression, you can't specify <code>Statistic</code>. Instead, you use
     * <code>Metrics</code>.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The value to compare with the specified statistic.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * n an alarm based on an anomaly detection model, this is the ID of the <code>ANOMALY_DETECTION_BAND</code>
     * function used as the threshold for the alarm.
     * </p>
     */
    private String thresholdMetricId;
    /**
     * <p>
     * Sets how this alarm is to handle missing data points.
     * </p>
     */
    private String treatMissingData;
    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     */
    private String unit;

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

    public AwsCloudWatchAlarmDetails withActionsEnabled(Boolean actionsEnabled) {
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
     * The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state.
     * </p>
     * 
     * @return The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions
     *         into an <code>ALARM</code> state from any other state.
     */

    public java.util.List<String> getAlarmActions() {
        return alarmActions;
    }

    /**
     * <p>
     * The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state.
     * </p>
     * 
     * @param alarmActions
     *        The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into
     *        an <code>ALARM</code> state from any other state.
     */

    public void setAlarmActions(java.util.Collection<String> alarmActions) {
        if (alarmActions == null) {
            this.alarmActions = null;
            return;
        }

        this.alarmActions = new java.util.ArrayList<String>(alarmActions);
    }

    /**
     * <p>
     * The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmActions(java.util.Collection)} or {@link #withAlarmActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmActions
     *        The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into
     *        an <code>ALARM</code> state from any other state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withAlarmActions(String... alarmActions) {
        if (this.alarmActions == null) {
            setAlarmActions(new java.util.ArrayList<String>(alarmActions.length));
        }
        for (String ele : alarmActions) {
            this.alarmActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into an
     * <code>ALARM</code> state from any other state.
     * </p>
     * 
     * @param alarmActions
     *        The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into
     *        an <code>ALARM</code> state from any other state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withAlarmActions(java.util.Collection<String> alarmActions) {
        setAlarmActions(alarmActions);
        return this;
    }

    /**
     * <p>
     * The ARN of the alarm.
     * </p>
     * 
     * @param alarmArn
     *        The ARN of the alarm.
     */

    public void setAlarmArn(String alarmArn) {
        this.alarmArn = alarmArn;
    }

    /**
     * <p>
     * The ARN of the alarm.
     * </p>
     * 
     * @return The ARN of the alarm.
     */

    public String getAlarmArn() {
        return this.alarmArn;
    }

    /**
     * <p>
     * The ARN of the alarm.
     * </p>
     * 
     * @param alarmArn
     *        The ARN of the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withAlarmArn(String alarmArn) {
        setAlarmArn(alarmArn);
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

    public void setAlarmConfigurationUpdatedTimestamp(String alarmConfigurationUpdatedTimestamp) {
        this.alarmConfigurationUpdatedTimestamp = alarmConfigurationUpdatedTimestamp;
    }

    /**
     * <p>
     * The time stamp of the last update to the alarm configuration.
     * </p>
     * 
     * @return The time stamp of the last update to the alarm configuration.
     */

    public String getAlarmConfigurationUpdatedTimestamp() {
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

    public AwsCloudWatchAlarmDetails withAlarmConfigurationUpdatedTimestamp(String alarmConfigurationUpdatedTimestamp) {
        setAlarmConfigurationUpdatedTimestamp(alarmConfigurationUpdatedTimestamp);
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

    public AwsCloudWatchAlarmDetails withAlarmDescription(String alarmDescription) {
        setAlarmDescription(alarmDescription);
        return this;
    }

    /**
     * <p>
     * The name of the alarm. If you don't specify a name, CloudFront generates a unique physical ID and uses that ID
     * for the alarm name.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm. If you don't specify a name, CloudFront generates a unique physical ID and uses
     *        that ID for the alarm name.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm. If you don't specify a name, CloudFront generates a unique physical ID and uses that ID
     * for the alarm name.
     * </p>
     * 
     * @return The name of the alarm. If you don't specify a name, CloudFront generates a unique physical ID and uses
     *         that ID for the alarm name.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The name of the alarm. If you don't specify a name, CloudFront generates a unique physical ID and uses that ID
     * for the alarm name.
     * </p>
     * 
     * @param alarmName
     *        The name of the alarm. If you don't specify a name, CloudFront generates a unique physical ID and uses
     *        that ID for the alarm name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withAlarmName(String alarmName) {
        setAlarmName(alarmName);
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
     */

    public AwsCloudWatchAlarmDetails withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
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

    public AwsCloudWatchAlarmDetails withDatapointsToAlarm(Integer datapointsToAlarm) {
        setDatapointsToAlarm(datapointsToAlarm);
        return this;
    }

    /**
     * <p>
     * The dimensions for the metric associated with the alarm.
     * </p>
     * 
     * @return The dimensions for the metric associated with the alarm.
     */

    public java.util.List<AwsCloudWatchAlarmDimensionsDetails> getDimensions() {
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

    public void setDimensions(java.util.Collection<AwsCloudWatchAlarmDimensionsDetails> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<AwsCloudWatchAlarmDimensionsDetails>(dimensions);
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

    public AwsCloudWatchAlarmDetails withDimensions(AwsCloudWatchAlarmDimensionsDetails... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<AwsCloudWatchAlarmDimensionsDetails>(dimensions.length));
        }
        for (AwsCloudWatchAlarmDimensionsDetails ele : dimensions) {
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

    public AwsCloudWatchAlarmDetails withDimensions(java.util.Collection<AwsCloudWatchAlarmDimensionsDetails> dimensions) {
        setDimensions(dimensions);
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

    public AwsCloudWatchAlarmDetails withEvaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
        setEvaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile);
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

    public AwsCloudWatchAlarmDetails withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * The percentile statistic for the metric associated with the alarm.
     * </p>
     * 
     * @param extendedStatistic
     *        The percentile statistic for the metric associated with the alarm.
     */

    public void setExtendedStatistic(String extendedStatistic) {
        this.extendedStatistic = extendedStatistic;
    }

    /**
     * <p>
     * The percentile statistic for the metric associated with the alarm.
     * </p>
     * 
     * @return The percentile statistic for the metric associated with the alarm.
     */

    public String getExtendedStatistic() {
        return this.extendedStatistic;
    }

    /**
     * <p>
     * The percentile statistic for the metric associated with the alarm.
     * </p>
     * 
     * @param extendedStatistic
     *        The percentile statistic for the metric associated with the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withExtendedStatistic(String extendedStatistic) {
        setExtendedStatistic(extendedStatistic);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an ARN.
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *         other state. Each action is specified as an ARN.
     */

    public java.util.List<String> getInsufficientDataActions() {
        return insufficientDataActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an ARN.
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an ARN.
     */

    public void setInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        if (insufficientDataActions == null) {
            this.insufficientDataActions = null;
            return;
        }

        this.insufficientDataActions = new java.util.ArrayList<String>(insufficientDataActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsufficientDataActions(java.util.Collection)} or
     * {@link #withInsufficientDataActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withInsufficientDataActions(String... insufficientDataActions) {
        if (this.insufficientDataActions == null) {
            setInsufficientDataActions(new java.util.ArrayList<String>(insufficientDataActions.length));
        }
        for (String ele : insufficientDataActions) {
            this.insufficientDataActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an ARN.
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        setInsufficientDataActions(insufficientDataActions);
        return this;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm. This is required for an alarm based on a metric. For an alarm
     * based on a math expression, you use <code>Metrics</code> instead and you can't specify <code>MetricName</code>.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the alarm. This is required for an alarm based on a metric. For an
     *        alarm based on a math expression, you use <code>Metrics</code> instead and you can't specify
     *        <code>MetricName</code>.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm. This is required for an alarm based on a metric. For an alarm
     * based on a math expression, you use <code>Metrics</code> instead and you can't specify <code>MetricName</code>.
     * </p>
     * 
     * @return The name of the metric associated with the alarm. This is required for an alarm based on a metric. For an
     *         alarm based on a math expression, you use <code>Metrics</code> instead and you can't specify
     *         <code>MetricName</code>.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric associated with the alarm. This is required for an alarm based on a metric. For an alarm
     * based on a math expression, you use <code>Metrics</code> instead and you can't specify <code>MetricName</code>.
     * </p>
     * 
     * @param metricName
     *        The name of the metric associated with the alarm. This is required for an alarm based on a metric. For an
     *        alarm based on a math expression, you use <code>Metrics</code> instead and you can't specify
     *        <code>MetricName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the metric associated with the alarm. This is required for an alarm based on a metric. For an
     * alarm based on a math expression, you can't specify <code>Namespace</code> and you use <code>Metrics</code>
     * instead.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric associated with the alarm. This is required for an alarm based on a metric.
     *        For an alarm based on a math expression, you can't specify <code>Namespace</code> and you use
     *        <code>Metrics</code> instead.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric associated with the alarm. This is required for an alarm based on a metric. For an
     * alarm based on a math expression, you can't specify <code>Namespace</code> and you use <code>Metrics</code>
     * instead.
     * </p>
     * 
     * @return The namespace of the metric associated with the alarm. This is required for an alarm based on a metric.
     *         For an alarm based on a math expression, you can't specify <code>Namespace</code> and you use
     *         <code>Metrics</code> instead.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric associated with the alarm. This is required for an alarm based on a metric. For an
     * alarm based on a math expression, you can't specify <code>Namespace</code> and you use <code>Metrics</code>
     * instead.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric associated with the alarm. This is required for an alarm based on a metric.
     *        For an alarm based on a math expression, you can't specify <code>Namespace</code> and you use
     *        <code>Metrics</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an ARN.
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>OK</code> state from any other state.
     *         Each action is specified as an ARN.
     */

    public java.util.List<String> getOkActions() {
        return okActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an ARN.
     * </p>
     * 
     * @param okActions
     *        The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each
     *        action is specified as an ARN.
     */

    public void setOkActions(java.util.Collection<String> okActions) {
        if (okActions == null) {
            this.okActions = null;
            return;
        }

        this.okActions = new java.util.ArrayList<String>(okActions);
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOkActions(java.util.Collection)} or {@link #withOkActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param okActions
     *        The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each
     *        action is specified as an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withOkActions(String... okActions) {
        if (this.okActions == null) {
            setOkActions(new java.util.ArrayList<String>(okActions.length));
        }
        for (String ele : okActions) {
            this.okActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each action
     * is specified as an ARN.
     * </p>
     * 
     * @param okActions
     *        The actions to execute when this alarm transitions to the <code>OK</code> state from any other state. Each
     *        action is specified as an ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withOkActions(java.util.Collection<String> okActions) {
        setOkActions(okActions);
        return this;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. This is required for an alarm based on a metric.
     * </p>
     * 
     * @param period
     *        The period, in seconds, over which the statistic is applied. This is required for an alarm based on a
     *        metric.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. This is required for an alarm based on a metric.
     * </p>
     * 
     * @return The period, in seconds, over which the statistic is applied. This is required for an alarm based on a
     *         metric.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. This is required for an alarm based on a metric.
     * </p>
     * 
     * @param period
     *        The period, in seconds, over which the statistic is applied. This is required for an alarm based on a
     *        metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * <p>
     * For an alarm based on a metric, you must specify either <code>Statistic</code> or <code>ExtendedStatistic</code>
     * but not both.
     * </p>
     * <p>
     * For an alarm based on a math expression, you can't specify <code>Statistic</code>. Instead, you use
     * <code>Metrics</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm, other than percentile. For percentile statistics,
     *        use <code>ExtendedStatistic</code>.</p>
     *        <p>
     *        For an alarm based on a metric, you must specify either <code>Statistic</code> or
     *        <code>ExtendedStatistic</code> but not both.
     *        </p>
     *        <p>
     *        For an alarm based on a math expression, you can't specify <code>Statistic</code>. Instead, you use
     *        <code>Metrics</code>.
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * <p>
     * For an alarm based on a metric, you must specify either <code>Statistic</code> or <code>ExtendedStatistic</code>
     * but not both.
     * </p>
     * <p>
     * For an alarm based on a math expression, you can't specify <code>Statistic</code>. Instead, you use
     * <code>Metrics</code>.
     * </p>
     * 
     * @return The statistic for the metric associated with the alarm, other than percentile. For percentile statistics,
     *         use <code>ExtendedStatistic</code>.</p>
     *         <p>
     *         For an alarm based on a metric, you must specify either <code>Statistic</code> or
     *         <code>ExtendedStatistic</code> but not both.
     *         </p>
     *         <p>
     *         For an alarm based on a math expression, you can't specify <code>Statistic</code>. Instead, you use
     *         <code>Metrics</code>.
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use
     * <code>ExtendedStatistic</code>.
     * </p>
     * <p>
     * For an alarm based on a metric, you must specify either <code>Statistic</code> or <code>ExtendedStatistic</code>
     * but not both.
     * </p>
     * <p>
     * For an alarm based on a math expression, you can't specify <code>Statistic</code>. Instead, you use
     * <code>Metrics</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric associated with the alarm, other than percentile. For percentile statistics,
     *        use <code>ExtendedStatistic</code>.</p>
     *        <p>
     *        For an alarm based on a metric, you must specify either <code>Statistic</code> or
     *        <code>ExtendedStatistic</code> but not both.
     *        </p>
     *        <p>
     *        For an alarm based on a math expression, you can't specify <code>Statistic</code>. Instead, you use
     *        <code>Metrics</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withStatistic(String statistic) {
        setStatistic(statistic);
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

    public AwsCloudWatchAlarmDetails withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * n an alarm based on an anomaly detection model, this is the ID of the <code>ANOMALY_DETECTION_BAND</code>
     * function used as the threshold for the alarm.
     * </p>
     * 
     * @param thresholdMetricId
     *        n an alarm based on an anomaly detection model, this is the ID of the <code>ANOMALY_DETECTION_BAND</code>
     *        function used as the threshold for the alarm.
     */

    public void setThresholdMetricId(String thresholdMetricId) {
        this.thresholdMetricId = thresholdMetricId;
    }

    /**
     * <p>
     * n an alarm based on an anomaly detection model, this is the ID of the <code>ANOMALY_DETECTION_BAND</code>
     * function used as the threshold for the alarm.
     * </p>
     * 
     * @return n an alarm based on an anomaly detection model, this is the ID of the <code>ANOMALY_DETECTION_BAND</code>
     *         function used as the threshold for the alarm.
     */

    public String getThresholdMetricId() {
        return this.thresholdMetricId;
    }

    /**
     * <p>
     * n an alarm based on an anomaly detection model, this is the ID of the <code>ANOMALY_DETECTION_BAND</code>
     * function used as the threshold for the alarm.
     * </p>
     * 
     * @param thresholdMetricId
     *        n an alarm based on an anomaly detection model, this is the ID of the <code>ANOMALY_DETECTION_BAND</code>
     *        function used as the threshold for the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withThresholdMetricId(String thresholdMetricId) {
        setThresholdMetricId(thresholdMetricId);
        return this;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points.
     * </p>
     * 
     * @param treatMissingData
     *        Sets how this alarm is to handle missing data points.
     */

    public void setTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points.
     * </p>
     * 
     * @return Sets how this alarm is to handle missing data points.
     */

    public String getTreatMissingData() {
        return this.treatMissingData;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points.
     * </p>
     * 
     * @param treatMissingData
     *        Sets how this alarm is to handle missing data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudWatchAlarmDetails withTreatMissingData(String treatMissingData) {
        setTreatMissingData(treatMissingData);
        return this;
    }

    /**
     * <p>
     * The unit of the metric associated with the alarm.
     * </p>
     * 
     * @param unit
     *        The unit of the metric associated with the alarm.
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
     */

    public AwsCloudWatchAlarmDetails withUnit(String unit) {
        setUnit(unit);
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
        if (getActionsEnabled() != null)
            sb.append("ActionsEnabled: ").append(getActionsEnabled()).append(",");
        if (getAlarmActions() != null)
            sb.append("AlarmActions: ").append(getAlarmActions()).append(",");
        if (getAlarmArn() != null)
            sb.append("AlarmArn: ").append(getAlarmArn()).append(",");
        if (getAlarmConfigurationUpdatedTimestamp() != null)
            sb.append("AlarmConfigurationUpdatedTimestamp: ").append(getAlarmConfigurationUpdatedTimestamp()).append(",");
        if (getAlarmDescription() != null)
            sb.append("AlarmDescription: ").append(getAlarmDescription()).append(",");
        if (getAlarmName() != null)
            sb.append("AlarmName: ").append(getAlarmName()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getDatapointsToAlarm() != null)
            sb.append("DatapointsToAlarm: ").append(getDatapointsToAlarm()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getEvaluateLowSampleCountPercentile() != null)
            sb.append("EvaluateLowSampleCountPercentile: ").append(getEvaluateLowSampleCountPercentile()).append(",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: ").append(getEvaluationPeriods()).append(",");
        if (getExtendedStatistic() != null)
            sb.append("ExtendedStatistic: ").append(getExtendedStatistic()).append(",");
        if (getInsufficientDataActions() != null)
            sb.append("InsufficientDataActions: ").append(getInsufficientDataActions()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getOkActions() != null)
            sb.append("OkActions: ").append(getOkActions()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getThresholdMetricId() != null)
            sb.append("ThresholdMetricId: ").append(getThresholdMetricId()).append(",");
        if (getTreatMissingData() != null)
            sb.append("TreatMissingData: ").append(getTreatMissingData()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudWatchAlarmDetails == false)
            return false;
        AwsCloudWatchAlarmDetails other = (AwsCloudWatchAlarmDetails) obj;
        if (other.getActionsEnabled() == null ^ this.getActionsEnabled() == null)
            return false;
        if (other.getActionsEnabled() != null && other.getActionsEnabled().equals(this.getActionsEnabled()) == false)
            return false;
        if (other.getAlarmActions() == null ^ this.getAlarmActions() == null)
            return false;
        if (other.getAlarmActions() != null && other.getAlarmActions().equals(this.getAlarmActions()) == false)
            return false;
        if (other.getAlarmArn() == null ^ this.getAlarmArn() == null)
            return false;
        if (other.getAlarmArn() != null && other.getAlarmArn().equals(this.getAlarmArn()) == false)
            return false;
        if (other.getAlarmConfigurationUpdatedTimestamp() == null ^ this.getAlarmConfigurationUpdatedTimestamp() == null)
            return false;
        if (other.getAlarmConfigurationUpdatedTimestamp() != null
                && other.getAlarmConfigurationUpdatedTimestamp().equals(this.getAlarmConfigurationUpdatedTimestamp()) == false)
            return false;
        if (other.getAlarmDescription() == null ^ this.getAlarmDescription() == null)
            return false;
        if (other.getAlarmDescription() != null && other.getAlarmDescription().equals(this.getAlarmDescription()) == false)
            return false;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getDatapointsToAlarm() == null ^ this.getDatapointsToAlarm() == null)
            return false;
        if (other.getDatapointsToAlarm() != null && other.getDatapointsToAlarm().equals(this.getDatapointsToAlarm()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getEvaluateLowSampleCountPercentile() == null ^ this.getEvaluateLowSampleCountPercentile() == null)
            return false;
        if (other.getEvaluateLowSampleCountPercentile() != null
                && other.getEvaluateLowSampleCountPercentile().equals(this.getEvaluateLowSampleCountPercentile()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getExtendedStatistic() == null ^ this.getExtendedStatistic() == null)
            return false;
        if (other.getExtendedStatistic() != null && other.getExtendedStatistic().equals(this.getExtendedStatistic()) == false)
            return false;
        if (other.getInsufficientDataActions() == null ^ this.getInsufficientDataActions() == null)
            return false;
        if (other.getInsufficientDataActions() != null && other.getInsufficientDataActions().equals(this.getInsufficientDataActions()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getOkActions() == null ^ this.getOkActions() == null)
            return false;
        if (other.getOkActions() != null && other.getOkActions().equals(this.getOkActions()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getThresholdMetricId() == null ^ this.getThresholdMetricId() == null)
            return false;
        if (other.getThresholdMetricId() != null && other.getThresholdMetricId().equals(this.getThresholdMetricId()) == false)
            return false;
        if (other.getTreatMissingData() == null ^ this.getTreatMissingData() == null)
            return false;
        if (other.getTreatMissingData() != null && other.getTreatMissingData().equals(this.getTreatMissingData()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionsEnabled() == null) ? 0 : getActionsEnabled().hashCode());
        hashCode = prime * hashCode + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode());
        hashCode = prime * hashCode + ((getAlarmArn() == null) ? 0 : getAlarmArn().hashCode());
        hashCode = prime * hashCode + ((getAlarmConfigurationUpdatedTimestamp() == null) ? 0 : getAlarmConfigurationUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAlarmDescription() == null) ? 0 : getAlarmDescription().hashCode());
        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getDatapointsToAlarm() == null) ? 0 : getDatapointsToAlarm().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getEvaluateLowSampleCountPercentile() == null) ? 0 : getEvaluateLowSampleCountPercentile().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getExtendedStatistic() == null) ? 0 : getExtendedStatistic().hashCode());
        hashCode = prime * hashCode + ((getInsufficientDataActions() == null) ? 0 : getInsufficientDataActions().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getOkActions() == null) ? 0 : getOkActions().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getThresholdMetricId() == null) ? 0 : getThresholdMetricId().hashCode());
        hashCode = prime * hashCode + ((getTreatMissingData() == null) ? 0 : getTreatMissingData().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudWatchAlarmDetails clone() {
        try {
            return (AwsCloudWatchAlarmDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudWatchAlarmDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
