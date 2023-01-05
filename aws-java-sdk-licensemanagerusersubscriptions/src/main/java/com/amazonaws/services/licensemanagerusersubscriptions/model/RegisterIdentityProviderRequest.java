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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/RegisterIdentityProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterIdentityProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The registered identity provider’s product related configuration settings such as the subnets to provision VPC
     * endpoints.
     * </p>
     */
    private Settings settings;

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

    public RegisterIdentityProviderRequest withIdentityProvider(IdentityProvider identityProvider) {
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

    public RegisterIdentityProviderRequest withProduct(String product) {
        setProduct(product);
        return this;
    }

    /**
     * <p>
     * The registered identity provider’s product related configuration settings such as the subnets to provision VPC
     * endpoints.
     * </p>
     * 
     * @param settings
     *        The registered identity provider’s product related configuration settings such as the subnets to provision
     *        VPC endpoints.
     */

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * The registered identity provider’s product related configuration settings such as the subnets to provision VPC
     * endpoints.
     * </p>
     * 
     * @return The registered identity provider’s product related configuration settings such as the subnets to
     *         provision VPC endpoints.
     */

    public Settings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * The registered identity provider’s product related configuration settings such as the subnets to provision VPC
     * endpoints.
     * </p>
     * 
     * @param settings
     *        The registered identity provider’s product related configuration settings such as the subnets to provision
     *        VPC endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterIdentityProviderRequest withSettings(Settings settings) {
        setSettings(settings);
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
        if (getIdentityProvider() != null)
            sb.append("IdentityProvider: ").append(getIdentityProvider()).append(",");
        if (getProduct() != null)
            sb.append("Product: ").append(getProduct()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterIdentityProviderRequest == false)
            return false;
        RegisterIdentityProviderRequest other = (RegisterIdentityProviderRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityProvider() == null) ? 0 : getIdentityProvider().hashCode());
        hashCode = prime * hashCode + ((getProduct() == null) ? 0 : getProduct().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public RegisterIdentityProviderRequest clone() {
        return (RegisterIdentityProviderRequest) super.clone();
    }

}
