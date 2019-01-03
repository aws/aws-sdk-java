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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResetDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the deployment. */
    private String deploymentArn;
    /** The ID of the deployment. */
    private String deploymentId;

    /**
     * The ARN of the deployment.
     * 
     * @param deploymentArn
     *        The ARN of the deployment.
     */

    public void setDeploymentArn(String deploymentArn) {
        this.deploymentArn = deploymentArn;
    }

    /**
     * The ARN of the deployment.
     * 
     * @return The ARN of the deployment.
     */

    public String getDeploymentArn() {
        return this.deploymentArn;
    }

    /**
     * The ARN of the deployment.
     * 
     * @param deploymentArn
     *        The ARN of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDeploymentsResult withDeploymentArn(String deploymentArn) {
        setDeploymentArn(deploymentArn);
        return this;
    }

    /**
     * The ID of the deployment.
     * 
     * @param deploymentId
     *        The ID of the deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * The ID of the deployment.
     * 
     * @return The ID of the deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * The ID of the deployment.
     * 
     * @param deploymentId
     *        The ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDeploymentsResult withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
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
        if (getDeploymentArn() != null)
            sb.append("DeploymentArn: ").append(getDeploymentArn()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetDeploymentsResult == false)
            return false;
        ResetDeploymentsResult other = (ResetDeploymentsResult) obj;
        if (other.getDeploymentArn() == null ^ this.getDeploymentArn() == null)
            return false;
        if (other.getDeploymentArn() != null && other.getDeploymentArn().equals(this.getDeploymentArn()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentArn() == null) ? 0 : getDeploymentArn().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        return hashCode;
    }

    @Override
    public ResetDeploymentsResult clone() {
        try {
            return (ResetDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
