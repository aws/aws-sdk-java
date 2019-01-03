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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The UpdateUserPoolDomain request input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserPoolDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For example:
     * <code>auth.example.com</code>.
     * </p>
     * <p>
     * This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or last
     * character. Use periods to separate subdomain names.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The ID of the user pool that is associated with the custom domain that you are updating the certificate for.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use this
     * object to specify an SSL certificate that is managed by ACM.
     * </p>
     */
    private CustomDomainConfigType customDomainConfig;

    /**
     * <p>
     * The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For example:
     * <code>auth.example.com</code>.
     * </p>
     * <p>
     * This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or last
     * character. Use periods to separate subdomain names.
     * </p>
     * 
     * @param domain
     *        The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For
     *        example: <code>auth.example.com</code>. </p>
     *        <p>
     *        This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or
     *        last character. Use periods to separate subdomain names.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For example:
     * <code>auth.example.com</code>.
     * </p>
     * <p>
     * This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or last
     * character. Use periods to separate subdomain names.
     * </p>
     * 
     * @return The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For
     *         example: <code>auth.example.com</code>. </p>
     *         <p>
     *         This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first
     *         or last character. Use periods to separate subdomain names.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For example:
     * <code>auth.example.com</code>.
     * </p>
     * <p>
     * This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or last
     * character. Use periods to separate subdomain names.
     * </p>
     * 
     * @param domain
     *        The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For
     *        example: <code>auth.example.com</code>. </p>
     *        <p>
     *        This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or
     *        last character. Use periods to separate subdomain names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolDomainRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The ID of the user pool that is associated with the custom domain that you are updating the certificate for.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the user pool that is associated with the custom domain that you are updating the certificate
     *        for.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The ID of the user pool that is associated with the custom domain that you are updating the certificate for.
     * </p>
     * 
     * @return The ID of the user pool that is associated with the custom domain that you are updating the certificate
     *         for.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The ID of the user pool that is associated with the custom domain that you are updating the certificate for.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the user pool that is associated with the custom domain that you are updating the certificate
     *        for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolDomainRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use this
     * object to specify an SSL certificate that is managed by ACM.
     * </p>
     * 
     * @param customDomainConfig
     *        The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use
     *        this object to specify an SSL certificate that is managed by ACM.
     */

    public void setCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use this
     * object to specify an SSL certificate that is managed by ACM.
     * </p>
     * 
     * @return The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use
     *         this object to specify an SSL certificate that is managed by ACM.
     */

    public CustomDomainConfigType getCustomDomainConfig() {
        return this.customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use this
     * object to specify an SSL certificate that is managed by ACM.
     * </p>
     * 
     * @param customDomainConfig
     *        The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use
     *        this object to specify an SSL certificate that is managed by ACM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolDomainRequest withCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
        setCustomDomainConfig(customDomainConfig);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getCustomDomainConfig() != null)
            sb.append("CustomDomainConfig: ").append(getCustomDomainConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserPoolDomainRequest == false)
            return false;
        UpdateUserPoolDomainRequest other = (UpdateUserPoolDomainRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getCustomDomainConfig() == null ^ this.getCustomDomainConfig() == null)
            return false;
        if (other.getCustomDomainConfig() != null && other.getCustomDomainConfig().equals(this.getCustomDomainConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainConfig() == null) ? 0 : getCustomDomainConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserPoolDomainRequest clone() {
        return (UpdateUserPoolDomainRequest) super.clone();
    }

}
