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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a phone number for a quick connect.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PhoneNumberQuickConnectConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberQuickConnectConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone number in E.164 format.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The phone number in E.164 format.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number in E.164 format.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number in E.164 format.
     * </p>
     * 
     * @return The phone number in E.164 format.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number in E.164 format.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberQuickConnectConfig withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
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
            sb.append("PhoneNumber: ").append(getPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberQuickConnectConfig == false)
            return false;
        PhoneNumberQuickConnectConfig other = (PhoneNumberQuickConnectConfig) obj;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumberQuickConnectConfig clone() {
        try {
            return (PhoneNumberQuickConnectConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.PhoneNumberQuickConnectConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
