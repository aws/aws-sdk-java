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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbersV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPhoneNumbersV2Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon Connect instances or traffic distribution
     * groups.
     * </p>
     */
    private java.util.List<ListPhoneNumbersSummary> listPhoneNumbersSummaryList;

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

    public ListPhoneNumbersV2Result withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon Connect instances or traffic distribution
     * groups.
     * </p>
     * 
     * @return Information about phone numbers that have been claimed to your Amazon Connect instances or traffic
     *         distribution groups.
     */

    public java.util.List<ListPhoneNumbersSummary> getListPhoneNumbersSummaryList() {
        return listPhoneNumbersSummaryList;
    }

    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon Connect instances or traffic distribution
     * groups.
     * </p>
     * 
     * @param listPhoneNumbersSummaryList
     *        Information about phone numbers that have been claimed to your Amazon Connect instances or traffic
     *        distribution groups.
     */

    public void setListPhoneNumbersSummaryList(java.util.Collection<ListPhoneNumbersSummary> listPhoneNumbersSummaryList) {
        if (listPhoneNumbersSummaryList == null) {
            this.listPhoneNumbersSummaryList = null;
            return;
        }

        this.listPhoneNumbersSummaryList = new java.util.ArrayList<ListPhoneNumbersSummary>(listPhoneNumbersSummaryList);
    }

    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon Connect instances or traffic distribution
     * groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListPhoneNumbersSummaryList(java.util.Collection)} or
     * {@link #withListPhoneNumbersSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param listPhoneNumbersSummaryList
     *        Information about phone numbers that have been claimed to your Amazon Connect instances or traffic
     *        distribution groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersV2Result withListPhoneNumbersSummaryList(ListPhoneNumbersSummary... listPhoneNumbersSummaryList) {
        if (this.listPhoneNumbersSummaryList == null) {
            setListPhoneNumbersSummaryList(new java.util.ArrayList<ListPhoneNumbersSummary>(listPhoneNumbersSummaryList.length));
        }
        for (ListPhoneNumbersSummary ele : listPhoneNumbersSummaryList) {
            this.listPhoneNumbersSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon Connect instances or traffic distribution
     * groups.
     * </p>
     * 
     * @param listPhoneNumbersSummaryList
     *        Information about phone numbers that have been claimed to your Amazon Connect instances or traffic
     *        distribution groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersV2Result withListPhoneNumbersSummaryList(java.util.Collection<ListPhoneNumbersSummary> listPhoneNumbersSummaryList) {
        setListPhoneNumbersSummaryList(listPhoneNumbersSummaryList);
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
        if (getListPhoneNumbersSummaryList() != null)
            sb.append("ListPhoneNumbersSummaryList: ").append(getListPhoneNumbersSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPhoneNumbersV2Result == false)
            return false;
        ListPhoneNumbersV2Result other = (ListPhoneNumbersV2Result) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getListPhoneNumbersSummaryList() == null ^ this.getListPhoneNumbersSummaryList() == null)
            return false;
        if (other.getListPhoneNumbersSummaryList() != null && other.getListPhoneNumbersSummaryList().equals(this.getListPhoneNumbersSummaryList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getListPhoneNumbersSummaryList() == null) ? 0 : getListPhoneNumbersSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public ListPhoneNumbersV2Result clone() {
        try {
            return (ListPhoneNumbersV2Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
