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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactFlowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     */
    private java.util.List<ContactFlowSummary> contactFlowSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @return Information about the contact flows.
     */

    public java.util.List<ContactFlowSummary> getContactFlowSummaryList() {
        return contactFlowSummaryList;
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @param contactFlowSummaryList
     *        Information about the contact flows.
     */

    public void setContactFlowSummaryList(java.util.Collection<ContactFlowSummary> contactFlowSummaryList) {
        if (contactFlowSummaryList == null) {
            this.contactFlowSummaryList = null;
            return;
        }

        this.contactFlowSummaryList = new java.util.ArrayList<ContactFlowSummary>(contactFlowSummaryList);
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactFlowSummaryList(java.util.Collection)} or
     * {@link #withContactFlowSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param contactFlowSummaryList
     *        Information about the contact flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactFlowsResult withContactFlowSummaryList(ContactFlowSummary... contactFlowSummaryList) {
        if (this.contactFlowSummaryList == null) {
            setContactFlowSummaryList(new java.util.ArrayList<ContactFlowSummary>(contactFlowSummaryList.length));
        }
        for (ContactFlowSummary ele : contactFlowSummaryList) {
            this.contactFlowSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the contact flows.
     * </p>
     * 
     * @param contactFlowSummaryList
     *        Information about the contact flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactFlowsResult withContactFlowSummaryList(java.util.Collection<ContactFlowSummary> contactFlowSummaryList) {
        setContactFlowSummaryList(contactFlowSummaryList);
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

    public ListContactFlowsResult withNextToken(String nextToken) {
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
        if (getContactFlowSummaryList() != null)
            sb.append("ContactFlowSummaryList: ").append(getContactFlowSummaryList()).append(",");
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

        if (obj instanceof ListContactFlowsResult == false)
            return false;
        ListContactFlowsResult other = (ListContactFlowsResult) obj;
        if (other.getContactFlowSummaryList() == null ^ this.getContactFlowSummaryList() == null)
            return false;
        if (other.getContactFlowSummaryList() != null && other.getContactFlowSummaryList().equals(this.getContactFlowSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getContactFlowSummaryList() == null) ? 0 : getContactFlowSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactFlowsResult clone() {
        try {
            return (ListContactFlowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
