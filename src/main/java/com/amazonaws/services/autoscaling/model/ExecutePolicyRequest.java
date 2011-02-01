/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#executePolicy(ExecutePolicyRequest) ExecutePolicy operation}.
 * <p>
 * Runs the policy you create for your Auto Scaling group in
 * PutScalingPolicy.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#executePolicy(ExecutePolicyRequest)
 */
public class ExecutePolicyRequest extends AmazonWebServiceRequest {

    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name or PolicyARN of the policy you want to run.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String policyName;

    /**
     * Set to True if you want Auto Scaling to reject this request if the
     * Auto Scaling group is in cooldown.
     */
    private Boolean honorCooldown;

    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or ARN of the Auto Scaling Group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling Group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ExecutePolicyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The name or PolicyARN of the policy you want to run.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or PolicyARN of the policy you want to run.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name or PolicyARN of the policy you want to run.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name or PolicyARN of the policy you want to run.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name or PolicyARN of the policy you want to run.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name or PolicyARN of the policy you want to run.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ExecutePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    
    
    /**
     * Set to True if you want Auto Scaling to reject this request if the
     * Auto Scaling group is in cooldown.
     *
     * @return Set to True if you want Auto Scaling to reject this request if the
     *         Auto Scaling group is in cooldown.
     */
    public Boolean isHonorCooldown() {
        return honorCooldown;
    }
    
    /**
     * Set to True if you want Auto Scaling to reject this request if the
     * Auto Scaling group is in cooldown.
     *
     * @param honorCooldown Set to True if you want Auto Scaling to reject this request if the
     *         Auto Scaling group is in cooldown.
     */
    public void setHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
    }
    
    /**
     * Set to True if you want Auto Scaling to reject this request if the
     * Auto Scaling group is in cooldown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param honorCooldown Set to True if you want Auto Scaling to reject this request if the
     *         Auto Scaling group is in cooldown.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ExecutePolicyRequest withHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
        return this;
    }
    
    
    /**
     * Set to True if you want Auto Scaling to reject this request if the
     * Auto Scaling group is in cooldown.
     *
     * @return Set to True if you want Auto Scaling to reject this request if the
     *         Auto Scaling group is in cooldown.
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
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("PolicyName: " + policyName + ", ");
        sb.append("HonorCooldown: " + honorCooldown + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    