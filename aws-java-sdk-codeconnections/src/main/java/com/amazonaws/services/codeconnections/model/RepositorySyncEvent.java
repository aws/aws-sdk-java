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
 * Information about a repository sync event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/RepositorySyncEvent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositorySyncEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of a repository sync event.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The ID for a repository sync event.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The time that a repository sync event occurred.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The event type for a repository sync event.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A description of a repository sync event.
     * </p>
     * 
     * @param event
     *        A description of a repository sync event.
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * A description of a repository sync event.
     * </p>
     * 
     * @return A description of a repository sync event.
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * A description of a repository sync event.
     * </p>
     * 
     * @param event
     *        A description of a repository sync event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncEvent withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The ID for a repository sync event.
     * </p>
     * 
     * @param externalId
     *        The ID for a repository sync event.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The ID for a repository sync event.
     * </p>
     * 
     * @return The ID for a repository sync event.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The ID for a repository sync event.
     * </p>
     * 
     * @param externalId
     *        The ID for a repository sync event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncEvent withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The time that a repository sync event occurred.
     * </p>
     * 
     * @param time
     *        The time that a repository sync event occurred.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * The time that a repository sync event occurred.
     * </p>
     * 
     * @return The time that a repository sync event occurred.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * The time that a repository sync event occurred.
     * </p>
     * 
     * @param time
     *        The time that a repository sync event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncEvent withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The event type for a repository sync event.
     * </p>
     * 
     * @param type
     *        The event type for a repository sync event.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The event type for a repository sync event.
     * </p>
     * 
     * @return The event type for a repository sync event.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The event type for a repository sync event.
     * </p>
     * 
     * @param type
     *        The event type for a repository sync event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncEvent withType(String type) {
        setType(type);
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
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
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

        if (obj instanceof RepositorySyncEvent == false)
            return false;
        RepositorySyncEvent other = (RepositorySyncEvent) obj;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
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

        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RepositorySyncEvent clone() {
        try {
            return (RepositorySyncEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeconnections.model.transform.RepositorySyncEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
