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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListProductSubscriptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProductSubscriptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Metadata that describes the list product subscriptions operation.
     * </p>
     */
    private java.util.List<ProductUserSummary> productUserSummaries;

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProductSubscriptionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Metadata that describes the list product subscriptions operation.
     * </p>
     * 
     * @return Metadata that describes the list product subscriptions operation.
     */

    public java.util.List<ProductUserSummary> getProductUserSummaries() {
        return productUserSummaries;
    }

    /**
     * <p>
     * Metadata that describes the list product subscriptions operation.
     * </p>
     * 
     * @param productUserSummaries
     *        Metadata that describes the list product subscriptions operation.
     */

    public void setProductUserSummaries(java.util.Collection<ProductUserSummary> productUserSummaries) {
        if (productUserSummaries == null) {
            this.productUserSummaries = null;
            return;
        }

        this.productUserSummaries = new java.util.ArrayList<ProductUserSummary>(productUserSummaries);
    }

    /**
     * <p>
     * Metadata that describes the list product subscriptions operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductUserSummaries(java.util.Collection)} or {@link #withProductUserSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param productUserSummaries
     *        Metadata that describes the list product subscriptions operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProductSubscriptionsResult withProductUserSummaries(ProductUserSummary... productUserSummaries) {
        if (this.productUserSummaries == null) {
            setProductUserSummaries(new java.util.ArrayList<ProductUserSummary>(productUserSummaries.length));
        }
        for (ProductUserSummary ele : productUserSummaries) {
            this.productUserSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that describes the list product subscriptions operation.
     * </p>
     * 
     * @param productUserSummaries
     *        Metadata that describes the list product subscriptions operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProductSubscriptionsResult withProductUserSummaries(java.util.Collection<ProductUserSummary> productUserSummaries) {
        setProductUserSummaries(productUserSummaries);
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
        if (getProductUserSummaries() != null)
            sb.append("ProductUserSummaries: ").append(getProductUserSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProductSubscriptionsResult == false)
            return false;
        ListProductSubscriptionsResult other = (ListProductSubscriptionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProductUserSummaries() == null ^ this.getProductUserSummaries() == null)
            return false;
        if (other.getProductUserSummaries() != null && other.getProductUserSummaries().equals(this.getProductUserSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProductUserSummaries() == null) ? 0 : getProductUserSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListProductSubscriptionsResult clone() {
        try {
            return (ListProductSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
