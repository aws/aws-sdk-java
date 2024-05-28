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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateTrustedTokenIssuer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrustedTokenIssuerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the updated name to be applied to the trusted token issuer configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the ARN of the trusted token issuer configuration that you want to update.
     * </p>
     */
    private String trustedTokenIssuerArn;
    /**
     * <p>
     * Specifies a structure with settings to apply to the specified trusted token issuer. The settings that you can
     * provide are determined by the type of the trusted token issuer that you are updating.
     * </p>
     */
    private TrustedTokenIssuerUpdateConfiguration trustedTokenIssuerConfiguration;

    /**
     * <p>
     * Specifies the updated name to be applied to the trusted token issuer configuration.
     * </p>
     * 
     * @param name
     *        Specifies the updated name to be applied to the trusted token issuer configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the updated name to be applied to the trusted token issuer configuration.
     * </p>
     * 
     * @return Specifies the updated name to be applied to the trusted token issuer configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the updated name to be applied to the trusted token issuer configuration.
     * </p>
     * 
     * @param name
     *        Specifies the updated name to be applied to the trusted token issuer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrustedTokenIssuerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the trusted token issuer configuration that you want to update.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        Specifies the ARN of the trusted token issuer configuration that you want to update.
     */

    public void setTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        this.trustedTokenIssuerArn = trustedTokenIssuerArn;
    }

    /**
     * <p>
     * Specifies the ARN of the trusted token issuer configuration that you want to update.
     * </p>
     * 
     * @return Specifies the ARN of the trusted token issuer configuration that you want to update.
     */

    public String getTrustedTokenIssuerArn() {
        return this.trustedTokenIssuerArn;
    }

    /**
     * <p>
     * Specifies the ARN of the trusted token issuer configuration that you want to update.
     * </p>
     * 
     * @param trustedTokenIssuerArn
     *        Specifies the ARN of the trusted token issuer configuration that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrustedTokenIssuerRequest withTrustedTokenIssuerArn(String trustedTokenIssuerArn) {
        setTrustedTokenIssuerArn(trustedTokenIssuerArn);
        return this;
    }

    /**
     * <p>
     * Specifies a structure with settings to apply to the specified trusted token issuer. The settings that you can
     * provide are determined by the type of the trusted token issuer that you are updating.
     * </p>
     * 
     * @param trustedTokenIssuerConfiguration
     *        Specifies a structure with settings to apply to the specified trusted token issuer. The settings that you
     *        can provide are determined by the type of the trusted token issuer that you are updating.
     */

    public void setTrustedTokenIssuerConfiguration(TrustedTokenIssuerUpdateConfiguration trustedTokenIssuerConfiguration) {
        this.trustedTokenIssuerConfiguration = trustedTokenIssuerConfiguration;
    }

    /**
     * <p>
     * Specifies a structure with settings to apply to the specified trusted token issuer. The settings that you can
     * provide are determined by the type of the trusted token issuer that you are updating.
     * </p>
     * 
     * @return Specifies a structure with settings to apply to the specified trusted token issuer. The settings that you
     *         can provide are determined by the type of the trusted token issuer that you are updating.
     */

    public TrustedTokenIssuerUpdateConfiguration getTrustedTokenIssuerConfiguration() {
        return this.trustedTokenIssuerConfiguration;
    }

    /**
     * <p>
     * Specifies a structure with settings to apply to the specified trusted token issuer. The settings that you can
     * provide are determined by the type of the trusted token issuer that you are updating.
     * </p>
     * 
     * @param trustedTokenIssuerConfiguration
     *        Specifies a structure with settings to apply to the specified trusted token issuer. The settings that you
     *        can provide are determined by the type of the trusted token issuer that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrustedTokenIssuerRequest withTrustedTokenIssuerConfiguration(TrustedTokenIssuerUpdateConfiguration trustedTokenIssuerConfiguration) {
        setTrustedTokenIssuerConfiguration(trustedTokenIssuerConfiguration);
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
            sb.append("TrustedTokenIssuerConfiguration: ").append(getTrustedTokenIssuerConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrustedTokenIssuerRequest == false)
            return false;
        UpdateTrustedTokenIssuerRequest other = (UpdateTrustedTokenIssuerRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTrustedTokenIssuerArn() == null) ? 0 : getTrustedTokenIssuerArn().hashCode());
        hashCode = prime * hashCode + ((getTrustedTokenIssuerConfiguration() == null) ? 0 : getTrustedTokenIssuerConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrustedTokenIssuerRequest clone() {
        return (UpdateTrustedTokenIssuerRequest) super.clone();
    }

}
