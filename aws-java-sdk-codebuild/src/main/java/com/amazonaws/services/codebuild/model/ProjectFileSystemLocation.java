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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a file system created by Amazon Elastic File System (EFS). For more information, see <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html">What Is Amazon Elastic File System?</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectFileSystemLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectFileSystemLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A string that specifies the location of the file system created by Amazon EFS. Its format is
     * <code>efs-dns-name:/directory-path</code>. You can find the DNS name of file system when you view it in the AWS
     * EFS console. The directory path is a path to a directory in the file system that CodeBuild mounts. For example,
     * if the DNS name of a file system is <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount directory
     * is <code>my-efs-mount-directory</code>, then the <code>location</code> is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>.
     * </p>
     * <p>
     * The directory path in the format <code>efs-dns-name:/directory-path</code> is optional. If you do not specify a
     * directory path, the location is only the DNS name and CodeBuild mounts the entire file system.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The location in the container where you mount the file system.
     * </p>
     */
    private String mountPoint;
    /**
     * <p>
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by
     * appending the <code>identifier</code> in all capital letters to <code>CODEBUILD_</code>. For example, if you
     * specify <code>my-efs</code> for <code>identifier</code>, a new environment variable is create named
     * <code>CODEBUILD_MY-EFS</code>.
     * </p>
     * <p>
     * The <code>identifier</code> is used to mount your file system.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are
     * <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html">Recommended NFS Mount
     * Options</a>.
     * </p>
     */
    private String mountOptions;

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * 
     * @param type
     *        The type of the file system. The one supported type is <code>EFS</code>.
     * @see FileSystemType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * 
     * @return The type of the file system. The one supported type is <code>EFS</code>.
     * @see FileSystemType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * 
     * @param type
     *        The type of the file system. The one supported type is <code>EFS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public ProjectFileSystemLocation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * 
     * @param type
     *        The type of the file system. The one supported type is <code>EFS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public ProjectFileSystemLocation withType(FileSystemType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A string that specifies the location of the file system created by Amazon EFS. Its format is
     * <code>efs-dns-name:/directory-path</code>. You can find the DNS name of file system when you view it in the AWS
     * EFS console. The directory path is a path to a directory in the file system that CodeBuild mounts. For example,
     * if the DNS name of a file system is <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount directory
     * is <code>my-efs-mount-directory</code>, then the <code>location</code> is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>.
     * </p>
     * <p>
     * The directory path in the format <code>efs-dns-name:/directory-path</code> is optional. If you do not specify a
     * directory path, the location is only the DNS name and CodeBuild mounts the entire file system.
     * </p>
     * 
     * @param location
     *        A string that specifies the location of the file system created by Amazon EFS. Its format is
     *        <code>efs-dns-name:/directory-path</code>. You can find the DNS name of file system when you view it in
     *        the AWS EFS console. The directory path is a path to a directory in the file system that CodeBuild mounts.
     *        For example, if the DNS name of a file system is <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and
     *        its mount directory is <code>my-efs-mount-directory</code>, then the <code>location</code> is
     *        <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>. </p>
     *        <p>
     *        The directory path in the format <code>efs-dns-name:/directory-path</code> is optional. If you do not
     *        specify a directory path, the location is only the DNS name and CodeBuild mounts the entire file system.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A string that specifies the location of the file system created by Amazon EFS. Its format is
     * <code>efs-dns-name:/directory-path</code>. You can find the DNS name of file system when you view it in the AWS
     * EFS console. The directory path is a path to a directory in the file system that CodeBuild mounts. For example,
     * if the DNS name of a file system is <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount directory
     * is <code>my-efs-mount-directory</code>, then the <code>location</code> is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>.
     * </p>
     * <p>
     * The directory path in the format <code>efs-dns-name:/directory-path</code> is optional. If you do not specify a
     * directory path, the location is only the DNS name and CodeBuild mounts the entire file system.
     * </p>
     * 
     * @return A string that specifies the location of the file system created by Amazon EFS. Its format is
     *         <code>efs-dns-name:/directory-path</code>. You can find the DNS name of file system when you view it in
     *         the AWS EFS console. The directory path is a path to a directory in the file system that CodeBuild
     *         mounts. For example, if the DNS name of a file system is
     *         <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount directory is
     *         <code>my-efs-mount-directory</code>, then the <code>location</code> is
     *         <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>. </p>
     *         <p>
     *         The directory path in the format <code>efs-dns-name:/directory-path</code> is optional. If you do not
     *         specify a directory path, the location is only the DNS name and CodeBuild mounts the entire file system.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * A string that specifies the location of the file system created by Amazon EFS. Its format is
     * <code>efs-dns-name:/directory-path</code>. You can find the DNS name of file system when you view it in the AWS
     * EFS console. The directory path is a path to a directory in the file system that CodeBuild mounts. For example,
     * if the DNS name of a file system is <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount directory
     * is <code>my-efs-mount-directory</code>, then the <code>location</code> is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>.
     * </p>
     * <p>
     * The directory path in the format <code>efs-dns-name:/directory-path</code> is optional. If you do not specify a
     * directory path, the location is only the DNS name and CodeBuild mounts the entire file system.
     * </p>
     * 
     * @param location
     *        A string that specifies the location of the file system created by Amazon EFS. Its format is
     *        <code>efs-dns-name:/directory-path</code>. You can find the DNS name of file system when you view it in
     *        the AWS EFS console. The directory path is a path to a directory in the file system that CodeBuild mounts.
     *        For example, if the DNS name of a file system is <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and
     *        its mount directory is <code>my-efs-mount-directory</code>, then the <code>location</code> is
     *        <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>. </p>
     *        <p>
     *        The directory path in the format <code>efs-dns-name:/directory-path</code> is optional. If you do not
     *        specify a directory path, the location is only the DNS name and CodeBuild mounts the entire file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectFileSystemLocation withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The location in the container where you mount the file system.
     * </p>
     * 
     * @param mountPoint
     *        The location in the container where you mount the file system.
     */

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    /**
     * <p>
     * The location in the container where you mount the file system.
     * </p>
     * 
     * @return The location in the container where you mount the file system.
     */

    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * <p>
     * The location in the container where you mount the file system.
     * </p>
     * 
     * @param mountPoint
     *        The location in the container where you mount the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectFileSystemLocation withMountPoint(String mountPoint) {
        setMountPoint(mountPoint);
        return this;
    }

    /**
     * <p>
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by
     * appending the <code>identifier</code> in all capital letters to <code>CODEBUILD_</code>. For example, if you
     * specify <code>my-efs</code> for <code>identifier</code>, a new environment variable is create named
     * <code>CODEBUILD_MY-EFS</code>.
     * </p>
     * <p>
     * The <code>identifier</code> is used to mount your file system.
     * </p>
     * 
     * @param identifier
     *        The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by
     *        appending the <code>identifier</code> in all capital letters to <code>CODEBUILD_</code>. For example, if
     *        you specify <code>my-efs</code> for <code>identifier</code>, a new environment variable is create named
     *        <code>CODEBUILD_MY-EFS</code>. </p>
     *        <p>
     *        The <code>identifier</code> is used to mount your file system.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by
     * appending the <code>identifier</code> in all capital letters to <code>CODEBUILD_</code>. For example, if you
     * specify <code>my-efs</code> for <code>identifier</code>, a new environment variable is create named
     * <code>CODEBUILD_MY-EFS</code>.
     * </p>
     * <p>
     * The <code>identifier</code> is used to mount your file system.
     * </p>
     * 
     * @return The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by
     *         appending the <code>identifier</code> in all capital letters to <code>CODEBUILD_</code>. For example, if
     *         you specify <code>my-efs</code> for <code>identifier</code>, a new environment variable is create named
     *         <code>CODEBUILD_MY-EFS</code>. </p>
     *         <p>
     *         The <code>identifier</code> is used to mount your file system.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by
     * appending the <code>identifier</code> in all capital letters to <code>CODEBUILD_</code>. For example, if you
     * specify <code>my-efs</code> for <code>identifier</code>, a new environment variable is create named
     * <code>CODEBUILD_MY-EFS</code>.
     * </p>
     * <p>
     * The <code>identifier</code> is used to mount your file system.
     * </p>
     * 
     * @param identifier
     *        The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by
     *        appending the <code>identifier</code> in all capital letters to <code>CODEBUILD_</code>. For example, if
     *        you specify <code>my-efs</code> for <code>identifier</code>, a new environment variable is create named
     *        <code>CODEBUILD_MY-EFS</code>. </p>
     *        <p>
     *        The <code>identifier</code> is used to mount your file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectFileSystemLocation withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are
     * <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html">Recommended NFS Mount
     * Options</a>.
     * </p>
     * 
     * @param mountOptions
     *        The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are
     *        <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>. For more information, see
     *        <a href="https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html">Recommended NFS
     *        Mount Options</a>.
     */

    public void setMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * <p>
     * The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are
     * <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html">Recommended NFS Mount
     * Options</a>.
     * </p>
     * 
     * @return The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are
     *         <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>. For more information, see
     *         <a href="https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html">Recommended NFS
     *         Mount Options</a>.
     */

    public String getMountOptions() {
        return this.mountOptions;
    }

    /**
     * <p>
     * The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are
     * <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html">Recommended NFS Mount
     * Options</a>.
     * </p>
     * 
     * @param mountOptions
     *        The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are
     *        <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>. For more information, see
     *        <a href="https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html">Recommended NFS
     *        Mount Options</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectFileSystemLocation withMountOptions(String mountOptions) {
        setMountOptions(mountOptions);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getMountPoint() != null)
            sb.append("MountPoint: ").append(getMountPoint()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getMountOptions() != null)
            sb.append("MountOptions: ").append(getMountOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectFileSystemLocation == false)
            return false;
        ProjectFileSystemLocation other = (ProjectFileSystemLocation) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMountPoint() == null ^ this.getMountPoint() == null)
            return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getMountOptions() == null ^ this.getMountOptions() == null)
            return false;
        if (other.getMountOptions() != null && other.getMountOptions().equals(this.getMountOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        return hashCode;
    }

    @Override
    public ProjectFileSystemLocation clone() {
        try {
            return (ProjectFileSystemLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectFileSystemLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
