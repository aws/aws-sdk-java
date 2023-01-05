/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The placement configuration for all the control plane instances of your local Amazon EKS cluster on an Amazon Web
 * Services Outpost. For more information, see <a
 * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html">Capacity
 * considerations</a> in the <i>Amazon EKS User Guide</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ControlPlanePlacementRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlPlanePlacementRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the placement group for the Kubernetes control plane instances. This setting can't be changed after
     * cluster creation.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The name of the placement group for the Kubernetes control plane instances. This setting can't be changed after
     * cluster creation.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group for the Kubernetes control plane instances. This setting can't be changed
     *        after cluster creation.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group for the Kubernetes control plane instances. This setting can't be changed after
     * cluster creation.
     * </p>
     * 
     * @return The name of the placement group for the Kubernetes control plane instances. This setting can't be changed
     *         after cluster creation.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group for the Kubernetes control plane instances. This setting can't be changed after
     * cluster creation.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group for the Kubernetes control plane instances. This setting can't be changed
     *        after cluster creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlanePlacementRequest withGroupName(String groupName) {
        setGroupName(groupName);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlPlanePlacementRequest == false)
            return false;
        ControlPlanePlacementRequest other = (ControlPlanePlacementRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public ControlPlanePlacementRequest clone() {
        try {
            return (ControlPlanePlacementRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.ControlPlanePlacementRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
