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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchDeleteScheduledAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteScheduledActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed is 50.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scheduledActionNames;

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

    public BatchDeleteScheduledActionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed is 50.
     * </p>
     * 
     * @return The names of the scheduled actions to delete. The maximum number allowed is 50.
     */

    public java.util.List<String> getScheduledActionNames() {
        if (scheduledActionNames == null) {
            scheduledActionNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scheduledActionNames;
    }

    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed is 50.
     * </p>
     * 
     * @param scheduledActionNames
     *        The names of the scheduled actions to delete. The maximum number allowed is 50.
     */

    public void setScheduledActionNames(java.util.Collection<String> scheduledActionNames) {
        if (scheduledActionNames == null) {
            this.scheduledActionNames = null;
            return;
        }

        this.scheduledActionNames = new com.amazonaws.internal.SdkInternalList<String>(scheduledActionNames);
    }

    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed is 50.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledActionNames(java.util.Collection)} or {@link #withScheduledActionNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scheduledActionNames
     *        The names of the scheduled actions to delete. The maximum number allowed is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteScheduledActionRequest withScheduledActionNames(String... scheduledActionNames) {
        if (this.scheduledActionNames == null) {
            setScheduledActionNames(new com.amazonaws.internal.SdkInternalList<String>(scheduledActionNames.length));
        }
        for (String ele : scheduledActionNames) {
            this.scheduledActionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the scheduled actions to delete. The maximum number allowed is 50.
     * </p>
     * 
     * @param scheduledActionNames
     *        The names of the scheduled actions to delete. The maximum number allowed is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteScheduledActionRequest withScheduledActionNames(java.util.Collection<String> scheduledActionNames) {
        setScheduledActionNames(scheduledActionNames);
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
        if (getScheduledActionNames() != null)
            sb.append("ScheduledActionNames: ").append(getScheduledActionNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteScheduledActionRequest == false)
            return false;
        BatchDeleteScheduledActionRequest other = (BatchDeleteScheduledActionRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledActionNames() == null ^ this.getScheduledActionNames() == null)
            return false;
        if (other.getScheduledActionNames() != null && other.getScheduledActionNames().equals(this.getScheduledActionNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionNames() == null) ? 0 : getScheduledActionNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteScheduledActionRequest clone() {
        return (BatchDeleteScheduledActionRequest) super.clone();
    }

}
