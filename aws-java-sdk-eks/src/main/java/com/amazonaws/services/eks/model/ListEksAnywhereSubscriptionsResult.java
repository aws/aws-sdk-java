/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListEksAnywhereSubscriptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEksAnywhereSubscriptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken and
     * maxResults.
     * </p>
     */
    private java.util.List<EksAnywhereSubscription> subscriptions;
    /**
     * <p>
     * The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     * ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page of
     * results. This value is null when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken and
     * maxResults.
     * </p>
     * 
     * @return A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken
     *         and maxResults.
     */

    public java.util.List<EksAnywhereSubscription> getSubscriptions() {
        return subscriptions;
    }

    /**
     * <p>
     * A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken and
     * maxResults.
     * </p>
     * 
     * @param subscriptions
     *        A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken and
     *        maxResults.
     */

    public void setSubscriptions(java.util.Collection<EksAnywhereSubscription> subscriptions) {
        if (subscriptions == null) {
            this.subscriptions = null;
            return;
        }

        this.subscriptions = new java.util.ArrayList<EksAnywhereSubscription>(subscriptions);
    }

    /**
     * <p>
     * A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken and
     * maxResults.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptions(java.util.Collection)} or {@link #withSubscriptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subscriptions
     *        A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken and
     *        maxResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEksAnywhereSubscriptionsResult withSubscriptions(EksAnywhereSubscription... subscriptions) {
        if (this.subscriptions == null) {
            setSubscriptions(new java.util.ArrayList<EksAnywhereSubscription>(subscriptions.length));
        }
        for (EksAnywhereSubscription ele : subscriptions) {
            this.subscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken and
     * maxResults.
     * </p>
     * 
     * @param subscriptions
     *        A list of all subscription objects in the region, filtered by includeStatus and paginated by nextToken and
     *        maxResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEksAnywhereSubscriptionsResult withSubscriptions(java.util.Collection<EksAnywhereSubscription> subscriptions) {
        setSubscriptions(subscriptions);
        return this;
    }

    /**
     * <p>
     * The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     * ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page of
     * results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     *        ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page
     *        of results. This value is null when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     * ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page of
     * results. This value is null when there are no more results to return.
     * </p>
     * 
     * @return The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     *         ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page
     *         of results. This value is null when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     * ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page of
     * results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The nextToken value to include in a future ListEksAnywhereSubscriptions request. When the results of a
     *        ListEksAnywhereSubscriptions request exceed maxResults, you can use this value to retrieve the next page
     *        of results. This value is null when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEksAnywhereSubscriptionsResult withNextToken(String nextToken) {
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
        if (getSubscriptions() != null)
            sb.append("Subscriptions: ").append(getSubscriptions()).append(",");
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

        if (obj instanceof ListEksAnywhereSubscriptionsResult == false)
            return false;
        ListEksAnywhereSubscriptionsResult other = (ListEksAnywhereSubscriptionsResult) obj;
        if (other.getSubscriptions() == null ^ this.getSubscriptions() == null)
            return false;
        if (other.getSubscriptions() != null && other.getSubscriptions().equals(this.getSubscriptions()) == false)
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

        hashCode = prime * hashCode + ((getSubscriptions() == null) ? 0 : getSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEksAnywhereSubscriptionsResult clone() {
        try {
            return (ListEksAnywhereSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
