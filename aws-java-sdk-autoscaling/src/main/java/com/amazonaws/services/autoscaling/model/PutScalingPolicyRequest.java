/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#putScalingPolicy(PutScalingPolicyRequest) PutScalingPolicy operation}.
 * <p>
 * Creates or updates a policy for an Auto Scaling group. To update an
 * existing policy, use the existing policy name and set the parameters
 * you want to change. Any existing parameter not changed in an update to
 * an existing policy is not changed in this update request.
 * </p>
 * <p>
 * If you exceed your maximum limit of step adjustments, which by default
 * is 20 per region, the call fails. For information about updating this
 * limit, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> AWS Service Limits </a>
 * in the <i>Amazon Web Services General Reference</i> .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#putScalingPolicy(PutScalingPolicyRequest)
 */
public class PutScalingPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name or ARN of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String policyName;

    /**
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>. If the policy type is null, the value is
     * treated as <code>SimpleScaling</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String policyType;

    /**
     * The adjustment type. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html">Dynamic
     * Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String adjustmentType;

    /**
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     */
    private Integer minAdjustmentStep;

    /**
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>,
     * the scaling policy changes the <code>DesiredCapacity</code> of the
     * Auto Scaling group by at least this many instances. Otherwise, the
     * error is <code>ValidationError</code>.
     */
    private Integer minAdjustmentMagnitude;

    /**
     * The amount by which to scale, based on the specified adjustment type.
     * A positive value adds to the current capacity while a negative number
     * removes from the current capacity. <p>This parameter is required if
     * the policy type is <code>SimpleScaling</code> and not supported
     * otherwise.
     */
    private Integer scalingAdjustment;

    /**
     * The amount of time, in seconds, after a scaling activity completes and
     * before the next scaling activity can start. If this parameter is not
     * specified, the default cooldown period for the group applies. <p>This
     * parameter is not supported unless the policy type is
     * <code>SimpleScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    private Integer cooldown;

    /**
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * If the aggregation type is null, the value is treated as
     * <code>Average</code>. <p>This parameter is not supported if the policy
     * type is <code>SimpleScaling</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String metricAggregationType;

    /**
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach. <p>This parameter is required if the policy type is
     * <code>StepScaling</code> and not supported otherwise.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StepAdjustment> stepAdjustments;

    /**
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. The default is to use the value
     * specified for the default cooldown period for the group. <p>This
     * parameter is not supported if the policy type is
     * <code>SimpleScaling</code>.
     */
    private Integer estimatedInstanceWarmup;

    /**
     * The name or ARN of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name or ARN of the group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The name of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the policy.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name of the policy.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name of the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>. If the policy type is null, the value is
     * treated as <code>SimpleScaling</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The policy type. Valid values are <code>SimpleScaling</code> and
     *         <code>StepScaling</code>. If the policy type is null, the value is
     *         treated as <code>SimpleScaling</code>.
     */
    public String getPolicyType() {
        return policyType;
    }
    
    /**
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>. If the policy type is null, the value is
     * treated as <code>SimpleScaling</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyType The policy type. Valid values are <code>SimpleScaling</code> and
     *         <code>StepScaling</code>. If the policy type is null, the value is
     *         treated as <code>SimpleScaling</code>.
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
    
    /**
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>. If the policy type is null, the value is
     * treated as <code>SimpleScaling</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyType The policy type. Valid values are <code>SimpleScaling</code> and
     *         <code>StepScaling</code>. If the policy type is null, the value is
     *         treated as <code>SimpleScaling</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * The adjustment type. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html">Dynamic
     * Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The adjustment type. Valid values are <code>ChangeInCapacity</code>,
     *         <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html">Dynamic
     *         Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }
    
    /**
     * The adjustment type. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html">Dynamic
     * Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param adjustmentType The adjustment type. Valid values are <code>ChangeInCapacity</code>,
     *         <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html">Dynamic
     *         Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }
    
    /**
     * The adjustment type. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html">Dynamic
     * Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param adjustmentType The adjustment type. Valid values are <code>ChangeInCapacity</code>,
     *         <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     *         <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-scale-based-on-demand.html">Dynamic
     *         Scaling</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     *
     * @return Available for backward compatibility. Use
     *         <code>MinAdjustmentMagnitude</code> instead.
     */
    public Integer getMinAdjustmentStep() {
        return minAdjustmentStep;
    }
    
    /**
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     *
     * @param minAdjustmentStep Available for backward compatibility. Use
     *         <code>MinAdjustmentMagnitude</code> instead.
     */
    public void setMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
    }
    
    /**
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minAdjustmentStep Available for backward compatibility. Use
     *         <code>MinAdjustmentMagnitude</code> instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
        return this;
    }

    /**
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>,
     * the scaling policy changes the <code>DesiredCapacity</code> of the
     * Auto Scaling group by at least this many instances. Otherwise, the
     * error is <code>ValidationError</code>.
     *
     * @return The minimum number of instances to scale. If the value of
     *         <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>,
     *         the scaling policy changes the <code>DesiredCapacity</code> of the
     *         Auto Scaling group by at least this many instances. Otherwise, the
     *         error is <code>ValidationError</code>.
     */
    public Integer getMinAdjustmentMagnitude() {
        return minAdjustmentMagnitude;
    }
    
    /**
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>,
     * the scaling policy changes the <code>DesiredCapacity</code> of the
     * Auto Scaling group by at least this many instances. Otherwise, the
     * error is <code>ValidationError</code>.
     *
     * @param minAdjustmentMagnitude The minimum number of instances to scale. If the value of
     *         <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>,
     *         the scaling policy changes the <code>DesiredCapacity</code> of the
     *         Auto Scaling group by at least this many instances. Otherwise, the
     *         error is <code>ValidationError</code>.
     */
    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }
    
    /**
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>,
     * the scaling policy changes the <code>DesiredCapacity</code> of the
     * Auto Scaling group by at least this many instances. Otherwise, the
     * error is <code>ValidationError</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minAdjustmentMagnitude The minimum number of instances to scale. If the value of
     *         <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>,
     *         the scaling policy changes the <code>DesiredCapacity</code> of the
     *         Auto Scaling group by at least this many instances. Otherwise, the
     *         error is <code>ValidationError</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }

    /**
     * The amount by which to scale, based on the specified adjustment type.
     * A positive value adds to the current capacity while a negative number
     * removes from the current capacity. <p>This parameter is required if
     * the policy type is <code>SimpleScaling</code> and not supported
     * otherwise.
     *
     * @return The amount by which to scale, based on the specified adjustment type.
     *         A positive value adds to the current capacity while a negative number
     *         removes from the current capacity. <p>This parameter is required if
     *         the policy type is <code>SimpleScaling</code> and not supported
     *         otherwise.
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }
    
    /**
     * The amount by which to scale, based on the specified adjustment type.
     * A positive value adds to the current capacity while a negative number
     * removes from the current capacity. <p>This parameter is required if
     * the policy type is <code>SimpleScaling</code> and not supported
     * otherwise.
     *
     * @param scalingAdjustment The amount by which to scale, based on the specified adjustment type.
     *         A positive value adds to the current capacity while a negative number
     *         removes from the current capacity. <p>This parameter is required if
     *         the policy type is <code>SimpleScaling</code> and not supported
     *         otherwise.
     */
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }
    
    /**
     * The amount by which to scale, based on the specified adjustment type.
     * A positive value adds to the current capacity while a negative number
     * removes from the current capacity. <p>This parameter is required if
     * the policy type is <code>SimpleScaling</code> and not supported
     * otherwise.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingAdjustment The amount by which to scale, based on the specified adjustment type.
     *         A positive value adds to the current capacity while a negative number
     *         removes from the current capacity. <p>This parameter is required if
     *         the policy type is <code>SimpleScaling</code> and not supported
     *         otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    /**
     * The amount of time, in seconds, after a scaling activity completes and
     * before the next scaling activity can start. If this parameter is not
     * specified, the default cooldown period for the group applies. <p>This
     * parameter is not supported unless the policy type is
     * <code>SimpleScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return The amount of time, in seconds, after a scaling activity completes and
     *         before the next scaling activity can start. If this parameter is not
     *         specified, the default cooldown period for the group applies. <p>This
     *         parameter is not supported unless the policy type is
     *         <code>SimpleScaling</code>. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public Integer getCooldown() {
        return cooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes and
     * before the next scaling activity can start. If this parameter is not
     * specified, the default cooldown period for the group applies. <p>This
     * parameter is not supported unless the policy type is
     * <code>SimpleScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @param cooldown The amount of time, in seconds, after a scaling activity completes and
     *         before the next scaling activity can start. If this parameter is not
     *         specified, the default cooldown period for the group applies. <p>This
     *         parameter is not supported unless the policy type is
     *         <code>SimpleScaling</code>. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes and
     * before the next scaling activity can start. If this parameter is not
     * specified, the default cooldown period for the group applies. <p>This
     * parameter is not supported unless the policy type is
     * <code>SimpleScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cooldown The amount of time, in seconds, after a scaling activity completes and
     *         before the next scaling activity can start. If this parameter is not
     *         specified, the default cooldown period for the group applies. <p>This
     *         parameter is not supported unless the policy type is
     *         <code>SimpleScaling</code>. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * If the aggregation type is null, the value is treated as
     * <code>Average</code>. <p>This parameter is not supported if the policy
     * type is <code>SimpleScaling</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The aggregation type for the CloudWatch metrics. Valid values are
     *         <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     *         If the aggregation type is null, the value is treated as
     *         <code>Average</code>. <p>This parameter is not supported if the policy
     *         type is <code>SimpleScaling</code>.
     */
    public String getMetricAggregationType() {
        return metricAggregationType;
    }
    
    /**
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * If the aggregation type is null, the value is treated as
     * <code>Average</code>. <p>This parameter is not supported if the policy
     * type is <code>SimpleScaling</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param metricAggregationType The aggregation type for the CloudWatch metrics. Valid values are
     *         <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     *         If the aggregation type is null, the value is treated as
     *         <code>Average</code>. <p>This parameter is not supported if the policy
     *         type is <code>SimpleScaling</code>.
     */
    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }
    
    /**
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * If the aggregation type is null, the value is treated as
     * <code>Average</code>. <p>This parameter is not supported if the policy
     * type is <code>SimpleScaling</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param metricAggregationType The aggregation type for the CloudWatch metrics. Valid values are
     *         <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     *         If the aggregation type is null, the value is treated as
     *         <code>Average</code>. <p>This parameter is not supported if the policy
     *         type is <code>SimpleScaling</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
        return this;
    }

    /**
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach. <p>This parameter is required if the policy type is
     * <code>StepScaling</code> and not supported otherwise.
     *
     * @return A set of adjustments that enable you to scale based on the size of the
     *         alarm breach. <p>This parameter is required if the policy type is
     *         <code>StepScaling</code> and not supported otherwise.
     */
    public java.util.List<StepAdjustment> getStepAdjustments() {
        if (stepAdjustments == null) {
              stepAdjustments = new com.amazonaws.internal.ListWithAutoConstructFlag<StepAdjustment>();
              stepAdjustments.setAutoConstruct(true);
        }
        return stepAdjustments;
    }
    
    /**
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach. <p>This parameter is required if the policy type is
     * <code>StepScaling</code> and not supported otherwise.
     *
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     *         alarm breach. <p>This parameter is required if the policy type is
     *         <code>StepScaling</code> and not supported otherwise.
     */
    public void setStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        if (stepAdjustments == null) {
            this.stepAdjustments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StepAdjustment> stepAdjustmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StepAdjustment>(stepAdjustments.size());
        stepAdjustmentsCopy.addAll(stepAdjustments);
        this.stepAdjustments = stepAdjustmentsCopy;
    }
    
    /**
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach. <p>This parameter is required if the policy type is
     * <code>StepScaling</code> and not supported otherwise.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setStepAdjustments(java.util.Collection)} or {@link
     * #withStepAdjustments(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     *         alarm breach. <p>This parameter is required if the policy type is
     *         <code>StepScaling</code> and not supported otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withStepAdjustments(StepAdjustment... stepAdjustments) {
        if (getStepAdjustments() == null) setStepAdjustments(new java.util.ArrayList<StepAdjustment>(stepAdjustments.length));
        for (StepAdjustment value : stepAdjustments) {
            getStepAdjustments().add(value);
        }
        return this;
    }
    
    /**
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach. <p>This parameter is required if the policy type is
     * <code>StepScaling</code> and not supported otherwise.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     *         alarm breach. <p>This parameter is required if the policy type is
     *         <code>StepScaling</code> and not supported otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        if (stepAdjustments == null) {
            this.stepAdjustments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StepAdjustment> stepAdjustmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StepAdjustment>(stepAdjustments.size());
            stepAdjustmentsCopy.addAll(stepAdjustments);
            this.stepAdjustments = stepAdjustmentsCopy;
        }

        return this;
    }

    /**
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. The default is to use the value
     * specified for the default cooldown period for the group. <p>This
     * parameter is not supported if the policy type is
     * <code>SimpleScaling</code>.
     *
     * @return The estimated time, in seconds, until a newly launched instance can
     *         contribute to the CloudWatch metrics. The default is to use the value
     *         specified for the default cooldown period for the group. <p>This
     *         parameter is not supported if the policy type is
     *         <code>SimpleScaling</code>.
     */
    public Integer getEstimatedInstanceWarmup() {
        return estimatedInstanceWarmup;
    }
    
    /**
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. The default is to use the value
     * specified for the default cooldown period for the group. <p>This
     * parameter is not supported if the policy type is
     * <code>SimpleScaling</code>.
     *
     * @param estimatedInstanceWarmup The estimated time, in seconds, until a newly launched instance can
     *         contribute to the CloudWatch metrics. The default is to use the value
     *         specified for the default cooldown period for the group. <p>This
     *         parameter is not supported if the policy type is
     *         <code>SimpleScaling</code>.
     */
    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }
    
    /**
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. The default is to use the value
     * specified for the default cooldown period for the group. <p>This
     * parameter is not supported if the policy type is
     * <code>SimpleScaling</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param estimatedInstanceWarmup The estimated time, in seconds, until a newly launched instance can
     *         contribute to the CloudWatch metrics. The default is to use the value
     *         specified for the default cooldown period for the group. <p>This
     *         parameter is not supported if the policy type is
     *         <code>SimpleScaling</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutScalingPolicyRequest withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyType() != null) sb.append("PolicyType: " + getPolicyType() + ",");
        if (getAdjustmentType() != null) sb.append("AdjustmentType: " + getAdjustmentType() + ",");
        if (getMinAdjustmentStep() != null) sb.append("MinAdjustmentStep: " + getMinAdjustmentStep() + ",");
        if (getMinAdjustmentMagnitude() != null) sb.append("MinAdjustmentMagnitude: " + getMinAdjustmentMagnitude() + ",");
        if (getScalingAdjustment() != null) sb.append("ScalingAdjustment: " + getScalingAdjustment() + ",");
        if (getCooldown() != null) sb.append("Cooldown: " + getCooldown() + ",");
        if (getMetricAggregationType() != null) sb.append("MetricAggregationType: " + getMetricAggregationType() + ",");
        if (getStepAdjustments() != null) sb.append("StepAdjustments: " + getStepAdjustments() + ",");
        if (getEstimatedInstanceWarmup() != null) sb.append("EstimatedInstanceWarmup: " + getEstimatedInstanceWarmup() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutScalingPolicyRequest == false) return false;
        PutScalingPolicyRequest other = (PutScalingPolicyRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyType() == null ^ this.getPolicyType() == null) return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false) return false; 
        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null) return false;
        if (other.getAdjustmentType() != null && other.getAdjustmentType().equals(this.getAdjustmentType()) == false) return false; 
        if (other.getMinAdjustmentStep() == null ^ this.getMinAdjustmentStep() == null) return false;
        if (other.getMinAdjustmentStep() != null && other.getMinAdjustmentStep().equals(this.getMinAdjustmentStep()) == false) return false; 
        if (other.getMinAdjustmentMagnitude() == null ^ this.getMinAdjustmentMagnitude() == null) return false;
        if (other.getMinAdjustmentMagnitude() != null && other.getMinAdjustmentMagnitude().equals(this.getMinAdjustmentMagnitude()) == false) return false; 
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null) return false;
        if (other.getScalingAdjustment() != null && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false) return false; 
        if (other.getCooldown() == null ^ this.getCooldown() == null) return false;
        if (other.getCooldown() != null && other.getCooldown().equals(this.getCooldown()) == false) return false; 
        if (other.getMetricAggregationType() == null ^ this.getMetricAggregationType() == null) return false;
        if (other.getMetricAggregationType() != null && other.getMetricAggregationType().equals(this.getMetricAggregationType()) == false) return false; 
        if (other.getStepAdjustments() == null ^ this.getStepAdjustments() == null) return false;
        if (other.getStepAdjustments() != null && other.getStepAdjustments().equals(this.getStepAdjustments()) == false) return false; 
        if (other.getEstimatedInstanceWarmup() == null ^ this.getEstimatedInstanceWarmup() == null) return false;
        if (other.getEstimatedInstanceWarmup() != null && other.getEstimatedInstanceWarmup().equals(this.getEstimatedInstanceWarmup()) == false) return false; 
        return true;
    }
    
    @Override
    public PutScalingPolicyRequest clone() {
        
            return (PutScalingPolicyRequest) super.clone();
    }

}
    