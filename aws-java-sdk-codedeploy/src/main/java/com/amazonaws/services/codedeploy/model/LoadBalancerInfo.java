/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the load balancer used in a blue/green deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/LoadBalancerInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     * deployment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ELBInfo> elbInfoList;

    /**
     * <p>
     * An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     * deployment.
     * </p>
     * 
     * @return An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     *         deployment.
     */

    public java.util.List<ELBInfo> getElbInfoList() {
        if (elbInfoList == null) {
            elbInfoList = new com.amazonaws.internal.SdkInternalList<ELBInfo>();
        }
        return elbInfoList;
    }

    /**
     * <p>
     * An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     * deployment.
     * </p>
     * 
     * @param elbInfoList
     *        An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     *        deployment.
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
     * An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     * deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElbInfoList(java.util.Collection)} or {@link #withElbInfoList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param elbInfoList
     *        An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     *        deployment.
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
     * An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     * deployment.
     * </p>
     * 
     * @param elbInfoList
     *        An array containing information about the load balancer in Elastic Load Balancing to use in a blue/green
     *        deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerInfo withElbInfoList(java.util.Collection<ELBInfo> elbInfoList) {
        setElbInfoList(elbInfoList);
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
            sb.append("ElbInfoList: ").append(getElbInfoList());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElbInfoList() == null) ? 0 : getElbInfoList().hashCode());
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
