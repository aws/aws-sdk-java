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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteEventAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEventActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the event action.
     * </p>
     */
    private String eventActionId;

    /**
     * <p>
     * The unique identifier for the event action.
     * </p>
     * 
     * @param eventActionId
     *        The unique identifier for the event action.
     */

    public void setEventActionId(String eventActionId) {
        this.eventActionId = eventActionId;
    }

    /**
     * <p>
     * The unique identifier for the event action.
     * </p>
     * 
     * @return The unique identifier for the event action.
     */

    public String getEventActionId() {
        return this.eventActionId;
    }

    /**
     * <p>
     * The unique identifier for the event action.
     * </p>
     * 
     * @param eventActionId
     *        The unique identifier for the event action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEventActionRequest withEventActionId(String eventActionId) {
        setEventActionId(eventActionId);
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
        if (getEventActionId() != null)
            sb.append("EventActionId: ").append(getEventActionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEventActionRequest == false)
            return false;
        DeleteEventActionRequest other = (DeleteEventActionRequest) obj;
        if (other.getEventActionId() == null ^ this.getEventActionId() == null)
            return false;
        if (other.getEventActionId() != null && other.getEventActionId().equals(this.getEventActionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventActionId() == null) ? 0 : getEventActionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEventActionRequest clone() {
        return (DeleteEventActionRequest) super.clone();
    }

}
