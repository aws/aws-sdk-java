/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains a <code>Message</code> and a <code>Timestamp</code> value for changes that you make in
 * the status an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ByoipCidrEvent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByoipCidrEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string that contains an <code>Event</code> message describing changes that you make in the status of an IP
     * address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
     * </p>
     */
    private String message;
    /**
     * <p>
     * A timestamp when you make a status change for an IP address range that you bring to AWS Global Accelerator
     * through bring your own IP address (BYOIP).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * A string that contains an <code>Event</code> message describing changes that you make in the status of an IP
     * address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
     * </p>
     * 
     * @param message
     *        A string that contains an <code>Event</code> message describing changes that you make in the status of an
     *        IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A string that contains an <code>Event</code> message describing changes that you make in the status of an IP
     * address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
     * </p>
     * 
     * @return A string that contains an <code>Event</code> message describing changes that you make in the status of an
     *         IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A string that contains an <code>Event</code> message describing changes that you make in the status of an IP
     * address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
     * </p>
     * 
     * @param message
     *        A string that contains an <code>Event</code> message describing changes that you make in the status of an
     *        IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidrEvent withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A timestamp when you make a status change for an IP address range that you bring to AWS Global Accelerator
     * through bring your own IP address (BYOIP).
     * </p>
     * 
     * @param timestamp
     *        A timestamp when you make a status change for an IP address range that you bring to AWS Global Accelerator
     *        through bring your own IP address (BYOIP).
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * A timestamp when you make a status change for an IP address range that you bring to AWS Global Accelerator
     * through bring your own IP address (BYOIP).
     * </p>
     * 
     * @return A timestamp when you make a status change for an IP address range that you bring to AWS Global
     *         Accelerator through bring your own IP address (BYOIP).
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * A timestamp when you make a status change for an IP address range that you bring to AWS Global Accelerator
     * through bring your own IP address (BYOIP).
     * </p>
     * 
     * @param timestamp
     *        A timestamp when you make a status change for an IP address range that you bring to AWS Global Accelerator
     *        through bring your own IP address (BYOIP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByoipCidrEvent withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByoipCidrEvent == false)
            return false;
        ByoipCidrEvent other = (ByoipCidrEvent) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ByoipCidrEvent clone() {
        try {
            return (ByoipCidrEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.ByoipCidrEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
