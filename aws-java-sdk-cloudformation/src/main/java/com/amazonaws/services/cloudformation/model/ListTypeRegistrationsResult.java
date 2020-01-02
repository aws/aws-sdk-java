/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypeRegistrations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypeRegistrationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of type registration tokens.
     * </p>
     * <p>
     * Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type registration
     * request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> registrationTokenList;
    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call this action again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of type registration tokens.
     * </p>
     * <p>
     * Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type registration
     * request.
     * </p>
     * 
     * @return A list of type registration tokens.</p>
     *         <p>
     *         Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type
     *         registration request.
     */

    public java.util.List<String> getRegistrationTokenList() {
        if (registrationTokenList == null) {
            registrationTokenList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return registrationTokenList;
    }

    /**
     * <p>
     * A list of type registration tokens.
     * </p>
     * <p>
     * Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type registration
     * request.
     * </p>
     * 
     * @param registrationTokenList
     *        A list of type registration tokens.</p>
     *        <p>
     *        Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type
     *        registration request.
     */

    public void setRegistrationTokenList(java.util.Collection<String> registrationTokenList) {
        if (registrationTokenList == null) {
            this.registrationTokenList = null;
            return;
        }

        this.registrationTokenList = new com.amazonaws.internal.SdkInternalList<String>(registrationTokenList);
    }

    /**
     * <p>
     * A list of type registration tokens.
     * </p>
     * <p>
     * Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type registration
     * request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegistrationTokenList(java.util.Collection)} or
     * {@link #withRegistrationTokenList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param registrationTokenList
     *        A list of type registration tokens.</p>
     *        <p>
     *        Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type
     *        registration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeRegistrationsResult withRegistrationTokenList(String... registrationTokenList) {
        if (this.registrationTokenList == null) {
            setRegistrationTokenList(new com.amazonaws.internal.SdkInternalList<String>(registrationTokenList.length));
        }
        for (String ele : registrationTokenList) {
            this.registrationTokenList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of type registration tokens.
     * </p>
     * <p>
     * Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type registration
     * request.
     * </p>
     * 
     * @param registrationTokenList
     *        A list of type registration tokens.</p>
     *        <p>
     *        Use <code> <a>DescribeTypeRegistration</a> </code> to return detailed information about a type
     *        registration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeRegistrationsResult withRegistrationTokenList(java.util.Collection<String> registrationTokenList) {
        setRegistrationTokenList(registrationTokenList);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call this action again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call this action again and assign that token to the request object's
     *        <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call this action again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @return If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call this action again and assign that token to the request object's
     *         <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *         <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call this action again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call this action again and assign that token to the request object's
     *        <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypeRegistrationsResult withNextToken(String nextToken) {
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
        if (getRegistrationTokenList() != null)
            sb.append("RegistrationTokenList: ").append(getRegistrationTokenList()).append(",");
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

        if (obj instanceof ListTypeRegistrationsResult == false)
            return false;
        ListTypeRegistrationsResult other = (ListTypeRegistrationsResult) obj;
        if (other.getRegistrationTokenList() == null ^ this.getRegistrationTokenList() == null)
            return false;
        if (other.getRegistrationTokenList() != null && other.getRegistrationTokenList().equals(this.getRegistrationTokenList()) == false)
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

        hashCode = prime * hashCode + ((getRegistrationTokenList() == null) ? 0 : getRegistrationTokenList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTypeRegistrationsResult clone() {
        try {
            return (ListTypeRegistrationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
