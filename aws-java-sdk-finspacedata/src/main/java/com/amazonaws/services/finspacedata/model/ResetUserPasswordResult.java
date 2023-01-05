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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ResetUserPassword" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetUserPasswordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the user that a new password is generated for.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * A randomly generated temporary password for the requested user account. This password expires in 7 days.
     * </p>
     */
    private String temporaryPassword;

    /**
     * <p>
     * The unique identifier of the user that a new password is generated for.
     * </p>
     * 
     * @param userId
     *        The unique identifier of the user that a new password is generated for.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier of the user that a new password is generated for.
     * </p>
     * 
     * @return The unique identifier of the user that a new password is generated for.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique identifier of the user that a new password is generated for.
     * </p>
     * 
     * @param userId
     *        The unique identifier of the user that a new password is generated for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetUserPasswordResult withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * A randomly generated temporary password for the requested user account. This password expires in 7 days.
     * </p>
     * 
     * @param temporaryPassword
     *        A randomly generated temporary password for the requested user account. This password expires in 7 days.
     */

    public void setTemporaryPassword(String temporaryPassword) {
        this.temporaryPassword = temporaryPassword;
    }

    /**
     * <p>
     * A randomly generated temporary password for the requested user account. This password expires in 7 days.
     * </p>
     * 
     * @return A randomly generated temporary password for the requested user account. This password expires in 7 days.
     */

    public String getTemporaryPassword() {
        return this.temporaryPassword;
    }

    /**
     * <p>
     * A randomly generated temporary password for the requested user account. This password expires in 7 days.
     * </p>
     * 
     * @param temporaryPassword
     *        A randomly generated temporary password for the requested user account. This password expires in 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetUserPasswordResult withTemporaryPassword(String temporaryPassword) {
        setTemporaryPassword(temporaryPassword);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getTemporaryPassword() != null)
            sb.append("TemporaryPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetUserPasswordResult == false)
            return false;
        ResetUserPasswordResult other = (ResetUserPasswordResult) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getTemporaryPassword() == null ^ this.getTemporaryPassword() == null)
            return false;
        if (other.getTemporaryPassword() != null && other.getTemporaryPassword().equals(this.getTemporaryPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getTemporaryPassword() == null) ? 0 : getTemporaryPassword().hashCode());
        return hashCode;
    }

    @Override
    public ResetUserPasswordResult clone() {
        try {
            return (ResetUserPasswordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
