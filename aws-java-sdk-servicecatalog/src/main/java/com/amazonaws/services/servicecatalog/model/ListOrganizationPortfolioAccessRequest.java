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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListOrganizationPortfolioAccess"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationPortfolioAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     * </p>
     * </li>
     * </ul>
     */
    private String organizationNodeType;
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
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationPortfolioAccessRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     * </p>
     * 
     * @return The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier. For example, <code>port-2abcdext3y5fk</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOrganizationPortfolioAccessRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationNodeType
     *        The organization node type that will be returned in the output.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your
     *        organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     *        </p>
     *        </li>
     * @see OrganizationNodeType
     */

    public void setOrganizationNodeType(String organizationNodeType) {
        this.organizationNodeType = organizationNodeType;
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The organization node type that will be returned in the output.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your
     *         organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     *         </p>
     *         </li>
     * @see OrganizationNodeType
     */

    public String getOrganizationNodeType() {
        return this.organizationNodeType;
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationNodeType
     *        The organization node type that will be returned in the output.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your
     *        organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationNodeType
     */

    public ListOrganizationPortfolioAccessRequest withOrganizationNodeType(String organizationNodeType) {
        setOrganizationNodeType(organizationNodeType);
        return this;
    }

    /**
     * <p>
     * The organization node type that will be returned in the output.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param organizationNodeType
     *        The organization node type that will be returned in the output.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ORGANIZATION</code> - Organization that has access to the portfolio.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORGANIZATIONAL_UNIT</code> - Organizational unit that has access to the portfolio within your
     *        organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCOUNT</code> - Account that has access to the portfolio within your organization.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationNodeType
     */

    public ListOrganizationPortfolioAccessRequest withOrganizationNodeType(OrganizationNodeType organizationNodeType) {
        this.organizationNodeType = organizationNodeType.toString();
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

    public ListOrganizationPortfolioAccessRequest withPageToken(String pageToken) {
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

    public ListOrganizationPortfolioAccessRequest withPageSize(Integer pageSize) {
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId()).append(",");
        if (getOrganizationNodeType() != null)
            sb.append("OrganizationNodeType: ").append(getOrganizationNodeType()).append(",");
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

        if (obj instanceof ListOrganizationPortfolioAccessRequest == false)
            return false;
        ListOrganizationPortfolioAccessRequest other = (ListOrganizationPortfolioAccessRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getOrganizationNodeType() == null ^ this.getOrganizationNodeType() == null)
            return false;
        if (other.getOrganizationNodeType() != null && other.getOrganizationNodeType().equals(this.getOrganizationNodeType()) == false)
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

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationNodeType() == null) ? 0 : getOrganizationNodeType().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListOrganizationPortfolioAccessRequest clone() {
        return (ListOrganizationPortfolioAccessRequest) super.clone();
    }

}
