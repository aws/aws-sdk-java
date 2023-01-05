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
     * The name of the application this resource is mapped to.
     * </p>
     */
    private String appRegistryAppName;
    /**
     * <p>
     * The name of the CloudFormation stack this resource is mapped to.
     * </p>
     */
    private String logicalStackName;
    /**
     * <p>
     * Specifies the type of resource mapping.
     * </p>
     * <dl>
     * <dt>AppRegistryApp</dt>
     * <dd>
     * <p>
     * The resource is mapped to another application. The name of the application is contained in the
     * <code>appRegistryAppName</code> property.
     * </p>
     * </dd>
     * <dt>CfnStack</dt>
     * <dd>
     * <p>
     * The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the
     * <code>logicalStackName</code> property.
     * </p>
     * </dd>
     * <dt>Resource</dt>
     * <dd>
     * <p>
     * The resource is mapped to another resource. The name of the resource is contained in the
     * <code>resourceName</code> property.
     * </p>
     * </dd>
     * <dt>ResourceGroup</dt>
     * <dd>
     * <p>
     * The resource is mapped to a resource group. The name of the resource group is contained in the
     * <code>resourceGroupName</code> property.
     * </p>
     * </dd>
     * </dl>
     */
    private String mappingType;
    /**
     * <p>
     * The identifier of this resource.
     * </p>
     */
    private PhysicalResourceId physicalResourceId;
    /**
     * <p>
     * The name of the resource group this resource is mapped to.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The name of the resource this resource is mapped to.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The short name of the Terraform source.
     * </p>
     */
    private String terraformSourceName;

    /**
     * <p>
     * The name of the application this resource is mapped to.
     * </p>
     * 
     * @param appRegistryAppName
     *        The name of the application this resource is mapped to.
     */

    public void setAppRegistryAppName(String appRegistryAppName) {
        this.appRegistryAppName = appRegistryAppName;
    }

    /**
     * <p>
     * The name of the application this resource is mapped to.
     * </p>
     * 
     * @return The name of the application this resource is mapped to.
     */

    public String getAppRegistryAppName() {
        return this.appRegistryAppName;
    }

    /**
     * <p>
     * The name of the application this resource is mapped to.
     * </p>
     * 
     * @param appRegistryAppName
     *        The name of the application this resource is mapped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withAppRegistryAppName(String appRegistryAppName) {
        setAppRegistryAppName(appRegistryAppName);
        return this;
    }

    /**
     * <p>
     * The name of the CloudFormation stack this resource is mapped to.
     * </p>
     * 
     * @param logicalStackName
     *        The name of the CloudFormation stack this resource is mapped to.
     */

    public void setLogicalStackName(String logicalStackName) {
        this.logicalStackName = logicalStackName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack this resource is mapped to.
     * </p>
     * 
     * @return The name of the CloudFormation stack this resource is mapped to.
     */

    public String getLogicalStackName() {
        return this.logicalStackName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack this resource is mapped to.
     * </p>
     * 
     * @param logicalStackName
     *        The name of the CloudFormation stack this resource is mapped to.
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
     * <dl>
     * <dt>AppRegistryApp</dt>
     * <dd>
     * <p>
     * The resource is mapped to another application. The name of the application is contained in the
     * <code>appRegistryAppName</code> property.
     * </p>
     * </dd>
     * <dt>CfnStack</dt>
     * <dd>
     * <p>
     * The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the
     * <code>logicalStackName</code> property.
     * </p>
     * </dd>
     * <dt>Resource</dt>
     * <dd>
     * <p>
     * The resource is mapped to another resource. The name of the resource is contained in the
     * <code>resourceName</code> property.
     * </p>
     * </dd>
     * <dt>ResourceGroup</dt>
     * <dd>
     * <p>
     * The resource is mapped to a resource group. The name of the resource group is contained in the
     * <code>resourceGroupName</code> property.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param mappingType
     *        Specifies the type of resource mapping.</p>
     *        <dl>
     *        <dt>AppRegistryApp</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to another application. The name of the application is contained in the
     *        <code>appRegistryAppName</code> property.
     *        </p>
     *        </dd>
     *        <dt>CfnStack</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the
     *        <code>logicalStackName</code> property.
     *        </p>
     *        </dd>
     *        <dt>Resource</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to another resource. The name of the resource is contained in the
     *        <code>resourceName</code> property.
     *        </p>
     *        </dd>
     *        <dt>ResourceGroup</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to a resource group. The name of the resource group is contained in the
     *        <code>resourceGroupName</code> property.
     *        </p>
     *        </dd>
     * @see ResourceMappingType
     */

    public void setMappingType(String mappingType) {
        this.mappingType = mappingType;
    }

    /**
     * <p>
     * Specifies the type of resource mapping.
     * </p>
     * <dl>
     * <dt>AppRegistryApp</dt>
     * <dd>
     * <p>
     * The resource is mapped to another application. The name of the application is contained in the
     * <code>appRegistryAppName</code> property.
     * </p>
     * </dd>
     * <dt>CfnStack</dt>
     * <dd>
     * <p>
     * The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the
     * <code>logicalStackName</code> property.
     * </p>
     * </dd>
     * <dt>Resource</dt>
     * <dd>
     * <p>
     * The resource is mapped to another resource. The name of the resource is contained in the
     * <code>resourceName</code> property.
     * </p>
     * </dd>
     * <dt>ResourceGroup</dt>
     * <dd>
     * <p>
     * The resource is mapped to a resource group. The name of the resource group is contained in the
     * <code>resourceGroupName</code> property.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies the type of resource mapping.</p>
     *         <dl>
     *         <dt>AppRegistryApp</dt>
     *         <dd>
     *         <p>
     *         The resource is mapped to another application. The name of the application is contained in the
     *         <code>appRegistryAppName</code> property.
     *         </p>
     *         </dd>
     *         <dt>CfnStack</dt>
     *         <dd>
     *         <p>
     *         The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in
     *         the <code>logicalStackName</code> property.
     *         </p>
     *         </dd>
     *         <dt>Resource</dt>
     *         <dd>
     *         <p>
     *         The resource is mapped to another resource. The name of the resource is contained in the
     *         <code>resourceName</code> property.
     *         </p>
     *         </dd>
     *         <dt>ResourceGroup</dt>
     *         <dd>
     *         <p>
     *         The resource is mapped to a resource group. The name of the resource group is contained in the
     *         <code>resourceGroupName</code> property.
     *         </p>
     *         </dd>
     * @see ResourceMappingType
     */

    public String getMappingType() {
        return this.mappingType;
    }

    /**
     * <p>
     * Specifies the type of resource mapping.
     * </p>
     * <dl>
     * <dt>AppRegistryApp</dt>
     * <dd>
     * <p>
     * The resource is mapped to another application. The name of the application is contained in the
     * <code>appRegistryAppName</code> property.
     * </p>
     * </dd>
     * <dt>CfnStack</dt>
     * <dd>
     * <p>
     * The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the
     * <code>logicalStackName</code> property.
     * </p>
     * </dd>
     * <dt>Resource</dt>
     * <dd>
     * <p>
     * The resource is mapped to another resource. The name of the resource is contained in the
     * <code>resourceName</code> property.
     * </p>
     * </dd>
     * <dt>ResourceGroup</dt>
     * <dd>
     * <p>
     * The resource is mapped to a resource group. The name of the resource group is contained in the
     * <code>resourceGroupName</code> property.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param mappingType
     *        Specifies the type of resource mapping.</p>
     *        <dl>
     *        <dt>AppRegistryApp</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to another application. The name of the application is contained in the
     *        <code>appRegistryAppName</code> property.
     *        </p>
     *        </dd>
     *        <dt>CfnStack</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the
     *        <code>logicalStackName</code> property.
     *        </p>
     *        </dd>
     *        <dt>Resource</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to another resource. The name of the resource is contained in the
     *        <code>resourceName</code> property.
     *        </p>
     *        </dd>
     *        <dt>ResourceGroup</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to a resource group. The name of the resource group is contained in the
     *        <code>resourceGroupName</code> property.
     *        </p>
     *        </dd>
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
     * <dl>
     * <dt>AppRegistryApp</dt>
     * <dd>
     * <p>
     * The resource is mapped to another application. The name of the application is contained in the
     * <code>appRegistryAppName</code> property.
     * </p>
     * </dd>
     * <dt>CfnStack</dt>
     * <dd>
     * <p>
     * The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the
     * <code>logicalStackName</code> property.
     * </p>
     * </dd>
     * <dt>Resource</dt>
     * <dd>
     * <p>
     * The resource is mapped to another resource. The name of the resource is contained in the
     * <code>resourceName</code> property.
     * </p>
     * </dd>
     * <dt>ResourceGroup</dt>
     * <dd>
     * <p>
     * The resource is mapped to a resource group. The name of the resource group is contained in the
     * <code>resourceGroupName</code> property.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param mappingType
     *        Specifies the type of resource mapping.</p>
     *        <dl>
     *        <dt>AppRegistryApp</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to another application. The name of the application is contained in the
     *        <code>appRegistryAppName</code> property.
     *        </p>
     *        </dd>
     *        <dt>CfnStack</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the
     *        <code>logicalStackName</code> property.
     *        </p>
     *        </dd>
     *        <dt>Resource</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to another resource. The name of the resource is contained in the
     *        <code>resourceName</code> property.
     *        </p>
     *        </dd>
     *        <dt>ResourceGroup</dt>
     *        <dd>
     *        <p>
     *        The resource is mapped to a resource group. The name of the resource group is contained in the
     *        <code>resourceGroupName</code> property.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceMappingType
     */

    public ResourceMapping withMappingType(ResourceMappingType mappingType) {
        this.mappingType = mappingType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of this resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The identifier of this resource.
     */

    public void setPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The identifier of this resource.
     * </p>
     * 
     * @return The identifier of this resource.
     */

    public PhysicalResourceId getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The identifier of this resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The identifier of this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name of the resource group this resource is mapped to.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group this resource is mapped to.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group this resource is mapped to.
     * </p>
     * 
     * @return The name of the resource group this resource is mapped to.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group this resource is mapped to.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group this resource is mapped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the resource this resource is mapped to.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource this resource is mapped to.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource this resource is mapped to.
     * </p>
     * 
     * @return The name of the resource this resource is mapped to.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource this resource is mapped to.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource this resource is mapped to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapping withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The short name of the Terraform source.
     * </p>
     * 
     * @param terraformSourceName
     *        The short name of the Terraform source.
     */

    public void setTerraformSourceName(String terraformSourceName) {
        this.terraformSourceName = terraformSourceName;
    }

    /**
     * <p>
     * The short name of the Terraform source.
     * </p>
     * 
     * @return The short name of the Terraform source.
     */

    public String getTerraformSourceName() {
        return this.terraformSourceName;
    }

    /**
     * <p>
     * The short name of the Terraform source.
     * </p>
     * 
     * @param terraformSourceName
     *        The short name of the Terraform source.
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
