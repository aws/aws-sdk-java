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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the target to be updated by an AWS CloudFormation blue/green deployment. This target type is used
 * for all deployments initiated by a CloudFormation stack update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CloudFormationTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFormationTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of an AWS CloudFormation blue/green deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The unique ID of a deployment target that has a type of <code>CloudFormationTarget</code>.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The date and time when the target application was updated by an AWS CloudFormation blue/green deployment.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LifecycleEvent> lifecycleEvents;
    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The resource type for the AWS CloudFormation blue/green deployment.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The percentage of production traffic that the target version of an AWS CloudFormation blue/green deployment
     * receives.
     * </p>
     */
    private Double targetVersionWeight;

    /**
     * <p>
     * The unique ID of an AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of an AWS CloudFormation blue/green deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of an AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @return The unique ID of an AWS CloudFormation blue/green deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of an AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of an AWS CloudFormation blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationTarget withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of <code>CloudFormationTarget</code>.
     * </p>
     * 
     * @param targetId
     *        The unique ID of a deployment target that has a type of <code>CloudFormationTarget</code>.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of <code>CloudFormationTarget</code>.
     * </p>
     * 
     * @return The unique ID of a deployment target that has a type of <code>CloudFormationTarget</code>.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target that has a type of <code>CloudFormationTarget</code>.
     * </p>
     * 
     * @param targetId
     *        The unique ID of a deployment target that has a type of <code>CloudFormationTarget</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationTarget withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The date and time when the target application was updated by an AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the target application was updated by an AWS CloudFormation blue/green deployment.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target application was updated by an AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @return The date and time when the target application was updated by an AWS CloudFormation blue/green deployment.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the target application was updated by an AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the target application was updated by an AWS CloudFormation blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationTarget withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     * </p>
     * 
     * @return The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     */

    public java.util.List<LifecycleEvent> getLifecycleEvents() {
        if (lifecycleEvents == null) {
            lifecycleEvents = new com.amazonaws.internal.SdkInternalList<LifecycleEvent>();
        }
        return lifecycleEvents;
    }

    /**
     * <p>
     * The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     * </p>
     * 
     * @param lifecycleEvents
     *        The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     */

    public void setLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        if (lifecycleEvents == null) {
            this.lifecycleEvents = null;
            return;
        }

        this.lifecycleEvents = new com.amazonaws.internal.SdkInternalList<LifecycleEvent>(lifecycleEvents);
    }

    /**
     * <p>
     * The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleEvents(java.util.Collection)} or {@link #withLifecycleEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lifecycleEvents
     *        The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationTarget withLifecycleEvents(LifecycleEvent... lifecycleEvents) {
        if (this.lifecycleEvents == null) {
            setLifecycleEvents(new com.amazonaws.internal.SdkInternalList<LifecycleEvent>(lifecycleEvents.length));
        }
        for (LifecycleEvent ele : lifecycleEvents) {
            this.lifecycleEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     * </p>
     * 
     * @param lifecycleEvents
     *        The lifecycle events of the AWS CloudFormation blue/green deployment to this target application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationTarget withLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        setLifecycleEvents(lifecycleEvents);
        return this;
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target application.
     * </p>
     * 
     * @param status
     *        The status of an AWS CloudFormation blue/green deployment's target application.
     * @see TargetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target application.
     * </p>
     * 
     * @return The status of an AWS CloudFormation blue/green deployment's target application.
     * @see TargetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target application.
     * </p>
     * 
     * @param status
     *        The status of an AWS CloudFormation blue/green deployment's target application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStatus
     */

    public CloudFormationTarget withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an AWS CloudFormation blue/green deployment's target application.
     * </p>
     * 
     * @param status
     *        The status of an AWS CloudFormation blue/green deployment's target application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStatus
     */

    public CloudFormationTarget withStatus(TargetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The resource type for the AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @param resourceType
     *        The resource type for the AWS CloudFormation blue/green deployment.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type for the AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @return The resource type for the AWS CloudFormation blue/green deployment.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type for the AWS CloudFormation blue/green deployment.
     * </p>
     * 
     * @param resourceType
     *        The resource type for the AWS CloudFormation blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationTarget withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of an AWS CloudFormation blue/green deployment
     * receives.
     * </p>
     * 
     * @param targetVersionWeight
     *        The percentage of production traffic that the target version of an AWS CloudFormation blue/green
     *        deployment receives.
     */

    public void setTargetVersionWeight(Double targetVersionWeight) {
        this.targetVersionWeight = targetVersionWeight;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of an AWS CloudFormation blue/green deployment
     * receives.
     * </p>
     * 
     * @return The percentage of production traffic that the target version of an AWS CloudFormation blue/green
     *         deployment receives.
     */

    public Double getTargetVersionWeight() {
        return this.targetVersionWeight;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of an AWS CloudFormation blue/green deployment
     * receives.
     * </p>
     * 
     * @param targetVersionWeight
     *        The percentage of production traffic that the target version of an AWS CloudFormation blue/green
     *        deployment receives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationTarget withTargetVersionWeight(Double targetVersionWeight) {
        setTargetVersionWeight(targetVersionWeight);
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
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getLifecycleEvents() != null)
            sb.append("LifecycleEvents: ").append(getLifecycleEvents()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTargetVersionWeight() != null)
            sb.append("TargetVersionWeight: ").append(getTargetVersionWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFormationTarget == false)
            return false;
        CloudFormationTarget other = (CloudFormationTarget) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getLifecycleEvents() == null ^ this.getLifecycleEvents() == null)
            return false;
        if (other.getLifecycleEvents() != null && other.getLifecycleEvents().equals(this.getLifecycleEvents()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTargetVersionWeight() == null ^ this.getTargetVersionWeight() == null)
            return false;
        if (other.getTargetVersionWeight() != null && other.getTargetVersionWeight().equals(this.getTargetVersionWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLifecycleEvents() == null) ? 0 : getLifecycleEvents().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTargetVersionWeight() == null) ? 0 : getTargetVersionWeight().hashCode());
        return hashCode;
    }

    @Override
    public CloudFormationTarget clone() {
        try {
            return (CloudFormationTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.CloudFormationTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
