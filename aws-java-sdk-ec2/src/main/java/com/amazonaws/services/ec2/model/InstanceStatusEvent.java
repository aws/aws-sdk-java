/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a scheduled event for an instance.
 * </p>
 */
public class InstanceStatusEvent implements Serializable, Cloneable {

    /**
     * <p>
     * The event code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * After a scheduled event is completed, it can still be described for up to a week. If the event has been
     * completed, this description starts with the following text: [Completed].
     * </p>
     */
    private String description;
    /**
     * <p>
     * The earliest scheduled start time for the event.
     * </p>
     */
    private java.util.Date notBefore;
    /**
     * <p>
     * The latest scheduled end time for the event.
     * </p>
     */
    private java.util.Date notAfter;

    /**
     * <p>
     * The event code.
     * </p>
     * 
     * @param code
     *        The event code.
     * @see EventCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The event code.
     * </p>
     * 
     * @return The event code.
     * @see EventCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The event code.
     * </p>
     * 
     * @param code
     *        The event code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventCode
     */

    public InstanceStatusEvent withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The event code.
     * </p>
     * 
     * @param code
     *        The event code.
     * @see EventCode
     */

    public void setCode(EventCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The event code.
     * </p>
     * 
     * @param code
     *        The event code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventCode
     */

    public InstanceStatusEvent withCode(EventCode code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * After a scheduled event is completed, it can still be described for up to a week. If the event has been
     * completed, this description starts with the following text: [Completed].
     * </p>
     * 
     * @param description
     *        A description of the event.</p>
     *        <p>
     *        After a scheduled event is completed, it can still be described for up to a week. If the event has been
     *        completed, this description starts with the following text: [Completed].
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * After a scheduled event is completed, it can still be described for up to a week. If the event has been
     * completed, this description starts with the following text: [Completed].
     * </p>
     * 
     * @return A description of the event.</p>
     *         <p>
     *         After a scheduled event is completed, it can still be described for up to a week. If the event has been
     *         completed, this description starts with the following text: [Completed].
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * After a scheduled event is completed, it can still be described for up to a week. If the event has been
     * completed, this description starts with the following text: [Completed].
     * </p>
     * 
     * @param description
     *        A description of the event.</p>
     *        <p>
     *        After a scheduled event is completed, it can still be described for up to a week. If the event has been
     *        completed, this description starts with the following text: [Completed].
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatusEvent withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The earliest scheduled start time for the event.
     * </p>
     * 
     * @param notBefore
     *        The earliest scheduled start time for the event.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The earliest scheduled start time for the event.
     * </p>
     * 
     * @return The earliest scheduled start time for the event.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The earliest scheduled start time for the event.
     * </p>
     * 
     * @param notBefore
     *        The earliest scheduled start time for the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatusEvent withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * <p>
     * The latest scheduled end time for the event.
     * </p>
     * 
     * @param notAfter
     *        The latest scheduled end time for the event.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The latest scheduled end time for the event.
     * </p>
     * 
     * @return The latest scheduled end time for the event.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * The latest scheduled end time for the event.
     * </p>
     * 
     * @param notAfter
     *        The latest scheduled end time for the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatusEvent withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getNotBefore() != null)
            sb.append("NotBefore: " + getNotBefore() + ",");
        if (getNotAfter() != null)
            sb.append("NotAfter: " + getNotAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStatusEvent == false)
            return false;
        InstanceStatusEvent other = (InstanceStatusEvent) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        return hashCode;
    }

    @Override
    public InstanceStatusEvent clone() {
        try {
            return (InstanceStatusEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
