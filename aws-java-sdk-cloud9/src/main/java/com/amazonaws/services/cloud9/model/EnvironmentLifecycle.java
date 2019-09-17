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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the current creation or deletion lifecycle state of an AWS Cloud9 development environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/EnvironmentLifecycle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentLifecycle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current creation or deletion lifecycle state of the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: The environment was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code>: The environment failed to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The environment is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Any informational message about the lifecycle state of the environment.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
     * </p>
     */
    private String failureResource;

    /**
     * <p>
     * The current creation or deletion lifecycle state of the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: The environment was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code>: The environment failed to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The environment is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current creation or deletion lifecycle state of the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The environment was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code>: The environment failed to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: The environment is in the process of being deleted.
     *        </p>
     *        </li>
     * @see EnvironmentLifecycleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current creation or deletion lifecycle state of the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: The environment was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code>: The environment failed to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The environment is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current creation or deletion lifecycle state of the environment.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code>: The environment was successfully created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_FAILED</code>: The environment failed to delete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code>: The environment is in the process of being deleted.
     *         </p>
     *         </li>
     * @see EnvironmentLifecycleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current creation or deletion lifecycle state of the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: The environment was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code>: The environment failed to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The environment is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current creation or deletion lifecycle state of the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The environment was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code>: The environment failed to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: The environment is in the process of being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentLifecycleStatus
     */

    public EnvironmentLifecycle withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current creation or deletion lifecycle state of the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: The environment was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_FAILED</code>: The environment failed to delete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The environment is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current creation or deletion lifecycle state of the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: The environment was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_FAILED</code>: The environment failed to delete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: The environment is in the process of being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentLifecycleStatus
     */

    public EnvironmentLifecycle withStatus(EnvironmentLifecycleStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Any informational message about the lifecycle state of the environment.
     * </p>
     * 
     * @param reason
     *        Any informational message about the lifecycle state of the environment.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Any informational message about the lifecycle state of the environment.
     * </p>
     * 
     * @return Any informational message about the lifecycle state of the environment.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Any informational message about the lifecycle state of the environment.
     * </p>
     * 
     * @param reason
     *        Any informational message about the lifecycle state of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentLifecycle withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
     * </p>
     * 
     * @param failureResource
     *        If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
     */

    public void setFailureResource(String failureResource) {
        this.failureResource = failureResource;
    }

    /**
     * <p>
     * If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
     * </p>
     * 
     * @return If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
     */

    public String getFailureResource() {
        return this.failureResource;
    }

    /**
     * <p>
     * If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
     * </p>
     * 
     * @param failureResource
     *        If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentLifecycle withFailureResource(String failureResource) {
        setFailureResource(failureResource);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getFailureResource() != null)
            sb.append("FailureResource: ").append(getFailureResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentLifecycle == false)
            return false;
        EnvironmentLifecycle other = (EnvironmentLifecycle) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getFailureResource() == null ^ this.getFailureResource() == null)
            return false;
        if (other.getFailureResource() != null && other.getFailureResource().equals(this.getFailureResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getFailureResource() == null) ? 0 : getFailureResource().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentLifecycle clone() {
        try {
            return (EnvironmentLifecycle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloud9.model.transform.EnvironmentLifecycleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
