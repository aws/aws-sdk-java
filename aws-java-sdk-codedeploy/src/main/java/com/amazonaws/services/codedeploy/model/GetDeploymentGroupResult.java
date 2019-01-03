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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a GetDeploymentGroup operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the deployment group.
     * </p>
     */
    private DeploymentGroupInfo deploymentGroupInfo;

    /**
     * <p>
     * Information about the deployment group.
     * </p>
     * 
     * @param deploymentGroupInfo
     *        Information about the deployment group.
     */

    public void setDeploymentGroupInfo(DeploymentGroupInfo deploymentGroupInfo) {
        this.deploymentGroupInfo = deploymentGroupInfo;
    }

    /**
     * <p>
     * Information about the deployment group.
     * </p>
     * 
     * @return Information about the deployment group.
     */

    public DeploymentGroupInfo getDeploymentGroupInfo() {
        return this.deploymentGroupInfo;
    }

    /**
     * <p>
     * Information about the deployment group.
     * </p>
     * 
     * @param deploymentGroupInfo
     *        Information about the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentGroupResult withDeploymentGroupInfo(DeploymentGroupInfo deploymentGroupInfo) {
        setDeploymentGroupInfo(deploymentGroupInfo);
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
        if (getDeploymentGroupInfo() != null)
            sb.append("DeploymentGroupInfo: ").append(getDeploymentGroupInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentGroupResult == false)
            return false;
        GetDeploymentGroupResult other = (GetDeploymentGroupResult) obj;
        if (other.getDeploymentGroupInfo() == null ^ this.getDeploymentGroupInfo() == null)
            return false;
        if (other.getDeploymentGroupInfo() != null && other.getDeploymentGroupInfo().equals(this.getDeploymentGroupInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentGroupInfo() == null) ? 0 : getDeploymentGroupInfo().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentGroupResult clone() {
        try {
            return (GetDeploymentGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
