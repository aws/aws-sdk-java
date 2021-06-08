/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a deployment job that AWS IoT Greengrass sends to a AWS IoT Greengrass core device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/EffectiveDeployment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectiveDeployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The name of the deployment.
     * </p>
     * <p>
     * You can create deployments without names. If you create a deployment without a name, the AWS IoT Greengrass V2
     * console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>, where
     * <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * </p>
     */
    private String deploymentName;
    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     */
    private String iotJobId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     */
    private String iotJobArn;
    /**
     * <p>
     * The description of the deployment job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The status of the deployment job on the AWS IoT Greengrass core device.
     * </p>
     */
    private String coreDeviceExecutionStatus;
    /**
     * <p>
     * The reason code for the update, if the job was updated.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The time at which the deployment job was last modified, expressed in ISO 8601 format.
     * </p>
     */
    private java.util.Date modifiedTimestamp;

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @return The ID of the deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * <p>
     * You can create deployments without names. If you create a deployment without a name, the AWS IoT Greengrass V2
     * console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>, where
     * <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * </p>
     * 
     * @param deploymentName
     *        The name of the deployment.</p>
     *        <p>
     *        You can create deployments without names. If you create a deployment without a name, the AWS IoT
     *        Greengrass V2 console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>,
     *        where <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     */

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * <p>
     * You can create deployments without names. If you create a deployment without a name, the AWS IoT Greengrass V2
     * console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>, where
     * <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * </p>
     * 
     * @return The name of the deployment.</p>
     *         <p>
     *         You can create deployments without names. If you create a deployment without a name, the AWS IoT
     *         Greengrass V2 console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>,
     *         where <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     */

    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * <p>
     * The name of the deployment.
     * </p>
     * <p>
     * You can create deployments without names. If you create a deployment without a name, the AWS IoT Greengrass V2
     * console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>, where
     * <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * </p>
     * 
     * @param deploymentName
     *        The name of the deployment.</p>
     *        <p>
     *        You can create deployments without names. If you create a deployment without a name, the AWS IoT
     *        Greengrass V2 console shows the deployment name as <code>&lt;targetType&gt;:&lt;targetName&gt;</code>,
     *        where <code>targetType</code> and <code>targetName</code> are the type and name of the deployment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withDeploymentName(String deploymentName) {
        setDeploymentName(deploymentName);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobId
     *        The ID of the AWS IoT job that applies the deployment to target devices.
     */

    public void setIotJobId(String iotJobId) {
        this.iotJobId = iotJobId;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @return The ID of the AWS IoT job that applies the deployment to target devices.
     */

    public String getIotJobId() {
        return this.iotJobId;
    }

    /**
     * <p>
     * The ID of the AWS IoT job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobId
     *        The ID of the AWS IoT job that applies the deployment to target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withIotJobId(String iotJobId) {
        setIotJobId(iotJobId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        AWS IoT job that applies the deployment to target devices.
     */

    public void setIotJobArn(String iotJobArn) {
        this.iotJobArn = iotJobArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         AWS IoT job that applies the deployment to target devices.
     */

    public String getIotJobArn() {
        return this.iotJobArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the AWS IoT
     * job that applies the deployment to target devices.
     * </p>
     * 
     * @param iotJobArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        AWS IoT job that applies the deployment to target devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withIotJobArn(String iotJobArn) {
        setIotJobArn(iotJobArn);
        return this;
    }

    /**
     * <p>
     * The description of the deployment job.
     * </p>
     * 
     * @param description
     *        The description of the deployment job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the deployment job.
     * </p>
     * 
     * @return The description of the deployment job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the deployment job.
     * </p>
     * 
     * @param description
     *        The description of the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @param targetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        target AWS IoT thing or thing group.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         target AWS IoT thing or thing group.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     * 
     * @param targetArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        target AWS IoT thing or thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The status of the deployment job on the AWS IoT Greengrass core device.
     * </p>
     * 
     * @param coreDeviceExecutionStatus
     *        The status of the deployment job on the AWS IoT Greengrass core device.
     * @see EffectiveDeploymentExecutionStatus
     */

    public void setCoreDeviceExecutionStatus(String coreDeviceExecutionStatus) {
        this.coreDeviceExecutionStatus = coreDeviceExecutionStatus;
    }

    /**
     * <p>
     * The status of the deployment job on the AWS IoT Greengrass core device.
     * </p>
     * 
     * @return The status of the deployment job on the AWS IoT Greengrass core device.
     * @see EffectiveDeploymentExecutionStatus
     */

    public String getCoreDeviceExecutionStatus() {
        return this.coreDeviceExecutionStatus;
    }

    /**
     * <p>
     * The status of the deployment job on the AWS IoT Greengrass core device.
     * </p>
     * 
     * @param coreDeviceExecutionStatus
     *        The status of the deployment job on the AWS IoT Greengrass core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EffectiveDeploymentExecutionStatus
     */

    public EffectiveDeployment withCoreDeviceExecutionStatus(String coreDeviceExecutionStatus) {
        setCoreDeviceExecutionStatus(coreDeviceExecutionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the deployment job on the AWS IoT Greengrass core device.
     * </p>
     * 
     * @param coreDeviceExecutionStatus
     *        The status of the deployment job on the AWS IoT Greengrass core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EffectiveDeploymentExecutionStatus
     */

    public EffectiveDeployment withCoreDeviceExecutionStatus(EffectiveDeploymentExecutionStatus coreDeviceExecutionStatus) {
        this.coreDeviceExecutionStatus = coreDeviceExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason code for the update, if the job was updated.
     * </p>
     * 
     * @param reason
     *        The reason code for the update, if the job was updated.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason code for the update, if the job was updated.
     * </p>
     * 
     * @return The reason code for the update, if the job was updated.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason code for the update, if the job was updated.
     * </p>
     * 
     * @param reason
     *        The reason code for the update, if the job was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the deployment was created, expressed in ISO 8601 format.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the deployment was created, expressed in ISO 8601 format.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the deployment was created, expressed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the deployment job was last modified, expressed in ISO 8601 format.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The time at which the deployment job was last modified, expressed in ISO 8601 format.
     */

    public void setModifiedTimestamp(java.util.Date modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    /**
     * <p>
     * The time at which the deployment job was last modified, expressed in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the deployment job was last modified, expressed in ISO 8601 format.
     */

    public java.util.Date getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /**
     * <p>
     * The time at which the deployment job was last modified, expressed in ISO 8601 format.
     * </p>
     * 
     * @param modifiedTimestamp
     *        The time at which the deployment job was last modified, expressed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeployment withModifiedTimestamp(java.util.Date modifiedTimestamp) {
        setModifiedTimestamp(modifiedTimestamp);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentName() != null)
            sb.append("DeploymentName: ").append(getDeploymentName()).append(",");
        if (getIotJobId() != null)
            sb.append("IotJobId: ").append(getIotJobId()).append(",");
        if (getIotJobArn() != null)
            sb.append("IotJobArn: ").append(getIotJobArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getCoreDeviceExecutionStatus() != null)
            sb.append("CoreDeviceExecutionStatus: ").append(getCoreDeviceExecutionStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getModifiedTimestamp() != null)
            sb.append("ModifiedTimestamp: ").append(getModifiedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectiveDeployment == false)
            return false;
        EffectiveDeployment other = (EffectiveDeployment) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentName() == null ^ this.getDeploymentName() == null)
            return false;
        if (other.getDeploymentName() != null && other.getDeploymentName().equals(this.getDeploymentName()) == false)
            return false;
        if (other.getIotJobId() == null ^ this.getIotJobId() == null)
            return false;
        if (other.getIotJobId() != null && other.getIotJobId().equals(this.getIotJobId()) == false)
            return false;
        if (other.getIotJobArn() == null ^ this.getIotJobArn() == null)
            return false;
        if (other.getIotJobArn() != null && other.getIotJobArn().equals(this.getIotJobArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getCoreDeviceExecutionStatus() == null ^ this.getCoreDeviceExecutionStatus() == null)
            return false;
        if (other.getCoreDeviceExecutionStatus() != null && other.getCoreDeviceExecutionStatus().equals(this.getCoreDeviceExecutionStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getModifiedTimestamp() == null ^ this.getModifiedTimestamp() == null)
            return false;
        if (other.getModifiedTimestamp() != null && other.getModifiedTimestamp().equals(this.getModifiedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentName() == null) ? 0 : getDeploymentName().hashCode());
        hashCode = prime * hashCode + ((getIotJobId() == null) ? 0 : getIotJobId().hashCode());
        hashCode = prime * hashCode + ((getIotJobArn() == null) ? 0 : getIotJobArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getCoreDeviceExecutionStatus() == null) ? 0 : getCoreDeviceExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getModifiedTimestamp() == null) ? 0 : getModifiedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public EffectiveDeployment clone() {
        try {
            return (EffectiveDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.EffectiveDeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
