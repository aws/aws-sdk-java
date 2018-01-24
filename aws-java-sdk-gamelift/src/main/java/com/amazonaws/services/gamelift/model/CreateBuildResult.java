/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * This element is not currently in use.
     * </p>
     */
    private Credentials uploadCredentials;
    /**
     * <p>
     * Amazon S3 location specified in the request.
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
     * This element is not currently in use.
     * </p>
     * 
     * @param uploadCredentials
     *        This element is not currently in use.
     */

    public void setUploadCredentials(Credentials uploadCredentials) {
        this.uploadCredentials = uploadCredentials;
    }

    /**
     * <p>
     * This element is not currently in use.
     * </p>
     * 
     * @return This element is not currently in use.
     */

    public Credentials getUploadCredentials() {
        return this.uploadCredentials;
    }

    /**
     * <p>
     * This element is not currently in use.
     * </p>
     * 
     * @param uploadCredentials
     *        This element is not currently in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildResult withUploadCredentials(Credentials uploadCredentials) {
        setUploadCredentials(uploadCredentials);
        return this;
    }

    /**
     * <p>
     * Amazon S3 location specified in the request.
     * </p>
     * 
     * @param storageLocation
     *        Amazon S3 location specified in the request.
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * Amazon S3 location specified in the request.
     * </p>
     * 
     * @return Amazon S3 location specified in the request.
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * Amazon S3 location specified in the request.
     * </p>
     * 
     * @param storageLocation
     *        Amazon S3 location specified in the request.
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
            sb.append("Build: ").append(getBuild()).append(",");
        if (getUploadCredentials() != null)
            sb.append("UploadCredentials: ").append(getUploadCredentials()).append(",");
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
