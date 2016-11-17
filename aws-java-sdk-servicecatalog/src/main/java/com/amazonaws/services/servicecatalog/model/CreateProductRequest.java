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
public class CreateProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name of the product.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the product.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The text description of the product.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The distributor of the product.
     * </p>
     */
    private String distributor;
    /**
     * <p>
     * Support information about the product.
     * </p>
     */
    private String supportDescription;
    /**
     * <p>
     * Contact email for product support.
     * </p>
     */
    private String supportEmail;
    /**
     * <p>
     * Contact URL for product support.
     * </p>
     */
    private String supportUrl;
    /**
     * <p>
     * The type of the product to create.
     * </p>
     */
    private String productType;
    /**
     * <p>
     * Tags to associate with the new product.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Parameters for the provisioning artifact.
     * </p>
     */
    private ProvisioningArtifactProperties provisioningArtifactParameters;
    /**
     * <p>
     * A token to disambiguate duplicate requests. You can create multiple resources using the same input in multiple
     * requests, provided that you also specify a different idempotency token for each request.
     * </p>
     */
    private String idempotencyToken;

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

    public CreateProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
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

    public CreateProductRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the product.
     * </p>
     * 
     * @param owner
     *        The owner of the product.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the product.
     * </p>
     * 
     * @return The owner of the product.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the product.
     * </p>
     * 
     * @param owner
     *        The owner of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The text description of the product.
     * </p>
     * 
     * @param description
     *        The text description of the product.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description of the product.
     * </p>
     * 
     * @return The text description of the product.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description of the product.
     * </p>
     * 
     * @param description
     *        The text description of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The distributor of the product.
     * </p>
     * 
     * @param distributor
     *        The distributor of the product.
     */

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    /**
     * <p>
     * The distributor of the product.
     * </p>
     * 
     * @return The distributor of the product.
     */

    public String getDistributor() {
        return this.distributor;
    }

    /**
     * <p>
     * The distributor of the product.
     * </p>
     * 
     * @param distributor
     *        The distributor of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withDistributor(String distributor) {
        setDistributor(distributor);
        return this;
    }

    /**
     * <p>
     * Support information about the product.
     * </p>
     * 
     * @param supportDescription
     *        Support information about the product.
     */

    public void setSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
    }

    /**
     * <p>
     * Support information about the product.
     * </p>
     * 
     * @return Support information about the product.
     */

    public String getSupportDescription() {
        return this.supportDescription;
    }

    /**
     * <p>
     * Support information about the product.
     * </p>
     * 
     * @param supportDescription
     *        Support information about the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withSupportDescription(String supportDescription) {
        setSupportDescription(supportDescription);
        return this;
    }

    /**
     * <p>
     * Contact email for product support.
     * </p>
     * 
     * @param supportEmail
     *        Contact email for product support.
     */

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * <p>
     * Contact email for product support.
     * </p>
     * 
     * @return Contact email for product support.
     */

    public String getSupportEmail() {
        return this.supportEmail;
    }

    /**
     * <p>
     * Contact email for product support.
     * </p>
     * 
     * @param supportEmail
     *        Contact email for product support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withSupportEmail(String supportEmail) {
        setSupportEmail(supportEmail);
        return this;
    }

    /**
     * <p>
     * Contact URL for product support.
     * </p>
     * 
     * @param supportUrl
     *        Contact URL for product support.
     */

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    /**
     * <p>
     * Contact URL for product support.
     * </p>
     * 
     * @return Contact URL for product support.
     */

    public String getSupportUrl() {
        return this.supportUrl;
    }

    /**
     * <p>
     * Contact URL for product support.
     * </p>
     * 
     * @param supportUrl
     *        Contact URL for product support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withSupportUrl(String supportUrl) {
        setSupportUrl(supportUrl);
        return this;
    }

    /**
     * <p>
     * The type of the product to create.
     * </p>
     * 
     * @param productType
     *        The type of the product to create.
     * @see ProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The type of the product to create.
     * </p>
     * 
     * @return The type of the product to create.
     * @see ProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The type of the product to create.
     * </p>
     * 
     * @param productType
     *        The type of the product to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductType
     */

    public CreateProductRequest withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The type of the product to create.
     * </p>
     * 
     * @param productType
     *        The type of the product to create.
     * @see ProductType
     */

    public void setProductType(ProductType productType) {
        this.productType = productType.toString();
    }

    /**
     * <p>
     * The type of the product to create.
     * </p>
     * 
     * @param productType
     *        The type of the product to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductType
     */

    public CreateProductRequest withProductType(ProductType productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * Tags to associate with the new product.
     * </p>
     * 
     * @return Tags to associate with the new product.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to associate with the new product.
     * </p>
     * 
     * @param tags
     *        Tags to associate with the new product.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags to associate with the new product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to associate with the new product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to associate with the new product.
     * </p>
     * 
     * @param tags
     *        Tags to associate with the new product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Parameters for the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        Parameters for the provisioning artifact.
     */

    public void setProvisioningArtifactParameters(ProvisioningArtifactProperties provisioningArtifactParameters) {
        this.provisioningArtifactParameters = provisioningArtifactParameters;
    }

    /**
     * <p>
     * Parameters for the provisioning artifact.
     * </p>
     * 
     * @return Parameters for the provisioning artifact.
     */

    public ProvisioningArtifactProperties getProvisioningArtifactParameters() {
        return this.provisioningArtifactParameters;
    }

    /**
     * <p>
     * Parameters for the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        Parameters for the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withProvisioningArtifactParameters(ProvisioningArtifactProperties provisioningArtifactParameters) {
        setProvisioningArtifactParameters(provisioningArtifactParameters);
        return this;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can create multiple resources using the same input in multiple
     * requests, provided that you also specify a different idempotency token for each request.
     * </p>
     * 
     * @param idempotencyToken
     *        A token to disambiguate duplicate requests. You can create multiple resources using the same input in
     *        multiple requests, provided that you also specify a different idempotency token for each request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can create multiple resources using the same input in multiple
     * requests, provided that you also specify a different idempotency token for each request.
     * </p>
     * 
     * @return A token to disambiguate duplicate requests. You can create multiple resources using the same input in
     *         multiple requests, provided that you also specify a different idempotency token for each request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A token to disambiguate duplicate requests. You can create multiple resources using the same input in multiple
     * requests, provided that you also specify a different idempotency token for each request.
     * </p>
     * 
     * @param idempotencyToken
     *        A token to disambiguate duplicate requests. You can create multiple resources using the same input in
     *        multiple requests, provided that you also specify a different idempotency token for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDistributor() != null)
            sb.append("Distributor: " + getDistributor() + ",");
        if (getSupportDescription() != null)
            sb.append("SupportDescription: " + getSupportDescription() + ",");
        if (getSupportEmail() != null)
            sb.append("SupportEmail: " + getSupportEmail() + ",");
        if (getSupportUrl() != null)
            sb.append("SupportUrl: " + getSupportUrl() + ",");
        if (getProductType() != null)
            sb.append("ProductType: " + getProductType() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getProvisioningArtifactParameters() != null)
            sb.append("ProvisioningArtifactParameters: " + getProvisioningArtifactParameters() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProductRequest == false)
            return false;
        CreateProductRequest other = (CreateProductRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDistributor() == null ^ this.getDistributor() == null)
            return false;
        if (other.getDistributor() != null && other.getDistributor().equals(this.getDistributor()) == false)
            return false;
        if (other.getSupportDescription() == null ^ this.getSupportDescription() == null)
            return false;
        if (other.getSupportDescription() != null && other.getSupportDescription().equals(this.getSupportDescription()) == false)
            return false;
        if (other.getSupportEmail() == null ^ this.getSupportEmail() == null)
            return false;
        if (other.getSupportEmail() != null && other.getSupportEmail().equals(this.getSupportEmail()) == false)
            return false;
        if (other.getSupportUrl() == null ^ this.getSupportUrl() == null)
            return false;
        if (other.getSupportUrl() != null && other.getSupportUrl().equals(this.getSupportUrl()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProvisioningArtifactParameters() == null ^ this.getProvisioningArtifactParameters() == null)
            return false;
        if (other.getProvisioningArtifactParameters() != null
                && other.getProvisioningArtifactParameters().equals(this.getProvisioningArtifactParameters()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDistributor() == null) ? 0 : getDistributor().hashCode());
        hashCode = prime * hashCode + ((getSupportDescription() == null) ? 0 : getSupportDescription().hashCode());
        hashCode = prime * hashCode + ((getSupportEmail() == null) ? 0 : getSupportEmail().hashCode());
        hashCode = prime * hashCode + ((getSupportUrl() == null) ? 0 : getSupportUrl().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactParameters() == null) ? 0 : getProvisioningArtifactParameters().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateProductRequest clone() {
        return (CreateProductRequest) super.clone();
    }
}
