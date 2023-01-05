/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon EKS add-on from the Amazon Web Services Marketplace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/MarketplaceInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MarketplaceInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The product ID from the Amazon Web Services Marketplace.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The product URL from the Amazon Web Services Marketplace.
     * </p>
     */
    private String productUrl;

    /**
     * <p>
     * The product ID from the Amazon Web Services Marketplace.
     * </p>
     * 
     * @param productId
     *        The product ID from the Amazon Web Services Marketplace.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product ID from the Amazon Web Services Marketplace.
     * </p>
     * 
     * @return The product ID from the Amazon Web Services Marketplace.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product ID from the Amazon Web Services Marketplace.
     * </p>
     * 
     * @param productId
     *        The product ID from the Amazon Web Services Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MarketplaceInformation withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The product URL from the Amazon Web Services Marketplace.
     * </p>
     * 
     * @param productUrl
     *        The product URL from the Amazon Web Services Marketplace.
     */

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * <p>
     * The product URL from the Amazon Web Services Marketplace.
     * </p>
     * 
     * @return The product URL from the Amazon Web Services Marketplace.
     */

    public String getProductUrl() {
        return this.productUrl;
    }

    /**
     * <p>
     * The product URL from the Amazon Web Services Marketplace.
     * </p>
     * 
     * @param productUrl
     *        The product URL from the Amazon Web Services Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MarketplaceInformation withProductUrl(String productUrl) {
        setProductUrl(productUrl);
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
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProductUrl() != null)
            sb.append("ProductUrl: ").append(getProductUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MarketplaceInformation == false)
            return false;
        MarketplaceInformation other = (MarketplaceInformation) obj;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProductUrl() == null ^ this.getProductUrl() == null)
            return false;
        if (other.getProductUrl() != null && other.getProductUrl().equals(this.getProductUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProductUrl() == null) ? 0 : getProductUrl().hashCode());
        return hashCode;
    }

    @Override
    public MarketplaceInformation clone() {
        try {
            return (MarketplaceInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.MarketplaceInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
