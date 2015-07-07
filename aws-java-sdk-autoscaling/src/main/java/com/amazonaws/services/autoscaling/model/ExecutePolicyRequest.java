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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#executePolicy(ExecutePolicyRequest) ExecutePolicy operation}.
 * <p>
 * Executes the specified policy.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#executePolicy(ExecutePolicyRequest)
 */
public class ExecutePolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name or ARN of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String policyName;

    /**
     * If this parameter is true, Auto Scaling waits for the cooldown period
     * to complete before executing the policy. Otherwise, Auto Scaling
     * executes the policy without waiting for the cooldown period to
     * complete. <p>This parameter is not supported if the policy type is
     * <code>StepScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    private Boolean honorCooldown;

    /**
     * The metric value to compare to <code>BreachThreshold</code>. This
     * enables you to execute a policy of type <code>StepScaling</code> and
     * determine which step adjustment to use. For example, if the breach
     * threshold is 50 and you want to use a step adjustment with a lower
     * bound of 0 and an upper bound of 10, you can set the metric value to
     * 59. <p>If you specify a metric value that doesn't correspond to a step
     * adjustment for the policy, the call returns an error. <p>This
     * parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     */
    private Double metricValue;

    /**
     * The breach threshold for the alarm. <p>This parameter is required if
     * the policy type is <code>StepScaling</code> and not supported
     * otherwise.
     */
    private Double breachThreshold;

    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExecutePolicyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The name or ARN of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name or ARN of the policy.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name or ARN of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name or ARN of the policy.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name or ARN of the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name or ARN of the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExecutePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * If this parameter is true, Auto Scaling waits for the cooldown period
     * to complete before executing the policy. Otherwise, Auto Scaling
     * executes the policy without waiting for the cooldown period to
     * complete. <p>This parameter is not supported if the policy type is
     * <code>StepScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return If this parameter is true, Auto Scaling waits for the cooldown period
     *         to complete before executing the policy. Otherwise, Auto Scaling
     *         executes the policy without waiting for the cooldown period to
     *         complete. <p>This parameter is not supported if the policy type is
     *         <code>StepScaling</code>. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public Boolean isHonorCooldown() {
        return honorCooldown;
    }
    
    /**
     * If this parameter is true, Auto Scaling waits for the cooldown period
     * to complete before executing the policy. Otherwise, Auto Scaling
     * executes the policy without waiting for the cooldown period to
     * complete. <p>This parameter is not supported if the policy type is
     * <code>StepScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @param honorCooldown If this parameter is true, Auto Scaling waits for the cooldown period
     *         to complete before executing the policy. Otherwise, Auto Scaling
     *         executes the policy without waiting for the cooldown period to
     *         complete. <p>This parameter is not supported if the policy type is
     *         <code>StepScaling</code>. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public void setHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
    }
    
    /**
     * If this parameter is true, Auto Scaling waits for the cooldown period
     * to complete before executing the policy. Otherwise, Auto Scaling
     * executes the policy without waiting for the cooldown period to
     * complete. <p>This parameter is not supported if the policy type is
     * <code>StepScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param honorCooldown If this parameter is true, Auto Scaling waits for the cooldown period
     *         to complete before executing the policy. Otherwise, Auto Scaling
     *         executes the policy without waiting for the cooldown period to
     *         complete. <p>This parameter is not supported if the policy type is
     *         <code>StepScaling</code>. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExecutePolicyRequest withHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
        return this;
    }

    /**
     * If this parameter is true, Auto Scaling waits for the cooldown period
     * to complete before executing the policy. Otherwise, Auto Scaling
     * executes the policy without waiting for the cooldown period to
     * complete. <p>This parameter is not supported if the policy type is
     * <code>StepScaling</code>. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     * Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return If this parameter is true, Auto Scaling waits for the cooldown period
     *         to complete before executing the policy. Otherwise, Auto Scaling
     *         executes the policy without waiting for the cooldown period to
     *         complete. <p>This parameter is not supported if the policy type is
     *         <code>StepScaling</code>. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html">Understanding
     *         Auto Scaling Cooldowns</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public Boolean getHonorCooldown() {
        return honorCooldown;
    }

    /**
     * The metric value to compare to <code>BreachThreshold</code>. This
     * enables you to execute a policy of type <code>StepScaling</code> and
     * determine which step adjustment to use. For example, if the breach
     * threshold is 50 and you want to use a step adjustment with a lower
     * bound of 0 and an upper bound of 10, you can set the metric value to
     * 59. <p>If you specify a metric value that doesn't correspond to a step
     * adjustment for the policy, the call returns an error. <p>This
     * parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     *
     * @return The metric value to compare to <code>BreachThreshold</code>. This
     *         enables you to execute a policy of type <code>StepScaling</code> and
     *         determine which step adjustment to use. For example, if the breach
     *         threshold is 50 and you want to use a step adjustment with a lower
     *         bound of 0 and an upper bound of 10, you can set the metric value to
     *         59. <p>If you specify a metric value that doesn't correspond to a step
     *         adjustment for the policy, the call returns an error. <p>This
     *         parameter is required if the policy type is <code>StepScaling</code>
     *         and not supported otherwise.
     */
    public Double getMetricValue() {
        return metricValue;
    }
    
    /**
     * The metric value to compare to <code>BreachThreshold</code>. This
     * enables you to execute a policy of type <code>StepScaling</code> and
     * determine which step adjustment to use. For example, if the breach
     * threshold is 50 and you want to use a step adjustment with a lower
     * bound of 0 and an upper bound of 10, you can set the metric value to
     * 59. <p>If you specify a metric value that doesn't correspond to a step
     * adjustment for the policy, the call returns an error. <p>This
     * parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     *
     * @param metricValue The metric value to compare to <code>BreachThreshold</code>. This
     *         enables you to execute a policy of type <code>StepScaling</code> and
     *         determine which step adjustment to use. For example, if the breach
     *         threshold is 50 and you want to use a step adjustment with a lower
     *         bound of 0 and an upper bound of 10, you can set the metric value to
     *         59. <p>If you specify a metric value that doesn't correspond to a step
     *         adjustment for the policy, the call returns an error. <p>This
     *         parameter is required if the policy type is <code>StepScaling</code>
     *         and not supported otherwise.
     */
    public void setMetricValue(Double metricValue) {
        this.metricValue = metricValue;
    }
    
    /**
     * The metric value to compare to <code>BreachThreshold</code>. This
     * enables you to execute a policy of type <code>StepScaling</code> and
     * determine which step adjustment to use. For example, if the breach
     * threshold is 50 and you want to use a step adjustment with a lower
     * bound of 0 and an upper bound of 10, you can set the metric value to
     * 59. <p>If you specify a metric value that doesn't correspond to a step
     * adjustment for the policy, the call returns an error. <p>This
     * parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricValue The metric value to compare to <code>BreachThreshold</code>. This
     *         enables you to execute a policy of type <code>StepScaling</code> and
     *         determine which step adjustment to use. For example, if the breach
     *         threshold is 50 and you want to use a step adjustment with a lower
     *         bound of 0 and an upper bound of 10, you can set the metric value to
     *         59. <p>If you specify a metric value that doesn't correspond to a step
     *         adjustment for the policy, the call returns an error. <p>This
     *         parameter is required if the policy type is <code>StepScaling</code>
     *         and not supported otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExecutePolicyRequest withMetricValue(Double metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * The breach threshold for the alarm. <p>This parameter is required if
     * the policy type is <code>StepScaling</code> and not supported
     * otherwise.
     *
     * @return The breach threshold for the alarm. <p>This parameter is required if
     *         the policy type is <code>StepScaling</code> and not supported
     *         otherwise.
     */
    public Double getBreachThreshold() {
        return breachThreshold;
    }
    
    /**
     * The breach threshold for the alarm. <p>This parameter is required if
     * the policy type is <code>StepScaling</code> and not supported
     * otherwise.
     *
     * @param breachThreshold The breach threshold for the alarm. <p>This parameter is required if
     *         the policy type is <code>StepScaling</code> and not supported
     *         otherwise.
     */
    public void setBreachThreshold(Double breachThreshold) {
        this.breachThreshold = breachThreshold;
    }
    
    /**
     * The breach threshold for the alarm. <p>This parameter is required if
     * the policy type is <code>StepScaling</code> and not supported
     * otherwise.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param breachThreshold The breach threshold for the alarm. <p>This parameter is required if
     *         the policy type is <code>StepScaling</code> and not supported
     *         otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ExecutePolicyRequest withBreachThreshold(Double breachThreshold) {
        this.breachThreshold = breachThreshold;
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
        if (isHonorCooldown() != null) sb.append("HonorCooldown: " + isHonorCooldown() + ",");
        if (getMetricValue() != null) sb.append("MetricValue: " + getMetricValue() + ",");
        if (getBreachThreshold() != null) sb.append("BreachThreshold: " + getBreachThreshold() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((isHonorCooldown() == null) ? 0 : isHonorCooldown().hashCode()); 
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode()); 
        hashCode = prime * hashCode + ((getBreachThreshold() == null) ? 0 : getBreachThreshold().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExecutePolicyRequest == false) return false;
        ExecutePolicyRequest other = (ExecutePolicyRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.isHonorCooldown() == null ^ this.isHonorCooldown() == null) return false;
        if (other.isHonorCooldown() != null && other.isHonorCooldown().equals(this.isHonorCooldown()) == false) return false; 
        if (other.getMetricValue() == null ^ this.getMetricValue() == null) return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false) return false; 
        if (other.getBreachThreshold() == null ^ this.getBreachThreshold() == null) return false;
        if (other.getBreachThreshold() != null && other.getBreachThreshold().equals(this.getBreachThreshold()) == false) return false; 
        return true;
    }
    
    @Override
    public ExecutePolicyRequest clone() {
        
            return (ExecutePolicyRequest) super.clone();
    }

}
    