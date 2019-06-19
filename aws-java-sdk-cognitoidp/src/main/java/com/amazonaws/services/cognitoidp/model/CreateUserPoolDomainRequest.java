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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserPoolDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain string.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * </p>
     * <p>
     * Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude
     * this parameter and use the Amazon Cognito hosted domain instead.
     * </p>
     * <p>
     * For more information about the hosted domain and custom domains, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     * >Configuring a User Pool Domain</a>.
     * </p>
     */
    private CustomDomainConfigType customDomainConfig;

    /**
     * <p>
     * The domain string.
     * </p>
     * 
     * @param domain
     *        The domain string.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * 
     * @return The domain string.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * 
     * @param domain
     *        The domain string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolDomainRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolDomainRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * </p>
     * <p>
     * Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude
     * this parameter and use the Amazon Cognito hosted domain instead.
     * </p>
     * <p>
     * For more information about the hosted domain and custom domains, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     * >Configuring a User Pool Domain</a>.
     * </p>
     * 
     * @param customDomainConfig
     *        The configuration for a custom domain that hosts the sign-up and sign-in webpages for your
     *        application.</p>
     *        <p>
     *        Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can
     *        exclude this parameter and use the Amazon Cognito hosted domain instead.
     *        </p>
     *        <p>
     *        For more information about the hosted domain and custom domains, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     *        >Configuring a User Pool Domain</a>.
     */

    public void setCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * </p>
     * <p>
     * Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude
     * this parameter and use the Amazon Cognito hosted domain instead.
     * </p>
     * <p>
     * For more information about the hosted domain and custom domains, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     * >Configuring a User Pool Domain</a>.
     * </p>
     * 
     * @return The configuration for a custom domain that hosts the sign-up and sign-in webpages for your
     *         application.</p>
     *         <p>
     *         Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can
     *         exclude this parameter and use the Amazon Cognito hosted domain instead.
     *         </p>
     *         <p>
     *         For more information about the hosted domain and custom domains, see <a
     *         href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     *         >Configuring a User Pool Domain</a>.
     */

    public CustomDomainConfigType getCustomDomainConfig() {
        return this.customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * </p>
     * <p>
     * Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude
     * this parameter and use the Amazon Cognito hosted domain instead.
     * </p>
     * <p>
     * For more information about the hosted domain and custom domains, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     * >Configuring a User Pool Domain</a>.
     * </p>
     * 
     * @param customDomainConfig
     *        The configuration for a custom domain that hosts the sign-up and sign-in webpages for your
     *        application.</p>
     *        <p>
     *        Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can
     *        exclude this parameter and use the Amazon Cognito hosted domain instead.
     *        </p>
     *        <p>
     *        For more information about the hosted domain and custom domains, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html"
     *        >Configuring a User Pool Domain</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolDomainRequest withCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
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

        if (obj instanceof CreateUserPoolDomainRequest == false)
            return false;
        CreateUserPoolDomainRequest other = (CreateUserPoolDomainRequest) obj;
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
    public CreateUserPoolDomainRequest clone() {
        return (CreateUserPoolDomainRequest) super.clone();
    }

}
