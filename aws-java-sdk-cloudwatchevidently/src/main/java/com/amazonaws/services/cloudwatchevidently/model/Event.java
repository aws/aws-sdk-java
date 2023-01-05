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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the information about one evaluation event or custom event sent to Evidently. This is a
 * JSON payload. If this event specifies a pre-defined event type, the payload must follow the defined event schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/Event" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event data.
     * </p>
     */
    private String data;
    /**
     * <p>
     * The timestamp of the event.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature variation
     * that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates metrics from user
     * actions such as clicks and checkouts.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The event data.
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
     * @param data
     *        The event data.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The event data.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The event data.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * The event data.
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
     * @param data
     *        The event data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withData(String data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the event.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @return The timestamp of the event.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature variation
     * that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates metrics from user
     * actions such as clicks and checkouts.
     * </p>
     * 
     * @param type
     *        <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature
     *        variation that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates
     *        metrics from user actions such as clicks and checkouts.
     * @see EventType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature variation
     * that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates metrics from user
     * actions such as clicks and checkouts.
     * </p>
     * 
     * @return <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature
     *         variation that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates
     *         metrics from user actions such as clicks and checkouts.
     * @see EventType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature variation
     * that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates metrics from user
     * actions such as clicks and checkouts.
     * </p>
     * 
     * @param type
     *        <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature
     *        variation that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates
     *        metrics from user actions such as clicks and checkouts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public Event withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature variation
     * that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates metrics from user
     * actions such as clicks and checkouts.
     * </p>
     * 
     * @param type
     *        <code>aws.evidently.evaluation</code> specifies an evaluation event, which determines which feature
     *        variation that a user sees. <code>aws.evidently.custom</code> specifies a custom event, which generates
     *        metrics from user actions such as clicks and checkouts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public Event withType(EventType type) {
        this.type = type.toString();
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
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

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
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

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
