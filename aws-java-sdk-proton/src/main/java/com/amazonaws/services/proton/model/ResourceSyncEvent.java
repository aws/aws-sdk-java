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
 * Detail data for a resource sync event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ResourceSyncEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSyncEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A resource sync event.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The external ID for the event.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The time when the event occurred.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The type of event.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A resource sync event.
     * </p>
     * 
     * @param event
     *        A resource sync event.
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * A resource sync event.
     * </p>
     * 
     * @return A resource sync event.
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * A resource sync event.
     * </p>
     * 
     * @param event
     *        A resource sync event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncEvent withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The external ID for the event.
     * </p>
     * 
     * @param externalId
     *        The external ID for the event.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID for the event.
     * </p>
     * 
     * @return The external ID for the event.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID for the event.
     * </p>
     * 
     * @param externalId
     *        The external ID for the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncEvent withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     * 
     * @param time
     *        The time when the event occurred.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     * 
     * @return The time when the event occurred.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     * 
     * @param time
     *        The time when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncEvent withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The type of event.
     * </p>
     * 
     * @param type
     *        The type of event.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of event.
     * </p>
     * 
     * @return The type of event.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of event.
     * </p>
     * 
     * @param type
     *        The type of event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSyncEvent withType(String type) {
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

        if (obj instanceof ResourceSyncEvent == false)
            return false;
        ResourceSyncEvent other = (ResourceSyncEvent) obj;
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
    public ResourceSyncEvent clone() {
        try {
            return (ResourceSyncEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ResourceSyncEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
