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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreatePortfolioShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePortfolioShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The portfolio identifier.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The AWS account ID. For example, <code>123456789012</code>.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The organization node to whom you are going to share. If <code>OrganizationNode</code> is passed in,
     * <code>PortfolioShare</code> will be created for the node and its children (when applies), and a
     * <code>PortfolioShareToken</code> will be returned in the output in order for the administrator to monitor the
     * status of the <code>PortfolioShare</code> creation process.
     * </p>
     */
    private OrganizationNode organizationNode;

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

    public CreatePortfolioShareRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
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

    public CreatePortfolioShareRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID. For example, <code>123456789012</code>.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID. For example, <code>123456789012</code>.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID. For example, <code>123456789012</code>.
     * </p>
     * 
     * @return The AWS account ID. For example, <code>123456789012</code>.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID. For example, <code>123456789012</code>.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID. For example, <code>123456789012</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortfolioShareRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The organization node to whom you are going to share. If <code>OrganizationNode</code> is passed in,
     * <code>PortfolioShare</code> will be created for the node and its children (when applies), and a
     * <code>PortfolioShareToken</code> will be returned in the output in order for the administrator to monitor the
     * status of the <code>PortfolioShare</code> creation process.
     * </p>
     * 
     * @param organizationNode
     *        The organization node to whom you are going to share. If <code>OrganizationNode</code> is passed in,
     *        <code>PortfolioShare</code> will be created for the node and its children (when applies), and a
     *        <code>PortfolioShareToken</code> will be returned in the output in order for the administrator to monitor
     *        the status of the <code>PortfolioShare</code> creation process.
     */

    public void setOrganizationNode(OrganizationNode organizationNode) {
        this.organizationNode = organizationNode;
    }

    /**
     * <p>
     * The organization node to whom you are going to share. If <code>OrganizationNode</code> is passed in,
     * <code>PortfolioShare</code> will be created for the node and its children (when applies), and a
     * <code>PortfolioShareToken</code> will be returned in the output in order for the administrator to monitor the
     * status of the <code>PortfolioShare</code> creation process.
     * </p>
     * 
     * @return The organization node to whom you are going to share. If <code>OrganizationNode</code> is passed in,
     *         <code>PortfolioShare</code> will be created for the node and its children (when applies), and a
     *         <code>PortfolioShareToken</code> will be returned in the output in order for the administrator to monitor
     *         the status of the <code>PortfolioShare</code> creation process.
     */

    public OrganizationNode getOrganizationNode() {
        return this.organizationNode;
    }

    /**
     * <p>
     * The organization node to whom you are going to share. If <code>OrganizationNode</code> is passed in,
     * <code>PortfolioShare</code> will be created for the node and its children (when applies), and a
     * <code>PortfolioShareToken</code> will be returned in the output in order for the administrator to monitor the
     * status of the <code>PortfolioShare</code> creation process.
     * </p>
     * 
     * @param organizationNode
     *        The organization node to whom you are going to share. If <code>OrganizationNode</code> is passed in,
     *        <code>PortfolioShare</code> will be created for the node and its children (when applies), and a
     *        <code>PortfolioShareToken</code> will be returned in the output in order for the administrator to monitor
     *        the status of the <code>PortfolioShare</code> creation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePortfolioShareRequest withOrganizationNode(OrganizationNode organizationNode) {
        setOrganizationNode(organizationNode);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getOrganizationNode() != null)
            sb.append("OrganizationNode: ").append(getOrganizationNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortfolioShareRequest == false)
            return false;
        CreatePortfolioShareRequest other = (CreatePortfolioShareRequest) obj;
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
        return hashCode;
    }

    @Override
    public CreatePortfolioShareRequest clone() {
        return (CreatePortfolioShareRequest) super.clone();
    }

}
