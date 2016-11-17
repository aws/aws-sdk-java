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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed information about a ProvisionedProduct object.
 * </p>
 */
public class ProvisionedProductDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The user-friendly name of the ProvisionedProduct object.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN associated with the ProvisionedProduct object.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of the ProvisionedProduct object.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The current status of the ProvisionedProduct.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The current status message of the ProvisionedProduct.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * A token to disambiguate duplicate requests. You can create multiple resources using the same input in multiple
     * requests, provided that you also specify a different idempotency token for each request.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * The record identifier of the last request performed on this ProvisionedProduct object.
     * </p>
     */
    private String lastRecordId;

    /**
     * <p>
     * The user-friendly name of the ProvisionedProduct object.
     * </p>
     * 
     * @param name
     *        The user-friendly name of the ProvisionedProduct object.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-friendly name of the ProvisionedProduct object.
     * </p>
     * 
     * @return The user-friendly name of the ProvisionedProduct object.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user-friendly name of the ProvisionedProduct object.
     * </p>
     * 
     * @param name
     *        The user-friendly name of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN associated with the ProvisionedProduct object.
     * </p>
     * 
     * @param arn
     *        The ARN associated with the ProvisionedProduct object.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN associated with the ProvisionedProduct object.
     * </p>
     * 
     * @return The ARN associated with the ProvisionedProduct object.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN associated with the ProvisionedProduct object.
     * </p>
     * 
     * @param arn
     *        The ARN associated with the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of the ProvisionedProduct object.
     * </p>
     * 
     * @param type
     *        The type of the ProvisionedProduct object.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the ProvisionedProduct object.
     * </p>
     * 
     * @return The type of the ProvisionedProduct object.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the ProvisionedProduct object.
     * </p>
     * 
     * @param type
     *        The type of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @param id
     *        The identifier of the ProvisionedProduct object.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @return The identifier of the ProvisionedProduct object.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @param id
     *        The identifier of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The current status of the ProvisionedProduct.
     * </p>
     * 
     * @param status
     *        The current status of the ProvisionedProduct.
     * @see RecordStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the ProvisionedProduct.
     * </p>
     * 
     * @return The current status of the ProvisionedProduct.
     * @see RecordStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the ProvisionedProduct.
     * </p>
     * 
     * @param status
     *        The current status of the ProvisionedProduct.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordStatus
     */

    public ProvisionedProductDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the ProvisionedProduct.
     * </p>
     * 
     * @param status
     *        The current status of the ProvisionedProduct.
     * @see RecordStatus
     */

    public void setStatus(RecordStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the ProvisionedProduct.
     * </p>
     * 
     * @param status
     *        The current status of the ProvisionedProduct.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordStatus
     */

    public ProvisionedProductDetail withStatus(RecordStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status message of the ProvisionedProduct.
     * </p>
     * 
     * @param statusMessage
     *        The current status message of the ProvisionedProduct.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The current status message of the ProvisionedProduct.
     * </p>
     * 
     * @return The current status message of the ProvisionedProduct.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The current status message of the ProvisionedProduct.
     * </p>
     * 
     * @param statusMessage
     *        The current status message of the ProvisionedProduct.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductDetail withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC timestamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @return The UTC timestamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC timestamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductDetail withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can create multiple resources using the same input in multiple
     * requests, provided that you also specify a different idempotency token for each request.
     * </p>
     * 
     * @param idempotencyToken
     *        A token to disambiguate duplicate requests. You can create multiple resources using the same input in
     *        multiple requests, provided that you also specify a different idempotency token for each request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can create multiple resources using the same input in multiple
     * requests, provided that you also specify a different idempotency token for each request.
     * </p>
     * 
     * @return A token to disambiguate duplicate requests. You can create multiple resources using the same input in
     *         multiple requests, provided that you also specify a different idempotency token for each request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can create multiple resources using the same input in multiple
     * requests, provided that you also specify a different idempotency token for each request.
     * </p>
     * 
     * @param idempotencyToken
     *        A token to disambiguate duplicate requests. You can create multiple resources using the same input in
     *        multiple requests, provided that you also specify a different idempotency token for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductDetail withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this ProvisionedProduct object.
     * </p>
     * 
     * @param lastRecordId
     *        The record identifier of the last request performed on this ProvisionedProduct object.
     */

    public void setLastRecordId(String lastRecordId) {
        this.lastRecordId = lastRecordId;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this ProvisionedProduct object.
     * </p>
     * 
     * @return The record identifier of the last request performed on this ProvisionedProduct object.
     */

    public String getLastRecordId() {
        return this.lastRecordId;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this ProvisionedProduct object.
     * </p>
     * 
     * @param lastRecordId
     *        The record identifier of the last request performed on this ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedProductDetail withLastRecordId(String lastRecordId) {
        setLastRecordId(lastRecordId);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken() + ",");
        if (getLastRecordId() != null)
            sb.append("LastRecordId: " + getLastRecordId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedProductDetail == false)
            return false;
        ProvisionedProductDetail other = (ProvisionedProductDetail) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getLastRecordId() == null ^ this.getLastRecordId() == null)
            return false;
        if (other.getLastRecordId() != null && other.getLastRecordId().equals(this.getLastRecordId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getLastRecordId() == null) ? 0 : getLastRecordId().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedProductDetail clone() {
        try {
            return (ProvisionedProductDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
