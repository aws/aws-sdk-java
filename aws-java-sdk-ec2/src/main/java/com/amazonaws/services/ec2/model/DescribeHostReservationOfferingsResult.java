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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostReservationOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the offerings.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HostOffering> offeringSet;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the offerings.
     * </p>
     * 
     * @return Information about the offerings.
     */

    public java.util.List<HostOffering> getOfferingSet() {
        if (offeringSet == null) {
            offeringSet = new com.amazonaws.internal.SdkInternalList<HostOffering>();
        }
        return offeringSet;
    }

    /**
     * <p>
     * Information about the offerings.
     * </p>
     * 
     * @param offeringSet
     *        Information about the offerings.
     */

    public void setOfferingSet(java.util.Collection<HostOffering> offeringSet) {
        if (offeringSet == null) {
            this.offeringSet = null;
            return;
        }

        this.offeringSet = new com.amazonaws.internal.SdkInternalList<HostOffering>(offeringSet);
    }

    /**
     * <p>
     * Information about the offerings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOfferingSet(java.util.Collection)} or {@link #withOfferingSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param offeringSet
     *        Information about the offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsResult withOfferingSet(HostOffering... offeringSet) {
        if (this.offeringSet == null) {
            setOfferingSet(new com.amazonaws.internal.SdkInternalList<HostOffering>(offeringSet.length));
        }
        for (HostOffering ele : offeringSet) {
            this.offeringSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the offerings.
     * </p>
     * 
     * @param offeringSet
     *        Information about the offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationOfferingsResult withOfferingSet(java.util.Collection<HostOffering> offeringSet) {
        setOfferingSet(offeringSet);
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
        if (getOfferingSet() != null)
            sb.append("OfferingSet: ").append(getOfferingSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHostReservationOfferingsResult == false)
            return false;
        DescribeHostReservationOfferingsResult other = (DescribeHostReservationOfferingsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOfferingSet() == null ^ this.getOfferingSet() == null)
            return false;
        if (other.getOfferingSet() != null && other.getOfferingSet().equals(this.getOfferingSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOfferingSet() == null) ? 0 : getOfferingSet().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHostReservationOfferingsResult clone() {
        try {
            return (DescribeHostReservationOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
