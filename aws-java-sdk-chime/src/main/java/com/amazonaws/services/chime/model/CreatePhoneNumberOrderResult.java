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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreatePhoneNumberOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePhoneNumberOrderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The phone number order details.
     * </p>
     */
    private PhoneNumberOrder phoneNumberOrder;

    /**
     * <p>
     * The phone number order details.
     * </p>
     * 
     * @param phoneNumberOrder
     *        The phone number order details.
     */

    public void setPhoneNumberOrder(PhoneNumberOrder phoneNumberOrder) {
        this.phoneNumberOrder = phoneNumberOrder;
    }

    /**
     * <p>
     * The phone number order details.
     * </p>
     * 
     * @return The phone number order details.
     */

    public PhoneNumberOrder getPhoneNumberOrder() {
        return this.phoneNumberOrder;
    }

    /**
     * <p>
     * The phone number order details.
     * </p>
     * 
     * @param phoneNumberOrder
     *        The phone number order details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePhoneNumberOrderResult withPhoneNumberOrder(PhoneNumberOrder phoneNumberOrder) {
        setPhoneNumberOrder(phoneNumberOrder);
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
        if (getPhoneNumberOrder() != null)
            sb.append("PhoneNumberOrder: ").append(getPhoneNumberOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePhoneNumberOrderResult == false)
            return false;
        CreatePhoneNumberOrderResult other = (CreatePhoneNumberOrderResult) obj;
        if (other.getPhoneNumberOrder() == null ^ this.getPhoneNumberOrder() == null)
            return false;
        if (other.getPhoneNumberOrder() != null && other.getPhoneNumberOrder().equals(this.getPhoneNumberOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberOrder() == null) ? 0 : getPhoneNumberOrder().hashCode());
        return hashCode;
    }

    @Override
    public CreatePhoneNumberOrderResult clone() {
        try {
            return (CreatePhoneNumberOrderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
