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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a description of an EFS file system access point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/AccessPointDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPointDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the access point. This is the value of the <code>Name</code> tag.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags associated with the access point, presented as an array of Tag objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the access point, assigned by Amazon EFS.
     * </p>
     */
    private String accessPointId;
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) associated with the access point.
     * </p>
     */
    private String accessPointArn;
    /**
     * <p>
     * The ID of the EFS file system that the access point applies to.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is
     * used for all file operations by NFS clients using the access point.
     * </p>
     */
    private PosixUser posixUser;
    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients
     * using the access point.
     * </p>
     */
    private RootDirectory rootDirectory;
    /**
     * <p>
     * Identified the AWS account that owns the access point resource.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     */
    private String lifeCycleState;

    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     * 
     * @param clientToken
     *        The opaque string specified in the request to ensure idempotent creation.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     * 
     * @return The opaque string specified in the request to ensure idempotent creation.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     * 
     * @param clientToken
     *        The opaque string specified in the request to ensure idempotent creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the access point. This is the value of the <code>Name</code> tag.
     * </p>
     * 
     * @param name
     *        The name of the access point. This is the value of the <code>Name</code> tag.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the access point. This is the value of the <code>Name</code> tag.
     * </p>
     * 
     * @return The name of the access point. This is the value of the <code>Name</code> tag.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the access point. This is the value of the <code>Name</code> tag.
     * </p>
     * 
     * @param name
     *        The name of the access point. This is the value of the <code>Name</code> tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags associated with the access point, presented as an array of Tag objects.
     * </p>
     * 
     * @return The tags associated with the access point, presented as an array of Tag objects.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the access point, presented as an array of Tag objects.
     * </p>
     * 
     * @param tags
     *        The tags associated with the access point, presented as an array of Tag objects.
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
     * The tags associated with the access point, presented as an array of Tag objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the access point, presented as an array of Tag objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withTags(Tag... tags) {
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
     * The tags associated with the access point, presented as an array of Tag objects.
     * </p>
     * 
     * @param tags
     *        The tags associated with the access point, presented as an array of Tag objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the access point, assigned by Amazon EFS.
     * </p>
     * 
     * @param accessPointId
     *        The ID of the access point, assigned by Amazon EFS.
     */

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * The ID of the access point, assigned by Amazon EFS.
     * </p>
     * 
     * @return The ID of the access point, assigned by Amazon EFS.
     */

    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * <p>
     * The ID of the access point, assigned by Amazon EFS.
     * </p>
     * 
     * @param accessPointId
     *        The ID of the access point, assigned by Amazon EFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withAccessPointId(String accessPointId) {
        setAccessPointId(accessPointId);
        return this;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) associated with the access point.
     * </p>
     * 
     * @param accessPointArn
     *        The unique Amazon Resource Name (ARN) associated with the access point.
     */

    public void setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) associated with the access point.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) associated with the access point.
     */

    public String getAccessPointArn() {
        return this.accessPointArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) associated with the access point.
     * </p>
     * 
     * @param accessPointArn
     *        The unique Amazon Resource Name (ARN) associated with the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withAccessPointArn(String accessPointArn) {
        setAccessPointArn(accessPointArn);
        return this;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point applies to.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the EFS file system that the access point applies to.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point applies to.
     * </p>
     * 
     * @return The ID of the EFS file system that the access point applies to.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that the access point applies to.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the EFS file system that the access point applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is
     * used for all file operations by NFS clients using the access point.
     * </p>
     * 
     * @param posixUser
     *        The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that
     *        is used for all file operations by NFS clients using the access point.
     */

    public void setPosixUser(PosixUser posixUser) {
        this.posixUser = posixUser;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is
     * used for all file operations by NFS clients using the access point.
     * </p>
     * 
     * @return The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point
     *         that is used for all file operations by NFS clients using the access point.
     */

    public PosixUser getPosixUser() {
        return this.posixUser;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is
     * used for all file operations by NFS clients using the access point.
     * </p>
     * 
     * @param posixUser
     *        The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that
     *        is used for all file operations by NFS clients using the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withPosixUser(PosixUser posixUser) {
        setPosixUser(posixUser);
        return this;
    }

    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients
     * using the access point.
     * </p>
     * 
     * @param rootDirectory
     *        The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS
     *        clients using the access point.
     */

    public void setRootDirectory(RootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients
     * using the access point.
     * </p>
     * 
     * @return The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS
     *         clients using the access point.
     */

    public RootDirectory getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients
     * using the access point.
     * </p>
     * 
     * @param rootDirectory
     *        The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS
     *        clients using the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withRootDirectory(RootDirectory rootDirectory) {
        setRootDirectory(rootDirectory);
        return this;
    }

    /**
     * <p>
     * Identified the AWS account that owns the access point resource.
     * </p>
     * 
     * @param ownerId
     *        Identified the AWS account that owns the access point resource.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * Identified the AWS account that owns the access point resource.
     * </p>
     * 
     * @return Identified the AWS account that owns the access point resource.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * Identified the AWS account that owns the access point resource.
     * </p>
     * 
     * @param ownerId
     *        Identified the AWS account that owns the access point resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointDescription withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * 
     * @param lifeCycleState
     *        Identifies the lifecycle phase of the access point.
     * @see LifeCycleState
     */

    public void setLifeCycleState(String lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * 
     * @return Identifies the lifecycle phase of the access point.
     * @see LifeCycleState
     */

    public String getLifeCycleState() {
        return this.lifeCycleState;
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * 
     * @param lifeCycleState
     *        Identifies the lifecycle phase of the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public AccessPointDescription withLifeCycleState(String lifeCycleState) {
        setLifeCycleState(lifeCycleState);
        return this;
    }

    /**
     * <p>
     * Identifies the lifecycle phase of the access point.
     * </p>
     * 
     * @param lifeCycleState
     *        Identifies the lifecycle phase of the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public AccessPointDescription withLifeCycleState(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAccessPointId() != null)
            sb.append("AccessPointId: ").append(getAccessPointId()).append(",");
        if (getAccessPointArn() != null)
            sb.append("AccessPointArn: ").append(getAccessPointArn()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getPosixUser() != null)
            sb.append("PosixUser: ").append(getPosixUser()).append(",");
        if (getRootDirectory() != null)
            sb.append("RootDirectory: ").append(getRootDirectory()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getLifeCycleState() != null)
            sb.append("LifeCycleState: ").append(getLifeCycleState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPointDescription == false)
            return false;
        AccessPointDescription other = (AccessPointDescription) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAccessPointId() == null ^ this.getAccessPointId() == null)
            return false;
        if (other.getAccessPointId() != null && other.getAccessPointId().equals(this.getAccessPointId()) == false)
            return false;
        if (other.getAccessPointArn() == null ^ this.getAccessPointArn() == null)
            return false;
        if (other.getAccessPointArn() != null && other.getAccessPointArn().equals(this.getAccessPointArn()) == false)
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
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getLifeCycleState() == null ^ this.getLifeCycleState() == null)
            return false;
        if (other.getLifeCycleState() != null && other.getLifeCycleState().equals(this.getLifeCycleState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAccessPointId() == null) ? 0 : getAccessPointId().hashCode());
        hashCode = prime * hashCode + ((getAccessPointArn() == null) ? 0 : getAccessPointArn().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPosixUser() == null) ? 0 : getPosixUser().hashCode());
        hashCode = prime * hashCode + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getLifeCycleState() == null) ? 0 : getLifeCycleState().hashCode());
        return hashCode;
    }

    @Override
    public AccessPointDescription clone() {
        try {
            return (AccessPointDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.AccessPointDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
