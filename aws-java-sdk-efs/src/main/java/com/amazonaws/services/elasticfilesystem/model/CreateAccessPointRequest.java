/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateAccessPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Creates tags associated with the access point. Each tag is a key-value pair.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the EFS file system that the access point provides access to.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The operating system user and group applied to all file system requests made using the access point.
     * </p>
     */
    private PosixUser posixUser;
    /**
     * <p>
     * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your
     * file system to NFS clients using the access point. The clients using the access point can only access the root
     * directory and below. If the <code>RootDirectory</code> &gt; <code>Path</code> specified does not exist, EFS
     * creates it and applies the <code>CreationInfo</code> settings when a client connects to an access point. When
     * specifying a <code>RootDirectory</code>, you need to provide the <code>Path</code>, and the
     * <code>CreationInfo</code> is optional.
     * </p>
     */
    private RootDirectory rootDirectory;

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * </p>
     * 
     * @param clientToken
     *        A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * </p>
     * 
     * @return A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * </p>
     * 
     * @param clientToken
     *        A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Creates tags associated with the access point. Each tag is a key-value pair.
     * </p>
     * 
     * @return Creates tags associated with the access point. Each tag is a key-value pair.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Creates tags associated with the access point. Each tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        Creates tags associated with the access point. Each tag is a key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Creates tags associated with the access point. Each tag is a key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Creates tags associated with the access point. Each tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Creates tags associated with the access point. Each tag is a key-value pair.
     * </p>
     * 
     * @param tags
     *        Creates tags associated with the access point. Each tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point provides access to.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the EFS file system that the access point provides access to.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point provides access to.
     * </p>
     * 
     * @return The ID of the EFS file system that the access point provides access to.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point provides access to.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the EFS file system that the access point provides access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The operating system user and group applied to all file system requests made using the access point.
     * </p>
     * 
     * @param posixUser
     *        The operating system user and group applied to all file system requests made using the access point.
     */

    public void setPosixUser(PosixUser posixUser) {
        this.posixUser = posixUser;
    }

    /**
     * <p>
     * The operating system user and group applied to all file system requests made using the access point.
     * </p>
     * 
     * @return The operating system user and group applied to all file system requests made using the access point.
     */

    public PosixUser getPosixUser() {
        return this.posixUser;
    }

    /**
     * <p>
     * The operating system user and group applied to all file system requests made using the access point.
     * </p>
     * 
     * @param posixUser
     *        The operating system user and group applied to all file system requests made using the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withPosixUser(PosixUser posixUser) {
        setPosixUser(posixUser);
        return this;
    }

    /**
     * <p>
     * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your
     * file system to NFS clients using the access point. The clients using the access point can only access the root
     * directory and below. If the <code>RootDirectory</code> &gt; <code>Path</code> specified does not exist, EFS
     * creates it and applies the <code>CreationInfo</code> settings when a client connects to an access point. When
     * specifying a <code>RootDirectory</code>, you need to provide the <code>Path</code>, and the
     * <code>CreationInfo</code> is optional.
     * </p>
     * 
     * @param rootDirectory
     *        Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory
     *        of your file system to NFS clients using the access point. The clients using the access point can only
     *        access the root directory and below. If the <code>RootDirectory</code> &gt; <code>Path</code> specified
     *        does not exist, EFS creates it and applies the <code>CreationInfo</code> settings when a client connects
     *        to an access point. When specifying a <code>RootDirectory</code>, you need to provide the
     *        <code>Path</code>, and the <code>CreationInfo</code> is optional.
     */

    public void setRootDirectory(RootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * <p>
     * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your
     * file system to NFS clients using the access point. The clients using the access point can only access the root
     * directory and below. If the <code>RootDirectory</code> &gt; <code>Path</code> specified does not exist, EFS
     * creates it and applies the <code>CreationInfo</code> settings when a client connects to an access point. When
     * specifying a <code>RootDirectory</code>, you need to provide the <code>Path</code>, and the
     * <code>CreationInfo</code> is optional.
     * </p>
     * 
     * @return Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory
     *         of your file system to NFS clients using the access point. The clients using the access point can only
     *         access the root directory and below. If the <code>RootDirectory</code> &gt; <code>Path</code> specified
     *         does not exist, EFS creates it and applies the <code>CreationInfo</code> settings when a client connects
     *         to an access point. When specifying a <code>RootDirectory</code>, you need to provide the
     *         <code>Path</code>, and the <code>CreationInfo</code> is optional.
     */

    public RootDirectory getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * <p>
     * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your
     * file system to NFS clients using the access point. The clients using the access point can only access the root
     * directory and below. If the <code>RootDirectory</code> &gt; <code>Path</code> specified does not exist, EFS
     * creates it and applies the <code>CreationInfo</code> settings when a client connects to an access point. When
     * specifying a <code>RootDirectory</code>, you need to provide the <code>Path</code>, and the
     * <code>CreationInfo</code> is optional.
     * </p>
     * 
     * @param rootDirectory
     *        Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory
     *        of your file system to NFS clients using the access point. The clients using the access point can only
     *        access the root directory and below. If the <code>RootDirectory</code> &gt; <code>Path</code> specified
     *        does not exist, EFS creates it and applies the <code>CreationInfo</code> settings when a client connects
     *        to an access point. When specifying a <code>RootDirectory</code>, you need to provide the
     *        <code>Path</code>, and the <code>CreationInfo</code> is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointRequest withRootDirectory(RootDirectory rootDirectory) {
        setRootDirectory(rootDirectory);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getPosixUser() != null)
            sb.append("PosixUser: ").append(getPosixUser()).append(",");
        if (getRootDirectory() != null)
            sb.append("RootDirectory: ").append(getRootDirectory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessPointRequest == false)
            return false;
        CreateAccessPointRequest other = (CreateAccessPointRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getPosixUser() == null ^ this.getPosixUser() == null)
            return false;
        if (other.getPosixUser() != null && other.getPosixUser().equals(this.getPosixUser()) == false)
            return false;
        if (other.getRootDirectory() == null ^ this.getRootDirectory() == null)
            return false;
        if (other.getRootDirectory() != null && other.getRootDirectory().equals(this.getRootDirectory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPosixUser() == null) ? 0 : getPosixUser().hashCode());
        hashCode = prime * hashCode + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessPointRequest clone() {
        return (CreateAccessPointRequest) super.clone();
    }

}
