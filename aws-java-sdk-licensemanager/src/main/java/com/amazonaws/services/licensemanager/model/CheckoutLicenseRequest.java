/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutLicense" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckoutLicenseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Product SKU.
     * </p>
     */
    private String productSKU;
    /**
     * <p>
     * Checkout type.
     * </p>
     */
    private String checkoutType;
    /**
     * <p>
     * Key fingerprint identifying the license.
     * </p>
     */
    private String keyFingerprint;
    /**
     * <p>
     * License entitlements.
     * </p>
     */
    private java.util.List<EntitlementData> entitlements;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * License beneficiary.
     * </p>
     */
    private String beneficiary;
    /**
     * <p>
     * Node ID.
     * </p>
     */
    private String nodeId;

    /**
     * <p>
     * Product SKU.
     * </p>
     * 
     * @param productSKU
     *        Product SKU.
     */

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    /**
     * <p>
     * Product SKU.
     * </p>
     * 
     * @return Product SKU.
     */

    public String getProductSKU() {
        return this.productSKU;
    }

    /**
     * <p>
     * Product SKU.
     * </p>
     * 
     * @param productSKU
     *        Product SKU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseRequest withProductSKU(String productSKU) {
        setProductSKU(productSKU);
        return this;
    }

    /**
     * <p>
     * Checkout type.
     * </p>
     * 
     * @param checkoutType
     *        Checkout type.
     * @see CheckoutType
     */

    public void setCheckoutType(String checkoutType) {
        this.checkoutType = checkoutType;
    }

    /**
     * <p>
     * Checkout type.
     * </p>
     * 
     * @return Checkout type.
     * @see CheckoutType
     */

    public String getCheckoutType() {
        return this.checkoutType;
    }

    /**
     * <p>
     * Checkout type.
     * </p>
     * 
     * @param checkoutType
     *        Checkout type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckoutType
     */

    public CheckoutLicenseRequest withCheckoutType(String checkoutType) {
        setCheckoutType(checkoutType);
        return this;
    }

    /**
     * <p>
     * Checkout type.
     * </p>
     * 
     * @param checkoutType
     *        Checkout type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckoutType
     */

    public CheckoutLicenseRequest withCheckoutType(CheckoutType checkoutType) {
        this.checkoutType = checkoutType.toString();
        return this;
    }

    /**
     * <p>
     * Key fingerprint identifying the license.
     * </p>
     * 
     * @param keyFingerprint
     *        Key fingerprint identifying the license.
     */

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * <p>
     * Key fingerprint identifying the license.
     * </p>
     * 
     * @return Key fingerprint identifying the license.
     */

    public String getKeyFingerprint() {
        return this.keyFingerprint;
    }

    /**
     * <p>
     * Key fingerprint identifying the license.
     * </p>
     * 
     * @param keyFingerprint
     *        Key fingerprint identifying the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseRequest withKeyFingerprint(String keyFingerprint) {
        setKeyFingerprint(keyFingerprint);
        return this;
    }

    /**
     * <p>
     * License entitlements.
     * </p>
     * 
     * @return License entitlements.
     */

    public java.util.List<EntitlementData> getEntitlements() {
        return entitlements;
    }

    /**
     * <p>
     * License entitlements.
     * </p>
     * 
     * @param entitlements
     *        License entitlements.
     */

    public void setEntitlements(java.util.Collection<EntitlementData> entitlements) {
        if (entitlements == null) {
            this.entitlements = null;
            return;
        }

        this.entitlements = new java.util.ArrayList<EntitlementData>(entitlements);
    }

    /**
     * <p>
     * License entitlements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        License entitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseRequest withEntitlements(EntitlementData... entitlements) {
        if (this.entitlements == null) {
            setEntitlements(new java.util.ArrayList<EntitlementData>(entitlements.length));
        }
        for (EntitlementData ele : entitlements) {
            this.entitlements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * License entitlements.
     * </p>
     * 
     * @param entitlements
     *        License entitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseRequest withEntitlements(java.util.Collection<EntitlementData> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * License beneficiary.
     * </p>
     * 
     * @param beneficiary
     *        License beneficiary.
     */

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    /**
     * <p>
     * License beneficiary.
     * </p>
     * 
     * @return License beneficiary.
     */

    public String getBeneficiary() {
        return this.beneficiary;
    }

    /**
     * <p>
     * License beneficiary.
     * </p>
     * 
     * @param beneficiary
     *        License beneficiary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseRequest withBeneficiary(String beneficiary) {
        setBeneficiary(beneficiary);
        return this;
    }

    /**
     * <p>
     * Node ID.
     * </p>
     * 
     * @param nodeId
     *        Node ID.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * Node ID.
     * </p>
     * 
     * @return Node ID.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * Node ID.
     * </p>
     * 
     * @param nodeId
     *        Node ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseRequest withNodeId(String nodeId) {
        setNodeId(nodeId);
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
        if (getProductSKU() != null)
            sb.append("ProductSKU: ").append(getProductSKU()).append(",");
        if (getCheckoutType() != null)
            sb.append("CheckoutType: ").append(getCheckoutType()).append(",");
        if (getKeyFingerprint() != null)
            sb.append("KeyFingerprint: ").append(getKeyFingerprint()).append(",");
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getBeneficiary() != null)
            sb.append("Beneficiary: ").append(getBeneficiary()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckoutLicenseRequest == false)
            return false;
        CheckoutLicenseRequest other = (CheckoutLicenseRequest) obj;
        if (other.getProductSKU() == null ^ this.getProductSKU() == null)
            return false;
        if (other.getProductSKU() != null && other.getProductSKU().equals(this.getProductSKU()) == false)
            return false;
        if (other.getCheckoutType() == null ^ this.getCheckoutType() == null)
            return false;
        if (other.getCheckoutType() != null && other.getCheckoutType().equals(this.getCheckoutType()) == false)
            return false;
        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null)
            return false;
        if (other.getKeyFingerprint() != null && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false)
            return false;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getBeneficiary() == null ^ this.getBeneficiary() == null)
            return false;
        if (other.getBeneficiary() != null && other.getBeneficiary().equals(this.getBeneficiary()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductSKU() == null) ? 0 : getProductSKU().hashCode());
        hashCode = prime * hashCode + ((getCheckoutType() == null) ? 0 : getCheckoutType().hashCode());
        hashCode = prime * hashCode + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getBeneficiary() == null) ? 0 : getBeneficiary().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        return hashCode;
    }

    @Override
    public CheckoutLicenseRequest clone() {
        return (CheckoutLicenseRequest) super.clone();
    }

}
