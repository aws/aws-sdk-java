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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribePortfolioShareStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePortfolioShareStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the portfolio share operation. For example, <code>share-6v24abcdefghi</code>.
     * </p>
     */
    private String portfolioShareToken;
    /**
     * <p>
     * The portfolio identifier.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * Organization node identifier. It can be either account id, organizational unit id or organization id.
     * </p>
     */
    private String organizationNodeValue;
    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about the portfolio share operation.
     * </p>
     */
    private ShareDetails shareDetails;

    /**
     * <p>
     * The token for the portfolio share operation. For example, <code>share-6v24abcdefghi</code>.
     * </p>
     * 
     * @param portfolioShareToken
     *        The token for the portfolio share operation. For example, <code>share-6v24abcdefghi</code>.
     */

    public void setPortfolioShareToken(String portfolioShareToken) {
        this.portfolioShareToken = portfolioShareToken;
    }

    /**
     * <p>
     * The token for the portfolio share operation. For example, <code>share-6v24abcdefghi</code>.
     * </p>
     * 
     * @return The token for the portfolio share operation. For example, <code>share-6v24abcdefghi</code>.
     */

    public String getPortfolioShareToken() {
        return this.portfolioShareToken;
    }

    /**
     * <p>
     * The token for the portfolio share operation. For example, <code>share-6v24abcdefghi</code>.
     * </p>
     * 
     * @param portfolioShareToken
     *        The token for the portfolio share operation. For example, <code>share-6v24abcdefghi</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioShareStatusResult withPortfolioShareToken(String portfolioShareToken) {
        setPortfolioShareToken(portfolioShareToken);
        return this;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @return The portfolio identifier.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioShareStatusResult withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * Organization node identifier. It can be either account id, organizational unit id or organization id.
     * </p>
     * 
     * @param organizationNodeValue
     *        Organization node identifier. It can be either account id, organizational unit id or organization id.
     */

    public void setOrganizationNodeValue(String organizationNodeValue) {
        this.organizationNodeValue = organizationNodeValue;
    }

    /**
     * <p>
     * Organization node identifier. It can be either account id, organizational unit id or organization id.
     * </p>
     * 
     * @return Organization node identifier. It can be either account id, organizational unit id or organization id.
     */

    public String getOrganizationNodeValue() {
        return this.organizationNodeValue;
    }

    /**
     * <p>
     * Organization node identifier. It can be either account id, organizational unit id or organization id.
     * </p>
     * 
     * @param organizationNodeValue
     *        Organization node identifier. It can be either account id, organizational unit id or organization id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioShareStatusResult withOrganizationNodeValue(String organizationNodeValue) {
        setOrganizationNodeValue(organizationNodeValue);
        return this;
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * 
     * @param status
     *        Status of the portfolio share operation.
     * @see ShareStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * 
     * @return Status of the portfolio share operation.
     * @see ShareStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * 
     * @param status
     *        Status of the portfolio share operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public DescribePortfolioShareStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the portfolio share operation.
     * </p>
     * 
     * @param status
     *        Status of the portfolio share operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public DescribePortfolioShareStatusResult withStatus(ShareStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the portfolio share operation.
     * </p>
     * 
     * @param shareDetails
     *        Information about the portfolio share operation.
     */

    public void setShareDetails(ShareDetails shareDetails) {
        this.shareDetails = shareDetails;
    }

    /**
     * <p>
     * Information about the portfolio share operation.
     * </p>
     * 
     * @return Information about the portfolio share operation.
     */

    public ShareDetails getShareDetails() {
        return this.shareDetails;
    }

    /**
     * <p>
     * Information about the portfolio share operation.
     * </p>
     * 
     * @param shareDetails
     *        Information about the portfolio share operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePortfolioShareStatusResult withShareDetails(ShareDetails shareDetails) {
        setShareDetails(shareDetails);
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
            sb.append("PortfolioShareToken: ").append(getPortfolioShareToken()).append(",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId()).append(",");
        if (getOrganizationNodeValue() != null)
            sb.append("OrganizationNodeValue: ").append(getOrganizationNodeValue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getShareDetails() != null)
            sb.append("ShareDetails: ").append(getShareDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePortfolioShareStatusResult == false)
            return false;
        DescribePortfolioShareStatusResult other = (DescribePortfolioShareStatusResult) obj;
        if (other.getPortfolioShareToken() == null ^ this.getPortfolioShareToken() == null)
            return false;
        if (other.getPortfolioShareToken() != null && other.getPortfolioShareToken().equals(this.getPortfolioShareToken()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getOrganizationNodeValue() == null ^ this.getOrganizationNodeValue() == null)
            return false;
        if (other.getOrganizationNodeValue() != null && other.getOrganizationNodeValue().equals(this.getOrganizationNodeValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getShareDetails() == null ^ this.getShareDetails() == null)
            return false;
        if (other.getShareDetails() != null && other.getShareDetails().equals(this.getShareDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortfolioShareToken() == null) ? 0 : getPortfolioShareToken().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationNodeValue() == null) ? 0 : getOrganizationNodeValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getShareDetails() == null) ? 0 : getShareDetails().hashCode());
        return hashCode;
    }

    @Override
    public DescribePortfolioShareStatusResult clone() {
        try {
            return (DescribePortfolioShareStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
