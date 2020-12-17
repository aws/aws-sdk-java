/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an event that triggers an event-based policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/EventSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Information about the event.
     * </p>
     */
    private EventParameters parameters;

    /**
     * <p>
     * The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * </p>
     * 
     * @param type
     *        The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * @see EventSourceValues
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * </p>
     * 
     * @return The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * @see EventSourceValues
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * </p>
     * 
     * @param type
     *        The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceValues
     */

    public EventSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * </p>
     * 
     * @param type
     *        The source of the event. Currently only managed AWS CloudWatch Events rules are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceValues
     */

    public EventSource withType(EventSourceValues type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the event.
     * </p>
     * 
     * @param parameters
     *        Information about the event.
     */

    public void setParameters(EventParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Information about the event.
     * </p>
     * 
     * @return Information about the event.
     */

    public EventParameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * Information about the event.
     * </p>
     * 
     * @param parameters
     *        Information about the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSource withParameters(EventParameters parameters) {
        setParameters(parameters);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventSource == false)
            return false;
        EventSource other = (EventSource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public EventSource clone() {
        try {
            return (EventSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.EventSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
