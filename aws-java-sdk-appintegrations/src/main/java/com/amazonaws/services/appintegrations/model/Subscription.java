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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an event that the application subscribes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/Subscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the subscription.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The description of the subscription.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * 
     * @param event
     *        The name of the subscription.
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * 
     * @return The name of the subscription.
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The name of the subscription.
     * </p>
     * 
     * @param event
     *        The name of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The description of the subscription.
     * </p>
     * 
     * @param description
     *        The description of the subscription.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the subscription.
     * </p>
     * 
     * @return The description of the subscription.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the subscription.
     * </p>
     * 
     * @param description
     *        The description of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withDescription(String description) {
        setDescription(description);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Subscription clone() {
        try {
            return (Subscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.SubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
