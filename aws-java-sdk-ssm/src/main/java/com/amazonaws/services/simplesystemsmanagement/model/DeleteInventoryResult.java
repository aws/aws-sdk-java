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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteInventory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInventoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Every <code>DeleteInventory</code> action is assigned a unique ID. This option returns a unique ID. You can use
     * this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has
     * completed before you begin other actions.
     * </p>
     */
    private String deletionId;
    /**
     * <p>
     * The name of the inventory data type specified in the request.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * A summary of the delete operation. For more information about this summary, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     * >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private InventoryDeletionSummary deletionSummary;

    /**
     * <p>
     * Every <code>DeleteInventory</code> action is assigned a unique ID. This option returns a unique ID. You can use
     * this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has
     * completed before you begin other actions.
     * </p>
     * 
     * @param deletionId
     *        Every <code>DeleteInventory</code> action is assigned a unique ID. This option returns a unique ID. You
     *        can use this ID to query the status of a delete operation. This option is useful for ensuring that a
     *        delete operation has completed before you begin other actions.
     */

    public void setDeletionId(String deletionId) {
        this.deletionId = deletionId;
    }

    /**
     * <p>
     * Every <code>DeleteInventory</code> action is assigned a unique ID. This option returns a unique ID. You can use
     * this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has
     * completed before you begin other actions.
     * </p>
     * 
     * @return Every <code>DeleteInventory</code> action is assigned a unique ID. This option returns a unique ID. You
     *         can use this ID to query the status of a delete operation. This option is useful for ensuring that a
     *         delete operation has completed before you begin other actions.
     */

    public String getDeletionId() {
        return this.deletionId;
    }

    /**
     * <p>
     * Every <code>DeleteInventory</code> action is assigned a unique ID. This option returns a unique ID. You can use
     * this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has
     * completed before you begin other actions.
     * </p>
     * 
     * @param deletionId
     *        Every <code>DeleteInventory</code> action is assigned a unique ID. This option returns a unique ID. You
     *        can use this ID to query the status of a delete operation. This option is useful for ensuring that a
     *        delete operation has completed before you begin other actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInventoryResult withDeletionId(String deletionId) {
        setDeletionId(deletionId);
        return this;
    }

    /**
     * <p>
     * The name of the inventory data type specified in the request.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory data type specified in the request.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the inventory data type specified in the request.
     * </p>
     * 
     * @return The name of the inventory data type specified in the request.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the inventory data type specified in the request.
     * </p>
     * 
     * @param typeName
     *        The name of the inventory data type specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInventoryResult withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * A summary of the delete operation. For more information about this summary, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     * >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param deletionSummary
     *        A summary of the delete operation. For more information about this summary, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     *        >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setDeletionSummary(InventoryDeletionSummary deletionSummary) {
        this.deletionSummary = deletionSummary;
    }

    /**
     * <p>
     * A summary of the delete operation. For more information about this summary, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     * >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return A summary of the delete operation. For more information about this summary, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     *         >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public InventoryDeletionSummary getDeletionSummary() {
        return this.deletionSummary;
    }

    /**
     * <p>
     * A summary of the delete operation. For more information about this summary, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     * >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param deletionSummary
     *        A summary of the delete operation. For more information about this summary, see <a href=
     *        "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-delete.html#sysman-inventory-delete-summary"
     *        >Understanding the Delete Inventory Summary</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInventoryResult withDeletionSummary(InventoryDeletionSummary deletionSummary) {
        setDeletionSummary(deletionSummary);
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
        if (getDeletionSummary() != null)
            sb.append("DeletionSummary: ").append(getDeletionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInventoryResult == false)
            return false;
        DeleteInventoryResult other = (DeleteInventoryResult) obj;
        if (other.getDeletionId() == null ^ this.getDeletionId() == null)
            return false;
        if (other.getDeletionId() != null && other.getDeletionId().equals(this.getDeletionId()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getDeletionSummary() == null ^ this.getDeletionSummary() == null)
            return false;
        if (other.getDeletionSummary() != null && other.getDeletionSummary().equals(this.getDeletionSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletionId() == null) ? 0 : getDeletionId().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getDeletionSummary() == null) ? 0 : getDeletionSummary().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInventoryResult clone() {
        try {
            return (DeleteInventoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
