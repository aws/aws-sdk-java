/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * 
 */
public class Deployment implements Serializable, Cloneable {

    private String versionLabel;

    private Long deploymentId;

    private String status;

    private java.util.Date deploymentTime;

    /**
     * @param versionLabel
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * @return
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * @param versionLabel
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * @param deploymentId
     */

    public void setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * @return
     */

    public Long getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @param deploymentId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withDeploymentId(Long deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * @param status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param deploymentTime
     */

    public void setDeploymentTime(java.util.Date deploymentTime) {
        this.deploymentTime = deploymentTime;
    }

    /**
     * @return
     */

    public java.util.Date getDeploymentTime() {
        return this.deploymentTime;
    }

    /**
     * @param deploymentTime
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withDeploymentTime(java.util.Date deploymentTime) {
        setDeploymentTime(deploymentTime);
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
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDeploymentTime() != null)
            sb.append("DeploymentTime: " + getDeploymentTime());
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
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDeploymentTime() == null
                ^ this.getDeploymentTime() == null)
            return false;
        if (other.getDeploymentTime() != null
                && other.getDeploymentTime().equals(this.getDeploymentTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentTime() == null) ? 0 : getDeploymentTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public Deployment clone() {
        try {
            return (Deployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
