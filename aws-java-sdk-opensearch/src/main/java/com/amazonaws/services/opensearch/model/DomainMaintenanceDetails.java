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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for the domain maintenance details.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainMaintenanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the requested action.
     * </p>
     */
    private String maintenanceId;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The name of the action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The ID of the data node.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for the action.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The time at which the action was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time at which the action was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ID of the requested action.
     * </p>
     * 
     * @param maintenanceId
     *        The ID of the requested action.
     */

    public void setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    /**
     * <p>
     * The ID of the requested action.
     * </p>
     * 
     * @return The ID of the requested action.
     */

    public String getMaintenanceId() {
        return this.maintenanceId;
    }

    /**
     * <p>
     * The ID of the requested action.
     * </p>
     * 
     * @param maintenanceId
     *        The ID of the requested action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMaintenanceDetails withMaintenanceId(String maintenanceId) {
        setMaintenanceId(maintenanceId);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMaintenanceDetails withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @see MaintenanceType
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @return The name of the action.
     * @see MaintenanceType
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceType
     */

    public DomainMaintenanceDetails withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceType
     */

    public DomainMaintenanceDetails withAction(MaintenanceType action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the data node.
     * </p>
     * 
     * @param nodeId
     *        The ID of the data node.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The ID of the data node.
     * </p>
     * 
     * @return The ID of the data node.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The ID of the data node.
     * </p>
     * 
     * @param nodeId
     *        The ID of the data node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMaintenanceDetails withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see MaintenanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see MaintenanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceStatus
     */

    public DomainMaintenanceDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceStatus
     */

    public DomainMaintenanceDetails withStatus(MaintenanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the action.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the action.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the action.
     * </p>
     * 
     * @return The status message for the action.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the action.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMaintenanceDetails withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The time at which the action was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the action was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the action was created.
     * </p>
     * 
     * @return The time at which the action was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the action was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the action was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMaintenanceDetails withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time at which the action was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the action was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the action was updated.
     * </p>
     * 
     * @return The time at which the action was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the action was updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the action was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMaintenanceDetails withUpdatedAt(java.util.Date updatedAt) {
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
        if (getMaintenanceId() != null)
            sb.append("MaintenanceId: ").append(getMaintenanceId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
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

        if (obj instanceof DomainMaintenanceDetails == false)
            return false;
        DomainMaintenanceDetails other = (DomainMaintenanceDetails) obj;
        if (other.getMaintenanceId() == null ^ this.getMaintenanceId() == null)
            return false;
        if (other.getMaintenanceId() != null && other.getMaintenanceId().equals(this.getMaintenanceId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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

        hashCode = prime * hashCode + ((getMaintenanceId() == null) ? 0 : getMaintenanceId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DomainMaintenanceDetails clone() {
        try {
            return (DomainMaintenanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DomainMaintenanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
