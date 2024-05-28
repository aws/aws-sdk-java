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
 * A structure that describes an authentication method and its type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AuthenticationMethodItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationMethodItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that describes an authentication method. The contents of this structure is determined by the
     * <code>AuthenticationMethodType</code>.
     * </p>
     */
    private AuthenticationMethod authenticationMethod;
    /**
     * <p>
     * The type of authentication that is used by this method.
     * </p>
     */
    private String authenticationMethodType;

    /**
     * <p>
     * A structure that describes an authentication method. The contents of this structure is determined by the
     * <code>AuthenticationMethodType</code>.
     * </p>
     * 
     * @param authenticationMethod
     *        A structure that describes an authentication method. The contents of this structure is determined by the
     *        <code>AuthenticationMethodType</code>.
     */

    public void setAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    /**
     * <p>
     * A structure that describes an authentication method. The contents of this structure is determined by the
     * <code>AuthenticationMethodType</code>.
     * </p>
     * 
     * @return A structure that describes an authentication method. The contents of this structure is determined by the
     *         <code>AuthenticationMethodType</code>.
     */

    public AuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * <p>
     * A structure that describes an authentication method. The contents of this structure is determined by the
     * <code>AuthenticationMethodType</code>.
     * </p>
     * 
     * @param authenticationMethod
     *        A structure that describes an authentication method. The contents of this structure is determined by the
     *        <code>AuthenticationMethodType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationMethodItem withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        setAuthenticationMethod(authenticationMethod);
        return this;
    }

    /**
     * <p>
     * The type of authentication that is used by this method.
     * </p>
     * 
     * @param authenticationMethodType
     *        The type of authentication that is used by this method.
     * @see AuthenticationMethodType
     */

    public void setAuthenticationMethodType(String authenticationMethodType) {
        this.authenticationMethodType = authenticationMethodType;
    }

    /**
     * <p>
     * The type of authentication that is used by this method.
     * </p>
     * 
     * @return The type of authentication that is used by this method.
     * @see AuthenticationMethodType
     */

    public String getAuthenticationMethodType() {
        return this.authenticationMethodType;
    }

    /**
     * <p>
     * The type of authentication that is used by this method.
     * </p>
     * 
     * @param authenticationMethodType
     *        The type of authentication that is used by this method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMethodType
     */

    public AuthenticationMethodItem withAuthenticationMethodType(String authenticationMethodType) {
        setAuthenticationMethodType(authenticationMethodType);
        return this;
    }

    /**
     * <p>
     * The type of authentication that is used by this method.
     * </p>
     * 
     * @param authenticationMethodType
     *        The type of authentication that is used by this method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMethodType
     */

    public AuthenticationMethodItem withAuthenticationMethodType(AuthenticationMethodType authenticationMethodType) {
        this.authenticationMethodType = authenticationMethodType.toString();
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
            sb.append("AuthenticationMethod: ").append(getAuthenticationMethod()).append(",");
        if (getAuthenticationMethodType() != null)
            sb.append("AuthenticationMethodType: ").append(getAuthenticationMethodType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationMethodItem == false)
            return false;
        AuthenticationMethodItem other = (AuthenticationMethodItem) obj;
        if (other.getAuthenticationMethod() == null ^ this.getAuthenticationMethod() == null)
            return false;
        if (other.getAuthenticationMethod() != null && other.getAuthenticationMethod().equals(this.getAuthenticationMethod()) == false)
            return false;
        if (other.getAuthenticationMethodType() == null ^ this.getAuthenticationMethodType() == null)
            return false;
        if (other.getAuthenticationMethodType() != null && other.getAuthenticationMethodType().equals(this.getAuthenticationMethodType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationMethod() == null) ? 0 : getAuthenticationMethod().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationMethodType() == null) ? 0 : getAuthenticationMethodType().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationMethodItem clone() {
        try {
            return (AuthenticationMethodItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.AuthenticationMethodItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
