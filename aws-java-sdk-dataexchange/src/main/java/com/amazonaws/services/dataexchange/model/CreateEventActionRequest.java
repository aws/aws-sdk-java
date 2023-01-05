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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateEventAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * What occurs after a certain event.
     * </p>
     */
    private Action action;
    /**
     * <p>
     * What occurs to start an action.
     * </p>
     */
    private Event event;

    /**
     * <p>
     * What occurs after a certain event.
     * </p>
     * 
     * @param action
     *        What occurs after a certain event.
     */

    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * <p>
     * What occurs after a certain event.
     * </p>
     * 
     * @return What occurs after a certain event.
     */

    public Action getAction() {
        return this.action;
    }

    /**
     * <p>
     * What occurs after a certain event.
     * </p>
     * 
     * @param action
     *        What occurs after a certain event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventActionRequest withAction(Action action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * What occurs to start an action.
     * </p>
     * 
     * @param event
     *        What occurs to start an action.
     */

    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * <p>
     * What occurs to start an action.
     * </p>
     * 
     * @return What occurs to start an action.
     */

    public Event getEvent() {
        return this.event;
    }

    /**
     * <p>
     * What occurs to start an action.
     * </p>
     * 
     * @param event
     *        What occurs to start an action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventActionRequest withEvent(Event event) {
        setEvent(event);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventActionRequest == false)
            return false;
        CreateEventActionRequest other = (CreateEventActionRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventActionRequest clone() {
        return (CreateEventActionRequest) super.clone();
    }

}
