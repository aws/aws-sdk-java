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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancerTargetGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachLoadBalancerTargetGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> targetGroupARNs;

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

    public AttachLoadBalancerTargetGroupsRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     */

    public java.util.List<String> getTargetGroupARNs() {
        if (targetGroupARNs == null) {
            targetGroupARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return targetGroupARNs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     */

    public void setTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        if (targetGroupARNs == null) {
            this.targetGroupARNs = null;
            return;
        }

        this.targetGroupARNs = new com.amazonaws.internal.SdkInternalList<String>(targetGroupARNs);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroupARNs(java.util.Collection)} or {@link #withTargetGroupARNs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachLoadBalancerTargetGroupsRequest withTargetGroupARNs(String... targetGroupARNs) {
        if (this.targetGroupARNs == null) {
            setTargetGroupARNs(new com.amazonaws.internal.SdkInternalList<String>(targetGroupARNs.length));
        }
        for (String ele : targetGroupARNs) {
            this.targetGroupARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     * </p>
     * 
     * @param targetGroupARNs
     *        The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachLoadBalancerTargetGroupsRequest withTargetGroupARNs(java.util.Collection<String> targetGroupARNs) {
        setTargetGroupARNs(targetGroupARNs);
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
        if (getTargetGroupARNs() != null)
            sb.append("TargetGroupARNs: ").append(getTargetGroupARNs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachLoadBalancerTargetGroupsRequest == false)
            return false;
        AttachLoadBalancerTargetGroupsRequest other = (AttachLoadBalancerTargetGroupsRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getTargetGroupARNs() == null ^ this.getTargetGroupARNs() == null)
            return false;
        if (other.getTargetGroupARNs() != null && other.getTargetGroupARNs().equals(this.getTargetGroupARNs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupARNs() == null) ? 0 : getTargetGroupARNs().hashCode());
        return hashCode;
    }

    @Override
    public AttachLoadBalancerTargetGroupsRequest clone() {
        return (AttachLoadBalancerTargetGroupsRequest) super.clone();
    }

}
