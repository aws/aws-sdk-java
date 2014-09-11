/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The GetOperationDetail response includes the following elements.
 * </p>
 */
public class GetOperationDetailResult implements Serializable {

    /**
     * The identifier for the operation. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String operationId;

    /**
     * The current status of the requested operation in the system. <p>Type:
     * String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED
     */
    private String status;

    /**
     * Detailed information on the status including possible errors. <p>Type:
     * String
     */
    private String message;

    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     */
    private String domainName;

    /**
     * The type of operation that was requested. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN, TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER, CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK
     */
    private String type;

    /**
     * The date when the request was submitted.
     */
    private java.util.Date submittedDate;

    /**
     * The identifier for the operation. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The identifier for the operation. <p>Type: String
     */
    public String getOperationId() {
        return operationId;
    }
    
    /**
     * The identifier for the operation. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param operationId The identifier for the operation. <p>Type: String
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }
    
    /**
     * The identifier for the operation. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param operationId The identifier for the operation. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOperationDetailResult withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * The current status of the requested operation in the system. <p>Type:
     * String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED
     *
     * @return The current status of the requested operation in the system. <p>Type:
     *         String
     *
     * @see OperationStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current status of the requested operation in the system. <p>Type:
     * String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED
     *
     * @param status The current status of the requested operation in the system. <p>Type:
     *         String
     *
     * @see OperationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current status of the requested operation in the system. <p>Type:
     * String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED
     *
     * @param status The current status of the requested operation in the system. <p>Type:
     *         String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OperationStatus
     */
    public GetOperationDetailResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the requested operation in the system. <p>Type:
     * String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED
     *
     * @param status The current status of the requested operation in the system. <p>Type:
     *         String
     *
     * @see OperationStatus
     */
    public void setStatus(OperationStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The current status of the requested operation in the system. <p>Type:
     * String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, ERROR, SUCCESSFUL, FAILED
     *
     * @param status The current status of the requested operation in the system. <p>Type:
     *         String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OperationStatus
     */
    public GetOperationDetailResult withStatus(OperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Detailed information on the status including possible errors. <p>Type:
     * String
     *
     * @return Detailed information on the status including possible errors. <p>Type:
     *         String
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Detailed information on the status including possible errors. <p>Type:
     * String
     *
     * @param message Detailed information on the status including possible errors. <p>Type:
     *         String
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Detailed information on the status including possible errors. <p>Type:
     * String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message Detailed information on the status including possible errors. <p>Type:
     *         String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOperationDetailResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return The name of a domain. <p>Type: String
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOperationDetailResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The type of operation that was requested. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN, TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER, CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK
     *
     * @return The type of operation that was requested. <p>Type: String
     *
     * @see OperationType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of operation that was requested. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN, TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER, CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK
     *
     * @param type The type of operation that was requested. <p>Type: String
     *
     * @see OperationType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of operation that was requested. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN, TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER, CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK
     *
     * @param type The type of operation that was requested. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OperationType
     */
    public GetOperationDetailResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of operation that was requested. <p>Type: String
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN, TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER, CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK
     *
     * @param type The type of operation that was requested. <p>Type: String
     *
     * @see OperationType
     */
    public void setType(OperationType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of operation that was requested. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTER_DOMAIN, DELETE_DOMAIN, TRANSFER_IN_DOMAIN, UPDATE_DOMAIN_CONTACT, UPDATE_NAMESERVER, CHANGE_PRIVACY_PROTECTION, DOMAIN_LOCK
     *
     * @param type The type of operation that was requested. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OperationType
     */
    public GetOperationDetailResult withType(OperationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The date when the request was submitted.
     *
     * @return The date when the request was submitted.
     */
    public java.util.Date getSubmittedDate() {
        return submittedDate;
    }
    
    /**
     * The date when the request was submitted.
     *
     * @param submittedDate The date when the request was submitted.
     */
    public void setSubmittedDate(java.util.Date submittedDate) {
        this.submittedDate = submittedDate;
    }
    
    /**
     * The date when the request was submitted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param submittedDate The date when the request was submitted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOperationDetailResult withSubmittedDate(java.util.Date submittedDate) {
        this.submittedDate = submittedDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOperationId() != null) sb.append("OperationId: " + getOperationId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getSubmittedDate() != null) sb.append("SubmittedDate: " + getSubmittedDate() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetOperationDetailResult == false) return false;
        GetOperationDetailResult other = (GetOperationDetailResult)obj;
        
        if (other.getOperationId() == null ^ this.getOperationId() == null) return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getSubmittedDate() == null ^ this.getSubmittedDate() == null) return false;
        if (other.getSubmittedDate() != null && other.getSubmittedDate().equals(this.getSubmittedDate()) == false) return false; 
        return true;
    }
    
}
    