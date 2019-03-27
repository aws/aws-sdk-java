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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the server
     * using their client. An example would be: <code>/home/<i>username</i> </code>.
     * </p>
     */
    private String homeDirectory;
    /**
     * <p>
     * Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access Management
     * (IAM) role across multiple users. The policy scopes down users access to portions of your Amazon S3 bucket.
     * Variables you can use inside this policy include <code>${Transfer:UserName}</code>,
     * <code>${Transfer:HomeDirectory}</code>, and <code>${Transfer:HomeBucket}</code>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will
     * determine the level of access you want to provide your users when transferring files into and out of your Amazon
     * S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the Secure File Transfer
     * Protocol (SFTP) server to access your resources when servicing your SFTP user's transfer requests.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the ServerId. This is the
     * string that will be used by your user when they log in to your SFTP server.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the server
     * using their client. An example would be: <code>/home/<i>username</i> </code>.
     * </p>
     * 
     * @param homeDirectory
     *        The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the
     *        server using their client. An example would be: <code>/home/<i>username</i> </code>.
     */

    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the server
     * using their client. An example would be: <code>/home/<i>username</i> </code>.
     * </p>
     * 
     * @return The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the
     *         server using their client. An example would be: <code>/home/<i>username</i> </code>.
     */

    public String getHomeDirectory() {
        return this.homeDirectory;
    }

    /**
     * <p>
     * The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the server
     * using their client. An example would be: <code>/home/<i>username</i> </code>.
     * </p>
     * 
     * @param homeDirectory
     *        The HomeDirectory parameter specifies the landing directory (folder) for a user when they log in to the
     *        server using their client. An example would be: <code>/home/<i>username</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withHomeDirectory(String homeDirectory) {
        setHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * <p>
     * Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access Management
     * (IAM) role across multiple users. The policy scopes down users access to portions of your Amazon S3 bucket.
     * Variables you can use inside this policy include <code>${Transfer:UserName}</code>,
     * <code>${Transfer:HomeDirectory}</code>, and <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @param policy
     *        Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access
     *        Management (IAM) role across multiple users. The policy scopes down users access to portions of your
     *        Amazon S3 bucket. Variables you can use inside this policy include <code>${Transfer:UserName}</code>,
     *        <code>${Transfer:HomeDirectory}</code>, and <code>${Transfer:HomeBucket}</code>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access Management
     * (IAM) role across multiple users. The policy scopes down users access to portions of your Amazon S3 bucket.
     * Variables you can use inside this policy include <code>${Transfer:UserName}</code>,
     * <code>${Transfer:HomeDirectory}</code>, and <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @return Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access
     *         Management (IAM) role across multiple users. The policy scopes down users access to portions of your
     *         Amazon S3 bucket. Variables you can use inside this policy include <code>${Transfer:UserName}</code>,
     *         <code>${Transfer:HomeDirectory}</code>, and <code>${Transfer:HomeBucket}</code>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access Management
     * (IAM) role across multiple users. The policy scopes down users access to portions of your Amazon S3 bucket.
     * Variables you can use inside this policy include <code>${Transfer:UserName}</code>,
     * <code>${Transfer:HomeDirectory}</code>, and <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @param policy
     *        Allows you to supply a scope-down policy for your user so you can use the same AWS Identity and Access
     *        Management (IAM) role across multiple users. The policy scopes down users access to portions of your
     *        Amazon S3 bucket. Variables you can use inside this policy include <code>${Transfer:UserName}</code>,
     *        <code>${Transfer:HomeDirectory}</code>, and <code>${Transfer:HomeBucket}</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will
     * determine the level of access you want to provide your users when transferring files into and out of your Amazon
     * S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the Secure File Transfer
     * Protocol (SFTP) server to access your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @param role
     *        The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role
     *        will determine the level of access you want to provide your users when transferring files into and out of
     *        your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the
     *        Secure File Transfer Protocol (SFTP) server to access your resources when servicing your SFTP user's
     *        transfer requests.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will
     * determine the level of access you want to provide your users when transferring files into and out of your Amazon
     * S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the Secure File Transfer
     * Protocol (SFTP) server to access your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @return The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this
     *         role will determine the level of access you want to provide your users when transferring files into and
     *         out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that
     *         allows the Secure File Transfer Protocol (SFTP) server to access your resources when servicing your SFTP
     *         user's transfer requests.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will
     * determine the level of access you want to provide your users when transferring files into and out of your Amazon
     * S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the Secure File Transfer
     * Protocol (SFTP) server to access your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @param role
     *        The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role
     *        will determine the level of access you want to provide your users when transferring files into and out of
     *        your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the
     *        Secure File Transfer Protocol (SFTP) server to access your resources when servicing your SFTP user's
     *        transfer requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withRole(String role) {
        setRole(role);
        return this;
    }

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

    public UpdateUserRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the ServerId. This is the
     * string that will be used by your user when they log in to your SFTP server.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user and is associated with a server as specified by the ServerId. This
     *        is the string that will be used by your user when they log in to your SFTP server.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the ServerId. This is the
     * string that will be used by your user when they log in to your SFTP server.
     * </p>
     * 
     * @return A unique string that identifies a user and is associated with a server as specified by the ServerId. This
     *         is the string that will be used by your user when they log in to your SFTP server.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the ServerId. This is the
     * string that will be used by your user when they log in to your SFTP server.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user and is associated with a server as specified by the ServerId. This
     *        is the string that will be used by your user when they log in to your SFTP server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserName(String userName) {
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
        if (getHomeDirectory() != null)
            sb.append("HomeDirectory: ").append(getHomeDirectory()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
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

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getHomeDirectory() == null ^ this.getHomeDirectory() == null)
            return false;
        if (other.getHomeDirectory() != null && other.getHomeDirectory().equals(this.getHomeDirectory()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getHomeDirectory() == null) ? 0 : getHomeDirectory().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
