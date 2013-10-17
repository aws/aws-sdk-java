/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>PipelineOutputConfig</code> structure.
 * </p>
 */
public class PipelineOutputConfig implements Serializable {

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the
     * transcoded files. Specify this value when all of the following are
     * true: <ul> <li>You want to save transcoded files, thumbnails (if any),
     * and playlists (if any) together in one bucket.</li> <li>You do not
     * want to specify the users or groups who have access to the transcoded
     * files, thumbnails, and playlists.</li> <li>You do not want to specify
     * the permissions that Elastic Transcoder grants to the files. </li>
     * <li>You want to associate the transcoded files and thumbnails with the
     * Amazon S3 Standard storage class.</li> </ul> If you want to save
     * transcoded files and playlists in one bucket and thumbnails in another
     * bucket, specify which users can access the transcoded files or the
     * permissions the users have, or change the Amazon S3 storage class,
     * omit OutputBucket and specify values for <code>ContentConfig</code>
     * and <code>ThumbnailConfig</code> instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     */
    private String bucket;

    /**
     * The Amazon S3 storage class, <code>Standard</code> or
     * <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     * assign to the video files and playlists that it stores in your Amazon
     * S3 bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^ReducedRedundancy$)|(^Standard$)<br/>
     */
    private String storageClass;

    /**
     * Optional. The <code>Permissions</code> object specifies which users
     * and/or predefined Amazon S3 groups you want to have access to
     * transcoded files and playlists, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups. <p>If you include
     * <code>Permissions</code>, Elastic Transcoder grants only the
     * permissions that you specify. It does not grant full permissions to
     * the owner of the role specified by <code>Role</code>. If you want that
     * user to have full control, you must explicitly grant full control to
     * the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     * grants full control over the transcoded files and playlists to the
     * owner of the role specified by <code>Role</code>, and grants no other
     * permissions to any other user or group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissions;

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the
     * transcoded files. Specify this value when all of the following are
     * true: <ul> <li>You want to save transcoded files, thumbnails (if any),
     * and playlists (if any) together in one bucket.</li> <li>You do not
     * want to specify the users or groups who have access to the transcoded
     * files, thumbnails, and playlists.</li> <li>You do not want to specify
     * the permissions that Elastic Transcoder grants to the files. </li>
     * <li>You want to associate the transcoded files and thumbnails with the
     * Amazon S3 Standard storage class.</li> </ul> If you want to save
     * transcoded files and playlists in one bucket and thumbnails in another
     * bucket, specify which users can access the transcoded files or the
     * permissions the users have, or change the Amazon S3 storage class,
     * omit OutputBucket and specify values for <code>ContentConfig</code>
     * and <code>ThumbnailConfig</code> instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @return The Amazon S3 bucket in which you want Elastic Transcoder to save the
     *         transcoded files. Specify this value when all of the following are
     *         true: <ul> <li>You want to save transcoded files, thumbnails (if any),
     *         and playlists (if any) together in one bucket.</li> <li>You do not
     *         want to specify the users or groups who have access to the transcoded
     *         files, thumbnails, and playlists.</li> <li>You do not want to specify
     *         the permissions that Elastic Transcoder grants to the files. </li>
     *         <li>You want to associate the transcoded files and thumbnails with the
     *         Amazon S3 Standard storage class.</li> </ul> If you want to save
     *         transcoded files and playlists in one bucket and thumbnails in another
     *         bucket, specify which users can access the transcoded files or the
     *         permissions the users have, or change the Amazon S3 storage class,
     *         omit OutputBucket and specify values for <code>ContentConfig</code>
     *         and <code>ThumbnailConfig</code> instead.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the
     * transcoded files. Specify this value when all of the following are
     * true: <ul> <li>You want to save transcoded files, thumbnails (if any),
     * and playlists (if any) together in one bucket.</li> <li>You do not
     * want to specify the users or groups who have access to the transcoded
     * files, thumbnails, and playlists.</li> <li>You do not want to specify
     * the permissions that Elastic Transcoder grants to the files. </li>
     * <li>You want to associate the transcoded files and thumbnails with the
     * Amazon S3 Standard storage class.</li> </ul> If you want to save
     * transcoded files and playlists in one bucket and thumbnails in another
     * bucket, specify which users can access the transcoded files or the
     * permissions the users have, or change the Amazon S3 storage class,
     * omit OutputBucket and specify values for <code>ContentConfig</code>
     * and <code>ThumbnailConfig</code> instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param bucket The Amazon S3 bucket in which you want Elastic Transcoder to save the
     *         transcoded files. Specify this value when all of the following are
     *         true: <ul> <li>You want to save transcoded files, thumbnails (if any),
     *         and playlists (if any) together in one bucket.</li> <li>You do not
     *         want to specify the users or groups who have access to the transcoded
     *         files, thumbnails, and playlists.</li> <li>You do not want to specify
     *         the permissions that Elastic Transcoder grants to the files. </li>
     *         <li>You want to associate the transcoded files and thumbnails with the
     *         Amazon S3 Standard storage class.</li> </ul> If you want to save
     *         transcoded files and playlists in one bucket and thumbnails in another
     *         bucket, specify which users can access the transcoded files or the
     *         permissions the users have, or change the Amazon S3 storage class,
     *         omit OutputBucket and specify values for <code>ContentConfig</code>
     *         and <code>ThumbnailConfig</code> instead.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save the
     * transcoded files. Specify this value when all of the following are
     * true: <ul> <li>You want to save transcoded files, thumbnails (if any),
     * and playlists (if any) together in one bucket.</li> <li>You do not
     * want to specify the users or groups who have access to the transcoded
     * files, thumbnails, and playlists.</li> <li>You do not want to specify
     * the permissions that Elastic Transcoder grants to the files. </li>
     * <li>You want to associate the transcoded files and thumbnails with the
     * Amazon S3 Standard storage class.</li> </ul> If you want to save
     * transcoded files and playlists in one bucket and thumbnails in another
     * bucket, specify which users can access the transcoded files or the
     * permissions the users have, or change the Amazon S3 storage class,
     * omit OutputBucket and specify values for <code>ContentConfig</code>
     * and <code>ThumbnailConfig</code> instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\w|\.|-){1,255}$<br/>
     *
     * @param bucket The Amazon S3 bucket in which you want Elastic Transcoder to save the
     *         transcoded files. Specify this value when all of the following are
     *         true: <ul> <li>You want to save transcoded files, thumbnails (if any),
     *         and playlists (if any) together in one bucket.</li> <li>You do not
     *         want to specify the users or groups who have access to the transcoded
     *         files, thumbnails, and playlists.</li> <li>You do not want to specify
     *         the permissions that Elastic Transcoder grants to the files. </li>
     *         <li>You want to associate the transcoded files and thumbnails with the
     *         Amazon S3 Standard storage class.</li> </ul> If you want to save
     *         transcoded files and playlists in one bucket and thumbnails in another
     *         bucket, specify which users can access the transcoded files or the
     *         permissions the users have, or change the Amazon S3 storage class,
     *         omit OutputBucket and specify values for <code>ContentConfig</code>
     *         and <code>ThumbnailConfig</code> instead.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineOutputConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * The Amazon S3 storage class, <code>Standard</code> or
     * <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     * assign to the video files and playlists that it stores in your Amazon
     * S3 bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^ReducedRedundancy$)|(^Standard$)<br/>
     *
     * @return The Amazon S3 storage class, <code>Standard</code> or
     *         <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     *         assign to the video files and playlists that it stores in your Amazon
     *         S3 bucket.
     */
    public String getStorageClass() {
        return storageClass;
    }
    
