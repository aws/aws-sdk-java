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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ContinueDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinueDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement
     * environment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start shifting
     * traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not terminated.
     * </p>
     */
    private String deploymentWaitType;

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement
     * environment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement
     *        environment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement
     * environment.
     * </p>
     * 
     * @return The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement
     *         environment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement
     * environment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinueDeploymentRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start shifting
     * traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not terminated.
     * </p>
     * 
     * @param deploymentWaitType
     *        The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start
     *        shifting traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not
     *        terminated.
     * @see DeploymentWaitType
     */

    public void setDeploymentWaitType(String deploymentWaitType) {
        this.deploymentWaitType = deploymentWaitType;
    }

    /**
     * <p>
     * The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start shifting
     * traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not terminated.
     * </p>
     * 
     * @return The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start
     *         shifting traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not
     *         terminated.
     * @see DeploymentWaitType
     */

    public String getDeploymentWaitType() {
        return this.deploymentWaitType;
    }

    /**
     * <p>
     * The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start shifting
     * traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not terminated.
     * </p>
     * 
     * @param deploymentWaitType
     *        The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start
     *        shifting traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not
     *        terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentWaitType
     */

    public ContinueDeploymentRequest withDeploymentWaitType(String deploymentWaitType) {
        setDeploymentWaitType(deploymentWaitType);
        return this;
    }

    /**
     * <p>
     * The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start shifting
     * traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not terminated.
     * </p>
     * 
     * @param deploymentWaitType
     *        The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start
     *        shifting traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not
     *        terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentWaitType
     */

    public ContinueDeploymentRequest withDeploymentWaitType(DeploymentWaitType deploymentWaitType) {
        this.deploymentWaitType = deploymentWaitType.toString();
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
        if (getDeploymentWaitType() != null)
            sb.append("DeploymentWaitType: ").append(getDeploymentWaitType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinueDeploymentRequest == false)
            return false;
        ContinueDeploymentRequest other = (ContinueDeploymentRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentWaitType() == null ^ this.getDeploymentWaitType() == null)
            return false;
        if (other.getDeploymentWaitType() != null && other.getDeploymentWaitType().equals(this.getDeploymentWaitType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentWaitType() == null) ? 0 : getDeploymentWaitType().hashCode());
        return hashCode;
    }

    @Override
    public ContinueDeploymentRequest clone() {
        return (ContinueDeploymentRequest) super.clone();
    }

}
