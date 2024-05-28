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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a resource mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResourceMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the application this resource is mapped to when the <code>mappingType</code> is
     * <code>AppRegistryApp</code>.
     * </p>
     */
    private String appRegistryAppName;
    /**
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is mapped to when the
     * <code>mappingType</code> is <code>EKS</code>.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     */
    private String eksSourceName;
    /**
     * <p>
     * Name of the CloudFormation stack this resource is mapped to when the <code>mappingType</code> is
     * <code>CfnStack</code>.
     * </p>
     */
    private String logicalStackName;
    /**
     * <p>
     * Specifies the type of resource mapping.
     * </p>
     */
    private String mappingType;
    /**
     * <p>
     * Identifier of the physical resource.
     * </p>
     */
    private PhysicalResourceId physicalResourceId;
    /**
     * <p>
     * Name of the Resource Groups that this resource is mapped to when the <code>mappingType</code> is
     * <code>ResourceGroup</code>.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * Name of the resource that this resource is mapped to when the <code>mappingType</code> is <code>Resource</code>.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * Name of the Terraform source that this resource is mapped to when the <code>mappingType</code> is
     * <code>Terraform</code>.
     * </p>
     */
    private String terraformSourceName;

    /**
     * <p>
     * Name of the application this resource is mapped to when the <code>mappingType</code> is
     * <code>AppRegistryApp</code>.
     * </p>
     * 
     * @param appRegistryAppName
     *        Name of the application this resource is mapped to when the <code>mappingType</code> is
     *        <code>AppRegistryApp</code>.
     */

    public void setAppRegistryAppName(String appRegistryAppName) {
        this.appRegistryAppName = appRegistryAppName;
    }

    /**
     * <p>
     * Name of the application this resource is mapped to when the <code>mappingType</code> is
     * <code>AppRegistryApp</code>.
     * </p>
     * 
     * @return Name of the application this resource is mapped to when the <code>mappingType</code> is
     *         <code>AppRegistryApp</code>.
     */

    public String getAppRegistryAppName() {
        return this.appRegistryAppName;
    }

    /**
     * <p>
     * Name of the application this resource is mapped to when the <code>mappingType</code> is
     * <code>AppRegistryApp</code>.
     * </p>
     * 
     * @param appRegistryAppName
     *        Name of the application this resource is mapped to when the <code>mappingType</code> is
     *        <code>AppRegistryApp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withAppRegistryAppName(String appRegistryAppName) {
        setAppRegistryAppName(appRegistryAppName);
        return this;
    }

    /**
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is mapped to when the
     * <code>mappingType</code> is <code>EKS</code>.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * 
     * @param eksSourceName
     *        Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is mapped to when
     *        the <code>mappingType</code> is <code>EKS</code>.</p> <note>
     *        <p>
     *        This parameter accepts values in "eks-cluster/namespace" format.
     *        </p>
     */

    public void setEksSourceName(String eksSourceName) {
        this.eksSourceName = eksSourceName;
    }

    /**
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is mapped to when the
     * <code>mappingType</code> is <code>EKS</code>.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * 
     * @return Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is mapped to when
     *         the <code>mappingType</code> is <code>EKS</code>.</p> <note>
     *         <p>
     *         This parameter accepts values in "eks-cluster/namespace" format.
     *         </p>
     */

    public String getEksSourceName() {
        return this.eksSourceName;
    }

    /**
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is mapped to when the
     * <code>mappingType</code> is <code>EKS</code>.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * 
     * @param eksSourceName
     *        Name of the Amazon Elastic Kubernetes Service cluster and namespace that this resource is mapped to when
     *        the <code>mappingType</code> is <code>EKS</code>.</p> <note>
     *        <p>
     *        This parameter accepts values in "eks-cluster/namespace" format.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withEksSourceName(String eksSourceName) {
        setEksSourceName(eksSourceName);
        return this;
    }

    /**
     * <p>
     * Name of the CloudFormation stack this resource is mapped to when the <code>mappingType</code> is
     * <code>CfnStack</code>.
     * </p>
     * 
     * @param logicalStackName
     *        Name of the CloudFormation stack this resource is mapped to when the <code>mappingType</code> is
     *        <code>CfnStack</code>.
     */

    public void setLogicalStackName(String logicalStackName) {
        this.logicalStackName = logicalStackName;
    }

    /**
     * <p>
     * Name of the CloudFormation stack this resource is mapped to when the <code>mappingType</code> is
     * <code>CfnStack</code>.
     * </p>
     * 
     * @return Name of the CloudFormation stack this resource is mapped to when the <code>mappingType</code> is
     *         <code>CfnStack</code>.
     */

    public String getLogicalStackName() {
        return this.logicalStackName;
    }

    /**
     * <p>
     * Name of the CloudFormation stack this resource is mapped to when the <code>mappingType</code> is
     * <code>CfnStack</code>.
     * </p>
     * 
     * @param logicalStackName
     *        Name of the CloudFormation stack this resource is mapped to when the <code>mappingType</code> is
     *        <code>CfnStack</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withLogicalStackName(String logicalStackName) {
        setLogicalStackName(logicalStackName);
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource mapping.
     * </p>
     * 
     * @param mappingType
     *        Specifies the type of resource mapping.
     * @see ResourceMappingType
     */

    public void setMappingType(String mappingType) {
        this.mappingType = mappingType;
    }

    /**
     * <p>
     * Specifies the type of resource mapping.
     * </p>
     * 
     * @return Specifies the type of resource mapping.
     * @see ResourceMappingType
     */

    public String getMappingType() {
        return this.mappingType;
    }

    /**
     * <p>
     * Specifies the type of resource mapping.
     * </p>
     * 
     * @param mappingType
     *        Specifies the type of resource mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceMappingType
     */

    public ResourceMapping withMappingType(String mappingType) {
        setMappingType(mappingType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource mapping.
     * </p>
     * 
     * @param mappingType
     *        Specifies the type of resource mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceMappingType
     */

    public ResourceMapping withMappingType(ResourceMappingType mappingType) {
        this.mappingType = mappingType.toString();
        return this;
    }

    /**
     * <p>
     * Identifier of the physical resource.
     * </p>
     * 
     * @param physicalResourceId
     *        Identifier of the physical resource.
     */

    public void setPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * Identifier of the physical resource.
     * </p>
     * 
     * @return Identifier of the physical resource.
     */

    public PhysicalResourceId getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * Identifier of the physical resource.
     * </p>
     * 
     * @param physicalResourceId
     *        Identifier of the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * Name of the Resource Groups that this resource is mapped to when the <code>mappingType</code> is
     * <code>ResourceGroup</code>.
     * </p>
     * 
     * @param resourceGroupName
     *        Name of the Resource Groups that this resource is mapped to when the <code>mappingType</code> is
     *        <code>ResourceGroup</code>.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * Name of the Resource Groups that this resource is mapped to when the <code>mappingType</code> is
     * <code>ResourceGroup</code>.
     * </p>
     * 
     * @return Name of the Resource Groups that this resource is mapped to when the <code>mappingType</code> is
     *         <code>ResourceGroup</code>.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * Name of the Resource Groups that this resource is mapped to when the <code>mappingType</code> is
     * <code>ResourceGroup</code>.
     * </p>
     * 
     * @param resourceGroupName
     *        Name of the Resource Groups that this resource is mapped to when the <code>mappingType</code> is
     *        <code>ResourceGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * Name of the resource that this resource is mapped to when the <code>mappingType</code> is <code>Resource</code>.
     * </p>
     * 
     * @param resourceName
     *        Name of the resource that this resource is mapped to when the <code>mappingType</code> is
     *        <code>Resource</code>.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * Name of the resource that this resource is mapped to when the <code>mappingType</code> is <code>Resource</code>.
     * </p>
     * 
     * @return Name of the resource that this resource is mapped to when the <code>mappingType</code> is
     *         <code>Resource</code>.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * Name of the resource that this resource is mapped to when the <code>mappingType</code> is <code>Resource</code>.
     * </p>
     * 
     * @param resourceName
     *        Name of the resource that this resource is mapped to when the <code>mappingType</code> is
     *        <code>Resource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * Name of the Terraform source that this resource is mapped to when the <code>mappingType</code> is
     * <code>Terraform</code>.
     * </p>
     * 
     * @param terraformSourceName
     *        Name of the Terraform source that this resource is mapped to when the <code>mappingType</code> is
     *        <code>Terraform</code>.
     */

    public void setTerraformSourceName(String terraformSourceName) {
        this.terraformSourceName = terraformSourceName;
    }

    /**
     * <p>
     * Name of the Terraform source that this resource is mapped to when the <code>mappingType</code> is
     * <code>Terraform</code>.
     * </p>
     * 
     * @return Name of the Terraform source that this resource is mapped to when the <code>mappingType</code> is
     *         <code>Terraform</code>.
     */

    public String getTerraformSourceName() {
        return this.terraformSourceName;
    }

    /**
     * <p>
     * Name of the Terraform source that this resource is mapped to when the <code>mappingType</code> is
     * <code>Terraform</code>.
     * </p>
     * 
     * @param terraformSourceName
     *        Name of the Terraform source that this resource is mapped to when the <code>mappingType</code> is
     *        <code>Terraform</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withTerraformSourceName(String terraformSourceName) {
        setTerraformSourceName(terraformSourceName);
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
        if (getAppRegistryAppName() != null)
            sb.append("AppRegistryAppName: ").append(getAppRegistryAppName()).append(",");
        if (getEksSourceName() != null)
            sb.append("EksSourceName: ").append(getEksSourceName()).append(",");
        if (getLogicalStackName() != null)
            sb.append("LogicalStackName: ").append(getLogicalStackName()).append(",");
        if (getMappingType() != null)
            sb.append("MappingType: ").append(getMappingType()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getTerraformSourceName() != null)
            sb.append("TerraformSourceName: ").append(getTerraformSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceMapping == false)
            return false;
        ResourceMapping other = (ResourceMapping) obj;
        if (other.getAppRegistryAppName() == null ^ this.getAppRegistryAppName() == null)
            return false;
        if (other.getAppRegistryAppName() != null && other.getAppRegistryAppName().equals(this.getAppRegistryAppName()) == false)
            return false;
        if (other.getEksSourceName() == null ^ this.getEksSourceName() == null)
            return false;
        if (other.getEksSourceName() != null && other.getEksSourceName().equals(this.getEksSourceName()) == false)
            return false;
        if (other.getLogicalStackName() == null ^ this.getLogicalStackName() == null)
            return false;
        if (other.getLogicalStackName() != null && other.getLogicalStackName().equals(this.getLogicalStackName()) == false)
            return false;
        if (other.getMappingType() == null ^ this.getMappingType() == null)
            return false;
        if (other.getMappingType() != null && other.getMappingType().equals(this.getMappingType()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getTerraformSourceName() == null ^ this.getTerraformSourceName() == null)
            return false;
        if (other.getTerraformSourceName() != null && other.getTerraformSourceName().equals(this.getTerraformSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppRegistryAppName() == null) ? 0 : getAppRegistryAppName().hashCode());
        hashCode = prime * hashCode + ((getEksSourceName() == null) ? 0 : getEksSourceName().hashCode());
        hashCode = prime * hashCode + ((getLogicalStackName() == null) ? 0 : getLogicalStackName().hashCode());
        hashCode = prime * hashCode + ((getMappingType() == null) ? 0 : getMappingType().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getTerraformSourceName() == null) ? 0 : getTerraformSourceName().hashCode());
        return hashCode;
    }

    @Override
    public ResourceMapping clone() {
        try {
            return (ResourceMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ResourceMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
