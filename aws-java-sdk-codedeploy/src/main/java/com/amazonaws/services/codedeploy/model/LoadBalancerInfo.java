/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Elastic Load Balancing load balancer or target group used in a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/LoadBalancerInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array containing information about the load balancer to use for load balancing in a deployment. In Elastic
     * Load Balancing, load balancers are used with Classic Load Balancers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ELBInfo> elbInfoList;
    /**
     * <p>
     * An array containing information about the target group to use for load balancing in a deployment. In Elastic Load
     * Balancing, target groups are used with Application Load Balancers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetGroupInfo> targetGroupInfoList;

    /**
     * <p>
     * An array containing information about the load balancer to use for load balancing in a deployment. In Elastic
     * Load Balancing, load balancers are used with Classic Load Balancers.
     * </p>
     * 
     * @return An array containing information about the load balancer to use for load balancing in a deployment. In
     *         Elastic Load Balancing, load balancers are used with Classic Load Balancers.
     */

    public java.util.List<ELBInfo> getElbInfoList() {
        if (elbInfoList == null) {
            elbInfoList = new com.amazonaws.internal.SdkInternalList<ELBInfo>();
        }
        return elbInfoList;
    }

    /**
     * <p>
     * An array containing information about the load balancer to use for load balancing in a deployment. In Elastic
     * Load Balancing, load balancers are used with Classic Load Balancers.
     * </p>
     * 
     * @param elbInfoList
     *        An array containing information about the load balancer to use for load balancing in a deployment. In
     *        Elastic Load Balancing, load balancers are used with Classic Load Balancers.
     */

    public void setElbInfoList(java.util.Collection<ELBInfo> elbInfoList) {
        if (elbInfoList == null) {
            this.elbInfoList = null;
            return;
        }

        this.elbInfoList = new com.amazonaws.internal.SdkInternalList<ELBInfo>(elbInfoList);
    }

    /**
     * <p>
     * An array containing information about the load balancer to use for load balancing in a deployment. In Elastic
     * Load Balancing, load balancers are used with Classic Load Balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElbInfoList(java.util.Collection)} or {@link #withElbInfoList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param elbInfoList
     *        An array containing information about the load balancer to use for load balancing in a deployment. In
     *        Elastic Load Balancing, load balancers are used with Classic Load Balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withElbInfoList(ELBInfo... elbInfoList) {
        if (this.elbInfoList == null) {
            setElbInfoList(new com.amazonaws.internal.SdkInternalList<ELBInfo>(elbInfoList.length));
        }
        for (ELBInfo ele : elbInfoList) {
            this.elbInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing information about the load balancer to use for load balancing in a deployment. In Elastic
     * Load Balancing, load balancers are used with Classic Load Balancers.
     * </p>
     * 
     * @param elbInfoList
     *        An array containing information about the load balancer to use for load balancing in a deployment. In
     *        Elastic Load Balancing, load balancers are used with Classic Load Balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withElbInfoList(java.util.Collection<ELBInfo> elbInfoList) {
        setElbInfoList(elbInfoList);
        return this;
    }

    /**
     * <p>
     * An array containing information about the target group to use for load balancing in a deployment. In Elastic Load
     * Balancing, target groups are used with Application Load Balancers.
     * </p>
     * 
     * @return An array containing information about the target group to use for load balancing in a deployment. In
     *         Elastic Load Balancing, target groups are used with Application Load Balancers.
     */

    public java.util.List<TargetGroupInfo> getTargetGroupInfoList() {
        if (targetGroupInfoList == null) {
            targetGroupInfoList = new com.amazonaws.internal.SdkInternalList<TargetGroupInfo>();
        }
        return targetGroupInfoList;
    }

    /**
     * <p>
     * An array containing information about the target group to use for load balancing in a deployment. In Elastic Load
     * Balancing, target groups are used with Application Load Balancers.
     * </p>
     * 
     * @param targetGroupInfoList
     *        An array containing information about the target group to use for load balancing in a deployment. In
     *        Elastic Load Balancing, target groups are used with Application Load Balancers.
     */

    public void setTargetGroupInfoList(java.util.Collection<TargetGroupInfo> targetGroupInfoList) {
        if (targetGroupInfoList == null) {
            this.targetGroupInfoList = null;
            return;
        }

        this.targetGroupInfoList = new com.amazonaws.internal.SdkInternalList<TargetGroupInfo>(targetGroupInfoList);
    }

    /**
     * <p>
     * An array containing information about the target group to use for load balancing in a deployment. In Elastic Load
     * Balancing, target groups are used with Application Load Balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroupInfoList(java.util.Collection)} or {@link #withTargetGroupInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetGroupInfoList
     *        An array containing information about the target group to use for load balancing in a deployment. In
     *        Elastic Load Balancing, target groups are used with Application Load Balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withTargetGroupInfoList(TargetGroupInfo... targetGroupInfoList) {
        if (this.targetGroupInfoList == null) {
            setTargetGroupInfoList(new com.amazonaws.internal.SdkInternalList<TargetGroupInfo>(targetGroupInfoList.length));
        }
        for (TargetGroupInfo ele : targetGroupInfoList) {
            this.targetGroupInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing information about the target group to use for load balancing in a deployment. In Elastic Load
     * Balancing, target groups are used with Application Load Balancers.
     * </p>
     * 
     * @param targetGroupInfoList
     *        An array containing information about the target group to use for load balancing in a deployment. In
     *        Elastic Load Balancing, target groups are used with Application Load Balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withTargetGroupInfoList(java.util.Collection<TargetGroupInfo> targetGroupInfoList) {
        setTargetGroupInfoList(targetGroupInfoList);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getElbInfoList() != null)
            sb.append("ElbInfoList: ").append(getElbInfoList()).append(",");
        if (getTargetGroupInfoList() != null)
            sb.append("TargetGroupInfoList: ").append(getTargetGroupInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerInfo == false)
            return false;
        LoadBalancerInfo other = (LoadBalancerInfo) obj;
        if (other.getElbInfoList() == null ^ this.getElbInfoList() == null)
            return false;
        if (other.getElbInfoList() != null && other.getElbInfoList().equals(this.getElbInfoList()) == false)
            return false;
        if (other.getTargetGroupInfoList() == null ^ this.getTargetGroupInfoList() == null)
            return false;
        if (other.getTargetGroupInfoList() != null && other.getTargetGroupInfoList().equals(this.getTargetGroupInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElbInfoList() == null) ? 0 : getElbInfoList().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupInfoList() == null) ? 0 : getTargetGroupInfoList().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerInfo clone() {
        try {
            return (LoadBalancerInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.LoadBalancerInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
