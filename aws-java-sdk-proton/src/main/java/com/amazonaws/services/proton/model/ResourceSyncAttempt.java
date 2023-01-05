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
 * Detail data for a resource sync attempt activated by a push to a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ResourceSyncAttempt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSyncAttempt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of events with detail data.
     * </p>
     */
    private java.util.List<ResourceSyncEvent> events;
    /**
     * <p>
     * Detail data for the initial repository commit, path and push.
     * </p>
     */
    private Revision initialRevision;
    /**
     * <p>
     * The time when the sync attempt started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The status of the sync attempt.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The resource that is synced to.
     * </p>
     */
    private String target;
    /**
     * <p>
     * Detail data for the target revision.
     * </p>
     */
    private Revision targetRevision;

    /**
     * <p>
     * An array of events with detail data.
     * </p>
     * 
     * @return An array of events with detail data.
     */

    public java.util.List<ResourceSyncEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * An array of events with detail data.
     * </p>
     * 
     * @param events
     *        An array of events with detail data.
     */

    public void setEvents(java.util.Collection<ResourceSyncEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<ResourceSyncEvent>(events);
    }

    /**
     * <p>
     * An array of events with detail data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        An array of events with detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withEvents(ResourceSyncEvent... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<ResourceSyncEvent>(events.length));
        }
        for (ResourceSyncEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of events with detail data.
     * </p>
     * 
     * @param events
     *        An array of events with detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withEvents(java.util.Collection<ResourceSyncEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * Detail data for the initial repository commit, path and push.
     * </p>
     * 
     * @param initialRevision
     *        Detail data for the initial repository commit, path and push.
     */

    public void setInitialRevision(Revision initialRevision) {
        this.initialRevision = initialRevision;
    }

    /**
     * <p>
     * Detail data for the initial repository commit, path and push.
     * </p>
     * 
     * @return Detail data for the initial repository commit, path and push.
     */

    public Revision getInitialRevision() {
        return this.initialRevision;
    }

    /**
     * <p>
     * Detail data for the initial repository commit, path and push.
     * </p>
     * 
     * @param initialRevision
     *        Detail data for the initial repository commit, path and push.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withInitialRevision(Revision initialRevision) {
        setInitialRevision(initialRevision);
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

    public ResourceSyncAttempt withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The status of the sync attempt.
     * </p>
     * 
     * @param status
     *        The status of the sync attempt.
     * @see ResourceSyncStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the sync attempt.
     * </p>
     * 
     * @return The status of the sync attempt.
     * @see ResourceSyncStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the sync attempt.
     * </p>
     * 
     * @param status
     *        The status of the sync attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSyncStatus
     */

    public ResourceSyncAttempt withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the sync attempt.
     * </p>
     * 
     * @param status
     *        The status of the sync attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSyncStatus
     */

    public ResourceSyncAttempt withStatus(ResourceSyncStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The resource that is synced to.
     * </p>
     * 
     * @param target
     *        The resource that is synced to.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The resource that is synced to.
     * </p>
     * 
     * @return The resource that is synced to.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The resource that is synced to.
     * </p>
     * 
     * @param target
     *        The resource that is synced to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Detail data for the target revision.
     * </p>
     * 
     * @param targetRevision
     *        Detail data for the target revision.
     */

    public void setTargetRevision(Revision targetRevision) {
        this.targetRevision = targetRevision;
    }

    /**
     * <p>
     * Detail data for the target revision.
     * </p>
     * 
     * @return Detail data for the target revision.
     */

    public Revision getTargetRevision() {
        return this.targetRevision;
    }

    /**
     * <p>
     * Detail data for the target revision.
     * </p>
     * 
     * @param targetRevision
     *        Detail data for the target revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withTargetRevision(Revision targetRevision) {
        setTargetRevision(targetRevision);
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
        if (getInitialRevision() != null)
            sb.append("InitialRevision: ").append(getInitialRevision()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getTargetRevision() != null)
            sb.append("TargetRevision: ").append(getTargetRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSyncAttempt == false)
            return false;
        ResourceSyncAttempt other = (ResourceSyncAttempt) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getInitialRevision() == null ^ this.getInitialRevision() == null)
            return false;
        if (other.getInitialRevision() != null && other.getInitialRevision().equals(this.getInitialRevision()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTargetRevision() == null ^ this.getTargetRevision() == null)
            return false;
        if (other.getTargetRevision() != null && other.getTargetRevision().equals(this.getTargetRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getInitialRevision() == null) ? 0 : getInitialRevision().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getTargetRevision() == null) ? 0 : getTargetRevision().hashCode());
        return hashCode;
    }

    @Override
    public ResourceSyncAttempt clone() {
        try {
            return (ResourceSyncAttempt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ResourceSyncAttemptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
