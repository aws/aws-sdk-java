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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using their SFTP client. An example is
     * <code>/home/<i>username</i> </code>.
     * </p>
     */
    private String homeDirectory;
    /**
     * <p>
     * A scope-down policy for your user so you can use the same IAM role across multiple users. This policy scopes down
     * user access to portions of their Amazon S3 bucket. Variables you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will
     * determine the level of access you want to provide your users when transferring files into and out of your Amazon
     * S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access
     * your resources when servicing your SFTP user's transfer requests.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you added
     * your user to.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
     * </p>
     */
    private String sshPublicKeyBody;
    /**
     * <p>
     * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any
     * purpose.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the <code>ServerId</code>.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using their SFTP client. An example is
     * <code>/home/<i>username</i> </code>.
     * </p>
     * 
     * @param homeDirectory
     *        The landing directory (folder) for a user when they log in to the server using their SFTP client. An
     *        example is <code>/home/<i>username</i> </code>.
     */

    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using their SFTP client. An example is
     * <code>/home/<i>username</i> </code>.
     * </p>
     * 
     * @return The landing directory (folder) for a user when they log in to the server using their SFTP client. An
     *         example is <code>/home/<i>username</i> </code>.
     */

    public String getHomeDirectory() {
        return this.homeDirectory;
    }

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using their SFTP client. An example is
     * <code>/home/<i>username</i> </code>.
     * </p>
     * 
     * @param homeDirectory
     *        The landing directory (folder) for a user when they log in to the server using their SFTP client. An
     *        example is <code>/home/<i>username</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withHomeDirectory(String homeDirectory) {
        setHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * <p>
     * A scope-down policy for your user so you can use the same IAM role across multiple users. This policy scopes down
     * user access to portions of their Amazon S3 bucket. Variables you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @param policy
     *        A scope-down policy for your user so you can use the same IAM role across multiple users. This policy
     *        scopes down user access to portions of their Amazon S3 bucket. Variables you can use inside this policy
     *        include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *        <code>${Transfer:HomeBucket}</code>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A scope-down policy for your user so you can use the same IAM role across multiple users. This policy scopes down
     * user access to portions of their Amazon S3 bucket. Variables you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @return A scope-down policy for your user so you can use the same IAM role across multiple users. This policy
     *         scopes down user access to portions of their Amazon S3 bucket. Variables you can use inside this policy
     *         include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *         <code>${Transfer:HomeBucket}</code>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A scope-down policy for your user so you can use the same IAM role across multiple users. This policy scopes down
     * user access to portions of their Amazon S3 bucket. Variables you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @param policy
     *        A scope-down policy for your user so you can use the same IAM role across multiple users. This policy
     *        scopes down user access to portions of their Amazon S3 bucket. Variables you can use inside this policy
     *        include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *        <code>${Transfer:HomeBucket}</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will
     * determine the level of access you want to provide your users when transferring files into and out of your Amazon
     * S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access
     * your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @param role
     *        The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role
     *        will determine the level of access you want to provide your users when transferring files into and out of
     *        your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the
     *        SFTP server to access your resources when servicing your SFTP user's transfer requests.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will
     * determine the level of access you want to provide your users when transferring files into and out of your Amazon
     * S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access
     * your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @return The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this
     *         role will determine the level of access you want to provide your users when transferring files into and
     *         out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that
     *         allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will
     * determine the level of access you want to provide your users when transferring files into and out of your Amazon
     * S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access
     * your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @param role
     *        The IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role
     *        will determine the level of access you want to provide your users when transferring files into and out of
     *        your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the
     *        SFTP server to access your resources when servicing your SFTP user's transfer requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you added
     * your user to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you
     *        added your user to.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you added
     * your user to.
     * </p>
     * 
     * @return A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that
     *         you added your user to.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you added
     * your user to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server instance. This is the specific SFTP server that you
     *        added your user to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
     * </p>
     * 
     * @param sshPublicKeyBody
     *        The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
     */

    public void setSshPublicKeyBody(String sshPublicKeyBody) {
        this.sshPublicKeyBody = sshPublicKeyBody;
    }

    /**
     * <p>
     * The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
     * </p>
     * 
     * @return The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
     */

    public String getSshPublicKeyBody() {
        return this.sshPublicKeyBody;
    }

    /**
     * <p>
     * The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
     * </p>
     * 
     * @param sshPublicKeyBody
     *        The public portion of the Secure Shall (SSH) key used to authenticate the user to the SFTP server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withSshPublicKeyBody(String sshPublicKeyBody) {
        setSshPublicKeyBody(sshPublicKeyBody);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any
     * purpose.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for
     *         any purpose.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any
     * purpose.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for
     *        any purpose.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any
     * purpose.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for
     *        any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any
     * purpose.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for
     *        any purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the <code>ServerId</code>.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user and is associated with a server as specified by the
     *        <code>ServerId</code>.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the <code>ServerId</code>.
     * </p>
     * 
     * @return A unique string that identifies a user and is associated with a server as specified by the
     *         <code>ServerId</code>.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the <code>ServerId</code>.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user and is associated with a server as specified by the
     *        <code>ServerId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUserName(String userName) {
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
        if (getSshPublicKeyBody() != null)
            sb.append("SshPublicKeyBody: ").append(getSshPublicKeyBody()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
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
        if (other.getSshPublicKeyBody() == null ^ this.getSshPublicKeyBody() == null)
            return false;
        if (other.getSshPublicKeyBody() != null && other.getSshPublicKeyBody().equals(this.getSshPublicKeyBody()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getSshPublicKeyBody() == null) ? 0 : getSshPublicKeyBody().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
