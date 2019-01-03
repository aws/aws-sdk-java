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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListAcceptedPortfolioShares"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAcceptedPortfolioSharesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The type of shared portfolios to list. The default is to list imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     */
    private String portfolioShareType;

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

    public ListAcceptedPortfolioSharesRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
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

    public ListAcceptedPortfolioSharesRequest withPageToken(String pageToken) {
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

    public ListAcceptedPortfolioSharesRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * 
     * @param portfolioShareType
     *        The type of shared portfolios to list. The default is to list imported portfolios.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_SERVICECATALOG</code> - List default portfolios
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMPORTED</code> - List imported portfolios
     *        </p>
     *        </li>
     * @see PortfolioShareType
     */

    public void setPortfolioShareType(String portfolioShareType) {
        this.portfolioShareType = portfolioShareType;
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of shared portfolios to list. The default is to list imported portfolios.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_SERVICECATALOG</code> - List default portfolios
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IMPORTED</code> - List imported portfolios
     *         </p>
     *         </li>
     * @see PortfolioShareType
     */

    public String getPortfolioShareType() {
        return this.portfolioShareType;
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * 
     * @param portfolioShareType
     *        The type of shared portfolios to list. The default is to list imported portfolios.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_SERVICECATALOG</code> - List default portfolios
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMPORTED</code> - List imported portfolios
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortfolioShareType
     */

    public ListAcceptedPortfolioSharesRequest withPortfolioShareType(String portfolioShareType) {
        setPortfolioShareType(portfolioShareType);
        return this;
    }

    /**
     * <p>
     * The type of shared portfolios to list. The default is to list imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - List default portfolios
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - List imported portfolios
     * </p>
     * </li>
     * </ul>
     * 
     * @param portfolioShareType
     *        The type of shared portfolios to list. The default is to list imported portfolios.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_ORGANIZATIONS</code> - List portfolios shared by the master account of your organization
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_SERVICECATALOG</code> - List default portfolios
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMPORTED</code> - List imported portfolios
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortfolioShareType
     */

    public ListAcceptedPortfolioSharesRequest withPortfolioShareType(PortfolioShareType portfolioShareType) {
        this.portfolioShareType = portfolioShareType.toString();
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
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getPortfolioShareType() != null)
            sb.append("PortfolioShareType: ").append(getPortfolioShareType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAcceptedPortfolioSharesRequest == false)
            return false;
        ListAcceptedPortfolioSharesRequest other = (ListAcceptedPortfolioSharesRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPortfolioShareType() == null ^ this.getPortfolioShareType() == null)
            return false;
        if (other.getPortfolioShareType() != null && other.getPortfolioShareType().equals(this.getPortfolioShareType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPortfolioShareType() == null) ? 0 : getPortfolioShareType().hashCode());
        return hashCode;
    }

    @Override
    public ListAcceptedPortfolioSharesRequest clone() {
        return (ListAcceptedPortfolioSharesRequest) super.clone();
    }

}
