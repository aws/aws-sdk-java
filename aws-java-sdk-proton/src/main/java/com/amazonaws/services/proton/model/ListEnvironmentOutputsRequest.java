/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentOutputs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentOutputsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the deployment whose outputs you want.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The environment name.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * A token that indicates the location of the next environment output in the array of environment outputs, after the
     * list of environment outputs that was previously requested.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the deployment whose outputs you want.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment whose outputs you want.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment whose outputs you want.
     * </p>
     * 
     * @return The ID of the deployment whose outputs you want.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment whose outputs you want.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the deployment whose outputs you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentOutputsRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The environment name.
     * </p>
     * 
     * @param environmentName
     *        The environment name.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The environment name.
     * </p>
     * 
     * @return The environment name.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The environment name.
     * </p>
     * 
     * @param environmentName
     *        The environment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentOutputsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * A token that indicates the location of the next environment output in the array of environment outputs, after the
     * list of environment outputs that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next environment output in the array of environment outputs,
     *        after the list of environment outputs that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next environment output in the array of environment outputs, after the
     * list of environment outputs that was previously requested.
     * </p>
     * 
     * @return A token that indicates the location of the next environment output in the array of environment outputs,
     *         after the list of environment outputs that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next environment output in the array of environment outputs, after the
     * list of environment outputs that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next environment output in the array of environment outputs,
     *        after the list of environment outputs that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentOutputsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentOutputsRequest == false)
            return false;
        ListEnvironmentOutputsRequest other = (ListEnvironmentOutputsRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentOutputsRequest clone() {
        return (ListEnvironmentOutputsRequest) super.clone();
    }

}
