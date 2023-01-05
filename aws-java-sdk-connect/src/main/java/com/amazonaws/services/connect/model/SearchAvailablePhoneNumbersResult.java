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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchAvailablePhoneNumbers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAvailablePhoneNumbersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     */
    private java.util.List<AvailableNumberSummary> availableNumbersList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     * 
     * @return A list of available phone numbers that you can claim to your Amazon Connect instance or traffic
     *         distribution group.
     */

    public java.util.List<AvailableNumberSummary> getAvailableNumbersList() {
        return availableNumbersList;
    }

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     * 
     * @param availableNumbersList
     *        A list of available phone numbers that you can claim to your Amazon Connect instance or traffic
     *        distribution group.
     */

    public void setAvailableNumbersList(java.util.Collection<AvailableNumberSummary> availableNumbersList) {
        if (availableNumbersList == null) {
            this.availableNumbersList = null;
            return;
        }

        this.availableNumbersList = new java.util.ArrayList<AvailableNumberSummary>(availableNumbersList);
    }

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailableNumbersList(java.util.Collection)} or {@link #withAvailableNumbersList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param availableNumbersList
     *        A list of available phone numbers that you can claim to your Amazon Connect instance or traffic
     *        distribution group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersResult withAvailableNumbersList(AvailableNumberSummary... availableNumbersList) {
        if (this.availableNumbersList == null) {
            setAvailableNumbersList(new java.util.ArrayList<AvailableNumberSummary>(availableNumbersList.length));
        }
        for (AvailableNumberSummary ele : availableNumbersList) {
            this.availableNumbersList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     * 
     * @param availableNumbersList
     *        A list of available phone numbers that you can claim to your Amazon Connect instance or traffic
     *        distribution group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersResult withAvailableNumbersList(java.util.Collection<AvailableNumberSummary> availableNumbersList) {
        setAvailableNumbersList(availableNumbersList);
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
        if (getAvailableNumbersList() != null)
            sb.append("AvailableNumbersList: ").append(getAvailableNumbersList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAvailablePhoneNumbersResult == false)
            return false;
        SearchAvailablePhoneNumbersResult other = (SearchAvailablePhoneNumbersResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAvailableNumbersList() == null ^ this.getAvailableNumbersList() == null)
            return false;
        if (other.getAvailableNumbersList() != null && other.getAvailableNumbersList().equals(this.getAvailableNumbersList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAvailableNumbersList() == null) ? 0 : getAvailableNumbersList().hashCode());
        return hashCode;
    }

    @Override
    public SearchAvailablePhoneNumbersResult clone() {
        try {
            return (SearchAvailablePhoneNumbersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
