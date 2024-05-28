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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAuthenticationMethod"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationAuthenticationMethodResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A structure that contains details about the requested authentication method.
     * </p>
     */
    private AuthenticationMethod authenticationMethod;

    /**
     * <p>
     * A structure that contains details about the requested authentication method.
     * </p>
     * 
     * @param authenticationMethod
     *        A structure that contains details about the requested authentication method.
     */

    public void setAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    /**
     * <p>
     * A structure that contains details about the requested authentication method.
     * </p>
     * 
     * @return A structure that contains details about the requested authentication method.
     */

    public AuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * <p>
     * A structure that contains details about the requested authentication method.
     * </p>
     * 
     * @param authenticationMethod
     *        A structure that contains details about the requested authentication method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationAuthenticationMethodResult withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        setAuthenticationMethod(authenticationMethod);
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
        if (getAuthenticationMethod() != null)
            sb.append("AuthenticationMethod: ").append(getAuthenticationMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationAuthenticationMethodResult == false)
            return false;
        GetApplicationAuthenticationMethodResult other = (GetApplicationAuthenticationMethodResult) obj;
        if (other.getAuthenticationMethod() == null ^ this.getAuthenticationMethod() == null)
            return false;
        if (other.getAuthenticationMethod() != null && other.getAuthenticationMethod().equals(this.getAuthenticationMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationMethod() == null) ? 0 : getAuthenticationMethod().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationAuthenticationMethodResult clone() {
        try {
            return (GetApplicationAuthenticationMethodResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
