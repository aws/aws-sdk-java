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
 * An event from a source outside of Amazon Web Services that you want CloudTrail to log.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-data-2021-08-11/AuditEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of an audit event that comes from the event, such as <code>userIdentity</code>,
     * <code>userAgent</code>, and <code>eventSource</code>.
     * </p>
     */
    private String eventData;
    /**
     * <p>
     * A checksum is a base64-SHA256 algorithm that helps you verify that CloudTrail receives the event that matches
     * with the checksum. Calculate the checksum by running a command like the following:
     * </p>
     * <p>
     * <code>printf %s <i>$eventdata</i> | openssl dgst -binary -sha256 | base64</code>
     * </p>
     */
    private String eventDataChecksum;
    /**
     * <p>
     * The original event ID from the source event.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The content of an audit event that comes from the event, such as <code>userIdentity</code>,
     * <code>userAgent</code>, and <code>eventSource</code>.
     * </p>
     * 
     * @param eventData
     *        The content of an audit event that comes from the event, such as <code>userIdentity</code>,
     *        <code>userAgent</code>, and <code>eventSource</code>.
     */

    public void setEventData(String eventData) {
        this.eventData = eventData;
    }

    /**
     * <p>
     * The content of an audit event that comes from the event, such as <code>userIdentity</code>,
     * <code>userAgent</code>, and <code>eventSource</code>.
     * </p>
     * 
     * @return The content of an audit event that comes from the event, such as <code>userIdentity</code>,
     *         <code>userAgent</code>, and <code>eventSource</code>.
     */

    public String getEventData() {
        return this.eventData;
    }

    /**
     * <p>
     * The content of an audit event that comes from the event, such as <code>userIdentity</code>,
     * <code>userAgent</code>, and <code>eventSource</code>.
     * </p>
     * 
     * @param eventData
     *        The content of an audit event that comes from the event, such as <code>userIdentity</code>,
     *        <code>userAgent</code>, and <code>eventSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEvent withEventData(String eventData) {
        setEventData(eventData);
        return this;
    }

    /**
     * <p>
     * A checksum is a base64-SHA256 algorithm that helps you verify that CloudTrail receives the event that matches
     * with the checksum. Calculate the checksum by running a command like the following:
     * </p>
     * <p>
     * <code>printf %s <i>$eventdata</i> | openssl dgst -binary -sha256 | base64</code>
     * </p>
     * 
     * @param eventDataChecksum
     *        A checksum is a base64-SHA256 algorithm that helps you verify that CloudTrail receives the event that
     *        matches with the checksum. Calculate the checksum by running a command like the following:</p>
     *        <p>
     *        <code>printf %s <i>$eventdata</i> | openssl dgst -binary -sha256 | base64</code>
     */

    public void setEventDataChecksum(String eventDataChecksum) {
        this.eventDataChecksum = eventDataChecksum;
    }

    /**
     * <p>
     * A checksum is a base64-SHA256 algorithm that helps you verify that CloudTrail receives the event that matches
     * with the checksum. Calculate the checksum by running a command like the following:
     * </p>
     * <p>
     * <code>printf %s <i>$eventdata</i> | openssl dgst -binary -sha256 | base64</code>
     * </p>
     * 
     * @return A checksum is a base64-SHA256 algorithm that helps you verify that CloudTrail receives the event that
     *         matches with the checksum. Calculate the checksum by running a command like the following:</p>
     *         <p>
     *         <code>printf %s <i>$eventdata</i> | openssl dgst -binary -sha256 | base64</code>
     */

    public String getEventDataChecksum() {
        return this.eventDataChecksum;
    }

    /**
     * <p>
     * A checksum is a base64-SHA256 algorithm that helps you verify that CloudTrail receives the event that matches
     * with the checksum. Calculate the checksum by running a command like the following:
     * </p>
     * <p>
     * <code>printf %s <i>$eventdata</i> | openssl dgst -binary -sha256 | base64</code>
     * </p>
     * 
     * @param eventDataChecksum
     *        A checksum is a base64-SHA256 algorithm that helps you verify that CloudTrail receives the event that
     *        matches with the checksum. Calculate the checksum by running a command like the following:</p>
     *        <p>
     *        <code>printf %s <i>$eventdata</i> | openssl dgst -binary -sha256 | base64</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEvent withEventDataChecksum(String eventDataChecksum) {
        setEventDataChecksum(eventDataChecksum);
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

    public AuditEvent withId(String id) {
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
        if (getEventData() != null)
            sb.append("EventData: ").append(getEventData()).append(",");
        if (getEventDataChecksum() != null)
            sb.append("EventDataChecksum: ").append(getEventDataChecksum()).append(",");
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

        if (obj instanceof AuditEvent == false)
            return false;
        AuditEvent other = (AuditEvent) obj;
        if (other.getEventData() == null ^ this.getEventData() == null)
            return false;
        if (other.getEventData() != null && other.getEventData().equals(this.getEventData()) == false)
            return false;
        if (other.getEventDataChecksum() == null ^ this.getEventDataChecksum() == null)
            return false;
        if (other.getEventDataChecksum() != null && other.getEventDataChecksum().equals(this.getEventDataChecksum()) == false)
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

        hashCode = prime * hashCode + ((getEventData() == null) ? 0 : getEventData().hashCode());
        hashCode = prime * hashCode + ((getEventDataChecksum() == null) ? 0 : getEventDataChecksum().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public AuditEvent clone() {
        try {
            return (AuditEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtraildata.model.transform.AuditEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
