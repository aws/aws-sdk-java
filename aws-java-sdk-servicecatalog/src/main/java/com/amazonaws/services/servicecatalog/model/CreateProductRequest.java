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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateProduct" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The description of the product.
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
     * The support information about the product.
     * </p>
     */
    private String supportDescription;
    /**
     * <p>
     * The contact email for product support.
     * </p>
     */
    private String supportEmail;
    /**
     * <p>
     * The contact URL for product support.
     * </p>
     */
    private String supportUrl;
    /**
     * <p>
     * The type of product.
     * </p>
     */
    private String productType;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The configuration of the provisioning artifact.
     * </p>
     */
    private ProvisioningArtifactProperties provisioningArtifactParameters;
    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     */
    private String idempotencyToken;

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
     * The description of the product.
     * </p>
     * 
     * @param description
     *        The description of the product.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     * 
     * @return The description of the product.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the product.
     * </p>
     * 
     * @param description
     *        The description of the product.
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
     * The support information about the product.
     * </p>
     * 
     * @param supportDescription
     *        The support information about the product.
     */

    public void setSupportDescription(String supportDescription) {
        this.supportDescription = supportDescription;
    }

    /**
     * <p>
     * The support information about the product.
     * </p>
     * 
     * @return The support information about the product.
     */

    public String getSupportDescription() {
        return this.supportDescription;
    }

    /**
     * <p>
     * The support information about the product.
     * </p>
     * 
     * @param supportDescription
     *        The support information about the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withSupportDescription(String supportDescription) {
        setSupportDescription(supportDescription);
        return this;
    }

    /**
     * <p>
     * The contact email for product support.
     * </p>
     * 
     * @param supportEmail
     *        The contact email for product support.
     */

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * <p>
     * The contact email for product support.
     * </p>
     * 
     * @return The contact email for product support.
     */

    public String getSupportEmail() {
        return this.supportEmail;
    }

    /**
     * <p>
     * The contact email for product support.
     * </p>
     * 
     * @param supportEmail
     *        The contact email for product support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withSupportEmail(String supportEmail) {
        setSupportEmail(supportEmail);
        return this;
    }

    /**
     * <p>
     * The contact URL for product support.
     * </p>
     * 
     * @param supportUrl
     *        The contact URL for product support.
     */

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    /**
     * <p>
     * The contact URL for product support.
     * </p>
     * 
     * @return The contact URL for product support.
     */

    public String getSupportUrl() {
        return this.supportUrl;
    }

    /**
     * <p>
     * The contact URL for product support.
     * </p>
     * 
     * @param supportUrl
     *        The contact URL for product support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withSupportUrl(String supportUrl) {
        setSupportUrl(supportUrl);
        return this;
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * 
     * @param productType
     *        The type of product.
     * @see ProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * 
     * @return The type of product.
     * @see ProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * 
     * @param productType
     *        The type of product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductType
     */

    public CreateProductRequest withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * 
     * @param productType
     *        The type of product.
     * @see ProductType
     */

    public void setProductType(ProductType productType) {
        withProductType(productType);
    }

    /**
     * <p>
     * The type of product.
     * </p>
     * 
     * @param productType
     *        The type of product.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductType
     */

    public CreateProductRequest withProductType(ProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
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
     * One or more tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags.
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
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        The configuration of the provisioning artifact.
     */

    public void setProvisioningArtifactParameters(ProvisioningArtifactProperties provisioningArtifactParameters) {
        this.provisioningArtifactParameters = provisioningArtifactParameters;
    }

    /**
     * <p>
     * The configuration of the provisioning artifact.
     * </p>
     * 
     * @return The configuration of the provisioning artifact.
     */

    public ProvisioningArtifactProperties getProvisioningArtifactParameters() {
        return this.provisioningArtifactParameters;
    }

    /**
     * <p>
     * The configuration of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        The configuration of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withProvisioningArtifactParameters(ProvisioningArtifactProperties provisioningArtifactParameters) {
        setProvisioningArtifactParameters(provisioningArtifactParameters);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @return A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *         idempotency token, the same response is returned for each repeated request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProductRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDistributor() != null)
            sb.append("Distributor: ").append(getDistributor()).append(",");
        if (getSupportDescription() != null)
            sb.append("SupportDescription: ").append(getSupportDescription()).append(",");
        if (getSupportEmail() != null)
            sb.append("SupportEmail: ").append(getSupportEmail()).append(",");
        if (getSupportUrl() != null)
            sb.append("SupportUrl: ").append(getSupportUrl()).append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProvisioningArtifactParameters() != null)
            sb.append("ProvisioningArtifactParameters: ").append(getProvisioningArtifactParameters()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
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