    /**
     * The Amazon S3 storage class, <code>Standard</code> or
     * <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     * assign to the video files and playlists that it stores in your Amazon
     * S3 bucket.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^ReducedRedundancy$)|(^Standard$)<br/>
     *
     * @param storageClass The Amazon S3 storage class, <code>Standard</code> or
     *         <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     *         assign to the video files and playlists that it stores in your Amazon
     *         S3 bucket.
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }
    
    /**
     * The Amazon S3 storage class, <code>Standard</code> or
     * <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     * assign to the video files and playlists that it stores in your Amazon
     * S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^ReducedRedundancy$)|(^Standard$)<br/>
     *
     * @param storageClass The Amazon S3 storage class, <code>Standard</code> or
     *         <code>ReducedRedundancy</code>, that you want Elastic Transcoder to
     *         assign to the video files and playlists that it stores in your Amazon
     *         S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineOutputConfig withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * Optional. The <code>Permissions</code> object specifies which users
     * and/or predefined Amazon S3 groups you want to have access to
     * transcoded files and playlists, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups. <p>If you include
     * <code>Permissions</code>, Elastic Transcoder grants only the
     * permissions that you specify. It does not grant full permissions to
     * the owner of the role specified by <code>Role</code>. If you want that
     * user to have full control, you must explicitly grant full control to
     * the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     * grants full control over the transcoded files and playlists to the
     * owner of the role specified by <code>Role</code>, and grants no other
     * permissions to any other user or group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return Optional. The <code>Permissions</code> object specifies which users
     *         and/or predefined Amazon S3 groups you want to have access to
     *         transcoded files and playlists, and the type of access you want them
     *         to have. You can grant permissions to a maximum of 30 users and/or
     *         predefined Amazon S3 groups. <p>If you include
     *         <code>Permissions</code>, Elastic Transcoder grants only the
     *         permissions that you specify. It does not grant full permissions to
     *         the owner of the role specified by <code>Role</code>. If you want that
     *         user to have full control, you must explicitly grant full control to
     *         the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     *         grants full control over the transcoded files and playlists to the
     *         owner of the role specified by <code>Role</code>, and grants no other
     *         permissions to any other user or group.
     */
    public java.util.List<Permission> getPermissions() {
        if (permissions == null) {
              permissions = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>();
              permissions.setAutoConstruct(true);
        }
        return permissions;
    }
    
