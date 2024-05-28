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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a blocker for a sync event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/SyncBlocker" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncBlocker implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for a specific sync blocker.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The sync blocker type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The status for a specific sync blocker.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The provided reason for a specific sync blocker.
     * </p>
     */
    private String createdReason;
    /**
     * <p>
     * The creation time for a specific sync blocker.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The contexts for a specific sync blocker.
     * </p>
     */
    private java.util.List<SyncBlockerContext> contexts;
    /**
     * <p>
     * The resolved reason for a specific sync blocker.
     * </p>
     */
    private String resolvedReason;
    /**
     * <p>
     * The time that a specific sync blocker was resolved.
     * </p>
     */
    private java.util.Date resolvedAt;

    /**
     * <p>
     * The ID for a specific sync blocker.
     * </p>
     * 
     * @param id
     *        The ID for a specific sync blocker.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for a specific sync blocker.
     * </p>
     * 
     * @return The ID for a specific sync blocker.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for a specific sync blocker.
     * </p>
     * 
     * @param id
     *        The ID for a specific sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The sync blocker type.
     * </p>
     * 
     * @param type
     *        The sync blocker type.
     * @see BlockerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The sync blocker type.
     * </p>
     * 
     * @return The sync blocker type.
     * @see BlockerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The sync blocker type.
     * </p>
     * 
     * @param type
     *        The sync blocker type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockerType
     */

    public SyncBlocker withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The sync blocker type.
     * </p>
     * 
     * @param type
     *        The sync blocker type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockerType
     */

    public SyncBlocker withType(BlockerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status for a specific sync blocker.
     * </p>
     * 
     * @param status
     *        The status for a specific sync blocker.
     * @see BlockerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for a specific sync blocker.
     * </p>
     * 
     * @return The status for a specific sync blocker.
     * @see BlockerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for a specific sync blocker.
     * </p>
     * 
     * @param status
     *        The status for a specific sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockerStatus
     */

    public SyncBlocker withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for a specific sync blocker.
     * </p>
     * 
     * @param status
     *        The status for a specific sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlockerStatus
     */

    public SyncBlocker withStatus(BlockerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The provided reason for a specific sync blocker.
     * </p>
     * 
     * @param createdReason
     *        The provided reason for a specific sync blocker.
     */

    public void setCreatedReason(String createdReason) {
        this.createdReason = createdReason;
    }

    /**
     * <p>
     * The provided reason for a specific sync blocker.
     * </p>
     * 
     * @return The provided reason for a specific sync blocker.
     */

    public String getCreatedReason() {
        return this.createdReason;
    }

    /**
     * <p>
     * The provided reason for a specific sync blocker.
     * </p>
     * 
     * @param createdReason
     *        The provided reason for a specific sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withCreatedReason(String createdReason) {
        setCreatedReason(createdReason);
        return this;
    }

    /**
     * <p>
     * The creation time for a specific sync blocker.
     * </p>
     * 
     * @param createdAt
     *        The creation time for a specific sync blocker.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The creation time for a specific sync blocker.
     * </p>
     * 
     * @return The creation time for a specific sync blocker.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The creation time for a specific sync blocker.
     * </p>
     * 
     * @param createdAt
     *        The creation time for a specific sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The contexts for a specific sync blocker.
     * </p>
     * 
     * @return The contexts for a specific sync blocker.
     */

    public java.util.List<SyncBlockerContext> getContexts() {
        return contexts;
    }

    /**
     * <p>
     * The contexts for a specific sync blocker.
     * </p>
     * 
     * @param contexts
     *        The contexts for a specific sync blocker.
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
     * The contexts for a specific sync blocker.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContexts(java.util.Collection)} or {@link #withContexts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contexts
     *        The contexts for a specific sync blocker.
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
     * The contexts for a specific sync blocker.
     * </p>
     * 
     * @param contexts
     *        The contexts for a specific sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withContexts(java.util.Collection<SyncBlockerContext> contexts) {
        setContexts(contexts);
        return this;
    }

    /**
     * <p>
     * The resolved reason for a specific sync blocker.
     * </p>
     * 
     * @param resolvedReason
     *        The resolved reason for a specific sync blocker.
     */

    public void setResolvedReason(String resolvedReason) {
        this.resolvedReason = resolvedReason;
    }

    /**
     * <p>
     * The resolved reason for a specific sync blocker.
     * </p>
     * 
     * @return The resolved reason for a specific sync blocker.
     */

    public String getResolvedReason() {
        return this.resolvedReason;
    }

    /**
     * <p>
     * The resolved reason for a specific sync blocker.
     * </p>
     * 
     * @param resolvedReason
     *        The resolved reason for a specific sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withResolvedReason(String resolvedReason) {
        setResolvedReason(resolvedReason);
        return this;
    }

    /**
     * <p>
     * The time that a specific sync blocker was resolved.
     * </p>
     * 
     * @param resolvedAt
     *        The time that a specific sync blocker was resolved.
     */

    public void setResolvedAt(java.util.Date resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    /**
     * <p>
     * The time that a specific sync blocker was resolved.
     * </p>
     * 
     * @return The time that a specific sync blocker was resolved.
     */

    public java.util.Date getResolvedAt() {
        return this.resolvedAt;
    }

    /**
     * <p>
     * The time that a specific sync blocker was resolved.
     * </p>
     * 
     * @param resolvedAt
     *        The time that a specific sync blocker was resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncBlocker withResolvedAt(java.util.Date resolvedAt) {
        setResolvedAt(resolvedAt);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedReason() != null)
            sb.append("CreatedReason: ").append(getCreatedReason()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getContexts() != null)
            sb.append("Contexts: ").append(getContexts()).append(",");
        if (getResolvedReason() != null)
            sb.append("ResolvedReason: ").append(getResolvedReason()).append(",");
        if (getResolvedAt() != null)
            sb.append("ResolvedAt: ").append(getResolvedAt());
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedReason() == null ^ this.getCreatedReason() == null)
            return false;
        if (other.getCreatedReason() != null && other.getCreatedReason().equals(this.getCreatedReason()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getContexts() == null ^ this.getContexts() == null)
            return false;
        if (other.getContexts() != null && other.getContexts().equals(this.getContexts()) == false)
            return false;
        if (other.getResolvedReason() == null ^ this.getResolvedReason() == null)
            return false;
        if (other.getResolvedReason() != null && other.getResolvedReason().equals(this.getResolvedReason()) == false)
            return false;
        if (other.getResolvedAt() == null ^ this.getResolvedAt() == null)
            return false;
        if (other.getResolvedAt() != null && other.getResolvedAt().equals(this.getResolvedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedReason() == null) ? 0 : getCreatedReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getContexts() == null) ? 0 : getContexts().hashCode());
        hashCode = prime * hashCode + ((getResolvedReason() == null) ? 0 : getResolvedReason().hashCode());
        hashCode = prime * hashCode + ((getResolvedAt() == null) ? 0 : getResolvedAt().hashCode());
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
        com.amazonaws.services.codestarconnections.model.transform.SyncBlockerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
