/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class AssociateProductWithPortfolioRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The portfolio identifier.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The identifier of the source portfolio to use with this association.
     * </p>
     */
    private String sourcePortfolioId;

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @return The language code to use for this operation. Supported language codes are as follows:</p>
     *         <p>
     *         "en" (English)
     *         </p>
     *         <p>
     *         "jp" (Japanese)
     *         </p>
     *         <p>
     *         "zh" (Chinese)
     *         </p>
     *         <p>
     *         If no code is specified, "en" is used as the default.
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateProductWithPortfolioRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateProductWithPortfolioRequest withProductId(String productId) {
        setProductId(productId);
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

    public AssociateProductWithPortfolioRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The identifier of the source portfolio to use with this association.
     * </p>
     * 
     * @param sourcePortfolioId
     *        The identifier of the source portfolio to use with this association.
     */

    public void setSourcePortfolioId(String sourcePortfolioId) {
        this.sourcePortfolioId = sourcePortfolioId;
    }

    /**
     * <p>
     * The identifier of the source portfolio to use with this association.
     * </p>
     * 
     * @return The identifier of the source portfolio to use with this association.
     */

    public String getSourcePortfolioId() {
        return this.sourcePortfolioId;
    }

    /**
     * <p>
     * The identifier of the source portfolio to use with this association.
     * </p>
     * 
     * @param sourcePortfolioId
     *        The identifier of the source portfolio to use with this association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateProductWithPortfolioRequest withSourcePortfolioId(String sourcePortfolioId) {
        setSourcePortfolioId(sourcePortfolioId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: " + getPortfolioId() + ",");
        if (getSourcePortfolioId() != null)
            sb.append("SourcePortfolioId: " + getSourcePortfolioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateProductWithPortfolioRequest == false)
            return false;
        AssociateProductWithPortfolioRequest other = (AssociateProductWithPortfolioRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getSourcePortfolioId() == null ^ this.getSourcePortfolioId() == null)
            return false;
        if (other.getSourcePortfolioId() != null && other.getSourcePortfolioId().equals(this.getSourcePortfolioId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getSourcePortfolioId() == null) ? 0 : getSourcePortfolioId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateProductWithPortfolioRequest clone() {
        return (AssociateProductWithPortfolioRequest) super.clone();
    }
}