    /**
     * Optional. The <code>Permissions</code> object specifies which users
     * and/or predefined Amazon S3 groups you want to have access to
     * transcoded files and playlists, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups. <p>If you include
     * <code>Permissions</code>, Elastic Transcoder grants only the
     * permissions that you specify. It does not grant full permissions to
     * the owner of the role specified by <code>Role</code>. If you want that
     * user to have full control, you must explicitly grant full control to
     * the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     * grants full control over the transcoded files and playlists to the
     * owner of the role specified by <code>Role</code>, and grants no other
     * permissions to any other user or group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param permissions Optional. The <code>Permissions</code> object specifies which users
     *         and/or predefined Amazon S3 groups you want to have access to
     *         transcoded files and playlists, and the type of access you want them
     *         to have. You can grant permissions to a maximum of 30 users and/or
     *         predefined Amazon S3 groups. <p>If you include
     *         <code>Permissions</code>, Elastic Transcoder grants only the
     *         permissions that you specify. It does not grant full permissions to
     *         the owner of the role specified by <code>Role</code>. If you want that
     *         user to have full control, you must explicitly grant full control to
     *         the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     *         grants full control over the transcoded files and playlists to the
     *         owner of the role specified by <code>Role</code>, and grants no other
     *         permissions to any other user or group.
     */
    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>(permissions.size());
        permissionsCopy.addAll(permissions);
        this.permissions = permissionsCopy;
    }
    
    /**
     * Optional. The <code>Permissions</code> object specifies which users
     * and/or predefined Amazon S3 groups you want to have access to
     * transcoded files and playlists, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups. <p>If you include
     * <code>Permissions</code>, Elastic Transcoder grants only the
     * permissions that you specify. It does not grant full permissions to
     * the owner of the role specified by <code>Role</code>. If you want that
     * user to have full control, you must explicitly grant full control to
     * the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     * grants full control over the transcoded files and playlists to the
     * owner of the role specified by <code>Role</code>, and grants no other
     * permissions to any other user or group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param permissions Optional. The <code>Permissions</code> object specifies which users
     *         and/or predefined Amazon S3 groups you want to have access to
     *         transcoded files and playlists, and the type of access you want them
     *         to have. You can grant permissions to a maximum of 30 users and/or
     *         predefined Amazon S3 groups. <p>If you include
     *         <code>Permissions</code>, Elastic Transcoder grants only the
     *         permissions that you specify. It does not grant full permissions to
     *         the owner of the role specified by <code>Role</code>. If you want that
     *         user to have full control, you must explicitly grant full control to
     *         the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     *         grants full control over the transcoded files and playlists to the
     *         owner of the role specified by <code>Role</code>, and grants no other
     *         permissions to any other user or group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineOutputConfig withPermissions(Permission... permissions) {
        if (getPermissions() == null) setPermissions(new java.util.ArrayList<Permission>(permissions.length));
        for (Permission value : permissions) {
            getPermissions().add(value);
        }
        return this;
    }
    
    /**
     * Optional. The <code>Permissions</code> object specifies which users
     * and/or predefined Amazon S3 groups you want to have access to
     * transcoded files and playlists, and the type of access you want them
     * to have. You can grant permissions to a maximum of 30 users and/or
     * predefined Amazon S3 groups. <p>If you include
     * <code>Permissions</code>, Elastic Transcoder grants only the
     * permissions that you specify. It does not grant full permissions to
     * the owner of the role specified by <code>Role</code>. If you want that
     * user to have full control, you must explicitly grant full control to
     * the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     * grants full control over the transcoded files and playlists to the
     * owner of the role specified by <code>Role</code>, and grants no other
     * permissions to any other user or group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param permissions Optional. The <code>Permissions</code> object specifies which users
     *         and/or predefined Amazon S3 groups you want to have access to
     *         transcoded files and playlists, and the type of access you want them
     *         to have. You can grant permissions to a maximum of 30 users and/or
     *         predefined Amazon S3 groups. <p>If you include
     *         <code>Permissions</code>, Elastic Transcoder grants only the
     *         permissions that you specify. It does not grant full permissions to
     *         the owner of the role specified by <code>Role</code>. If you want that
     *         user to have full control, you must explicitly grant full control to
     *         the user. <p> If you omit <code>Permissions</code>, Elastic Transcoder
     *         grants full control over the transcoded files and playlists to the
     *         owner of the role specified by <code>Role</code>, and grants no other
     *         permissions to any other user or group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineOutputConfig withPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>(permissions.size());
            permissionsCopy.addAll(permissions);
            this.permissions = permissionsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getStorageClass() != null) sb.append("StorageClass: " + getStorageClass() + ",");
        if (getPermissions() != null) sb.append("Permissions: " + getPermissions() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PipelineOutputConfig == false) return false;
        PipelineOutputConfig other = (PipelineOutputConfig)obj;
        
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false; 
        if (other.getStorageClass() == null ^ this.getStorageClass() == null) return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false) return false; 
        if (other.getPermissions() == null ^ this.getPermissions() == null) return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false) return false; 
        return true;
    }
    
}
    