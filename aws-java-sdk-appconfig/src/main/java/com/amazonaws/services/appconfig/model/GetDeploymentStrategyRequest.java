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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeploymentStrategy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentStrategyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the deployment strategy to get.
     * </p>
     */
    private String deploymentStrategyId;

    /**
     * <p>
     * The ID of the deployment strategy to get.
     * </p>
     * 
     * @param deploymentStrategyId
     *        The ID of the deployment strategy to get.
     */

    public void setDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
    }

    /**
     * <p>
     * The ID of the deployment strategy to get.
     * </p>
     * 
     * @return The ID of the deployment strategy to get.
     */

    public String getDeploymentStrategyId() {
        return this.deploymentStrategyId;
    }

    /**
     * <p>
     * The ID of the deployment strategy to get.
     * </p>
     * 
     * @param deploymentStrategyId
     *        The ID of the deployment strategy to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentStrategyRequest withDeploymentStrategyId(String deploymentStrategyId) {
        setDeploymentStrategyId(deploymentStrategyId);
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
        if (getDeploymentStrategyId() != null)
            sb.append("DeploymentStrategyId: ").append(getDeploymentStrategyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentStrategyRequest == false)
            return false;
        GetDeploymentStrategyRequest other = (GetDeploymentStrategyRequest) obj;
        if (other.getDeploymentStrategyId() == null ^ this.getDeploymentStrategyId() == null)
            return false;
        if (other.getDeploymentStrategyId() != null && other.getDeploymentStrategyId().equals(this.getDeploymentStrategyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentStrategyId() == null) ? 0 : getDeploymentStrategyId().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentStrategyRequest clone() {
        return (GetDeploymentStrategyRequest) super.clone();
    }

}
