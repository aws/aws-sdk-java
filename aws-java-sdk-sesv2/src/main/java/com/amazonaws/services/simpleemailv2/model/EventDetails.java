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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a <code>Bounce</code> object if the event type is <code>BOUNCE</code>. Contains a <code>Complaint</code>
 * object if the event type is <code>COMPLAINT</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/EventDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a <code>Bounce</code> event.
     * </p>
     */
    private Bounce bounce;
    /**
     * <p>
     * Information about a <code>Complaint</code> event.
     * </p>
     */
    private Complaint complaint;

    /**
     * <p>
     * Information about a <code>Bounce</code> event.
     * </p>
     * 
     * @param bounce
     *        Information about a <code>Bounce</code> event.
     */

    public void setBounce(Bounce bounce) {
        this.bounce = bounce;
    }

    /**
     * <p>
     * Information about a <code>Bounce</code> event.
     * </p>
     * 
     * @return Information about a <code>Bounce</code> event.
     */

    public Bounce getBounce() {
        return this.bounce;
    }

    /**
     * <p>
     * Information about a <code>Bounce</code> event.
     * </p>
     * 
     * @param bounce
     *        Information about a <code>Bounce</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDetails withBounce(Bounce bounce) {
        setBounce(bounce);
        return this;
    }

    /**
     * <p>
     * Information about a <code>Complaint</code> event.
     * </p>
     * 
     * @param complaint
     *        Information about a <code>Complaint</code> event.
     */

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    /**
     * <p>
     * Information about a <code>Complaint</code> event.
     * </p>
     * 
     * @return Information about a <code>Complaint</code> event.
     */

    public Complaint getComplaint() {
        return this.complaint;
    }

    /**
     * <p>
     * Information about a <code>Complaint</code> event.
     * </p>
     * 
     * @param complaint
     *        Information about a <code>Complaint</code> event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDetails withComplaint(Complaint complaint) {
        setComplaint(complaint);
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
        if (getBounce() != null)
            sb.append("Bounce: ").append(getBounce()).append(",");
        if (getComplaint() != null)
            sb.append("Complaint: ").append(getComplaint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDetails == false)
            return false;
        EventDetails other = (EventDetails) obj;
        if (other.getBounce() == null ^ this.getBounce() == null)
            return false;
        if (other.getBounce() != null && other.getBounce().equals(this.getBounce()) == false)
            return false;
        if (other.getComplaint() == null ^ this.getComplaint() == null)
            return false;
        if (other.getComplaint() != null && other.getComplaint().equals(this.getComplaint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBounce() == null) ? 0 : getBounce().hashCode());
        hashCode = prime * hashCode + ((getComplaint() == null) ? 0 : getComplaint().hashCode());
        return hashCode;
    }

    @Override
    public EventDetails clone() {
        try {
            return (EventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.EventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
