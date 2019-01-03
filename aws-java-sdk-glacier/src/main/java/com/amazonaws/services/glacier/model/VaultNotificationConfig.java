/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a vault's notification configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VaultNotificationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
     * </p>
     */
    private String sNSTopic;
    /**
     * <p>
     * A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.
     * </p>
     */
    private java.util.List<String> events;

    /**
     * Default constructor for VaultNotificationConfig object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public VaultNotificationConfig() {
    }

    /**
     * Constructs a new VaultNotificationConfig object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param sNSTopic
     *        The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
     * @param events
     *        A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS
     *        topic.
     */
    public VaultNotificationConfig(String sNSTopic, java.util.List<String> events) {
        setSNSTopic(sNSTopic);
        setEvents(events);
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
     * </p>
     * 
     * @param sNSTopic
     *        The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
     */

    public void setSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
     */

    public String getSNSTopic() {
        return this.sNSTopic;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
     * </p>
     * 
     * @param sNSTopic
     *        The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VaultNotificationConfig withSNSTopic(String sNSTopic) {
        setSNSTopic(sNSTopic);
        return this;
    }

    /**
     * <p>
     * A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.
     * </p>
     * 
     * @return A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon
     *         SNS topic.
     */

    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.
     * </p>
     * 
     * @param events
     *        A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS
     *        topic.
     */

    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS
     *        topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VaultNotificationConfig withEvents(String... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<String>(events.length));
        }
        for (String ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.
     * </p>
     * 
     * @param events
     *        A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS
     *        topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VaultNotificationConfig withEvents(java.util.Collection<String> events) {
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
        if (getSNSTopic() != null)
            sb.append("SNSTopic: ").append(getSNSTopic()).append(",");
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

        if (obj instanceof VaultNotificationConfig == false)
            return false;
        VaultNotificationConfig other = (VaultNotificationConfig) obj;
        if (other.getSNSTopic() == null ^ this.getSNSTopic() == null)
            return false;
        if (other.getSNSTopic() != null && other.getSNSTopic().equals(this.getSNSTopic()) == false)
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

        hashCode = prime * hashCode + ((getSNSTopic() == null) ? 0 : getSNSTopic().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public VaultNotificationConfig clone() {
        try {
            return (VaultNotificationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.VaultNotificationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
