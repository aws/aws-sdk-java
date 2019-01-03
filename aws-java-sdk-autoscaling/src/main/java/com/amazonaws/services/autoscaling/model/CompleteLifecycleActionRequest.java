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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CompleteLifecycleAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteLifecycleActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     */
    private String lifecycleHookName;
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance.
     * Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle
     * hook.
     * </p>
     */
    private String lifecycleActionToken;
    /**
     * <p>
     * The action for the group to take. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>.
     * </p>
     */
    private String lifecycleActionResult;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * 
     * @param lifecycleHookName
     *        The name of the lifecycle hook.
     */

    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * 
     * @return The name of the lifecycle hook.
     */

    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * 
     * @param lifecycleHookName
     *        The name of the lifecycle hook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteLifecycleActionRequest withLifecycleHookName(String lifecycleHookName) {
        setLifecycleHookName(lifecycleHookName);
        return this;
    }

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

    public CompleteLifecycleActionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance.
     * Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle
     * hook.
     * </p>
     * 
     * @param lifecycleActionToken
     *        A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an
     *        instance. Amazon EC2 Auto Scaling sends this token to the notification target you specified when you
     *        created the lifecycle hook.
     */

    public void setLifecycleActionToken(String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance.
     * Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle
     * hook.
     * </p>
     * 
     * @return A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an
     *         instance. Amazon EC2 Auto Scaling sends this token to the notification target you specified when you
     *         created the lifecycle hook.
     */

    public String getLifecycleActionToken() {
        return this.lifecycleActionToken;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance.
     * Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle
     * hook.
     * </p>
     * 
     * @param lifecycleActionToken
     *        A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an
     *        instance. Amazon EC2 Auto Scaling sends this token to the notification target you specified when you
     *        created the lifecycle hook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteLifecycleActionRequest withLifecycleActionToken(String lifecycleActionToken) {
        setLifecycleActionToken(lifecycleActionToken);
        return this;
    }

    /**
     * <p>
     * The action for the group to take. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>.
     * </p>
     * 
     * @param lifecycleActionResult
     *        The action for the group to take. This parameter can be either <code>CONTINUE</code> or
     *        <code>ABANDON</code>.
     */

    public void setLifecycleActionResult(String lifecycleActionResult) {
        this.lifecycleActionResult = lifecycleActionResult;
    }

    /**
     * <p>
     * The action for the group to take. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>.
     * </p>
     * 
     * @return The action for the group to take. This parameter can be either <code>CONTINUE</code> or
     *         <code>ABANDON</code>.
     */

    public String getLifecycleActionResult() {
        return this.lifecycleActionResult;
    }

    /**
     * <p>
     * The action for the group to take. This parameter can be either <code>CONTINUE</code> or <code>ABANDON</code>.
     * </p>
     * 
     * @param lifecycleActionResult
     *        The action for the group to take. This parameter can be either <code>CONTINUE</code> or
     *        <code>ABANDON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteLifecycleActionRequest withLifecycleActionResult(String lifecycleActionResult) {
        setLifecycleActionResult(lifecycleActionResult);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteLifecycleActionRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getLifecycleHookName() != null)
            sb.append("LifecycleHookName: ").append(getLifecycleHookName()).append(",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getLifecycleActionToken() != null)
            sb.append("LifecycleActionToken: ").append(getLifecycleActionToken()).append(",");
        if (getLifecycleActionResult() != null)
            sb.append("LifecycleActionResult: ").append(getLifecycleActionResult()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteLifecycleActionRequest == false)
            return false;
        CompleteLifecycleActionRequest other = (CompleteLifecycleActionRequest) obj;
        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null)
            return false;
        if (other.getLifecycleHookName() != null && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLifecycleActionToken() == null ^ this.getLifecycleActionToken() == null)
            return false;
        if (other.getLifecycleActionToken() != null && other.getLifecycleActionToken().equals(this.getLifecycleActionToken()) == false)
            return false;
        if (other.getLifecycleActionResult() == null ^ this.getLifecycleActionResult() == null)
            return false;
        if (other.getLifecycleActionResult() != null && other.getLifecycleActionResult().equals(this.getLifecycleActionResult()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleHookName() == null) ? 0 : getLifecycleHookName().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getLifecycleActionToken() == null) ? 0 : getLifecycleActionToken().hashCode());
        hashCode = prime * hashCode + ((getLifecycleActionResult() == null) ? 0 : getLifecycleActionResult().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public CompleteLifecycleActionRequest clone() {
        return (CompleteLifecycleActionRequest) super.clone();
    }

}
