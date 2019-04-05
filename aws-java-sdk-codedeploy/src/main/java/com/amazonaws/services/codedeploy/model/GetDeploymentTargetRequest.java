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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The unique ID of a deployment target.
     * </p>
     */
    private String targetId;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentTargetRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The unique ID of a deployment target.
     * </p>
     * 
     * @param targetId
     *        The unique ID of a deployment target.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target.
     * </p>
     * 
     * @return The unique ID of a deployment target.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The unique ID of a deployment target.
     * </p>
     * 
     * @param targetId
     *        The unique ID of a deployment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentTargetRequest withTargetId(String targetId) {
        setTargetId(targetId);
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
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentTargetRequest == false)
            return false;
        GetDeploymentTargetRequest other = (GetDeploymentTargetRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentTargetRequest clone() {
        return (GetDeploymentTargetRequest) super.clone();
    }

}
