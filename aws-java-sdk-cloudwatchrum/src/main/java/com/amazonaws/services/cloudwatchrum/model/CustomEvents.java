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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about custom events for this app monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/CustomEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomEvents implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        Specifies whether this app monitor allows the web client to define and send custom events. The default is
     *        for custom events to be <code>DISABLED</code>.
     * @see CustomEventsStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     * 
     * @return Specifies whether this app monitor allows the web client to define and send custom events. The default is
     *         for custom events to be <code>DISABLED</code>.
     * @see CustomEventsStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        Specifies whether this app monitor allows the web client to define and send custom events. The default is
     *        for custom events to be <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomEventsStatus
     */

    public CustomEvents withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether this app monitor allows the web client to define and send custom events. The default is for
     * custom events to be <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        Specifies whether this app monitor allows the web client to define and send custom events. The default is
     *        for custom events to be <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomEventsStatus
     */

    public CustomEvents withStatus(CustomEventsStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomEvents == false)
            return false;
        CustomEvents other = (CustomEvents) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CustomEvents clone() {
        try {
            return (CustomEvents) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.CustomEventsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
