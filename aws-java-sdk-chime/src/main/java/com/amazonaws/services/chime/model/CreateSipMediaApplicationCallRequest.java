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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipMediaApplicationCall"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSipMediaApplicationCallRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The phone number that a user calls from.
     * </p>
     */
    private String fromPhoneNumber;
    /**
     * <p>
     * The phone number that the user dials in order to connect to a meeting
     * </p>
     */
    private String toPhoneNumber;
    /**
     * <p>
     * The ID of the SIP media application.
     * </p>
     */
    private String sipMediaApplicationId;

    /**
     * <p>
     * The phone number that a user calls from.
     * </p>
     * 
     * @param fromPhoneNumber
     *        The phone number that a user calls from.
     */

    public void setFromPhoneNumber(String fromPhoneNumber) {
        this.fromPhoneNumber = fromPhoneNumber;
    }

    /**
     * <p>
     * The phone number that a user calls from.
     * </p>
     * 
     * @return The phone number that a user calls from.
     */

    public String getFromPhoneNumber() {
        return this.fromPhoneNumber;
    }

    /**
     * <p>
     * The phone number that a user calls from.
     * </p>
     * 
     * @param fromPhoneNumber
     *        The phone number that a user calls from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest withFromPhoneNumber(String fromPhoneNumber) {
        setFromPhoneNumber(fromPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The phone number that the user dials in order to connect to a meeting
     * </p>
     * 
     * @param toPhoneNumber
     *        The phone number that the user dials in order to connect to a meeting
     */

    public void setToPhoneNumber(String toPhoneNumber) {
        this.toPhoneNumber = toPhoneNumber;
    }

    /**
     * <p>
     * The phone number that the user dials in order to connect to a meeting
     * </p>
     * 
     * @return The phone number that the user dials in order to connect to a meeting
     */

    public String getToPhoneNumber() {
        return this.toPhoneNumber;
    }

    /**
     * <p>
     * The phone number that the user dials in order to connect to a meeting
     * </p>
     * 
     * @param toPhoneNumber
     *        The phone number that the user dials in order to connect to a meeting
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest withToPhoneNumber(String toPhoneNumber) {
        setToPhoneNumber(toPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The ID of the SIP media application.
     * </p>
     * 
     * @param sipMediaApplicationId
     *        The ID of the SIP media application.
     */

    public void setSipMediaApplicationId(String sipMediaApplicationId) {
        this.sipMediaApplicationId = sipMediaApplicationId;
    }

    /**
     * <p>
     * The ID of the SIP media application.
     * </p>
     * 
     * @return The ID of the SIP media application.
     */

    public String getSipMediaApplicationId() {
        return this.sipMediaApplicationId;
    }

    /**
     * <p>
     * The ID of the SIP media application.
     * </p>
     * 
     * @param sipMediaApplicationId
     *        The ID of the SIP media application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationCallRequest withSipMediaApplicationId(String sipMediaApplicationId) {
        setSipMediaApplicationId(sipMediaApplicationId);
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
        if (getFromPhoneNumber() != null)
            sb.append("FromPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getToPhoneNumber() != null)
            sb.append("ToPhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getSipMediaApplicationId() != null)
            sb.append("SipMediaApplicationId: ").append(getSipMediaApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSipMediaApplicationCallRequest == false)
            return false;
        CreateSipMediaApplicationCallRequest other = (CreateSipMediaApplicationCallRequest) obj;
        if (other.getFromPhoneNumber() == null ^ this.getFromPhoneNumber() == null)
            return false;
        if (other.getFromPhoneNumber() != null && other.getFromPhoneNumber().equals(this.getFromPhoneNumber()) == false)
            return false;
        if (other.getToPhoneNumber() == null ^ this.getToPhoneNumber() == null)
            return false;
        if (other.getToPhoneNumber() != null && other.getToPhoneNumber().equals(this.getToPhoneNumber()) == false)
            return false;
        if (other.getSipMediaApplicationId() == null ^ this.getSipMediaApplicationId() == null)
            return false;
        if (other.getSipMediaApplicationId() != null && other.getSipMediaApplicationId().equals(this.getSipMediaApplicationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPhoneNumber() == null) ? 0 : getFromPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getToPhoneNumber() == null) ? 0 : getToPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getSipMediaApplicationId() == null) ? 0 : getSipMediaApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSipMediaApplicationCallRequest clone() {
        return (CreateSipMediaApplicationCallRequest) super.clone();
    }

}
