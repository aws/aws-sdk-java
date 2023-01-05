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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Denotes the user's authentication properties, such as whether it requires a password to authenticate.
     * </p>
     */
    private AuthenticationMode authenticationMode;
    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     */
    private String accessString;

    /**
     * <p>
     * The name of the user
     * </p>
     * 
     * @param userName
     *        The name of the user
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user
     * </p>
     * 
     * @return The name of the user
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user
     * </p>
     * 
     * @param userName
     *        The name of the user
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Denotes the user's authentication properties, such as whether it requires a password to authenticate.
     * </p>
     * 
     * @param authenticationMode
     *        Denotes the user's authentication properties, such as whether it requires a password to authenticate.
     */

    public void setAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
    }

    /**
     * <p>
     * Denotes the user's authentication properties, such as whether it requires a password to authenticate.
     * </p>
     * 
     * @return Denotes the user's authentication properties, such as whether it requires a password to authenticate.
     */

    public AuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     * <p>
     * Denotes the user's authentication properties, such as whether it requires a password to authenticate.
     * </p>
     * 
     * @param authenticationMode
     *        Denotes the user's authentication properties, such as whether it requires a password to authenticate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withAuthenticationMode(AuthenticationMode authenticationMode) {
        setAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user.
     */

    public void setAccessString(String accessString) {
        this.accessString = accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @return Access permissions string used for this user.
     */

    public String getAccessString() {
        return this.accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withAccessString(String accessString) {
        setAccessString(accessString);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getAuthenticationMode() != null)
            sb.append("AuthenticationMode: ").append(getAuthenticationMode()).append(",");
        if (getAccessString() != null)
            sb.append("AccessString: ").append(getAccessString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAuthenticationMode() == null ^ this.getAuthenticationMode() == null)
            return false;
        if (other.getAuthenticationMode() != null && other.getAuthenticationMode().equals(this.getAuthenticationMode()) == false)
            return false;
        if (other.getAccessString() == null ^ this.getAccessString() == null)
            return false;
        if (other.getAccessString() != null && other.getAccessString().equals(this.getAccessString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationMode() == null) ? 0 : getAuthenticationMode().hashCode());
        hashCode = prime * hashCode + ((getAccessString() == null) ? 0 : getAccessString().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
