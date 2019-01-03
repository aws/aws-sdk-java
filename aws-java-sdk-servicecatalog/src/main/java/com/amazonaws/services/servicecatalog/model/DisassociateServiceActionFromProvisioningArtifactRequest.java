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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateServiceActionFromProvisioningArtifact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateServiceActionFromProvisioningArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     */
    private String serviceActionId;
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
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * 
     * @param productId
     *        The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * 
     * @return The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * 
     * @param productId
     *        The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateServiceActionFromProvisioningArtifactRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * 
     * @return The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact. For example, <code>pa-4abcdjnxjj6ne</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateServiceActionFromProvisioningArtifactRequest withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @param serviceActionId
     *        The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     */

    public void setServiceActionId(String serviceActionId) {
        this.serviceActionId = serviceActionId;
    }

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @return The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     */

    public String getServiceActionId() {
        return this.serviceActionId;
    }

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @param serviceActionId
     *        The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateServiceActionFromProvisioningArtifactRequest withServiceActionId(String serviceActionId) {
        setServiceActionId(serviceActionId);
        return this;
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

    public DisassociateServiceActionFromProvisioningArtifactRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
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
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getServiceActionId() != null)
            sb.append("ServiceActionId: ").append(getServiceActionId()).append(",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateServiceActionFromProvisioningArtifactRequest == false)
            return false;
        DisassociateServiceActionFromProvisioningArtifactRequest other = (DisassociateServiceActionFromProvisioningArtifactRequest) obj;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getServiceActionId() == null ^ this.getServiceActionId() == null)
            return false;
        if (other.getServiceActionId() != null && other.getServiceActionId().equals(this.getServiceActionId()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getServiceActionId() == null) ? 0 : getServiceActionId().hashCode());
        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateServiceActionFromProvisioningArtifactRequest clone() {
        return (DisassociateServiceActionFromProvisioningArtifactRequest) super.clone();
    }

}
