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
 * Represents the output of a StopDeployment operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/StopDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the stop deployment operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The stop operation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The stop operation was successful.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * An accompanying status message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The status of the stop deployment operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The stop operation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The stop operation was successful.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the stop deployment operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The stop operation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The stop operation was successful.
     *        </p>
     *        </li>
     * @see StopStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stop deployment operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The stop operation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The stop operation was successful.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the stop deployment operation:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The stop operation is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: The stop operation was successful.
     *         </p>
     *         </li>
     * @see StopStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the stop deployment operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The stop operation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The stop operation was successful.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the stop deployment operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The stop operation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The stop operation was successful.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StopStatus
     */

    public StopDeploymentResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the stop deployment operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The stop operation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The stop operation was successful.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the stop deployment operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The stop operation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The stop operation was successful.
     *        </p>
     *        </li>
     * @see StopStatus
     */

    public void setStatus(StopStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the stop deployment operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The stop operation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The stop operation was successful.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the stop deployment operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The stop operation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The stop operation was successful.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StopStatus
     */

    public StopDeploymentResult withStatus(StopStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An accompanying status message.
     * </p>
     * 
     * @param statusMessage
     *        An accompanying status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * An accompanying status message.
     * </p>
     * 
     * @return An accompanying status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * An accompanying status message.
     * </p>
     * 
     * @param statusMessage
     *        An accompanying status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDeploymentResult == false)
            return false;
        StopDeploymentResult other = (StopDeploymentResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public StopDeploymentResult clone() {
        try {
            return (StopDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
