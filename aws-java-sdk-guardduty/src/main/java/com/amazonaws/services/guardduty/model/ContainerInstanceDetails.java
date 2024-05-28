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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the Amazon EC2 instance that is running the Amazon ECS container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ContainerInstanceDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerInstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the nodes in the Amazon ECS cluster that has a <code>HEALTHY</code> coverage status.
     * </p>
     */
    private Long coveredContainerInstances;
    /**
     * <p>
     * Represents total number of nodes in the Amazon ECS cluster.
     * </p>
     */
    private Long compatibleContainerInstances;

    /**
     * <p>
     * Represents the nodes in the Amazon ECS cluster that has a <code>HEALTHY</code> coverage status.
     * </p>
     * 
     * @param coveredContainerInstances
     *        Represents the nodes in the Amazon ECS cluster that has a <code>HEALTHY</code> coverage status.
     */

    public void setCoveredContainerInstances(Long coveredContainerInstances) {
        this.coveredContainerInstances = coveredContainerInstances;
    }

    /**
     * <p>
     * Represents the nodes in the Amazon ECS cluster that has a <code>HEALTHY</code> coverage status.
     * </p>
     * 
     * @return Represents the nodes in the Amazon ECS cluster that has a <code>HEALTHY</code> coverage status.
     */

    public Long getCoveredContainerInstances() {
        return this.coveredContainerInstances;
    }

    /**
     * <p>
     * Represents the nodes in the Amazon ECS cluster that has a <code>HEALTHY</code> coverage status.
     * </p>
     * 
     * @param coveredContainerInstances
     *        Represents the nodes in the Amazon ECS cluster that has a <code>HEALTHY</code> coverage status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstanceDetails withCoveredContainerInstances(Long coveredContainerInstances) {
        setCoveredContainerInstances(coveredContainerInstances);
        return this;
    }

    /**
     * <p>
     * Represents total number of nodes in the Amazon ECS cluster.
     * </p>
     * 
     * @param compatibleContainerInstances
     *        Represents total number of nodes in the Amazon ECS cluster.
     */

    public void setCompatibleContainerInstances(Long compatibleContainerInstances) {
        this.compatibleContainerInstances = compatibleContainerInstances;
    }

    /**
     * <p>
     * Represents total number of nodes in the Amazon ECS cluster.
     * </p>
     * 
     * @return Represents total number of nodes in the Amazon ECS cluster.
     */

    public Long getCompatibleContainerInstances() {
        return this.compatibleContainerInstances;
    }

    /**
     * <p>
     * Represents total number of nodes in the Amazon ECS cluster.
     * </p>
     * 
     * @param compatibleContainerInstances
     *        Represents total number of nodes in the Amazon ECS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstanceDetails withCompatibleContainerInstances(Long compatibleContainerInstances) {
        setCompatibleContainerInstances(compatibleContainerInstances);
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
        if (getCoveredContainerInstances() != null)
            sb.append("CoveredContainerInstances: ").append(getCoveredContainerInstances()).append(",");
        if (getCompatibleContainerInstances() != null)
            sb.append("CompatibleContainerInstances: ").append(getCompatibleContainerInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerInstanceDetails == false)
            return false;
        ContainerInstanceDetails other = (ContainerInstanceDetails) obj;
        if (other.getCoveredContainerInstances() == null ^ this.getCoveredContainerInstances() == null)
            return false;
        if (other.getCoveredContainerInstances() != null && other.getCoveredContainerInstances().equals(this.getCoveredContainerInstances()) == false)
            return false;
        if (other.getCompatibleContainerInstances() == null ^ this.getCompatibleContainerInstances() == null)
            return false;
        if (other.getCompatibleContainerInstances() != null && other.getCompatibleContainerInstances().equals(this.getCompatibleContainerInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoveredContainerInstances() == null) ? 0 : getCoveredContainerInstances().hashCode());
        hashCode = prime * hashCode + ((getCompatibleContainerInstances() == null) ? 0 : getCompatibleContainerInstances().hashCode());
        return hashCode;
    }

    @Override
    public ContainerInstanceDetails clone() {
        try {
            return (ContainerInstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ContainerInstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
