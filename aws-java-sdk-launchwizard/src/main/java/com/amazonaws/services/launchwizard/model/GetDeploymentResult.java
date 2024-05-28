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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that details the deployment.
     * </p>
     */
    private DeploymentData deployment;

    /**
     * <p>
     * An object that details the deployment.
     * </p>
     * 
     * @param deployment
     *        An object that details the deployment.
     */

    public void setDeployment(DeploymentData deployment) {
        this.deployment = deployment;
    }

    /**
     * <p>
     * An object that details the deployment.
     * </p>
     * 
     * @return An object that details the deployment.
     */

    public DeploymentData getDeployment() {
        return this.deployment;
    }

    /**
     * <p>
     * An object that details the deployment.
     * </p>
     * 
     * @param deployment
     *        An object that details the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentResult withDeployment(DeploymentData deployment) {
        setDeployment(deployment);
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
        if (getDeployment() != null)
            sb.append("Deployment: ").append(getDeployment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentResult == false)
            return false;
        GetDeploymentResult other = (GetDeploymentResult) obj;
        if (other.getDeployment() == null ^ this.getDeployment() == null)
            return false;
        if (other.getDeployment() != null && other.getDeployment().equals(this.getDeployment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeployment() == null) ? 0 : getDeployment().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentResult clone() {
        try {
            return (GetDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
