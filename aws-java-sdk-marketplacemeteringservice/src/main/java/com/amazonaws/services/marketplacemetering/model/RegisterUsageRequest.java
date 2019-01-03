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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/RegisterUsage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * Public Key Version provided by AWS Marketplace
     * </p>
     */
    private Integer publicKeyVersion;
    /**
     * <p>
     * (Optional) To scope down the registration to a specific running software instance and guard against replay
     * attacks.
     * </p>
     */
    private String nonce;

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     * 
     * @param productCode
     *        Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the
     *        same as the one used during the publishing of a new product.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     * 
     * @return Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the
     *         same as the one used during the publishing of a new product.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as
     * the one used during the publishing of a new product.
     * </p>
     * 
     * @param productCode
     *        Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the
     *        same as the one used during the publishing of a new product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUsageRequest withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * Public Key Version provided by AWS Marketplace
     * </p>
     * 
     * @param publicKeyVersion
     *        Public Key Version provided by AWS Marketplace
     */

    public void setPublicKeyVersion(Integer publicKeyVersion) {
        this.publicKeyVersion = publicKeyVersion;
    }

    /**
     * <p>
     * Public Key Version provided by AWS Marketplace
     * </p>
     * 
     * @return Public Key Version provided by AWS Marketplace
     */

    public Integer getPublicKeyVersion() {
        return this.publicKeyVersion;
    }

    /**
     * <p>
     * Public Key Version provided by AWS Marketplace
     * </p>
     * 
     * @param publicKeyVersion
     *        Public Key Version provided by AWS Marketplace
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUsageRequest withPublicKeyVersion(Integer publicKeyVersion) {
        setPublicKeyVersion(publicKeyVersion);
        return this;
    }

    /**
     * <p>
     * (Optional) To scope down the registration to a specific running software instance and guard against replay
     * attacks.
     * </p>
     * 
     * @param nonce
     *        (Optional) To scope down the registration to a specific running software instance and guard against replay
     *        attacks.
     */

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * <p>
     * (Optional) To scope down the registration to a specific running software instance and guard against replay
     * attacks.
     * </p>
     * 
     * @return (Optional) To scope down the registration to a specific running software instance and guard against
     *         replay attacks.
     */

    public String getNonce() {
        return this.nonce;
    }

    /**
     * <p>
     * (Optional) To scope down the registration to a specific running software instance and guard against replay
     * attacks.
     * </p>
     * 
     * @param nonce
     *        (Optional) To scope down the registration to a specific running software instance and guard against replay
     *        attacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUsageRequest withNonce(String nonce) {
        setNonce(nonce);
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
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
        if (getPublicKeyVersion() != null)
            sb.append("PublicKeyVersion: ").append(getPublicKeyVersion()).append(",");
        if (getNonce() != null)
            sb.append("Nonce: ").append(getNonce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterUsageRequest == false)
            return false;
        RegisterUsageRequest other = (RegisterUsageRequest) obj;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getPublicKeyVersion() == null ^ this.getPublicKeyVersion() == null)
            return false;
        if (other.getPublicKeyVersion() != null && other.getPublicKeyVersion().equals(this.getPublicKeyVersion()) == false)
            return false;
        if (other.getNonce() == null ^ this.getNonce() == null)
            return false;
        if (other.getNonce() != null && other.getNonce().equals(this.getNonce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getPublicKeyVersion() == null) ? 0 : getPublicKeyVersion().hashCode());
        hashCode = prime * hashCode + ((getNonce() == null) ? 0 : getNonce().hashCode());
        return hashCode;
    }

    @Override
    public RegisterUsageRequest clone() {
        return (RegisterUsageRequest) super.clone();
    }

}
