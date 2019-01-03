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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a product view.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProductViewSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductViewSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The product view identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The name of the product.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the product. Contact the product administrator for the significance of this value.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * Short description of the product.
     * </p>
     */
    private String shortDescription;
    /**
     * <p>
     * The product type. Contact the product administrator for the significance of this value. If this value is
     * <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The distributor of the product. Contact the product administrator for the significance of this value.
     * </p>
     */
    private String distributor;
    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not have a default path, call
     * <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the
     * output of <a>ProductViewSummary</a> can be used directly with <a>DescribeProvisioningParameters</a>.
     * </p>
     */
    private Boolean hasDefaultPath;
    /**
     * <p>
     * The email contact information to obtain support for this Product.
     * </p>
     */
    private String supportEmail;
    /**
     * <p>
     * The description of the support for this Product.
     * </p>
     */
    private String supportDescription;
    /**
     * <p>
     * The URL information to obtain support for this Product.
     * </p>
     */
    private String supportUrl;

    /**
     * <p>
     * The product view identifier.
     * </p>
     * 
     * @param id
     *        The product view identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The product view identifier.
     * </p>
     * 
     * @return The product view identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The product view identifier.
     * </p>
     * 
     * @param id
     *        The product view identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withId(String id) {
        setId(id);
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

    public ProductViewSummary withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @param name
     *        The name of the product.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @return The name of the product.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the product.
     * </p>
     * 
     * @param name
     *        The name of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the product. Contact the product administrator for the significance of this value.
     * </p>
     * 
     * @param owner
     *        The owner of the product. Contact the product administrator for the significance of this value.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the product. Contact the product administrator for the significance of this value.
     * </p>
     * 
     * @return The owner of the product. Contact the product administrator for the significance of this value.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the product. Contact the product administrator for the significance of this value.
     * </p>
     * 
     * @param owner
     *        The owner of the product. Contact the product administrator for the significance of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Short description of the product.
     * </p>
     * 
     * @param shortDescription
     *        Short description of the product.
     */

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * <p>
     * Short description of the product.
     * </p>
     * 
     * @return Short description of the product.
     */

    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * <p>
     * Short description of the product.
     * </p>
     * 
     * @param shortDescription
     *        Short description of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withShortDescription(String shortDescription) {
        setShortDescription(shortDescription);
        return this;
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance of this value. If this value is
     * <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * </p>
     * 
     * @param type
     *        The product type. Contact the product administrator for the significance of this value. If this value is
     *        <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * @see ProductType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance of this value. If this value is
     * <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * </p>
     * 
     * @return The product type. Contact the product administrator for the significance of this value. If this value is
     *         <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * @see ProductType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance of this value. If this value is
     * <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * </p>
     * 
     * @param type
     *        The product type. Contact the product administrator for the significance of this value. If this value is
     *        <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductType
     */

    public ProductViewSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance of this value. If this value is
     * <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * </p>
     * 
     * @param type
     *        The product type. Contact the product administrator for the significance of this value. If this value is
     *        <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * @see ProductType
     */

    public void setType(ProductType type) {
        withType(type);
    }

    /**
     * <p>
     * The product type. Contact the product administrator for the significance of this value. If this value is
     * <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * </p>
     * 
     * @param type
     *        The product type. Contact the product administrator for the significance of this value. If this value is
     *        <code>MARKETPLACE</code>, the product was created by AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductType
     */

    public ProductViewSummary withType(ProductType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The distributor of the product. Contact the product administrator for the significance of this value.
     * </p>
     * 
     * @param distributor
     *        The distributor of the product. Contact the product administrator for the significance of this value.
     */

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    /**
     * <p>
     * The distributor of the product. Contact the product administrator for the significance of this value.
     * </p>
     * 
     * @return The distributor of the product. Contact the product administrator for the significance of this value.
     */

    public String getDistributor() {
        return this.distributor;
    }

    /**
     * <p>
     * The distributor of the product. Contact the product administrator for the significance of this value.
     * </p>
     * 
     * @param distributor
     *        The distributor of the product. Contact the product administrator for the significance of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withDistributor(String distributor) {
        setDistributor(distributor);
        return this;
    }

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not have a default path, call
     * <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the
     * output of <a>ProductViewSummary</a> can be used directly with <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @param hasDefaultPath
     *        Indicates whether the product has a default path. If the product does not have a default path, call
     *        <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required,
     *        and the output of <a>ProductViewSummary</a> can be used directly with
     *        <a>DescribeProvisioningParameters</a>.
     */

    public void setHasDefaultPath(Boolean hasDefaultPath) {
        this.hasDefaultPath = hasDefaultPath;
    }

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not have a default path, call
     * <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the
     * output of <a>ProductViewSummary</a> can be used directly with <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @return Indicates whether the product has a default path. If the product does not have a default path, call
     *         <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required,
     *         and the output of <a>ProductViewSummary</a> can be used directly with
     *         <a>DescribeProvisioningParameters</a>.
     */

    public Boolean getHasDefaultPath() {
        return this.hasDefaultPath;
    }

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not have a default path, call
     * <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the
     * output of <a>ProductViewSummary</a> can be used directly with <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @param hasDefaultPath
     *        Indicates whether the product has a default path. If the product does not have a default path, call
     *        <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required,
     *        and the output of <a>ProductViewSummary</a> can be used directly with
     *        <a>DescribeProvisioningParameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withHasDefaultPath(Boolean hasDefaultPath) {
        setHasDefaultPath(hasDefaultPath);
        return this;
    }

    /**
     * <p>
     * Indicates whether the product has a default path. If the product does not have a default path, call
     * <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required, and the
     * output of <a>ProductViewSummary</a> can be used directly with <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @return Indicates whether the product has a default path. If the product does not have a default path, call
     *         <a>ListLaunchPaths</a> to disambiguate between paths. Otherwise, <a>ListLaunchPaths</a> is not required,
     *         and the output of <a>ProductViewSummary</a> can be used directly with
     *         <a>DescribeProvisioningParameters</a>.
     */

    public Boolean isHasDefaultPath() {
        return this.hasDefaultPath;
    }

    /**
     * <p>
     * The email contact information to obtain support for this Product.
     * </p>
     * 
     * @param supportEmail
     *        The email contact information to obtain support for this Product.
     */

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * <p>
     * The email contact information to obtain support for this Product.
     * </p>
     * 
     * @return The email contact information to obtain support for this Product.
     */

    public String getSupportEmail() {
        return this.supportEmail;
    }

    /**
     * <p>
     * The email contact information to obtain support for this Product.
     * </p>
     * 
     * @param supportEmail
     *        The email contact information to obtain support for this Product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withSupportEmail(String supportEmail) {
        setSupportEmail(supportEmail);
        return this;
    }

    /**
     * <p>
     * The description of the support for this Product.
     * </p>
     * 
     * @param supportDescription
     *        The description of the support for this Product.
     */

    public void setSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
    }

    /**
     * <p>
     * The description of the support for this Product.
     * </p>
     * 
     * @return The description of the support for this Product.
     */

    public String getSupportDescription() {
        return this.supportDescription;
    }

    /**
     * <p>
     * The description of the support for this Product.
     * </p>
     * 
     * @param supportDescription
     *        The description of the support for this Product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withSupportDescription(String supportDescription) {
        setSupportDescription(supportDescription);
        return this;
    }

    /**
     * <p>
     * The URL information to obtain support for this Product.
     * </p>
     * 
     * @param supportUrl
     *        The URL information to obtain support for this Product.
     */

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    /**
     * <p>
     * The URL information to obtain support for this Product.
     * </p>
     * 
     * @return The URL information to obtain support for this Product.
     */

    public String getSupportUrl() {
        return this.supportUrl;
    }

    /**
     * <p>
     * The URL information to obtain support for this Product.
     * </p>
     * 
     * @param supportUrl
     *        The URL information to obtain support for this Product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewSummary withSupportUrl(String supportUrl) {
        setSupportUrl(supportUrl);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getShortDescription() != null)
            sb.append("ShortDescription: ").append(getShortDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDistributor() != null)
            sb.append("Distributor: ").append(getDistributor()).append(",");
        if (getHasDefaultPath() != null)
            sb.append("HasDefaultPath: ").append(getHasDefaultPath()).append(",");
        if (getSupportEmail() != null)
            sb.append("SupportEmail: ").append(getSupportEmail()).append(",");
        if (getSupportDescription() != null)
            sb.append("SupportDescription: ").append(getSupportDescription()).append(",");
        if (getSupportUrl() != null)
            sb.append("SupportUrl: ").append(getSupportUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductViewSummary == false)
            return false;
        ProductViewSummary other = (ProductViewSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getShortDescription() == null ^ this.getShortDescription() == null)
            return false;
        if (other.getShortDescription() != null && other.getShortDescription().equals(this.getShortDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDistributor() == null ^ this.getDistributor() == null)
            return false;
        if (other.getDistributor() != null && other.getDistributor().equals(this.getDistributor()) == false)
            return false;
        if (other.getHasDefaultPath() == null ^ this.getHasDefaultPath() == null)
            return false;
        if (other.getHasDefaultPath() != null && other.getHasDefaultPath().equals(this.getHasDefaultPath()) == false)
            return false;
        if (other.getSupportEmail() == null ^ this.getSupportEmail() == null)
            return false;
        if (other.getSupportEmail() != null && other.getSupportEmail().equals(this.getSupportEmail()) == false)
            return false;
        if (other.getSupportDescription() == null ^ this.getSupportDescription() == null)
            return false;
        if (other.getSupportDescription() != null && other.getSupportDescription().equals(this.getSupportDescription()) == false)
            return false;
        if (other.getSupportUrl() == null ^ this.getSupportUrl() == null)
            return false;
        if (other.getSupportUrl() != null && other.getSupportUrl().equals(this.getSupportUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getShortDescription() == null) ? 0 : getShortDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDistributor() == null) ? 0 : getDistributor().hashCode());
        hashCode = prime * hashCode + ((getHasDefaultPath() == null) ? 0 : getHasDefaultPath().hashCode());
        hashCode = prime * hashCode + ((getSupportEmail() == null) ? 0 : getSupportEmail().hashCode());
        hashCode = prime * hashCode + ((getSupportDescription() == null) ? 0 : getSupportDescription().hashCode());
        hashCode = prime * hashCode + ((getSupportUrl() == null) ? 0 : getSupportUrl().hashCode());
        return hashCode;
    }

    @Override
    public ProductViewSummary clone() {
        try {
            return (ProductViewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProductViewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
