/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the properties of an alert manager definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/AlertManagerDefinitionDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlertManagerDefinitionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the alert manager definition was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The alert manager definition.
     * </p>
     */
    private java.nio.ByteBuffer data;
    /**
     * <p>
     * The time when the alert manager definition was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The status of alert manager definition.
     * </p>
     */
    private AlertManagerDefinitionStatus status;

    /**
     * <p>
     * The time when the alert manager definition was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the alert manager definition was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the alert manager definition was created.
     * </p>
     * 
     * @return The time when the alert manager definition was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the alert manager definition was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the alert manager definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertManagerDefinitionDescription withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The alert manager definition.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param data
     *        The alert manager definition.
     */

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The alert manager definition.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The alert manager definition.
     */

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    /**
     * <p>
     * The alert manager definition.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param data
     *        The alert manager definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertManagerDefinitionDescription withData(java.nio.ByteBuffer data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The time when the alert manager definition was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time when the alert manager definition was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time when the alert manager definition was modified.
     * </p>
     * 
     * @return The time when the alert manager definition was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time when the alert manager definition was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time when the alert manager definition was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertManagerDefinitionDescription withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The status of alert manager definition.
     * </p>
     * 
     * @param status
     *        The status of alert manager definition.
     */

    public void setStatus(AlertManagerDefinitionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of alert manager definition.
     * </p>
     * 
     * @return The status of alert manager definition.
     */

    public AlertManagerDefinitionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of alert manager definition.
     * </p>
     * 
     * @param status
     *        The status of alert manager definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertManagerDefinitionDescription withStatus(AlertManagerDefinitionStatus status) {
        setStatus(status);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
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

        if (obj instanceof AlertManagerDefinitionDescription == false)
            return false;
        AlertManagerDefinitionDescription other = (AlertManagerDefinitionDescription) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AlertManagerDefinitionDescription clone() {
        try {
            return (AlertManagerDefinitionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.AlertManagerDefinitionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
