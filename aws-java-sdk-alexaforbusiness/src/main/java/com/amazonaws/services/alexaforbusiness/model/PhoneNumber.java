/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The phone number for the contact containing the raw number and phone number type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumber implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The raw value of the phone number.
     * </p>
     */
    private String number;
    /**
     * <p>
     * The type of the phone number.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The raw value of the phone number.
     * </p>
     * 
     * @param number
     *        The raw value of the phone number.
     */

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * <p>
     * The raw value of the phone number.
     * </p>
     * 
     * @return The raw value of the phone number.
     */

    public String getNumber() {
        return this.number;
    }

    /**
     * <p>
     * The raw value of the phone number.
     * </p>
     * 
     * @param number
     *        The raw value of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withNumber(String number) {
        setNumber(number);
        return this;
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * 
     * @param type
     *        The type of the phone number.
     * @see PhoneNumberType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * 
     * @return The type of the phone number.
     * @see PhoneNumberType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * 
     * @param type
     *        The type of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public PhoneNumber withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the phone number.
     * </p>
     * 
     * @param type
     *        The type of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public PhoneNumber withType(PhoneNumberType type) {
        this.type = type.toString();
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
        if (getNumber() != null)
            sb.append("Number: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumber == false)
            return false;
        PhoneNumber other = (PhoneNumber) obj;
        if (other.getNumber() == null ^ this.getNumber() == null)
            return false;
        if (other.getNumber() != null && other.getNumber().equals(this.getNumber()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumber() == null) ? 0 : getNumber().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.PhoneNumberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
