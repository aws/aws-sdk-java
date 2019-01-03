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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * <code>UpdateUserResponse</code> returns the user name and server identifier for the request to update a user's
 * properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The unique identifier for a user that is assigned to the SFTP server instance that was specified in the request.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     * 
     * @return A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a user that is assigned to the SFTP server instance that was specified in the request.
     * </p>
     * 
     * @param userName
     *        The unique identifier for a user that is assigned to the SFTP server instance that was specified in the
     *        request.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The unique identifier for a user that is assigned to the SFTP server instance that was specified in the request.
     * </p>
     * 
     * @return The unique identifier for a user that is assigned to the SFTP server instance that was specified in the
     *         request.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The unique identifier for a user that is assigned to the SFTP server instance that was specified in the request.
     * </p>
     * 
     * @param userName
     *        The unique identifier for a user that is assigned to the SFTP server instance that was specified in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserResult withUserName(String userName) {
        setUserName(userName);
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserResult == false)
            return false;
        UpdateUserResult other = (UpdateUserResult) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserResult clone() {
        try {
            return (UpdateUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
