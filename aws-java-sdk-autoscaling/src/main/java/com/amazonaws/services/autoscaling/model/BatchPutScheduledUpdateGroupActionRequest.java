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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchPutScheduledUpdateGroupAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutScheduledUpdateGroupActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupActionRequest> scheduledUpdateGroupActions;

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

    public BatchPutScheduledUpdateGroupActionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     * 
     * @return One or more scheduled actions. The maximum number allowed is 50.
     */

    public java.util.List<ScheduledUpdateGroupActionRequest> getScheduledUpdateGroupActions() {
        if (scheduledUpdateGroupActions == null) {
            scheduledUpdateGroupActions = new com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupActionRequest>();
        }
        return scheduledUpdateGroupActions;
    }

    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     * 
     * @param scheduledUpdateGroupActions
     *        One or more scheduled actions. The maximum number allowed is 50.
     */

    public void setScheduledUpdateGroupActions(java.util.Collection<ScheduledUpdateGroupActionRequest> scheduledUpdateGroupActions) {
        if (scheduledUpdateGroupActions == null) {
            this.scheduledUpdateGroupActions = null;
            return;
        }

        this.scheduledUpdateGroupActions = new com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupActionRequest>(scheduledUpdateGroupActions);
    }

    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledUpdateGroupActions(java.util.Collection)} or
     * {@link #withScheduledUpdateGroupActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scheduledUpdateGroupActions
     *        One or more scheduled actions. The maximum number allowed is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutScheduledUpdateGroupActionRequest withScheduledUpdateGroupActions(ScheduledUpdateGroupActionRequest... scheduledUpdateGroupActions) {
        if (this.scheduledUpdateGroupActions == null) {
            setScheduledUpdateGroupActions(new com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupActionRequest>(scheduledUpdateGroupActions.length));
        }
        for (ScheduledUpdateGroupActionRequest ele : scheduledUpdateGroupActions) {
            this.scheduledUpdateGroupActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more scheduled actions. The maximum number allowed is 50.
     * </p>
     * 
     * @param scheduledUpdateGroupActions
     *        One or more scheduled actions. The maximum number allowed is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutScheduledUpdateGroupActionRequest withScheduledUpdateGroupActions(
            java.util.Collection<ScheduledUpdateGroupActionRequest> scheduledUpdateGroupActions) {
        setScheduledUpdateGroupActions(scheduledUpdateGroupActions);
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
        if (getScheduledUpdateGroupActions() != null)
            sb.append("ScheduledUpdateGroupActions: ").append(getScheduledUpdateGroupActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutScheduledUpdateGroupActionRequest == false)
            return false;
        BatchPutScheduledUpdateGroupActionRequest other = (BatchPutScheduledUpdateGroupActionRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledUpdateGroupActions() == null ^ this.getScheduledUpdateGroupActions() == null)
            return false;
        if (other.getScheduledUpdateGroupActions() != null && other.getScheduledUpdateGroupActions().equals(this.getScheduledUpdateGroupActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getScheduledUpdateGroupActions() == null) ? 0 : getScheduledUpdateGroupActions().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutScheduledUpdateGroupActionRequest clone() {
        return (BatchPutScheduledUpdateGroupActionRequest) super.clone();
    }

}
