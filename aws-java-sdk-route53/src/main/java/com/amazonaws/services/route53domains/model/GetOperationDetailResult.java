/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The GetOperationDetail response includes the following elements.
 * </p>
 */
public class GetOperationDetailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the operation.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String status;
    /**
     * <p>
     * Detailed information on the status including possible errors.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String message;
    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The type of operation that was requested.
     * </p>
     * <p>
     * Type: String
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
     * The identifier for the operation.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param operationId
     *        The identifier for the operation.</p>
     *        <p>
     *        Type: String
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The identifier for the operation.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return The identifier for the operation.</p>
     *         <p>
     *         Type: String
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The identifier for the operation.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param operationId
     *        The identifier for the operation.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationDetailResult withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param status
     *        The current status of the requested operation in the system.</p>
     *        <p>
     *        Type: String
     * @see OperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return The current status of the requested operation in the system.</p>
     *         <p>
     *         Type: String
     * @see OperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param status
     *        The current status of the requested operation in the system.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public GetOperationDetailResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param status
     *        The current status of the requested operation in the system.</p>
     *        <p>
     *        Type: String
     * @see OperationStatus
     */

    public void setStatus(OperationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the requested operation in the system.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param status
     *        The current status of the requested operation in the system.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public GetOperationDetailResult withStatus(OperationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Detailed information on the status including possible errors.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param message
     *        Detailed information on the status including possible errors.</p>
     *        <p>
     *        Type: String
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Detailed information on the status including possible errors.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return Detailed information on the status including possible errors.</p>
     *         <p>
     *         Type: String
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Detailed information on the status including possible errors.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param message
     *        Detailed information on the status including possible errors.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationDetailResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return The name of a domain.</p>
     *         <p>
     *         Type: String
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOperationDetailResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The type of operation that was requested.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param type
     *        The type of operation that was requested.</p>
     *        <p>
     *        Type: String
     * @see OperationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of operation that was requested.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return The type of operation that was requested.</p>
     *         <p>
     *         Type: String
     * @see OperationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of operation that was requested.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param type
     *        The type of operation that was requested.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public GetOperationDetailResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of operation that was requested.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param type
     *        The type of operation that was requested.</p>
     *        <p>
     *        Type: String
     * @see OperationType
     */

    public void setType(OperationType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of operation that was requested.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param type
     *        The type of operation that was requested.</p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public GetOperationDetailResult withType(OperationType type) {
        setType(type);
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

    public GetOperationDetailResult withSubmittedDate(java.util.Date submittedDate) {
        setSubmittedDate(submittedDate);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("OperationId: " + getOperationId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getSubmittedDate() != null)
            sb.append("SubmittedDate: " + getSubmittedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOperationDetailResult == false)
            return false;
        GetOperationDetailResult other = (GetOperationDetailResult) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
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
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSubmittedDate() == null) ? 0 : getSubmittedDate().hashCode());
        return hashCode;
    }

    @Override
    public GetOperationDetailResult clone() {
        try {
            return (GetOperationDetailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
