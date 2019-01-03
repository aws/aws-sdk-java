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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that has this user assigned.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the
     * AWS Transfer service and perform file transfer tasks.
     * </p>
     */
    private String userName;

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

    public DescribeUserRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the
     * AWS Transfer service and perform file transfer tasks.
     * </p>
     * 
     * @param userName
     *        The name of the user assigned to one or more servers. User names are part of the sign-in credentials to
     *        use the AWS Transfer service and perform file transfer tasks.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the
     * AWS Transfer service and perform file transfer tasks.
     * </p>
     * 
     * @return The name of the user assigned to one or more servers. User names are part of the sign-in credentials to
     *         use the AWS Transfer service and perform file transfer tasks.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the
     * AWS Transfer service and perform file transfer tasks.
     * </p>
     * 
     * @param userName
     *        The name of the user assigned to one or more servers. User names are part of the sign-in credentials to
     *        use the AWS Transfer service and perform file transfer tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserRequest withUserName(String userName) {
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

        if (obj instanceof DescribeUserRequest == false)
            return false;
        DescribeUserRequest other = (DescribeUserRequest) obj;
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
    public DescribeUserRequest clone() {
        return (DescribeUserRequest) super.clone();
    }

}
