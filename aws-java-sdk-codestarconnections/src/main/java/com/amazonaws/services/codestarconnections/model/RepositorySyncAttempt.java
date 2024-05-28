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
 * Information about a repository sync attempt for a repository with a sync configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/RepositorySyncAttempt"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositorySyncAttempt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time of a specific sync attempt.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The status of a specific sync attempt. The following are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INITIATED - A repository sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED - The repository sync attempt has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The repository sync attempt has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUED - The repository sync attempt didn't execute and was queued.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The events associated with a specific sync attempt.
     * </p>
     */
    private java.util.List<RepositorySyncEvent> events;

    /**
     * <p>
     * The start time of a specific sync attempt.
     * </p>
     * 
     * @param startedAt
     *        The start time of a specific sync attempt.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The start time of a specific sync attempt.
     * </p>
     * 
     * @return The start time of a specific sync attempt.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The start time of a specific sync attempt.
     * </p>
     * 
     * @param startedAt
     *        The start time of a specific sync attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncAttempt withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The status of a specific sync attempt. The following are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INITIATED - A repository sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED - The repository sync attempt has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The repository sync attempt has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUED - The repository sync attempt didn't execute and was queued.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a specific sync attempt. The following are valid statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INITIATED - A repository sync attempt has been created and will begin soon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCEEDED - The repository sync attempt has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The repository sync attempt has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        QUEUED - The repository sync attempt didn't execute and was queued.
     *        </p>
     *        </li>
     * @see RepositorySyncStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a specific sync attempt. The following are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INITIATED - A repository sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED - The repository sync attempt has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The repository sync attempt has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUED - The repository sync attempt didn't execute and was queued.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of a specific sync attempt. The following are valid statuses:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         INITIATED - A repository sync attempt has been created and will begin soon.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SUCCEEDED - The repository sync attempt has completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED - The repository sync attempt has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         QUEUED - The repository sync attempt didn't execute and was queued.
     *         </p>
     *         </li>
     * @see RepositorySyncStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a specific sync attempt. The following are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INITIATED - A repository sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED - The repository sync attempt has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The repository sync attempt has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUED - The repository sync attempt didn't execute and was queued.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a specific sync attempt. The following are valid statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INITIATED - A repository sync attempt has been created and will begin soon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCEEDED - The repository sync attempt has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The repository sync attempt has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        QUEUED - The repository sync attempt didn't execute and was queued.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositorySyncStatus
     */

    public RepositorySyncAttempt withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a specific sync attempt. The following are valid statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INITIATED - A repository sync attempt has been created and will begin soon.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCEEDED - The repository sync attempt has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The repository sync attempt has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUED - The repository sync attempt didn't execute and was queued.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a specific sync attempt. The following are valid statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INITIATED - A repository sync attempt has been created and will begin soon.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN_PROGRESS - A repository sync attempt has started and work is being done to reconcile the branch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCEEDED - The repository sync attempt has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The repository sync attempt has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        QUEUED - The repository sync attempt didn't execute and was queued.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositorySyncStatus
     */

    public RepositorySyncAttempt withStatus(RepositorySyncStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The events associated with a specific sync attempt.
     * </p>
     * 
     * @return The events associated with a specific sync attempt.
     */

    public java.util.List<RepositorySyncEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * The events associated with a specific sync attempt.
     * </p>
     * 
     * @param events
     *        The events associated with a specific sync attempt.
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
     * The events associated with a specific sync attempt.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The events associated with a specific sync attempt.
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
     * The events associated with a specific sync attempt.
     * </p>
     * 
     * @param events
     *        The events associated with a specific sync attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncAttempt withEvents(java.util.Collection<RepositorySyncEvent> events) {
        setEvents(events);
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
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
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
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
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
        com.amazonaws.services.codestarconnections.model.transform.RepositorySyncAttemptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
