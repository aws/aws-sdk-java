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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An operation event returns details for an operation, including key milestones which can be used to monitor and track
 * operations in progress.
 * </p>
 * <p>
 * Operation events contain:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Description string
 * </p>
 * </li>
 * <li>
 * <p>
 * Resource, including its ARN and type
 * </p>
 * </li>
 * <li>
 * <p>
 * Status
 * </p>
 * </li>
 * <li>
 * <p>
 * StatusMessage string
 * </p>
 * </li>
 * <li>
 * <p>
 * TimeStamp
 * </p>
 * </li>
 * </ul>
 * <p>
 * Operation event examples include StartApplication or StopApplication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/OperationEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperationEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the operation event. For example, "Stop the EC2 instance i-abcdefgh987654321".
     * </p>
     */
    private String description;
    /**
     * <p>
     * The resource involved in the operations event.
     * </p>
     * <p>
     * Contains <code>ResourceArn</code> ARN and <code>ResourceType</code>.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * and <code>FAILED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message relating to a specific operation event.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The timestamp of the specified operation event.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * A description of the operation event. For example, "Stop the EC2 instance i-abcdefgh987654321".
     * </p>
     * 
     * @param description
     *        A description of the operation event. For example, "Stop the EC2 instance i-abcdefgh987654321".
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the operation event. For example, "Stop the EC2 instance i-abcdefgh987654321".
     * </p>
     * 
     * @return A description of the operation event. For example, "Stop the EC2 instance i-abcdefgh987654321".
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the operation event. For example, "Stop the EC2 instance i-abcdefgh987654321".
     * </p>
     * 
     * @param description
     *        A description of the operation event. For example, "Stop the EC2 instance i-abcdefgh987654321".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationEvent withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The resource involved in the operations event.
     * </p>
     * <p>
     * Contains <code>ResourceArn</code> ARN and <code>ResourceType</code>.
     * </p>
     * 
     * @param resource
     *        The resource involved in the operations event.</p>
     *        <p>
     *        Contains <code>ResourceArn</code> ARN and <code>ResourceType</code>.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource involved in the operations event.
     * </p>
     * <p>
     * Contains <code>ResourceArn</code> ARN and <code>ResourceType</code>.
     * </p>
     * 
     * @return The resource involved in the operations event.</p>
     *         <p>
     *         Contains <code>ResourceArn</code> ARN and <code>ResourceType</code>.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource involved in the operations event.
     * </p>
     * <p>
     * Contains <code>ResourceArn</code> ARN and <code>ResourceType</code>.
     * </p>
     * 
     * @param resource
     *        The resource involved in the operations event.</p>
     *        <p>
     *        Contains <code>ResourceArn</code> ARN and <code>ResourceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationEvent withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * and <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>,
     *        <code>COMPLETED</code>, and <code>FAILED</code>.
     * @see OperationEventStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * and <code>FAILED</code>.
     * </p>
     * 
     * @return The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>,
     *         <code>COMPLETED</code>, and <code>FAILED</code>.
     * @see OperationEventStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * and <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>,
     *        <code>COMPLETED</code>, and <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationEventStatus
     */

    public OperationEvent withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * and <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the operation event. The possible statuses are: <code>IN_PROGRESS</code>,
     *        <code>COMPLETED</code>, and <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationEventStatus
     */

    public OperationEvent withStatus(OperationEventStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message relating to a specific operation event.
     * </p>
     * 
     * @param statusMessage
     *        The status message relating to a specific operation event.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message relating to a specific operation event.
     * </p>
     * 
     * @return The status message relating to a specific operation event.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message relating to a specific operation event.
     * </p>
     * 
     * @param statusMessage
     *        The status message relating to a specific operation event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationEvent withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The timestamp of the specified operation event.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the specified operation event.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the specified operation event.
     * </p>
     * 
     * @return The timestamp of the specified operation event.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the specified operation event.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the specified operation event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationEvent withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OperationEvent == false)
            return false;
        OperationEvent other = (OperationEvent) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public OperationEvent clone() {
        try {
            return (OperationEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.OperationEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
