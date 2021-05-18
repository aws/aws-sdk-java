/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information for an operation that occurred on an AWS App Runner service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/OperationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique ID of this operation. It's unique in the scope of the App Runner service.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of operation. It indicates a specific action that occured.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The current state of the operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that the operation acted on (for example, an App Runner service).
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The time when the operation started. It's in the Unix time stamp format.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The time when the operation ended. It's in the Unix time stamp format.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The time when the operation was last updated. It's in the Unix time stamp format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * A unique ID of this operation. It's unique in the scope of the App Runner service.
     * </p>
     * 
     * @param id
     *        A unique ID of this operation. It's unique in the scope of the App Runner service.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique ID of this operation. It's unique in the scope of the App Runner service.
     * </p>
     * 
     * @return A unique ID of this operation. It's unique in the scope of the App Runner service.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique ID of this operation. It's unique in the scope of the App Runner service.
     * </p>
     * 
     * @param id
     *        A unique ID of this operation. It's unique in the scope of the App Runner service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of operation. It indicates a specific action that occured.
     * </p>
     * 
     * @param type
     *        The type of operation. It indicates a specific action that occured.
     * @see OperationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of operation. It indicates a specific action that occured.
     * </p>
     * 
     * @return The type of operation. It indicates a specific action that occured.
     * @see OperationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of operation. It indicates a specific action that occured.
     * </p>
     * 
     * @param type
     *        The type of operation. It indicates a specific action that occured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public OperationSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of operation. It indicates a specific action that occured.
     * </p>
     * 
     * @param type
     *        The type of operation. It indicates a specific action that occured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public OperationSummary withType(OperationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the operation.
     * </p>
     * 
     * @param status
     *        The current state of the operation.
     * @see OperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the operation.
     * </p>
     * 
     * @return The current state of the operation.
     * @see OperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the operation.
     * </p>
     * 
     * @param status
     *        The current state of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public OperationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the operation.
     * </p>
     * 
     * @param status
     *        The current state of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public OperationSummary withStatus(OperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that the operation acted on (for example, an App Runner service).
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of the resource that the operation acted on (for example, an App Runner
     *        service).
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that the operation acted on (for example, an App Runner service).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource that the operation acted on (for example, an App Runner
     *         service).
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that the operation acted on (for example, an App Runner service).
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of the resource that the operation acted on (for example, an App Runner
     *        service).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationSummary withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The time when the operation started. It's in the Unix time stamp format.
     * </p>
     * 
     * @param startedAt
     *        The time when the operation started. It's in the Unix time stamp format.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time when the operation started. It's in the Unix time stamp format.
     * </p>
     * 
     * @return The time when the operation started. It's in the Unix time stamp format.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time when the operation started. It's in the Unix time stamp format.
     * </p>
     * 
     * @param startedAt
     *        The time when the operation started. It's in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The time when the operation ended. It's in the Unix time stamp format.
     * </p>
     * 
     * @param endedAt
     *        The time when the operation ended. It's in the Unix time stamp format.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The time when the operation ended. It's in the Unix time stamp format.
     * </p>
     * 
     * @return The time when the operation ended. It's in the Unix time stamp format.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The time when the operation ended. It's in the Unix time stamp format.
     * </p>
     * 
     * @param endedAt
     *        The time when the operation ended. It's in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationSummary withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The time when the operation was last updated. It's in the Unix time stamp format.
     * </p>
     * 
     * @param updatedAt
     *        The time when the operation was last updated. It's in the Unix time stamp format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time when the operation was last updated. It's in the Unix time stamp format.
     * </p>
     * 
     * @return The time when the operation was last updated. It's in the Unix time stamp format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time when the operation was last updated. It's in the Unix time stamp format.
     * </p>
     * 
     * @param updatedAt
     *        The time when the operation was last updated. It's in the Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OperationSummary == false)
            return false;
        OperationSummary other = (OperationSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public OperationSummary clone() {
        try {
            return (OperationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.OperationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
