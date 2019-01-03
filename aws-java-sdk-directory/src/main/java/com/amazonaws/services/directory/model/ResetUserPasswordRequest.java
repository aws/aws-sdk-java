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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ResetUserPassword" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetUserPasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The user name of the user whose password will be reset.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The new password that will be reset.
     * </p>
     */
    private String newPassword;

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
     * </p>
     * 
     * @return Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetUserPasswordRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The user name of the user whose password will be reset.
     * </p>
     * 
     * @param userName
     *        The user name of the user whose password will be reset.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name of the user whose password will be reset.
     * </p>
     * 
     * @return The user name of the user whose password will be reset.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user name of the user whose password will be reset.
     * </p>
     * 
     * @param userName
     *        The user name of the user whose password will be reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetUserPasswordRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The new password that will be reset.
     * </p>
     * 
     * @param newPassword
     *        The new password that will be reset.
     */

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * <p>
     * The new password that will be reset.
     * </p>
     * 
     * @return The new password that will be reset.
     */

    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * <p>
     * The new password that will be reset.
     * </p>
     * 
     * @param newPassword
     *        The new password that will be reset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetUserPasswordRequest withNewPassword(String newPassword) {
        setNewPassword(newPassword);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getNewPassword() != null)
            sb.append("NewPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetUserPasswordRequest == false)
            return false;
        ResetUserPasswordRequest other = (ResetUserPasswordRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getNewPassword() == null ^ this.getNewPassword() == null)
            return false;
        if (other.getNewPassword() != null && other.getNewPassword().equals(this.getNewPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getNewPassword() == null) ? 0 : getNewPassword().hashCode());
        return hashCode;
    }

    @Override
    public ResetUserPasswordRequest clone() {
        return (ResetUserPasswordRequest) super.clone();
    }

}
