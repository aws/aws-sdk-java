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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/AcceptPortfolioShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptPortfolioShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The type of shared portfolios to accept. The default is to accept imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Accept imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
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

    public AcceptPortfolioShareRequest withAcceptLanguage(String acceptLanguage) {
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

    public AcceptPortfolioShareRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The type of shared portfolios to accept. The default is to accept imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Accept imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * 
     * @param portfolioShareType
     *        The type of shared portfolios to accept. The default is to accept imported portfolios.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMPORTED</code> - Accept imported portfolios.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example,
     *        <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * @see PortfolioShareType
     */

    public void setPortfolioShareType(String portfolioShareType) {
        this.portfolioShareType = portfolioShareType;
    }

    /**
     * <p>
     * The type of shared portfolios to accept. The default is to accept imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Accept imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * 
     * @return The type of shared portfolios to accept. The default is to accept imported portfolios.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IMPORTED</code> - Accept imported portfolios.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example,
     *         <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * @see PortfolioShareType
     */

    public String getPortfolioShareType() {
        return this.portfolioShareType;
    }

    /**
     * <p>
     * The type of shared portfolios to accept. The default is to accept imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Accept imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * 
     * @param portfolioShareType
     *        The type of shared portfolios to accept. The default is to accept imported portfolios.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMPORTED</code> - Accept imported portfolios.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example,
     *        <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortfolioShareType
     */

    public AcceptPortfolioShareRequest withPortfolioShareType(String portfolioShareType) {
        setPortfolioShareType(portfolioShareType);
        return this;
    }

    /**
     * <p>
     * The type of shared portfolios to accept. The default is to accept imported portfolios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMPORTED</code> - Accept imported portfolios.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example,
     * <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * </p>
     * 
     * @param portfolioShareType
     *        The type of shared portfolios to accept. The default is to accept imported portfolios.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_ORGANIZATIONS</code> - Accept portfolios shared by the master account of your organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMPORTED</code> - Accept imported portfolios.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_SERVICECATALOG</code> - Not supported. (Throws ResourceNotFoundException.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example,
     *        <code>aws servicecatalog accept-portfolio-share --portfolio-id "port-2qwzkwxt3y5fk" --portfolio-share-type AWS_ORGANIZATIONS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortfolioShareType
     */

    public AcceptPortfolioShareRequest withPortfolioShareType(PortfolioShareType portfolioShareType) {
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
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId()).append(",");
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

        if (obj instanceof AcceptPortfolioShareRequest == false)
            return false;
        AcceptPortfolioShareRequest other = (AcceptPortfolioShareRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
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
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getPortfolioShareType() == null) ? 0 : getPortfolioShareType().hashCode());
        return hashCode;
    }

    @Override
    public AcceptPortfolioShareRequest clone() {
        return (AcceptPortfolioShareRequest) super.clone();
    }

}
