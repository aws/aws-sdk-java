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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * OpenID Connect options for an <code>oidc</code>-type, user-identity based trust provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVerifiedAccessTrustProviderOidcOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessTrustProviderOidcOptions implements Serializable, Cloneable {

    /**
     * <p>
     * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's
     * details. Each scope returns a specific set of user attributes.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's
     * details. Each scope returns a specific set of user attributes.
     * </p>
     * 
     * @param scope
     *        OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a
     *        user's details. Each scope returns a specific set of user attributes.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's
     * details. Each scope returns a specific set of user attributes.
     * </p>
     * 
     * @return OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a
     *         user's details. Each scope returns a specific set of user attributes.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's
     * details. Each scope returns a specific set of user attributes.
     * </p>
     * 
     * @param scope
     *        OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a
     *        user's details. Each scope returns a specific set of user attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessTrustProviderOidcOptions withScope(String scope) {
        setScope(scope);
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
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVerifiedAccessTrustProviderOidcOptions == false)
            return false;
        ModifyVerifiedAccessTrustProviderOidcOptions other = (ModifyVerifiedAccessTrustProviderOidcOptions) obj;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessTrustProviderOidcOptions clone() {
        try {
            return (ModifyVerifiedAccessTrustProviderOidcOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
