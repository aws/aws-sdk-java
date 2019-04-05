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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/PutLifecycleEventHookExecutionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLifecycleEventHookExecutionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the
     * <code>hooks</code> section of the AppSpec file.
     * </p>
     */
    private String lifecycleEventHookExecutionId;
    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     * <code>Failed</code>).
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle
     *        event.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event.
     * </p>
     * 
     * @return The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle
     *         event.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle
     *        event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleEventHookExecutionStatusRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the
     * <code>hooks</code> section of the AppSpec file.
     * </p>
     * 
     * @param lifecycleEventHookExecutionId
     *        The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the
     *        <code>hooks</code> section of the AppSpec file.
     */

    public void setLifecycleEventHookExecutionId(String lifecycleEventHookExecutionId) {
        this.lifecycleEventHookExecutionId = lifecycleEventHookExecutionId;
    }

    /**
     * <p>
     * The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the
     * <code>hooks</code> section of the AppSpec file.
     * </p>
     * 
     * @return The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the
     *         <code>hooks</code> section of the AppSpec file.
     */

    public String getLifecycleEventHookExecutionId() {
        return this.lifecycleEventHookExecutionId;
    }

    /**
     * <p>
     * The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the
     * <code>hooks</code> section of the AppSpec file.
     * </p>
     * 
     * @param lifecycleEventHookExecutionId
     *        The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the
     *        <code>hooks</code> section of the AppSpec file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleEventHookExecutionStatusRequest withLifecycleEventHookExecutionId(String lifecycleEventHookExecutionId) {
        setLifecycleEventHookExecutionId(lifecycleEventHookExecutionId);
        return this;
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     * <code>Failed</code>).
     * </p>
     * 
     * @param status
     *        The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     *        <code>Failed</code>).
     * @see LifecycleEventStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     * <code>Failed</code>).
     * </p>
     * 
     * @return The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     *         <code>Failed</code>).
     * @see LifecycleEventStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     * <code>Failed</code>).
     * </p>
     * 
     * @param status
     *        The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     *        <code>Failed</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleEventStatus
     */

    public PutLifecycleEventHookExecutionStatusRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     * <code>Failed</code>).
     * </p>
     * 
     * @param status
     *        The result of a Lambda function that validates a deployment lifecycle event (<code>Succeeded</code> or
     *        <code>Failed</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecycleEventStatus
     */

    public PutLifecycleEventHookExecutionStatusRequest withStatus(LifecycleEventStatus status) {
        this.status = status.toString();
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
        if (getLifecycleEventHookExecutionId() != null)
            sb.append("LifecycleEventHookExecutionId: ").append(getLifecycleEventHookExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleEventHookExecutionStatusRequest == false)
            return false;
        PutLifecycleEventHookExecutionStatusRequest other = (PutLifecycleEventHookExecutionStatusRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getLifecycleEventHookExecutionId() == null ^ this.getLifecycleEventHookExecutionId() == null)
            return false;
        if (other.getLifecycleEventHookExecutionId() != null
                && other.getLifecycleEventHookExecutionId().equals(this.getLifecycleEventHookExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getLifecycleEventHookExecutionId() == null) ? 0 : getLifecycleEventHookExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public PutLifecycleEventHookExecutionStatusRequest clone() {
        return (PutLifecycleEventHookExecutionStatusRequest) super.clone();
    }

}
