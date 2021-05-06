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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListLongTermPricing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLongTermPricingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     * <code>LongTermPricing</code> type.
     * </p>
     */
    private java.util.List<LongTermPricingListEntry> longTermPricingEntries;
    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your next list of returned
     * <code>ListLongTermPricing</code> list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     * <code>LongTermPricing</code> type.
     * </p>
     * 
     * @return Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     *         <code>LongTermPricing</code> type.
     */

    public java.util.List<LongTermPricingListEntry> getLongTermPricingEntries() {
        return longTermPricingEntries;
    }

    /**
     * <p>
     * Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     * <code>LongTermPricing</code> type.
     * </p>
     * 
     * @param longTermPricingEntries
     *        Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     *        <code>LongTermPricing</code> type.
     */

    public void setLongTermPricingEntries(java.util.Collection<LongTermPricingListEntry> longTermPricingEntries) {
        if (longTermPricingEntries == null) {
            this.longTermPricingEntries = null;
            return;
        }

        this.longTermPricingEntries = new java.util.ArrayList<LongTermPricingListEntry>(longTermPricingEntries);
    }

    /**
     * <p>
     * Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     * <code>LongTermPricing</code> type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLongTermPricingEntries(java.util.Collection)} or
     * {@link #withLongTermPricingEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param longTermPricingEntries
     *        Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     *        <code>LongTermPricing</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLongTermPricingResult withLongTermPricingEntries(LongTermPricingListEntry... longTermPricingEntries) {
        if (this.longTermPricingEntries == null) {
            setLongTermPricingEntries(new java.util.ArrayList<LongTermPricingListEntry>(longTermPricingEntries.length));
        }
        for (LongTermPricingListEntry ele : longTermPricingEntries) {
            this.longTermPricingEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     * <code>LongTermPricing</code> type.
     * </p>
     * 
     * @param longTermPricingEntries
     *        Each <code>LongTermPricingEntry</code> object contains a status, ID, and other information about the
     *        <code>LongTermPricing</code> type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLongTermPricingResult withLongTermPricingEntries(java.util.Collection<LongTermPricingListEntry> longTermPricingEntries) {
        setLongTermPricingEntries(longTermPricingEntries);
        return this;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your next list of returned
     * <code>ListLongTermPricing</code> list.
     * </p>
     * 
     * @param nextToken
     *        Because HTTP requests are stateless, this is the starting point for your next list of returned
     *        <code>ListLongTermPricing</code> list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your next list of returned
     * <code>ListLongTermPricing</code> list.
     * </p>
     * 
     * @return Because HTTP requests are stateless, this is the starting point for your next list of returned
     *         <code>ListLongTermPricing</code> list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your next list of returned
     * <code>ListLongTermPricing</code> list.
     * </p>
     * 
     * @param nextToken
     *        Because HTTP requests are stateless, this is the starting point for your next list of returned
     *        <code>ListLongTermPricing</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLongTermPricingResult withNextToken(String nextToken) {
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
        if (getLongTermPricingEntries() != null)
            sb.append("LongTermPricingEntries: ").append(getLongTermPricingEntries()).append(",");
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

        if (obj instanceof ListLongTermPricingResult == false)
            return false;
        ListLongTermPricingResult other = (ListLongTermPricingResult) obj;
        if (other.getLongTermPricingEntries() == null ^ this.getLongTermPricingEntries() == null)
            return false;
        if (other.getLongTermPricingEntries() != null && other.getLongTermPricingEntries().equals(this.getLongTermPricingEntries()) == false)
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

        hashCode = prime * hashCode + ((getLongTermPricingEntries() == null) ? 0 : getLongTermPricingEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLongTermPricingResult clone() {
        try {
            return (ListLongTermPricingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
