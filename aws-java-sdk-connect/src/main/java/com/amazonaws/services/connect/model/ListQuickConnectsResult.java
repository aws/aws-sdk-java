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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQuickConnects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQuickConnectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     */
    private java.util.List<QuickConnectSummary> quickConnectSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     * 
     * @return Information about the quick connects.
     */

    public java.util.List<QuickConnectSummary> getQuickConnectSummaryList() {
        return quickConnectSummaryList;
    }

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     * 
     * @param quickConnectSummaryList
     *        Information about the quick connects.
     */

    public void setQuickConnectSummaryList(java.util.Collection<QuickConnectSummary> quickConnectSummaryList) {
        if (quickConnectSummaryList == null) {
            this.quickConnectSummaryList = null;
            return;
        }

        this.quickConnectSummaryList = new java.util.ArrayList<QuickConnectSummary>(quickConnectSummaryList);
    }

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuickConnectSummaryList(java.util.Collection)} or
     * {@link #withQuickConnectSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param quickConnectSummaryList
     *        Information about the quick connects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuickConnectsResult withQuickConnectSummaryList(QuickConnectSummary... quickConnectSummaryList) {
        if (this.quickConnectSummaryList == null) {
            setQuickConnectSummaryList(new java.util.ArrayList<QuickConnectSummary>(quickConnectSummaryList.length));
        }
        for (QuickConnectSummary ele : quickConnectSummaryList) {
            this.quickConnectSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the quick connects.
     * </p>
     * 
     * @param quickConnectSummaryList
     *        Information about the quick connects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuickConnectsResult withQuickConnectSummaryList(java.util.Collection<QuickConnectSummary> quickConnectSummaryList) {
        setQuickConnectSummaryList(quickConnectSummaryList);
        return this;
    }

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

    public ListQuickConnectsResult withNextToken(String nextToken) {
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
        if (getQuickConnectSummaryList() != null)
            sb.append("QuickConnectSummaryList: ").append(getQuickConnectSummaryList()).append(",");
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

        if (obj instanceof ListQuickConnectsResult == false)
            return false;
        ListQuickConnectsResult other = (ListQuickConnectsResult) obj;
        if (other.getQuickConnectSummaryList() == null ^ this.getQuickConnectSummaryList() == null)
            return false;
        if (other.getQuickConnectSummaryList() != null && other.getQuickConnectSummaryList().equals(this.getQuickConnectSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getQuickConnectSummaryList() == null) ? 0 : getQuickConnectSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListQuickConnectsResult clone() {
        try {
            return (ListQuickConnectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
