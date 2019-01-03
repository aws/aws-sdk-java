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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * OperationSummary includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/OperationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier returned to track the requested action.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Type of the action requested.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date when the request was submitted.
     * </p>
     */
    private java.util.Date submittedDate;

    /**
     * <p>
     * Identifier returned to track the requested action.
     * </p>
     * 
     * @param operationId
     *        Identifier returned to track the requested action.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * Identifier returned to track the requested action.
     * </p>
     * 
     * @return Identifier returned to track the requested action.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * Identifier returned to track the requested action.
     * </p>
     * 
     * @param operationId
     *        Identifier returned to track the requested action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationSummary withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * 
     * @param status
     *        The current status of the requested operation in the system.
     * @see OperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * 
     * @return The current status of the requested operation in the system.
     * @see OperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * 
     * @param status
     *        The current status of the requested operation in the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public OperationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * 
     * @param status
     *        The current status of the requested operation in the system.
     * @see OperationStatus
     */

    public void setStatus(OperationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * 
     * @param status
     *        The current status of the requested operation in the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public OperationSummary withStatus(OperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Type of the action requested.
     * </p>
     * 
     * @param type
     *        Type of the action requested.
     * @see OperationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of the action requested.
     * </p>
     * 
     * @return Type of the action requested.
     * @see OperationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of the action requested.
     * </p>
     * 
     * @param type
     *        Type of the action requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public OperationSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of the action requested.
     * </p>
     * 
     * @param type
     *        Type of the action requested.
     * @see OperationType
     */

    public void setType(OperationType type) {
        withType(type);
    }

    /**
     * <p>
     * Type of the action requested.
     * </p>
     * 
     * @param type
     *        Type of the action requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public OperationSummary withType(OperationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date when the request was submitted.
     * </p>
     * 
     * @param submittedDate
     *        The date when the request was submitted.
     */

    public void setSubmittedDate(java.util.Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    /**
     * <p>
     * The date when the request was submitted.
     * </p>
     * 
     * @return The date when the request was submitted.
     */

    public java.util.Date getSubmittedDate() {
        return this.submittedDate;
    }

    /**
     * <p>
     * The date when the request was submitted.
     * </p>
     * 
     * @param submittedDate
     *        The date when the request was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationSummary withSubmittedDate(java.util.Date submittedDate) {
        setSubmittedDate(submittedDate);
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSubmittedDate() != null)
            sb.append("SubmittedDate: ").append(getSubmittedDate());
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
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSubmittedDate() == null ^ this.getSubmittedDate() == null)
            return false;
        if (other.getSubmittedDate() != null && other.getSubmittedDate().equals(this.getSubmittedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSubmittedDate() == null) ? 0 : getSubmittedDate().hashCode());
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
        com.amazonaws.services.route53domains.model.transform.OperationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
