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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Backend environment for an Amplify App.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/BackendEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackendEnvironment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Arn for a backend environment, part of an Amplify App.
     * </p>
     */
    private String backendEnvironmentArn;
    /**
     * <p>
     * Name for a backend environment, part of an Amplify App.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * CloudFormation stack name of backend environment.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * Name of deployment artifacts.
     * </p>
     */
    private String deploymentArtifacts;
    /**
     * <p>
     * Creation date and time for a backend environment, part of an Amplify App.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Last updated date and time for a backend environment, part of an Amplify App.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * Arn for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @param backendEnvironmentArn
     *        Arn for a backend environment, part of an Amplify App.
     */

    public void setBackendEnvironmentArn(String backendEnvironmentArn) {
        this.backendEnvironmentArn = backendEnvironmentArn;
    }

    /**
     * <p>
     * Arn for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @return Arn for a backend environment, part of an Amplify App.
     */

    public String getBackendEnvironmentArn() {
        return this.backendEnvironmentArn;
    }

    /**
     * <p>
     * Arn for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @param backendEnvironmentArn
     *        Arn for a backend environment, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendEnvironment withBackendEnvironmentArn(String backendEnvironmentArn) {
        setBackendEnvironmentArn(backendEnvironmentArn);
        return this;
    }

    /**
     * <p>
     * Name for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @param environmentName
     *        Name for a backend environment, part of an Amplify App.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * Name for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @return Name for a backend environment, part of an Amplify App.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * Name for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @param environmentName
     *        Name for a backend environment, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendEnvironment withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * CloudFormation stack name of backend environment.
     * </p>
     * 
     * @param stackName
     *        CloudFormation stack name of backend environment.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * CloudFormation stack name of backend environment.
     * </p>
     * 
     * @return CloudFormation stack name of backend environment.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * CloudFormation stack name of backend environment.
     * </p>
     * 
     * @param stackName
     *        CloudFormation stack name of backend environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendEnvironment withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * Name of deployment artifacts.
     * </p>
     * 
     * @param deploymentArtifacts
     *        Name of deployment artifacts.
     */

    public void setDeploymentArtifacts(String deploymentArtifacts) {
        this.deploymentArtifacts = deploymentArtifacts;
    }

    /**
     * <p>
     * Name of deployment artifacts.
     * </p>
     * 
     * @return Name of deployment artifacts.
     */

    public String getDeploymentArtifacts() {
        return this.deploymentArtifacts;
    }

    /**
     * <p>
     * Name of deployment artifacts.
     * </p>
     * 
     * @param deploymentArtifacts
     *        Name of deployment artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendEnvironment withDeploymentArtifacts(String deploymentArtifacts) {
        setDeploymentArtifacts(deploymentArtifacts);
        return this;
    }

    /**
     * <p>
     * Creation date and time for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @param createTime
     *        Creation date and time for a backend environment, part of an Amplify App.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * Creation date and time for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @return Creation date and time for a backend environment, part of an Amplify App.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * Creation date and time for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @param createTime
     *        Creation date and time for a backend environment, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendEnvironment withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Last updated date and time for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @param updateTime
     *        Last updated date and time for a backend environment, part of an Amplify App.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * Last updated date and time for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @return Last updated date and time for a backend environment, part of an Amplify App.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * Last updated date and time for a backend environment, part of an Amplify App.
     * </p>
     * 
     * @param updateTime
     *        Last updated date and time for a backend environment, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendEnvironment withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getBackendEnvironmentArn() != null)
            sb.append("BackendEnvironmentArn: ").append(getBackendEnvironmentArn()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getDeploymentArtifacts() != null)
            sb.append("DeploymentArtifacts: ").append(getDeploymentArtifacts()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendEnvironment == false)
            return false;
        BackendEnvironment other = (BackendEnvironment) obj;
        if (other.getBackendEnvironmentArn() == null ^ this.getBackendEnvironmentArn() == null)
            return false;
        if (other.getBackendEnvironmentArn() != null && other.getBackendEnvironmentArn().equals(this.getBackendEnvironmentArn()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getDeploymentArtifacts() == null ^ this.getDeploymentArtifacts() == null)
            return false;
        if (other.getDeploymentArtifacts() != null && other.getDeploymentArtifacts().equals(this.getDeploymentArtifacts()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackendEnvironmentArn() == null) ? 0 : getBackendEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentArtifacts() == null) ? 0 : getDeploymentArtifacts().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public BackendEnvironment clone() {
        try {
            return (BackendEnvironment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.BackendEnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
