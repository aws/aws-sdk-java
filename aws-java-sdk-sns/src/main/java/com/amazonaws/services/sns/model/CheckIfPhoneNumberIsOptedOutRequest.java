/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <code>CheckIfPhoneNumberIsOptedOut</code> action.
 * </p>
 */
public class CheckIfPhoneNumberIsOptedOutRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The phone number for which you want to check the opt out status.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The phone number for which you want to check the opt out status.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number for which you want to check the opt out status.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number for which you want to check the opt out status.
     * </p>
     * 
     * @return The phone number for which you want to check the opt out status.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number for which you want to check the opt out status.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number for which you want to check the opt out status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckIfPhoneNumberIsOptedOutRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("PhoneNumber: " + getPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckIfPhoneNumberIsOptedOutRequest == false)
            return false;
        CheckIfPhoneNumberIsOptedOutRequest other = (CheckIfPhoneNumberIsOptedOutRequest) obj;
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
    public CheckIfPhoneNumberIsOptedOutRequest clone() {
        return (CheckIfPhoneNumberIsOptedOutRequest) super.clone();
    }
}
