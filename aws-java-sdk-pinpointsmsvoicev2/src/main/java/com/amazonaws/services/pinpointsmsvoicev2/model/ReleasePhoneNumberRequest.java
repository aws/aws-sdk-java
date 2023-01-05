/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleasePhoneNumber"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleasePhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The PhoneNumberId or PhoneNumberArn of the phone number to release. You can use <a>DescribePhoneNumbers</a> to
     * get the values for PhoneNumberId and PhoneNumberArn.
     * </p>
     */
    private String phoneNumberId;

    /**
     * <p>
     * The PhoneNumberId or PhoneNumberArn of the phone number to release. You can use <a>DescribePhoneNumbers</a> to
     * get the values for PhoneNumberId and PhoneNumberArn.
     * </p>
     * 
     * @param phoneNumberId
     *        The PhoneNumberId or PhoneNumberArn of the phone number to release. You can use
     *        <a>DescribePhoneNumbers</a> to get the values for PhoneNumberId and PhoneNumberArn.
     */

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * The PhoneNumberId or PhoneNumberArn of the phone number to release. You can use <a>DescribePhoneNumbers</a> to
     * get the values for PhoneNumberId and PhoneNumberArn.
     * </p>
     * 
     * @return The PhoneNumberId or PhoneNumberArn of the phone number to release. You can use
     *         <a>DescribePhoneNumbers</a> to get the values for PhoneNumberId and PhoneNumberArn.
     */

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /**
     * <p>
     * The PhoneNumberId or PhoneNumberArn of the phone number to release. You can use <a>DescribePhoneNumbers</a> to
     * get the values for PhoneNumberId and PhoneNumberArn.
     * </p>
     * 
     * @param phoneNumberId
     *        The PhoneNumberId or PhoneNumberArn of the phone number to release. You can use
     *        <a>DescribePhoneNumbers</a> to get the values for PhoneNumberId and PhoneNumberArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberRequest withPhoneNumberId(String phoneNumberId) {
        setPhoneNumberId(phoneNumberId);
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: ").append(getPhoneNumberId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleasePhoneNumberRequest == false)
            return false;
        ReleasePhoneNumberRequest other = (ReleasePhoneNumberRequest) obj;
        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        return hashCode;
    }

    @Override
    public ReleasePhoneNumberRequest clone() {
        return (ReleasePhoneNumberRequest) super.clone();
    }

}
