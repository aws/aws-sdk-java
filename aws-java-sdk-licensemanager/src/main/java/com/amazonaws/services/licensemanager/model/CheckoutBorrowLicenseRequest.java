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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CheckoutBorrowLicense"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckoutBorrowLicenseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license. The license must use the borrow consumption configuration.
     * </p>
     */
    private String licenseArn;
    /**
     * <p>
     * License entitlements. Partial checkouts are not supported.
     * </p>
     */
    private java.util.List<EntitlementData> entitlements;
    /**
     * <p>
     * Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more information,
     * see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature with RSASSA-PSS</a>.
     * </p>
     */
    private String digitalSignatureMethod;
    /**
     * <p>
     * Node ID.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * Information about constraints.
     * </p>
     */
    private java.util.List<Metadata> checkoutMetadata;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license. The license must use the borrow consumption configuration.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license. The license must use the borrow consumption configuration.
     */

    public void setLicenseArn(String licenseArn) {
        this.licenseArn = licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license. The license must use the borrow consumption configuration.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the license. The license must use the borrow consumption configuration.
     */

    public String getLicenseArn() {
        return this.licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license. The license must use the borrow consumption configuration.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license. The license must use the borrow consumption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutBorrowLicenseRequest withLicenseArn(String licenseArn) {
        setLicenseArn(licenseArn);
        return this;
    }

    /**
     * <p>
     * License entitlements. Partial checkouts are not supported.
     * </p>
     * 
     * @return License entitlements. Partial checkouts are not supported.
     */

    public java.util.List<EntitlementData> getEntitlements() {
        return entitlements;
    }

    /**
     * <p>
     * License entitlements. Partial checkouts are not supported.
     * </p>
     * 
     * @param entitlements
     *        License entitlements. Partial checkouts are not supported.
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
     * License entitlements. Partial checkouts are not supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        License entitlements. Partial checkouts are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutBorrowLicenseRequest withEntitlements(EntitlementData... entitlements) {
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
     * License entitlements. Partial checkouts are not supported.
     * </p>
     * 
     * @param entitlements
     *        License entitlements. Partial checkouts are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckoutBorrowLicenseRequest withEntitlements(java.util.Collection<EntitlementData> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * <p>
     * Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more information,
     * see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature with RSASSA-PSS</a>.
     * </p>
     * 
     * @param digitalSignatureMethod
     *        Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more
     *        information, see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature with
     *        RSASSA-PSS</a>.
     * @see DigitalSignatureMethod
     */

    public void setDigitalSignatureMethod(String digitalSignatureMethod) {
        this.digitalSignatureMethod = digitalSignatureMethod;
    }

    /**
     * <p>
     * Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more information,
     * see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature with RSASSA-PSS</a>.
     * </p>
     * 
     * @return Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more
     *         information, see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature
     *         with RSASSA-PSS</a>.
     * @see DigitalSignatureMethod
     */

    public String getDigitalSignatureMethod() {
        return this.digitalSignatureMethod;
    }

    /**
     * <p>
     * Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more information,
     * see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature with RSASSA-PSS</a>.
     * </p>
     * 
     * @param digitalSignatureMethod
     *        Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more
     *        information, see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature with
     *        RSASSA-PSS</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DigitalSignatureMethod
     */

    public CheckoutBorrowLicenseRequest withDigitalSignatureMethod(String digitalSignatureMethod) {
        setDigitalSignatureMethod(digitalSignatureMethod);
        return this;
    }

    /**
     * <p>
     * Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more information,
     * see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature with RSASSA-PSS</a>.
     * </p>
     * 
     * @param digitalSignatureMethod
     *        Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more
     *        information, see <a href="https://tools.ietf.org/html/rfc7518#section-3.5">RFC 7518 Digital Signature with
     *        RSASSA-PSS</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DigitalSignatureMethod
     */

    public CheckoutBorrowLicenseRequest withDigitalSignatureMethod(DigitalSignatureMethod digitalSignatureMethod) {
        this.digitalSignatureMethod = digitalSignatureMethod.toString();
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

    public CheckoutBorrowLicenseRequest withNodeId(String nodeId) {
        setNodeId(nodeId);
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

    public CheckoutBorrowLicenseRequest withCheckoutMetadata(Metadata... checkoutMetadata) {
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

    public CheckoutBorrowLicenseRequest withCheckoutMetadata(java.util.Collection<Metadata> checkoutMetadata) {
        setCheckoutMetadata(checkoutMetadata);
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

    public CheckoutBorrowLicenseRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
        if (getDigitalSignatureMethod() != null)
            sb.append("DigitalSignatureMethod: ").append(getDigitalSignatureMethod()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getCheckoutMetadata() != null)
            sb.append("CheckoutMetadata: ").append(getCheckoutMetadata()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckoutBorrowLicenseRequest == false)
            return false;
        CheckoutBorrowLicenseRequest other = (CheckoutBorrowLicenseRequest) obj;
        if (other.getLicenseArn() == null ^ this.getLicenseArn() == null)
            return false;
        if (other.getLicenseArn() != null && other.getLicenseArn().equals(this.getLicenseArn()) == false)
            return false;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
            return false;
        if (other.getDigitalSignatureMethod() == null ^ this.getDigitalSignatureMethod() == null)
            return false;
        if (other.getDigitalSignatureMethod() != null && other.getDigitalSignatureMethod().equals(this.getDigitalSignatureMethod()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getCheckoutMetadata() == null ^ this.getCheckoutMetadata() == null)
            return false;
        if (other.getCheckoutMetadata() != null && other.getCheckoutMetadata().equals(this.getCheckoutMetadata()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseArn() == null) ? 0 : getLicenseArn().hashCode());
        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getDigitalSignatureMethod() == null) ? 0 : getDigitalSignatureMethod().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getCheckoutMetadata() == null) ? 0 : getCheckoutMetadata().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CheckoutBorrowLicenseRequest clone() {
        return (CheckoutBorrowLicenseRequest) super.clone();
    }

}
