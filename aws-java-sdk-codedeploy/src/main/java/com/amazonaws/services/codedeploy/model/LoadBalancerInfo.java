/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * You can use load balancers and target groups in combination. For example, if you have two Classic Load Balancers, and
 * five target groups tied to an Application Load Balancer, you can specify the two Classic Load Balancers in
 * <code>elbInfoList</code>, and the five target groups in <code>targetGroupInfoList</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/LoadBalancerInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array that contains information about the load balancers to use for load balancing in a deployment. If you're
     * using Classic Load Balancers, specify those load balancers in this array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 load balancers to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Application Load Balancers or Network Load Balancers, use the <code>targetGroupInfoList</code>
     * array instead of this one.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<ELBInfo> elbInfoList;
    /**
     * <p>
     * An array that contains information about the target groups to use for load balancing in a deployment. If you're
     * using Application Load Balancers and Network Load Balancers, specify their associated target groups in this
     * array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 target groups to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<TargetGroupInfo> targetGroupInfoList;
    /**
     * <p>
     * The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a maximum
     * size of one.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetGroupPairInfo> targetGroupPairInfoList;

    /**
     * <p>
     * An array that contains information about the load balancers to use for load balancing in a deployment. If you're
     * using Classic Load Balancers, specify those load balancers in this array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 load balancers to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Application Load Balancers or Network Load Balancers, use the <code>targetGroupInfoList</code>
     * array instead of this one.
     * </p>
     * </note>
     * 
     * @return An array that contains information about the load balancers to use for load balancing in a deployment. If
     *         you're using Classic Load Balancers, specify those load balancers in this array. </p> <note>
     *         <p>
     *         You can add up to 10 load balancers to the array.
     *         </p>
     *         </note> <note>
     *         <p>
     *         If you're using Application Load Balancers or Network Load Balancers, use the
     *         <code>targetGroupInfoList</code> array instead of this one.
     *         </p>
     */

    public java.util.List<ELBInfo> getElbInfoList() {
        if (elbInfoList == null) {
            elbInfoList = new com.amazonaws.internal.SdkInternalList<ELBInfo>();
        }
        return elbInfoList;
    }

    /**
     * <p>
     * An array that contains information about the load balancers to use for load balancing in a deployment. If you're
     * using Classic Load Balancers, specify those load balancers in this array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 load balancers to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Application Load Balancers or Network Load Balancers, use the <code>targetGroupInfoList</code>
     * array instead of this one.
     * </p>
     * </note>
     * 
     * @param elbInfoList
     *        An array that contains information about the load balancers to use for load balancing in a deployment. If
     *        you're using Classic Load Balancers, specify those load balancers in this array. </p> <note>
     *        <p>
     *        You can add up to 10 load balancers to the array.
     *        </p>
     *        </note> <note>
     *        <p>
     *        If you're using Application Load Balancers or Network Load Balancers, use the
     *        <code>targetGroupInfoList</code> array instead of this one.
     *        </p>
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
     * An array that contains information about the load balancers to use for load balancing in a deployment. If you're
     * using Classic Load Balancers, specify those load balancers in this array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 load balancers to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Application Load Balancers or Network Load Balancers, use the <code>targetGroupInfoList</code>
     * array instead of this one.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElbInfoList(java.util.Collection)} or {@link #withElbInfoList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param elbInfoList
     *        An array that contains information about the load balancers to use for load balancing in a deployment. If
     *        you're using Classic Load Balancers, specify those load balancers in this array. </p> <note>
     *        <p>
     *        You can add up to 10 load balancers to the array.
     *        </p>
     *        </note> <note>
     *        <p>
     *        If you're using Application Load Balancers or Network Load Balancers, use the
     *        <code>targetGroupInfoList</code> array instead of this one.
     *        </p>
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
     * An array that contains information about the load balancers to use for load balancing in a deployment. If you're
     * using Classic Load Balancers, specify those load balancers in this array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 load balancers to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Application Load Balancers or Network Load Balancers, use the <code>targetGroupInfoList</code>
     * array instead of this one.
     * </p>
     * </note>
     * 
     * @param elbInfoList
     *        An array that contains information about the load balancers to use for load balancing in a deployment. If
     *        you're using Classic Load Balancers, specify those load balancers in this array. </p> <note>
     *        <p>
     *        You can add up to 10 load balancers to the array.
     *        </p>
     *        </note> <note>
     *        <p>
     *        If you're using Application Load Balancers or Network Load Balancers, use the
     *        <code>targetGroupInfoList</code> array instead of this one.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withElbInfoList(java.util.Collection<ELBInfo> elbInfoList) {
        setElbInfoList(elbInfoList);
        return this;
    }

    /**
     * <p>
     * An array that contains information about the target groups to use for load balancing in a deployment. If you're
     * using Application Load Balancers and Network Load Balancers, specify their associated target groups in this
     * array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 target groups to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     * </p>
     * </note>
     * 
     * @return An array that contains information about the target groups to use for load balancing in a deployment. If
     *         you're using Application Load Balancers and Network Load Balancers, specify their associated target
     *         groups in this array.</p> <note>
     *         <p>
     *         You can add up to 10 target groups to the array.
     *         </p>
     *         </note> <note>
     *         <p>
     *         If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     *         </p>
     */

    public java.util.List<TargetGroupInfo> getTargetGroupInfoList() {
        if (targetGroupInfoList == null) {
            targetGroupInfoList = new com.amazonaws.internal.SdkInternalList<TargetGroupInfo>();
        }
        return targetGroupInfoList;
    }

    /**
     * <p>
     * An array that contains information about the target groups to use for load balancing in a deployment. If you're
     * using Application Load Balancers and Network Load Balancers, specify their associated target groups in this
     * array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 target groups to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     * </p>
     * </note>
     * 
     * @param targetGroupInfoList
     *        An array that contains information about the target groups to use for load balancing in a deployment. If
     *        you're using Application Load Balancers and Network Load Balancers, specify their associated target groups
     *        in this array.</p> <note>
     *        <p>
     *        You can add up to 10 target groups to the array.
     *        </p>
     *        </note> <note>
     *        <p>
     *        If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     *        </p>
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
     * An array that contains information about the target groups to use for load balancing in a deployment. If you're
     * using Application Load Balancers and Network Load Balancers, specify their associated target groups in this
     * array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 target groups to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroupInfoList(java.util.Collection)} or {@link #withTargetGroupInfoList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetGroupInfoList
     *        An array that contains information about the target groups to use for load balancing in a deployment. If
     *        you're using Application Load Balancers and Network Load Balancers, specify their associated target groups
     *        in this array.</p> <note>
     *        <p>
     *        You can add up to 10 target groups to the array.
     *        </p>
     *        </note> <note>
     *        <p>
     *        If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     *        </p>
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
     * An array that contains information about the target groups to use for load balancing in a deployment. If you're
     * using Application Load Balancers and Network Load Balancers, specify their associated target groups in this
     * array.
     * </p>
     * <note>
     * <p>
     * You can add up to 10 target groups to the array.
     * </p>
     * </note> <note>
     * <p>
     * If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     * </p>
     * </note>
     * 
     * @param targetGroupInfoList
     *        An array that contains information about the target groups to use for load balancing in a deployment. If
     *        you're using Application Load Balancers and Network Load Balancers, specify their associated target groups
     *        in this array.</p> <note>
     *        <p>
     *        You can add up to 10 target groups to the array.
     *        </p>
     *        </note> <note>
     *        <p>
     *        If you're using Classic Load Balancers, use the <code>elbInfoList</code> array instead of this one.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withTargetGroupInfoList(java.util.Collection<TargetGroupInfo> targetGroupInfoList) {
        setTargetGroupInfoList(targetGroupInfoList);
        return this;
    }

    /**
     * <p>
     * The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a maximum
     * size of one.
     * </p>
     * 
     * @return The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a
     *         maximum size of one.
     */

    public java.util.List<TargetGroupPairInfo> getTargetGroupPairInfoList() {
        if (targetGroupPairInfoList == null) {
            targetGroupPairInfoList = new com.amazonaws.internal.SdkInternalList<TargetGroupPairInfo>();
        }
        return targetGroupPairInfoList;
    }

    /**
     * <p>
     * The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a maximum
     * size of one.
     * </p>
     * 
     * @param targetGroupPairInfoList
     *        The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a
     *        maximum size of one.
     */

    public void setTargetGroupPairInfoList(java.util.Collection<TargetGroupPairInfo> targetGroupPairInfoList) {
        if (targetGroupPairInfoList == null) {
            this.targetGroupPairInfoList = null;
            return;
        }

        this.targetGroupPairInfoList = new com.amazonaws.internal.SdkInternalList<TargetGroupPairInfo>(targetGroupPairInfoList);
    }

    /**
     * <p>
     * The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a maximum
     * size of one.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroupPairInfoList(java.util.Collection)} or
     * {@link #withTargetGroupPairInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetGroupPairInfoList
     *        The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a
     *        maximum size of one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withTargetGroupPairInfoList(TargetGroupPairInfo... targetGroupPairInfoList) {
        if (this.targetGroupPairInfoList == null) {
            setTargetGroupPairInfoList(new com.amazonaws.internal.SdkInternalList<TargetGroupPairInfo>(targetGroupPairInfoList.length));
        }
        for (TargetGroupPairInfo ele : targetGroupPairInfoList) {
            this.targetGroupPairInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a maximum
     * size of one.
     * </p>
     * 
     * @param targetGroupPairInfoList
     *        The target group pair information. This is an array of <code>TargeGroupPairInfo</code> objects with a
     *        maximum size of one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withTargetGroupPairInfoList(java.util.Collection<TargetGroupPairInfo> targetGroupPairInfoList) {
        setTargetGroupPairInfoList(targetGroupPairInfoList);
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
        if (getElbInfoList() != null)
            sb.append("ElbInfoList: ").append(getElbInfoList()).append(",");
        if (getTargetGroupInfoList() != null)
            sb.append("TargetGroupInfoList: ").append(getTargetGroupInfoList()).append(",");
        if (getTargetGroupPairInfoList() != null)
            sb.append("TargetGroupPairInfoList: ").append(getTargetGroupPairInfoList());
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
        if (other.getTargetGroupPairInfoList() == null ^ this.getTargetGroupPairInfoList() == null)
            return false;
        if (other.getTargetGroupPairInfoList() != null && other.getTargetGroupPairInfoList().equals(this.getTargetGroupPairInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElbInfoList() == null) ? 0 : getElbInfoList().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupInfoList() == null) ? 0 : getTargetGroupInfoList().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupPairInfoList() == null) ? 0 : getTargetGroupPairInfoList().hashCode());
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
