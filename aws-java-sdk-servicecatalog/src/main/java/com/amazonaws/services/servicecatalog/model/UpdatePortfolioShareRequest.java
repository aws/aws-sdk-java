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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdatePortfolioShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePortfolioShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The unique identifier of the portfolio for which the share will be updated.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The AWS Account Id of the recipient account. This field is required when updating an external account to account
     * type share.
     * </p>
     */
    private String accountId;

    private OrganizationNode organizationNode;
    /**
     * <p>
     * A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided, the
     * current state of TagOptions sharing on the portfolio share will not be modified.
     * </p>
     */
    private Boolean shareTagOptions;

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

    public UpdatePortfolioShareRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the portfolio for which the share will be updated.
     * </p>
     * 
     * @param portfolioId
     *        The unique identifier of the portfolio for which the share will be updated.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The unique identifier of the portfolio for which the share will be updated.
     * </p>
     * 
     * @return The unique identifier of the portfolio for which the share will be updated.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The unique identifier of the portfolio for which the share will be updated.
     * </p>
     * 
     * @param portfolioId
     *        The unique identifier of the portfolio for which the share will be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioShareRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The AWS Account Id of the recipient account. This field is required when updating an external account to account
     * type share.
     * </p>
     * 
     * @param accountId
     *        The AWS Account Id of the recipient account. This field is required when updating an external account to
     *        account type share.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS Account Id of the recipient account. This field is required when updating an external account to account
     * type share.
     * </p>
     * 
     * @return The AWS Account Id of the recipient account. This field is required when updating an external account to
     *         account type share.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS Account Id of the recipient account. This field is required when updating an external account to account
     * type share.
     * </p>
     * 
     * @param accountId
     *        The AWS Account Id of the recipient account. This field is required when updating an external account to
     *        account type share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioShareRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * @param organizationNode
     */

    public void setOrganizationNode(OrganizationNode organizationNode) {
        this.organizationNode = organizationNode;
    }

    /**
     * @return
     */

    public OrganizationNode getOrganizationNode() {
        return this.organizationNode;
    }

    /**
     * @param organizationNode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioShareRequest withOrganizationNode(OrganizationNode organizationNode) {
        setOrganizationNode(organizationNode);
        return this;
    }

    /**
     * <p>
     * A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided, the
     * current state of TagOptions sharing on the portfolio share will not be modified.
     * </p>
     * 
     * @param shareTagOptions
     *        A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided, the
     *        current state of TagOptions sharing on the portfolio share will not be modified.
     */

    public void setShareTagOptions(Boolean shareTagOptions) {
        this.shareTagOptions = shareTagOptions;
    }

    /**
     * <p>
     * A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided, the
     * current state of TagOptions sharing on the portfolio share will not be modified.
     * </p>
     * 
     * @return A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided,
     *         the current state of TagOptions sharing on the portfolio share will not be modified.
     */

    public Boolean getShareTagOptions() {
        return this.shareTagOptions;
    }

    /**
     * <p>
     * A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided, the
     * current state of TagOptions sharing on the portfolio share will not be modified.
     * </p>
     * 
     * @param shareTagOptions
     *        A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided, the
     *        current state of TagOptions sharing on the portfolio share will not be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePortfolioShareRequest withShareTagOptions(Boolean shareTagOptions) {
        setShareTagOptions(shareTagOptions);
        return this;
    }

    /**
     * <p>
     * A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided, the
     * current state of TagOptions sharing on the portfolio share will not be modified.
     * </p>
     * 
     * @return A flag to enable or disable TagOptions sharing for the portfolio share. If this field is not provided,
     *         the current state of TagOptions sharing on the portfolio share will not be modified.
     */

    public Boolean isShareTagOptions() {
        return this.shareTagOptions;
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getOrganizationNode() != null)
            sb.append("OrganizationNode: ").append(getOrganizationNode()).append(",");
        if (getShareTagOptions() != null)
            sb.append("ShareTagOptions: ").append(getShareTagOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePortfolioShareRequest == false)
            return false;
        UpdatePortfolioShareRequest other = (UpdatePortfolioShareRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getOrganizationNode() == null ^ this.getOrganizationNode() == null)
            return false;
        if (other.getOrganizationNode() != null && other.getOrganizationNode().equals(this.getOrganizationNode()) == false)
            return false;
        if (other.getShareTagOptions() == null ^ this.getShareTagOptions() == null)
            return false;
        if (other.getShareTagOptions() != null && other.getShareTagOptions().equals(this.getShareTagOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationNode() == null) ? 0 : getOrganizationNode().hashCode());
        hashCode = prime * hashCode + ((getShareTagOptions() == null) ? 0 : getShareTagOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePortfolioShareRequest clone() {
        return (UpdatePortfolioShareRequest) super.clone();
    }

}
