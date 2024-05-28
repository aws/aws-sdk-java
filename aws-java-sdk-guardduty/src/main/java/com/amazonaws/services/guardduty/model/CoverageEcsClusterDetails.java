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
 * Contains information about Amazon ECS cluster runtime coverage details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CoverageEcsClusterDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageEcsClusterDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon ECS cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * Information about the Fargate details associated with the Amazon ECS cluster.
     * </p>
     */
    private FargateDetails fargateDetails;
    /**
     * <p>
     * Information about the Amazon ECS container running on Amazon EC2 instance.
     * </p>
     */
    private ContainerInstanceDetails containerInstanceDetails;

    /**
     * <p>
     * The name of the Amazon ECS cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon ECS cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Amazon ECS cluster.
     * </p>
     * 
     * @return The name of the Amazon ECS cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Amazon ECS cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the Amazon ECS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEcsClusterDetails withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * Information about the Fargate details associated with the Amazon ECS cluster.
     * </p>
     * 
     * @param fargateDetails
     *        Information about the Fargate details associated with the Amazon ECS cluster.
     */

    public void setFargateDetails(FargateDetails fargateDetails) {
        this.fargateDetails = fargateDetails;
    }

    /**
     * <p>
     * Information about the Fargate details associated with the Amazon ECS cluster.
     * </p>
     * 
     * @return Information about the Fargate details associated with the Amazon ECS cluster.
     */

    public FargateDetails getFargateDetails() {
        return this.fargateDetails;
    }

    /**
     * <p>
     * Information about the Fargate details associated with the Amazon ECS cluster.
     * </p>
     * 
     * @param fargateDetails
     *        Information about the Fargate details associated with the Amazon ECS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEcsClusterDetails withFargateDetails(FargateDetails fargateDetails) {
        setFargateDetails(fargateDetails);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon ECS container running on Amazon EC2 instance.
     * </p>
     * 
     * @param containerInstanceDetails
     *        Information about the Amazon ECS container running on Amazon EC2 instance.
     */

    public void setContainerInstanceDetails(ContainerInstanceDetails containerInstanceDetails) {
        this.containerInstanceDetails = containerInstanceDetails;
    }

    /**
     * <p>
     * Information about the Amazon ECS container running on Amazon EC2 instance.
     * </p>
     * 
     * @return Information about the Amazon ECS container running on Amazon EC2 instance.
     */

    public ContainerInstanceDetails getContainerInstanceDetails() {
        return this.containerInstanceDetails;
    }

    /**
     * <p>
     * Information about the Amazon ECS container running on Amazon EC2 instance.
     * </p>
     * 
     * @param containerInstanceDetails
     *        Information about the Amazon ECS container running on Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageEcsClusterDetails withContainerInstanceDetails(ContainerInstanceDetails containerInstanceDetails) {
        setContainerInstanceDetails(containerInstanceDetails);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getFargateDetails() != null)
            sb.append("FargateDetails: ").append(getFargateDetails()).append(",");
        if (getContainerInstanceDetails() != null)
            sb.append("ContainerInstanceDetails: ").append(getContainerInstanceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageEcsClusterDetails == false)
            return false;
        CoverageEcsClusterDetails other = (CoverageEcsClusterDetails) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getFargateDetails() == null ^ this.getFargateDetails() == null)
            return false;
        if (other.getFargateDetails() != null && other.getFargateDetails().equals(this.getFargateDetails()) == false)
            return false;
        if (other.getContainerInstanceDetails() == null ^ this.getContainerInstanceDetails() == null)
            return false;
        if (other.getContainerInstanceDetails() != null && other.getContainerInstanceDetails().equals(this.getContainerInstanceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getFargateDetails() == null) ? 0 : getFargateDetails().hashCode());
        hashCode = prime * hashCode + ((getContainerInstanceDetails() == null) ? 0 : getContainerInstanceDetails().hashCode());
        return hashCode;
    }

    @Override
    public CoverageEcsClusterDetails clone() {
        try {
            return (CoverageEcsClusterDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CoverageEcsClusterDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
