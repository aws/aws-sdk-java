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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutBorrowLicense"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckoutBorrowLicenseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     */
    private String licenseArn;
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
     * Node ID.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * Signed token.
     * </p>
     */
    private String signedToken;
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
     * Information about constraints.
     * </p>
     */
    private java.util.List<Metadata> checkoutMetadata;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license.
     */

    public void setLicenseArn(String licenseArn) {
        this.licenseArn = licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the license.
     */

    public String getLicenseArn() {
        return this.licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutBorrowLicenseResult withLicenseArn(String licenseArn) {
        setLicenseArn(licenseArn);
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

    public CheckoutBorrowLicenseResult withLicenseConsumptionToken(String licenseConsumptionToken) {
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

    public CheckoutBorrowLicenseResult withEntitlementsAllowed(EntitlementData... entitlementsAllowed) {
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

    public CheckoutBorrowLicenseResult withEntitlementsAllowed(java.util.Collection<EntitlementData> entitlementsAllowed) {
        setEntitlementsAllowed(entitlementsAllowed);
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

    public CheckoutBorrowLicenseResult withNodeId(String nodeId) {
        setNodeId(nodeId);
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

    public CheckoutBorrowLicenseResult withSignedToken(String signedToken) {
        setSignedToken(signedToken);
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

    public CheckoutBorrowLicenseResult withIssuedAt(String issuedAt) {
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

    public CheckoutBorrowLicenseResult withExpiration(String expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * <p>
     * Information about constraints.
     * </p>
     * 
     * @return Information about constraints.
     */

    public java.util.List<Metadata> getCheckoutMetadata() {
        return checkoutMetadata;
    }

    /**
     * <p>
     * Information about constraints.
     * </p>
     * 
     * @param checkoutMetadata
     *        Information about constraints.
     */

    public void setCheckoutMetadata(java.util.Collection<Metadata> checkoutMetadata) {
        if (checkoutMetadata == null) {
            this.checkoutMetadata = null;
            return;
        }

        this.checkoutMetadata = new java.util.ArrayList<Metadata>(checkoutMetadata);
    }

    /**
     * <p>
     * Information about constraints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCheckoutMetadata(java.util.Collection)} or {@link #withCheckoutMetadata(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param checkoutMetadata
     *        Information about constraints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutBorrowLicenseResult withCheckoutMetadata(Metadata... checkoutMetadata) {
        if (this.checkoutMetadata == null) {
            setCheckoutMetadata(new java.util.ArrayList<Metadata>(checkoutMetadata.length));
        }
        for (Metadata ele : checkoutMetadata) {
            this.checkoutMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about constraints.
     * </p>
     * 
     * @param checkoutMetadata
     *        Information about constraints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutBorrowLicenseResult withCheckoutMetadata(java.util.Collection<Metadata> checkoutMetadata) {
        setCheckoutMetadata(checkoutMetadata);
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
        if (getLicenseArn() != null)
            sb.append("LicenseArn: ").append(getLicenseArn()).append(",");
        if (getLicenseConsumptionToken() != null)
            sb.append("LicenseConsumptionToken: ").append(getLicenseConsumptionToken()).append(",");
        if (getEntitlementsAllowed() != null)
            sb.append("EntitlementsAllowed: ").append(getEntitlementsAllowed()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getSignedToken() != null)
            sb.append("SignedToken: ").append(getSignedToken()).append(",");
        if (getIssuedAt() != null)
            sb.append("IssuedAt: ").append(getIssuedAt()).append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration()).append(",");
        if (getCheckoutMetadata() != null)
            sb.append("CheckoutMetadata: ").append(getCheckoutMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckoutBorrowLicenseResult == false)
            return false;
        CheckoutBorrowLicenseResult other = (CheckoutBorrowLicenseResult) obj;
        if (other.getLicenseArn() == null ^ this.getLicenseArn() == null)
            return false;
        if (other.getLicenseArn() != null && other.getLicenseArn().equals(this.getLicenseArn()) == false)
            return false;
        if (other.getLicenseConsumptionToken() == null ^ this.getLicenseConsumptionToken() == null)
            return false;
        if (other.getLicenseConsumptionToken() != null && other.getLicenseConsumptionToken().equals(this.getLicenseConsumptionToken()) == false)
            return false;
        if (other.getEntitlementsAllowed() == null ^ this.getEntitlementsAllowed() == null)
            return false;
        if (other.getEntitlementsAllowed() != null && other.getEntitlementsAllowed().equals(this.getEntitlementsAllowed()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getSignedToken() == null ^ this.getSignedToken() == null)
            return false;
        if (other.getSignedToken() != null && other.getSignedToken().equals(this.getSignedToken()) == false)
            return false;
        if (other.getIssuedAt() == null ^ this.getIssuedAt() == null)
            return false;
        if (other.getIssuedAt() != null && other.getIssuedAt().equals(this.getIssuedAt()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getCheckoutMetadata() == null ^ this.getCheckoutMetadata() == null)
            return false;
        if (other.getCheckoutMetadata() != null && other.getCheckoutMetadata().equals(this.getCheckoutMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseArn() == null) ? 0 : getLicenseArn().hashCode());
        hashCode = prime * hashCode + ((getLicenseConsumptionToken() == null) ? 0 : getLicenseConsumptionToken().hashCode());
        hashCode = prime * hashCode + ((getEntitlementsAllowed() == null) ? 0 : getEntitlementsAllowed().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getSignedToken() == null) ? 0 : getSignedToken().hashCode());
        hashCode = prime * hashCode + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getCheckoutMetadata() == null) ? 0 : getCheckoutMetadata().hashCode());
        return hashCode;
    }

    @Override
    public CheckoutBorrowLicenseResult clone() {
        try {
            return (CheckoutBorrowLicenseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
