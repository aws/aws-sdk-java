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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SendContactMethodVerification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendContactMethodVerificationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * 
     * @param protocol
     *        The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * @see ContactMethodVerificationProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * 
     * @return The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * @see ContactMethodVerificationProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * 
     * @param protocol
     *        The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactMethodVerificationProtocol
     */

    public SendContactMethodVerificationRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * 
     * @param protocol
     *        The protocol to verify, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactMethodVerificationProtocol
     */

    public SendContactMethodVerificationRequest withProtocol(ContactMethodVerificationProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendContactMethodVerificationRequest == false)
            return false;
        SendContactMethodVerificationRequest other = (SendContactMethodVerificationRequest) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public SendContactMethodVerificationRequest clone() {
        return (SendContactMethodVerificationRequest) super.clone();
    }

}
