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
package com.amazonaws.services.pricing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/ListPriceLists" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPriceListsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The type of price list references that match your request.
     * </p>
     */
    private java.util.List<PriceList> priceLists;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of price list references that match your request.
     * </p>
     * 
     * @return The type of price list references that match your request.
     */

    public java.util.List<PriceList> getPriceLists() {
        return priceLists;
    }

    /**
     * <p>
     * The type of price list references that match your request.
     * </p>
     * 
     * @param priceLists
     *        The type of price list references that match your request.
     */

    public void setPriceLists(java.util.Collection<PriceList> priceLists) {
        if (priceLists == null) {
            this.priceLists = null;
            return;
        }

        this.priceLists = new java.util.ArrayList<PriceList>(priceLists);
    }

    /**
     * <p>
     * The type of price list references that match your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPriceLists(java.util.Collection)} or {@link #withPriceLists(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param priceLists
     *        The type of price list references that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsResult withPriceLists(PriceList... priceLists) {
        if (this.priceLists == null) {
            setPriceLists(new java.util.ArrayList<PriceList>(priceLists.length));
        }
        for (PriceList ele : priceLists) {
            this.priceLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of price list references that match your request.
     * </p>
     * 
     * @param priceLists
     *        The type of price list references that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsResult withPriceLists(java.util.Collection<PriceList> priceLists) {
        setPriceLists(priceLists);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPriceListsResult withNextToken(String nextToken) {
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
        if (getPriceLists() != null)
            sb.append("PriceLists: ").append(getPriceLists()).append(",");
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

        if (obj instanceof ListPriceListsResult == false)
            return false;
        ListPriceListsResult other = (ListPriceListsResult) obj;
        if (other.getPriceLists() == null ^ this.getPriceLists() == null)
            return false;
        if (other.getPriceLists() != null && other.getPriceLists().equals(this.getPriceLists()) == false)
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

        hashCode = prime * hashCode + ((getPriceLists() == null) ? 0 : getPriceLists().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPriceListsResult clone() {
        try {
            return (ListPriceListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
