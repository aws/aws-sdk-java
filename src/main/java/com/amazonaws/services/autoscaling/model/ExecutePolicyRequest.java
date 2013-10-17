/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class ExecutePolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name or the Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name or ARN of the policy you want to run.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String policyName;

    /**
     * Set to <code>True</code> if you want Auto Scaling to wait for the
     * cooldown period associated with the Auto Scaling group to complete
     * before executing the policy. <p>Set to <code>False</code> if you want
     * Auto Scaling to circumvent the cooldown period associated with the
     * Auto Scaling group and execute the policy before the cooldown period
     * ends. <p>For information about cooldown period, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    private Boolean honorCooldown;

    /**
     * The name or the Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or the Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or the Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or the Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or the Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or the Amazon Resource Name (ARN) of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExecutePolicyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The name or ARN of the policy you want to run.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or ARN of the policy you want to run.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name or ARN of the policy you want to run.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name or ARN of the policy you want to run.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name or ARN of the policy you want to run.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name or ARN of the policy you want to run.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExecutePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Set to <code>True</code> if you want Auto Scaling to wait for the
     * cooldown period associated with the Auto Scaling group to complete
     * before executing the policy. <p>Set to <code>False</code> if you want
     * Auto Scaling to circumvent the cooldown period associated with the
     * Auto Scaling group and execute the policy before the cooldown period
     * ends. <p>For information about cooldown period, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return Set to <code>True</code> if you want Auto Scaling to wait for the
     *         cooldown period associated with the Auto Scaling group to complete
     *         before executing the policy. <p>Set to <code>False</code> if you want
     *         Auto Scaling to circumvent the cooldown period associated with the
     *         Auto Scaling group and execute the policy before the cooldown period
     *         ends. <p>For information about cooldown period, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     *         Period</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public Boolean isHonorCooldown() {
        return honorCooldown;
    }
    
    /**
     * Set to <code>True</code> if you want Auto Scaling to wait for the
     * cooldown period associated with the Auto Scaling group to complete
     * before executing the policy. <p>Set to <code>False</code> if you want
     * Auto Scaling to circumvent the cooldown period associated with the
     * Auto Scaling group and execute the policy before the cooldown period
     * ends. <p>For information about cooldown period, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @param honorCooldown Set to <code>True</code> if you want Auto Scaling to wait for the
     *         cooldown period associated with the Auto Scaling group to complete
     *         before executing the policy. <p>Set to <code>False</code> if you want
     *         Auto Scaling to circumvent the cooldown period associated with the
     *         Auto Scaling group and execute the policy before the cooldown period
     *         ends. <p>For information about cooldown period, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     *         Period</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public void setHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
    }
    
    /**
     * Set to <code>True</code> if you want Auto Scaling to wait for the
     * cooldown period associated with the Auto Scaling group to complete
     * before executing the policy. <p>Set to <code>False</code> if you want
     * Auto Scaling to circumvent the cooldown period associated with the
     * Auto Scaling group and execute the policy before the cooldown period
     * ends. <p>For information about cooldown period, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param honorCooldown Set to <code>True</code> if you want Auto Scaling to wait for the
     *         cooldown period associated with the Auto Scaling group to complete
     *         before executing the policy. <p>Set to <code>False</code> if you want
     *         Auto Scaling to circumvent the cooldown period associated with the
     *         Auto Scaling group and execute the policy before the cooldown period
     *         ends. <p>For information about cooldown period, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     *         Period</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExecutePolicyRequest withHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
        return this;
    }

    /**
     * Set to <code>True</code> if you want Auto Scaling to wait for the
     * cooldown period associated with the Auto Scaling group to complete
     * before executing the policy. <p>Set to <code>False</code> if you want
     * Auto Scaling to circumvent the cooldown period associated with the
     * Auto Scaling group and execute the policy before the cooldown period
     * ends. <p>For information about cooldown period, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     * Period</a> in the <i>Auto Scaling Developer Guide</i>.
     *
     * @return Set to <code>True</code> if you want Auto Scaling to wait for the
     *         cooldown period associated with the Auto Scaling group to complete
     *         before executing the policy. <p>Set to <code>False</code> if you want
     *         Auto Scaling to circumvent the cooldown period associated with the
     *         Auto Scaling group and execute the policy before the cooldown period
     *         ends. <p>For information about cooldown period, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AS_Concepts.html#Cooldown">Cooldown
     *         Period</a> in the <i>Auto Scaling Developer Guide</i>.
     */
    public Boolean getHonorCooldown() {
        return honorCooldown;
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
        if (isHonorCooldown() != null) sb.append("HonorCooldown: " + isHonorCooldown() );
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
        return true;
    }
    
}
    