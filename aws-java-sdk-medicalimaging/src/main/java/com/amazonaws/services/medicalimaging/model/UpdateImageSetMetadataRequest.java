/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/UpdateImageSetMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateImageSetMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The image set identifier.
     * </p>
     */
    private String imageSetId;
    /**
     * <p>
     * The latest image set version identifier.
     * </p>
     */
    private String latestVersionId;
    /**
     * <p>
     * Update image set metadata updates.
     * </p>
     */
    private MetadataUpdates updateImageSetMetadataUpdates;

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     */

    public void setImageSetId(String imageSetId) {
        this.imageSetId = imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @return The image set identifier.
     */

    public String getImageSetId() {
        return this.imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataRequest withImageSetId(String imageSetId) {
        setImageSetId(imageSetId);
        return this;
    }

    /**
     * <p>
     * The latest image set version identifier.
     * </p>
     * 
     * @param latestVersionId
     *        The latest image set version identifier.
     */

    public void setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    /**
     * <p>
     * The latest image set version identifier.
     * </p>
     * 
     * @return The latest image set version identifier.
     */

    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    /**
     * <p>
     * The latest image set version identifier.
     * </p>
     * 
     * @param latestVersionId
     *        The latest image set version identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataRequest withLatestVersionId(String latestVersionId) {
        setLatestVersionId(latestVersionId);
        return this;
    }

    /**
     * <p>
     * Update image set metadata updates.
     * </p>
     * 
     * @param updateImageSetMetadataUpdates
     *        Update image set metadata updates.
     */

    public void setUpdateImageSetMetadataUpdates(MetadataUpdates updateImageSetMetadataUpdates) {
        this.updateImageSetMetadataUpdates = updateImageSetMetadataUpdates;
    }

    /**
     * <p>
     * Update image set metadata updates.
     * </p>
     * 
     * @return Update image set metadata updates.
     */

    public MetadataUpdates getUpdateImageSetMetadataUpdates() {
        return this.updateImageSetMetadataUpdates;
    }

    /**
     * <p>
     * Update image set metadata updates.
     * </p>
     * 
     * @param updateImageSetMetadataUpdates
     *        Update image set metadata updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageSetMetadataRequest withUpdateImageSetMetadataUpdates(MetadataUpdates updateImageSetMetadataUpdates) {
        setUpdateImageSetMetadataUpdates(updateImageSetMetadataUpdates);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getImageSetId() != null)
            sb.append("ImageSetId: ").append(getImageSetId()).append(",");
        if (getLatestVersionId() != null)
            sb.append("LatestVersionId: ").append(getLatestVersionId()).append(",");
        if (getUpdateImageSetMetadataUpdates() != null)
            sb.append("UpdateImageSetMetadataUpdates: ").append(getUpdateImageSetMetadataUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateImageSetMetadataRequest == false)
            return false;
        UpdateImageSetMetadataRequest other = (UpdateImageSetMetadataRequest) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getImageSetId() == null ^ this.getImageSetId() == null)
            return false;
        if (other.getImageSetId() != null && other.getImageSetId().equals(this.getImageSetId()) == false)
            return false;
        if (other.getLatestVersionId() == null ^ this.getLatestVersionId() == null)
            return false;
        if (other.getLatestVersionId() != null && other.getLatestVersionId().equals(this.getLatestVersionId()) == false)
            return false;
        if (other.getUpdateImageSetMetadataUpdates() == null ^ this.getUpdateImageSetMetadataUpdates() == null)
            return false;
        if (other.getUpdateImageSetMetadataUpdates() != null
                && other.getUpdateImageSetMetadataUpdates().equals(this.getUpdateImageSetMetadataUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getImageSetId() == null) ? 0 : getImageSetId().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionId() == null) ? 0 : getLatestVersionId().hashCode());
        hashCode = prime * hashCode + ((getUpdateImageSetMetadataUpdates() == null) ? 0 : getUpdateImageSetMetadataUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateImageSetMetadataRequest clone() {
        return (UpdateImageSetMetadataRequest) super.clone();
    }

}
