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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeTrustedTokenIssuer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustedTokenIssuerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trusted token issuer configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the trusted token issuer configuration.
     * </p>
     */
    private String trustedTokenIssuerArn;
    /**
     * <p>
     * A structure the describes the settings that apply of this trusted token issuer.
     * </p>
     */
    private TrustedTokenIssuerConfiguration trustedTokenIssuerConfiguration;
    /**
     * <p>
     * The type of the trusted token issuer.
     * </p>
     */
    private String trustedTokenIssuerType;

    /**
     * <p>
     * The name of the trusted token issuer configuration.
     * </p>
     * 
     * @param name
     *        The name of the trusted token issuer configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trusted token issuer configuration.
     * </p>
     * 
     * @return The name of the trusted token issuer configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trusted token issuer configuration.
     * </p>
     * 
     * @param name
     *        The name of the trusted token issuer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedTokenIssuerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the trusted token issuer configuration.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        The ARN of the trusted token issuer configuration.
     */

    public void setTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        this.trustedTokenIssuerArn = trustedTokenIssuerArn;
    }

    /**
     * <p>
     * The ARN of the trusted token issuer configuration.
     * </p>
     * 
     * @return The ARN of the trusted token issuer configuration.
     */

    public String getTrustedTokenIssuerArn() {
        return this.trustedTokenIssuerArn;
    }

    /**
     * <p>
     * The ARN of the trusted token issuer configuration.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        The ARN of the trusted token issuer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedTokenIssuerResult withTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        setTrustedTokenIssuerArn(trustedTokenIssuerArn);
        return this;
    }

    /**
     * <p>
     * A structure the describes the settings that apply of this trusted token issuer.
     * </p>
     * 
     * @param trustedTokenIssuerConfiguration
     *        A structure the describes the settings that apply of this trusted token issuer.
     */

    public void setTrustedTokenIssuerConfiguration(TrustedTokenIssuerConfiguration trustedTokenIssuerConfiguration) {
        this.trustedTokenIssuerConfiguration = trustedTokenIssuerConfiguration;
    }

    /**
     * <p>
     * A structure the describes the settings that apply of this trusted token issuer.
     * </p>
     * 
     * @return A structure the describes the settings that apply of this trusted token issuer.
     */

    public TrustedTokenIssuerConfiguration getTrustedTokenIssuerConfiguration() {
        return this.trustedTokenIssuerConfiguration;
    }

    /**
     * <p>
     * A structure the describes the settings that apply of this trusted token issuer.
     * </p>
     * 
     * @param trustedTokenIssuerConfiguration
     *        A structure the describes the settings that apply of this trusted token issuer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedTokenIssuerResult withTrustedTokenIssuerConfiguration(TrustedTokenIssuerConfiguration trustedTokenIssuerConfiguration) {
        setTrustedTokenIssuerConfiguration(trustedTokenIssuerConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of the trusted token issuer.
     * </p>
     * 
     * @param trustedTokenIssuerType
     *        The type of the trusted token issuer.
     * @see TrustedTokenIssuerType
     */

    public void setTrustedTokenIssuerType(String trustedTokenIssuerType) {
        this.trustedTokenIssuerType = trustedTokenIssuerType;
    }

    /**
     * <p>
     * The type of the trusted token issuer.
     * </p>
     * 
     * @return The type of the trusted token issuer.
     * @see TrustedTokenIssuerType
     */

    public String getTrustedTokenIssuerType() {
        return this.trustedTokenIssuerType;
    }

    /**
     * <p>
     * The type of the trusted token issuer.
     * </p>
     * 
     * @param trustedTokenIssuerType
     *        The type of the trusted token issuer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustedTokenIssuerType
     */

    public DescribeTrustedTokenIssuerResult withTrustedTokenIssuerType(String trustedTokenIssuerType) {
        setTrustedTokenIssuerType(trustedTokenIssuerType);
        return this;
    }

    /**
     * <p>
     * The type of the trusted token issuer.
     * </p>
     * 
     * @param trustedTokenIssuerType
     *        The type of the trusted token issuer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustedTokenIssuerType
     */

    public DescribeTrustedTokenIssuerResult withTrustedTokenIssuerType(TrustedTokenIssuerType trustedTokenIssuerType) {
        this.trustedTokenIssuerType = trustedTokenIssuerType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTrustedTokenIssuerArn() != null)
            sb.append("TrustedTokenIssuerArn: ").append(getTrustedTokenIssuerArn()).append(",");
        if (getTrustedTokenIssuerConfiguration() != null)
            sb.append("TrustedTokenIssuerConfiguration: ").append(getTrustedTokenIssuerConfiguration()).append(",");
        if (getTrustedTokenIssuerType() != null)
            sb.append("TrustedTokenIssuerType: ").append(getTrustedTokenIssuerType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedTokenIssuerResult == false)
            return false;
        DescribeTrustedTokenIssuerResult other = (DescribeTrustedTokenIssuerResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTrustedTokenIssuerArn() == null ^ this.getTrustedTokenIssuerArn() == null)
            return false;
        if (other.getTrustedTokenIssuerArn() != null && other.getTrustedTokenIssuerArn().equals(this.getTrustedTokenIssuerArn()) == false)
            return false;
        if (other.getTrustedTokenIssuerConfiguration() == null ^ this.getTrustedTokenIssuerConfiguration() == null)
            return false;
        if (other.getTrustedTokenIssuerConfiguration() != null
                && other.getTrustedTokenIssuerConfiguration().equals(this.getTrustedTokenIssuerConfiguration()) == false)
            return false;
        if (other.getTrustedTokenIssuerType() == null ^ this.getTrustedTokenIssuerType() == null)
            return false;
        if (other.getTrustedTokenIssuerType() != null && other.getTrustedTokenIssuerType().equals(this.getTrustedTokenIssuerType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTrustedTokenIssuerArn() == null) ? 0 : getTrustedTokenIssuerArn().hashCode());
        hashCode = prime * hashCode + ((getTrustedTokenIssuerConfiguration() == null) ? 0 : getTrustedTokenIssuerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTrustedTokenIssuerType() == null) ? 0 : getTrustedTokenIssuerType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustedTokenIssuerResult clone() {
        try {
            return (DescribeTrustedTokenIssuerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
