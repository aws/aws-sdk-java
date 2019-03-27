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
 * Returns properties of the user that you wish to describe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * This property specifies the landing directory (or folder) which is the location that files are written to or read
     * from in an Amazon S3 bucket for the described user. An example would be:
     * <code>/<i>bucket_name</i>/home/<i>username</i> </code>.
     * </p>
     */
    private String homeDirectory;
    /**
     * <p>
     * Specifies the name of the policy in use for the described user.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The policies
     * attached to this role will determine the level of access you want to provide your users when transferring files
     * into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that
     * allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
     * </p>
     */
    private String role;
    /**
     * <p>
     * This property contains the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     */
    private java.util.List<SshPublicKey> sshPublicKeys;
    /**
     * <p>
     * This property contains the key-value pairs for the user requested. Tag can be used to search for and group users
     * for a variety of purposes.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * This property is the name of the user that was requested to be described. User names are used for authentication
     * purposes. This is the string that will be used by your user when they log in to your SFTP server.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * </p>
     * 
     * @param arn
     *        This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be
     *        described.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * </p>
     * 
     * @return This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be
     *         described.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * </p>
     * 
     * @param arn
     *        This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be
     *        described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * This property specifies the landing directory (or folder) which is the location that files are written to or read
     * from in an Amazon S3 bucket for the described user. An example would be:
     * <code>/<i>bucket_name</i>/home/<i>username</i> </code>.
     * </p>
     * 
     * @param homeDirectory
     *        This property specifies the landing directory (or folder) which is the location that files are written to
     *        or read from in an Amazon S3 bucket for the described user. An example would be:
     *        <code>/<i>bucket_name</i>/home/<i>username</i> </code>.
     */

    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * This property specifies the landing directory (or folder) which is the location that files are written to or read
     * from in an Amazon S3 bucket for the described user. An example would be:
     * <code>/<i>bucket_name</i>/home/<i>username</i> </code>.
     * </p>
     * 
     * @return This property specifies the landing directory (or folder) which is the location that files are written to
     *         or read from in an Amazon S3 bucket for the described user. An example would be:
     *         <code>/<i>bucket_name</i>/home/<i>username</i> </code>.
     */

    public String getHomeDirectory() {
        return this.homeDirectory;
    }

    /**
     * <p>
     * This property specifies the landing directory (or folder) which is the location that files are written to or read
     * from in an Amazon S3 bucket for the described user. An example would be:
     * <code>/<i>bucket_name</i>/home/<i>username</i> </code>.
     * </p>
     * 
     * @param homeDirectory
     *        This property specifies the landing directory (or folder) which is the location that files are written to
     *        or read from in an Amazon S3 bucket for the described user. An example would be:
     *        <code>/<i>bucket_name</i>/home/<i>username</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withHomeDirectory(String homeDirectory) {
        setHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the policy in use for the described user.
     * </p>
     * 
     * @param policy
     *        Specifies the name of the policy in use for the described user.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Specifies the name of the policy in use for the described user.
     * </p>
     * 
     * @return Specifies the name of the policy in use for the described user.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * Specifies the name of the policy in use for the described user.
     * </p>
     * 
     * @param policy
     *        Specifies the name of the policy in use for the described user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The policies
     * attached to this role will determine the level of access you want to provide your users when transferring files
     * into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that
     * allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @param role
     *        This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The
     *        policies attached to this role will determine the level of access you want to provide your users when
     *        transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a
     *        trust relationship that allows the SFTP server to access your resources when servicing your SFTP user's
     *        transfer requests.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The policies
     * attached to this role will determine the level of access you want to provide your users when transferring files
     * into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that
     * allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @return This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The
     *         policies attached to this role will determine the level of access you want to provide your users when
     *         transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a
     *         trust relationship that allows the SFTP server to access your resources when servicing your SFTP user's
     *         transfer requests.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The policies
     * attached to this role will determine the level of access you want to provide your users when transferring files
     * into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that
     * allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
     * </p>
     * 
     * @param role
     *        This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The
     *        policies attached to this role will determine the level of access you want to provide your users when
     *        transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a
     *        trust relationship that allows the SFTP server to access your resources when servicing your SFTP user's
     *        transfer requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * This property contains the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     * 
     * @return This property contains the public key portion of the Secure Shell (SSH) keys stored for the described
     *         user.
     */

    public java.util.List<SshPublicKey> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * <p>
     * This property contains the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     * 
     * @param sshPublicKeys
     *        This property contains the public key portion of the Secure Shell (SSH) keys stored for the described
     *        user.
     */

    public void setSshPublicKeys(java.util.Collection<SshPublicKey> sshPublicKeys) {
        if (sshPublicKeys == null) {
            this.sshPublicKeys = null;
            return;
        }

        this.sshPublicKeys = new java.util.ArrayList<SshPublicKey>(sshPublicKeys);
    }

    /**
     * <p>
     * This property contains the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshPublicKeys(java.util.Collection)} or {@link #withSshPublicKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sshPublicKeys
     *        This property contains the public key portion of the Secure Shell (SSH) keys stored for the described
     *        user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withSshPublicKeys(SshPublicKey... sshPublicKeys) {
        if (this.sshPublicKeys == null) {
            setSshPublicKeys(new java.util.ArrayList<SshPublicKey>(sshPublicKeys.length));
        }
        for (SshPublicKey ele : sshPublicKeys) {
            this.sshPublicKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This property contains the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     * 
     * @param sshPublicKeys
     *        This property contains the public key portion of the Secure Shell (SSH) keys stored for the described
     *        user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withSshPublicKeys(java.util.Collection<SshPublicKey> sshPublicKeys) {
        setSshPublicKeys(sshPublicKeys);
        return this;
    }

    /**
     * <p>
     * This property contains the key-value pairs for the user requested. Tag can be used to search for and group users
     * for a variety of purposes.
     * </p>
     * 
     * @return This property contains the key-value pairs for the user requested. Tag can be used to search for and
     *         group users for a variety of purposes.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * This property contains the key-value pairs for the user requested. Tag can be used to search for and group users
     * for a variety of purposes.
     * </p>
     * 
     * @param tags
     *        This property contains the key-value pairs for the user requested. Tag can be used to search for and group
     *        users for a variety of purposes.
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
     * This property contains the key-value pairs for the user requested. Tag can be used to search for and group users
     * for a variety of purposes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        This property contains the key-value pairs for the user requested. Tag can be used to search for and group
     *        users for a variety of purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withTags(Tag... tags) {
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
     * This property contains the key-value pairs for the user requested. Tag can be used to search for and group users
     * for a variety of purposes.
     * </p>
     * 
     * @param tags
     *        This property contains the key-value pairs for the user requested. Tag can be used to search for and group
     *        users for a variety of purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * This property is the name of the user that was requested to be described. User names are used for authentication
     * purposes. This is the string that will be used by your user when they log in to your SFTP server.
     * </p>
     * 
     * @param userName
     *        This property is the name of the user that was requested to be described. User names are used for
     *        authentication purposes. This is the string that will be used by your user when they log in to your SFTP
     *        server.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * This property is the name of the user that was requested to be described. User names are used for authentication
     * purposes. This is the string that will be used by your user when they log in to your SFTP server.
     * </p>
     * 
     * @return This property is the name of the user that was requested to be described. User names are used for
     *         authentication purposes. This is the string that will be used by your user when they log in to your SFTP
     *         server.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * This property is the name of the user that was requested to be described. User names are used for authentication
     * purposes. This is the string that will be used by your user when they log in to your SFTP server.
     * </p>
     * 
     * @param userName
     *        This property is the name of the user that was requested to be described. User names are used for
     *        authentication purposes. This is the string that will be used by your user when they log in to your SFTP
     *        server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withUserName(String userName) {
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSshPublicKeys() != null)
            sb.append("SshPublicKeys: ").append(getSshPublicKeys()).append(",");
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

        if (obj instanceof DescribedUser == false)
            return false;
        DescribedUser other = (DescribedUser) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getSshPublicKeys() == null ^ this.getSshPublicKeys() == null)
            return false;
        if (other.getSshPublicKeys() != null && other.getSshPublicKeys().equals(this.getSshPublicKeys()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getHomeDirectory() == null) ? 0 : getHomeDirectory().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKeys() == null) ? 0 : getSshPublicKeys().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public DescribedUser clone() {
        try {
            return (DescribedUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
