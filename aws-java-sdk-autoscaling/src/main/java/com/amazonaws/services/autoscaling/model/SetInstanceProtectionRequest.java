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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceProtection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetInstanceProtectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     */
    private Boolean protectedFromScaleIn;

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @return One or more instance IDs.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetInstanceProtectionRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetInstanceProtectionRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
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

    public SetInstanceProtectionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     * 
     * @param protectedFromScaleIn
     *        Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     */

    public void setProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        this.protectedFromScaleIn = protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     */

    public Boolean getProtectedFromScaleIn() {
        return this.protectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     * 
     * @param protectedFromScaleIn
     *        Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetInstanceProtectionRequest withProtectedFromScaleIn(Boolean protectedFromScaleIn) {
        setProtectedFromScaleIn(protectedFromScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
     */

    public Boolean isProtectedFromScaleIn() {
        return this.protectedFromScaleIn;
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getProtectedFromScaleIn() != null)
            sb.append("ProtectedFromScaleIn: ").append(getProtectedFromScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetInstanceProtectionRequest == false)
            return false;
        SetInstanceProtectionRequest other = (SetInstanceProtectionRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getProtectedFromScaleIn() == null ^ this.getProtectedFromScaleIn() == null)
            return false;
        if (other.getProtectedFromScaleIn() != null && other.getProtectedFromScaleIn().equals(this.getProtectedFromScaleIn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getProtectedFromScaleIn() == null) ? 0 : getProtectedFromScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public SetInstanceProtectionRequest clone() {
        return (SetInstanceProtectionRequest) super.clone();
    }

}
