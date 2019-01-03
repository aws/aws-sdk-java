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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolioShareStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePortfolioShareStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by
     * DeletePortfolioShare.
     * </p>
     */
    private String portfolioShareToken;

    /**
     * <p>
     * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by
     * DeletePortfolioShare.
     * </p>
     * 
     * @param portfolioShareToken
     *        The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by
     *        DeletePortfolioShare.
     */

    public void setPortfolioShareToken(String portfolioShareToken) {
        this.portfolioShareToken = portfolioShareToken;
    }

    /**
     * <p>
     * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by
     * DeletePortfolioShare.
     * </p>
     * 
     * @return The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by
     *         DeletePortfolioShare.
     */

    public String getPortfolioShareToken() {
        return this.portfolioShareToken;
    }

    /**
     * <p>
     * The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by
     * DeletePortfolioShare.
     * </p>
     * 
     * @param portfolioShareToken
     *        The token for the portfolio share operation. This token is returned either by CreatePortfolioShare or by
     *        DeletePortfolioShare.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioShareStatusRequest withPortfolioShareToken(String portfolioShareToken) {
        setPortfolioShareToken(portfolioShareToken);
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
        if (getPortfolioShareToken() != null)
            sb.append("PortfolioShareToken: ").append(getPortfolioShareToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortfolioShareStatusRequest == false)
            return false;
        DescribePortfolioShareStatusRequest other = (DescribePortfolioShareStatusRequest) obj;
        if (other.getPortfolioShareToken() == null ^ this.getPortfolioShareToken() == null)
            return false;
        if (other.getPortfolioShareToken() != null && other.getPortfolioShareToken().equals(this.getPortfolioShareToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortfolioShareToken() == null) ? 0 : getPortfolioShareToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePortfolioShareStatusRequest clone() {
        return (DescribePortfolioShareStatusRequest) super.clone();
    }

}
