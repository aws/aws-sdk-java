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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeTrustedTokenIssuer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustedTokenIssuerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the trusted token issuer configuration that you want details about.
     * </p>
     */
    private String trustedTokenIssuerArn;

    /**
     * <p>
     * Specifies the ARN of the trusted token issuer configuration that you want details about.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        Specifies the ARN of the trusted token issuer configuration that you want details about.
     */

    public void setTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        this.trustedTokenIssuerArn = trustedTokenIssuerArn;
    }

    /**
     * <p>
     * Specifies the ARN of the trusted token issuer configuration that you want details about.
     * </p>
     * 
     * @return Specifies the ARN of the trusted token issuer configuration that you want details about.
     */

    public String getTrustedTokenIssuerArn() {
        return this.trustedTokenIssuerArn;
    }

    /**
     * <p>
     * Specifies the ARN of the trusted token issuer configuration that you want details about.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        Specifies the ARN of the trusted token issuer configuration that you want details about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedTokenIssuerRequest withTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
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

        if (obj instanceof DescribeTrustedTokenIssuerRequest == false)
            return false;
        DescribeTrustedTokenIssuerRequest other = (DescribeTrustedTokenIssuerRequest) obj;
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
    public DescribeTrustedTokenIssuerRequest clone() {
        return (DescribeTrustedTokenIssuerRequest) super.clone();
    }

}
