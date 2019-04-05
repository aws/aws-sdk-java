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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GetDeploymentTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A deployment target that contains information about a deployment such as its status, lifecyle events, and when it
     * was last updated. It also contains metadata about the deployment target. The deployment target metadata depends
     * on the deployment target's type (<code>instanceTarget</code>, <code>lambdaTarget</code>, or
     * <code>ecsTarget</code>).
     * </p>
     */
    private DeploymentTarget deploymentTarget;

    /**
     * <p>
     * A deployment target that contains information about a deployment such as its status, lifecyle events, and when it
     * was last updated. It also contains metadata about the deployment target. The deployment target metadata depends
     * on the deployment target's type (<code>instanceTarget</code>, <code>lambdaTarget</code>, or
     * <code>ecsTarget</code>).
     * </p>
     * 
     * @param deploymentTarget
     *        A deployment target that contains information about a deployment such as its status, lifecyle events, and
     *        when it was last updated. It also contains metadata about the deployment target. The deployment target
     *        metadata depends on the deployment target's type (<code>instanceTarget</code>, <code>lambdaTarget</code>,
     *        or <code>ecsTarget</code>).
     */

    public void setDeploymentTarget(DeploymentTarget deploymentTarget) {
        this.deploymentTarget = deploymentTarget;
    }

    /**
     * <p>
     * A deployment target that contains information about a deployment such as its status, lifecyle events, and when it
     * was last updated. It also contains metadata about the deployment target. The deployment target metadata depends
     * on the deployment target's type (<code>instanceTarget</code>, <code>lambdaTarget</code>, or
     * <code>ecsTarget</code>).
     * </p>
     * 
     * @return A deployment target that contains information about a deployment such as its status, lifecyle events, and
     *         when it was last updated. It also contains metadata about the deployment target. The deployment target
     *         metadata depends on the deployment target's type (<code>instanceTarget</code>, <code>lambdaTarget</code>,
     *         or <code>ecsTarget</code>).
     */

    public DeploymentTarget getDeploymentTarget() {
        return this.deploymentTarget;
    }

    /**
     * <p>
     * A deployment target that contains information about a deployment such as its status, lifecyle events, and when it
     * was last updated. It also contains metadata about the deployment target. The deployment target metadata depends
     * on the deployment target's type (<code>instanceTarget</code>, <code>lambdaTarget</code>, or
     * <code>ecsTarget</code>).
     * </p>
     * 
     * @param deploymentTarget
     *        A deployment target that contains information about a deployment such as its status, lifecyle events, and
     *        when it was last updated. It also contains metadata about the deployment target. The deployment target
     *        metadata depends on the deployment target's type (<code>instanceTarget</code>, <code>lambdaTarget</code>,
     *        or <code>ecsTarget</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentTargetResult withDeploymentTarget(DeploymentTarget deploymentTarget) {
        setDeploymentTarget(deploymentTarget);
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
        if (getDeploymentTarget() != null)
            sb.append("DeploymentTarget: ").append(getDeploymentTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentTargetResult == false)
            return false;
        GetDeploymentTargetResult other = (GetDeploymentTargetResult) obj;
        if (other.getDeploymentTarget() == null ^ this.getDeploymentTarget() == null)
            return false;
        if (other.getDeploymentTarget() != null && other.getDeploymentTarget().equals(this.getDeploymentTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentTarget() == null) ? 0 : getDeploymentTarget().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentTargetResult clone() {
        try {
            return (GetDeploymentTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
