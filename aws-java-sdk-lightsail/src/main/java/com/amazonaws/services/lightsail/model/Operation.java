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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Operation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Operation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the operation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The resource name.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The timestamp when the operation was initialized (e.g., <code>1479816991.349</code>).
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The region and Availability Zone.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     */
    private Boolean isTerminal;
    /**
     * <p>
     * Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * </p>
     */
    private String operationDetails;
    /**
     * <p>
     * The type of operation.
     * </p>
     */
    private String operationType;
    /**
     * <p>
     * The status of the operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp when the status was changed (e.g., <code>1479816991.349</code>).
     * </p>
     */
    private java.util.Date statusChangedAt;
    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error details.
     * </p>
     */
    private String errorDetails;

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * 
     * @param id
     *        The ID of the operation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * 
     * @return The ID of the operation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * 
     * @param id
     *        The ID of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @return The resource name.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * 
     * @param resourceName
     *        The resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Operation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Operation withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the operation was initialized (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the operation was initialized (e.g., <code>1479816991.349</code>).
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the operation was initialized (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @return The timestamp when the operation was initialized (e.g., <code>1479816991.349</code>).
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the operation was initialized (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the operation was initialized (e.g., <code>1479816991.349</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The region and Availability Zone.
     * </p>
     * 
     * @param location
     *        The region and Availability Zone.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The region and Availability Zone.
     * </p>
     * 
     * @return The region and Availability Zone.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The region and Availability Zone.
     * </p>
     * 
     * @param location
     *        The region and Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     * 
     * @param isTerminal
     *        A Boolean value indicating whether the operation is terminal.
     */

    public void setIsTerminal(Boolean isTerminal) {
        this.isTerminal = isTerminal;
    }

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     * 
     * @return A Boolean value indicating whether the operation is terminal.
     */

    public Boolean getIsTerminal() {
        return this.isTerminal;
    }

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     * 
     * @param isTerminal
     *        A Boolean value indicating whether the operation is terminal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withIsTerminal(Boolean isTerminal) {
        setIsTerminal(isTerminal);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     * 
     * @return A Boolean value indicating whether the operation is terminal.
     */

    public Boolean isTerminal() {
        return this.isTerminal;
    }

    /**
     * <p>
     * Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * </p>
     * 
     * @param operationDetails
     *        Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     */

    public void setOperationDetails(String operationDetails) {
        this.operationDetails = operationDetails;
    }

    /**
     * <p>
     * Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * </p>
     * 
     * @return Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     */

    public String getOperationDetails() {
        return this.operationDetails;
    }

    /**
     * <p>
     * Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * </p>
     * 
     * @param operationDetails
     *        Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withOperationDetails(String operationDetails) {
        setOperationDetails(operationDetails);
        return this;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @param operationType
     *        The type of operation.
     * @see OperationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @return The type of operation.
     * @see OperationType
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @param operationType
     *        The type of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public Operation withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @param operationType
     *        The type of operation.
     * @see OperationType
     */

    public void setOperationType(OperationType operationType) {
        withOperationType(operationType);
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * 
     * @param operationType
     *        The type of operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public Operation withOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @param status
     *        The status of the operation.
     * @see OperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @return The status of the operation.
     * @see OperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @param status
     *        The status of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public Operation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @param status
     *        The status of the operation.
     * @see OperationStatus
     */

    public void setStatus(OperationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * 
     * @param status
     *        The status of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public Operation withStatus(OperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the status was changed (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @param statusChangedAt
     *        The timestamp when the status was changed (e.g., <code>1479816991.349</code>).
     */

    public void setStatusChangedAt(java.util.Date statusChangedAt) {
        this.statusChangedAt = statusChangedAt;
    }

    /**
     * <p>
     * The timestamp when the status was changed (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @return The timestamp when the status was changed (e.g., <code>1479816991.349</code>).
     */

    public java.util.Date getStatusChangedAt() {
        return this.statusChangedAt;
    }

    /**
     * <p>
     * The timestamp when the status was changed (e.g., <code>1479816991.349</code>).
     * </p>
     * 
     * @param statusChangedAt
     *        The timestamp when the status was changed (e.g., <code>1479816991.349</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withStatusChangedAt(java.util.Date statusChangedAt) {
        setStatusChangedAt(statusChangedAt);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error details.
     * </p>
     * 
     * @param errorDetails
     *        The error details.
     */

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * The error details.
     * </p>
     * 
     * @return The error details.
     */

    public String getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * <p>
     * The error details.
     * </p>
     * 
     * @param errorDetails
     *        The error details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withErrorDetails(String errorDetails) {
        setErrorDetails(errorDetails);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getIsTerminal() != null)
            sb.append("IsTerminal: ").append(getIsTerminal()).append(",");
        if (getOperationDetails() != null)
            sb.append("OperationDetails: ").append(getOperationDetails()).append(",");
        if (getOperationType() != null)
            sb.append("OperationType: ").append(getOperationType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusChangedAt() != null)
            sb.append("StatusChangedAt: ").append(getStatusChangedAt()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Operation == false)
            return false;
        Operation other = (Operation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getIsTerminal() == null ^ this.getIsTerminal() == null)
            return false;
        if (other.getIsTerminal() != null && other.getIsTerminal().equals(this.getIsTerminal()) == false)
            return false;
        if (other.getOperationDetails() == null ^ this.getOperationDetails() == null)
            return false;
        if (other.getOperationDetails() != null && other.getOperationDetails().equals(this.getOperationDetails()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusChangedAt() == null ^ this.getStatusChangedAt() == null)
            return false;
        if (other.getStatusChangedAt() != null && other.getStatusChangedAt().equals(this.getStatusChangedAt()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getIsTerminal() == null) ? 0 : getIsTerminal().hashCode());
        hashCode = prime * hashCode + ((getOperationDetails() == null) ? 0 : getOperationDetails().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusChangedAt() == null) ? 0 : getStatusChangedAt().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public Operation clone() {
        try {
            return (Operation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.OperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
