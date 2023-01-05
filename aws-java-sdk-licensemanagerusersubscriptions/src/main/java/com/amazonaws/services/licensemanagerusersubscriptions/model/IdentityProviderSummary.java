/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an identity provider.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/IdentityProviderSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProviderSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The failure message associated with an identity provider.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     */
    private IdentityProvider identityProvider;
    /**
     * <p>
     * The name of the user-based subscription product.
     * </p>
     */
    private String product;
    /**
     * <p>
     * An object that details the registered identity provider’s product related configuration settings such as the
     * subnets to provision VPC endpoints.
     * </p>
     */
    private Settings settings;
    /**
     * <p>
     * The status of an identity provider.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The failure message associated with an identity provider.
     * </p>
     * 
     * @param failureMessage
     *        The failure message associated with an identity provider.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The failure message associated with an identity provider.
     * </p>
     * 
     * @return The failure message associated with an identity provider.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * The failure message associated with an identity provider.
     * </p>
     * 
     * @param failureMessage
     *        The failure message associated with an identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderSummary withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @param identityProvider
     *        An object that specifies details for the identity provider.
     */

    public void setIdentityProvider(IdentityProvider identityProvider) {
        this.identityProvider = identityProvider;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @return An object that specifies details for the identity provider.
     */

    public IdentityProvider getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * <p>
     * An object that specifies details for the identity provider.
     * </p>
     * 
     * @param identityProvider
     *        An object that specifies details for the identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderSummary withIdentityProvider(IdentityProvider identityProvider) {
        setIdentityProvider(identityProvider);
        return this;
    }

    /**
     * <p>
     * The name of the user-based subscription product.
     * </p>
     * 
     * @param product
     *        The name of the user-based subscription product.
     */

    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * <p>
     * The name of the user-based subscription product.
     * </p>
     * 
     * @return The name of the user-based subscription product.
     */

    public String getProduct() {
        return this.product;
    }

    /**
     * <p>
     * The name of the user-based subscription product.
     * </p>
     * 
     * @param product
     *        The name of the user-based subscription product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderSummary withProduct(String product) {
        setProduct(product);
        return this;
    }

    /**
     * <p>
     * An object that details the registered identity provider’s product related configuration settings such as the
     * subnets to provision VPC endpoints.
     * </p>
     * 
     * @param settings
     *        An object that details the registered identity provider’s product related configuration settings such as
     *        the subnets to provision VPC endpoints.
     */

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * An object that details the registered identity provider’s product related configuration settings such as the
     * subnets to provision VPC endpoints.
     * </p>
     * 
     * @return An object that details the registered identity provider’s product related configuration settings such as
     *         the subnets to provision VPC endpoints.
     */

    public Settings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * An object that details the registered identity provider’s product related configuration settings such as the
     * subnets to provision VPC endpoints.
     * </p>
     * 
     * @param settings
     *        An object that details the registered identity provider’s product related configuration settings such as
     *        the subnets to provision VPC endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderSummary withSettings(Settings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The status of an identity provider.
     * </p>
     * 
     * @param status
     *        The status of an identity provider.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an identity provider.
     * </p>
     * 
     * @return The status of an identity provider.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an identity provider.
     * </p>
     * 
     * @param status
     *        The status of an identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderSummary withStatus(String status) {
        setStatus(status);
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
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getIdentityProvider() != null)
            sb.append("IdentityProvider: ").append(getIdentityProvider()).append(",");
        if (getProduct() != null)
            sb.append("Product: ").append(getProduct()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderSummary == false)
            return false;
        IdentityProviderSummary other = (IdentityProviderSummary) obj;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getIdentityProvider() == null ^ this.getIdentityProvider() == null)
            return false;
        if (other.getIdentityProvider() != null && other.getIdentityProvider().equals(this.getIdentityProvider()) == false)
            return false;
        if (other.getProduct() == null ^ this.getProduct() == null)
            return false;
        if (other.getProduct() != null && other.getProduct().equals(this.getProduct()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getIdentityProvider() == null) ? 0 : getIdentityProvider().hashCode());
        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProviderSummary clone() {
        try {
            return (IdentityProviderSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerusersubscriptions.model.transform.IdentityProviderSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
