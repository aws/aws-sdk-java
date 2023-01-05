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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for results of a <code>DescribeReservedInstanceOfferings</code> request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstanceOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of Reserved Instance offerings.
     * </p>
     */
    private java.util.List<ReservedInstanceOffering> reservedInstanceOfferings;

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstanceOfferingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of Reserved Instance offerings.
     * </p>
     * 
     * @return List of Reserved Instance offerings.
     */

    public java.util.List<ReservedInstanceOffering> getReservedInstanceOfferings() {
        return reservedInstanceOfferings;
    }

    /**
     * <p>
     * List of Reserved Instance offerings.
     * </p>
     * 
     * @param reservedInstanceOfferings
     *        List of Reserved Instance offerings.
     */

    public void setReservedInstanceOfferings(java.util.Collection<ReservedInstanceOffering> reservedInstanceOfferings) {
        if (reservedInstanceOfferings == null) {
            this.reservedInstanceOfferings = null;
            return;
        }

        this.reservedInstanceOfferings = new java.util.ArrayList<ReservedInstanceOffering>(reservedInstanceOfferings);
    }

    /**
     * <p>
     * List of Reserved Instance offerings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstanceOfferings(java.util.Collection)} or
     * {@link #withReservedInstanceOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstanceOfferings
     *        List of Reserved Instance offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstanceOfferingsResult withReservedInstanceOfferings(ReservedInstanceOffering... reservedInstanceOfferings) {
        if (this.reservedInstanceOfferings == null) {
            setReservedInstanceOfferings(new java.util.ArrayList<ReservedInstanceOffering>(reservedInstanceOfferings.length));
        }
        for (ReservedInstanceOffering ele : reservedInstanceOfferings) {
            this.reservedInstanceOfferings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Reserved Instance offerings.
     * </p>
     * 
     * @param reservedInstanceOfferings
     *        List of Reserved Instance offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstanceOfferingsResult withReservedInstanceOfferings(java.util.Collection<ReservedInstanceOffering> reservedInstanceOfferings) {
        setReservedInstanceOfferings(reservedInstanceOfferings);
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
        if (getReservedInstanceOfferings() != null)
            sb.append("ReservedInstanceOfferings: ").append(getReservedInstanceOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstanceOfferingsResult == false)
            return false;
        DescribeReservedInstanceOfferingsResult other = (DescribeReservedInstanceOfferingsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservedInstanceOfferings() == null ^ this.getReservedInstanceOfferings() == null)
            return false;
        if (other.getReservedInstanceOfferings() != null && other.getReservedInstanceOfferings().equals(this.getReservedInstanceOfferings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReservedInstanceOfferings() == null) ? 0 : getReservedInstanceOfferings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstanceOfferingsResult clone() {
        try {
            return (DescribeReservedInstanceOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
