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
 * A structure that defines configuration settings for an application that supports the OAuth 2.0 Authorization Code
 * Grant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AuthorizationCodeGrant" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizationCodeGrant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     * </p>
     */
    private java.util.List<String> redirectUris;

    /**
     * <p>
     * A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     * </p>
     * 
     * @return A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     */

    public java.util.List<String> getRedirectUris() {
        return redirectUris;
    }

    /**
     * <p>
     * A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     * </p>
     * 
     * @param redirectUris
     *        A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     */

    public void setRedirectUris(java.util.Collection<String> redirectUris) {
        if (redirectUris == null) {
            this.redirectUris = null;
            return;
        }

        this.redirectUris = new java.util.ArrayList<String>(redirectUris);
    }

    /**
     * <p>
     * A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRedirectUris(java.util.Collection)} or {@link #withRedirectUris(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param redirectUris
     *        A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationCodeGrant withRedirectUris(String... redirectUris) {
        if (this.redirectUris == null) {
            setRedirectUris(new java.util.ArrayList<String>(redirectUris.length));
        }
        for (String ele : redirectUris) {
            this.redirectUris.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     * </p>
     * 
     * @param redirectUris
     *        A list of URIs that are valid locations to redirect a user's browser after the user is authorized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationCodeGrant withRedirectUris(java.util.Collection<String> redirectUris) {
        setRedirectUris(redirectUris);
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
        if (getRedirectUris() != null)
            sb.append("RedirectUris: ").append(getRedirectUris());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizationCodeGrant == false)
            return false;
        AuthorizationCodeGrant other = (AuthorizationCodeGrant) obj;
        if (other.getRedirectUris() == null ^ this.getRedirectUris() == null)
            return false;
        if (other.getRedirectUris() != null && other.getRedirectUris().equals(this.getRedirectUris()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedirectUris() == null) ? 0 : getRedirectUris().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizationCodeGrant clone() {
        try {
            return (AuthorizationCodeGrant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.AuthorizationCodeGrantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
