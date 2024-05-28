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
package com.amazonaws.services.codeconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a resource sync attempt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ResourceSyncAttempt"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSyncAttempt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The events related to a resource sync attempt.
     * </p>
     */
    private java.util.List<ResourceSyncEvent> events;
    /**
     * <p>
     * The current state of the resource as defined in the resource's <code>config-file</code> in the linked repository.
     * </p>
     */
    private Revision initialRevision;
    /**
     * <p>
     * The start time for a resource sync attempt.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The status for a resource sync attempt. The follow are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCING - Syncing has started and work is being done to reconcile state.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCED - Syncing has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNC_FAILED - A resource sync attempt has failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The desired state of the resource as defined in the resource's <code>config-file</code> in the linked repository.
     * Git sync attempts to update the resource to this state.
     * </p>
     */
    private Revision targetRevision;
    /**
     * <p>
     * The name of the Amazon Web Services resource that is attempted to be synchronized.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The events related to a resource sync attempt.
     * </p>
     * 
     * @return The events related to a resource sync attempt.
     */

    public java.util.List<ResourceSyncEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * The events related to a resource sync attempt.
     * </p>
     * 
     * @param events
     *        The events related to a resource sync attempt.
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
     * The events related to a resource sync attempt.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The events related to a resource sync attempt.
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
     * The events related to a resource sync attempt.
     * </p>
     * 
     * @param events
     *        The events related to a resource sync attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withEvents(java.util.Collection<ResourceSyncEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The current state of the resource as defined in the resource's <code>config-file</code> in the linked repository.
     * </p>
     * 
     * @param initialRevision
     *        The current state of the resource as defined in the resource's <code>config-file</code> in the linked
     *        repository.
     */

    public void setInitialRevision(Revision initialRevision) {
        this.initialRevision = initialRevision;
    }

    /**
     * <p>
     * The current state of the resource as defined in the resource's <code>config-file</code> in the linked repository.
     * </p>
     * 
     * @return The current state of the resource as defined in the resource's <code>config-file</code> in the linked
     *         repository.
     */

    public Revision getInitialRevision() {
        return this.initialRevision;
    }

    /**
     * <p>
     * The current state of the resource as defined in the resource's <code>config-file</code> in the linked repository.
     * </p>
     * 
     * @param initialRevision
     *        The current state of the resource as defined in the resource's <code>config-file</code> in the linked
     *        repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withInitialRevision(Revision initialRevision) {
        setInitialRevision(initialRevision);
        return this;
    }

    /**
     * <p>
     * The start time for a resource sync attempt.
     * </p>
     * 
     * @param startedAt
     *        The start time for a resource sync attempt.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The start time for a resource sync attempt.
     * </p>
     * 
     * @return The start time for a resource sync attempt.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The start time for a resource sync attempt.
     * </p>
     * 
     * @param startedAt
     *        The start time for a resource sync attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The status for a resource sync attempt. The follow are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCING - Syncing has started and work is being done to reconcile state.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCED - Syncing has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNC_FAILED - A resource sync attempt has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status for a resource sync attempt. The follow are valid statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNCING - Syncing has started and work is being done to reconcile state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNCED - Syncing has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNC_FAILED - A resource sync attempt has failed.
     *        </p>
     *        </li>
     * @see ResourceSyncStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for a resource sync attempt. The follow are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCING - Syncing has started and work is being done to reconcile state.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCED - Syncing has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNC_FAILED - A resource sync attempt has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status for a resource sync attempt. The follow are valid statuses:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SYNCING - Syncing has started and work is being done to reconcile state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SYNCED - Syncing has completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SYNC_FAILED - A resource sync attempt has failed.
     *         </p>
     *         </li>
     * @see ResourceSyncStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for a resource sync attempt. The follow are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCING - Syncing has started and work is being done to reconcile state.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCED - Syncing has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNC_FAILED - A resource sync attempt has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status for a resource sync attempt. The follow are valid statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNCING - Syncing has started and work is being done to reconcile state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNCED - Syncing has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNC_FAILED - A resource sync attempt has failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSyncStatus
     */

    public ResourceSyncAttempt withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for a resource sync attempt. The follow are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCING - Syncing has started and work is being done to reconcile state.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNCED - Syncing has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * SYNC_FAILED - A resource sync attempt has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status for a resource sync attempt. The follow are valid statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SYNC-INITIATED - A resource sync attempt has been created and will begin soon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNCING - Syncing has started and work is being done to reconcile state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNCED - Syncing has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SYNC_FAILED - A resource sync attempt has failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSyncStatus
     */

    public ResourceSyncAttempt withStatus(ResourceSyncStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The desired state of the resource as defined in the resource's <code>config-file</code> in the linked repository.
     * Git sync attempts to update the resource to this state.
     * </p>
     * 
     * @param targetRevision
     *        The desired state of the resource as defined in the resource's <code>config-file</code> in the linked
     *        repository. Git sync attempts to update the resource to this state.
     */

    public void setTargetRevision(Revision targetRevision) {
        this.targetRevision = targetRevision;
    }

    /**
     * <p>
     * The desired state of the resource as defined in the resource's <code>config-file</code> in the linked repository.
     * Git sync attempts to update the resource to this state.
     * </p>
     * 
     * @return The desired state of the resource as defined in the resource's <code>config-file</code> in the linked
     *         repository. Git sync attempts to update the resource to this state.
     */

    public Revision getTargetRevision() {
        return this.targetRevision;
    }

    /**
     * <p>
     * The desired state of the resource as defined in the resource's <code>config-file</code> in the linked repository.
     * Git sync attempts to update the resource to this state.
     * </p>
     * 
     * @param targetRevision
     *        The desired state of the resource as defined in the resource's <code>config-file</code> in the linked
     *        repository. Git sync attempts to update the resource to this state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withTargetRevision(Revision targetRevision) {
        setTargetRevision(targetRevision);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource that is attempted to be synchronized.
     * </p>
     * 
     * @param target
     *        The name of the Amazon Web Services resource that is attempted to be synchronized.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource that is attempted to be synchronized.
     * </p>
     * 
     * @return The name of the Amazon Web Services resource that is attempted to be synchronized.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource that is attempted to be synchronized.
     * </p>
     * 
     * @param target
     *        The name of the Amazon Web Services resource that is attempted to be synchronized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncAttempt withTarget(String target) {
        setTarget(target);
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
        if (getTargetRevision() != null)
            sb.append("TargetRevision: ").append(getTargetRevision()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
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
        if (other.getTargetRevision() == null ^ this.getTargetRevision() == null)
            return false;
        if (other.getTargetRevision() != null && other.getTargetRevision().equals(this.getTargetRevision()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
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
        hashCode = prime * hashCode + ((getTargetRevision() == null) ? 0 : getTargetRevision().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
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
        com.amazonaws.services.codeconnections.model.transform.ResourceSyncAttemptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
