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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address of the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     */
    private String authenticationType;

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @param userName
     *        The email address of the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @return The email address of the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @param userName
     *        The email address of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user. You must specify USERPOOL.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     * 
     * @return The authentication type for the user. You must specify USERPOOL.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user. You must specify USERPOOL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public DeleteUserRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user. You must specify USERPOOL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public DeleteUserRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
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
            sb.append("UserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUserRequest == false)
            return false;
        DeleteUserRequest other = (DeleteUserRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUserRequest clone() {
        return (DeleteUserRequest) super.clone();
    }

}
