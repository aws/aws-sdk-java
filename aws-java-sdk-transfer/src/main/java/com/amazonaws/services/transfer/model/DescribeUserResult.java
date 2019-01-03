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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that has this user assigned.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * An array containing the properties of the user account for the <code>ServerID</code> value that you specified.
     * </p>
     */
    private DescribedUser user;

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that has this user assigned.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server that has this user assigned.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that has this user assigned.
     * </p>
     * 
     * @return A system-assigned unique identifier for an SFTP server that has this user assigned.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that has this user assigned.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server that has this user assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * An array containing the properties of the user account for the <code>ServerID</code> value that you specified.
     * </p>
     * 
     * @param user
     *        An array containing the properties of the user account for the <code>ServerID</code> value that you
     *        specified.
     */

    public void setUser(DescribedUser user) {
        this.user = user;
    }

    /**
     * <p>
     * An array containing the properties of the user account for the <code>ServerID</code> value that you specified.
     * </p>
     * 
     * @return An array containing the properties of the user account for the <code>ServerID</code> value that you
     *         specified.
     */

    public DescribedUser getUser() {
        return this.user;
    }

    /**
     * <p>
     * An array containing the properties of the user account for the <code>ServerID</code> value that you specified.
     * </p>
     * 
     * @param user
     *        An array containing the properties of the user account for the <code>ServerID</code> value that you
     *        specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withUser(DescribedUser user) {
        setUser(user);
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
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserResult == false)
            return false;
        DescribeUserResult other = (DescribeUserResult) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserResult clone() {
        try {
            return (DescribeUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
