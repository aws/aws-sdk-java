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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ResetPassword" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetPasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the organization that contains the user for which the password is reset.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier of the user for whom the password is reset.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The new password for the user.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The identifier of the organization that contains the user for which the password is reset.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization that contains the user for which the password is reset.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the organization that contains the user for which the password is reset.
     * </p>
     * 
     * @return The identifier of the organization that contains the user for which the password is reset.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier of the organization that contains the user for which the password is reset.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization that contains the user for which the password is reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetPasswordRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user for whom the password is reset.
     * </p>
     * 
     * @param userId
     *        The identifier of the user for whom the password is reset.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user for whom the password is reset.
     * </p>
     * 
     * @return The identifier of the user for whom the password is reset.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user for whom the password is reset.
     * </p>
     * 
     * @param userId
     *        The identifier of the user for whom the password is reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetPasswordRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * 
     * @param password
     *        The new password for the user.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * 
     * @return The new password for the user.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * 
     * @param password
     *        The new password for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetPasswordRequest withPassword(String password) {
        setPassword(password);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetPasswordRequest == false)
            return false;
        ResetPasswordRequest other = (ResetPasswordRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public ResetPasswordRequest clone() {
        return (ResetPasswordRequest) super.clone();
    }

}
