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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An event bus receives events from a source and routes them to rules associated with that event bus. Your account's
 * default event bus receives rules from AWS services. A custom event bus can receive rules from AWS services as well as
 * your custom applications and services. A partner event bus receives events from an event source created by an SaaS
 * partner. These events come from the partners services or applications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/EventBus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventBus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the event bus.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The permissions policy of the event bus, describing which other AWS accounts can write events to this event bus.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The name of the event bus.
     * </p>
     * 
     * @param name
     *        The name of the event bus.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event bus.
     * </p>
     * 
     * @return The name of the event bus.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event bus.
     * </p>
     * 
     * @param name
     *        The name of the event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBus withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     * 
     * @param arn
     *        The ARN of the event bus.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     * 
     * @return The ARN of the event bus.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the event bus.
     * </p>
     * 
     * @param arn
     *        The ARN of the event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBus withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The permissions policy of the event bus, describing which other AWS accounts can write events to this event bus.
     * </p>
     * 
     * @param policy
     *        The permissions policy of the event bus, describing which other AWS accounts can write events to this
     *        event bus.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The permissions policy of the event bus, describing which other AWS accounts can write events to this event bus.
     * </p>
     * 
     * @return The permissions policy of the event bus, describing which other AWS accounts can write events to this
     *         event bus.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The permissions policy of the event bus, describing which other AWS accounts can write events to this event bus.
     * </p>
     * 
     * @param policy
     *        The permissions policy of the event bus, describing which other AWS accounts can write events to this
     *        event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBus withPolicy(String policy) {
        setPolicy(policy);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventBus == false)
            return false;
        EventBus other = (EventBus) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public EventBus clone() {
        try {
            return (EventBus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.EventBusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
