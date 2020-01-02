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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the "From" address for an email message that's sent to participants in a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyEmailMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyEmailMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The verified email address to send the email message from. The default address is the FromAddress specified for
     * the email channel for the application.
     * </p>
     */
    private String fromAddress;

    /**
     * <p>
     * The verified email address to send the email message from. The default address is the FromAddress specified for
     * the email channel for the application.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address to send the email message from. The default address is the FromAddress
     *        specified for the email channel for the application.
     */

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default address is the FromAddress specified for
     * the email channel for the application.
     * </p>
     * 
     * @return The verified email address to send the email message from. The default address is the FromAddress
     *         specified for the email channel for the application.
     */

    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * <p>
     * The verified email address to send the email message from. The default address is the FromAddress specified for
     * the email channel for the application.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address to send the email message from. The default address is the FromAddress
     *        specified for the email channel for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyEmailMessage withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
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
        if (getFromAddress() != null)
            sb.append("FromAddress: ").append(getFromAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyEmailMessage == false)
            return false;
        JourneyEmailMessage other = (JourneyEmailMessage) obj;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        return hashCode;
    }

    @Override
    public JourneyEmailMessage clone() {
        try {
            return (JourneyEmailMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyEmailMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
