/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateTrustedTokenIssuer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrustedTokenIssuerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the new trusted token issuer configuration.
     * </p>
     */
    private String trustedTokenIssuerArn;

    /**
     * <p>
     * The ARN of the new trusted token issuer configuration.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        The ARN of the new trusted token issuer configuration.
     */

    public void setTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        this.trustedTokenIssuerArn = trustedTokenIssuerArn;
    }

    /**
     * <p>
     * The ARN of the new trusted token issuer configuration.
     * </p>
     * 
     * @return The ARN of the new trusted token issuer configuration.
     */

    public String getTrustedTokenIssuerArn() {
        return this.trustedTokenIssuerArn;
    }

    /**
     * <p>
     * The ARN of the new trusted token issuer configuration.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        The ARN of the new trusted token issuer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustedTokenIssuerResult withTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        setTrustedTokenIssuerArn(trustedTokenIssuerArn);
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
        if (getTrustedTokenIssuerArn() != null)
            sb.append("TrustedTokenIssuerArn: ").append(getTrustedTokenIssuerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrustedTokenIssuerResult == false)
            return false;
        CreateTrustedTokenIssuerResult other = (CreateTrustedTokenIssuerResult) obj;
        if (other.getTrustedTokenIssuerArn() == null ^ this.getTrustedTokenIssuerArn() == null)
            return false;
        if (other.getTrustedTokenIssuerArn() != null && other.getTrustedTokenIssuerArn().equals(this.getTrustedTokenIssuerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustedTokenIssuerArn() == null) ? 0 : getTrustedTokenIssuerArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrustedTokenIssuerResult clone() {
        try {
            return (CreateTrustedTokenIssuerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
