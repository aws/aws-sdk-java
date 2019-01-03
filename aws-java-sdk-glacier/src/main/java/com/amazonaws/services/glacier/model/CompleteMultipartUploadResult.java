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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 * <p>
 * For information about the underlying REST API, see <a
 * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html">Upload Archive</a>. For conceptual
 * information, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working
 * with Archives in Amazon Glacier</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteMultipartUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The relative URI path of the newly added archive resource.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The checksum of the archive computed by Amazon Glacier.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The ID of the archive. This value is also included as part of the location.
     * </p>
     */
    private String archiveId;

    /**
     * <p>
     * The relative URI path of the newly added archive resource.
     * </p>
     * 
     * @param location
     *        The relative URI path of the newly added archive resource.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The relative URI path of the newly added archive resource.
     * </p>
     * 
     * @return The relative URI path of the newly added archive resource.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The relative URI path of the newly added archive resource.
     * </p>
     * 
     * @param location
     *        The relative URI path of the newly added archive resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartUploadResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The checksum of the archive computed by Amazon Glacier.
     * </p>
     * 
     * @param checksum
     *        The checksum of the archive computed by Amazon Glacier.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The checksum of the archive computed by Amazon Glacier.
     * </p>
     * 
     * @return The checksum of the archive computed by Amazon Glacier.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The checksum of the archive computed by Amazon Glacier.
     * </p>
     * 
     * @param checksum
     *        The checksum of the archive computed by Amazon Glacier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartUploadResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The ID of the archive. This value is also included as part of the location.
     * </p>
     * 
     * @param archiveId
     *        The ID of the archive. This value is also included as part of the location.
     */

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * <p>
     * The ID of the archive. This value is also included as part of the location.
     * </p>
     * 
     * @return The ID of the archive. This value is also included as part of the location.
     */

    public String getArchiveId() {
        return this.archiveId;
    }

    /**
     * <p>
     * The ID of the archive. This value is also included as part of the location.
     * </p>
     * 
     * @param archiveId
     *        The ID of the archive. This value is also included as part of the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteMultipartUploadResult withArchiveId(String archiveId) {
        setArchiveId(archiveId);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getArchiveId() != null)
            sb.append("ArchiveId: ").append(getArchiveId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteMultipartUploadResult == false)
            return false;
        CompleteMultipartUploadResult other = (CompleteMultipartUploadResult) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getArchiveId() == null ^ this.getArchiveId() == null)
            return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode());
        return hashCode;
    }

    @Override
    public CompleteMultipartUploadResult clone() {
        try {
            return (CompleteMultipartUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
