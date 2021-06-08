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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/DeleteSMSSandboxPhoneNumber" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSMSSandboxPhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The destination phone number to delete.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The destination phone number to delete.
     * </p>
     * 
     * @param phoneNumber
     *        The destination phone number to delete.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to delete.
     * </p>
     * 
     * @return The destination phone number to delete.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to delete.
     * </p>
     * 
     * @param phoneNumber
     *        The destination phone number to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSMSSandboxPhoneNumberRequest withPhoneNumber(String phoneNumber) {
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

        if (obj instanceof DeleteSMSSandboxPhoneNumberRequest == false)
            return false;
        DeleteSMSSandboxPhoneNumberRequest other = (DeleteSMSSandboxPhoneNumberRequest) obj;
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
    public DeleteSMSSandboxPhoneNumberRequest clone() {
        return (DeleteSMSSandboxPhoneNumberRequest) super.clone();
    }

}
