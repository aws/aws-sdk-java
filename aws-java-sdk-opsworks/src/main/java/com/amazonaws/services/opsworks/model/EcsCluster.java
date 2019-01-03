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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a registered Amazon ECS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/EcsCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsCluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     */
    private String ecsClusterArn;
    /**
     * <p>
     * The cluster name.
     * </p>
     */
    private String ecsClusterName;
    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The time and date that the cluster was registered with the stack.
     * </p>
     */
    private String registeredAt;

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @param ecsClusterArn
     *        The cluster's ARN.
     */

    public void setEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @return The cluster's ARN.
     */

    public String getEcsClusterArn() {
        return this.ecsClusterArn;
    }

    /**
     * <p>
     * The cluster's ARN.
     * </p>
     * 
     * @param ecsClusterArn
     *        The cluster's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsCluster withEcsClusterArn(String ecsClusterArn) {
        setEcsClusterArn(ecsClusterArn);
        return this;
    }

    /**
     * <p>
     * The cluster name.
     * </p>
     * 
     * @param ecsClusterName
     *        The cluster name.
     */

    public void setEcsClusterName(String ecsClusterName) {
        this.ecsClusterName = ecsClusterName;
    }

    /**
     * <p>
     * The cluster name.
     * </p>
     * 
     * @return The cluster name.
     */

    public String getEcsClusterName() {
        return this.ecsClusterName;
    }

    /**
     * <p>
     * The cluster name.
     * </p>
     * 
     * @param ecsClusterName
     *        The cluster name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsCluster withEcsClusterName(String ecsClusterName) {
        setEcsClusterName(ecsClusterName);
        return this;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsCluster withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The time and date that the cluster was registered with the stack.
     * </p>
     * 
     * @param registeredAt
     *        The time and date that the cluster was registered with the stack.
     */

    public void setRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
    }

    /**
     * <p>
     * The time and date that the cluster was registered with the stack.
     * </p>
     * 
     * @return The time and date that the cluster was registered with the stack.
     */

    public String getRegisteredAt() {
        return this.registeredAt;
    }

    /**
     * <p>
     * The time and date that the cluster was registered with the stack.
     * </p>
     * 
     * @param registeredAt
     *        The time and date that the cluster was registered with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsCluster withRegisteredAt(String registeredAt) {
        setRegisteredAt(registeredAt);
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
        if (getEcsClusterArn() != null)
            sb.append("EcsClusterArn: ").append(getEcsClusterArn()).append(",");
        if (getEcsClusterName() != null)
            sb.append("EcsClusterName: ").append(getEcsClusterName()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getRegisteredAt() != null)
            sb.append("RegisteredAt: ").append(getRegisteredAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsCluster == false)
            return false;
        EcsCluster other = (EcsCluster) obj;
        if (other.getEcsClusterArn() == null ^ this.getEcsClusterArn() == null)
            return false;
        if (other.getEcsClusterArn() != null && other.getEcsClusterArn().equals(this.getEcsClusterArn()) == false)
            return false;
        if (other.getEcsClusterName() == null ^ this.getEcsClusterName() == null)
            return false;
        if (other.getEcsClusterName() != null && other.getEcsClusterName().equals(this.getEcsClusterName()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getRegisteredAt() == null ^ this.getRegisteredAt() == null)
            return false;
        if (other.getRegisteredAt() != null && other.getRegisteredAt().equals(this.getRegisteredAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEcsClusterArn() == null) ? 0 : getEcsClusterArn().hashCode());
        hashCode = prime * hashCode + ((getEcsClusterName() == null) ? 0 : getEcsClusterName().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getRegisteredAt() == null) ? 0 : getRegisteredAt().hashCode());
        return hashCode;
    }

    @Override
    public EcsCluster clone() {
        try {
            return (EcsCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.EcsClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
