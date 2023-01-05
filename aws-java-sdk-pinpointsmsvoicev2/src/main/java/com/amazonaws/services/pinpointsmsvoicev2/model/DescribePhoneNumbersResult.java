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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePhoneNumbers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePhoneNumbersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     * </p>
     */
    private java.util.List<PhoneNumberInformation> phoneNumbers;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     * </p>
     * 
     * @return An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     */

    public java.util.List<PhoneNumberInformation> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * <p>
     * An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     * </p>
     * 
     * @param phoneNumbers
     *        An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     */

    public void setPhoneNumbers(java.util.Collection<PhoneNumberInformation> phoneNumbers) {
        if (phoneNumbers == null) {
            this.phoneNumbers = null;
            return;
        }

        this.phoneNumbers = new java.util.ArrayList<PhoneNumberInformation>(phoneNumbers);
    }

    /**
     * <p>
     * An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumbers(java.util.Collection)} or {@link #withPhoneNumbers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param phoneNumbers
     *        An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersResult withPhoneNumbers(PhoneNumberInformation... phoneNumbers) {
        if (this.phoneNumbers == null) {
            setPhoneNumbers(new java.util.ArrayList<PhoneNumberInformation>(phoneNumbers.length));
        }
        for (PhoneNumberInformation ele : phoneNumbers) {
            this.phoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     * </p>
     * 
     * @param phoneNumbers
     *        An array of PhoneNumberInformation objects that contain the details for the requested phone numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersResult withPhoneNumbers(java.util.Collection<PhoneNumberInformation> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. If this field is empty then there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePhoneNumbersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPhoneNumbers() != null)
            sb.append("PhoneNumbers: ").append(getPhoneNumbers()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePhoneNumbersResult == false)
            return false;
        DescribePhoneNumbersResult other = (DescribePhoneNumbersResult) obj;
        if (other.getPhoneNumbers() == null ^ this.getPhoneNumbers() == null)
            return false;
        if (other.getPhoneNumbers() != null && other.getPhoneNumbers().equals(this.getPhoneNumbers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumbers() == null) ? 0 : getPhoneNumbers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePhoneNumbersResult clone() {
        try {
            return (DescribePhoneNumbersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
