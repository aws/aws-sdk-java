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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumberOrders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPhoneNumberOrdersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The phone number order details.
     * </p>
     */
    private java.util.List<PhoneNumberOrder> phoneNumberOrders;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The phone number order details.
     * </p>
     * 
     * @return The phone number order details.
     */

    public java.util.List<PhoneNumberOrder> getPhoneNumberOrders() {
        return phoneNumberOrders;
    }

    /**
     * <p>
     * The phone number order details.
     * </p>
     * 
     * @param phoneNumberOrders
     *        The phone number order details.
     */

    public void setPhoneNumberOrders(java.util.Collection<PhoneNumberOrder> phoneNumberOrders) {
        if (phoneNumberOrders == null) {
            this.phoneNumberOrders = null;
            return;
        }

        this.phoneNumberOrders = new java.util.ArrayList<PhoneNumberOrder>(phoneNumberOrders);
    }

    /**
     * <p>
     * The phone number order details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberOrders(java.util.Collection)} or {@link #withPhoneNumberOrders(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param phoneNumberOrders
     *        The phone number order details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumberOrdersResult withPhoneNumberOrders(PhoneNumberOrder... phoneNumberOrders) {
        if (this.phoneNumberOrders == null) {
            setPhoneNumberOrders(new java.util.ArrayList<PhoneNumberOrder>(phoneNumberOrders.length));
        }
        for (PhoneNumberOrder ele : phoneNumberOrders) {
            this.phoneNumberOrders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The phone number order details.
     * </p>
     * 
     * @param phoneNumberOrders
     *        The phone number order details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumberOrdersResult withPhoneNumberOrders(java.util.Collection<PhoneNumberOrder> phoneNumberOrders) {
        setPhoneNumberOrders(phoneNumberOrders);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumberOrdersResult withNextToken(String nextToken) {
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
        if (getPhoneNumberOrders() != null)
            sb.append("PhoneNumberOrders: ").append(getPhoneNumberOrders()).append(",");
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

        if (obj instanceof ListPhoneNumberOrdersResult == false)
            return false;
        ListPhoneNumberOrdersResult other = (ListPhoneNumberOrdersResult) obj;
        if (other.getPhoneNumberOrders() == null ^ this.getPhoneNumberOrders() == null)
            return false;
        if (other.getPhoneNumberOrders() != null && other.getPhoneNumberOrders().equals(this.getPhoneNumberOrders()) == false)
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

        hashCode = prime * hashCode + ((getPhoneNumberOrders() == null) ? 0 : getPhoneNumberOrders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPhoneNumberOrdersResult clone() {
        try {
            return (ListPhoneNumberOrdersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
