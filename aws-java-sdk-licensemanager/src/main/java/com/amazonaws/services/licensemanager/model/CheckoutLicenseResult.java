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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutLicense" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckoutLicenseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Checkout type.
     * </p>
     */
    private String checkoutType;
    /**
     * <p>
     * License consumption token.
     * </p>
     */
    private String licenseConsumptionToken;
    /**
     * <p>
     * Allowed license entitlements.
     * </p>
     */
    private java.util.List<EntitlementData> entitlementsAllowed;
    /**
     * <p>
     * Signed token.
     * </p>
     */
    private String signedToken;
    /**
     * <p>
     * Node ID.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * Date and time at which the license checkout is issued.
     * </p>
     */
    private String issuedAt;
    /**
     * <p>
     * Date and time at which the license checkout expires.
     * </p>
     */
    private String expiration;

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

    public CheckoutLicenseResult withCheckoutType(String checkoutType) {
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

    public CheckoutLicenseResult withCheckoutType(CheckoutType checkoutType) {
        this.checkoutType = checkoutType.toString();
        return this;
    }

    /**
     * <p>
     * License consumption token.
     * </p>
     * 
     * @param licenseConsumptionToken
     *        License consumption token.
     */

    public void setLicenseConsumptionToken(String licenseConsumptionToken) {
        this.licenseConsumptionToken = licenseConsumptionToken;
    }

    /**
     * <p>
     * License consumption token.
     * </p>
     * 
     * @return License consumption token.
     */

    public String getLicenseConsumptionToken() {
        return this.licenseConsumptionToken;
    }

    /**
     * <p>
     * License consumption token.
     * </p>
     * 
     * @param licenseConsumptionToken
     *        License consumption token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseResult withLicenseConsumptionToken(String licenseConsumptionToken) {
        setLicenseConsumptionToken(licenseConsumptionToken);
        return this;
    }

    /**
     * <p>
     * Allowed license entitlements.
     * </p>
     * 
     * @return Allowed license entitlements.
     */

    public java.util.List<EntitlementData> getEntitlementsAllowed() {
        return entitlementsAllowed;
    }

    /**
     * <p>
     * Allowed license entitlements.
     * </p>
     * 
     * @param entitlementsAllowed
     *        Allowed license entitlements.
     */

    public void setEntitlementsAllowed(java.util.Collection<EntitlementData> entitlementsAllowed) {
        if (entitlementsAllowed == null) {
            this.entitlementsAllowed = null;
            return;
        }

        this.entitlementsAllowed = new java.util.ArrayList<EntitlementData>(entitlementsAllowed);
    }

    /**
     * <p>
     * Allowed license entitlements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlementsAllowed(java.util.Collection)} or {@link #withEntitlementsAllowed(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param entitlementsAllowed
     *        Allowed license entitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseResult withEntitlementsAllowed(EntitlementData... entitlementsAllowed) {
        if (this.entitlementsAllowed == null) {
            setEntitlementsAllowed(new java.util.ArrayList<EntitlementData>(entitlementsAllowed.length));
        }
        for (EntitlementData ele : entitlementsAllowed) {
            this.entitlementsAllowed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Allowed license entitlements.
     * </p>
     * 
     * @param entitlementsAllowed
     *        Allowed license entitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseResult withEntitlementsAllowed(java.util.Collection<EntitlementData> entitlementsAllowed) {
        setEntitlementsAllowed(entitlementsAllowed);
        return this;
    }

    /**
     * <p>
     * Signed token.
     * </p>
     * 
     * @param signedToken
     *        Signed token.
     */

    public void setSignedToken(String signedToken) {
        this.signedToken = signedToken;
    }

    /**
     * <p>
     * Signed token.
     * </p>
     * 
     * @return Signed token.
     */

    public String getSignedToken() {
        return this.signedToken;
    }

    /**
     * <p>
     * Signed token.
     * </p>
     * 
     * @param signedToken
     *        Signed token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseResult withSignedToken(String signedToken) {
        setSignedToken(signedToken);
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

    public CheckoutLicenseResult withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * Date and time at which the license checkout is issued.
     * </p>
     * 
     * @param issuedAt
     *        Date and time at which the license checkout is issued.
     */

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * <p>
     * Date and time at which the license checkout is issued.
     * </p>
     * 
     * @return Date and time at which the license checkout is issued.
     */

    public String getIssuedAt() {
        return this.issuedAt;
    }

    /**
     * <p>
     * Date and time at which the license checkout is issued.
     * </p>
     * 
     * @param issuedAt
     *        Date and time at which the license checkout is issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseResult withIssuedAt(String issuedAt) {
        setIssuedAt(issuedAt);
        return this;
    }

    /**
     * <p>
     * Date and time at which the license checkout expires.
     * </p>
     * 
     * @param expiration
     *        Date and time at which the license checkout expires.
     */

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * Date and time at which the license checkout expires.
     * </p>
     * 
     * @return Date and time at which the license checkout expires.
     */

    public String getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * Date and time at which the license checkout expires.
     * </p>
     * 
     * @param expiration
     *        Date and time at which the license checkout expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutLicenseResult withExpiration(String expiration) {
        setExpiration(expiration);
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
        if (getCheckoutType() != null)
            sb.append("CheckoutType: ").append(getCheckoutType()).append(",");
        if (getLicenseConsumptionToken() != null)
            sb.append("LicenseConsumptionToken: ").append(getLicenseConsumptionToken()).append(",");
        if (getEntitlementsAllowed() != null)
            sb.append("EntitlementsAllowed: ").append(getEntitlementsAllowed()).append(",");
        if (getSignedToken() != null)
            sb.append("SignedToken: ").append(getSignedToken()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getIssuedAt() != null)
            sb.append("IssuedAt: ").append(getIssuedAt()).append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckoutLicenseResult == false)
            return false;
        CheckoutLicenseResult other = (CheckoutLicenseResult) obj;
        if (other.getCheckoutType() == null ^ this.getCheckoutType() == null)
            return false;
        if (other.getCheckoutType() != null && other.getCheckoutType().equals(this.getCheckoutType()) == false)
            return false;
        if (other.getLicenseConsumptionToken() == null ^ this.getLicenseConsumptionToken() == null)
            return false;
        if (other.getLicenseConsumptionToken() != null && other.getLicenseConsumptionToken().equals(this.getLicenseConsumptionToken()) == false)
            return false;
        if (other.getEntitlementsAllowed() == null ^ this.getEntitlementsAllowed() == null)
            return false;
        if (other.getEntitlementsAllowed() != null && other.getEntitlementsAllowed().equals(this.getEntitlementsAllowed()) == false)
            return false;
        if (other.getSignedToken() == null ^ this.getSignedToken() == null)
            return false;
        if (other.getSignedToken() != null && other.getSignedToken().equals(this.getSignedToken()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getIssuedAt() == null ^ this.getIssuedAt() == null)
            return false;
        if (other.getIssuedAt() != null && other.getIssuedAt().equals(this.getIssuedAt()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckoutType() == null) ? 0 : getCheckoutType().hashCode());
        hashCode = prime * hashCode + ((getLicenseConsumptionToken() == null) ? 0 : getLicenseConsumptionToken().hashCode());
        hashCode = prime * hashCode + ((getEntitlementsAllowed() == null) ? 0 : getEntitlementsAllowed().hashCode());
        hashCode = prime * hashCode + ((getSignedToken() == null) ? 0 : getSignedToken().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public CheckoutLicenseResult clone() {
        try {
            return (CheckoutLicenseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
