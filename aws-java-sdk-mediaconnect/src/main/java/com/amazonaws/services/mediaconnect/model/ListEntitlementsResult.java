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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListEntitlements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitlementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of entitlements that have been granted to you from other AWS accounts. */
    private java.util.List<ListedEntitlement> entitlements;
    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListEntitlements request a second time and specify the
     * NextToken value.
     */
    private String nextToken;

    /**
     * A list of entitlements that have been granted to you from other AWS accounts.
     * 
     * @return A list of entitlements that have been granted to you from other AWS accounts.
     */

    public java.util.List<ListedEntitlement> getEntitlements() {
        return entitlements;
    }

    /**
     * A list of entitlements that have been granted to you from other AWS accounts.
     * 
     * @param entitlements
     *        A list of entitlements that have been granted to you from other AWS accounts.
     */

    public void setEntitlements(java.util.Collection<ListedEntitlement> entitlements) {
        if (entitlements == null) {
            this.entitlements = null;
            return;
        }

        this.entitlements = new java.util.ArrayList<ListedEntitlement>(entitlements);
    }

    /**
     * A list of entitlements that have been granted to you from other AWS accounts.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        A list of entitlements that have been granted to you from other AWS accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitlementsResult withEntitlements(ListedEntitlement... entitlements) {
        if (this.entitlements == null) {
            setEntitlements(new java.util.ArrayList<ListedEntitlement>(entitlements.length));
        }
        for (ListedEntitlement ele : entitlements) {
            this.entitlements.add(ele);
        }
        return this;
    }

    /**
     * A list of entitlements that have been granted to you from other AWS accounts.
     * 
     * @param entitlements
     *        A list of entitlements that have been granted to you from other AWS accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitlementsResult withEntitlements(java.util.Collection<ListedEntitlement> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListEntitlements request a second time and specify the
     * NextToken value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to
     *        5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a
     *        second time and specify the NextToken value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListEntitlements request a second time and specify the
     * NextToken value.
     * 
     * @return The token that identifies which batch of results that you want to see. For example, you submit a
     *         ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to
     *         5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a
     *         second time and specify the NextToken value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListEntitlements request a second time and specify the
     * NextToken value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to
     *        5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a
     *        second time and specify the NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitlementsResult withNextToken(String nextToken) {
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
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
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

        if (obj instanceof ListEntitlementsResult == false)
            return false;
        ListEntitlementsResult other = (ListEntitlementsResult) obj;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
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

        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitlementsResult clone() {
        try {
            return (ListEntitlementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
