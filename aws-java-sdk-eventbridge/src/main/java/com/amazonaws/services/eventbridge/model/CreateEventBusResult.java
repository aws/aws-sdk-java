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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateEventBus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventBusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the new event bus.
     * </p>
     */
    private String eventBusArn;

    /**
     * <p>
     * The ARN of the new event bus.
     * </p>
     * 
     * @param eventBusArn
     *        The ARN of the new event bus.
     */

    public void setEventBusArn(String eventBusArn) {
        this.eventBusArn = eventBusArn;
    }

    /**
     * <p>
     * The ARN of the new event bus.
     * </p>
     * 
     * @return The ARN of the new event bus.
     */

    public String getEventBusArn() {
        return this.eventBusArn;
    }

    /**
     * <p>
     * The ARN of the new event bus.
     * </p>
     * 
     * @param eventBusArn
     *        The ARN of the new event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusResult withEventBusArn(String eventBusArn) {
        setEventBusArn(eventBusArn);
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
        if (getEventBusArn() != null)
            sb.append("EventBusArn: ").append(getEventBusArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventBusResult == false)
            return false;
        CreateEventBusResult other = (CreateEventBusResult) obj;
        if (other.getEventBusArn() == null ^ this.getEventBusArn() == null)
            return false;
        if (other.getEventBusArn() != null && other.getEventBusArn().equals(this.getEventBusArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventBusArn() == null) ? 0 : getEventBusArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventBusResult clone() {
        try {
            return (CreateEventBusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
