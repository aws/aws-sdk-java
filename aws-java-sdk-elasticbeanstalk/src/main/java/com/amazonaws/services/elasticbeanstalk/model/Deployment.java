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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an application version deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/Deployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deployment implements Serializable, Cloneable {

    /**
     * <p>
     * The version label of the application version in the deployment.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * The ID of the deployment. This number increases by one each time that you deploy source code or change instance
     * configuration settings.
     * </p>
     */
    private Long deploymentId;
    /**
     * <p>
     * The status of the deployment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>In Progress</code> : The deployment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deployed</code> : The deployment succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> : The deployment failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * For in-progress deployments, the time that the deployment started.
     * </p>
     * <p>
     * For completed deployments, the time that the deployment ended.
     * </p>
     */
    private java.util.Date deploymentTime;

    /**
     * <p>
     * The version label of the application version in the deployment.
     * </p>
     * 
     * @param versionLabel
     *        The version label of the application version in the deployment.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The version label of the application version in the deployment.
     * </p>
     * 
     * @return The version label of the application version in the deployment.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * The version label of the application version in the deployment.
     * </p>
     * 
     * @param versionLabel
     *        The version label of the application version in the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * The ID of the deployment. This number increases by one each time that you deploy source code or change instance
     * configuration settings.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment. This number increases by one each time that you deploy source code or change
     *        instance configuration settings.
     */

    public void setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment. This number increases by one each time that you deploy source code or change instance
     * configuration settings.
     * </p>
     * 
     * @return The ID of the deployment. This number increases by one each time that you deploy source code or change
     *         instance configuration settings.
     */

    public Long getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment. This number increases by one each time that you deploy source code or change instance
     * configuration settings.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment. This number increases by one each time that you deploy source code or change
     *        instance configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentId(Long deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The status of the deployment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>In Progress</code> : The deployment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deployed</code> : The deployment succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> : The deployment failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the deployment:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>In Progress</code> : The deployment is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deployed</code> : The deployment succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> : The deployment failed.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>In Progress</code> : The deployment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deployed</code> : The deployment succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> : The deployment failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the deployment:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>In Progress</code> : The deployment is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deployed</code> : The deployment succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> : The deployment failed.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deployment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>In Progress</code> : The deployment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deployed</code> : The deployment succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> : The deployment failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the deployment:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>In Progress</code> : The deployment is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deployed</code> : The deployment succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> : The deployment failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * For in-progress deployments, the time that the deployment started.
     * </p>
     * <p>
     * For completed deployments, the time that the deployment ended.
     * </p>
     * 
     * @param deploymentTime
     *        For in-progress deployments, the time that the deployment started.</p>
     *        <p>
     *        For completed deployments, the time that the deployment ended.
     */

    public void setDeploymentTime(java.util.Date deploymentTime) {
        this.deploymentTime = deploymentTime;
    }

    /**
     * <p>
     * For in-progress deployments, the time that the deployment started.
     * </p>
     * <p>
     * For completed deployments, the time that the deployment ended.
     * </p>
     * 
     * @return For in-progress deployments, the time that the deployment started.</p>
     *         <p>
     *         For completed deployments, the time that the deployment ended.
     */

    public java.util.Date getDeploymentTime() {
        return this.deploymentTime;
    }

    /**
     * <p>
     * For in-progress deployments, the time that the deployment started.
     * </p>
     * <p>
     * For completed deployments, the time that the deployment ended.
     * </p>
     * 
     * @param deploymentTime
     *        For in-progress deployments, the time that the deployment started.</p>
     *        <p>
     *        For completed deployments, the time that the deployment ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentTime(java.util.Date deploymentTime) {
        setDeploymentTime(deploymentTime);
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
        if (getVersionLabel() != null)
            sb.append("VersionLabel: ").append(getVersionLabel()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDeploymentTime() != null)
            sb.append("DeploymentTime: ").append(getDeploymentTime());
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
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDeploymentTime() == null ^ this.getDeploymentTime() == null)
            return false;
        if (other.getDeploymentTime() != null && other.getDeploymentTime().equals(this.getDeploymentTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentTime() == null) ? 0 : getDeploymentTime().hashCode());
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

}
