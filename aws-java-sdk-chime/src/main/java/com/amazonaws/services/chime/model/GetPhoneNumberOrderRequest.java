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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPhoneNumberOrderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the phone number order.
     * </p>
     */
    private String phoneNumberOrderId;

    /**
     * <p>
     * The ID for the phone number order.
     * </p>
     * 
     * @param phoneNumberOrderId
     *        The ID for the phone number order.
     */

    public void setPhoneNumberOrderId(String phoneNumberOrderId) {
        this.phoneNumberOrderId = phoneNumberOrderId;
    }

    /**
     * <p>
     * The ID for the phone number order.
     * </p>
     * 
     * @return The ID for the phone number order.
     */

    public String getPhoneNumberOrderId() {
        return this.phoneNumberOrderId;
    }

    /**
     * <p>
     * The ID for the phone number order.
     * </p>
     * 
     * @param phoneNumberOrderId
     *        The ID for the phone number order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPhoneNumberOrderRequest withPhoneNumberOrderId(String phoneNumberOrderId) {
        setPhoneNumberOrderId(phoneNumberOrderId);
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
        if (getPhoneNumberOrderId() != null)
            sb.append("PhoneNumberOrderId: ").append(getPhoneNumberOrderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPhoneNumberOrderRequest == false)
            return false;
        GetPhoneNumberOrderRequest other = (GetPhoneNumberOrderRequest) obj;
        if (other.getPhoneNumberOrderId() == null ^ this.getPhoneNumberOrderId() == null)
            return false;
        if (other.getPhoneNumberOrderId() != null && other.getPhoneNumberOrderId().equals(this.getPhoneNumberOrderId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberOrderId() == null) ? 0 : getPhoneNumberOrderId().hashCode());
        return hashCode;
    }

    @Override
    public GetPhoneNumberOrderRequest clone() {
        return (GetPhoneNumberOrderRequest) super.clone();
    }

}
