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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolioShares"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePortfolioSharesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the portfolio for which shares will be retrieved.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share, which can
     * be one of the following:
     * </p>
     * <p>
     * 1. <code>ACCOUNT</code> - Represents an external account to account share.
     * </p>
     * <p>
     * 2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every account in
     * the organization.
     * </p>
     * <p>
     * 3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     * </p>
     * <p>
     * 4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     */
    private String pageToken;
    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The unique identifier of the portfolio for which shares will be retrieved.
     * </p>
     * 
     * @param portfolioId
     *        The unique identifier of the portfolio for which shares will be retrieved.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The unique identifier of the portfolio for which shares will be retrieved.
     * </p>
     * 
     * @return The unique identifier of the portfolio for which shares will be retrieved.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The unique identifier of the portfolio for which shares will be retrieved.
     * </p>
     * 
     * @param portfolioId
     *        The unique identifier of the portfolio for which shares will be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioSharesRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share, which can
     * be one of the following:
     * </p>
     * <p>
     * 1. <code>ACCOUNT</code> - Represents an external account to account share.
     * </p>
     * <p>
     * 2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every account in
     * the organization.
     * </p>
     * <p>
     * 3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     * </p>
     * <p>
     * 4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * </p>
     * 
     * @param type
     *        The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share,
     *        which can be one of the following:</p>
     *        <p>
     *        1. <code>ACCOUNT</code> - Represents an external account to account share.
     *        </p>
     *        <p>
     *        2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every
     *        account in the organization.
     *        </p>
     *        <p>
     *        3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     *        </p>
     *        <p>
     *        4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * @see DescribePortfolioShareType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share, which can
     * be one of the following:
     * </p>
     * <p>
     * 1. <code>ACCOUNT</code> - Represents an external account to account share.
     * </p>
     * <p>
     * 2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every account in
     * the organization.
     * </p>
     * <p>
     * 3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     * </p>
     * <p>
     * 4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * </p>
     * 
     * @return The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share,
     *         which can be one of the following:</p>
     *         <p>
     *         1. <code>ACCOUNT</code> - Represents an external account to account share.
     *         </p>
     *         <p>
     *         2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every
     *         account in the organization.
     *         </p>
     *         <p>
     *         3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     *         </p>
     *         <p>
     *         4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * @see DescribePortfolioShareType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share, which can
     * be one of the following:
     * </p>
     * <p>
     * 1. <code>ACCOUNT</code> - Represents an external account to account share.
     * </p>
     * <p>
     * 2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every account in
     * the organization.
     * </p>
     * <p>
     * 3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     * </p>
     * <p>
     * 4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * </p>
     * 
     * @param type
     *        The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share,
     *        which can be one of the following:</p>
     *        <p>
     *        1. <code>ACCOUNT</code> - Represents an external account to account share.
     *        </p>
     *        <p>
     *        2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every
     *        account in the organization.
     *        </p>
     *        <p>
     *        3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     *        </p>
     *        <p>
     *        4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribePortfolioShareType
     */

    public DescribePortfolioSharesRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share, which can
     * be one of the following:
     * </p>
     * <p>
     * 1. <code>ACCOUNT</code> - Represents an external account to account share.
     * </p>
     * <p>
     * 2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every account in
     * the organization.
     * </p>
     * <p>
     * 3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     * </p>
     * <p>
     * 4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * </p>
     * 
     * @param type
     *        The type of portfolio share to summarize. This field acts as a filter on the type of portfolio share,
     *        which can be one of the following:</p>
     *        <p>
     *        1. <code>ACCOUNT</code> - Represents an external account to account share.
     *        </p>
     *        <p>
     *        2. <code>ORGANIZATION</code> - Represents a share to an organization. This share is available to every
     *        account in the organization.
     *        </p>
     *        <p>
     *        3. <code>ORGANIZATIONAL_UNIT</code> - Represents a share to an organizational unit.
     *        </p>
     *        <p>
     *        4. <code>ORGANIZATION_MEMBER_ACCOUNT</code> - Represents a share to an account in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribePortfolioShareType
     */

    public DescribePortfolioSharesRequest withType(DescribePortfolioShareType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @return The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioSharesRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return with this call.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @return The maximum number of items to return with this call.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioSharesRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortfolioSharesRequest == false)
            return false;
        DescribePortfolioSharesRequest other = (DescribePortfolioSharesRequest) obj;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public DescribePortfolioSharesRequest clone() {
        return (DescribePortfolioSharesRequest) super.clone();
    }

}
