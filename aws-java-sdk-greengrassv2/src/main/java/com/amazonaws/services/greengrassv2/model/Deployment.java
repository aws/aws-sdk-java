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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/Deployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the target
     * AWS IoT thing or thing group.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The revision number of the deployment.
     * </p>
     */
    private String revisionId;
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
     * The time at which the deployment was created, expressed in ISO 8601 format.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The status of the deployment.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     */
    private Boolean isLatestForTarget;

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

    public Deployment withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The revision number of the deployment.
     * </p>
     * 
     * @param revisionId
     *        The revision number of the deployment.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision number of the deployment.
     * </p>
     * 
     * @return The revision number of the deployment.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision number of the deployment.
     * </p>
     * 
     * @param revisionId
     *        The revision number of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

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

    public Deployment withDeploymentId(String deploymentId) {
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

    public Deployment withDeploymentName(String deploymentName) {
        setDeploymentName(deploymentName);
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

    public Deployment withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @return The status of the deployment.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Deployment withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the deployment.
     * </p>
     * 
     * @param deploymentStatus
     *        The status of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Deployment withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     * 
     * @param isLatestForTarget
     *        Whether or not the deployment is the latest revision for its target.
     */

    public void setIsLatestForTarget(Boolean isLatestForTarget) {
        this.isLatestForTarget = isLatestForTarget;
    }

    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     * 
     * @return Whether or not the deployment is the latest revision for its target.
     */

    public Boolean getIsLatestForTarget() {
        return this.isLatestForTarget;
    }

    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     * 
     * @param isLatestForTarget
     *        Whether or not the deployment is the latest revision for its target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withIsLatestForTarget(Boolean isLatestForTarget) {
        setIsLatestForTarget(isLatestForTarget);
        return this;
    }

    /**
     * <p>
     * Whether or not the deployment is the latest revision for its target.
     * </p>
     * 
     * @return Whether or not the deployment is the latest revision for its target.
     */

    public Boolean isLatestForTarget() {
        return this.isLatestForTarget;
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentName() != null)
            sb.append("DeploymentName: ").append(getDeploymentName()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getIsLatestForTarget() != null)
            sb.append("IsLatestForTarget: ").append(getIsLatestForTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deployment == false)
            return false;
        Deployment other = (Deployment) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentName() == null ^ this.getDeploymentName() == null)
            return false;
        if (other.getDeploymentName() != null && other.getDeploymentName().equals(this.getDeploymentName()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getIsLatestForTarget() == null ^ this.getIsLatestForTarget() == null)
            return false;
        if (other.getIsLatestForTarget() != null && other.getIsLatestForTarget().equals(this.getIsLatestForTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentName() == null) ? 0 : getDeploymentName().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getIsLatestForTarget() == null) ? 0 : getIsLatestForTarget().hashCode());
        return hashCode;
    }

    @Override
    public Deployment clone() {
        try {
            return (Deployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.DeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
