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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBuildResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The newly created build record, including a unique build ID and status.
     * </p>
     */
    private Build build;
    /**
     * <p>
     * This element is returned only when the operation is called without a storage location. It contains credentials to
     * use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon GameLift. Credentials have
     * a limited life span. To refresh these credentials, call <a>RequestUploadCredentials</a>.
     * </p>
     */
    private Credentials uploadCredentials;
    /**
     * <p>
     * Amazon S3 location for your game build file, including bucket name and key.
     * </p>
     */
    private S3Location storageLocation;

    /**
     * <p>
     * The newly created build record, including a unique build ID and status.
     * </p>
     * 
     * @param build
     *        The newly created build record, including a unique build ID and status.
     */

    public void setBuild(Build build) {
        this.build = build;
    }

    /**
     * <p>
     * The newly created build record, including a unique build ID and status.
     * </p>
     * 
     * @return The newly created build record, including a unique build ID and status.
     */

    public Build getBuild() {
        return this.build;
    }

    /**
     * <p>
     * The newly created build record, including a unique build ID and status.
     * </p>
     * 
     * @param build
     *        The newly created build record, including a unique build ID and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildResult withBuild(Build build) {
        setBuild(build);
        return this;
    }

    /**
     * <p>
     * This element is returned only when the operation is called without a storage location. It contains credentials to
     * use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon GameLift. Credentials have
     * a limited life span. To refresh these credentials, call <a>RequestUploadCredentials</a>.
     * </p>
     * 
     * @param uploadCredentials
     *        This element is returned only when the operation is called without a storage location. It contains
     *        credentials to use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon
     *        GameLift. Credentials have a limited life span. To refresh these credentials, call
     *        <a>RequestUploadCredentials</a>.
     */

    public void setUploadCredentials(Credentials uploadCredentials) {
        this.uploadCredentials = uploadCredentials;
    }

    /**
     * <p>
     * This element is returned only when the operation is called without a storage location. It contains credentials to
     * use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon GameLift. Credentials have
     * a limited life span. To refresh these credentials, call <a>RequestUploadCredentials</a>.
     * </p>
     * 
     * @return This element is returned only when the operation is called without a storage location. It contains
     *         credentials to use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon
     *         GameLift. Credentials have a limited life span. To refresh these credentials, call
     *         <a>RequestUploadCredentials</a>.
     */

    public Credentials getUploadCredentials() {
        return this.uploadCredentials;
    }

    /**
     * <p>
     * This element is returned only when the operation is called without a storage location. It contains credentials to
     * use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon GameLift. Credentials have
     * a limited life span. To refresh these credentials, call <a>RequestUploadCredentials</a>.
     * </p>
     * 
     * @param uploadCredentials
     *        This element is returned only when the operation is called without a storage location. It contains
     *        credentials to use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon
     *        GameLift. Credentials have a limited life span. To refresh these credentials, call
     *        <a>RequestUploadCredentials</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildResult withUploadCredentials(Credentials uploadCredentials) {
        setUploadCredentials(uploadCredentials);
        return this;
    }

    /**
     * <p>
     * Amazon S3 location for your game build file, including bucket name and key.
     * </p>
     * 
     * @param storageLocation
     *        Amazon S3 location for your game build file, including bucket name and key.
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * Amazon S3 location for your game build file, including bucket name and key.
     * </p>
     * 
     * @return Amazon S3 location for your game build file, including bucket name and key.
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * Amazon S3 location for your game build file, including bucket name and key.
     * </p>
     * 
     * @param storageLocation
     *        Amazon S3 location for your game build file, including bucket name and key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildResult withStorageLocation(S3Location storageLocation) {
        setStorageLocation(storageLocation);
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
        if (getBuild() != null)
            sb.append("Build: ").append(getBuild()).append(",");
        if (getUploadCredentials() != null)
            sb.append("UploadCredentials: ").append("***Sensitive Data Redacted***").append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation());
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
