/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the properties of a user that was specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using the client.
     * </p>
     * <p>
     * A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * </p>
     */
    private String homeDirectory;
    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to lock your user down to the designated
     * home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set
     * <code>Target</code> to the HomeDirectory parameter value.
     * </p>
     */
    private java.util.List<HomeDirectoryMapEntry> homeDirectoryMappings;
    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     */
    private String homeDirectoryType;
    /**
     * <p>
     * A scope-down policy for your user so that you can use the same IAM role across multiple users. This policy scopes
     * down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any
     * secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon Elastic File
     * System (Amazon EFS) file systems. The POSIX permissions that are set on files and directories in your file system
     * determine the level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     * </p>
     */
    private PosixProfile posixProfile;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon S3
     * bucket or EFS file system. The policies attached to this role determine the level of access that you want to
     * provide your users when transferring files into and out of your Amazon S3 bucket or EFS file system. The IAM role
     * should also contain a trust relationship that allows the server to access your resources when servicing your
     * users' transfer requests.
     * </p>
     */
    private String role;
    /**
     * <p>
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     */
    private java.util.List<SshPublicKey> sshPublicKeys;
    /**
     * <p>
     * Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a variety
     * of purposes.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies the name of the user that was requested to be described. User names are used for authentication
     * purposes. This is the string that will be used by your user when they log in to your server.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using the client.
     * </p>
     * <p>
     * A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * </p>
     * 
     * @param homeDirectory
     *        The landing directory (folder) for a user when they log in to the server using the client.</p>
     *        <p>
     *        A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     */

    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using the client.
     * </p>
     * <p>
     * A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * </p>
     * 
     * @return The landing directory (folder) for a user when they log in to the server using the client.</p>
     *         <p>
     *         A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     */

    public String getHomeDirectory() {
        return this.homeDirectory;
    }

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using the client.
     * </p>
     * <p>
     * A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * </p>
     * 
     * @param homeDirectory
     *        The landing directory (folder) for a user when they log in to the server using the client.</p>
     *        <p>
     *        A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withHomeDirectory(String homeDirectory) {
        setHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to lock your user down to the designated
     * home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set
     * <code>Target</code> to the HomeDirectory parameter value.
     * </p>
     * 
     * @return Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to
     *         your user and how you want to make them visible. You must specify the <code>Entry</code> and
     *         <code>Target</code> pair, where <code>Entry</code> shows how the path is made visible and
     *         <code>Target</code> is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is
     *         displayed as is. You also must ensure that your Amazon Web Services Identity and Access Management (IAM)
     *         role provides access to paths in <code>Target</code>. This value can only be set when
     *         <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.</p>
     *         <p>
     *         In most cases, you can use this value instead of the scope-down policy to lock your user down to the
     *         designated home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and
     *         set <code>Target</code> to the HomeDirectory parameter value.
     */

    public java.util.List<HomeDirectoryMapEntry> getHomeDirectoryMappings() {
        return homeDirectoryMappings;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to lock your user down to the designated
     * home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set
     * <code>Target</code> to the HomeDirectory parameter value.
     * </p>
     * 
     * @param homeDirectoryMappings
     *        Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to
     *        your user and how you want to make them visible. You must specify the <code>Entry</code> and
     *        <code>Target</code> pair, where <code>Entry</code> shows how the path is made visible and
     *        <code>Target</code> is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is
     *        displayed as is. You also must ensure that your Amazon Web Services Identity and Access Management (IAM)
     *        role provides access to paths in <code>Target</code>. This value can only be set when
     *        <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.</p>
     *        <p>
     *        In most cases, you can use this value instead of the scope-down policy to lock your user down to the
     *        designated home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and
     *        set <code>Target</code> to the HomeDirectory parameter value.
     */

    public void setHomeDirectoryMappings(java.util.Collection<HomeDirectoryMapEntry> homeDirectoryMappings) {
        if (homeDirectoryMappings == null) {
            this.homeDirectoryMappings = null;
            return;
        }

        this.homeDirectoryMappings = new java.util.ArrayList<HomeDirectoryMapEntry>(homeDirectoryMappings);
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to lock your user down to the designated
     * home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set
     * <code>Target</code> to the HomeDirectory parameter value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHomeDirectoryMappings(java.util.Collection)} or
     * {@link #withHomeDirectoryMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param homeDirectoryMappings
     *        Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to
     *        your user and how you want to make them visible. You must specify the <code>Entry</code> and
     *        <code>Target</code> pair, where <code>Entry</code> shows how the path is made visible and
     *        <code>Target</code> is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is
     *        displayed as is. You also must ensure that your Amazon Web Services Identity and Access Management (IAM)
     *        role provides access to paths in <code>Target</code>. This value can only be set when
     *        <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.</p>
     *        <p>
     *        In most cases, you can use this value instead of the scope-down policy to lock your user down to the
     *        designated home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and
     *        set <code>Target</code> to the HomeDirectory parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withHomeDirectoryMappings(HomeDirectoryMapEntry... homeDirectoryMappings) {
        if (this.homeDirectoryMappings == null) {
            setHomeDirectoryMappings(new java.util.ArrayList<HomeDirectoryMapEntry>(homeDirectoryMappings.length));
        }
        for (HomeDirectoryMapEntry ele : homeDirectoryMappings) {
            this.homeDirectoryMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to lock your user down to the designated
     * home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set
     * <code>Target</code> to the HomeDirectory parameter value.
     * </p>
     * 
     * @param homeDirectoryMappings
     *        Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to
     *        your user and how you want to make them visible. You must specify the <code>Entry</code> and
     *        <code>Target</code> pair, where <code>Entry</code> shows how the path is made visible and
     *        <code>Target</code> is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is
     *        displayed as is. You also must ensure that your Amazon Web Services Identity and Access Management (IAM)
     *        role provides access to paths in <code>Target</code>. This value can only be set when
     *        <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.</p>
     *        <p>
     *        In most cases, you can use this value instead of the scope-down policy to lock your user down to the
     *        designated home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and
     *        set <code>Target</code> to the HomeDirectory parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withHomeDirectoryMappings(java.util.Collection<HomeDirectoryMapEntry> homeDirectoryMappings) {
        setHomeDirectoryMappings(homeDirectoryMappings);
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) you want your users' home directory to be when they log into the
     *        server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths
     *        as is in their file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to
     *        provide mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths
     *        visible to your users.
     * @see HomeDirectoryType
     */

    public void setHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     * 
     * @return The type of landing directory (folder) you want your users' home directory to be when they log into the
     *         server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths
     *         as is in their file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to
     *         provide mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS
     *         paths visible to your users.
     * @see HomeDirectoryType
     */

    public String getHomeDirectoryType() {
        return this.homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) you want your users' home directory to be when they log into the
     *        server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths
     *        as is in their file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to
     *        provide mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths
     *        visible to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HomeDirectoryType
     */

    public DescribedUser withHomeDirectoryType(String homeDirectoryType) {
        setHomeDirectoryType(homeDirectoryType);
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) you want your users' home directory to be when they log into the
     *        server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths
     *        as is in their file transfer protocol clients. If you set it <code>LOGICAL</code>, you will need to
     *        provide mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths
     *        visible to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HomeDirectoryType
     */

    public DescribedUser withHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
        return this;
    }

    /**
     * <p>
     * A scope-down policy for your user so that you can use the same IAM role across multiple users. This policy scopes
     * down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @param policy
     *        A scope-down policy for your user so that you can use the same IAM role across multiple users. This policy
     *        scopes down user access to portions of their Amazon S3 bucket. Variables that you can use inside this
     *        policy include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *        <code>${Transfer:HomeBucket}</code>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A scope-down policy for your user so that you can use the same IAM role across multiple users. This policy scopes
     * down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @return A scope-down policy for your user so that you can use the same IAM role across multiple users. This
     *         policy scopes down user access to portions of their Amazon S3 bucket. Variables that you can use inside
     *         this policy include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *         <code>${Transfer:HomeBucket}</code>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A scope-down policy for your user so that you can use the same IAM role across multiple users. This policy scopes
     * down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * 
     * @param policy
     *        A scope-down policy for your user so that you can use the same IAM role across multiple users. This policy
     *        scopes down user access to portions of their Amazon S3 bucket. Variables that you can use inside this
     *        policy include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *        <code>${Transfer:HomeBucket}</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any
     * secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon Elastic File
     * System (Amazon EFS) file systems. The POSIX permissions that are set on files and directories in your file system
     * determine the level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     * </p>
     * 
     * @param posixProfile
     *        Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and
     *        any secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon
     *        Elastic File System (Amazon EFS) file systems. The POSIX permissions that are set on files and directories
     *        in your file system determine the level of access your users get when transferring files into and out of
     *        your Amazon EFS file systems.
     */

    public void setPosixProfile(PosixProfile posixProfile) {
        this.posixProfile = posixProfile;
    }

    /**
     * <p>
     * Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any
     * secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon Elastic File
     * System (Amazon EFS) file systems. The POSIX permissions that are set on files and directories in your file system
     * determine the level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     * </p>
     * 
     * @return Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and
     *         any secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon
     *         Elastic File System (Amazon EFS) file systems. The POSIX permissions that are set on files and
     *         directories in your file system determine the level of access your users get when transferring files into
     *         and out of your Amazon EFS file systems.
     */

    public PosixProfile getPosixProfile() {
        return this.posixProfile;
    }

    /**
     * <p>
     * Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any
     * secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon Elastic File
     * System (Amazon EFS) file systems. The POSIX permissions that are set on files and directories in your file system
     * determine the level of access your users get when transferring files into and out of your Amazon EFS file
     * systems.
     * </p>
     * 
     * @param posixProfile
     *        Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and
     *        any secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon
     *        Elastic File System (Amazon EFS) file systems. The POSIX permissions that are set on files and directories
     *        in your file system determine the level of access your users get when transferring files into and out of
     *        your Amazon EFS file systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withPosixProfile(PosixProfile posixProfile) {
        setPosixProfile(posixProfile);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon S3
     * bucket or EFS file system. The policies attached to this role determine the level of access that you want to
     * provide your users when transferring files into and out of your Amazon S3 bucket or EFS file system. The IAM role
     * should also contain a trust relationship that allows the server to access your resources when servicing your
     * users' transfer requests.
     * </p>
     * 
     * @param role
     *        Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon
     *        S3 bucket or EFS file system. The policies attached to this role determine the level of access that you
     *        want to provide your users when transferring files into and out of your Amazon S3 bucket or EFS file
     *        system. The IAM role should also contain a trust relationship that allows the server to access your
     *        resources when servicing your users' transfer requests.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon S3
     * bucket or EFS file system. The policies attached to this role determine the level of access that you want to
     * provide your users when transferring files into and out of your Amazon S3 bucket or EFS file system. The IAM role
     * should also contain a trust relationship that allows the server to access your resources when servicing your
     * users' transfer requests.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon
     *         S3 bucket or EFS file system. The policies attached to this role determine the level of access that you
     *         want to provide your users when transferring files into and out of your Amazon S3 bucket or EFS file
     *         system. The IAM role should also contain a trust relationship that allows the server to access your
     *         resources when servicing your users' transfer requests.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon S3
     * bucket or EFS file system. The policies attached to this role determine the level of access that you want to
     * provide your users when transferring files into and out of your Amazon S3 bucket or EFS file system. The IAM role
     * should also contain a trust relationship that allows the server to access your resources when servicing your
     * users' transfer requests.
     * </p>
     * 
     * @param role
     *        Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon
     *        S3 bucket or EFS file system. The policies attached to this role determine the level of access that you
     *        want to provide your users when transferring files into and out of your Amazon S3 bucket or EFS file
     *        system. The IAM role should also contain a trust relationship that allows the server to access your
     *        resources when servicing your users' transfer requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     * 
     * @return Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
     */

    public java.util.List<SshPublicKey> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * <p>
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     * 
     * @param sshPublicKeys
     *        Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
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
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSshPublicKeys(java.util.Collection)} or {@link #withSshPublicKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sshPublicKeys
     *        Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
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
     * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * </p>
     * 
     * @param sshPublicKeys
     *        Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withSshPublicKeys(java.util.Collection<SshPublicKey> sshPublicKeys) {
        setSshPublicKeys(sshPublicKeys);
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a variety
     * of purposes.
     * </p>
     * 
     * @return Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a
     *         variety of purposes.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a variety
     * of purposes.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a
     *        variety of purposes.
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
     * Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a variety
     * of purposes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a
     *        variety of purposes.
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
     * Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a variety
     * of purposes.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a
     *        variety of purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedUser withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the user that was requested to be described. User names are used for authentication
     * purposes. This is the string that will be used by your user when they log in to your server.
     * </p>
     * 
     * @param userName
     *        Specifies the name of the user that was requested to be described. User names are used for authentication
     *        purposes. This is the string that will be used by your user when they log in to your server.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Specifies the name of the user that was requested to be described. User names are used for authentication
     * purposes. This is the string that will be used by your user when they log in to your server.
     * </p>
     * 
     * @return Specifies the name of the user that was requested to be described. User names are used for authentication
     *         purposes. This is the string that will be used by your user when they log in to your server.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * Specifies the name of the user that was requested to be described. User names are used for authentication
     * purposes. This is the string that will be used by your user when they log in to your server.
     * </p>
     * 
     * @param userName
     *        Specifies the name of the user that was requested to be described. User names are used for authentication
     *        purposes. This is the string that will be used by your user when they log in to your server.
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
        if (getHomeDirectoryMappings() != null)
            sb.append("HomeDirectoryMappings: ").append(getHomeDirectoryMappings()).append(",");
        if (getHomeDirectoryType() != null)
            sb.append("HomeDirectoryType: ").append(getHomeDirectoryType()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getPosixProfile() != null)
            sb.append("PosixProfile: ").append(getPosixProfile()).append(",");
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
        if (other.getHomeDirectoryMappings() == null ^ this.getHomeDirectoryMappings() == null)
            return false;
        if (other.getHomeDirectoryMappings() != null && other.getHomeDirectoryMappings().equals(this.getHomeDirectoryMappings()) == false)
            return false;
        if (other.getHomeDirectoryType() == null ^ this.getHomeDirectoryType() == null)
            return false;
        if (other.getHomeDirectoryType() != null && other.getHomeDirectoryType().equals(this.getHomeDirectoryType()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getPosixProfile() == null ^ this.getPosixProfile() == null)
            return false;
        if (other.getPosixProfile() != null && other.getPosixProfile().equals(this.getPosixProfile()) == false)
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
        hashCode = prime * hashCode + ((getHomeDirectoryMappings() == null) ? 0 : getHomeDirectoryMappings().hashCode());
        hashCode = prime * hashCode + ((getHomeDirectoryType() == null) ? 0 : getHomeDirectoryType().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPosixProfile() == null) ? 0 : getPosixProfile().hashCode());
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
