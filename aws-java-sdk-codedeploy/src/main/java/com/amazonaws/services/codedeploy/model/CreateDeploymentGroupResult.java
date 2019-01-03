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
 * Represents the output of a CreateDeploymentGroup operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeploymentGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique deployment group ID.
     * </p>
     */
    private String deploymentGroupId;

    /**
     * <p>
     * A unique deployment group ID.
     * </p>
     * 
     * @param deploymentGroupId
     *        A unique deployment group ID.
     */

    public void setDeploymentGroupId(String deploymentGroupId) {
        this.deploymentGroupId = deploymentGroupId;
    }

    /**
     * <p>
     * A unique deployment group ID.
     * </p>
     * 
     * @return A unique deployment group ID.
     */

    public String getDeploymentGroupId() {
        return this.deploymentGroupId;
    }

    /**
     * <p>
     * A unique deployment group ID.
     * </p>
     * 
     * @param deploymentGroupId
     *        A unique deployment group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupResult withDeploymentGroupId(String deploymentGroupId) {
        setDeploymentGroupId(deploymentGroupId);
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
        if (getDeploymentGroupId() != null)
            sb.append("DeploymentGroupId: ").append(getDeploymentGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentGroupResult == false)
            return false;
        CreateDeploymentGroupResult other = (CreateDeploymentGroupResult) obj;
        if (other.getDeploymentGroupId() == null ^ this.getDeploymentGroupId() == null)
            return false;
        if (other.getDeploymentGroupId() != null && other.getDeploymentGroupId().equals(this.getDeploymentGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentGroupId() == null) ? 0 : getDeploymentGroupId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentGroupResult clone() {
        try {
            return (CreateDeploymentGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
