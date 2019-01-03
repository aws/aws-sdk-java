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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a deployment job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeploymentJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     */
    private String fleet;
    /**
     * <p>
     * The status of the deployment job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The deployment application configuration.
     * </p>
     */
    private java.util.List<DeploymentApplicationConfig> deploymentApplicationConfigs;
    /**
     * <p>
     * The deployment configuration.
     * </p>
     */
    private DeploymentConfig deploymentConfig;
    /**
     * <p>
     * A short description of the reason why the deployment job failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The deployment job failure code.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment job was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the deployment job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the deployment job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentJob withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleet
     *        The Amazon Resource Name (ARN) of the fleet.
     */

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet.
     */

    public String getFleet() {
        return this.fleet;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleet
     *        The Amazon Resource Name (ARN) of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentJob withFleet(String fleet) {
        setFleet(fleet);
        return this;
    }

    /**
     * <p>
     * The status of the deployment job.
     * </p>
     * 
     * @param status
     *        The status of the deployment job.
     * @see DeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment job.
     * </p>
     * 
     * @return The status of the deployment job.
     * @see DeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deployment job.
     * </p>
     * 
     * @param status
     *        The status of the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the deployment job.
     * </p>
     * 
     * @param status
     *        The status of the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentJob withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * 
     * @return The deployment application configuration.
     */

    public java.util.List<DeploymentApplicationConfig> getDeploymentApplicationConfigs() {
        return deploymentApplicationConfigs;
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
     */

    public void setDeploymentApplicationConfigs(java.util.Collection<DeploymentApplicationConfig> deploymentApplicationConfigs) {
        if (deploymentApplicationConfigs == null) {
            this.deploymentApplicationConfigs = null;
            return;
        }

        this.deploymentApplicationConfigs = new java.util.ArrayList<DeploymentApplicationConfig>(deploymentApplicationConfigs);
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentApplicationConfigs(java.util.Collection)} or
     * {@link #withDeploymentApplicationConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentJob withDeploymentApplicationConfigs(DeploymentApplicationConfig... deploymentApplicationConfigs) {
        if (this.deploymentApplicationConfigs == null) {
            setDeploymentApplicationConfigs(new java.util.ArrayList<DeploymentApplicationConfig>(deploymentApplicationConfigs.length));
        }
        for (DeploymentApplicationConfig ele : deploymentApplicationConfigs) {
            this.deploymentApplicationConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentJob withDeploymentApplicationConfigs(java.util.Collection<DeploymentApplicationConfig> deploymentApplicationConfigs) {
        setDeploymentApplicationConfigs(deploymentApplicationConfigs);
        return this;
    }

    /**
     * <p>
     * The deployment configuration.
     * </p>
     * 
     * @param deploymentConfig
     *        The deployment configuration.
     */

    public void setDeploymentConfig(DeploymentConfig deploymentConfig) {
        this.deploymentConfig = deploymentConfig;
    }

    /**
     * <p>
     * The deployment configuration.
     * </p>
     * 
     * @return The deployment configuration.
     */

    public DeploymentConfig getDeploymentConfig() {
        return this.deploymentConfig;
    }

    /**
     * <p>
     * The deployment configuration.
     * </p>
     * 
     * @param deploymentConfig
     *        The deployment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentJob withDeploymentConfig(DeploymentConfig deploymentConfig) {
        setDeploymentConfig(deploymentConfig);
        return this;
    }

    /**
     * <p>
     * A short description of the reason why the deployment job failed.
     * </p>
     * 
     * @param failureReason
     *        A short description of the reason why the deployment job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A short description of the reason why the deployment job failed.
     * </p>
     * 
     * @return A short description of the reason why the deployment job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * A short description of the reason why the deployment job failed.
     * </p>
     * 
     * @param failureReason
     *        A short description of the reason why the deployment job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The deployment job failure code.
     * </p>
     * 
     * @param failureCode
     *        The deployment job failure code.
     * @see DeploymentJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The deployment job failure code.
     * </p>
     * 
     * @return The deployment job failure code.
     * @see DeploymentJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The deployment job failure code.
     * </p>
     * 
     * @param failureCode
     *        The deployment job failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentJobErrorCode
     */

    public DeploymentJob withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The deployment job failure code.
     * </p>
     * 
     * @param failureCode
     *        The deployment job failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentJobErrorCode
     */

    public DeploymentJob withFailureCode(DeploymentJobErrorCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the deployment job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment job was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the deployment job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the deployment job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentJob withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getFleet() != null)
            sb.append("Fleet: ").append(getFleet()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDeploymentApplicationConfigs() != null)
            sb.append("DeploymentApplicationConfigs: ").append(getDeploymentApplicationConfigs()).append(",");
        if (getDeploymentConfig() != null)
            sb.append("DeploymentConfig: ").append(getDeploymentConfig()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentJob == false)
            return false;
        DeploymentJob other = (DeploymentJob) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFleet() == null ^ this.getFleet() == null)
            return false;
        if (other.getFleet() != null && other.getFleet().equals(this.getFleet()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDeploymentApplicationConfigs() == null ^ this.getDeploymentApplicationConfigs() == null)
            return false;
        if (other.getDeploymentApplicationConfigs() != null && other.getDeploymentApplicationConfigs().equals(this.getDeploymentApplicationConfigs()) == false)
            return false;
        if (other.getDeploymentConfig() == null ^ this.getDeploymentConfig() == null)
            return false;
        if (other.getDeploymentConfig() != null && other.getDeploymentConfig().equals(this.getDeploymentConfig()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFleet() == null) ? 0 : getFleet().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentApplicationConfigs() == null) ? 0 : getDeploymentApplicationConfigs().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfig() == null) ? 0 : getDeploymentConfig().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentJob clone() {
        try {
            return (DeploymentJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.DeploymentJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
