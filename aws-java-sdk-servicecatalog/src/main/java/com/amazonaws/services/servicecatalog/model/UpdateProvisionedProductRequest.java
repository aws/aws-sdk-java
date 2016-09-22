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
public class UpdateProvisionedProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The updated name of the ProvisionedProduct object . You must specify either <code>ProvisionedProductName</code>
     * or <code>ProvisionedProductId</code>, but not both.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * The identifier of the ProvisionedProduct object to update. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The identifier of the path to use in the updated ProvisionedProduct object. This value is optional if the product
     * has a default path, and is required if there is more than one path for the specified product.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
     * </p>
     */
    private java.util.List<UpdateProvisioningParameter> provisioningParameters;
    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update request.
     * </p>
     */
    private String updateToken;

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

    public UpdateProvisionedProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The updated name of the ProvisionedProduct object . You must specify either <code>ProvisionedProductName</code>
     * or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @param provisionedProductName
     *        The updated name of the ProvisionedProduct object . You must specify either
     *        <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The updated name of the ProvisionedProduct object . You must specify either <code>ProvisionedProductName</code>
     * or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @return The updated name of the ProvisionedProduct object . You must specify either
     *         <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * The updated name of the ProvisionedProduct object . You must specify either <code>ProvisionedProductName</code>
     * or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @param provisionedProductName
     *        The updated name of the ProvisionedProduct object . You must specify either
     *        <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object to update. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the ProvisionedProduct object to update. You must specify either
     *        <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object to update. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @return The identifier of the ProvisionedProduct object to update. You must specify either
     *         <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object to update. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the ProvisionedProduct object to update. You must specify either
     *        <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @param productId
     *        The identifier of the ProvisionedProduct object.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @return The identifier of the ProvisionedProduct object.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @param productId
     *        The identifier of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The provisioning artifact identifier for this product.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @return The provisioning artifact identifier for this product.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The provisioning artifact identifier for this product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The identifier of the path to use in the updated ProvisionedProduct object. This value is optional if the product
     * has a default path, and is required if there is more than one path for the specified product.
     * </p>
     * 
     * @param pathId
     *        The identifier of the path to use in the updated ProvisionedProduct object. This value is optional if the
     *        product has a default path, and is required if there is more than one path for the specified product.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The identifier of the path to use in the updated ProvisionedProduct object. This value is optional if the product
     * has a default path, and is required if there is more than one path for the specified product.
     * </p>
     * 
     * @return The identifier of the path to use in the updated ProvisionedProduct object. This value is optional if the
     *         product has a default path, and is required if there is more than one path for the specified product.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The identifier of the path to use in the updated ProvisionedProduct object. This value is optional if the product
     * has a default path, and is required if there is more than one path for the specified product.
     * </p>
     * 
     * @param pathId
     *        The identifier of the path to use in the updated ProvisionedProduct object. This value is optional if the
     *        product has a default path, and is required if there is more than one path for the specified product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
     * </p>
     * 
     * @return A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
     */

    public java.util.List<UpdateProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
     * </p>
     * 
     * @param provisioningParameters
     *        A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
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
     * A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningParameters(java.util.Collection)} or
     * {@link #withProvisioningParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningParameters
     *        A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
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
     * A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
     * </p>
     * 
     * @param provisioningParameters
     *        A list of <code>ProvisioningParameter</code> objects used to update the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductRequest withProvisioningParameters(java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
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
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: " + getProvisionedProductId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId() + ",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: " + getProvisioningParameters() + ",");
        if (getUpdateToken() != null)
            sb.append("UpdateToken: " + getUpdateToken());
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
        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisionedProductRequest clone() {
        return (UpdateProvisionedProductRequest) super.clone();
    }
}
