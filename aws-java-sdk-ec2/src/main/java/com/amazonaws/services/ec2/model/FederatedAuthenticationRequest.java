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
 * The IAM SAML identity provider used for federated authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FederatedAuthenticationRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FederatedAuthenticationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     */
    private String sAMLProviderArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * </p>
     */
    private String selfServiceSAMLProviderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     * 
     * @param sAMLProviderArn
     *        The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     */

    public void setSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     */

    public String getSAMLProviderArn() {
        return this.sAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * </p>
     * 
     * @param sAMLProviderArn
     *        The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedAuthenticationRequest withSAMLProviderArn(String sAMLProviderArn) {
        setSAMLProviderArn(sAMLProviderArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * </p>
     * 
     * @param selfServiceSAMLProviderArn
     *        The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     */

    public void setSelfServiceSAMLProviderArn(String selfServiceSAMLProviderArn) {
        this.selfServiceSAMLProviderArn = selfServiceSAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     */

    public String getSelfServiceSAMLProviderArn() {
        return this.selfServiceSAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * </p>
     * 
     * @param selfServiceSAMLProviderArn
     *        The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedAuthenticationRequest withSelfServiceSAMLProviderArn(String selfServiceSAMLProviderArn) {
        setSelfServiceSAMLProviderArn(selfServiceSAMLProviderArn);
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
        if (getSAMLProviderArn() != null)
            sb.append("SAMLProviderArn: ").append(getSAMLProviderArn()).append(",");
        if (getSelfServiceSAMLProviderArn() != null)
            sb.append("SelfServiceSAMLProviderArn: ").append(getSelfServiceSAMLProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FederatedAuthenticationRequest == false)
            return false;
        FederatedAuthenticationRequest other = (FederatedAuthenticationRequest) obj;
        if (other.getSAMLProviderArn() == null ^ this.getSAMLProviderArn() == null)
            return false;
        if (other.getSAMLProviderArn() != null && other.getSAMLProviderArn().equals(this.getSAMLProviderArn()) == false)
            return false;
        if (other.getSelfServiceSAMLProviderArn() == null ^ this.getSelfServiceSAMLProviderArn() == null)
            return false;
        if (other.getSelfServiceSAMLProviderArn() != null && other.getSelfServiceSAMLProviderArn().equals(this.getSelfServiceSAMLProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSAMLProviderArn() == null) ? 0 : getSAMLProviderArn().hashCode());
        hashCode = prime * hashCode + ((getSelfServiceSAMLProviderArn() == null) ? 0 : getSelfServiceSAMLProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public FederatedAuthenticationRequest clone() {
        try {
            return (FederatedAuthenticationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
