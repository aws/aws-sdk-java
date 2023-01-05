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
 * Defines a logical resource identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/LogicalResourceId" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogicalResourceId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     */
    private String logicalStackName;
    /**
     * <p>
     * The name of the resource group that this resource belongs to.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     */
    private String terraformSourceName;

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     * 
     * @param identifier
     *        The identifier of the resource.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     * 
     * @return The identifier of the resource.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     * 
     * @param identifier
     *        The identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalResourceId withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * 
     * @param logicalStackName
     *        The name of the CloudFormation stack this resource belongs to.
     */

    public void setLogicalStackName(String logicalStackName) {
        this.logicalStackName = logicalStackName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * 
     * @return The name of the CloudFormation stack this resource belongs to.
     */

    public String getLogicalStackName() {
        return this.logicalStackName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * 
     * @param logicalStackName
     *        The name of the CloudFormation stack this resource belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalResourceId withLogicalStackName(String logicalStackName) {
        setLogicalStackName(logicalStackName);
        return this;
    }

    /**
     * <p>
     * The name of the resource group that this resource belongs to.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group that this resource belongs to.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group that this resource belongs to.
     * </p>
     * 
     * @return The name of the resource group that this resource belongs to.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group that this resource belongs to.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group that this resource belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalResourceId withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * 
     * @param terraformSourceName
     *        The name of the Terraform S3 state file this resource belongs to.
     */

    public void setTerraformSourceName(String terraformSourceName) {
        this.terraformSourceName = terraformSourceName;
    }

    /**
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * 
     * @return The name of the Terraform S3 state file this resource belongs to.
     */

    public String getTerraformSourceName() {
        return this.terraformSourceName;
    }

    /**
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * 
     * @param terraformSourceName
     *        The name of the Terraform S3 state file this resource belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalResourceId withTerraformSourceName(String terraformSourceName) {
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getLogicalStackName() != null)
            sb.append("LogicalStackName: ").append(getLogicalStackName()).append(",");
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
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

        if (obj instanceof LogicalResourceId == false)
            return false;
        LogicalResourceId other = (LogicalResourceId) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getLogicalStackName() == null ^ this.getLogicalStackName() == null)
            return false;
        if (other.getLogicalStackName() != null && other.getLogicalStackName().equals(this.getLogicalStackName()) == false)
            return false;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
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

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLogicalStackName() == null) ? 0 : getLogicalStackName().hashCode());
        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getTerraformSourceName() == null) ? 0 : getTerraformSourceName().hashCode());
        return hashCode;
    }

    @Override
    public LogicalResourceId clone() {
        try {
            return (LogicalResourceId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.LogicalResourceIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
