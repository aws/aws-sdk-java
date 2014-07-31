/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest) RecordLifecycleActionHeartbeat operation}.
 * <p>
 * Records a heartbeat for the lifecycle action associated with a
 * specific token. This extends the timeout by the length of time defined
 * by the <code>HeartbeatTimeout</code> parameter of the PutLifecycleHook
 * operation.
 * </p>
 * <p>
 * This operation is a part of the basic sequence for adding a lifecycle
 * hook to an Auto Scaling group:
 * </p>
 * <ol> <li> Create a notification target. A target can be either an
 * Amazon SQS queue or an Amazon SNS topic. </li>
 * <li> Create an IAM role. This role allows Auto Scaling to publish
 * lifecycle notifications to the designated SQS queue or SNS topic.
 * </li>
 * <li> Create the lifecycle hook. You can create a hook that acts when
 * instances launch or when instances terminate. </li>
 * <li> <b>If necessary, record the lifecycle action heartbeat to keep
 * the instance in a pending state.</b> </li>
 * <li> Complete the lifecycle action. </li>
 * </ol> <p>
 * To learn more, see
 * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest)
 */
public class RecordLifecycleActionHeartbeatRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     */
    private String lifecycleHookName;

    /**
     * The name of the Auto Scaling group to which the hook belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * A token that uniquely identifies a specific lifecycle action
     * associated with an instance. Auto Scaling sends this token to the
     * notification target you specified when you created the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String lifecycleActionToken;

    /**
     * The name of the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @return The name of the lifecycle hook.
     */
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }
    
    /**
     * The name of the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName The name of the lifecycle hook.
     */
    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }
    
    /**
     * The name of the lifecycle hook.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName The name of the lifecycle hook.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordLifecycleActionHeartbeatRequest withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * The name of the Auto Scaling group to which the hook belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group to which the hook belongs.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to which the hook belongs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to which the hook belongs.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group to which the hook belongs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group to which the hook belongs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordLifecycleActionHeartbeatRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * A token that uniquely identifies a specific lifecycle action
     * associated with an instance. Auto Scaling sends this token to the
     * notification target you specified when you created the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return A token that uniquely identifies a specific lifecycle action
     *         associated with an instance. Auto Scaling sends this token to the
     *         notification target you specified when you created the lifecycle hook.
     */
    public String getLifecycleActionToken() {
        return lifecycleActionToken;
    }
    
    /**
     * A token that uniquely identifies a specific lifecycle action
     * associated with an instance. Auto Scaling sends this token to the
     * notification target you specified when you created the lifecycle hook.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param lifecycleActionToken A token that uniquely identifies a specific lifecycle action
     *         associated with an instance. Auto Scaling sends this token to the
     *         notification target you specified when you created the lifecycle hook.
     */
    public void setLifecycleActionToken(String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
    }
    
    /**
     * A token that uniquely identifies a specific lifecycle action
     * associated with an instance. Auto Scaling sends this token to the
     * notification target you specified when you created the lifecycle hook.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param lifecycleActionToken A token that uniquely identifies a specific lifecycle action
     *         associated with an instance. Auto Scaling sends this token to the
     *         notification target you specified when you created the lifecycle hook.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordLifecycleActionHeartbeatRequest withLifecycleActionToken(String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
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
        if (getLifecycleHookName() != null) sb.append("LifecycleHookName: " + getLifecycleHookName() + ",");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLifecycleActionToken() != null) sb.append("LifecycleActionToken: " + getLifecycleActionToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLifecycleHookName() == null) ? 0 : getLifecycleHookName().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getLifecycleActionToken() == null) ? 0 : getLifecycleActionToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecordLifecycleActionHeartbeatRequest == false) return false;
        RecordLifecycleActionHeartbeatRequest other = (RecordLifecycleActionHeartbeatRequest)obj;
        
        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null) return false;
        if (other.getLifecycleHookName() != null && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false) return false; 
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getLifecycleActionToken() == null ^ this.getLifecycleActionToken() == null) return false;
        if (other.getLifecycleActionToken() != null && other.getLifecycleActionToken().equals(this.getLifecycleActionToken()) == false) return false; 
        return true;
    }
    
}
    