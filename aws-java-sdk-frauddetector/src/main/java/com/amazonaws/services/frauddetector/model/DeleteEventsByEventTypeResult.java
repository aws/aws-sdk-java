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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEventsByEventType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEventsByEventTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Name of event type for which to delete the events.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The status of the delete request.
     * </p>
     */
    private String eventsDeletionStatus;

    /**
     * <p>
     * Name of event type for which to delete the events.
     * </p>
     * 
     * @param eventTypeName
     *        Name of event type for which to delete the events.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * Name of event type for which to delete the events.
     * </p>
     * 
     * @return Name of event type for which to delete the events.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * Name of event type for which to delete the events.
     * </p>
     * 
     * @param eventTypeName
     *        Name of event type for which to delete the events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEventsByEventTypeResult withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The status of the delete request.
     * </p>
     * 
     * @param eventsDeletionStatus
     *        The status of the delete request.
     */

    public void setEventsDeletionStatus(String eventsDeletionStatus) {
        this.eventsDeletionStatus = eventsDeletionStatus;
    }

    /**
     * <p>
     * The status of the delete request.
     * </p>
     * 
     * @return The status of the delete request.
     */

    public String getEventsDeletionStatus() {
        return this.eventsDeletionStatus;
    }

    /**
     * <p>
     * The status of the delete request.
     * </p>
     * 
     * @param eventsDeletionStatus
     *        The status of the delete request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEventsByEventTypeResult withEventsDeletionStatus(String eventsDeletionStatus) {
        setEventsDeletionStatus(eventsDeletionStatus);
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
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getEventsDeletionStatus() != null)
            sb.append("EventsDeletionStatus: ").append(getEventsDeletionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEventsByEventTypeResult == false)
            return false;
        DeleteEventsByEventTypeResult other = (DeleteEventsByEventTypeResult) obj;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getEventsDeletionStatus() == null ^ this.getEventsDeletionStatus() == null)
            return false;
        if (other.getEventsDeletionStatus() != null && other.getEventsDeletionStatus().equals(this.getEventsDeletionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getEventsDeletionStatus() == null) ? 0 : getEventsDeletionStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEventsByEventTypeResult clone() {
        try {
            return (DeleteEventsByEventTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
