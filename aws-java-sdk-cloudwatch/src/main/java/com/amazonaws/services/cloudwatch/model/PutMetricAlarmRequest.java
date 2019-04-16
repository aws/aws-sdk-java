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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutMetricAlarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMetricAlarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the alarm. This name must be unique within your AWS account.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The description for the alarm.
     * </p>
     */
    private String alarmDescription;
    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * </p>
     */
    private Boolean actionsEnabled;
    /**
     * <p>
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> oKActions;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmActions;
    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> insufficientDataActions;
    /**
     * <p>
     * The name for the metric associated with the alarm.
     * </p>
     * <p>
     * If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters. Instead, you specify all this information in the <code>Metrics</code>
     * array.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace for the metric associated specified in <code>MetricName</code>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     * statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     * <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but
     * not both.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The percentile statistic for the metric specified in <code>MetricName</code>. Specify a value between p0.0 and
     * p100. When you call <code>PutMetricAlarm</code> and specify a <code>MetricName</code>, you must specify either
     * <code>Statistic</code> or <code>ExtendedStatistic,</code> but not both.
     * </p>
     */
    private String extendedStatistic;
    /**
     * <p>
     * The dimensions for the metric specified in <code>MetricName</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The length, in seconds, used each time the metric specified in <code>MetricName</code> is evaluated. Valid values
     * are 10, 30, and any multiple of 60.
     * </p>
     * <p>
     * Be sure to specify 10 or 30 only for metrics that are stored by a <code>PutMetricData</code> call with a
     * <code>StorageResolution</code> of 1. If you specify a period of 10 or 30 for a metric that does not have
     * sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In this case,
     * it does not receive data for the attempts that do not correspond to a one-minute data resolution, and the alarm
     * may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this alarm as a high-resolution
     * alarm, which has a higher charge than other alarms. For more information about pricing, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * An alarm's total current evaluation period can be no longer than one day, so <code>Period</code> multiplied by
     * <code>EvaluationPeriods</code> cannot be more than 86,400 seconds.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes
     * because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data
     * points that specify a unit of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch alarm
     * can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold. If you are setting an alarm that
     * requires that a number of consecutive data points be breaching to trigger the alarm, this value specifies that
     * number. If you are setting an "M out of N" alarm, this value is the N.
     * </p>
     * <p>
     * An alarm's total current evaluation period can be no longer than one day, so this number multiplied by
     * <code>Period</code> cannot be more than 86,400 seconds.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm. This is used only if you are setting an
     * "M out of N" alarm. In that case, this value is the M. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation"
     * >Evaluating an Alarm</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     */
    private Integer datapointsToAlarm;
    /**
     * <p>
     * The value against which the specified statistic is compared.
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
     * Sets how this alarm is to handle missing data points. If <code>TreatMissingData</code> is omitted, the default
     * behavior of <code>missing</code> is used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data"
     * >Configuring How CloudWatch Alarms Treats Missing Data</a>.
     * </p>
     * <p>
     * Valid Values: <code>breaching | notBreaching | ignore | missing</code>
     * </p>
     */
    private String treatMissingData;
    /**
     * <p>
     * Used only for alarms based on percentiles. If you specify <code>ignore</code>, the alarm state does not change
     * during periods with too few data points to be statistically significant. If you specify <code>evaluate</code> or
     * omit this parameter, the alarm is always evaluated and possibly changes state no matter how many data points are
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#percentiles-with-low-samples"
     * >Percentile-Based CloudWatch Alarms and Low Data Samples</a>.
     * </p>
     * <p>
     * Valid Values: <code>evaluate | ignore</code>
     * </p>
     */
    private String evaluateLowSampleCountPercentile;
    /**
     * <p>
     * An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the result of a
     * metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric or performs a math
     * expression.
     * </p>
     * <p>
     * One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     * expression by setting <code>ReturnValue</code> to true for this object in the array. For more information, see
     * <a>MetricDataQuery</a>.
     * </p>
     * <p>
     * If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead, you
     * retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDataQuery> metrics;
    /**
     * <p>
     * A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name for the alarm. This name must be unique within your AWS account.
     * </p>
     * 
     * @param alarmName
     *        The name for the alarm. This name must be unique within your AWS account.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name for the alarm. This name must be unique within your AWS account.
     * </p>
     * 
     * @return The name for the alarm. This name must be unique within your AWS account.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The name for the alarm. This name must be unique within your AWS account.
     * </p>
     * 
     * @param alarmName
     *        The name for the alarm. This name must be unique within your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description for the alarm.
     */

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * 
     * @return The description for the alarm.
     */

    public String getAlarmDescription() {
        return this.alarmDescription;
    }

    /**
     * <p>
     * The description for the alarm.
     * </p>
     * 
     * @param alarmDescription
     *        The description for the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withAlarmDescription(String alarmDescription) {
        setAlarmDescription(alarmDescription);
        return this;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     */

    public void setActionsEnabled(Boolean actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * </p>
     * 
     * @return Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     */

    public Boolean getActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * </p>
     * 
     * @param actionsEnabled
     *        Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withActionsEnabled(Boolean actionsEnabled) {
        setActionsEnabled(actionsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     * </p>
     * 
     * @return Indicates whether actions should be executed during any changes to the alarm state. The default is TRUE.
     */

    public Boolean isActionsEnabled() {
        return this.actionsEnabled;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each
     *         action is specified as an Amazon Resource Name (ARN).</p>
     *         <p>
     *         Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *         <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *         <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *         <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code>
     *         | <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     */

    public java.util.List<String> getOKActions() {
        if (oKActions == null) {
            oKActions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return oKActions;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
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
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOKActions(java.util.Collection)} or {@link #withOKActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withOKActions(String... oKActions) {
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
     * The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each action
     * is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @param oKActions
     *        The actions to execute when this alarm transitions to an <code>OK</code> state from any other state. Each
     *        action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withOKActions(java.util.Collection<String> oKActions) {
        setOKActions(oKActions);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state. Each
     * action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *         Each action is specified as an Amazon Resource Name (ARN).</p>
     *         <p>
     *         Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *         <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *         <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *         <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code>
     *         | <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
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
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
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
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarmActions(java.util.Collection)} or {@link #withAlarmActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withAlarmActions(String... alarmActions) {
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
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @param alarmActions
     *        The actions to execute when this alarm transitions to the <code>ALARM</code> state from any other state.
     *        Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withAlarmActions(java.util.Collection<String> alarmActions) {
        setAlarmActions(alarmActions);
        return this;
    }

    /**
     * <p>
     * The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any other
     * state. Each action is specified as an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @return The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *         other state. Each action is specified as an Amazon Resource Name (ARN).</p>
     *         <p>
     *         Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *         <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *         <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *         <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *         </p>
     *         <p>
     *         Valid Values (for use with IAM roles):
     *         <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *         <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code>
     *         | <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
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
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
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
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsufficientDataActions(java.util.Collection)} or
     * {@link #withInsufficientDataActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withInsufficientDataActions(String... insufficientDataActions) {
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
     * <p>
     * Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     * <code>arn:aws:automate:<i>region</i>:ec2:recover</code> | <code>arn:aws:automate:<i>region</i>:ec2:reboot</code>
     * | <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     * <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     * </p>
     * <p>
     * Valid Values (for use with IAM roles):
     * <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     * <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * </p>
     * 
     * @param insufficientDataActions
     *        The actions to execute when this alarm transitions to the <code>INSUFFICIENT_DATA</code> state from any
     *        other state. Each action is specified as an Amazon Resource Name (ARN).</p>
     *        <p>
     *        Valid Values: <code>arn:aws:automate:<i>region</i>:ec2:stop</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:terminate</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:recover</code> |
     *        <code>arn:aws:automate:<i>region</i>:ec2:reboot</code> |
     *        <code>arn:aws:sns:<i>region</i>:<i>account-id</i>:<i>sns-topic-name</i> </code> |
     *        <code>arn:aws:autoscaling:<i>region</i>:<i>account-id</i>:scalingPolicy:<i>policy-id</i>autoScalingGroupName/<i>group-friendly-name</i>:policyName/<i>policy-friendly-name</i> </code>
     *        </p>
     *        <p>
     *        Valid Values (for use with IAM roles):
     *        <code>&gt;arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Stop/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Terminate/1.0</code> |
     *        <code>arn:aws:swf:<i>region</i>:<i>account-id</i>:action/actions/AWS_EC2.InstanceId.Reboot/1.0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withInsufficientDataActions(java.util.Collection<String> insufficientDataActions) {
        setInsufficientDataActions(insufficientDataActions);
        return this;
    }

    /**
     * <p>
     * The name for the metric associated with the alarm.
     * </p>
     * <p>
     * If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters. Instead, you specify all this information in the <code>Metrics</code>
     * array.
     * </p>
     * 
     * @param metricName
     *        The name for the metric associated with the alarm.</p>
     *        <p>
     *        If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the
     *        <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     *        <code>ExtendedStatistic</code> parameters. Instead, you specify all this information in the
     *        <code>Metrics</code> array.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name for the metric associated with the alarm.
     * </p>
     * <p>
     * If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters. Instead, you specify all this information in the <code>Metrics</code>
     * array.
     * </p>
     * 
     * @return The name for the metric associated with the alarm.</p>
     *         <p>
     *         If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the
     *         <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     *         <code>ExtendedStatistic</code> parameters. Instead, you specify all this information in the
     *         <code>Metrics</code> array.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name for the metric associated with the alarm.
     * </p>
     * <p>
     * If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters. Instead, you specify all this information in the <code>Metrics</code>
     * array.
     * </p>
     * 
     * @param metricName
     *        The name for the metric associated with the alarm.</p>
     *        <p>
     *        If you are creating an alarm based on a math expression, you cannot specify this parameter, or any of the
     *        <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     *        <code>ExtendedStatistic</code> parameters. Instead, you specify all this information in the
     *        <code>Metrics</code> array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace for the metric associated specified in <code>MetricName</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace for the metric associated specified in <code>MetricName</code>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace for the metric associated specified in <code>MetricName</code>.
     * </p>
     * 
     * @return The namespace for the metric associated specified in <code>MetricName</code>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace for the metric associated specified in <code>MetricName</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace for the metric associated specified in <code>MetricName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     * statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     * <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but
     * not both.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     *        statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     *        <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code>
     *        but not both.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     * statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     * <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but
     * not both.
     * </p>
     * 
     * @return The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     *         statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     *         <code>MetricName</code>, you must specify either <code>Statistic</code> or
     *         <code>ExtendedStatistic,</code> but not both.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     * statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     * <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but
     * not both.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     *        statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     *        <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code>
     *        but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public PutMetricAlarmRequest withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     * statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     * <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but
     * not both.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     *        statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     *        <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code>
     *        but not both.
     * @see Statistic
     */

    public void setStatistic(Statistic statistic) {
        withStatistic(statistic);
    }

    /**
     * <p>
     * The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     * statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     * <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but
     * not both.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric specified in <code>MetricName</code>, other than percentile. For percentile
     *        statistics, use <code>ExtendedStatistic</code>. When you call <code>PutMetricAlarm</code> and specify a
     *        <code>MetricName</code>, you must specify either <code>Statistic</code> or <code>ExtendedStatistic,</code>
     *        but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public PutMetricAlarmRequest withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The percentile statistic for the metric specified in <code>MetricName</code>. Specify a value between p0.0 and
     * p100. When you call <code>PutMetricAlarm</code> and specify a <code>MetricName</code>, you must specify either
     * <code>Statistic</code> or <code>ExtendedStatistic,</code> but not both.
     * </p>
     * 
     * @param extendedStatistic
     *        The percentile statistic for the metric specified in <code>MetricName</code>. Specify a value between p0.0
     *        and p100. When you call <code>PutMetricAlarm</code> and specify a <code>MetricName</code>, you must
     *        specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but not both.
     */

    public void setExtendedStatistic(String extendedStatistic) {
        this.extendedStatistic = extendedStatistic;
    }

    /**
     * <p>
     * The percentile statistic for the metric specified in <code>MetricName</code>. Specify a value between p0.0 and
     * p100. When you call <code>PutMetricAlarm</code> and specify a <code>MetricName</code>, you must specify either
     * <code>Statistic</code> or <code>ExtendedStatistic,</code> but not both.
     * </p>
     * 
     * @return The percentile statistic for the metric specified in <code>MetricName</code>. Specify a value between
     *         p0.0 and p100. When you call <code>PutMetricAlarm</code> and specify a <code>MetricName</code>, you must
     *         specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but not both.
     */

    public String getExtendedStatistic() {
        return this.extendedStatistic;
    }

    /**
     * <p>
     * The percentile statistic for the metric specified in <code>MetricName</code>. Specify a value between p0.0 and
     * p100. When you call <code>PutMetricAlarm</code> and specify a <code>MetricName</code>, you must specify either
     * <code>Statistic</code> or <code>ExtendedStatistic,</code> but not both.
     * </p>
     * 
     * @param extendedStatistic
     *        The percentile statistic for the metric specified in <code>MetricName</code>. Specify a value between p0.0
     *        and p100. When you call <code>PutMetricAlarm</code> and specify a <code>MetricName</code>, you must
     *        specify either <code>Statistic</code> or <code>ExtendedStatistic,</code> but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withExtendedStatistic(String extendedStatistic) {
        setExtendedStatistic(extendedStatistic);
        return this;
    }

    /**
     * <p>
     * The dimensions for the metric specified in <code>MetricName</code>.
     * </p>
     * 
     * @return The dimensions for the metric specified in <code>MetricName</code>.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The dimensions for the metric specified in <code>MetricName</code>.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric specified in <code>MetricName</code>.
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
     * The dimensions for the metric specified in <code>MetricName</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric specified in <code>MetricName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withDimensions(Dimension... dimensions) {
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
     * The dimensions for the metric specified in <code>MetricName</code>.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the metric specified in <code>MetricName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The length, in seconds, used each time the metric specified in <code>MetricName</code> is evaluated. Valid values
     * are 10, 30, and any multiple of 60.
     * </p>
     * <p>
     * Be sure to specify 10 or 30 only for metrics that are stored by a <code>PutMetricData</code> call with a
     * <code>StorageResolution</code> of 1. If you specify a period of 10 or 30 for a metric that does not have
     * sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In this case,
     * it does not receive data for the attempts that do not correspond to a one-minute data resolution, and the alarm
     * may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this alarm as a high-resolution
     * alarm, which has a higher charge than other alarms. For more information about pricing, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * An alarm's total current evaluation period can be no longer than one day, so <code>Period</code> multiplied by
     * <code>EvaluationPeriods</code> cannot be more than 86,400 seconds.
     * </p>
     * 
     * @param period
     *        The length, in seconds, used each time the metric specified in <code>MetricName</code> is evaluated. Valid
     *        values are 10, 30, and any multiple of 60.</p>
     *        <p>
     *        Be sure to specify 10 or 30 only for metrics that are stored by a <code>PutMetricData</code> call with a
     *        <code>StorageResolution</code> of 1. If you specify a period of 10 or 30 for a metric that does not have
     *        sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In
     *        this case, it does not receive data for the attempts that do not correspond to a one-minute data
     *        resolution, and the alarm may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this
     *        alarm as a high-resolution alarm, which has a higher charge than other alarms. For more information about
     *        pricing, see <a href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     *        </p>
     *        <p>
     *        An alarm's total current evaluation period can be no longer than one day, so <code>Period</code>
     *        multiplied by <code>EvaluationPeriods</code> cannot be more than 86,400 seconds.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The length, in seconds, used each time the metric specified in <code>MetricName</code> is evaluated. Valid values
     * are 10, 30, and any multiple of 60.
     * </p>
     * <p>
     * Be sure to specify 10 or 30 only for metrics that are stored by a <code>PutMetricData</code> call with a
     * <code>StorageResolution</code> of 1. If you specify a period of 10 or 30 for a metric that does not have
     * sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In this case,
     * it does not receive data for the attempts that do not correspond to a one-minute data resolution, and the alarm
     * may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this alarm as a high-resolution
     * alarm, which has a higher charge than other alarms. For more information about pricing, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * An alarm's total current evaluation period can be no longer than one day, so <code>Period</code> multiplied by
     * <code>EvaluationPeriods</code> cannot be more than 86,400 seconds.
     * </p>
     * 
     * @return The length, in seconds, used each time the metric specified in <code>MetricName</code> is evaluated.
     *         Valid values are 10, 30, and any multiple of 60.</p>
     *         <p>
     *         Be sure to specify 10 or 30 only for metrics that are stored by a <code>PutMetricData</code> call with a
     *         <code>StorageResolution</code> of 1. If you specify a period of 10 or 30 for a metric that does not have
     *         sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In
     *         this case, it does not receive data for the attempts that do not correspond to a one-minute data
     *         resolution, and the alarm may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets
     *         this alarm as a high-resolution alarm, which has a higher charge than other alarms. For more information
     *         about pricing, see <a href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     *         </p>
     *         <p>
     *         An alarm's total current evaluation period can be no longer than one day, so <code>Period</code>
     *         multiplied by <code>EvaluationPeriods</code> cannot be more than 86,400 seconds.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The length, in seconds, used each time the metric specified in <code>MetricName</code> is evaluated. Valid values
     * are 10, 30, and any multiple of 60.
     * </p>
     * <p>
     * Be sure to specify 10 or 30 only for metrics that are stored by a <code>PutMetricData</code> call with a
     * <code>StorageResolution</code> of 1. If you specify a period of 10 or 30 for a metric that does not have
     * sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In this case,
     * it does not receive data for the attempts that do not correspond to a one-minute data resolution, and the alarm
     * may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this alarm as a high-resolution
     * alarm, which has a higher charge than other alarms. For more information about pricing, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * An alarm's total current evaluation period can be no longer than one day, so <code>Period</code> multiplied by
     * <code>EvaluationPeriods</code> cannot be more than 86,400 seconds.
     * </p>
     * 
     * @param period
     *        The length, in seconds, used each time the metric specified in <code>MetricName</code> is evaluated. Valid
     *        values are 10, 30, and any multiple of 60.</p>
     *        <p>
     *        Be sure to specify 10 or 30 only for metrics that are stored by a <code>PutMetricData</code> call with a
     *        <code>StorageResolution</code> of 1. If you specify a period of 10 or 30 for a metric that does not have
     *        sub-minute resolution, the alarm still attempts to gather data at the period rate that you specify. In
     *        this case, it does not receive data for the attempts that do not correspond to a one-minute data
     *        resolution, and the alarm may often lapse into INSUFFICENT_DATA status. Specifying 10 or 30 also sets this
     *        alarm as a high-resolution alarm, which has a higher charge than other alarms. For more information about
     *        pricing, see <a href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     *        </p>
     *        <p>
     *        An alarm's total current evaluation period can be no longer than one day, so <code>Period</code>
     *        multiplied by <code>EvaluationPeriods</code> cannot be more than 86,400 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes
     * because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data
     * points that specify a unit of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch alarm
     * can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are
     *        Bytes because NetworkIn tracks the number of bytes that an instance receives on all network interfaces.
     *        You can also specify a unit when you create a custom metric. Units help provide conceptual meaning to your
     *        data. Metric data points that specify a unit of measure, such as Percent, are aggregated separately.</p>
     *        <p>
     *        If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch
     *        alarm can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes
     * because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data
     * points that specify a unit of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch alarm
     * can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * </p>
     * 
     * @return The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are
     *         Bytes because NetworkIn tracks the number of bytes that an instance receives on all network interfaces.
     *         You can also specify a unit when you create a custom metric. Units help provide conceptual meaning to
     *         your data. Metric data points that specify a unit of measure, such as Percent, are aggregated
     *         separately.</p>
     *         <p>
     *         If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch
     *         alarm can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes
     * because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data
     * points that specify a unit of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch alarm
     * can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are
     *        Bytes because NetworkIn tracks the number of bytes that an instance receives on all network interfaces.
     *        You can also specify a unit when you create a custom metric. Units help provide conceptual meaning to your
     *        data. Metric data points that specify a unit of measure, such as Percent, are aggregated separately.</p>
     *        <p>
     *        If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch
     *        alarm can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public PutMetricAlarmRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes
     * because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data
     * points that specify a unit of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch alarm
     * can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are
     *        Bytes because NetworkIn tracks the number of bytes that an instance receives on all network interfaces.
     *        You can also specify a unit when you create a custom metric. Units help provide conceptual meaning to your
     *        data. Metric data points that specify a unit of measure, such as Percent, are aggregated separately.</p>
     *        <p>
     *        If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch
     *        alarm can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        withUnit(unit);
    }

    /**
     * <p>
     * The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are Bytes
     * because NetworkIn tracks the number of bytes that an instance receives on all network interfaces. You can also
     * specify a unit when you create a custom metric. Units help provide conceptual meaning to your data. Metric data
     * points that specify a unit of measure, such as Percent, are aggregated separately.
     * </p>
     * <p>
     * If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch alarm
     * can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * </p>
     * 
     * @param unit
     *        The unit of measure for the statistic. For example, the units for the Amazon EC2 NetworkIn metric are
     *        Bytes because NetworkIn tracks the number of bytes that an instance receives on all network interfaces.
     *        You can also specify a unit when you create a custom metric. Units help provide conceptual meaning to your
     *        data. Metric data points that specify a unit of measure, such as Percent, are aggregated separately.</p>
     *        <p>
     *        If you specify a unit, you must use a unit that is appropriate for the metric. Otherwise, the CloudWatch
     *        alarm can get stuck in the <code>INSUFFICIENT DATA</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public PutMetricAlarmRequest withUnit(StandardUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold. If you are setting an alarm that
     * requires that a number of consecutive data points be breaching to trigger the alarm, this value specifies that
     * number. If you are setting an "M out of N" alarm, this value is the N.
     * </p>
     * <p>
     * An alarm's total current evaluation period can be no longer than one day, so this number multiplied by
     * <code>Period</code> cannot be more than 86,400 seconds.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified threshold. If you are setting an alarm
     *        that requires that a number of consecutive data points be breaching to trigger the alarm, this value
     *        specifies that number. If you are setting an "M out of N" alarm, this value is the N.</p>
     *        <p>
     *        An alarm's total current evaluation period can be no longer than one day, so this number multiplied by
     *        <code>Period</code> cannot be more than 86,400 seconds.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold. If you are setting an alarm that
     * requires that a number of consecutive data points be breaching to trigger the alarm, this value specifies that
     * number. If you are setting an "M out of N" alarm, this value is the N.
     * </p>
     * <p>
     * An alarm's total current evaluation period can be no longer than one day, so this number multiplied by
     * <code>Period</code> cannot be more than 86,400 seconds.
     * </p>
     * 
     * @return The number of periods over which data is compared to the specified threshold. If you are setting an alarm
     *         that requires that a number of consecutive data points be breaching to trigger the alarm, this value
     *         specifies that number. If you are setting an "M out of N" alarm, this value is the N.</p>
     *         <p>
     *         An alarm's total current evaluation period can be no longer than one day, so this number multiplied by
     *         <code>Period</code> cannot be more than 86,400 seconds.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified threshold. If you are setting an alarm that
     * requires that a number of consecutive data points be breaching to trigger the alarm, this value specifies that
     * number. If you are setting an "M out of N" alarm, this value is the N.
     * </p>
     * <p>
     * An alarm's total current evaluation period can be no longer than one day, so this number multiplied by
     * <code>Period</code> cannot be more than 86,400 seconds.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified threshold. If you are setting an alarm
     *        that requires that a number of consecutive data points be breaching to trigger the alarm, this value
     *        specifies that number. If you are setting an "M out of N" alarm, this value is the N.</p>
     *        <p>
     *        An alarm's total current evaluation period can be no longer than one day, so this number multiplied by
     *        <code>Period</code> cannot be more than 86,400 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm. This is used only if you are setting an
     * "M out of N" alarm. In that case, this value is the M. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation"
     * >Evaluating an Alarm</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param datapointsToAlarm
     *        The number of datapoints that must be breaching to trigger the alarm. This is used only if you are setting
     *        an "M out of N" alarm. In that case, this value is the M. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation"
     *        >Evaluating an Alarm</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public void setDatapointsToAlarm(Integer datapointsToAlarm) {
        this.datapointsToAlarm = datapointsToAlarm;
    }

    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm. This is used only if you are setting an
     * "M out of N" alarm. In that case, this value is the M. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation"
     * >Evaluating an Alarm</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The number of datapoints that must be breaching to trigger the alarm. This is used only if you are
     *         setting an "M out of N" alarm. In that case, this value is the M. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation"
     *         >Evaluating an Alarm</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public Integer getDatapointsToAlarm() {
        return this.datapointsToAlarm;
    }

    /**
     * <p>
     * The number of datapoints that must be breaching to trigger the alarm. This is used only if you are setting an
     * "M out of N" alarm. In that case, this value is the M. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation"
     * >Evaluating an Alarm</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param datapointsToAlarm
     *        The number of datapoints that must be breaching to trigger the alarm. This is used only if you are setting
     *        an "M out of N" alarm. In that case, this value is the M. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarm-evaluation"
     *        >Evaluating an Alarm</a> in the <i>Amazon CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withDatapointsToAlarm(Integer datapointsToAlarm) {
        setDatapointsToAlarm(datapointsToAlarm);
        return this;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @param threshold
     *        The value against which the specified statistic is compared.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @return The value against which the specified statistic is compared.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @param threshold
     *        The value against which the specified statistic is compared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withThreshold(Double threshold) {
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

    public PutMetricAlarmRequest withComparisonOperator(String comparisonOperator) {
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

    public PutMetricAlarmRequest withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points. If <code>TreatMissingData</code> is omitted, the default
     * behavior of <code>missing</code> is used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data"
     * >Configuring How CloudWatch Alarms Treats Missing Data</a>.
     * </p>
     * <p>
     * Valid Values: <code>breaching | notBreaching | ignore | missing</code>
     * </p>
     * 
     * @param treatMissingData
     *        Sets how this alarm is to handle missing data points. If <code>TreatMissingData</code> is omitted, the
     *        default behavior of <code>missing</code> is used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data"
     *        >Configuring How CloudWatch Alarms Treats Missing Data</a>.</p>
     *        <p>
     *        Valid Values: <code>breaching | notBreaching | ignore | missing</code>
     */

    public void setTreatMissingData(String treatMissingData) {
        this.treatMissingData = treatMissingData;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points. If <code>TreatMissingData</code> is omitted, the default
     * behavior of <code>missing</code> is used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data"
     * >Configuring How CloudWatch Alarms Treats Missing Data</a>.
     * </p>
     * <p>
     * Valid Values: <code>breaching | notBreaching | ignore | missing</code>
     * </p>
     * 
     * @return Sets how this alarm is to handle missing data points. If <code>TreatMissingData</code> is omitted, the
     *         default behavior of <code>missing</code> is used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data"
     *         >Configuring How CloudWatch Alarms Treats Missing Data</a>.</p>
     *         <p>
     *         Valid Values: <code>breaching | notBreaching | ignore | missing</code>
     */

    public String getTreatMissingData() {
        return this.treatMissingData;
    }

    /**
     * <p>
     * Sets how this alarm is to handle missing data points. If <code>TreatMissingData</code> is omitted, the default
     * behavior of <code>missing</code> is used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data"
     * >Configuring How CloudWatch Alarms Treats Missing Data</a>.
     * </p>
     * <p>
     * Valid Values: <code>breaching | notBreaching | ignore | missing</code>
     * </p>
     * 
     * @param treatMissingData
     *        Sets how this alarm is to handle missing data points. If <code>TreatMissingData</code> is omitted, the
     *        default behavior of <code>missing</code> is used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#alarms-and-missing-data"
     *        >Configuring How CloudWatch Alarms Treats Missing Data</a>.</p>
     *        <p>
     *        Valid Values: <code>breaching | notBreaching | ignore | missing</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withTreatMissingData(String treatMissingData) {
        setTreatMissingData(treatMissingData);
        return this;
    }

    /**
     * <p>
     * Used only for alarms based on percentiles. If you specify <code>ignore</code>, the alarm state does not change
     * during periods with too few data points to be statistically significant. If you specify <code>evaluate</code> or
     * omit this parameter, the alarm is always evaluated and possibly changes state no matter how many data points are
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#percentiles-with-low-samples"
     * >Percentile-Based CloudWatch Alarms and Low Data Samples</a>.
     * </p>
     * <p>
     * Valid Values: <code>evaluate | ignore</code>
     * </p>
     * 
     * @param evaluateLowSampleCountPercentile
     *        Used only for alarms based on percentiles. If you specify <code>ignore</code>, the alarm state does not
     *        change during periods with too few data points to be statistically significant. If you specify
     *        <code>evaluate</code> or omit this parameter, the alarm is always evaluated and possibly changes state no
     *        matter how many data points are available. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#percentiles-with-low-samples"
     *        >Percentile-Based CloudWatch Alarms and Low Data Samples</a>.</p>
     *        <p>
     *        Valid Values: <code>evaluate | ignore</code>
     */

    public void setEvaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
        this.evaluateLowSampleCountPercentile = evaluateLowSampleCountPercentile;
    }

    /**
     * <p>
     * Used only for alarms based on percentiles. If you specify <code>ignore</code>, the alarm state does not change
     * during periods with too few data points to be statistically significant. If you specify <code>evaluate</code> or
     * omit this parameter, the alarm is always evaluated and possibly changes state no matter how many data points are
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#percentiles-with-low-samples"
     * >Percentile-Based CloudWatch Alarms and Low Data Samples</a>.
     * </p>
     * <p>
     * Valid Values: <code>evaluate | ignore</code>
     * </p>
     * 
     * @return Used only for alarms based on percentiles. If you specify <code>ignore</code>, the alarm state does not
     *         change during periods with too few data points to be statistically significant. If you specify
     *         <code>evaluate</code> or omit this parameter, the alarm is always evaluated and possibly changes state no
     *         matter how many data points are available. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#percentiles-with-low-samples"
     *         >Percentile-Based CloudWatch Alarms and Low Data Samples</a>.</p>
     *         <p>
     *         Valid Values: <code>evaluate | ignore</code>
     */

    public String getEvaluateLowSampleCountPercentile() {
        return this.evaluateLowSampleCountPercentile;
    }

    /**
     * <p>
     * Used only for alarms based on percentiles. If you specify <code>ignore</code>, the alarm state does not change
     * during periods with too few data points to be statistically significant. If you specify <code>evaluate</code> or
     * omit this parameter, the alarm is always evaluated and possibly changes state no matter how many data points are
     * available. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#percentiles-with-low-samples"
     * >Percentile-Based CloudWatch Alarms and Low Data Samples</a>.
     * </p>
     * <p>
     * Valid Values: <code>evaluate | ignore</code>
     * </p>
     * 
     * @param evaluateLowSampleCountPercentile
     *        Used only for alarms based on percentiles. If you specify <code>ignore</code>, the alarm state does not
     *        change during periods with too few data points to be statistically significant. If you specify
     *        <code>evaluate</code> or omit this parameter, the alarm is always evaluated and possibly changes state no
     *        matter how many data points are available. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html#percentiles-with-low-samples"
     *        >Percentile-Based CloudWatch Alarms and Low Data Samples</a>.</p>
     *        <p>
     *        Valid Values: <code>evaluate | ignore</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withEvaluateLowSampleCountPercentile(String evaluateLowSampleCountPercentile) {
        setEvaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile);
        return this;
    }

    /**
     * <p>
     * An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the result of a
     * metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric or performs a math
     * expression.
     * </p>
     * <p>
     * One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     * expression by setting <code>ReturnValue</code> to true for this object in the array. For more information, see
     * <a>MetricDataQuery</a>.
     * </p>
     * <p>
     * If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead, you
     * retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     * </p>
     * 
     * @return An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the
     *         result of a metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric
     *         or performs a math expression.</p>
     *         <p>
     *         One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     *         expression by setting <code>ReturnValue</code> to true for this object in the array. For more
     *         information, see <a>MetricDataQuery</a>.
     *         </p>
     *         <p>
     *         If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     *         <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     *         <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead,
     *         you retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     */

    public java.util.List<MetricDataQuery> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<MetricDataQuery>();
        }
        return metrics;
    }

    /**
     * <p>
     * An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the result of a
     * metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric or performs a math
     * expression.
     * </p>
     * <p>
     * One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     * expression by setting <code>ReturnValue</code> to true for this object in the array. For more information, see
     * <a>MetricDataQuery</a>.
     * </p>
     * <p>
     * If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead, you
     * retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     * </p>
     * 
     * @param metrics
     *        An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the result
     *        of a metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric or
     *        performs a math expression.</p>
     *        <p>
     *        One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     *        expression by setting <code>ReturnValue</code> to true for this object in the array. For more information,
     *        see <a>MetricDataQuery</a>.
     *        </p>
     *        <p>
     *        If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     *        <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     *        <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead,
     *        you retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     */

    public void setMetrics(java.util.Collection<MetricDataQuery> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<MetricDataQuery>(metrics);
    }

    /**
     * <p>
     * An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the result of a
     * metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric or performs a math
     * expression.
     * </p>
     * <p>
     * One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     * expression by setting <code>ReturnValue</code> to true for this object in the array. For more information, see
     * <a>MetricDataQuery</a>.
     * </p>
     * <p>
     * If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead, you
     * retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the result
     *        of a metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric or
     *        performs a math expression.</p>
     *        <p>
     *        One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     *        expression by setting <code>ReturnValue</code> to true for this object in the array. For more information,
     *        see <a>MetricDataQuery</a>.
     *        </p>
     *        <p>
     *        If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     *        <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     *        <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead,
     *        you retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withMetrics(MetricDataQuery... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<MetricDataQuery>(metrics.length));
        }
        for (MetricDataQuery ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the result of a
     * metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric or performs a math
     * expression.
     * </p>
     * <p>
     * One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     * expression by setting <code>ReturnValue</code> to true for this object in the array. For more information, see
     * <a>MetricDataQuery</a>.
     * </p>
     * <p>
     * If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     * <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     * <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead, you
     * retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     * </p>
     * 
     * @param metrics
     *        An array of <code>MetricDataQuery</code> structures that enable you to create an alarm based on the result
     *        of a metric math expression. Each item in the <code>Metrics</code> array either retrieves a metric or
     *        performs a math expression.</p>
     *        <p>
     *        One item in the <code>Metrics</code> array is the expression that the alarm watches. You designate this
     *        expression by setting <code>ReturnValue</code> to true for this object in the array. For more information,
     *        see <a>MetricDataQuery</a>.
     *        </p>
     *        <p>
     *        If you use the <code>Metrics</code> parameter, you cannot include the <code>MetricName</code>,
     *        <code>Dimensions</code>, <code>Period</code>, <code>Namespace</code>, <code>Statistic</code>, or
     *        <code>ExtendedStatistic</code> parameters of <code>PutMetricAlarm</code> in the same operation. Instead,
     *        you retrieve the metrics you are using in your math expression as part of the <code>Metrics</code> array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withMetrics(java.util.Collection<MetricDataQuery> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @return A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an
     *         alarm.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user
     *         permissions, by granting a user permission to access or change only resources with certain tag values.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an
     *        alarm.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only resources with certain tag values.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an
     *        alarm.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only resources with certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an alarm.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the alarm. You can associate as many as 50 tags with an
     *        alarm.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions,
     *        by granting a user permission to access or change only resources with certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricAlarmRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAlarmDescription() != null)
            sb.append("AlarmDescription: ").append(getAlarmDescription()).append(",");
        if (getActionsEnabled() != null)
            sb.append("ActionsEnabled: ").append(getActionsEnabled()).append(",");
        if (getOKActions() != null)
            sb.append("OKActions: ").append(getOKActions()).append(",");
        if (getAlarmActions() != null)
            sb.append("AlarmActions: ").append(getAlarmActions()).append(",");
        if (getInsufficientDataActions() != null)
            sb.append("InsufficientDataActions: ").append(getInsufficientDataActions()).append(",");
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
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricAlarmRequest == false)
            return false;
        PutMetricAlarmRequest other = (PutMetricAlarmRequest) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getAlarmDescription() == null ^ this.getAlarmDescription() == null)
            return false;
        if (other.getAlarmDescription() != null && other.getAlarmDescription().equals(this.getAlarmDescription()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getAlarmDescription() == null) ? 0 : getAlarmDescription().hashCode());
        hashCode = prime * hashCode + ((getActionsEnabled() == null) ? 0 : getActionsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOKActions() == null) ? 0 : getOKActions().hashCode());
        hashCode = prime * hashCode + ((getAlarmActions() == null) ? 0 : getAlarmActions().hashCode());
        hashCode = prime * hashCode + ((getInsufficientDataActions() == null) ? 0 : getInsufficientDataActions().hashCode());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutMetricAlarmRequest clone() {
        return (PutMetricAlarmRequest) super.clone();
    }

}
