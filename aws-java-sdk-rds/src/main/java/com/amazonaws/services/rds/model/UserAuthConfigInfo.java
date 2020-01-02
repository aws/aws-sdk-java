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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Returns the details of authentication used by a proxy to log in as a specific database user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/UserAuthConfigInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserAuthConfigInfo implements Serializable, Cloneable {

    /**
     * <p>
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the database user to which the proxy connects.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * </p>
     */
    private String authScheme;
    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance
     * or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the
     * proxy.
     * </p>
     */
    private String iAMAuth;

    /**
     * <p>
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * </p>
     * 
     * @param description
     *        A user-specified description about the authentication used by a proxy to log in as a specific database
     *        user.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * </p>
     * 
     * @return A user-specified description about the authentication used by a proxy to log in as a specific database
     *         user.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * </p>
     * 
     * @param description
     *        A user-specified description about the authentication used by a proxy to log in as a specific database
     *        user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAuthConfigInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the database user to which the proxy connects.
     * </p>
     * 
     * @param userName
     *        The name of the database user to which the proxy connects.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the database user to which the proxy connects.
     * </p>
     * 
     * @return The name of the database user to which the proxy connects.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the database user to which the proxy connects.
     * </p>
     * 
     * @param userName
     *        The name of the database user to which the proxy connects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAuthConfigInfo withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * </p>
     * 
     * @param authScheme
     *        The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * @see AuthScheme
     */

    public void setAuthScheme(String authScheme) {
        this.authScheme = authScheme;
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * </p>
     * 
     * @return The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * @see AuthScheme
     */

    public String getAuthScheme() {
        return this.authScheme;
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * </p>
     * 
     * @param authScheme
     *        The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthScheme
     */

    public UserAuthConfigInfo withAuthScheme(String authScheme) {
        setAuthScheme(authScheme);
        return this;
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * </p>
     * 
     * @param authScheme
     *        The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthScheme
     */

    public UserAuthConfigInfo withAuthScheme(AuthScheme authScheme) {
        this.authScheme = authScheme.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance
     * or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB
     *        instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance
     * or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB
     *         instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance
     * or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB
     *        instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAuthConfigInfo withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the
     * proxy.
     * </p>
     * 
     * @param iAMAuth
     *        Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to
     *        the proxy.
     * @see IAMAuthMode
     */

    public void setIAMAuth(String iAMAuth) {
        this.iAMAuth = iAMAuth;
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the
     * proxy.
     * </p>
     * 
     * @return Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to
     *         the proxy.
     * @see IAMAuthMode
     */

    public String getIAMAuth() {
        return this.iAMAuth;
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the
     * proxy.
     * </p>
     * 
     * @param iAMAuth
     *        Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to
     *        the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IAMAuthMode
     */

    public UserAuthConfigInfo withIAMAuth(String iAMAuth) {
        setIAMAuth(iAMAuth);
        return this;
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the
     * proxy.
     * </p>
     * 
     * @param iAMAuth
     *        Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to
     *        the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IAMAuthMode
     */

    public UserAuthConfigInfo withIAMAuth(IAMAuthMode iAMAuth) {
        this.iAMAuth = iAMAuth.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getAuthScheme() != null)
            sb.append("AuthScheme: ").append(getAuthScheme()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getIAMAuth() != null)
            sb.append("IAMAuth: ").append(getIAMAuth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserAuthConfigInfo == false)
            return false;
        UserAuthConfigInfo other = (UserAuthConfigInfo) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAuthScheme() == null ^ this.getAuthScheme() == null)
            return false;
        if (other.getAuthScheme() != null && other.getAuthScheme().equals(this.getAuthScheme()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getIAMAuth() == null ^ this.getIAMAuth() == null)
            return false;
        if (other.getIAMAuth() != null && other.getIAMAuth().equals(this.getIAMAuth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getAuthScheme() == null) ? 0 : getAuthScheme().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getIAMAuth() == null) ? 0 : getIAMAuth().hashCode());
        return hashCode;
    }

    @Override
    public UserAuthConfigInfo clone() {
        try {
            return (UserAuthConfigInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
