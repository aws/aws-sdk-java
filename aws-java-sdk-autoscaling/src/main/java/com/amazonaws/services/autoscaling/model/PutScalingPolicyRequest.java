/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScalingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutScalingPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PredictiveScaling</code>
     * </p>
     * </li>
     * </ul>
     */
    private String policyType;
    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid
     * values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment">
     * Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private String adjustmentType;
    /**
     * <p>
     * Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     */
    private Integer minAdjustmentStep;
    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For example,
     * suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a
     * <code>MinAdjustmentMagnitude</code> of 2. If the group has 4 instances and the scaling policy is performed, 25
     * percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto
     * Scaling scales out the group by 2 instances.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Some Auto Scaling groups use instance weights. In this case, set the <code>MinAdjustmentMagnitude</code> to a
     * value that is at least as large as your largest instance weight.
     * </p>
     * </note>
     */
    private Integer minAdjustmentMagnitude;
    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     * capacity while a negative number removes from the current capacity. For exact capacity, you must specify a
     * positive value.
     * </p>
     * <p>
     * Required if the policy type is <code>SimpleScaling</code>. (Not used with any other policy type.)
     * </p>
     */
    private Integer scalingAdjustment;
    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it overrides
     * the default cooldown period defined for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>SimpleScaling</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon EC2 Auto
     * Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer cooldown;
    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>, <code>Maximum</code>,
     * and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code>.
     * </p>
     */
    private String metricAggregationType;
    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepAdjustment> stepAdjustments;
    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. If not
     * provided, the default is to use the value from the default cooldown period for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>TargetTrackingScaling</code> or <code>StepScaling</code>.
     * </p>
     */
    private Integer estimatedInstanceWarmup;
    /**
     * <p>
     * A target tracking scaling policy. Provides support for predefined or customized metrics.
     * </p>
     * <p>
     * The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ALBRequestCountPerTarget</code> for the metric, you must specify the
     * <code>ResourceLabel</code> parameter with the <code>PredefinedMetricSpecification</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     * >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>TargetTrackingScaling</code>.
     * </p>
     */
    private TargetTrackingConfiguration targetTrackingConfiguration;
    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html">Disabling a
     * scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A predictive scaling policy. Provides support for only predefined metrics.
     * </p>
     * <p>
     * Predictive scaling works with CPU utilization, network in/out, and the Application Load Balancer request count.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_PredictiveScalingConfiguration.html"
     * >PredictiveScalingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>PredictiveScaling</code>.
     * </p>
     */
    private PredictiveScalingConfiguration predictiveScalingConfiguration;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @return The name of the policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PredictiveScaling</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyType
     *        One of the following policy types: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TargetTrackingScaling</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StepScaling</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SimpleScaling</code> (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PredictiveScaling</code>
     *        </p>
     *        </li>
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PredictiveScaling</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return One of the following policy types: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TargetTrackingScaling</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StepScaling</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SimpleScaling</code> (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PredictiveScaling</code>
     *         </p>
     *         </li>
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PredictiveScaling</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyType
     *        One of the following policy types: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TargetTrackingScaling</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StepScaling</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SimpleScaling</code> (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PredictiveScaling</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid
     * values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment">
     * Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param adjustmentType
     *        Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The
     *        valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *        <code>PercentChangeInCapacity</code>.</p>
     *        <p>
     *        Required if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *        >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid
     * values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment">
     * Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage).
     *         The valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.</p>
     *         <p>
     *         Required if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *         >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid
     * values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more information, see
     * <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment">
     * Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param adjustmentType
     *        Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The
     *        valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *        <code>PercentChangeInCapacity</code>.</p>
     *        <p>
     *        Required if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *        >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withAdjustmentType(String adjustmentType) {
        setAdjustmentType(adjustmentType);
        return this;
    }

    /**
     * <p>
     * Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @param minAdjustmentStep
     *        Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     */

    public void setMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
    }

    /**
     * <p>
     * Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @return Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     */

    public Integer getMinAdjustmentStep() {
        return this.minAdjustmentStep;
    }

    /**
     * <p>
     * Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @param minAdjustmentStep
     *        Available for backward compatibility. Use <code>MinAdjustmentMagnitude</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withMinAdjustmentStep(Integer minAdjustmentStep) {
        setMinAdjustmentStep(minAdjustmentStep);
        return this;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For example,
     * suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a
     * <code>MinAdjustmentMagnitude</code> of 2. If the group has 4 instances and the scaling policy is performed, 25
     * percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto
     * Scaling scales out the group by 2 instances.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Some Auto Scaling groups use instance weights. In this case, set the <code>MinAdjustmentMagnitude</code> to a
     * value that is at least as large as your largest instance weight.
     * </p>
     * </note>
     * 
     * @param minAdjustmentMagnitude
     *        The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For
     *        example, suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent
     *        and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the group has 4 instances and the scaling
     *        policy is performed, 25 percent of 4 is 1. However, because you specified a
     *        <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances.</p>
     *        <p>
     *        Valid only if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *        >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Some Auto Scaling groups use instance weights. In this case, set the <code>MinAdjustmentMagnitude</code>
     *        to a value that is at least as large as your largest instance weight.
     *        </p>
     */

    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For example,
     * suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a
     * <code>MinAdjustmentMagnitude</code> of 2. If the group has 4 instances and the scaling policy is performed, 25
     * percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto
     * Scaling scales out the group by 2 instances.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Some Auto Scaling groups use instance weights. In this case, set the <code>MinAdjustmentMagnitude</code> to a
     * value that is at least as large as your largest instance weight.
     * </p>
     * </note>
     * 
     * @return The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For
     *         example, suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent
     *         and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the group has 4 instances and the scaling
     *         policy is performed, 25 percent of 4 is 1. However, because you specified a
     *         <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto Scaling scales out the group by 2
     *         instances.</p>
     *         <p>
     *         Valid only if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *         >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Some Auto Scaling groups use instance weights. In this case, set the <code>MinAdjustmentMagnitude</code>
     *         to a value that is at least as large as your largest instance weight.
     *         </p>
     */

    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For example,
     * suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent and you specify a
     * <code>MinAdjustmentMagnitude</code> of 2. If the group has 4 instances and the scaling policy is performed, 25
     * percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto
     * Scaling scales out the group by 2 instances.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Some Auto Scaling groups use instance weights. In this case, set the <code>MinAdjustmentMagnitude</code> to a
     * value that is at least as large as your largest instance weight.
     * </p>
     * </note>
     * 
     * @param minAdjustmentMagnitude
     *        The minimum value to scale by when the adjustment type is <code>PercentChangeInCapacity</code>. For
     *        example, suppose that you create a step scaling policy to scale out an Auto Scaling group by 25 percent
     *        and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the group has 4 instances and the scaling
     *        policy is performed, 25 percent of 4 is 1. However, because you specified a
     *        <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances.</p>
     *        <p>
     *        Valid only if the policy type is <code>StepScaling</code> or <code>SimpleScaling</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *        >Scaling adjustment types</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Some Auto Scaling groups use instance weights. In this case, set the <code>MinAdjustmentMagnitude</code>
     *        to a value that is at least as large as your largest instance weight.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        setMinAdjustmentMagnitude(minAdjustmentMagnitude);
        return this;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     * capacity while a negative number removes from the current capacity. For exact capacity, you must specify a
     * positive value.
     * </p>
     * <p>
     * Required if the policy type is <code>SimpleScaling</code>. (Not used with any other policy type.)
     * </p>
     * 
     * @param scalingAdjustment
     *        The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     *        capacity while a negative number removes from the current capacity. For exact capacity, you must specify a
     *        positive value.</p>
     *        <p>
     *        Required if the policy type is <code>SimpleScaling</code>. (Not used with any other policy type.)
     */

    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     * capacity while a negative number removes from the current capacity. For exact capacity, you must specify a
     * positive value.
     * </p>
     * <p>
     * Required if the policy type is <code>SimpleScaling</code>. (Not used with any other policy type.)
     * </p>
     * 
     * @return The amount by which to scale, based on the specified adjustment type. A positive value adds to the
     *         current capacity while a negative number removes from the current capacity. For exact capacity, you must
     *         specify a positive value.</p>
     *         <p>
     *         Required if the policy type is <code>SimpleScaling</code>. (Not used with any other policy type.)
     */

    public Integer getScalingAdjustment() {
        return this.scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     * capacity while a negative number removes from the current capacity. For exact capacity, you must specify a
     * positive value.
     * </p>
     * <p>
     * Required if the policy type is <code>SimpleScaling</code>. (Not used with any other policy type.)
     * </p>
     * 
     * @param scalingAdjustment
     *        The amount by which to scale, based on the specified adjustment type. A positive value adds to the current
     *        capacity while a negative number removes from the current capacity. For exact capacity, you must specify a
     *        positive value.</p>
     *        <p>
     *        Required if the policy type is <code>SimpleScaling</code>. (Not used with any other policy type.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withScalingAdjustment(Integer scalingAdjustment) {
        setScalingAdjustment(scalingAdjustment);
        return this;
    }

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it overrides
     * the default cooldown period defined for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>SimpleScaling</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon EC2 Auto
     * Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param cooldown
     *        The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it
     *        overrides the default cooldown period defined for the Auto Scaling group.</p>
     *        <p>
     *        Valid only if the policy type is <code>SimpleScaling</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon
     *        EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it overrides
     * the default cooldown period defined for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>SimpleScaling</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon EC2 Auto
     * Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it
     *         overrides the default cooldown period defined for the Auto Scaling group.</p>
     *         <p>
     *         Valid only if the policy type is <code>SimpleScaling</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon
     *         EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public Integer getCooldown() {
        return this.cooldown;
    }

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it overrides
     * the default cooldown period defined for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>SimpleScaling</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon EC2 Auto
     * Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param cooldown
     *        The duration of the policy's cooldown period, in seconds. When a cooldown period is specified here, it
     *        overrides the default cooldown period defined for the Auto Scaling group.</p>
     *        <p>
     *        Valid only if the policy type is <code>SimpleScaling</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html">Scaling cooldowns for Amazon
     *        EC2 Auto Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withCooldown(Integer cooldown) {
        setCooldown(cooldown);
        return this;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>, <code>Maximum</code>,
     * and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>,
     *        <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as
     *        <code>Average</code>.</p>
     *        <p>
     *        Valid only if the policy type is <code>StepScaling</code>.
     */

    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>, <code>Maximum</code>,
     * and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code>.
     * </p>
     * 
     * @return The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>,
     *         <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as
     *         <code>Average</code>.</p>
     *         <p>
     *         Valid only if the policy type is <code>StepScaling</code>.
     */

    public String getMetricAggregationType() {
        return this.metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>, <code>Maximum</code>,
     * and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. The valid values are <code>Minimum</code>,
     *        <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as
     *        <code>Average</code>.</p>
     *        <p>
     *        Valid only if the policy type is <code>StepScaling</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withMetricAggregationType(String metricAggregationType) {
        setMetricAggregationType(metricAggregationType);
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     * </p>
     * 
     * @return A set of adjustments that enable you to scale based on the size of the alarm breach.</p>
     *         <p>
     *         Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     */

    public java.util.List<StepAdjustment> getStepAdjustments() {
        if (stepAdjustments == null) {
            stepAdjustments = new com.amazonaws.internal.SdkInternalList<StepAdjustment>();
        }
        return stepAdjustments;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.</p>
     *        <p>
     *        Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     */

    public void setStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        if (stepAdjustments == null) {
            this.stepAdjustments = null;
            return;
        }

        this.stepAdjustments = new com.amazonaws.internal.SdkInternalList<StepAdjustment>(stepAdjustments);
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepAdjustments(java.util.Collection)} or {@link #withStepAdjustments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.</p>
     *        <p>
     *        Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withStepAdjustments(StepAdjustment... stepAdjustments) {
        if (this.stepAdjustments == null) {
            setStepAdjustments(new com.amazonaws.internal.SdkInternalList<StepAdjustment>(stepAdjustments.length));
        }
        for (StepAdjustment ele : stepAdjustments) {
            this.stepAdjustments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of the alarm breach.</p>
     *        <p>
     *        Required if the policy type is <code>StepScaling</code>. (Not used with any other policy type.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        setStepAdjustments(stepAdjustments);
        return this;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. If not
     * provided, the default is to use the value from the default cooldown period for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>TargetTrackingScaling</code> or <code>StepScaling</code>.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     *        If not provided, the default is to use the value from the default cooldown period for the Auto Scaling
     *        group.</p>
     *        <p>
     *        Valid only if the policy type is <code>TargetTrackingScaling</code> or <code>StepScaling</code>.
     */

    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. If not
     * provided, the default is to use the value from the default cooldown period for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>TargetTrackingScaling</code> or <code>StepScaling</code>.
     * </p>
     * 
     * @return The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     *         If not provided, the default is to use the value from the default cooldown period for the Auto Scaling
     *         group.</p>
     *         <p>
     *         Valid only if the policy type is <code>TargetTrackingScaling</code> or <code>StepScaling</code>.
     */

    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. If not
     * provided, the default is to use the value from the default cooldown period for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>TargetTrackingScaling</code> or <code>StepScaling</code>.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     *        If not provided, the default is to use the value from the default cooldown period for the Auto Scaling
     *        group.</p>
     *        <p>
     *        Valid only if the policy type is <code>TargetTrackingScaling</code> or <code>StepScaling</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        setEstimatedInstanceWarmup(estimatedInstanceWarmup);
        return this;
    }

    /**
     * <p>
     * A target tracking scaling policy. Provides support for predefined or customized metrics.
     * </p>
     * <p>
     * The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ALBRequestCountPerTarget</code> for the metric, you must specify the
     * <code>ResourceLabel</code> parameter with the <code>PredefinedMetricSpecification</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     * >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>TargetTrackingScaling</code>.
     * </p>
     * 
     * @param targetTrackingConfiguration
     *        A target tracking scaling policy. Provides support for predefined or customized metrics.</p>
     *        <p>
     *        The following predefined metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASGAverageCPUUtilization</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASGAverageNetworkIn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASGAverageNetworkOut</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALBRequestCountPerTarget</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>ALBRequestCountPerTarget</code> for the metric, you must specify the
     *        <code>ResourceLabel</code> parameter with the <code>PredefinedMetricSpecification</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     *        >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     *        </p>
     *        <p>
     *        Required if the policy type is <code>TargetTrackingScaling</code>.
     */

    public void setTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking scaling policy. Provides support for predefined or customized metrics.
     * </p>
     * <p>
     * The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ALBRequestCountPerTarget</code> for the metric, you must specify the
     * <code>ResourceLabel</code> parameter with the <code>PredefinedMetricSpecification</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     * >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>TargetTrackingScaling</code>.
     * </p>
     * 
     * @return A target tracking scaling policy. Provides support for predefined or customized metrics.</p>
     *         <p>
     *         The following predefined metrics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASGAverageCPUUtilization</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASGAverageNetworkIn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASGAverageNetworkOut</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALBRequestCountPerTarget</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify <code>ALBRequestCountPerTarget</code> for the metric, you must specify the
     *         <code>ResourceLabel</code> parameter with the <code>PredefinedMetricSpecification</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     *         >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     *         </p>
     *         <p>
     *         Required if the policy type is <code>TargetTrackingScaling</code>.
     */

    public TargetTrackingConfiguration getTargetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking scaling policy. Provides support for predefined or customized metrics.
     * </p>
     * <p>
     * The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ALBRequestCountPerTarget</code> for the metric, you must specify the
     * <code>ResourceLabel</code> parameter with the <code>PredefinedMetricSpecification</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     * >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>TargetTrackingScaling</code>.
     * </p>
     * 
     * @param targetTrackingConfiguration
     *        A target tracking scaling policy. Provides support for predefined or customized metrics.</p>
     *        <p>
     *        The following predefined metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASGAverageCPUUtilization</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASGAverageNetworkIn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASGAverageNetworkOut</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALBRequestCountPerTarget</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify <code>ALBRequestCountPerTarget</code> for the metric, you must specify the
     *        <code>ResourceLabel</code> parameter with the <code>PredefinedMetricSpecification</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     *        >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     *        </p>
     *        <p>
     *        Required if the policy type is <code>TargetTrackingScaling</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        setTargetTrackingConfiguration(targetTrackingConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html">Disabling a
     * scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information,
     *        see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html">
     *        Disabling a scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html">Disabling a
     * scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     *         >Disabling a scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html">Disabling a
     * scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enabled
     *        Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information,
     *        see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html">
     *        Disabling a scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html">Disabling a
     * scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return Indicates whether the scaling policy is enabled or disabled. The default is enabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     *         >Disabling a scaling policy for an Auto Scaling group</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A predictive scaling policy. Provides support for only predefined metrics.
     * </p>
     * <p>
     * Predictive scaling works with CPU utilization, network in/out, and the Application Load Balancer request count.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_PredictiveScalingConfiguration.html"
     * >PredictiveScalingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>PredictiveScaling</code>.
     * </p>
     * 
     * @param predictiveScalingConfiguration
     *        A predictive scaling policy. Provides support for only predefined metrics.</p>
     *        <p>
     *        Predictive scaling works with CPU utilization, network in/out, and the Application Load Balancer request
     *        count.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_PredictiveScalingConfiguration.html"
     *        >PredictiveScalingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     *        </p>
     *        <p>
     *        Required if the policy type is <code>PredictiveScaling</code>.
     */

    public void setPredictiveScalingConfiguration(PredictiveScalingConfiguration predictiveScalingConfiguration) {
        this.predictiveScalingConfiguration = predictiveScalingConfiguration;
    }

    /**
     * <p>
     * A predictive scaling policy. Provides support for only predefined metrics.
     * </p>
     * <p>
     * Predictive scaling works with CPU utilization, network in/out, and the Application Load Balancer request count.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_PredictiveScalingConfiguration.html"
     * >PredictiveScalingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>PredictiveScaling</code>.
     * </p>
     * 
     * @return A predictive scaling policy. Provides support for only predefined metrics.</p>
     *         <p>
     *         Predictive scaling works with CPU utilization, network in/out, and the Application Load Balancer request
     *         count.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_PredictiveScalingConfiguration.html"
     *         >PredictiveScalingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     *         </p>
     *         <p>
     *         Required if the policy type is <code>PredictiveScaling</code>.
     */

    public PredictiveScalingConfiguration getPredictiveScalingConfiguration() {
        return this.predictiveScalingConfiguration;
    }

    /**
     * <p>
     * A predictive scaling policy. Provides support for only predefined metrics.
     * </p>
     * <p>
     * Predictive scaling works with CPU utilization, network in/out, and the Application Load Balancer request count.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_PredictiveScalingConfiguration.html"
     * >PredictiveScalingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>PredictiveScaling</code>.
     * </p>
     * 
     * @param predictiveScalingConfiguration
     *        A predictive scaling policy. Provides support for only predefined metrics.</p>
     *        <p>
     *        Predictive scaling works with CPU utilization, network in/out, and the Application Load Balancer request
     *        count.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_PredictiveScalingConfiguration.html"
     *        >PredictiveScalingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API Reference</i>.
     *        </p>
     *        <p>
     *        Required if the policy type is <code>PredictiveScaling</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withPredictiveScalingConfiguration(PredictiveScalingConfiguration predictiveScalingConfiguration) {
        setPredictiveScalingConfiguration(predictiveScalingConfiguration);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getAdjustmentType() != null)
            sb.append("AdjustmentType: ").append(getAdjustmentType()).append(",");
        if (getMinAdjustmentStep() != null)
            sb.append("MinAdjustmentStep: ").append(getMinAdjustmentStep()).append(",");
        if (getMinAdjustmentMagnitude() != null)
            sb.append("MinAdjustmentMagnitude: ").append(getMinAdjustmentMagnitude()).append(",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: ").append(getScalingAdjustment()).append(",");
        if (getCooldown() != null)
            sb.append("Cooldown: ").append(getCooldown()).append(",");
        if (getMetricAggregationType() != null)
            sb.append("MetricAggregationType: ").append(getMetricAggregationType()).append(",");
        if (getStepAdjustments() != null)
            sb.append("StepAdjustments: ").append(getStepAdjustments()).append(",");
        if (getEstimatedInstanceWarmup() != null)
            sb.append("EstimatedInstanceWarmup: ").append(getEstimatedInstanceWarmup()).append(",");
        if (getTargetTrackingConfiguration() != null)
            sb.append("TargetTrackingConfiguration: ").append(getTargetTrackingConfiguration()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getPredictiveScalingConfiguration() != null)
            sb.append("PredictiveScalingConfiguration: ").append(getPredictiveScalingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutScalingPolicyRequest == false)
            return false;
        PutScalingPolicyRequest other = (PutScalingPolicyRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null)
            return false;
        if (other.getAdjustmentType() != null && other.getAdjustmentType().equals(this.getAdjustmentType()) == false)
            return false;
        if (other.getMinAdjustmentStep() == null ^ this.getMinAdjustmentStep() == null)
            return false;
        if (other.getMinAdjustmentStep() != null && other.getMinAdjustmentStep().equals(this.getMinAdjustmentStep()) == false)
            return false;
        if (other.getMinAdjustmentMagnitude() == null ^ this.getMinAdjustmentMagnitude() == null)
            return false;
        if (other.getMinAdjustmentMagnitude() != null && other.getMinAdjustmentMagnitude().equals(this.getMinAdjustmentMagnitude()) == false)
            return false;
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null)
            return false;
        if (other.getScalingAdjustment() != null && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false)
            return false;
        if (other.getCooldown() == null ^ this.getCooldown() == null)
            return false;
        if (other.getCooldown() != null && other.getCooldown().equals(this.getCooldown()) == false)
            return false;
        if (other.getMetricAggregationType() == null ^ this.getMetricAggregationType() == null)
            return false;
        if (other.getMetricAggregationType() != null && other.getMetricAggregationType().equals(this.getMetricAggregationType()) == false)
            return false;
        if (other.getStepAdjustments() == null ^ this.getStepAdjustments() == null)
            return false;
        if (other.getStepAdjustments() != null && other.getStepAdjustments().equals(this.getStepAdjustments()) == false)
            return false;
        if (other.getEstimatedInstanceWarmup() == null ^ this.getEstimatedInstanceWarmup() == null)
            return false;
        if (other.getEstimatedInstanceWarmup() != null && other.getEstimatedInstanceWarmup().equals(this.getEstimatedInstanceWarmup()) == false)
            return false;
        if (other.getTargetTrackingConfiguration() == null ^ this.getTargetTrackingConfiguration() == null)
            return false;
        if (other.getTargetTrackingConfiguration() != null && other.getTargetTrackingConfiguration().equals(this.getTargetTrackingConfiguration()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPredictiveScalingConfiguration() == null ^ this.getPredictiveScalingConfiguration() == null)
            return false;
        if (other.getPredictiveScalingConfiguration() != null
                && other.getPredictiveScalingConfiguration().equals(this.getPredictiveScalingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode());
        hashCode = prime * hashCode + ((getMinAdjustmentStep() == null) ? 0 : getMinAdjustmentStep().hashCode());
        hashCode = prime * hashCode + ((getMinAdjustmentMagnitude() == null) ? 0 : getMinAdjustmentMagnitude().hashCode());
        hashCode = prime * hashCode + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode());
        hashCode = prime * hashCode + ((getCooldown() == null) ? 0 : getCooldown().hashCode());
        hashCode = prime * hashCode + ((getMetricAggregationType() == null) ? 0 : getMetricAggregationType().hashCode());
        hashCode = prime * hashCode + ((getStepAdjustments() == null) ? 0 : getStepAdjustments().hashCode());
        hashCode = prime * hashCode + ((getEstimatedInstanceWarmup() == null) ? 0 : getEstimatedInstanceWarmup().hashCode());
        hashCode = prime * hashCode + ((getTargetTrackingConfiguration() == null) ? 0 : getTargetTrackingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPredictiveScalingConfiguration() == null) ? 0 : getPredictiveScalingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutScalingPolicyRequest clone() {
        return (PutScalingPolicyRequest) super.clone();
    }

}
