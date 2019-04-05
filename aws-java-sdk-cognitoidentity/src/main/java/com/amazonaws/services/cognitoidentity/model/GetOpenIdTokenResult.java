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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returned in response to a successful GetOpenIdToken request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetOpenIdToken" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOpenIdTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on
     * input.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * An OpenID token, valid for 10 minutes.
     * </p>
     */
    private String token;

    /**
     * <p>
     * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on
     * input.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one
     *        passed on input.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on
     * input.
     * </p>
     * 
     * @return A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one
     *         passed on input.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on
     * input.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one
     *        passed on input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenResult withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * An OpenID token, valid for 10 minutes.
     * </p>
     * 
     * @param token
     *        An OpenID token, valid for 10 minutes.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * An OpenID token, valid for 10 minutes.
     * </p>
     * 
     * @return An OpenID token, valid for 10 minutes.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * An OpenID token, valid for 10 minutes.
     * </p>
     * 
     * @param token
     *        An OpenID token, valid for 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIdTokenResult withToken(String token) {
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
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
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

        if (obj instanceof GetOpenIdTokenResult == false)
            return false;
        GetOpenIdTokenResult other = (GetOpenIdTokenResult) obj;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public GetOpenIdTokenResult clone() {
        try {
            return (GetOpenIdTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
