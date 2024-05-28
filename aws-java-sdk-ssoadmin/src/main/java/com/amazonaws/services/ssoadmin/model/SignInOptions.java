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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes the sign-in options for an application portal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/SignInOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignInOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL that accepts authentication requests for an application. This is a required parameter if the
     * <code>Origin</code> parameter is <code>APPLICATION</code>.
     * </p>
     */
    private String applicationUrl;
    /**
     * <p>
     * This determines how IAM Identity Center navigates the user to the target application. It can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     * <code>ApplicationUrl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to sign
     * the customer directly into a SAML-based application.
     * </p>
     * </li>
     * </ul>
     */
    private String origin;

    /**
     * <p>
     * The URL that accepts authentication requests for an application. This is a required parameter if the
     * <code>Origin</code> parameter is <code>APPLICATION</code>.
     * </p>
     * 
     * @param applicationUrl
     *        The URL that accepts authentication requests for an application. This is a required parameter if the
     *        <code>Origin</code> parameter is <code>APPLICATION</code>.
     */

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    /**
     * <p>
     * The URL that accepts authentication requests for an application. This is a required parameter if the
     * <code>Origin</code> parameter is <code>APPLICATION</code>.
     * </p>
     * 
     * @return The URL that accepts authentication requests for an application. This is a required parameter if the
     *         <code>Origin</code> parameter is <code>APPLICATION</code>.
     */

    public String getApplicationUrl() {
        return this.applicationUrl;
    }

    /**
     * <p>
     * The URL that accepts authentication requests for an application. This is a required parameter if the
     * <code>Origin</code> parameter is <code>APPLICATION</code>.
     * </p>
     * 
     * @param applicationUrl
     *        The URL that accepts authentication requests for an application. This is a required parameter if the
     *        <code>Origin</code> parameter is <code>APPLICATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignInOptions withApplicationUrl(String applicationUrl) {
        setApplicationUrl(applicationUrl);
        return this;
    }

    /**
     * <p>
     * This determines how IAM Identity Center navigates the user to the target application. It can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     * <code>ApplicationUrl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to sign
     * the customer directly into a SAML-based application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        This determines how IAM Identity Center navigates the user to the target application. It can be one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     *        <code>ApplicationUrl</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to
     *        sign the customer directly into a SAML-based application.
     *        </p>
     *        </li>
     * @see SignInOrigin
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * This determines how IAM Identity Center navigates the user to the target application. It can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     * <code>ApplicationUrl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to sign
     * the customer directly into a SAML-based application.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This determines how IAM Identity Center navigates the user to the target application. It can be one of
     *         the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     *         <code>ApplicationUrl</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to
     *         sign the customer directly into a SAML-based application.
     *         </p>
     *         </li>
     * @see SignInOrigin
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * This determines how IAM Identity Center navigates the user to the target application. It can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     * <code>ApplicationUrl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to sign
     * the customer directly into a SAML-based application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        This determines how IAM Identity Center navigates the user to the target application. It can be one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     *        <code>ApplicationUrl</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to
     *        sign the customer directly into a SAML-based application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignInOrigin
     */

    public SignInOptions withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * This determines how IAM Identity Center navigates the user to the target application. It can be one of the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     * <code>ApplicationUrl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to sign
     * the customer directly into a SAML-based application.
     * </p>
     * </li>
     * </ul>
     * 
     * @param origin
     *        This determines how IAM Identity Center navigates the user to the target application. It can be one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPLICATION</code>: IAM Identity Center redirects the customer to the configured
     *        <code>ApplicationUrl</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IDENTITY_CENTER</code>: IAM Identity Center uses SAML identity-provider initiated authentication to
     *        sign the customer directly into a SAML-based application.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignInOrigin
     */

    public SignInOptions withOrigin(SignInOrigin origin) {
        this.origin = origin.toString();
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
        if (getApplicationUrl() != null)
            sb.append("ApplicationUrl: ").append(getApplicationUrl()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignInOptions == false)
            return false;
        SignInOptions other = (SignInOptions) obj;
        if (other.getApplicationUrl() == null ^ this.getApplicationUrl() == null)
            return false;
        if (other.getApplicationUrl() != null && other.getApplicationUrl().equals(this.getApplicationUrl()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationUrl() == null) ? 0 : getApplicationUrl().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        return hashCode;
    }

    @Override
    public SignInOptions clone() {
        try {
            return (SignInOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.SignInOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
