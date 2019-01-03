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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Request parameters to use when integrating with Amazon Cognito to authenticate users.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AuthenticateCognitoActionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticateCognitoActionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
     * </p>
     */
    private String userPoolArn;
    /**
     * <p>
     * The ID of the Amazon Cognito user pool client.
     * </p>
     */
    private String userPoolClientId;
    /**
     * <p>
     * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     * </p>
     */
    private String userPoolDomain;
    /**
     * <p>
     * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * </p>
     */
    private String sessionCookieName;
    /**
     * <p>
     * The set of user claims to be requested from the IdP. The default is <code>openid</code>.
     * </p>
     * <p>
     * To verify which scope values your IdP supports and how to separate multiple values, see the documentation for
     * your IdP.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * </p>
     */
    private Long sessionTimeout;
    /**
     * <p>
     * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * </p>
     */
    private java.util.Map<String, String> authenticationRequestExtraParams;
    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     */
    private String onUnauthenticatedRequest;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolArn
     *        The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
     */

    public void setUserPoolArn(String userPoolArn) {
        this.userPoolArn = userPoolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
     */

    public String getUserPoolArn() {
        return this.userPoolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolArn
     *        The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateCognitoActionConfig withUserPoolArn(String userPoolArn) {
        setUserPoolArn(userPoolArn);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool client.
     * </p>
     * 
     * @param userPoolClientId
     *        The ID of the Amazon Cognito user pool client.
     */

    public void setUserPoolClientId(String userPoolClientId) {
        this.userPoolClientId = userPoolClientId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool client.
     * </p>
     * 
     * @return The ID of the Amazon Cognito user pool client.
     */

    public String getUserPoolClientId() {
        return this.userPoolClientId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool client.
     * </p>
     * 
     * @param userPoolClientId
     *        The ID of the Amazon Cognito user pool client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateCognitoActionConfig withUserPoolClientId(String userPoolClientId) {
        setUserPoolClientId(userPoolClientId);
        return this;
    }

    /**
     * <p>
     * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolDomain
     *        The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     */

    public void setUserPoolDomain(String userPoolDomain) {
        this.userPoolDomain = userPoolDomain;
    }

    /**
     * <p>
     * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     * </p>
     * 
     * @return The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     */

    public String getUserPoolDomain() {
        return this.userPoolDomain;
    }

    /**
     * <p>
     * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolDomain
     *        The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateCognitoActionConfig withUserPoolDomain(String userPoolDomain) {
        setUserPoolDomain(userPoolDomain);
        return this;
    }

    /**
     * <p>
     * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * </p>
     * 
     * @param sessionCookieName
     *        The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     */

    public void setSessionCookieName(String sessionCookieName) {
        this.sessionCookieName = sessionCookieName;
    }

    /**
     * <p>
     * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * </p>
     * 
     * @return The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     */

    public String getSessionCookieName() {
        return this.sessionCookieName;
    }

    /**
     * <p>
     * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * </p>
     * 
     * @param sessionCookieName
     *        The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateCognitoActionConfig withSessionCookieName(String sessionCookieName) {
        setSessionCookieName(sessionCookieName);
        return this;
    }

    /**
     * <p>
     * The set of user claims to be requested from the IdP. The default is <code>openid</code>.
     * </p>
     * <p>
     * To verify which scope values your IdP supports and how to separate multiple values, see the documentation for
     * your IdP.
     * </p>
     * 
     * @param scope
     *        The set of user claims to be requested from the IdP. The default is <code>openid</code>.</p>
     *        <p>
     *        To verify which scope values your IdP supports and how to separate multiple values, see the documentation
     *        for your IdP.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The set of user claims to be requested from the IdP. The default is <code>openid</code>.
     * </p>
     * <p>
     * To verify which scope values your IdP supports and how to separate multiple values, see the documentation for
     * your IdP.
     * </p>
     * 
     * @return The set of user claims to be requested from the IdP. The default is <code>openid</code>.</p>
     *         <p>
     *         To verify which scope values your IdP supports and how to separate multiple values, see the documentation
     *         for your IdP.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The set of user claims to be requested from the IdP. The default is <code>openid</code>.
     * </p>
     * <p>
     * To verify which scope values your IdP supports and how to separate multiple values, see the documentation for
     * your IdP.
     * </p>
     * 
     * @param scope
     *        The set of user claims to be requested from the IdP. The default is <code>openid</code>.</p>
     *        <p>
     *        To verify which scope values your IdP supports and how to separate multiple values, see the documentation
     *        for your IdP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateCognitoActionConfig withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * </p>
     * 
     * @param sessionTimeout
     *        The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     */

    public void setSessionTimeout(Long sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    /**
     * <p>
     * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * </p>
     * 
     * @return The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     */

    public Long getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * <p>
     * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * </p>
     * 
     * @param sessionTimeout
     *        The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateCognitoActionConfig withSessionTimeout(Long sessionTimeout) {
        setSessionTimeout(sessionTimeout);
        return this;
    }

    /**
     * <p>
     * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * </p>
     * 
     * @return The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     */

    public java.util.Map<String, String> getAuthenticationRequestExtraParams() {
        return authenticationRequestExtraParams;
    }

    /**
     * <p>
     * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * </p>
     * 
     * @param authenticationRequestExtraParams
     *        The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     */

    public void setAuthenticationRequestExtraParams(java.util.Map<String, String> authenticationRequestExtraParams) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
    }

    /**
     * <p>
     * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * </p>
     * 
     * @param authenticationRequestExtraParams
     *        The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateCognitoActionConfig withAuthenticationRequestExtraParams(java.util.Map<String, String> authenticationRequestExtraParams) {
        setAuthenticationRequestExtraParams(authenticationRequestExtraParams);
        return this;
    }

    public AuthenticateCognitoActionConfig addAuthenticationRequestExtraParamsEntry(String key, String value) {
        if (null == this.authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = new java.util.HashMap<String, String>();
        }
        if (this.authenticationRequestExtraParams.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.authenticationRequestExtraParams.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuthenticationRequestExtraParams.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateCognitoActionConfig clearAuthenticationRequestExtraParamsEntries() {
        this.authenticationRequestExtraParams = null;
        return this;
    }

    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param onUnauthenticatedRequest
     *        The behavior if the user is not authenticated. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        deny<code/> - Return an HTTP 401 Unauthorized error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        allow<code/> - Allow the request to be forwarded to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     *        </p>
     *        </li>
     * @see AuthenticateCognitoActionConditionalBehaviorEnum
     */

    public void setOnUnauthenticatedRequest(String onUnauthenticatedRequest) {
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
    }

    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The behavior if the user is not authenticated. The following are possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         deny<code/> - Return an HTTP 401 Unauthorized error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         allow<code/> - Allow the request to be forwarded to the target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     *         </p>
     *         </li>
     * @see AuthenticateCognitoActionConditionalBehaviorEnum
     */

    public String getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest;
    }

    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param onUnauthenticatedRequest
     *        The behavior if the user is not authenticated. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        deny<code/> - Return an HTTP 401 Unauthorized error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        allow<code/> - Allow the request to be forwarded to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticateCognitoActionConditionalBehaviorEnum
     */

    public AuthenticateCognitoActionConfig withOnUnauthenticatedRequest(String onUnauthenticatedRequest) {
        setOnUnauthenticatedRequest(onUnauthenticatedRequest);
        return this;
    }

    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param onUnauthenticatedRequest
     *        The behavior if the user is not authenticated. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        deny<code/> - Return an HTTP 401 Unauthorized error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        allow<code/> - Allow the request to be forwarded to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticateCognitoActionConditionalBehaviorEnum
     */

    public AuthenticateCognitoActionConfig withOnUnauthenticatedRequest(AuthenticateCognitoActionConditionalBehaviorEnum onUnauthenticatedRequest) {
        this.onUnauthenticatedRequest = onUnauthenticatedRequest.toString();
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
        if (getUserPoolArn() != null)
            sb.append("UserPoolArn: ").append(getUserPoolArn()).append(",");
        if (getUserPoolClientId() != null)
            sb.append("UserPoolClientId: ").append(getUserPoolClientId()).append(",");
        if (getUserPoolDomain() != null)
            sb.append("UserPoolDomain: ").append(getUserPoolDomain()).append(",");
        if (getSessionCookieName() != null)
            sb.append("SessionCookieName: ").append(getSessionCookieName()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getSessionTimeout() != null)
            sb.append("SessionTimeout: ").append(getSessionTimeout()).append(",");
        if (getAuthenticationRequestExtraParams() != null)
            sb.append("AuthenticationRequestExtraParams: ").append(getAuthenticationRequestExtraParams()).append(",");
        if (getOnUnauthenticatedRequest() != null)
            sb.append("OnUnauthenticatedRequest: ").append(getOnUnauthenticatedRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticateCognitoActionConfig == false)
            return false;
        AuthenticateCognitoActionConfig other = (AuthenticateCognitoActionConfig) obj;
        if (other.getUserPoolArn() == null ^ this.getUserPoolArn() == null)
            return false;
        if (other.getUserPoolArn() != null && other.getUserPoolArn().equals(this.getUserPoolArn()) == false)
            return false;
        if (other.getUserPoolClientId() == null ^ this.getUserPoolClientId() == null)
            return false;
        if (other.getUserPoolClientId() != null && other.getUserPoolClientId().equals(this.getUserPoolClientId()) == false)
            return false;
        if (other.getUserPoolDomain() == null ^ this.getUserPoolDomain() == null)
            return false;
        if (other.getUserPoolDomain() != null && other.getUserPoolDomain().equals(this.getUserPoolDomain()) == false)
            return false;
        if (other.getSessionCookieName() == null ^ this.getSessionCookieName() == null)
            return false;
        if (other.getSessionCookieName() != null && other.getSessionCookieName().equals(this.getSessionCookieName()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getSessionTimeout() == null ^ this.getSessionTimeout() == null)
            return false;
        if (other.getSessionTimeout() != null && other.getSessionTimeout().equals(this.getSessionTimeout()) == false)
            return false;
        if (other.getAuthenticationRequestExtraParams() == null ^ this.getAuthenticationRequestExtraParams() == null)
            return false;
        if (other.getAuthenticationRequestExtraParams() != null
                && other.getAuthenticationRequestExtraParams().equals(this.getAuthenticationRequestExtraParams()) == false)
            return false;
        if (other.getOnUnauthenticatedRequest() == null ^ this.getOnUnauthenticatedRequest() == null)
            return false;
        if (other.getOnUnauthenticatedRequest() != null && other.getOnUnauthenticatedRequest().equals(this.getOnUnauthenticatedRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolArn() == null) ? 0 : getUserPoolArn().hashCode());
        hashCode = prime * hashCode + ((getUserPoolClientId() == null) ? 0 : getUserPoolClientId().hashCode());
        hashCode = prime * hashCode + ((getUserPoolDomain() == null) ? 0 : getUserPoolDomain().hashCode());
        hashCode = prime * hashCode + ((getSessionCookieName() == null) ? 0 : getSessionCookieName().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getSessionTimeout() == null) ? 0 : getSessionTimeout().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationRequestExtraParams() == null) ? 0 : getAuthenticationRequestExtraParams().hashCode());
        hashCode = prime * hashCode + ((getOnUnauthenticatedRequest() == null) ? 0 : getOnUnauthenticatedRequest().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticateCognitoActionConfig clone() {
        try {
            return (AuthenticateCognitoActionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
