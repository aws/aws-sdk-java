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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#deleteTrigger(DeleteTriggerRequest) DeleteTrigger operation}.
 * <p>
 * Deletes the specified trigger.
 * </p>
 * <p>
 * If a trigger is currently in progress, the trigger continues to run
 * until its activities complete.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#deleteTrigger(DeleteTriggerRequest)
 */
public class DeleteTriggerRequest extends AmazonWebServiceRequest {

    /**
     * The name of the <a>AutoScalingGroup</a> associated with the trigger.
     * The AutoScalingGroup must exist within the scope of the caller's AWS
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the trigger to be deleted. The trigger must exist within
     * the scope of the caller's AWS account. <note> An in-progress trigger
     * will continue until completion. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String triggerName;

    /**
     * The name of the <a>AutoScalingGroup</a> associated with the trigger.
     * The AutoScalingGroup must exist within the scope of the caller's AWS
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the <a>AutoScalingGroup</a> associated with the trigger.
     *         The AutoScalingGroup must exist within the scope of the caller's AWS
     *         account.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the <a>AutoScalingGroup</a> associated with the trigger.
     * The AutoScalingGroup must exist within the scope of the caller's AWS
     * account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the <a>AutoScalingGroup</a> associated with the trigger.
     *         The AutoScalingGroup must exist within the scope of the caller's AWS
     *         account.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the <a>AutoScalingGroup</a> associated with the trigger.
     * The AutoScalingGroup must exist within the scope of the caller's AWS
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the <a>AutoScalingGroup</a> associated with the trigger.
     *         The AutoScalingGroup must exist within the scope of the caller's AWS
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteTriggerRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The name of the trigger to be deleted. The trigger must exist within
     * the scope of the caller's AWS account. <note> An in-progress trigger
     * will continue until completion. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the trigger to be deleted. The trigger must exist within
     *         the scope of the caller's AWS account. <note> An in-progress trigger
     *         will continue until completion. </note>
     */
    public String getTriggerName() {
        return triggerName;
    }
    
    /**
     * The name of the trigger to be deleted. The trigger must exist within
     * the scope of the caller's AWS account. <note> An in-progress trigger
     * will continue until completion. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param triggerName The name of the trigger to be deleted. The trigger must exist within
     *         the scope of the caller's AWS account. <note> An in-progress trigger
     *         will continue until completion. </note>
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }
    
    /**
     * The name of the trigger to be deleted. The trigger must exist within
     * the scope of the caller's AWS account. <note> An in-progress trigger
     * will continue until completion. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param triggerName The name of the trigger to be deleted. The trigger must exist within
     *         the scope of the caller's AWS account. <note> An in-progress trigger
     *         will continue until completion. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteTriggerRequest withTriggerName(String triggerName) {
        this.triggerName = triggerName;
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
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("TriggerName: " + triggerName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    