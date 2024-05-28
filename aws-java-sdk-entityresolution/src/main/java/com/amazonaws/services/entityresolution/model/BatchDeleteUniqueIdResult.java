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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/BatchDeleteUniqueId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteUniqueIdResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique IDs that were deleted.
     * </p>
     */
    private java.util.List<DeletedUniqueId> deleted;
    /**
     * <p>
     * The unique IDs that were disconnected.
     * </p>
     */
    private java.util.List<String> disconnectedUniqueIds;
    /**
     * <p>
     * The errors from deleting multiple unique IDs.
     * </p>
     */
    private java.util.List<DeleteUniqueIdError> errors;
    /**
     * <p>
     * The status of the batch delete unique ID operation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique IDs that were deleted.
     * </p>
     * 
     * @return The unique IDs that were deleted.
     */

    public java.util.List<DeletedUniqueId> getDeleted() {
        return deleted;
    }

    /**
     * <p>
     * The unique IDs that were deleted.
     * </p>
     * 
     * @param deleted
     *        The unique IDs that were deleted.
     */

    public void setDeleted(java.util.Collection<DeletedUniqueId> deleted) {
        if (deleted == null) {
            this.deleted = null;
            return;
        }

        this.deleted = new java.util.ArrayList<DeletedUniqueId>(deleted);
    }

    /**
     * <p>
     * The unique IDs that were deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeleted(java.util.Collection)} or {@link #withDeleted(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param deleted
     *        The unique IDs that were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdResult withDeleted(DeletedUniqueId... deleted) {
        if (this.deleted == null) {
            setDeleted(new java.util.ArrayList<DeletedUniqueId>(deleted.length));
        }
        for (DeletedUniqueId ele : deleted) {
            this.deleted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs that were deleted.
     * </p>
     * 
     * @param deleted
     *        The unique IDs that were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdResult withDeleted(java.util.Collection<DeletedUniqueId> deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * The unique IDs that were disconnected.
     * </p>
     * 
     * @return The unique IDs that were disconnected.
     */

    public java.util.List<String> getDisconnectedUniqueIds() {
        return disconnectedUniqueIds;
    }

    /**
     * <p>
     * The unique IDs that were disconnected.
     * </p>
     * 
     * @param disconnectedUniqueIds
     *        The unique IDs that were disconnected.
     */

    public void setDisconnectedUniqueIds(java.util.Collection<String> disconnectedUniqueIds) {
        if (disconnectedUniqueIds == null) {
            this.disconnectedUniqueIds = null;
            return;
        }

        this.disconnectedUniqueIds = new java.util.ArrayList<String>(disconnectedUniqueIds);
    }

    /**
     * <p>
     * The unique IDs that were disconnected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisconnectedUniqueIds(java.util.Collection)} or
     * {@link #withDisconnectedUniqueIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param disconnectedUniqueIds
     *        The unique IDs that were disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdResult withDisconnectedUniqueIds(String... disconnectedUniqueIds) {
        if (this.disconnectedUniqueIds == null) {
            setDisconnectedUniqueIds(new java.util.ArrayList<String>(disconnectedUniqueIds.length));
        }
        for (String ele : disconnectedUniqueIds) {
            this.disconnectedUniqueIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs that were disconnected.
     * </p>
     * 
     * @param disconnectedUniqueIds
     *        The unique IDs that were disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdResult withDisconnectedUniqueIds(java.util.Collection<String> disconnectedUniqueIds) {
        setDisconnectedUniqueIds(disconnectedUniqueIds);
        return this;
    }

    /**
     * <p>
     * The errors from deleting multiple unique IDs.
     * </p>
     * 
     * @return The errors from deleting multiple unique IDs.
     */

    public java.util.List<DeleteUniqueIdError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * The errors from deleting multiple unique IDs.
     * </p>
     * 
     * @param errors
     *        The errors from deleting multiple unique IDs.
     */

    public void setErrors(java.util.Collection<DeleteUniqueIdError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<DeleteUniqueIdError>(errors);
    }

    /**
     * <p>
     * The errors from deleting multiple unique IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        The errors from deleting multiple unique IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdResult withErrors(DeleteUniqueIdError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<DeleteUniqueIdError>(errors.length));
        }
        for (DeleteUniqueIdError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The errors from deleting multiple unique IDs.
     * </p>
     * 
     * @param errors
     *        The errors from deleting multiple unique IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteUniqueIdResult withErrors(java.util.Collection<DeleteUniqueIdError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The status of the batch delete unique ID operation.
     * </p>
     * 
     * @param status
     *        The status of the batch delete unique ID operation.
     * @see DeleteUniqueIdStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the batch delete unique ID operation.
     * </p>
     * 
     * @return The status of the batch delete unique ID operation.
     * @see DeleteUniqueIdStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the batch delete unique ID operation.
     * </p>
     * 
     * @param status
     *        The status of the batch delete unique ID operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteUniqueIdStatus
     */

    public BatchDeleteUniqueIdResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the batch delete unique ID operation.
     * </p>
     * 
     * @param status
     *        The status of the batch delete unique ID operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeleteUniqueIdStatus
     */

    public BatchDeleteUniqueIdResult withStatus(DeleteUniqueIdStatus status) {
        this.status = status.toString();
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
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
        if (getDisconnectedUniqueIds() != null)
            sb.append("DisconnectedUniqueIds: ").append(getDisconnectedUniqueIds()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteUniqueIdResult == false)
            return false;
        BatchDeleteUniqueIdResult other = (BatchDeleteUniqueIdResult) obj;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getDisconnectedUniqueIds() == null ^ this.getDisconnectedUniqueIds() == null)
            return false;
        if (other.getDisconnectedUniqueIds() != null && other.getDisconnectedUniqueIds().equals(this.getDisconnectedUniqueIds()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getDisconnectedUniqueIds() == null) ? 0 : getDisconnectedUniqueIds().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteUniqueIdResult clone() {
        try {
            return (BatchDeleteUniqueIdResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
