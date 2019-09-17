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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/CreateEventBus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventBusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new event bus.
     * </p>
     * <p>
     * The names of custom event buses can't contain the <code>/</code> character. You can't use the name
     * <code>default</code> for a custom event bus because this name is already used for your account's default event
     * bus.
     * </p>
     * <p>
     * If this is a partner event bus, the name must exactly match the name of the partner event source that this event
     * bus is matched to. This name will include the <code>/</code> character.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you're creating a partner event bus, this specifies the partner event source that the new event bus will be
     * matched with.
     * </p>
     */
    private String eventSourceName;

    /**
     * <p>
     * The name of the new event bus.
     * </p>
     * <p>
     * The names of custom event buses can't contain the <code>/</code> character. You can't use the name
     * <code>default</code> for a custom event bus because this name is already used for your account's default event
     * bus.
     * </p>
     * <p>
     * If this is a partner event bus, the name must exactly match the name of the partner event source that this event
     * bus is matched to. This name will include the <code>/</code> character.
     * </p>
     * 
     * @param name
     *        The name of the new event bus. </p>
     *        <p>
     *        The names of custom event buses can't contain the <code>/</code> character. You can't use the name
     *        <code>default</code> for a custom event bus because this name is already used for your account's default
     *        event bus.
     *        </p>
     *        <p>
     *        If this is a partner event bus, the name must exactly match the name of the partner event source that this
     *        event bus is matched to. This name will include the <code>/</code> character.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new event bus.
     * </p>
     * <p>
     * The names of custom event buses can't contain the <code>/</code> character. You can't use the name
     * <code>default</code> for a custom event bus because this name is already used for your account's default event
     * bus.
     * </p>
     * <p>
     * If this is a partner event bus, the name must exactly match the name of the partner event source that this event
     * bus is matched to. This name will include the <code>/</code> character.
     * </p>
     * 
     * @return The name of the new event bus. </p>
     *         <p>
     *         The names of custom event buses can't contain the <code>/</code> character. You can't use the name
     *         <code>default</code> for a custom event bus because this name is already used for your account's default
     *         event bus.
     *         </p>
     *         <p>
     *         If this is a partner event bus, the name must exactly match the name of the partner event source that
     *         this event bus is matched to. This name will include the <code>/</code> character.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new event bus.
     * </p>
     * <p>
     * The names of custom event buses can't contain the <code>/</code> character. You can't use the name
     * <code>default</code> for a custom event bus because this name is already used for your account's default event
     * bus.
     * </p>
     * <p>
     * If this is a partner event bus, the name must exactly match the name of the partner event source that this event
     * bus is matched to. This name will include the <code>/</code> character.
     * </p>
     * 
     * @param name
     *        The name of the new event bus. </p>
     *        <p>
     *        The names of custom event buses can't contain the <code>/</code> character. You can't use the name
     *        <code>default</code> for a custom event bus because this name is already used for your account's default
     *        event bus.
     *        </p>
     *        <p>
     *        If this is a partner event bus, the name must exactly match the name of the partner event source that this
     *        event bus is matched to. This name will include the <code>/</code> character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If you're creating a partner event bus, this specifies the partner event source that the new event bus will be
     * matched with.
     * </p>
     * 
     * @param eventSourceName
     *        If you're creating a partner event bus, this specifies the partner event source that the new event bus
     *        will be matched with.
     */

    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    /**
     * <p>
     * If you're creating a partner event bus, this specifies the partner event source that the new event bus will be
     * matched with.
     * </p>
     * 
     * @return If you're creating a partner event bus, this specifies the partner event source that the new event bus
     *         will be matched with.
     */

    public String getEventSourceName() {
        return this.eventSourceName;
    }

    /**
     * <p>
     * If you're creating a partner event bus, this specifies the partner event source that the new event bus will be
     * matched with.
     * </p>
     * 
     * @param eventSourceName
     *        If you're creating a partner event bus, this specifies the partner event source that the new event bus
     *        will be matched with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withEventSourceName(String eventSourceName) {
        setEventSourceName(eventSourceName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEventSourceName() != null)
            sb.append("EventSourceName: ").append(getEventSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventBusRequest == false)
            return false;
        CreateEventBusRequest other = (CreateEventBusRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEventSourceName() == null ^ this.getEventSourceName() == null)
            return false;
        if (other.getEventSourceName() != null && other.getEventSourceName().equals(this.getEventSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEventSourceName() == null) ? 0 : getEventSourceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventBusRequest clone() {
        return (CreateEventBusRequest) super.clone();
    }

}
