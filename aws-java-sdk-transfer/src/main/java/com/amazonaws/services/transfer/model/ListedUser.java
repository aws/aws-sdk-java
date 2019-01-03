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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns properties of the user that you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This property is the unique Amazon Resource Name (ARN) for the user that you wish to learn about.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * This value specifies the location that files are written to or read from an Amazon S3 bucket for the user you
     * specify by their ARN.
     * </p>
     */
    private String homeDirectory;
    /**
     * <p>
     * The role in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM) entity that in this
     * case allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust relationship
     * that enables that user to perform file operations to their Amazon S3 bucket.
     * </p>
     */
    private String role;
    /**
     * <p>
     * This value is the number of SSH public keys stored for the user you specified.
     * </p>
     */
    private Integer sshPublicKeyCount;
    /**
     * <p>
     * The name of the user whose ARN was specified. User names are used for authentication purposes.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * This property is the unique Amazon Resource Name (ARN) for the user that you wish to learn about.
     * </p>
     * 
     * @param arn
     *        This property is the unique Amazon Resource Name (ARN) for the user that you wish to learn about.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * This property is the unique Amazon Resource Name (ARN) for the user that you wish to learn about.
     * </p>
     * 
     * @return This property is the unique Amazon Resource Name (ARN) for the user that you wish to learn about.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * This property is the unique Amazon Resource Name (ARN) for the user that you wish to learn about.
     * </p>
     * 
     * @param arn
     *        This property is the unique Amazon Resource Name (ARN) for the user that you wish to learn about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * This value specifies the location that files are written to or read from an Amazon S3 bucket for the user you
     * specify by their ARN.
     * </p>
     * 
     * @param homeDirectory
     *        This value specifies the location that files are written to or read from an Amazon S3 bucket for the user
     *        you specify by their ARN.
     */

    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * This value specifies the location that files are written to or read from an Amazon S3 bucket for the user you
     * specify by their ARN.
     * </p>
     * 
     * @return This value specifies the location that files are written to or read from an Amazon S3 bucket for the user
     *         you specify by their ARN.
     */

    public String getHomeDirectory() {
        return this.homeDirectory;
    }

    /**
     * <p>
     * This value specifies the location that files are written to or read from an Amazon S3 bucket for the user you
     * specify by their ARN.
     * </p>
     * 
     * @param homeDirectory
     *        This value specifies the location that files are written to or read from an Amazon S3 bucket for the user
     *        you specify by their ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withHomeDirectory(String homeDirectory) {
        setHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * <p>
     * The role in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM) entity that in this
     * case allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust relationship
     * that enables that user to perform file operations to their Amazon S3 bucket.
     * </p>
     * 
     * @param role
     *        The role in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM) entity that in
     *        this case allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust
     *        relationship that enables that user to perform file operations to their Amazon S3 bucket.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM) entity that in this
     * case allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust relationship
     * that enables that user to perform file operations to their Amazon S3 bucket.
     * </p>
     * 
     * @return The role in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM) entity that in
     *         this case allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust
     *         relationship that enables that user to perform file operations to their Amazon S3 bucket.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM) entity that in this
     * case allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust relationship
     * that enables that user to perform file operations to their Amazon S3 bucket.
     * </p>
     * 
     * @param role
     *        The role in use by this user. A <i>role</i> is an AWS Identity and Access Management (IAM) entity that in
     *        this case allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust
     *        relationship that enables that user to perform file operations to their Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * This value is the number of SSH public keys stored for the user you specified.
     * </p>
     * 
     * @param sshPublicKeyCount
     *        This value is the number of SSH public keys stored for the user you specified.
     */

    public void setSshPublicKeyCount(Integer sshPublicKeyCount) {
        this.sshPublicKeyCount = sshPublicKeyCount;
    }

    /**
     * <p>
     * This value is the number of SSH public keys stored for the user you specified.
     * </p>
     * 
     * @return This value is the number of SSH public keys stored for the user you specified.
     */

    public Integer getSshPublicKeyCount() {
        return this.sshPublicKeyCount;
    }

    /**
     * <p>
     * This value is the number of SSH public keys stored for the user you specified.
     * </p>
     * 
     * @param sshPublicKeyCount
     *        This value is the number of SSH public keys stored for the user you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withSshPublicKeyCount(Integer sshPublicKeyCount) {
        setSshPublicKeyCount(sshPublicKeyCount);
        return this;
    }

    /**
     * <p>
     * The name of the user whose ARN was specified. User names are used for authentication purposes.
     * </p>
     * 
     * @param userName
     *        The name of the user whose ARN was specified. User names are used for authentication purposes.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user whose ARN was specified. User names are used for authentication purposes.
     * </p>
     * 
     * @return The name of the user whose ARN was specified. User names are used for authentication purposes.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user whose ARN was specified. User names are used for authentication purposes.
     * </p>
     * 
     * @param userName
     *        The name of the user whose ARN was specified. User names are used for authentication purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedUser withUserName(String userName) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getHomeDirectory() != null)
            sb.append("HomeDirectory: ").append(getHomeDirectory()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSshPublicKeyCount() != null)
            sb.append("SshPublicKeyCount: ").append(getSshPublicKeyCount()).append(",");
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

        if (obj instanceof ListedUser == false)
            return false;
        ListedUser other = (ListedUser) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getHomeDirectory() == null ^ this.getHomeDirectory() == null)
            return false;
        if (other.getHomeDirectory() != null && other.getHomeDirectory().equals(this.getHomeDirectory()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSshPublicKeyCount() == null ^ this.getSshPublicKeyCount() == null)
            return false;
        if (other.getSshPublicKeyCount() != null && other.getSshPublicKeyCount().equals(this.getSshPublicKeyCount()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getHomeDirectory() == null) ? 0 : getHomeDirectory().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKeyCount() == null) ? 0 : getSshPublicKeyCount().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public ListedUser clone() {
        try {
            return (ListedUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
