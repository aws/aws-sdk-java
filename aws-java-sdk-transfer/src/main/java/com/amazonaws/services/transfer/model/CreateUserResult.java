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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the SFTP server that the user is attached to.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * A unique string that identifies a user account associated with an SFTP server.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The ID of the SFTP server that the user is attached to.
     * </p>
     * 
     * @param serverId
     *        The ID of the SFTP server that the user is attached to.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The ID of the SFTP server that the user is attached to.
     * </p>
     * 
     * @return The ID of the SFTP server that the user is attached to.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The ID of the SFTP server that the user is attached to.
     * </p>
     * 
     * @param serverId
     *        The ID of the SFTP server that the user is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies a user account associated with an SFTP server.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user account associated with an SFTP server.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A unique string that identifies a user account associated with an SFTP server.
     * </p>
     * 
     * @return A unique string that identifies a user account associated with an SFTP server.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * A unique string that identifies a user account associated with an SFTP server.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user account associated with an SFTP server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withUserName(String userName) {
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

        if (obj instanceof CreateUserResult == false)
            return false;
        CreateUserResult other = (CreateUserResult) obj;
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
    public CreateUserResult clone() {
        try {
            return (CreateUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
