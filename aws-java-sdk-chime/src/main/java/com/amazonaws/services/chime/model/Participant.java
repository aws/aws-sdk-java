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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The phone number and proxy phone number for a participant in an Amazon Chime Voice Connector proxy session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Participant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Participant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The participant's phone number.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The participant's proxy phone number.
     * </p>
     */
    private String proxyPhoneNumber;

    /**
     * <p>
     * The participant's phone number.
     * </p>
     * 
     * @param phoneNumber
     *        The participant's phone number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The participant's phone number.
     * </p>
     * 
     * @return The participant's phone number.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The participant's phone number.
     * </p>
     * 
     * @param phoneNumber
     *        The participant's phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The participant's proxy phone number.
     * </p>
     * 
     * @param proxyPhoneNumber
     *        The participant's proxy phone number.
     */

    public void setProxyPhoneNumber(String proxyPhoneNumber) {
        this.proxyPhoneNumber = proxyPhoneNumber;
    }

    /**
     * <p>
     * The participant's proxy phone number.
     * </p>
     * 
     * @return The participant's proxy phone number.
     */

    public String getProxyPhoneNumber() {
        return this.proxyPhoneNumber;
    }

    /**
     * <p>
     * The participant's proxy phone number.
     * </p>
     * 
     * @param proxyPhoneNumber
     *        The participant's proxy phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participant withProxyPhoneNumber(String proxyPhoneNumber) {
        setProxyPhoneNumber(proxyPhoneNumber);
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
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getProxyPhoneNumber() != null)
            sb.append("ProxyPhoneNumber: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Participant == false)
            return false;
        Participant other = (Participant) obj;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getProxyPhoneNumber() == null ^ this.getProxyPhoneNumber() == null)
            return false;
        if (other.getProxyPhoneNumber() != null && other.getProxyPhoneNumber().equals(this.getProxyPhoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getProxyPhoneNumber() == null) ? 0 : getProxyPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public Participant clone() {
        try {
            return (Participant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ParticipantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
