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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetAccessToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Refresh token, encoded as a JWT token.
     * </p>
     */
    private String token;
    /**
     * <p>
     * Token properties to validate against those present in the JWT token.
     * </p>
     */
    private java.util.List<String> tokenProperties;

    /**
     * <p>
     * Refresh token, encoded as a JWT token.
     * </p>
     * 
     * @param token
     *        Refresh token, encoded as a JWT token.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * Refresh token, encoded as a JWT token.
     * </p>
     * 
     * @return Refresh token, encoded as a JWT token.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * Refresh token, encoded as a JWT token.
     * </p>
     * 
     * @param token
     *        Refresh token, encoded as a JWT token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessTokenRequest withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * Token properties to validate against those present in the JWT token.
     * </p>
     * 
     * @return Token properties to validate against those present in the JWT token.
     */

    public java.util.List<String> getTokenProperties() {
        return tokenProperties;
    }

    /**
     * <p>
     * Token properties to validate against those present in the JWT token.
     * </p>
     * 
     * @param tokenProperties
     *        Token properties to validate against those present in the JWT token.
     */

    public void setTokenProperties(java.util.Collection<String> tokenProperties) {
        if (tokenProperties == null) {
            this.tokenProperties = null;
            return;
        }

        this.tokenProperties = new java.util.ArrayList<String>(tokenProperties);
    }

    /**
     * <p>
     * Token properties to validate against those present in the JWT token.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenProperties(java.util.Collection)} or {@link #withTokenProperties(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tokenProperties
     *        Token properties to validate against those present in the JWT token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessTokenRequest withTokenProperties(String... tokenProperties) {
        if (this.tokenProperties == null) {
            setTokenProperties(new java.util.ArrayList<String>(tokenProperties.length));
        }
        for (String ele : tokenProperties) {
            this.tokenProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Token properties to validate against those present in the JWT token.
     * </p>
     * 
     * @param tokenProperties
     *        Token properties to validate against those present in the JWT token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessTokenRequest withTokenProperties(java.util.Collection<String> tokenProperties) {
        setTokenProperties(tokenProperties);
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
            sb.append("Token: ").append(getToken()).append(",");
        if (getTokenProperties() != null)
            sb.append("TokenProperties: ").append(getTokenProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessTokenRequest == false)
            return false;
        GetAccessTokenRequest other = (GetAccessTokenRequest) obj;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getTokenProperties() == null ^ this.getTokenProperties() == null)
            return false;
        if (other.getTokenProperties() != null && other.getTokenProperties().equals(this.getTokenProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getTokenProperties() == null) ? 0 : getTokenProperties().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessTokenRequest clone() {
        return (GetAccessTokenRequest) super.clone();
    }

}
