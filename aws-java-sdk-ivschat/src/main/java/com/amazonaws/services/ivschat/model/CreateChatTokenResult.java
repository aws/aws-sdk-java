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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateChatToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChatTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Time after which an end user's session is no longer valid. This is an ISO 8601 timestamp; <i>note that this is
     * returned as a string</i>.
     * </p>
     */
    private java.util.Date sessionExpirationTime;
    /**
     * <p>
     * The issued client token, encrypted.
     * </p>
     */
    private String token;
    /**
     * <p>
     * Time after which the token is no longer valid and cannot be used to connect to a room. This is an ISO 8601
     * timestamp; <i>note that this is returned as a string</i>.
     * </p>
     */
    private java.util.Date tokenExpirationTime;

    /**
     * <p>
     * Time after which an end user's session is no longer valid. This is an ISO 8601 timestamp; <i>note that this is
     * returned as a string</i>.
     * </p>
     * 
     * @param sessionExpirationTime
     *        Time after which an end user's session is no longer valid. This is an ISO 8601 timestamp; <i>note that
     *        this is returned as a string</i>.
     */

    public void setSessionExpirationTime(java.util.Date sessionExpirationTime) {
        this.sessionExpirationTime = sessionExpirationTime;
    }

    /**
     * <p>
     * Time after which an end user's session is no longer valid. This is an ISO 8601 timestamp; <i>note that this is
     * returned as a string</i>.
     * </p>
     * 
     * @return Time after which an end user's session is no longer valid. This is an ISO 8601 timestamp; <i>note that
     *         this is returned as a string</i>.
     */

    public java.util.Date getSessionExpirationTime() {
        return this.sessionExpirationTime;
    }

    /**
     * <p>
     * Time after which an end user's session is no longer valid. This is an ISO 8601 timestamp; <i>note that this is
     * returned as a string</i>.
     * </p>
     * 
     * @param sessionExpirationTime
     *        Time after which an end user's session is no longer valid. This is an ISO 8601 timestamp; <i>note that
     *        this is returned as a string</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChatTokenResult withSessionExpirationTime(java.util.Date sessionExpirationTime) {
        setSessionExpirationTime(sessionExpirationTime);
        return this;
    }

    /**
     * <p>
     * The issued client token, encrypted.
     * </p>
     * 
     * @param token
     *        The issued client token, encrypted.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The issued client token, encrypted.
     * </p>
     * 
     * @return The issued client token, encrypted.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The issued client token, encrypted.
     * </p>
     * 
     * @param token
     *        The issued client token, encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChatTokenResult withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * Time after which the token is no longer valid and cannot be used to connect to a room. This is an ISO 8601
     * timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param tokenExpirationTime
     *        Time after which the token is no longer valid and cannot be used to connect to a room. This is an ISO 8601
     *        timestamp; <i>note that this is returned as a string</i>.
     */

    public void setTokenExpirationTime(java.util.Date tokenExpirationTime) {
        this.tokenExpirationTime = tokenExpirationTime;
    }

    /**
     * <p>
     * Time after which the token is no longer valid and cannot be used to connect to a room. This is an ISO 8601
     * timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @return Time after which the token is no longer valid and cannot be used to connect to a room. This is an ISO
     *         8601 timestamp; <i>note that this is returned as a string</i>.
     */

    public java.util.Date getTokenExpirationTime() {
        return this.tokenExpirationTime;
    }

    /**
     * <p>
     * Time after which the token is no longer valid and cannot be used to connect to a room. This is an ISO 8601
     * timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param tokenExpirationTime
     *        Time after which the token is no longer valid and cannot be used to connect to a room. This is an ISO 8601
     *        timestamp; <i>note that this is returned as a string</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChatTokenResult withTokenExpirationTime(java.util.Date tokenExpirationTime) {
        setTokenExpirationTime(tokenExpirationTime);
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
        if (getSessionExpirationTime() != null)
            sb.append("SessionExpirationTime: ").append(getSessionExpirationTime()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken()).append(",");
        if (getTokenExpirationTime() != null)
            sb.append("TokenExpirationTime: ").append(getTokenExpirationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChatTokenResult == false)
            return false;
        CreateChatTokenResult other = (CreateChatTokenResult) obj;
        if (other.getSessionExpirationTime() == null ^ this.getSessionExpirationTime() == null)
            return false;
        if (other.getSessionExpirationTime() != null && other.getSessionExpirationTime().equals(this.getSessionExpirationTime()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getTokenExpirationTime() == null ^ this.getTokenExpirationTime() == null)
            return false;
        if (other.getTokenExpirationTime() != null && other.getTokenExpirationTime().equals(this.getTokenExpirationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionExpirationTime() == null) ? 0 : getSessionExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getTokenExpirationTime() == null) ? 0 : getTokenExpirationTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateChatTokenResult clone() {
        try {
            return (CreateChatTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
