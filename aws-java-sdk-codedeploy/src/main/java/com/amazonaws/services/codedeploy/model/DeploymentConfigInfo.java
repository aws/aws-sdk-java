/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about a deployment configuration.
 * </p>
 */
public class DeploymentConfigInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The deployment configuration ID.
     * </p>
     */
    private String deploymentConfigId;
    /**
     * <p>
     * The deployment configuration name.
     * </p>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * Information about the number or percentage of minimum healthy instance.
     * </p>
     */
    private MinimumHealthyHosts minimumHealthyHosts;
    /**
     * <p>
     * The time at which the deployment configuration was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The deployment configuration ID.
     * </p>
     * 
     * @param deploymentConfigId
     *        The deployment configuration ID.
     */

    public void setDeploymentConfigId(String deploymentConfigId) {
        this.deploymentConfigId = deploymentConfigId;
    }

    /**
     * <p>
     * The deployment configuration ID.
     * </p>
     * 
     * @return The deployment configuration ID.
     */

    public String getDeploymentConfigId() {
        return this.deploymentConfigId;
    }

    /**
     * <p>
     * The deployment configuration ID.
     * </p>
     * 
     * @param deploymentConfigId
     *        The deployment configuration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfigInfo withDeploymentConfigId(String deploymentConfigId) {
        setDeploymentConfigId(deploymentConfigId);
        return this;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * 
     * @param deploymentConfigName
     *        The deployment configuration name.
     */

    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * 
     * @return The deployment configuration name.
     */

    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * 
     * @param deploymentConfigName
     *        The deployment configuration name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfigInfo withDeploymentConfigName(String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * Information about the number or percentage of minimum healthy instance.
     * </p>
     * 
     * @param minimumHealthyHosts
     *        Information about the number or percentage of minimum healthy instance.
     */

    public void setMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
    }

    /**
     * <p>
     * Information about the number or percentage of minimum healthy instance.
     * </p>
     * 
     * @return Information about the number or percentage of minimum healthy instance.
     */

    public MinimumHealthyHosts getMinimumHealthyHosts() {
        return this.minimumHealthyHosts;
    }

    /**
     * <p>
     * Information about the number or percentage of minimum healthy instance.
     * </p>
     * 
     * @param minimumHealthyHosts
     *        Information about the number or percentage of minimum healthy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfigInfo withMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        setMinimumHealthyHosts(minimumHealthyHosts);
        return this;
    }

    /**
     * <p>
     * The time at which the deployment configuration was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the deployment configuration was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the deployment configuration was created.
     * </p>
     * 
     * @return The time at which the deployment configuration was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the deployment configuration was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the deployment configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConfigInfo withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentConfigId() != null)
            sb.append("DeploymentConfigId: " + getDeploymentConfigId() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getMinimumHealthyHosts() != null)
            sb.append("MinimumHealthyHosts: " + getMinimumHealthyHosts() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfigInfo == false)
            return false;
        DeploymentConfigInfo other = (DeploymentConfigInfo) obj;
        if (other.getDeploymentConfigId() == null ^ this.getDeploymentConfigId() == null)
            return false;
        if (other.getDeploymentConfigId() != null && other.getDeploymentConfigId().equals(this.getDeploymentConfigId()) == false)
            return false;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getMinimumHealthyHosts() == null ^ this.getMinimumHealthyHosts() == null)
            return false;
        if (other.getMinimumHealthyHosts() != null && other.getMinimumHealthyHosts().equals(this.getMinimumHealthyHosts()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentConfigId() == null) ? 0 : getDeploymentConfigId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode + ((getMinimumHealthyHosts() == null) ? 0 : getMinimumHealthyHosts().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentConfigInfo clone() {
        try {
            return (DeploymentConfigInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
