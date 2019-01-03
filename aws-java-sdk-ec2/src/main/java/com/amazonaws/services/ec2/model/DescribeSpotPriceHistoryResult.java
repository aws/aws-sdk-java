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
 * <p>
 * Contains the output of DescribeSpotPriceHistory.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotPriceHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null or an empty string when there are no
     * more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The historical Spot prices.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SpotPrice> spotPriceHistory;

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null or an empty string when there are no
     * more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is null or an empty string when there
     *        are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null or an empty string when there are no
     * more results to return.
     * </p>
     * 
     * @return The token required to retrieve the next set of results. This value is null or an empty string when there
     *         are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null or an empty string when there are no
     * more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is null or an empty string when there
     *        are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     * 
     * @return The historical Spot prices.
     */

    public java.util.List<SpotPrice> getSpotPriceHistory() {
        if (spotPriceHistory == null) {
            spotPriceHistory = new com.amazonaws.internal.SdkInternalList<SpotPrice>();
        }
        return spotPriceHistory;
    }

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     * 
     * @param spotPriceHistory
     *        The historical Spot prices.
     */

    public void setSpotPriceHistory(java.util.Collection<SpotPrice> spotPriceHistory) {
        if (spotPriceHistory == null) {
            this.spotPriceHistory = null;
            return;
        }

        this.spotPriceHistory = new com.amazonaws.internal.SdkInternalList<SpotPrice>(spotPriceHistory);
    }

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotPriceHistory(java.util.Collection)} or {@link #withSpotPriceHistory(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param spotPriceHistory
     *        The historical Spot prices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryResult withSpotPriceHistory(SpotPrice... spotPriceHistory) {
        if (this.spotPriceHistory == null) {
            setSpotPriceHistory(new com.amazonaws.internal.SdkInternalList<SpotPrice>(spotPriceHistory.length));
        }
        for (SpotPrice ele : spotPriceHistory) {
            this.spotPriceHistory.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The historical Spot prices.
     * </p>
     * 
     * @param spotPriceHistory
     *        The historical Spot prices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotPriceHistoryResult withSpotPriceHistory(java.util.Collection<SpotPrice> spotPriceHistory) {
        setSpotPriceHistory(spotPriceHistory);
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
        if (getSpotPriceHistory() != null)
            sb.append("SpotPriceHistory: ").append(getSpotPriceHistory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotPriceHistoryResult == false)
            return false;
        DescribeSpotPriceHistoryResult other = (DescribeSpotPriceHistoryResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSpotPriceHistory() == null ^ this.getSpotPriceHistory() == null)
            return false;
        if (other.getSpotPriceHistory() != null && other.getSpotPriceHistory().equals(this.getSpotPriceHistory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSpotPriceHistory() == null) ? 0 : getSpotPriceHistory().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpotPriceHistoryResult clone() {
        try {
            return (DescribeSpotPriceHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
