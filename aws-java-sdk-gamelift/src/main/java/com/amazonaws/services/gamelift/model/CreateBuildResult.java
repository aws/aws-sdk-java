/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 */
public class CreateBuildResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Set of properties for the newly created build.
     * </p>
     */
    private Build build;
    /**
     * <p>
     * AWS credentials required when uploading a game build to the storage location. These credentials have a limited
     * lifespan and are valid only for the build they were issued for. If you need to get fresh credentials, call
     * <code> <a>RequestUploadCredentials</a> </code>.
     * </p>
     */
    private Credentials uploadCredentials;
    /**
     * <p>
     * Amazon S3 path and key, identifying where the game build files are stored.
     * </p>
     */
    private S3Location storageLocation;

    /**
     * <p>
     * Set of properties for the newly created build.
     * </p>
     * 
     * @param build
     *        Set of properties for the newly created build.
     */

    public void setBuild(Build build) {
        this.build = build;
    }

    /**
     * <p>
     * Set of properties for the newly created build.
     * </p>
     * 
     * @return Set of properties for the newly created build.
     */

    public Build getBuild() {
        return this.build;
    }

    /**
     * <p>
     * Set of properties for the newly created build.
     * </p>
     * 
     * @param build
     *        Set of properties for the newly created build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildResult withBuild(Build build) {
        setBuild(build);
        return this;
    }

    /**
     * <p>
     * AWS credentials required when uploading a game build to the storage location. These credentials have a limited
     * lifespan and are valid only for the build they were issued for. If you need to get fresh credentials, call
     * <code> <a>RequestUploadCredentials</a> </code>.
     * </p>
     * 
     * @param uploadCredentials
     *        AWS credentials required when uploading a game build to the storage location. These credentials have a
     *        limited lifespan and are valid only for the build they were issued for. If you need to get fresh
     *        credentials, call <code> <a>RequestUploadCredentials</a> </code>.
     */

    public void setUploadCredentials(Credentials uploadCredentials) {
        this.uploadCredentials = uploadCredentials;
    }

    /**
     * <p>
     * AWS credentials required when uploading a game build to the storage location. These credentials have a limited
     * lifespan and are valid only for the build they were issued for. If you need to get fresh credentials, call
     * <code> <a>RequestUploadCredentials</a> </code>.
     * </p>
     * 
     * @return AWS credentials required when uploading a game build to the storage location. These credentials have a
     *         limited lifespan and are valid only for the build they were issued for. If you need to get fresh
     *         credentials, call <code> <a>RequestUploadCredentials</a> </code>.
     */

    public Credentials getUploadCredentials() {
        return this.uploadCredentials;
    }

    /**
     * <p>
     * AWS credentials required when uploading a game build to the storage location. These credentials have a limited
     * lifespan and are valid only for the build they were issued for. If you need to get fresh credentials, call
     * <code> <a>RequestUploadCredentials</a> </code>.
     * </p>
     * 
     * @param uploadCredentials
     *        AWS credentials required when uploading a game build to the storage location. These credentials have a
     *        limited lifespan and are valid only for the build they were issued for. If you need to get fresh
     *        credentials, call <code> <a>RequestUploadCredentials</a> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildResult withUploadCredentials(Credentials uploadCredentials) {
        setUploadCredentials(uploadCredentials);
        return this;
    }

    /**
     * <p>
     * Amazon S3 path and key, identifying where the game build files are stored.
     * </p>
     * 
     * @param storageLocation
     *        Amazon S3 path and key, identifying where the game build files are stored.
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * Amazon S3 path and key, identifying where the game build files are stored.
     * </p>
     * 
     * @return Amazon S3 path and key, identifying where the game build files are stored.
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * Amazon S3 path and key, identifying where the game build files are stored.
     * </p>
     * 
     * @param storageLocation
     *        Amazon S3 path and key, identifying where the game build files are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildResult withStorageLocation(S3Location storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBuild() != null)
            sb.append("Build: " + getBuild() + ",");
        if (getUploadCredentials() != null)
            sb.append("UploadCredentials: " + getUploadCredentials() + ",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: " + getStorageLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBuildResult == false)
            return false;
        CreateBuildResult other = (CreateBuildResult) obj;
        if (other.getBuild() == null ^ this.getBuild() == null)
            return false;
        if (other.getBuild() != null && other.getBuild().equals(this.getBuild()) == false)
            return false;
        if (other.getUploadCredentials() == null ^ this.getUploadCredentials() == null)
            return false;
        if (other.getUploadCredentials() != null && other.getUploadCredentials().equals(this.getUploadCredentials()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuild() == null) ? 0 : getBuild().hashCode());
        hashCode = prime * hashCode + ((getUploadCredentials() == null) ? 0 : getUploadCredentials().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateBuildResult clone() {
        try {
            return (CreateBuildResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
