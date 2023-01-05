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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detail data for a repository sync attempt activated by a push to a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/RepositorySyncAttempt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositorySyncAttempt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Detail data for sync attempt events.
     * </p>
     */
    private java.util.List<RepositorySyncEvent> events;
    /**
     * <p>
     * The time when the sync attempt started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The sync attempt status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Detail data for sync attempt events.
     * </p>
     * 
     * @return Detail data for sync attempt events.
     */

    public java.util.List<RepositorySyncEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * Detail data for sync attempt events.
     * </p>
     * 
     * @param events
     *        Detail data for sync attempt events.
     */

    public void setEvents(java.util.Collection<RepositorySyncEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<RepositorySyncEvent>(events);
    }

    /**
     * <p>
     * Detail data for sync attempt events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        Detail data for sync attempt events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncAttempt withEvents(RepositorySyncEvent... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<RepositorySyncEvent>(events.length));
        }
        for (RepositorySyncEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Detail data for sync attempt events.
     * </p>
     * 
     * @param events
     *        Detail data for sync attempt events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncAttempt withEvents(java.util.Collection<RepositorySyncEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The time when the sync attempt started.
     * </p>
     * 
     * @param startedAt
     *        The time when the sync attempt started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time when the sync attempt started.
     * </p>
     * 
     * @return The time when the sync attempt started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time when the sync attempt started.
     * </p>
     * 
     * @param startedAt
     *        The time when the sync attempt started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncAttempt withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The sync attempt status.
     * </p>
     * 
     * @param status
     *        The sync attempt status.
     * @see RepositorySyncStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The sync attempt status.
     * </p>
     * 
     * @return The sync attempt status.
     * @see RepositorySyncStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The sync attempt status.
     * </p>
     * 
     * @param status
     *        The sync attempt status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositorySyncStatus
     */

    public RepositorySyncAttempt withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The sync attempt status.
     * </p>
     * 
     * @param status
     *        The sync attempt status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositorySyncStatus
     */

    public RepositorySyncAttempt withStatus(RepositorySyncStatus status) {
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
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

        if (obj instanceof RepositorySyncAttempt == false)
            return false;
        RepositorySyncAttempt other = (RepositorySyncAttempt) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
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

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RepositorySyncAttempt clone() {
        try {
            return (RepositorySyncAttempt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.RepositorySyncAttemptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
