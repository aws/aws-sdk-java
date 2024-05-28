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
package com.amazonaws.services.cloudtraildata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A response that includes successful and failed event results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-data-2021-08-11/AuditEventResultEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditEventResultEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event ID assigned by CloudTrail.
     * </p>
     */
    private String eventID;
    /**
     * <p>
     * The original event ID from the source event.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The event ID assigned by CloudTrail.
     * </p>
     * 
     * @param eventID
     *        The event ID assigned by CloudTrail.
     */

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * <p>
     * The event ID assigned by CloudTrail.
     * </p>
     * 
     * @return The event ID assigned by CloudTrail.
     */

    public String getEventID() {
        return this.eventID;
    }

    /**
     * <p>
     * The event ID assigned by CloudTrail.
     * </p>
     * 
     * @param eventID
     *        The event ID assigned by CloudTrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEventResultEntry withEventID(String eventID) {
        setEventID(eventID);
        return this;
    }

    /**
     * <p>
     * The original event ID from the source event.
     * </p>
     * 
     * @param id
     *        The original event ID from the source event.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The original event ID from the source event.
     * </p>
     * 
     * @return The original event ID from the source event.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The original event ID from the source event.
     * </p>
     * 
     * @param id
     *        The original event ID from the source event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEventResultEntry withId(String id) {
        setId(id);
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
        if (getEventID() != null)
            sb.append("EventID: ").append(getEventID()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditEventResultEntry == false)
            return false;
        AuditEventResultEntry other = (AuditEventResultEntry) obj;
        if (other.getEventID() == null ^ this.getEventID() == null)
            return false;
        if (other.getEventID() != null && other.getEventID().equals(this.getEventID()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventID() == null) ? 0 : getEventID().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public AuditEventResultEntry clone() {
        try {
            return (AuditEventResultEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtraildata.model.transform.AuditEventResultEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
