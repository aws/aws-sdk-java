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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for a backend environment create request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBackendEnvironment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name for the backend environment.
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
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @return Unique Id for an Amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendEnvironmentRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name for the backend environment.
     * </p>
     * 
     * @param environmentName
     *        Name for the backend environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * Name for the backend environment.
     * </p>
     * 
     * @return Name for the backend environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * Name for the backend environment.
     * </p>
     * 
     * @param environmentName
     *        Name for the backend environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendEnvironmentRequest withEnvironmentName(String environmentName) {
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

    public CreateBackendEnvironmentRequest withStackName(String stackName) {
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

    public CreateBackendEnvironmentRequest withDeploymentArtifacts(String deploymentArtifacts) {
        setDeploymentArtifacts(deploymentArtifacts);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getDeploymentArtifacts() != null)
            sb.append("DeploymentArtifacts: ").append(getDeploymentArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendEnvironmentRequest == false)
            return false;
        CreateBackendEnvironmentRequest other = (CreateBackendEnvironmentRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentArtifacts() == null) ? 0 : getDeploymentArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendEnvironmentRequest clone() {
        return (CreateBackendEnvironmentRequest) super.clone();
    }

}
