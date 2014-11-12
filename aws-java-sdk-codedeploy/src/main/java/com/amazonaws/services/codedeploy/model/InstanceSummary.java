/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an Amazon EC2 instance in a deployment.
 * </p>
 */
public class InstanceSummary implements Serializable {

    /**
     * The deployment ID.
     */
    private String deploymentId;

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The deployment status for this instance: <ul> <li>Pending: The
     * deployment is pending for this instance.</li> <li>In Progress: The
     * deployment is in progress for this instance.</li> <li>Succeeded: The
     * deployment has succeeded for this instance.</li> <li>Failed: The
     * deployment has failed for this instance.</li> <li>Skipped: The
     * deployment has been skipped for this instance.</li> <li>Unknown: The
     * deployment status is unknown for this instance.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     */
    private String status;

    /**
     * A timestamp indicating when the instance information was last updated.
     */
    private java.util.Date lastUpdatedAt;

    /**
     * A list of lifecycle events for this instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleEvent> lifecycleEvents;

    /**
     * The deployment ID.
     *
     * @return The deployment ID.
     */
    public String getDeploymentId() {
        return deploymentId;
    }
    
    /**
     * The deployment ID.
     *
     * @param deploymentId The deployment ID.
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }
    
    /**
     * The deployment ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentId The deployment ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceSummary withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceSummary withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The deployment status for this instance: <ul> <li>Pending: The
     * deployment is pending for this instance.</li> <li>In Progress: The
     * deployment is in progress for this instance.</li> <li>Succeeded: The
     * deployment has succeeded for this instance.</li> <li>Failed: The
     * deployment has failed for this instance.</li> <li>Skipped: The
     * deployment has been skipped for this instance.</li> <li>Unknown: The
     * deployment status is unknown for this instance.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @return The deployment status for this instance: <ul> <li>Pending: The
     *         deployment is pending for this instance.</li> <li>In Progress: The
     *         deployment is in progress for this instance.</li> <li>Succeeded: The
     *         deployment has succeeded for this instance.</li> <li>Failed: The
     *         deployment has failed for this instance.</li> <li>Skipped: The
     *         deployment has been skipped for this instance.</li> <li>Unknown: The
     *         deployment status is unknown for this instance.</li> </ul>
     *
     * @see InstanceStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The deployment status for this instance: <ul> <li>Pending: The
     * deployment is pending for this instance.</li> <li>In Progress: The
     * deployment is in progress for this instance.</li> <li>Succeeded: The
     * deployment has succeeded for this instance.</li> <li>Failed: The
     * deployment has failed for this instance.</li> <li>Skipped: The
     * deployment has been skipped for this instance.</li> <li>Unknown: The
     * deployment status is unknown for this instance.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @param status The deployment status for this instance: <ul> <li>Pending: The
     *         deployment is pending for this instance.</li> <li>In Progress: The
     *         deployment is in progress for this instance.</li> <li>Succeeded: The
     *         deployment has succeeded for this instance.</li> <li>Failed: The
     *         deployment has failed for this instance.</li> <li>Skipped: The
     *         deployment has been skipped for this instance.</li> <li>Unknown: The
     *         deployment status is unknown for this instance.</li> </ul>
     *
     * @see InstanceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The deployment status for this instance: <ul> <li>Pending: The
     * deployment is pending for this instance.</li> <li>In Progress: The
     * deployment is in progress for this instance.</li> <li>Succeeded: The
     * deployment has succeeded for this instance.</li> <li>Failed: The
     * deployment has failed for this instance.</li> <li>Skipped: The
     * deployment has been skipped for this instance.</li> <li>Unknown: The
     * deployment status is unknown for this instance.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @param status The deployment status for this instance: <ul> <li>Pending: The
     *         deployment is pending for this instance.</li> <li>In Progress: The
     *         deployment is in progress for this instance.</li> <li>Succeeded: The
     *         deployment has succeeded for this instance.</li> <li>Failed: The
     *         deployment has failed for this instance.</li> <li>Skipped: The
     *         deployment has been skipped for this instance.</li> <li>Unknown: The
     *         deployment status is unknown for this instance.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceStatus
     */
    public InstanceSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The deployment status for this instance: <ul> <li>Pending: The
     * deployment is pending for this instance.</li> <li>In Progress: The
     * deployment is in progress for this instance.</li> <li>Succeeded: The
     * deployment has succeeded for this instance.</li> <li>Failed: The
     * deployment has failed for this instance.</li> <li>Skipped: The
     * deployment has been skipped for this instance.</li> <li>Unknown: The
     * deployment status is unknown for this instance.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @param status The deployment status for this instance: <ul> <li>Pending: The
     *         deployment is pending for this instance.</li> <li>In Progress: The
     *         deployment is in progress for this instance.</li> <li>Succeeded: The
     *         deployment has succeeded for this instance.</li> <li>Failed: The
     *         deployment has failed for this instance.</li> <li>Skipped: The
     *         deployment has been skipped for this instance.</li> <li>Unknown: The
     *         deployment status is unknown for this instance.</li> </ul>
     *
     * @see InstanceStatus
     */
    public void setStatus(InstanceStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The deployment status for this instance: <ul> <li>Pending: The
     * deployment is pending for this instance.</li> <li>In Progress: The
     * deployment is in progress for this instance.</li> <li>Succeeded: The
     * deployment has succeeded for this instance.</li> <li>Failed: The
     * deployment has failed for this instance.</li> <li>Skipped: The
     * deployment has been skipped for this instance.</li> <li>Unknown: The
     * deployment status is unknown for this instance.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Succeeded, Failed, Skipped, Unknown
     *
     * @param status The deployment status for this instance: <ul> <li>Pending: The
     *         deployment is pending for this instance.</li> <li>In Progress: The
     *         deployment is in progress for this instance.</li> <li>Succeeded: The
     *         deployment has succeeded for this instance.</li> <li>Failed: The
     *         deployment has failed for this instance.</li> <li>Skipped: The
     *         deployment has been skipped for this instance.</li> <li>Unknown: The
     *         deployment status is unknown for this instance.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceStatus
     */
    public InstanceSummary withStatus(InstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * A timestamp indicating when the instance information was last updated.
     *
     * @return A timestamp indicating when the instance information was last updated.
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }
    
    /**
     * A timestamp indicating when the instance information was last updated.
     *
     * @param lastUpdatedAt A timestamp indicating when the instance information was last updated.
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
    
    /**
     * A timestamp indicating when the instance information was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedAt A timestamp indicating when the instance information was last updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * A list of lifecycle events for this instance.
     *
     * @return A list of lifecycle events for this instance.
     */
    public java.util.List<LifecycleEvent> getLifecycleEvents() {
        if (lifecycleEvents == null) {
              lifecycleEvents = new com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleEvent>();
              lifecycleEvents.setAutoConstruct(true);
        }
        return lifecycleEvents;
    }
    
    /**
     * A list of lifecycle events for this instance.
     *
     * @param lifecycleEvents A list of lifecycle events for this instance.
     */
    public void setLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        if (lifecycleEvents == null) {
            this.lifecycleEvents = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleEvent> lifecycleEventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleEvent>(lifecycleEvents.size());
        lifecycleEventsCopy.addAll(lifecycleEvents);
        this.lifecycleEvents = lifecycleEventsCopy;
    }
    
    /**
     * A list of lifecycle events for this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleEvents A list of lifecycle events for this instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceSummary withLifecycleEvents(LifecycleEvent... lifecycleEvents) {
        if (getLifecycleEvents() == null) setLifecycleEvents(new java.util.ArrayList<LifecycleEvent>(lifecycleEvents.length));
        for (LifecycleEvent value : lifecycleEvents) {
            getLifecycleEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of lifecycle events for this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleEvents A list of lifecycle events for this instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceSummary withLifecycleEvents(java.util.Collection<LifecycleEvent> lifecycleEvents) {
        if (lifecycleEvents == null) {
            this.lifecycleEvents = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleEvent> lifecycleEventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LifecycleEvent>(lifecycleEvents.size());
            lifecycleEventsCopy.addAll(lifecycleEvents);
            this.lifecycleEvents = lifecycleEventsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentId() != null) sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getLastUpdatedAt() != null) sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getLifecycleEvents() != null) sb.append("LifecycleEvents: " + getLifecycleEvents() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceSummary == false) return false;
        InstanceSummary other = (InstanceSummary)obj;
        
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null) return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null) return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false) return false; 
        if (other.getLifecycleEvents() == null ^ this.getLifecycleEvents() == null) return false;
        if (other.getLifecycleEvents() != null && other.getLifecycleEvents().equals(this.getLifecycleEvents()) == false) return false; 
        return true;
    }
    
}
    