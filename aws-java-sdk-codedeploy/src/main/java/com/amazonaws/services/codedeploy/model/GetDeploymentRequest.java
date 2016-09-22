/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a get deployment operation.
 * </p>
 */
public class GetDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A deployment ID associated with the applicable IAM user or AWS account.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * A deployment ID associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param deploymentId
     *        A deployment ID associated with the applicable IAM user or AWS account.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * A deployment ID associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @return A deployment ID associated with the applicable IAM user or AWS account.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * A deployment ID associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param deploymentId
     *        A deployment ID associated with the applicable IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DeploymentId: " + getDeploymentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentRequest == false)
            return false;
        GetDeploymentRequest other = (GetDeploymentRequest) obj;
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

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentRequest clone() {
        return (GetDeploymentRequest) super.clone();
    }
}
