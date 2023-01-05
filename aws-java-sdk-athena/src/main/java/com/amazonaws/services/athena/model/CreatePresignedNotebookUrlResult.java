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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePresignedNotebookUrl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresignedNotebookUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the notebook. The URL includes the authentication token and notebook file name and points directly to
     * the opened notebook.
     * </p>
     */
    private String notebookUrl;
    /**
     * <p>
     * The authentication token for the notebook.
     * </p>
     */
    private String authToken;
    /**
     * <p>
     * The UTC epoch time when the authentication token expires.
     * </p>
     */
    private Long authTokenExpirationTime;

    /**
     * <p>
     * The URL of the notebook. The URL includes the authentication token and notebook file name and points directly to
     * the opened notebook.
     * </p>
     * 
     * @param notebookUrl
     *        The URL of the notebook. The URL includes the authentication token and notebook file name and points
     *        directly to the opened notebook.
     */

    public void setNotebookUrl(String notebookUrl) {
        this.notebookUrl = notebookUrl;
    }

    /**
     * <p>
     * The URL of the notebook. The URL includes the authentication token and notebook file name and points directly to
     * the opened notebook.
     * </p>
     * 
     * @return The URL of the notebook. The URL includes the authentication token and notebook file name and points
     *         directly to the opened notebook.
     */

    public String getNotebookUrl() {
        return this.notebookUrl;
    }

    /**
     * <p>
     * The URL of the notebook. The URL includes the authentication token and notebook file name and points directly to
     * the opened notebook.
     * </p>
     * 
     * @param notebookUrl
     *        The URL of the notebook. The URL includes the authentication token and notebook file name and points
     *        directly to the opened notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedNotebookUrlResult withNotebookUrl(String notebookUrl) {
        setNotebookUrl(notebookUrl);
        return this;
    }

    /**
     * <p>
     * The authentication token for the notebook.
     * </p>
     * 
     * @param authToken
     *        The authentication token for the notebook.
     */

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * <p>
     * The authentication token for the notebook.
     * </p>
     * 
     * @return The authentication token for the notebook.
     */

    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * <p>
     * The authentication token for the notebook.
     * </p>
     * 
     * @param authToken
     *        The authentication token for the notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedNotebookUrlResult withAuthToken(String authToken) {
        setAuthToken(authToken);
        return this;
    }

    /**
     * <p>
     * The UTC epoch time when the authentication token expires.
     * </p>
     * 
     * @param authTokenExpirationTime
     *        The UTC epoch time when the authentication token expires.
     */

    public void setAuthTokenExpirationTime(Long authTokenExpirationTime) {
        this.authTokenExpirationTime = authTokenExpirationTime;
    }

    /**
     * <p>
     * The UTC epoch time when the authentication token expires.
     * </p>
     * 
     * @return The UTC epoch time when the authentication token expires.
     */

    public Long getAuthTokenExpirationTime() {
        return this.authTokenExpirationTime;
    }

    /**
     * <p>
     * The UTC epoch time when the authentication token expires.
     * </p>
     * 
     * @param authTokenExpirationTime
     *        The UTC epoch time when the authentication token expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresignedNotebookUrlResult withAuthTokenExpirationTime(Long authTokenExpirationTime) {
        setAuthTokenExpirationTime(authTokenExpirationTime);
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
        if (getNotebookUrl() != null)
            sb.append("NotebookUrl: ").append(getNotebookUrl()).append(",");
        if (getAuthToken() != null)
            sb.append("AuthToken: ").append(getAuthToken()).append(",");
        if (getAuthTokenExpirationTime() != null)
            sb.append("AuthTokenExpirationTime: ").append(getAuthTokenExpirationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresignedNotebookUrlResult == false)
            return false;
        CreatePresignedNotebookUrlResult other = (CreatePresignedNotebookUrlResult) obj;
        if (other.getNotebookUrl() == null ^ this.getNotebookUrl() == null)
            return false;
        if (other.getNotebookUrl() != null && other.getNotebookUrl().equals(this.getNotebookUrl()) == false)
            return false;
        if (other.getAuthToken() == null ^ this.getAuthToken() == null)
            return false;
        if (other.getAuthToken() != null && other.getAuthToken().equals(this.getAuthToken()) == false)
            return false;
        if (other.getAuthTokenExpirationTime() == null ^ this.getAuthTokenExpirationTime() == null)
            return false;
        if (other.getAuthTokenExpirationTime() != null && other.getAuthTokenExpirationTime().equals(this.getAuthTokenExpirationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookUrl() == null) ? 0 : getNotebookUrl().hashCode());
        hashCode = prime * hashCode + ((getAuthToken() == null) ? 0 : getAuthToken().hashCode());
        hashCode = prime * hashCode + ((getAuthTokenExpirationTime() == null) ? 0 : getAuthTokenExpirationTime().hashCode());
        return hashCode;
    }

    @Override
    public CreatePresignedNotebookUrlResult clone() {
        try {
            return (CreatePresignedNotebookUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
