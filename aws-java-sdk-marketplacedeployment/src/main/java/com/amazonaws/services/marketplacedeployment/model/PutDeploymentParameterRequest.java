/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacedeployment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/PutDeploymentParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDeploymentParameterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     */
    private String agreementId;
    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWS Marketplace</code>
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * The idempotency token for deployment parameters. A unique identifier for the new version.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The deployment parameter targeted to the acceptor of an agreement for which to create the AWS Secret Manager
     * resource.
     * </p>
     */
    private DeploymentParameterInput deploymentParameter;
    /**
     * <p>
     * The date when deployment parameters expire and are scheduled for deletion.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * The product for which AWS Marketplace will save secrets for the buyer’s account.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be applied for
     * create operations, and they'll be ignored if the resource already exists.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier of the agreement.
     */

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @return The unique identifier of the agreement.
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier of the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest withAgreementId(String agreementId) {
        setAgreementId(agreementId);
        return this;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWS Marketplace</code>
     * </p>
     * 
     * @param catalog
     *        The catalog related to the request. Fixed value: <code>AWS Marketplace</code>
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWS Marketplace</code>
     * </p>
     * 
     * @return The catalog related to the request. Fixed value: <code>AWS Marketplace</code>
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWS Marketplace</code>
     * </p>
     * 
     * @param catalog
     *        The catalog related to the request. Fixed value: <code>AWS Marketplace</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * The idempotency token for deployment parameters. A unique identifier for the new version.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for deployment parameters. A unique identifier for the new version.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for deployment parameters. A unique identifier for the new version.
     * </p>
     * 
     * @return The idempotency token for deployment parameters. A unique identifier for the new version.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for deployment parameters. A unique identifier for the new version.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for deployment parameters. A unique identifier for the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The deployment parameter targeted to the acceptor of an agreement for which to create the AWS Secret Manager
     * resource.
     * </p>
     * 
     * @param deploymentParameter
     *        The deployment parameter targeted to the acceptor of an agreement for which to create the AWS Secret
     *        Manager resource.
     */

    public void setDeploymentParameter(DeploymentParameterInput deploymentParameter) {
        this.deploymentParameter = deploymentParameter;
    }

    /**
     * <p>
     * The deployment parameter targeted to the acceptor of an agreement for which to create the AWS Secret Manager
     * resource.
     * </p>
     * 
     * @return The deployment parameter targeted to the acceptor of an agreement for which to create the AWS Secret
     *         Manager resource.
     */

    public DeploymentParameterInput getDeploymentParameter() {
        return this.deploymentParameter;
    }

    /**
     * <p>
     * The deployment parameter targeted to the acceptor of an agreement for which to create the AWS Secret Manager
     * resource.
     * </p>
     * 
     * @param deploymentParameter
     *        The deployment parameter targeted to the acceptor of an agreement for which to create the AWS Secret
     *        Manager resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest withDeploymentParameter(DeploymentParameterInput deploymentParameter) {
        setDeploymentParameter(deploymentParameter);
        return this;
    }

    /**
     * <p>
     * The date when deployment parameters expire and are scheduled for deletion.
     * </p>
     * 
     * @param expirationDate
     *        The date when deployment parameters expire and are scheduled for deletion.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date when deployment parameters expire and are scheduled for deletion.
     * </p>
     * 
     * @return The date when deployment parameters expire and are scheduled for deletion.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date when deployment parameters expire and are scheduled for deletion.
     * </p>
     * 
     * @param expirationDate
     *        The date when deployment parameters expire and are scheduled for deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * The product for which AWS Marketplace will save secrets for the buyer’s account.
     * </p>
     * 
     * @param productId
     *        The product for which AWS Marketplace will save secrets for the buyer’s account.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product for which AWS Marketplace will save secrets for the buyer’s account.
     * </p>
     * 
     * @return The product for which AWS Marketplace will save secrets for the buyer’s account.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product for which AWS Marketplace will save secrets for the buyer’s account.
     * </p>
     * 
     * @param productId
     *        The product for which AWS Marketplace will save secrets for the buyer’s account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be applied for
     * create operations, and they'll be ignored if the resource already exists.
     * </p>
     * 
     * @return A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be
     *         applied for create operations, and they'll be ignored if the resource already exists.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be applied for
     * create operations, and they'll be ignored if the resource already exists.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be
     *        applied for create operations, and they'll be ignored if the resource already exists.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be applied for
     * create operations, and they'll be ignored if the resource already exists.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs, where each pair represents a tag saved to the resource. Tags will only be
     *        applied for create operations, and they'll be ignored if the resource already exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PutDeploymentParameterRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeploymentParameterRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAgreementId() != null)
            sb.append("AgreementId: ").append(getAgreementId()).append(",");
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDeploymentParameter() != null)
            sb.append("DeploymentParameter: ").append(getDeploymentParameter()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDeploymentParameterRequest == false)
            return false;
        PutDeploymentParameterRequest other = (PutDeploymentParameterRequest) obj;
        if (other.getAgreementId() == null ^ this.getAgreementId() == null)
            return false;
        if (other.getAgreementId() != null && other.getAgreementId().equals(this.getAgreementId()) == false)
            return false;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDeploymentParameter() == null ^ this.getDeploymentParameter() == null)
            return false;
        if (other.getDeploymentParameter() != null && other.getDeploymentParameter().equals(this.getDeploymentParameter()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDeploymentParameter() == null) ? 0 : getDeploymentParameter().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutDeploymentParameterRequest clone() {
        return (PutDeploymentParameterRequest) super.clone();
    }

}
