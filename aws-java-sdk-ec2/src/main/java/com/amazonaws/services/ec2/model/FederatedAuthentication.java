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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the IAM SAML identity providers used for federated authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FederatedAuthentication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FederatedAuthentication implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     */
    private String samlProviderArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * </p>
     */
    private String selfServiceSamlProviderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     * 
     * @param samlProviderArn
     *        The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     */

    public void setSamlProviderArn(String samlProviderArn) {
        this.samlProviderArn = samlProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     */

    public String getSamlProviderArn() {
        return this.samlProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     * 
     * @param samlProviderArn
     *        The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedAuthentication withSamlProviderArn(String samlProviderArn) {
        setSamlProviderArn(samlProviderArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * </p>
     * 
     * @param selfServiceSamlProviderArn
     *        The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     */

    public void setSelfServiceSamlProviderArn(String selfServiceSamlProviderArn) {
        this.selfServiceSamlProviderArn = selfServiceSamlProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     */

    public String getSelfServiceSamlProviderArn() {
        return this.selfServiceSamlProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * </p>
     * 
     * @param selfServiceSamlProviderArn
     *        The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedAuthentication withSelfServiceSamlProviderArn(String selfServiceSamlProviderArn) {
        setSelfServiceSamlProviderArn(selfServiceSamlProviderArn);
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
        if (getSamlProviderArn() != null)
            sb.append("SamlProviderArn: ").append(getSamlProviderArn()).append(",");
        if (getSelfServiceSamlProviderArn() != null)
            sb.append("SelfServiceSamlProviderArn: ").append(getSelfServiceSamlProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FederatedAuthentication == false)
            return false;
        FederatedAuthentication other = (FederatedAuthentication) obj;
        if (other.getSamlProviderArn() == null ^ this.getSamlProviderArn() == null)
            return false;
        if (other.getSamlProviderArn() != null && other.getSamlProviderArn().equals(this.getSamlProviderArn()) == false)
            return false;
        if (other.getSelfServiceSamlProviderArn() == null ^ this.getSelfServiceSamlProviderArn() == null)
            return false;
        if (other.getSelfServiceSamlProviderArn() != null && other.getSelfServiceSamlProviderArn().equals(this.getSelfServiceSamlProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamlProviderArn() == null) ? 0 : getSamlProviderArn().hashCode());
        hashCode = prime * hashCode + ((getSelfServiceSamlProviderArn() == null) ? 0 : getSelfServiceSamlProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public FederatedAuthentication clone() {
        try {
            return (FederatedAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
