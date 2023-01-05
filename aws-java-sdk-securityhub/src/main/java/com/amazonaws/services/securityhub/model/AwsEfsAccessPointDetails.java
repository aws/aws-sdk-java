/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon EFS access point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEfsAccessPointDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEfsAccessPointDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon EFS access point.
     * </p>
     */
    private String accessPointId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EFS access point.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The opaque string specified in the request to ensure idempotent creation.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the Amazon EFS file system that the access point applies to.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point, that is
     * used for all file operations by NFS clients using the access point.
     * </p>
     */
    private AwsEfsAccessPointPosixUserDetails posixUser;
    /**
     * <p>
     * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients
     * using the access point.
     * </p>
     */
    private AwsEfsAccessPointRootDirectoryDetails rootDirectory;

    /**
     * <p>
     * The ID of the Amazon EFS access point.
     * </p>
     * 
     * @param accessPointId
     *        The ID of the Amazon EFS access point.
     */

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * The ID of the Amazon EFS access point.
     * </p>
     * 
     * @return The ID of the Amazon EFS access point.
     */

    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * <p>
     * The ID of the Amazon EFS access point.
     * </p>
     * 
     * @param accessPointId
     *        The ID of the Amazon EFS access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEfsAccessPointDetails withAccessPointId(String accessPointId) {
        setAccessPointId(accessPointId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EFS access point.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Amazon EFS access point.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EFS access point.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon EFS access point.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EFS access point.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Amazon EFS access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEfsAccessPointDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public AwsEfsAccessPointDetails withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon EFS file system that the access point applies to.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the Amazon EFS file system that the access point applies to.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the Amazon EFS file system that the access point applies to.
     * </p>
     * 
     * @return The ID of the Amazon EFS file system that the access point applies to.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the Amazon EFS file system that the access point applies to.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the Amazon EFS file system that the access point applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEfsAccessPointDetails withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point, that is
     * used for all file operations by NFS clients using the access point.
     * </p>
     * 
     * @param posixUser
     *        The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point,
     *        that is used for all file operations by NFS clients using the access point.
     */

    public void setPosixUser(AwsEfsAccessPointPosixUserDetails posixUser) {
        this.posixUser = posixUser;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point, that is
     * used for all file operations by NFS clients using the access point.
     * </p>
     * 
     * @return The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point,
     *         that is used for all file operations by NFS clients using the access point.
     */

    public AwsEfsAccessPointPosixUserDetails getPosixUser() {
        return this.posixUser;
    }

    /**
     * <p>
     * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point, that is
     * used for all file operations by NFS clients using the access point.
     * </p>
     * 
     * @param posixUser
     *        The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point,
     *        that is used for all file operations by NFS clients using the access point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEfsAccessPointDetails withPosixUser(AwsEfsAccessPointPosixUserDetails posixUser) {
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

    public void setRootDirectory(AwsEfsAccessPointRootDirectoryDetails rootDirectory) {
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

    public AwsEfsAccessPointRootDirectoryDetails getRootDirectory() {
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

    public AwsEfsAccessPointDetails withRootDirectory(AwsEfsAccessPointRootDirectoryDetails rootDirectory) {
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
        if (getAccessPointId() != null)
            sb.append("AccessPointId: ").append(getAccessPointId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof AwsEfsAccessPointDetails == false)
            return false;
        AwsEfsAccessPointDetails other = (AwsEfsAccessPointDetails) obj;
        if (other.getAccessPointId() == null ^ this.getAccessPointId() == null)
            return false;
        if (other.getAccessPointId() != null && other.getAccessPointId().equals(this.getAccessPointId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getAccessPointId() == null) ? 0 : getAccessPointId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPosixUser() == null) ? 0 : getPosixUser().hashCode());
        hashCode = prime * hashCode + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        return hashCode;
    }

    @Override
    public AwsEfsAccessPointDetails clone() {
        try {
            return (AwsEfsAccessPointDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEfsAccessPointDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
