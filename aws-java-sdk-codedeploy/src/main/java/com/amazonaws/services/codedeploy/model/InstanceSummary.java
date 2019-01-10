/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about an instance in a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/InstanceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Deprecated
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The deployment is in progress for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A timestamp that indicaties when the instance information was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * A list of lifecycle events for this instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LifecycleEvent> lifecycleEvents;
    /**
     * <p>
     * Information about which environment an instance belongs to in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     */
    private String instanceType;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The deployment is in progress for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status for this instance:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The deployment is pending for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: The deployment is in progress for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The deployment has succeeded for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The deployment has failed for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: The deployment has been skipped for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: The deployment status is unknown for this instance.
     *        </p>
     *        </li>
     * @see InstanceStatus
     */
    @Deprecated
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The deployment is in progress for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The deployment status for this instance:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The deployment is pending for this instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In Progress: The deployment is in progress for this instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: The deployment has succeeded for this instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The deployment has failed for this instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Skipped: The deployment has been skipped for this instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unknown: The deployment status is unknown for this instance.
     *         </p>
     *         </li>
     * @see InstanceStatus
     */
    @Deprecated
    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The deployment is in progress for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status for this instance:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The deployment is pending for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: The deployment is in progress for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The deployment has succeeded for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The deployment has failed for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: The deployment has been skipped for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: The deployment status is unknown for this instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */
    @Deprecated
    public InstanceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The deployment is in progress for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status for this instance:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The deployment is pending for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: The deployment is in progress for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The deployment has succeeded for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The deployment has failed for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: The deployment has been skipped for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: The deployment status is unknown for this instance.
     *        </p>
     *        </li>
     * @see InstanceStatus
     */
    @Deprecated
    public void setStatus(InstanceStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The deployment status for this instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The deployment is pending for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The deployment is in progress for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The deployment has succeeded for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The deployment has failed for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Skipped: The deployment has been skipped for this instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Unknown: The deployment status is unknown for this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status for this instance:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The deployment is pending for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Progress: The deployment is in progress for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The deployment has succeeded for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The deployment has failed for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Skipped: The deployment has been skipped for this instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unknown: The deployment status is unknown for this instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */
    @Deprecated
    public InstanceSummary withStatus(InstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that indicaties when the instance information was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        A timestamp that indicaties when the instance information was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * A timestamp that indicaties when the instance information was last updated.
     * </p>
     * 
     * @return A timestamp that indicaties when the instance information was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * A timestamp that indicaties when the instance information was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        A timestamp that indicaties when the instance information was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A list of lifecycle events for this instance.
     * </p>
     * 
     * @return A list of lifecycle events for this instance.
     */

    public java.util.List<LifecycleEvent> getLifecycleEvents() {
        if (lifecycleEvents == null) {
            lifecycleEvents = new com.amazonaws.internal.SdkInternalList<LifecycleEvent>();
        }
        return lifecycleEvents;
    }

    /**
     * <p>
     * A list of lifecycle events for this instance.
     * </p>
     * 
     * @param lifecycleEvents
     *        A list of lifecycle events for this instance.
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
     * A list of lifecycle events for this instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleEvents(java.util.Collection)} or {@link #withLifecycleEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lifecycleEvents
     *        A list of lifecycle events for this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withLifecycleEvents(LifecycleEvent... lifecycleEvents) {
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
     * A list of lifecycle events for this instance.
     * </p>
     * 
     * @param lifecycleEvents
     *        A list of lifecycle events for this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        setLifecycleEvents(lifecycleEvents);
        return this;
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        Information about which environment an instance belongs to in a blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        BLUE: The instance is part of the original environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GREEN: The instance is part of the replacement environment.
     *        </p>
     *        </li>
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about which environment an instance belongs to in a blue/green deployment.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         BLUE: The instance is part of the original environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GREEN: The instance is part of the replacement environment.
     *         </p>
     *         </li>
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        Information about which environment an instance belongs to in a blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        BLUE: The instance is part of the original environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GREEN: The instance is part of the replacement environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public InstanceSummary withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        Information about which environment an instance belongs to in a blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        BLUE: The instance is part of the original environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GREEN: The instance is part of the replacement environment.
     *        </p>
     *        </li>
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * Information about which environment an instance belongs to in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * BLUE: The instance is part of the original environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * GREEN: The instance is part of the replacement environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceType
     *        Information about which environment an instance belongs to in a blue/green deployment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        BLUE: The instance is part of the original environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GREEN: The instance is part of the replacement environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public InstanceSummary withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getLifecycleEvents() != null)
            sb.append("LifecycleEvents: ").append(getLifecycleEvents()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSummary == false)
            return false;
        InstanceSummary other = (InstanceSummary) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getLifecycleEvents() == null ^ this.getLifecycleEvents() == null)
            return false;
        if (other.getLifecycleEvents() != null && other.getLifecycleEvents().equals(this.getLifecycleEvents()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLifecycleEvents() == null) ? 0 : getLifecycleEvents().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public InstanceSummary clone() {
        try {
            return (InstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.InstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
