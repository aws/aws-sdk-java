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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed data of the sync blocker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/SyncBlocker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncBlocker implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The contexts for the sync blocker.
     * </p>
     */
    private java.util.List<SyncBlockerContext> contexts;
    /**
     * <p>
     * The time when the sync blocker was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The reason why the sync blocker was created.
     * </p>
     */
    private String createdReason;
    /**
     * <p>
     * The ID of the sync blocker.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time the sync blocker was resolved.
     * </p>
     */
    private java.util.Date resolvedAt;
    /**
     * <p>
     * The reason the sync blocker was resolved.
     * </p>
     */
    private String resolvedReason;
    /**
     * <p>
     * The status of the sync blocker.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the sync blocker.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The contexts for the sync blocker.
     * </p>
     * 
     * @return The contexts for the sync blocker.
     */

    public java.util.List<SyncBlockerContext> getContexts() {
        return contexts;
    }

    /**
     * <p>
     * The contexts for the sync blocker.
     * </p>
     * 
     * @param contexts
     *        The contexts for the sync blocker.
     */

    public void setContexts(java.util.Collection<SyncBlockerContext> contexts) {
        if (contexts == null) {
            this.contexts = null;
            return;
        }

        this.contexts = new java.util.ArrayList<SyncBlockerContext>(contexts);
    }

    /**
     * <p>
     * The contexts for the sync blocker.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContexts(java.util.Collection)} or {@link #withContexts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contexts
     *        The contexts for the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withContexts(SyncBlockerContext... contexts) {
        if (this.contexts == null) {
            setContexts(new java.util.ArrayList<SyncBlockerContext>(contexts.length));
        }
        for (SyncBlockerContext ele : contexts) {
            this.contexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contexts for the sync blocker.
     * </p>
     * 
     * @param contexts
     *        The contexts for the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withContexts(java.util.Collection<SyncBlockerContext> contexts) {
        setContexts(contexts);
        return this;
    }

    /**
     * <p>
     * The time when the sync blocker was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the sync blocker was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the sync blocker was created.
     * </p>
     * 
     * @return The time when the sync blocker was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the sync blocker was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the sync blocker was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The reason why the sync blocker was created.
     * </p>
     * 
     * @param createdReason
     *        The reason why the sync blocker was created.
     */

    public void setCreatedReason(String createdReason) {
        this.createdReason = createdReason;
    }

    /**
     * <p>
     * The reason why the sync blocker was created.
     * </p>
     * 
     * @return The reason why the sync blocker was created.
     */

    public String getCreatedReason() {
        return this.createdReason;
    }

    /**
     * <p>
     * The reason why the sync blocker was created.
     * </p>
     * 
     * @param createdReason
     *        The reason why the sync blocker was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withCreatedReason(String createdReason) {
        setCreatedReason(createdReason);
        return this;
    }

    /**
     * <p>
     * The ID of the sync blocker.
     * </p>
     * 
     * @param id
     *        The ID of the sync blocker.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the sync blocker.
     * </p>
     * 
     * @return The ID of the sync blocker.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the sync blocker.
     * </p>
     * 
     * @param id
     *        The ID of the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time the sync blocker was resolved.
     * </p>
     * 
     * @param resolvedAt
     *        The time the sync blocker was resolved.
     */

    public void setResolvedAt(java.util.Date resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    /**
     * <p>
     * The time the sync blocker was resolved.
     * </p>
     * 
     * @return The time the sync blocker was resolved.
     */

    public java.util.Date getResolvedAt() {
        return this.resolvedAt;
    }

    /**
     * <p>
     * The time the sync blocker was resolved.
     * </p>
     * 
     * @param resolvedAt
     *        The time the sync blocker was resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withResolvedAt(java.util.Date resolvedAt) {
        setResolvedAt(resolvedAt);
        return this;
    }

    /**
     * <p>
     * The reason the sync blocker was resolved.
     * </p>
     * 
     * @param resolvedReason
     *        The reason the sync blocker was resolved.
     */

    public void setResolvedReason(String resolvedReason) {
        this.resolvedReason = resolvedReason;
    }

    /**
     * <p>
     * The reason the sync blocker was resolved.
     * </p>
     * 
     * @return The reason the sync blocker was resolved.
     */

    public String getResolvedReason() {
        return this.resolvedReason;
    }

    /**
     * <p>
     * The reason the sync blocker was resolved.
     * </p>
     * 
     * @param resolvedReason
     *        The reason the sync blocker was resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withResolvedReason(String resolvedReason) {
        setResolvedReason(resolvedReason);
        return this;
    }

    /**
     * <p>
     * The status of the sync blocker.
     * </p>
     * 
     * @param status
     *        The status of the sync blocker.
     * @see BlockerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the sync blocker.
     * </p>
     * 
     * @return The status of the sync blocker.
     * @see BlockerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the sync blocker.
     * </p>
     * 
     * @param status
     *        The status of the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockerStatus
     */

    public SyncBlocker withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the sync blocker.
     * </p>
     * 
     * @param status
     *        The status of the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockerStatus
     */

    public SyncBlocker withStatus(BlockerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the sync blocker.
     * </p>
     * 
     * @param type
     *        The type of the sync blocker.
     * @see BlockerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the sync blocker.
     * </p>
     * 
     * @return The type of the sync blocker.
     * @see BlockerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the sync blocker.
     * </p>
     * 
     * @param type
     *        The type of the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockerType
     */

    public SyncBlocker withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the sync blocker.
     * </p>
     * 
     * @param type
     *        The type of the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockerType
     */

    public SyncBlocker withType(BlockerType type) {
        this.type = type.toString();
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
        if (getContexts() != null)
            sb.append("Contexts: ").append(getContexts()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedReason() != null)
            sb.append("CreatedReason: ").append(getCreatedReason()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getResolvedAt() != null)
            sb.append("ResolvedAt: ").append(getResolvedAt()).append(",");
        if (getResolvedReason() != null)
            sb.append("ResolvedReason: ").append(getResolvedReason()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncBlocker == false)
            return false;
        SyncBlocker other = (SyncBlocker) obj;
        if (other.getContexts() == null ^ this.getContexts() == null)
            return false;
        if (other.getContexts() != null && other.getContexts().equals(this.getContexts()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedReason() == null ^ this.getCreatedReason() == null)
            return false;
        if (other.getCreatedReason() != null && other.getCreatedReason().equals(this.getCreatedReason()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResolvedAt() == null ^ this.getResolvedAt() == null)
            return false;
        if (other.getResolvedAt() != null && other.getResolvedAt().equals(this.getResolvedAt()) == false)
            return false;
        if (other.getResolvedReason() == null ^ this.getResolvedReason() == null)
            return false;
        if (other.getResolvedReason() != null && other.getResolvedReason().equals(this.getResolvedReason()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContexts() == null) ? 0 : getContexts().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedReason() == null) ? 0 : getCreatedReason().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResolvedAt() == null) ? 0 : getResolvedAt().hashCode());
        hashCode = prime * hashCode + ((getResolvedReason() == null) ? 0 : getResolvedReason().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SyncBlocker clone() {
        try {
            return (SyncBlocker) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.SyncBlockerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
