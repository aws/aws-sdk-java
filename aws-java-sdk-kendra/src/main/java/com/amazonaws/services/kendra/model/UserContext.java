/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the user context for a Amazon Kendra index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UserContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user context token. It must be a JWT or a JSON token.
     * </p>
     */
    private String token;

    /**
     * <p>
     * The user context token. It must be a JWT or a JSON token.
     * </p>
     * 
     * @param token
     *        The user context token. It must be a JWT or a JSON token.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The user context token. It must be a JWT or a JSON token.
     * </p>
     * 
     * @return The user context token. It must be a JWT or a JSON token.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The user context token. It must be a JWT or a JSON token.
     * </p>
     * 
     * @param token
     *        The user context token. It must be a JWT or a JSON token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserContext withToken(String token) {
        setToken(token);
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
        if (getToken() != null)
            sb.append("Token: ").append(getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserContext == false)
            return false;
        UserContext other = (UserContext) obj;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public UserContext clone() {
        try {
            return (UserContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.UserContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
