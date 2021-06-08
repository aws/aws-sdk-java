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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListOriginationNumbers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOriginationNumbersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the <code>ListOriginationNumbers</code> operation if
     * additional pages of records are available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of the calling account's verified and pending origination numbers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PhoneNumberInformation> phoneNumbers;

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the <code>ListOriginationNumbers</code> operation if
     * additional pages of records are available.
     * </p>
     * 
     * @param nextToken
     *        A <code>NextToken</code> string is returned when you call the <code>ListOriginationNumbers</code>
     *        operation if additional pages of records are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the <code>ListOriginationNumbers</code> operation if
     * additional pages of records are available.
     * </p>
     * 
     * @return A <code>NextToken</code> string is returned when you call the <code>ListOriginationNumbers</code>
     *         operation if additional pages of records are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the <code>ListOriginationNumbers</code> operation if
     * additional pages of records are available.
     * </p>
     * 
     * @param nextToken
     *        A <code>NextToken</code> string is returned when you call the <code>ListOriginationNumbers</code>
     *        operation if additional pages of records are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginationNumbersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of the calling account's verified and pending origination numbers.
     * </p>
     * 
     * @return A list of the calling account's verified and pending origination numbers.
     */

    public java.util.List<PhoneNumberInformation> getPhoneNumbers() {
        if (phoneNumbers == null) {
            phoneNumbers = new com.amazonaws.internal.SdkInternalList<PhoneNumberInformation>();
        }
        return phoneNumbers;
    }

    /**
     * <p>
     * A list of the calling account's verified and pending origination numbers.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of the calling account's verified and pending origination numbers.
     */

    public void setPhoneNumbers(java.util.Collection<PhoneNumberInformation> phoneNumbers) {
        if (phoneNumbers == null) {
            this.phoneNumbers = null;
            return;
        }

        this.phoneNumbers = new com.amazonaws.internal.SdkInternalList<PhoneNumberInformation>(phoneNumbers);
    }

    /**
     * <p>
     * A list of the calling account's verified and pending origination numbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumbers(java.util.Collection)} or {@link #withPhoneNumbers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of the calling account's verified and pending origination numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginationNumbersResult withPhoneNumbers(PhoneNumberInformation... phoneNumbers) {
        if (this.phoneNumbers == null) {
            setPhoneNumbers(new com.amazonaws.internal.SdkInternalList<PhoneNumberInformation>(phoneNumbers.length));
        }
        for (PhoneNumberInformation ele : phoneNumbers) {
            this.phoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the calling account's verified and pending origination numbers.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of the calling account's verified and pending origination numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginationNumbersResult withPhoneNumbers(java.util.Collection<PhoneNumberInformation> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPhoneNumbers() != null)
            sb.append("PhoneNumbers: ").append(getPhoneNumbers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOriginationNumbersResult == false)
            return false;
        ListOriginationNumbersResult other = (ListOriginationNumbersResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPhoneNumbers() == null ^ this.getPhoneNumbers() == null)
            return false;
        if (other.getPhoneNumbers() != null && other.getPhoneNumbers().equals(this.getPhoneNumbers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumbers() == null) ? 0 : getPhoneNumbers().hashCode());
        return hashCode;
    }

    @Override
    public ListOriginationNumbersResult clone() {
        try {
            return (ListOriginationNumbersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
