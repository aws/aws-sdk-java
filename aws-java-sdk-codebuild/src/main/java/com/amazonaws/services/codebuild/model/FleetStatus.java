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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the compute fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/FleetStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status code of the compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: The compute fleet is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The compute fleet is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROTATING</code>: The compute fleet is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The compute fleet is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to previous
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     * </p>
     * </li>
     * </ul>
     */
    private String statusCode;
    /**
     * <p>
     * Additional information about a compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     * </p>
     * </li>
     * </ul>
     */
    private String context;
    /**
     * <p>
     * A message associated with the status of a compute fleet.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code of the compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: The compute fleet is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The compute fleet is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROTATING</code>: The compute fleet is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The compute fleet is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to previous
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code of the compute fleet. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: The compute fleet is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code>: The compute fleet is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROTATING</code>: The compute fleet is being rotated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: The compute fleet is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to
     *        previous state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     *        </p>
     *        </li>
     * @see FleetStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code of the compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: The compute fleet is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The compute fleet is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROTATING</code>: The compute fleet is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The compute fleet is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to previous
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status code of the compute fleet. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code>: The compute fleet is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code>: The compute fleet is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ROTATING</code>: The compute fleet is being rotated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code>: The compute fleet is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to
     *         previous state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     *         </p>
     *         </li>
     * @see FleetStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code of the compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: The compute fleet is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The compute fleet is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROTATING</code>: The compute fleet is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The compute fleet is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to previous
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code of the compute fleet. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: The compute fleet is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code>: The compute fleet is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROTATING</code>: The compute fleet is being rotated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: The compute fleet is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to
     *        previous state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatusCode
     */

    public FleetStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code of the compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code>: The compute fleet is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The compute fleet is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROTATING</code>: The compute fleet is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>: The compute fleet is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to previous
     * state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusCode
     *        The status code of the compute fleet. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code>: The compute fleet is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code>: The compute fleet is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROTATING</code>: The compute fleet is being rotated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code>: The compute fleet is pending deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>: The compute fleet is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_ROLLBACK_FAILED</code>: The compute fleet has failed to update and could not rollback to
     *        previous state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>: The compute fleet has succeeded and is active.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatusCode
     */

    public FleetStatus withStatusCode(FleetStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about a compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param context
     *        Additional information about a compute fleet. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     *        </p>
     *        </li>
     * @see FleetContextCode
     */

    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * Additional information about a compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Additional information about a compute fleet. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     *         </p>
     *         </li>
     * @see FleetContextCode
     */

    public String getContext() {
        return this.context;
    }

    /**
     * <p>
     * Additional information about a compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param context
     *        Additional information about a compute fleet. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetContextCode
     */

    public FleetStatus withContext(String context) {
        setContext(context);
        return this;
    }

    /**
     * <p>
     * Additional information about a compute fleet. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param context
     *        Additional information about a compute fleet. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code>: The compute fleet has failed to create.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code>: The compute fleet has failed to update.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetContextCode
     */

    public FleetStatus withContext(FleetContextCode context) {
        this.context = context.toString();
        return this;
    }

    /**
     * <p>
     * A message associated with the status of a compute fleet.
     * </p>
     * 
     * @param message
     *        A message associated with the status of a compute fleet.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message associated with the status of a compute fleet.
     * </p>
     * 
     * @return A message associated with the status of a compute fleet.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message associated with the status of a compute fleet.
     * </p>
     * 
     * @param message
     *        A message associated with the status of a compute fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetStatus withMessage(String message) {
        setMessage(message);
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetStatus == false)
            return false;
        FleetStatus other = (FleetStatus) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public FleetStatus clone() {
        try {
            return (FleetStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.FleetStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
