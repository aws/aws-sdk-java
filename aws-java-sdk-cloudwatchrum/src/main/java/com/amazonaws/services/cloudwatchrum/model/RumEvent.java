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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the information for one performance event that RUM collects from a user session with your
 * application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/RumEvent" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RumEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string containing details about the event.
     * </p>
     */
    private String details;
    /**
     * <p>
     * A unique ID for this event.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Metadata about this event, which contains a JSON serialization of the identity of the user for this session. The
     * user information comes from information such as the HTTP user-agent request header and document interface.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The exact time that this event occurred.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The JSON schema that denotes the type of event this is, such as a page load or a new session.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A string containing details about the event.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param details
     *        A string containing details about the event.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * A string containing details about the event.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A string containing details about the event.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * A string containing details about the event.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param details
     *        A string containing details about the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RumEvent withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * A unique ID for this event.
     * </p>
     * 
     * @param id
     *        A unique ID for this event.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique ID for this event.
     * </p>
     * 
     * @return A unique ID for this event.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique ID for this event.
     * </p>
     * 
     * @param id
     *        A unique ID for this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RumEvent withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Metadata about this event, which contains a JSON serialization of the identity of the user for this session. The
     * user information comes from information such as the HTTP user-agent request header and document interface.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param metadata
     *        Metadata about this event, which contains a JSON serialization of the identity of the user for this
     *        session. The user information comes from information such as the HTTP user-agent request header and
     *        document interface.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata about this event, which contains a JSON serialization of the identity of the user for this session. The
     * user information comes from information such as the HTTP user-agent request header and document interface.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return Metadata about this event, which contains a JSON serialization of the identity of the user for this
     *         session. The user information comes from information such as the HTTP user-agent request header and
     *         document interface.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Metadata about this event, which contains a JSON serialization of the identity of the user for this session. The
     * user information comes from information such as the HTTP user-agent request header and document interface.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param metadata
     *        Metadata about this event, which contains a JSON serialization of the identity of the user for this
     *        session. The user information comes from information such as the HTTP user-agent request header and
     *        document interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RumEvent withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The exact time that this event occurred.
     * </p>
     * 
     * @param timestamp
     *        The exact time that this event occurred.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The exact time that this event occurred.
     * </p>
     * 
     * @return The exact time that this event occurred.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The exact time that this event occurred.
     * </p>
     * 
     * @param timestamp
     *        The exact time that this event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RumEvent withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The JSON schema that denotes the type of event this is, such as a page load or a new session.
     * </p>
     * 
     * @param type
     *        The JSON schema that denotes the type of event this is, such as a page load or a new session.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The JSON schema that denotes the type of event this is, such as a page load or a new session.
     * </p>
     * 
     * @return The JSON schema that denotes the type of event this is, such as a page load or a new session.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The JSON schema that denotes the type of event this is, such as a page load or a new session.
     * </p>
     * 
     * @param type
     *        The JSON schema that denotes the type of event this is, such as a page load or a new session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RumEvent withType(String type) {
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
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

        if (obj instanceof RumEvent == false)
            return false;
        RumEvent other = (RumEvent) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RumEvent clone() {
        try {
            return (RumEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.RumEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
