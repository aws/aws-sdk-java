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
 * Information about the resource for each individual EKS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CoverageResourceDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * EKS cluster details involved in the coverage statistics.
     * </p>
     */
    private CoverageEksClusterDetails eksClusterDetails;
    /**
     * <p>
     * The type of Amazon Web Services resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Information about the Amazon ECS cluster that is assessed for runtime coverage.
     * </p>
     */
    private CoverageEcsClusterDetails ecsClusterDetails;
    /**
     * <p>
     * Information about the Amazon EC2 instance assessed for runtime coverage.
     * </p>
     */
    private CoverageEc2InstanceDetails ec2InstanceDetails;

    /**
     * <p>
     * EKS cluster details involved in the coverage statistics.
     * </p>
     * 
     * @param eksClusterDetails
     *        EKS cluster details involved in the coverage statistics.
     */

    public void setEksClusterDetails(CoverageEksClusterDetails eksClusterDetails) {
        this.eksClusterDetails = eksClusterDetails;
    }

    /**
     * <p>
     * EKS cluster details involved in the coverage statistics.
     * </p>
     * 
     * @return EKS cluster details involved in the coverage statistics.
     */

    public CoverageEksClusterDetails getEksClusterDetails() {
        return this.eksClusterDetails;
    }

    /**
     * <p>
     * EKS cluster details involved in the coverage statistics.
     * </p>
     * 
     * @param eksClusterDetails
     *        EKS cluster details involved in the coverage statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResourceDetails withEksClusterDetails(CoverageEksClusterDetails eksClusterDetails) {
        setEksClusterDetails(eksClusterDetails);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource.
     * </p>
     * 
     * @return The type of Amazon Web Services resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CoverageResourceDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CoverageResourceDetails withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the Amazon ECS cluster that is assessed for runtime coverage.
     * </p>
     * 
     * @param ecsClusterDetails
     *        Information about the Amazon ECS cluster that is assessed for runtime coverage.
     */

    public void setEcsClusterDetails(CoverageEcsClusterDetails ecsClusterDetails) {
        this.ecsClusterDetails = ecsClusterDetails;
    }

    /**
     * <p>
     * Information about the Amazon ECS cluster that is assessed for runtime coverage.
     * </p>
     * 
     * @return Information about the Amazon ECS cluster that is assessed for runtime coverage.
     */

    public CoverageEcsClusterDetails getEcsClusterDetails() {
        return this.ecsClusterDetails;
    }

    /**
     * <p>
     * Information about the Amazon ECS cluster that is assessed for runtime coverage.
     * </p>
     * 
     * @param ecsClusterDetails
     *        Information about the Amazon ECS cluster that is assessed for runtime coverage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResourceDetails withEcsClusterDetails(CoverageEcsClusterDetails ecsClusterDetails) {
        setEcsClusterDetails(ecsClusterDetails);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon EC2 instance assessed for runtime coverage.
     * </p>
     * 
     * @param ec2InstanceDetails
     *        Information about the Amazon EC2 instance assessed for runtime coverage.
     */

    public void setEc2InstanceDetails(CoverageEc2InstanceDetails ec2InstanceDetails) {
        this.ec2InstanceDetails = ec2InstanceDetails;
    }

    /**
     * <p>
     * Information about the Amazon EC2 instance assessed for runtime coverage.
     * </p>
     * 
     * @return Information about the Amazon EC2 instance assessed for runtime coverage.
     */

    public CoverageEc2InstanceDetails getEc2InstanceDetails() {
        return this.ec2InstanceDetails;
    }

    /**
     * <p>
     * Information about the Amazon EC2 instance assessed for runtime coverage.
     * </p>
     * 
     * @param ec2InstanceDetails
     *        Information about the Amazon EC2 instance assessed for runtime coverage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResourceDetails withEc2InstanceDetails(CoverageEc2InstanceDetails ec2InstanceDetails) {
        setEc2InstanceDetails(ec2InstanceDetails);
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
        if (getEksClusterDetails() != null)
            sb.append("EksClusterDetails: ").append(getEksClusterDetails()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getEcsClusterDetails() != null)
            sb.append("EcsClusterDetails: ").append(getEcsClusterDetails()).append(",");
        if (getEc2InstanceDetails() != null)
            sb.append("Ec2InstanceDetails: ").append(getEc2InstanceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageResourceDetails == false)
            return false;
        CoverageResourceDetails other = (CoverageResourceDetails) obj;
        if (other.getEksClusterDetails() == null ^ this.getEksClusterDetails() == null)
            return false;
        if (other.getEksClusterDetails() != null && other.getEksClusterDetails().equals(this.getEksClusterDetails()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getEcsClusterDetails() == null ^ this.getEcsClusterDetails() == null)
            return false;
        if (other.getEcsClusterDetails() != null && other.getEcsClusterDetails().equals(this.getEcsClusterDetails()) == false)
            return false;
        if (other.getEc2InstanceDetails() == null ^ this.getEc2InstanceDetails() == null)
            return false;
        if (other.getEc2InstanceDetails() != null && other.getEc2InstanceDetails().equals(this.getEc2InstanceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEksClusterDetails() == null) ? 0 : getEksClusterDetails().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getEcsClusterDetails() == null) ? 0 : getEcsClusterDetails().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceDetails() == null) ? 0 : getEc2InstanceDetails().hashCode());
        return hashCode;
    }

    @Override
    public CoverageResourceDetails clone() {
        try {
            return (CoverageResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CoverageResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
