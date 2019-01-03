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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status information returned by the <code>DeleteInventory</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryDeletionStatusItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryDeletionStatusItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The deletion ID returned by the <code>DeleteInventory</code> action.
     * </p>
     */
    private String deletionId;
    /**
     * <p>
     * The name of the inventory data type.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The UTC timestamp when the delete operation started.
     * </p>
     */
    private java.util.Date deletionStartTime;
    /**
     * <p>
     * The status of the operation. Possible values are InProgress and Complete.
     * </p>
     */
    private String lastStatus;
    /**
     * <p>
     * Information about the status.
     * </p>
     */
    private String lastStatusMessage;
    /**
     * <p>
     * Information about the delete operation. For more information about this summary, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     * >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private InventoryDeletionSummary deletionSummary;
    /**
     * <p>
     * The UTC timestamp of when the last status report.
     * </p>
     */
    private java.util.Date lastStatusUpdateTime;

    /**
     * <p>
     * The deletion ID returned by the <code>DeleteInventory</code> action.
     * </p>
     * 
     * @param deletionId
     *        The deletion ID returned by the <code>DeleteInventory</code> action.
     */

    public void setDeletionId(String deletionId) {
        this.deletionId = deletionId;
    }

    /**
     * <p>
     * The deletion ID returned by the <code>DeleteInventory</code> action.
     * </p>
     * 
     * @return The deletion ID returned by the <code>DeleteInventory</code> action.
     */

    public String getDeletionId() {
        return this.deletionId;
    }

    /**
     * <p>
     * The deletion ID returned by the <code>DeleteInventory</code> action.
     * </p>
     * 
     * @param deletionId
     *        The deletion ID returned by the <code>DeleteInventory</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionStatusItem withDeletionId(String deletionId) {
        setDeletionId(deletionId);
        return this;
    }

    /**
     * <p>
     * The name of the inventory data type.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory data type.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the inventory data type.
     * </p>
     * 
     * @return The name of the inventory data type.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the inventory data type.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionStatusItem withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The UTC timestamp when the delete operation started.
     * </p>
     * 
     * @param deletionStartTime
     *        The UTC timestamp when the delete operation started.
     */

    public void setDeletionStartTime(java.util.Date deletionStartTime) {
        this.deletionStartTime = deletionStartTime;
    }

    /**
     * <p>
     * The UTC timestamp when the delete operation started.
     * </p>
     * 
     * @return The UTC timestamp when the delete operation started.
     */

    public java.util.Date getDeletionStartTime() {
        return this.deletionStartTime;
    }

    /**
     * <p>
     * The UTC timestamp when the delete operation started.
     * </p>
     * 
     * @param deletionStartTime
     *        The UTC timestamp when the delete operation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionStatusItem withDeletionStartTime(java.util.Date deletionStartTime) {
        setDeletionStartTime(deletionStartTime);
        return this;
    }

    /**
     * <p>
     * The status of the operation. Possible values are InProgress and Complete.
     * </p>
     * 
     * @param lastStatus
     *        The status of the operation. Possible values are InProgress and Complete.
     * @see InventoryDeletionStatus
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The status of the operation. Possible values are InProgress and Complete.
     * </p>
     * 
     * @return The status of the operation. Possible values are InProgress and Complete.
     * @see InventoryDeletionStatus
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * The status of the operation. Possible values are InProgress and Complete.
     * </p>
     * 
     * @param lastStatus
     *        The status of the operation. Possible values are InProgress and Complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InventoryDeletionStatus
     */

    public InventoryDeletionStatusItem withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * The status of the operation. Possible values are InProgress and Complete.
     * </p>
     * 
     * @param lastStatus
     *        The status of the operation. Possible values are InProgress and Complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InventoryDeletionStatus
     */

    public InventoryDeletionStatusItem withLastStatus(InventoryDeletionStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
        return this;
    }

    /**
     * <p>
     * Information about the status.
     * </p>
     * 
     * @param lastStatusMessage
     *        Information about the status.
     */

    public void setLastStatusMessage(String lastStatusMessage) {
        this.lastStatusMessage = lastStatusMessage;
    }

    /**
     * <p>
     * Information about the status.
     * </p>
     * 
     * @return Information about the status.
     */

    public String getLastStatusMessage() {
        return this.lastStatusMessage;
    }

    /**
     * <p>
     * Information about the status.
     * </p>
     * 
     * @param lastStatusMessage
     *        Information about the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionStatusItem withLastStatusMessage(String lastStatusMessage) {
        setLastStatusMessage(lastStatusMessage);
        return this;
    }

    /**
     * <p>
     * Information about the delete operation. For more information about this summary, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     * >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param deletionSummary
     *        Information about the delete operation. For more information about this summary, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     *        >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setDeletionSummary(InventoryDeletionSummary deletionSummary) {
        this.deletionSummary = deletionSummary;
    }

    /**
     * <p>
     * Information about the delete operation. For more information about this summary, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     * >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return Information about the delete operation. For more information about this summary, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     *         >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public InventoryDeletionSummary getDeletionSummary() {
        return this.deletionSummary;
    }

    /**
     * <p>
     * Information about the delete operation. For more information about this summary, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     * >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param deletionSummary
     *        Information about the delete operation. For more information about this summary, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     *        >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionStatusItem withDeletionSummary(InventoryDeletionSummary deletionSummary) {
        setDeletionSummary(deletionSummary);
        return this;
    }

    /**
     * <p>
     * The UTC timestamp of when the last status report.
     * </p>
     * 
     * @param lastStatusUpdateTime
     *        The UTC timestamp of when the last status report.
     */

    public void setLastStatusUpdateTime(java.util.Date lastStatusUpdateTime) {
        this.lastStatusUpdateTime = lastStatusUpdateTime;
    }

    /**
     * <p>
     * The UTC timestamp of when the last status report.
     * </p>
     * 
     * @return The UTC timestamp of when the last status report.
     */

    public java.util.Date getLastStatusUpdateTime() {
        return this.lastStatusUpdateTime;
    }

    /**
     * <p>
     * The UTC timestamp of when the last status report.
     * </p>
     * 
     * @param lastStatusUpdateTime
     *        The UTC timestamp of when the last status report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionStatusItem withLastStatusUpdateTime(java.util.Date lastStatusUpdateTime) {
        setLastStatusUpdateTime(lastStatusUpdateTime);
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
        if (getDeletionId() != null)
            sb.append("DeletionId: ").append(getDeletionId()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getDeletionStartTime() != null)
            sb.append("DeletionStartTime: ").append(getDeletionStartTime()).append(",");
        if (getLastStatus() != null)
            sb.append("LastStatus: ").append(getLastStatus()).append(",");
        if (getLastStatusMessage() != null)
            sb.append("LastStatusMessage: ").append(getLastStatusMessage()).append(",");
        if (getDeletionSummary() != null)
            sb.append("DeletionSummary: ").append(getDeletionSummary()).append(",");
        if (getLastStatusUpdateTime() != null)
            sb.append("LastStatusUpdateTime: ").append(getLastStatusUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryDeletionStatusItem == false)
            return false;
        InventoryDeletionStatusItem other = (InventoryDeletionStatusItem) obj;
        if (other.getDeletionId() == null ^ this.getDeletionId() == null)
            return false;
        if (other.getDeletionId() != null && other.getDeletionId().equals(this.getDeletionId()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getDeletionStartTime() == null ^ this.getDeletionStartTime() == null)
            return false;
        if (other.getDeletionStartTime() != null && other.getDeletionStartTime().equals(this.getDeletionStartTime()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getLastStatusMessage() == null ^ this.getLastStatusMessage() == null)
            return false;
        if (other.getLastStatusMessage() != null && other.getLastStatusMessage().equals(this.getLastStatusMessage()) == false)
            return false;
        if (other.getDeletionSummary() == null ^ this.getDeletionSummary() == null)
            return false;
        if (other.getDeletionSummary() != null && other.getDeletionSummary().equals(this.getDeletionSummary()) == false)
            return false;
        if (other.getLastStatusUpdateTime() == null ^ this.getLastStatusUpdateTime() == null)
            return false;
        if (other.getLastStatusUpdateTime() != null && other.getLastStatusUpdateTime().equals(this.getLastStatusUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletionId() == null) ? 0 : getDeletionId().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getDeletionStartTime() == null) ? 0 : getDeletionStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getLastStatusMessage() == null) ? 0 : getLastStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDeletionSummary() == null) ? 0 : getDeletionSummary().hashCode());
        hashCode = prime * hashCode + ((getLastStatusUpdateTime() == null) ? 0 : getLastStatusUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public InventoryDeletionStatusItem clone() {
        try {
            return (InventoryDeletionStatusItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InventoryDeletionStatusItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
