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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ImportSourceCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSourceCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This parameter is not valid for other types
     * of source providers or connections.
     * </p>
     */
    private String username;
    /**
     * <p>
     * For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app password.
     * </p>
     */
    private String token;
    /**
     * <p>
     * The source provider used for this project.
     * </p>
     */
    private String serverType;
    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH
     * connection is not supported by the API and must be created using the AWS CodeBuild console.
     * </p>
     */
    private String authType;

    /**
     * <p>
     * The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This parameter is not valid for other types
     * of source providers or connections.
     * </p>
     * 
     * @param username
     *        The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This parameter is not valid for other
     *        types of source providers or connections.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This parameter is not valid for other types
     * of source providers or connections.
     * </p>
     * 
     * @return The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This parameter is not valid for
     *         other types of source providers or connections.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This parameter is not valid for other types
     * of source providers or connections.
     * </p>
     * 
     * @param username
     *        The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This parameter is not valid for other
     *        types of source providers or connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSourceCredentialsRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app password.
     * </p>
     * 
     * @param token
     *        For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app
     *        password.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app password.
     * </p>
     * 
     * @return For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app
     *         password.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app password.
     * </p>
     * 
     * @param token
     *        For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app
     *        password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSourceCredentialsRequest withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * 
     * @param serverType
     *        The source provider used for this project.
     * @see ServerType
     */

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * 
     * @return The source provider used for this project.
     * @see ServerType
     */

    public String getServerType() {
        return this.serverType;
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * 
     * @param serverType
     *        The source provider used for this project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public ImportSourceCredentialsRequest withServerType(String serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * 
     * @param serverType
     *        The source provider used for this project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public ImportSourceCredentialsRequest withServerType(ServerType serverType) {
        this.serverType = serverType.toString();
        return this;
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH
     * connection is not supported by the API and must be created using the AWS CodeBuild console.
     * </p>
     * 
     * @param authType
     *        The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An
     *        OAUTH connection is not supported by the API and must be created using the AWS CodeBuild console.
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH
     * connection is not supported by the API and must be created using the AWS CodeBuild console.
     * </p>
     * 
     * @return The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An
     *         OAUTH connection is not supported by the API and must be created using the AWS CodeBuild console.
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH
     * connection is not supported by the API and must be created using the AWS CodeBuild console.
     * </p>
     * 
     * @param authType
     *        The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An
     *        OAUTH connection is not supported by the API and must be created using the AWS CodeBuild console.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public ImportSourceCredentialsRequest withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH
     * connection is not supported by the API and must be created using the AWS CodeBuild console.
     * </p>
     * 
     * @param authType
     *        The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An
     *        OAUTH connection is not supported by the API and must be created using the AWS CodeBuild console.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public ImportSourceCredentialsRequest withAuthType(AuthType authType) {
        this.authType = authType.toString();
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append("***Sensitive Data Redacted***").append(",");
        if (getServerType() != null)
            sb.append("ServerType: ").append(getServerType()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSourceCredentialsRequest == false)
            return false;
        ImportSourceCredentialsRequest other = (ImportSourceCredentialsRequest) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getServerType() == null ^ this.getServerType() == null)
            return false;
        if (other.getServerType() != null && other.getServerType().equals(this.getServerType()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getServerType() == null) ? 0 : getServerType().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        return hashCode;
    }

    @Override
    public ImportSourceCredentialsRequest clone() {
        return (ImportSourceCredentialsRequest) super.clone();
    }

}
