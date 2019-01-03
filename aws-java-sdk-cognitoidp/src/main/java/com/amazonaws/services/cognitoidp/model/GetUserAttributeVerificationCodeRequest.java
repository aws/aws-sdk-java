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
 * Represents the request to get user attribute verification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserAttributeVerificationCode"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserAttributeVerificationCodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The access token returned by the server response to get the user attribute verification code.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The attribute name returned by the server response to get the user attribute verification code.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The access token returned by the server response to get the user attribute verification code.
     * </p>
     * 
     * @param accessToken
     *        The access token returned by the server response to get the user attribute verification code.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token returned by the server response to get the user attribute verification code.
     * </p>
     * 
     * @return The access token returned by the server response to get the user attribute verification code.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The access token returned by the server response to get the user attribute verification code.
     * </p>
     * 
     * @param accessToken
     *        The access token returned by the server response to get the user attribute verification code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserAttributeVerificationCodeRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The attribute name returned by the server response to get the user attribute verification code.
     * </p>
     * 
     * @param attributeName
     *        The attribute name returned by the server response to get the user attribute verification code.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name returned by the server response to get the user attribute verification code.
     * </p>
     * 
     * @return The attribute name returned by the server response to get the user attribute verification code.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The attribute name returned by the server response to get the user attribute verification code.
     * </p>
     * 
     * @param attributeName
     *        The attribute name returned by the server response to get the user attribute verification code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserAttributeVerificationCodeRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserAttributeVerificationCodeRequest == false)
            return false;
        GetUserAttributeVerificationCodeRequest other = (GetUserAttributeVerificationCodeRequest) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public GetUserAttributeVerificationCodeRequest clone() {
        return (GetUserAttributeVerificationCodeRequest) super.clone();
    }

}
