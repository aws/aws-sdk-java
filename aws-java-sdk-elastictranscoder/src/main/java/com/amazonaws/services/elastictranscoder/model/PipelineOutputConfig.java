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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>PipelineOutputConfig</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files. Specify this value when
     * all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You want to save transcoded files, thumbnails (if any), and playlists (if any) together in one bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not want to specify the users or groups who have access to the transcoded files, thumbnails, and
     * playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not want to specify the permissions that Elastic Transcoder grants to the files.
     * </p>
     * </li>
     * <li>
     * <p>
     * You want to associate the transcoded files and thumbnails with the Amazon S3 Standard storage class.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want to save transcoded files and playlists in one bucket and thumbnails in another bucket, specify which
     * users can access the transcoded files or the permissions the users have, or change the Amazon S3 storage class,
     * omit OutputBucket and specify values for <code>ContentConfig</code> and <code>ThumbnailConfig</code> instead.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>, that you want Elastic
     * Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * </p>
     */
    private String storageClass;
    /**
     * <p>
     * Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups you want
     * to have access to transcoded files and playlists, and the type of access you want them to have. You can grant
     * permissions to a maximum of 30 users and/or predefined Amazon S3 groups.
     * </p>
     * <p>
     * If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify. It does
     * not grant full permissions to the owner of the role specified by <code>Role</code>. If you want that user to have
     * full control, you must explicitly grant full control to the user.
     * </p>
     * <p>
     * If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files and
     * playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to any other
     * user or group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Permission> permissions;

    /**
     * <p>
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files. Specify this value when
     * all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You want to save transcoded files, thumbnails (if any), and playlists (if any) together in one bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not want to specify the users or groups who have access to the transcoded files, thumbnails, and
     * playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not want to specify the permissions that Elastic Transcoder grants to the files.
     * </p>
     * </li>
     * <li>
     * <p>
     * You want to associate the transcoded files and thumbnails with the Amazon S3 Standard storage class.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want to save transcoded files and playlists in one bucket and thumbnails in another bucket, specify which
     * users can access the transcoded files or the permissions the users have, or change the Amazon S3 storage class,
     * omit OutputBucket and specify values for <code>ContentConfig</code> and <code>ThumbnailConfig</code> instead.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files. Specify this value
     *        when all of the following are true:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You want to save transcoded files, thumbnails (if any), and playlists (if any) together in one bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You do not want to specify the users or groups who have access to the transcoded files, thumbnails, and
     *        playlists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You do not want to specify the permissions that Elastic Transcoder grants to the files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You want to associate the transcoded files and thumbnails with the Amazon S3 Standard storage class.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you want to save transcoded files and playlists in one bucket and thumbnails in another bucket, specify
     *        which users can access the transcoded files or the permissions the users have, or change the Amazon S3
     *        storage class, omit OutputBucket and specify values for <code>ContentConfig</code> and
     *        <code>ThumbnailConfig</code> instead.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files. Specify this value when
     * all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You want to save transcoded files, thumbnails (if any), and playlists (if any) together in one bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not want to specify the users or groups who have access to the transcoded files, thumbnails, and
     * playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not want to specify the permissions that Elastic Transcoder grants to the files.
     * </p>
     * </li>
     * <li>
     * <p>
     * You want to associate the transcoded files and thumbnails with the Amazon S3 Standard storage class.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want to save transcoded files and playlists in one bucket and thumbnails in another bucket, specify which
     * users can access the transcoded files or the permissions the users have, or change the Amazon S3 storage class,
     * omit OutputBucket and specify values for <code>ContentConfig</code> and <code>ThumbnailConfig</code> instead.
     * </p>
     * 
     * @return The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files. Specify this
     *         value when all of the following are true:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You want to save transcoded files, thumbnails (if any), and playlists (if any) together in one bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not want to specify the users or groups who have access to the transcoded files, thumbnails, and
     *         playlists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not want to specify the permissions that Elastic Transcoder grants to the files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You want to associate the transcoded files and thumbnails with the Amazon S3 Standard storage class.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you want to save transcoded files and playlists in one bucket and thumbnails in another bucket,
     *         specify which users can access the transcoded files or the permissions the users have, or change the
     *         Amazon S3 storage class, omit OutputBucket and specify values for <code>ContentConfig</code> and
     *         <code>ThumbnailConfig</code> instead.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files. Specify this value when
     * all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You want to save transcoded files, thumbnails (if any), and playlists (if any) together in one bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not want to specify the users or groups who have access to the transcoded files, thumbnails, and
     * playlists.
     * </p>
     * </li>
     * <li>
     * <p>
     * You do not want to specify the permissions that Elastic Transcoder grants to the files.
     * </p>
     * </li>
     * <li>
     * <p>
     * You want to associate the transcoded files and thumbnails with the Amazon S3 Standard storage class.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you want to save transcoded files and playlists in one bucket and thumbnails in another bucket, specify which
     * users can access the transcoded files or the permissions the users have, or change the Amazon S3 storage class,
     * omit OutputBucket and specify values for <code>ContentConfig</code> and <code>ThumbnailConfig</code> instead.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket in which you want Elastic Transcoder to save the transcoded files. Specify this value
     *        when all of the following are true:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You want to save transcoded files, thumbnails (if any), and playlists (if any) together in one bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You do not want to specify the users or groups who have access to the transcoded files, thumbnails, and
     *        playlists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You do not want to specify the permissions that Elastic Transcoder grants to the files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You want to associate the transcoded files and thumbnails with the Amazon S3 Standard storage class.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you want to save transcoded files and playlists in one bucket and thumbnails in another bucket, specify
     *        which users can access the transcoded files or the permissions the users have, or change the Amazon S3
     *        storage class, omit OutputBucket and specify values for <code>ContentConfig</code> and
     *        <code>ThumbnailConfig</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineOutputConfig withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>, that you want Elastic
     * Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * </p>
     * 
     * @param storageClass
     *        The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *        Elastic Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>, that you want Elastic
     * Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * </p>
     * 
     * @return The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *         Elastic Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>, that you want Elastic
     * Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * </p>
     * 
     * @param storageClass
     *        The Amazon S3 storage class, <code>Standard</code> or <code>ReducedRedundancy</code>, that you want
     *        Elastic Transcoder to assign to the video files and playlists that it stores in your Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineOutputConfig withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups you want
     * to have access to transcoded files and playlists, and the type of access you want them to have. You can grant
     * permissions to a maximum of 30 users and/or predefined Amazon S3 groups.
     * </p>
     * <p>
     * If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify. It does
     * not grant full permissions to the owner of the role specified by <code>Role</code>. If you want that user to have
     * full control, you must explicitly grant full control to the user.
     * </p>
     * <p>
     * If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files and
     * playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to any other
     * user or group.
     * </p>
     * 
     * @return Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups
     *         you want to have access to transcoded files and playlists, and the type of access you want them to have.
     *         You can grant permissions to a maximum of 30 users and/or predefined Amazon S3 groups.</p>
     *         <p>
     *         If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify.
     *         It does not grant full permissions to the owner of the role specified by <code>Role</code>. If you want
     *         that user to have full control, you must explicitly grant full control to the user.
     *         </p>
     *         <p>
     *         If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files
     *         and playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to
     *         any other user or group.
     */

    public java.util.List<Permission> getPermissions() {
        if (permissions == null) {
            permissions = new com.amazonaws.internal.SdkInternalList<Permission>();
        }
        return permissions;
    }

    /**
     * <p>
     * Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups you want
     * to have access to transcoded files and playlists, and the type of access you want them to have. You can grant
     * permissions to a maximum of 30 users and/or predefined Amazon S3 groups.
     * </p>
     * <p>
     * If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify. It does
     * not grant full permissions to the owner of the role specified by <code>Role</code>. If you want that user to have
     * full control, you must explicitly grant full control to the user.
     * </p>
     * <p>
     * If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files and
     * playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to any other
     * user or group.
     * </p>
     * 
     * @param permissions
     *        Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups you
     *        want to have access to transcoded files and playlists, and the type of access you want them to have. You
     *        can grant permissions to a maximum of 30 users and/or predefined Amazon S3 groups.</p>
     *        <p>
     *        If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify.
     *        It does not grant full permissions to the owner of the role specified by <code>Role</code>. If you want
     *        that user to have full control, you must explicitly grant full control to the user.
     *        </p>
     *        <p>
     *        If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files and
     *        playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to any
     *        other user or group.
     */

    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new com.amazonaws.internal.SdkInternalList<Permission>(permissions);
    }

    /**
     * <p>
     * Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups you want
     * to have access to transcoded files and playlists, and the type of access you want them to have. You can grant
     * permissions to a maximum of 30 users and/or predefined Amazon S3 groups.
     * </p>
     * <p>
     * If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify. It does
     * not grant full permissions to the owner of the role specified by <code>Role</code>. If you want that user to have
     * full control, you must explicitly grant full control to the user.
     * </p>
     * <p>
     * If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files and
     * playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to any other
     * user or group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups you
     *        want to have access to transcoded files and playlists, and the type of access you want them to have. You
     *        can grant permissions to a maximum of 30 users and/or predefined Amazon S3 groups.</p>
     *        <p>
     *        If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify.
     *        It does not grant full permissions to the owner of the role specified by <code>Role</code>. If you want
     *        that user to have full control, you must explicitly grant full control to the user.
     *        </p>
     *        <p>
     *        If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files and
     *        playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to any
     *        other user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineOutputConfig withPermissions(Permission... permissions) {
        if (this.permissions == null) {
            setPermissions(new com.amazonaws.internal.SdkInternalList<Permission>(permissions.length));
        }
        for (Permission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups you want
     * to have access to transcoded files and playlists, and the type of access you want them to have. You can grant
     * permissions to a maximum of 30 users and/or predefined Amazon S3 groups.
     * </p>
     * <p>
     * If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify. It does
     * not grant full permissions to the owner of the role specified by <code>Role</code>. If you want that user to have
     * full control, you must explicitly grant full control to the user.
     * </p>
     * <p>
     * If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files and
     * playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to any other
     * user or group.
     * </p>
     * 
     * @param permissions
     *        Optional. The <code>Permissions</code> object specifies which users and/or predefined Amazon S3 groups you
     *        want to have access to transcoded files and playlists, and the type of access you want them to have. You
     *        can grant permissions to a maximum of 30 users and/or predefined Amazon S3 groups.</p>
     *        <p>
     *        If you include <code>Permissions</code>, Elastic Transcoder grants only the permissions that you specify.
     *        It does not grant full permissions to the owner of the role specified by <code>Role</code>. If you want
     *        that user to have full control, you must explicitly grant full control to the user.
     *        </p>
     *        <p>
     *        If you omit <code>Permissions</code>, Elastic Transcoder grants full control over the transcoded files and
     *        playlists to the owner of the role specified by <code>Role</code>, and grants no other permissions to any
     *        other user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineOutputConfig withPermissions(java.util.Collection<Permission> permissions) {
        setPermissions(permissions);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineOutputConfig == false)
            return false;
        PipelineOutputConfig other = (PipelineOutputConfig) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public PipelineOutputConfig clone() {
        try {
            return (PipelineOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.PipelineOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
