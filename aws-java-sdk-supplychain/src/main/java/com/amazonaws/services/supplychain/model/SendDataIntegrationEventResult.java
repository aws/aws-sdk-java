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
package com.amazonaws.services.supplychain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response parameters for SendDataIntegrationEvent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/SendDataIntegrationEvent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendDataIntegrationEventResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique event identifier.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * The unique event identifier.
     * </p>
     * 
     * @param eventId
     *        The unique event identifier.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The unique event identifier.
     * </p>
     * 
     * @return The unique event identifier.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The unique event identifier.
     * </p>
     * 
     * @param eventId
     *        The unique event identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataIntegrationEventResult withEventId(String eventId) {
        setEventId(eventId);
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
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDataIntegrationEventResult == false)
            return false;
        SendDataIntegrationEventResult other = (SendDataIntegrationEventResult) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        return hashCode;
    }

    @Override
    public SendDataIntegrationEventResult clone() {
        try {
            return (SendDataIntegrationEventResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
