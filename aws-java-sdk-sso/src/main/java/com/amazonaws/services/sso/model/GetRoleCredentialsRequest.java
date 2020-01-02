/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sso.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/GetRoleCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRoleCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name of the role that is assigned to the user.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The identifier for the AWS account that is assigned to the user.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The token issued by the <code>CreateToken</code> API call. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in
     * the <i>AWS SSO OIDC API Reference Guide</i>.
     * </p>
     */
    private String accessToken;

    /**
     * <p>
     * The friendly name of the role that is assigned to the user.
     * </p>
     * 
     * @param roleName
     *        The friendly name of the role that is assigned to the user.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The friendly name of the role that is assigned to the user.
     * </p>
     * 
     * @return The friendly name of the role that is assigned to the user.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The friendly name of the role that is assigned to the user.
     * </p>
     * 
     * @param roleName
     *        The friendly name of the role that is assigned to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRoleCredentialsRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The identifier for the AWS account that is assigned to the user.
     * </p>
     * 
     * @param accountId
     *        The identifier for the AWS account that is assigned to the user.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The identifier for the AWS account that is assigned to the user.
     * </p>
     * 
     * @return The identifier for the AWS account that is assigned to the user.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The identifier for the AWS account that is assigned to the user.
     * </p>
     * 
     * @param accountId
     *        The identifier for the AWS account that is assigned to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRoleCredentialsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The token issued by the <code>CreateToken</code> API call. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in
     * the <i>AWS SSO OIDC API Reference Guide</i>.
     * </p>
     * 
     * @param accessToken
     *        The token issued by the <code>CreateToken</code> API call. For more information, see <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html"
     *        >CreateToken</a> in the <i>AWS SSO OIDC API Reference Guide</i>.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The token issued by the <code>CreateToken</code> API call. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in
     * the <i>AWS SSO OIDC API Reference Guide</i>.
     * </p>
     * 
     * @return The token issued by the <code>CreateToken</code> API call. For more information, see <a
     *         href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html"
     *         >CreateToken</a> in the <i>AWS SSO OIDC API Reference Guide</i>.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The token issued by the <code>CreateToken</code> API call. For more information, see <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html">CreateToken</a> in
     * the <i>AWS SSO OIDC API Reference Guide</i>.
     * </p>
     * 
     * @param accessToken
     *        The token issued by the <code>CreateToken</code> API call. For more information, see <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/API_CreateToken.html"
     *        >CreateToken</a> in the <i>AWS SSO OIDC API Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRoleCredentialsRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
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
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRoleCredentialsRequest == false)
            return false;
        GetRoleCredentialsRequest other = (GetRoleCredentialsRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRoleCredentialsRequest clone() {
        return (GetRoleCredentialsRequest) super.clone();
    }

}
