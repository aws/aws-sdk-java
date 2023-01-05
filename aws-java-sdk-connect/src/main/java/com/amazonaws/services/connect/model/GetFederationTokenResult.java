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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFederationToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFederationTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The credentials to use for federation.
     * </p>
     */
    private Credentials credentials;
    /**
     * <p>
     * The URL to sign into the user's instance.
     * </p>
     */
    private String signInUrl;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The identifier for the user.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The credentials to use for federation.
     * </p>
     * 
     * @param credentials
     *        The credentials to use for federation.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials to use for federation.
     * </p>
     * 
     * @return The credentials to use for federation.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The credentials to use for federation.
     * </p>
     * 
     * @param credentials
     *        The credentials to use for federation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenResult withCredentials(Credentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The URL to sign into the user's instance.
     * </p>
     * 
     * @param signInUrl
     *        The URL to sign into the user's instance.
     */

    public void setSignInUrl(String signInUrl) {
        this.signInUrl = signInUrl;
    }

    /**
     * <p>
     * The URL to sign into the user's instance.
     * </p>
     * 
     * @return The URL to sign into the user's instance.
     */

    public String getSignInUrl() {
        return this.signInUrl;
    }

    /**
     * <p>
     * The URL to sign into the user's instance.
     * </p>
     * 
     * @param signInUrl
     *        The URL to sign into the user's instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenResult withSignInUrl(String signInUrl) {
        setSignInUrl(signInUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenResult withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * 
     * @param userId
     *        The identifier for the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * 
     * @return The identifier for the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * 
     * @param userId
     *        The identifier for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFederationTokenResult withUserId(String userId) {
        setUserId(userId);
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
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getSignInUrl() != null)
            sb.append("SignInUrl: ").append(getSignInUrl()).append(",");
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFederationTokenResult == false)
            return false;
        GetFederationTokenResult other = (GetFederationTokenResult) obj;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getSignInUrl() == null ^ this.getSignInUrl() == null)
            return false;
        if (other.getSignInUrl() != null && other.getSignInUrl().equals(this.getSignInUrl()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getSignInUrl() == null) ? 0 : getSignInUrl().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public GetFederationTokenResult clone() {
        try {
            return (GetFederationTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
