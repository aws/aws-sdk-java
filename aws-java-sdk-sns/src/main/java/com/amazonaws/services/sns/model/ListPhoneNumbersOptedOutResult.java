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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response from the <code>ListPhoneNumbersOptedOut</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListPhoneNumbersOptedOut" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPhoneNumbersOptedOutResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can
     * contain up to 100 phone numbers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> phoneNumbers;
    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the <code>ListPhoneNumbersOptedOut</code> action if
     * additional records are available after the first page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can
     * contain up to 100 phone numbers.
     * </p>
     * 
     * @return A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each
     *         page can contain up to 100 phone numbers.
     */

    public java.util.List<String> getPhoneNumbers() {
        if (phoneNumbers == null) {
            phoneNumbers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return phoneNumbers;
    }

    /**
     * <p>
     * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can
     * contain up to 100 phone numbers.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page
     *        can contain up to 100 phone numbers.
     */

    public void setPhoneNumbers(java.util.Collection<String> phoneNumbers) {
        if (phoneNumbers == null) {
            this.phoneNumbers = null;
            return;
        }

        this.phoneNumbers = new com.amazonaws.internal.SdkInternalList<String>(phoneNumbers);
    }

    /**
     * <p>
     * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can
     * contain up to 100 phone numbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumbers(java.util.Collection)} or {@link #withPhoneNumbers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page
     *        can contain up to 100 phone numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersOptedOutResult withPhoneNumbers(String... phoneNumbers) {
        if (this.phoneNumbers == null) {
            setPhoneNumbers(new com.amazonaws.internal.SdkInternalList<String>(phoneNumbers.length));
        }
        for (String ele : phoneNumbers) {
            this.phoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can
     * contain up to 100 phone numbers.
     * </p>
     * 
     * @param phoneNumbers
     *        A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page
     *        can contain up to 100 phone numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersOptedOutResult withPhoneNumbers(java.util.Collection<String> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
        return this;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the <code>ListPhoneNumbersOptedOut</code> action if
     * additional records are available after the first page of results.
     * </p>
     * 
     * @param nextToken
     *        A <code>NextToken</code> string is returned when you call the <code>ListPhoneNumbersOptedOut</code> action
     *        if additional records are available after the first page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the <code>ListPhoneNumbersOptedOut</code> action if
     * additional records are available after the first page of results.
     * </p>
     * 
     * @return A <code>NextToken</code> string is returned when you call the <code>ListPhoneNumbersOptedOut</code>
     *         action if additional records are available after the first page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the <code>ListPhoneNumbersOptedOut</code> action if
     * additional records are available after the first page of results.
     * </p>
     * 
     * @param nextToken
     *        A <code>NextToken</code> string is returned when you call the <code>ListPhoneNumbersOptedOut</code> action
     *        if additional records are available after the first page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersOptedOutResult withNextToken(String nextToken) {
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

        if (obj instanceof ListPhoneNumbersOptedOutResult == false)
            return false;
        ListPhoneNumbersOptedOutResult other = (ListPhoneNumbersOptedOutResult) obj;
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
    public ListPhoneNumbersOptedOutResult clone() {
        try {
            return (ListPhoneNumbersOptedOutResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
