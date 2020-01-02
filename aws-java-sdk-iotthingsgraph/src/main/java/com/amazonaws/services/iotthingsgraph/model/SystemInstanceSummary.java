/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains summary information about a system instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SystemInstanceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemInstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the system instance.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the system instance.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the system instance.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The target of the system instance.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The ID of the Greengrass group where the system instance is deployed.
     * </p>
     */
    private String greengrassGroupName;
    /**
     * <p>
     * The date when the system instance was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the system instance was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The ID of the Greengrass group where the system instance is deployed.
     * </p>
     */
    private String greengrassGroupId;
    /**
     * <p>
     * The version of the Greengrass group where the system instance is deployed.
     * </p>
     */
    private String greengrassGroupVersionId;

    /**
     * <p>
     * The ID of the system instance.
     * </p>
     * 
     * @param id
     *        The ID of the system instance.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the system instance.
     * </p>
     * 
     * @return The ID of the system instance.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the system instance.
     * </p>
     * 
     * @param id
     *        The ID of the system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the system instance.
     * </p>
     * 
     * @param arn
     *        The ARN of the system instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the system instance.
     * </p>
     * 
     * @return The ARN of the system instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the system instance.
     * </p>
     * 
     * @param arn
     *        The ARN of the system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the system instance.
     * </p>
     * 
     * @param status
     *        The status of the system instance.
     * @see SystemInstanceDeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the system instance.
     * </p>
     * 
     * @return The status of the system instance.
     * @see SystemInstanceDeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the system instance.
     * </p>
     * 
     * @param status
     *        The status of the system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SystemInstanceDeploymentStatus
     */

    public SystemInstanceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the system instance.
     * </p>
     * 
     * @param status
     *        The status of the system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SystemInstanceDeploymentStatus
     */

    public SystemInstanceSummary withStatus(SystemInstanceDeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The target of the system instance.
     * </p>
     * 
     * @param target
     *        The target of the system instance.
     * @see DeploymentTarget
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target of the system instance.
     * </p>
     * 
     * @return The target of the system instance.
     * @see DeploymentTarget
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target of the system instance.
     * </p>
     * 
     * @param target
     *        The target of the system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentTarget
     */

    public SystemInstanceSummary withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The target of the system instance.
     * </p>
     * 
     * @param target
     *        The target of the system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentTarget
     */

    public SystemInstanceSummary withTarget(DeploymentTarget target) {
        this.target = target.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @param greengrassGroupName
     *        The ID of the Greengrass group where the system instance is deployed.
     */

    public void setGreengrassGroupName(String greengrassGroupName) {
        this.greengrassGroupName = greengrassGroupName;
    }

    /**
     * <p>
     * The ID of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @return The ID of the Greengrass group where the system instance is deployed.
     */

    public String getGreengrassGroupName() {
        return this.greengrassGroupName;
    }

    /**
     * <p>
     * The ID of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @param greengrassGroupName
     *        The ID of the Greengrass group where the system instance is deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceSummary withGreengrassGroupName(String greengrassGroupName) {
        setGreengrassGroupName(greengrassGroupName);
        return this;
    }

    /**
     * <p>
     * The date when the system instance was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the system instance was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the system instance was created.
     * </p>
     * 
     * @return The date when the system instance was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the system instance was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the system instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the system instance was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the system instance was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the system instance was last updated.
     * </p>
     * 
     * @return The date and time when the system instance was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the system instance was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the system instance was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @param greengrassGroupId
     *        The ID of the Greengrass group where the system instance is deployed.
     */

    public void setGreengrassGroupId(String greengrassGroupId) {
        this.greengrassGroupId = greengrassGroupId;
    }

    /**
     * <p>
     * The ID of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @return The ID of the Greengrass group where the system instance is deployed.
     */

    public String getGreengrassGroupId() {
        return this.greengrassGroupId;
    }

    /**
     * <p>
     * The ID of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @param greengrassGroupId
     *        The ID of the Greengrass group where the system instance is deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceSummary withGreengrassGroupId(String greengrassGroupId) {
        setGreengrassGroupId(greengrassGroupId);
        return this;
    }

    /**
     * <p>
     * The version of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @param greengrassGroupVersionId
     *        The version of the Greengrass group where the system instance is deployed.
     */

    public void setGreengrassGroupVersionId(String greengrassGroupVersionId) {
        this.greengrassGroupVersionId = greengrassGroupVersionId;
    }

    /**
     * <p>
     * The version of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @return The version of the Greengrass group where the system instance is deployed.
     */

    public String getGreengrassGroupVersionId() {
        return this.greengrassGroupVersionId;
    }

    /**
     * <p>
     * The version of the Greengrass group where the system instance is deployed.
     * </p>
     * 
     * @param greengrassGroupVersionId
     *        The version of the Greengrass group where the system instance is deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInstanceSummary withGreengrassGroupVersionId(String greengrassGroupVersionId) {
        setGreengrassGroupVersionId(greengrassGroupVersionId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getGreengrassGroupName() != null)
            sb.append("GreengrassGroupName: ").append(getGreengrassGroupName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getGreengrassGroupId() != null)
            sb.append("GreengrassGroupId: ").append(getGreengrassGroupId()).append(",");
        if (getGreengrassGroupVersionId() != null)
            sb.append("GreengrassGroupVersionId: ").append(getGreengrassGroupVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemInstanceSummary == false)
            return false;
        SystemInstanceSummary other = (SystemInstanceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getGreengrassGroupName() == null ^ this.getGreengrassGroupName() == null)
            return false;
        if (other.getGreengrassGroupName() != null && other.getGreengrassGroupName().equals(this.getGreengrassGroupName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getGreengrassGroupId() == null ^ this.getGreengrassGroupId() == null)
            return false;
        if (other.getGreengrassGroupId() != null && other.getGreengrassGroupId().equals(this.getGreengrassGroupId()) == false)
            return false;
        if (other.getGreengrassGroupVersionId() == null ^ this.getGreengrassGroupVersionId() == null)
            return false;
        if (other.getGreengrassGroupVersionId() != null && other.getGreengrassGroupVersionId().equals(this.getGreengrassGroupVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getGreengrassGroupName() == null) ? 0 : getGreengrassGroupName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getGreengrassGroupId() == null) ? 0 : getGreengrassGroupId().hashCode());
        hashCode = prime * hashCode + ((getGreengrassGroupVersionId() == null) ? 0 : getGreengrassGroupVersionId().hashCode());
        return hashCode;
    }

    @Override
    public SystemInstanceSummary clone() {
        try {
            return (SystemInstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotthingsgraph.model.transform.SystemInstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
