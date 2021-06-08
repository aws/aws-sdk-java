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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolioShares"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePortfolioSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * Summaries about each of the portfolio shares.
     * </p>
     */
    private java.util.List<PortfolioShareDetail> portfolioShareDetails;

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @return The page token to use to retrieve the next set of results. If there are no additional results, this value
     *         is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioSharesResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * Summaries about each of the portfolio shares.
     * </p>
     * 
     * @return Summaries about each of the portfolio shares.
     */

    public java.util.List<PortfolioShareDetail> getPortfolioShareDetails() {
        return portfolioShareDetails;
    }

    /**
     * <p>
     * Summaries about each of the portfolio shares.
     * </p>
     * 
     * @param portfolioShareDetails
     *        Summaries about each of the portfolio shares.
     */

    public void setPortfolioShareDetails(java.util.Collection<PortfolioShareDetail> portfolioShareDetails) {
        if (portfolioShareDetails == null) {
            this.portfolioShareDetails = null;
            return;
        }

        this.portfolioShareDetails = new java.util.ArrayList<PortfolioShareDetail>(portfolioShareDetails);
    }

    /**
     * <p>
     * Summaries about each of the portfolio shares.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortfolioShareDetails(java.util.Collection)} or
     * {@link #withPortfolioShareDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param portfolioShareDetails
     *        Summaries about each of the portfolio shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioSharesResult withPortfolioShareDetails(PortfolioShareDetail... portfolioShareDetails) {
        if (this.portfolioShareDetails == null) {
            setPortfolioShareDetails(new java.util.ArrayList<PortfolioShareDetail>(portfolioShareDetails.length));
        }
        for (PortfolioShareDetail ele : portfolioShareDetails) {
            this.portfolioShareDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summaries about each of the portfolio shares.
     * </p>
     * 
     * @param portfolioShareDetails
     *        Summaries about each of the portfolio shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioSharesResult withPortfolioShareDetails(java.util.Collection<PortfolioShareDetail> portfolioShareDetails) {
        setPortfolioShareDetails(portfolioShareDetails);
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
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
        if (getPortfolioShareDetails() != null)
            sb.append("PortfolioShareDetails: ").append(getPortfolioShareDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortfolioSharesResult == false)
            return false;
        DescribePortfolioSharesResult other = (DescribePortfolioSharesResult) obj;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getPortfolioShareDetails() == null ^ this.getPortfolioShareDetails() == null)
            return false;
        if (other.getPortfolioShareDetails() != null && other.getPortfolioShareDetails().equals(this.getPortfolioShareDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getPortfolioShareDetails() == null) ? 0 : getPortfolioShareDetails().hashCode());
        return hashCode;
    }

    @Override
    public DescribePortfolioSharesResult clone() {
        try {
            return (DescribePortfolioSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
