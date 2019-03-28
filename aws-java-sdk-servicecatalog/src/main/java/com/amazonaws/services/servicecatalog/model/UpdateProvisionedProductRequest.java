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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisionedProduct"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisionedProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The updated name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * The identifier of the product.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The new path identifier. This value is optional if the product has a default path, and required if the product
     * has more than one path.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * The new parameters.
     * </p>
     */
    private java.util.List<UpdateProvisioningParameter> provisioningParameters;
    /**
     * <p>
     * An object that contains information about the provisioning preferences for a stack set.
     * </p>
     */
    private UpdateProvisioningPreferences provisioningPreferences;
    /**
     * <p>
     * One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update request.
     * </p>
     */
    private String updateToken;

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

    public UpdateProvisionedProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The updated name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @param provisionedProductName
     *        The updated name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code>
     *        and <code>ProvisionedProductId</code>.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The updated name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @return The updated name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code>
     *         and <code>ProvisionedProductId</code>.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * The updated name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @param provisionedProductName
     *        The updated name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code>
     *        and <code>ProvisionedProductId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     *        <code>ProvisionedProductId</code>.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @return The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code>
     *         and <code>ProvisionedProductId</code>.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     *        <code>ProvisionedProductId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * The identifier of the product.
     * </p>
     * 
     * @param productId
     *        The identifier of the product.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The identifier of the product.
     * </p>
     * 
     * @return The identifier of the product.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The identifier of the product.
     * </p>
     * 
     * @param productId
     *        The identifier of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @return The identifier of the provisioning artifact.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The new path identifier. This value is optional if the product has a default path, and required if the product
     * has more than one path.
     * </p>
     * 
     * @param pathId
     *        The new path identifier. This value is optional if the product has a default path, and required if the
     *        product has more than one path.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The new path identifier. This value is optional if the product has a default path, and required if the product
     * has more than one path.
     * </p>
     * 
     * @return The new path identifier. This value is optional if the product has a default path, and required if the
     *         product has more than one path.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The new path identifier. This value is optional if the product has a default path, and required if the product
     * has more than one path.
     * </p>
     * 
     * @param pathId
     *        The new path identifier. This value is optional if the product has a default path, and required if the
     *        product has more than one path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * The new parameters.
     * </p>
     * 
     * @return The new parameters.
     */

    public java.util.List<UpdateProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * The new parameters.
     * </p>
     * 
     * @param provisioningParameters
     *        The new parameters.
     */

    public void setProvisioningParameters(java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        if (provisioningParameters == null) {
            this.provisioningParameters = null;
            return;
        }

        this.provisioningParameters = new java.util.ArrayList<UpdateProvisioningParameter>(provisioningParameters);
    }

    /**
     * <p>
     * The new parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningParameters(java.util.Collection)} or
     * {@link #withProvisioningParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningParameters
     *        The new parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisioningParameters(UpdateProvisioningParameter... provisioningParameters) {
        if (this.provisioningParameters == null) {
            setProvisioningParameters(new java.util.ArrayList<UpdateProvisioningParameter>(provisioningParameters.length));
        }
        for (UpdateProvisioningParameter ele : provisioningParameters) {
            this.provisioningParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The new parameters.
     * </p>
     * 
     * @param provisioningParameters
     *        The new parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisioningParameters(java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
        return this;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences for a stack set.
     * </p>
     * 
     * @param provisioningPreferences
     *        An object that contains information about the provisioning preferences for a stack set.
     */

    public void setProvisioningPreferences(UpdateProvisioningPreferences provisioningPreferences) {
        this.provisioningPreferences = provisioningPreferences;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences for a stack set.
     * </p>
     * 
     * @return An object that contains information about the provisioning preferences for a stack set.
     */

    public UpdateProvisioningPreferences getProvisioningPreferences() {
        return this.provisioningPreferences;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences for a stack set.
     * </p>
     * 
     * @param provisioningPreferences
     *        An object that contains information about the provisioning preferences for a stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisioningPreferences(UpdateProvisioningPreferences provisioningPreferences) {
        setProvisioningPreferences(provisioningPreferences);
        return this;
    }

    /**
     * <p>
     * One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
     * </p>
     * 
     * @return One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     *         <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
     * </p>
     * 
     * @param tags
     *        One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     *        <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
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
     * One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     *        <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withTags(Tag... tags) {
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
     * One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
     * </p>
     * 
     * @param tags
     *        One or more tags. Requires the product to have <code>RESOURCE_UPDATE</code> constraint with
     *        <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code> to allow tag updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update request.
     * </p>
     * 
     * @param updateToken
     *        The idempotency token that uniquely identifies the provisioning update request.
     */

    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update request.
     * </p>
     * 
     * @return The idempotency token that uniquely identifies the provisioning update request.
     */

    public String getUpdateToken() {
        return this.updateToken;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update request.
     * </p>
     * 
     * @param updateToken
     *        The idempotency token that uniquely identifies the provisioning update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withUpdateToken(String updateToken) {
        setUpdateToken(updateToken);
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
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: ").append(getProvisionedProductName()).append(",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: ").append(getProvisionedProductId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getPathId() != null)
            sb.append("PathId: ").append(getPathId()).append(",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: ").append(getProvisioningParameters()).append(",");
        if (getProvisioningPreferences() != null)
            sb.append("ProvisioningPreferences: ").append(getProvisioningPreferences()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdateToken() != null)
            sb.append("UpdateToken: ").append(getUpdateToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisionedProductRequest == false)
            return false;
        UpdateProvisionedProductRequest other = (UpdateProvisionedProductRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        if (other.getProvisioningPreferences() == null ^ this.getProvisioningPreferences() == null)
            return false;
        if (other.getProvisioningPreferences() != null && other.getProvisioningPreferences().equals(this.getProvisioningPreferences()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters().hashCode());
        hashCode = prime * hashCode + ((getProvisioningPreferences() == null) ? 0 : getProvisioningPreferences().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisionedProductRequest clone() {
        return (UpdateProvisionedProductRequest) super.clone();
    }

}
