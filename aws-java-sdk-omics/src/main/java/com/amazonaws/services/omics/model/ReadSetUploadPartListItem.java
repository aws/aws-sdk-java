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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata of a single part of a file that was added to a multipart upload. A list of these parts is returned in
 * the response to the ListReadSetUploadParts API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ReadSetUploadPartListItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReadSetUploadPartListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number identifying the part in an upload.
     * </p>
     */
    private Integer partNumber;
    /**
     * <p>
     * The size of the the part in an upload.
     * </p>
     */
    private Long partSize;
    /**
     * <p>
     * The origin of the part being direct uploaded.
     * </p>
     */
    private String partSource;
    /**
     * <p>
     * A unique identifier used to confirm that parts are being added to the correct upload.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The time stamp for when a direct upload was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time stamp for the most recent update to an uploaded part.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The number identifying the part in an upload.
     * </p>
     * 
     * @param partNumber
     *        The number identifying the part in an upload.
     */

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * The number identifying the part in an upload.
     * </p>
     * 
     * @return The number identifying the part in an upload.
     */

    public Integer getPartNumber() {
        return this.partNumber;
    }

    /**
     * <p>
     * The number identifying the part in an upload.
     * </p>
     * 
     * @param partNumber
     *        The number identifying the part in an upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadSetUploadPartListItem withPartNumber(Integer partNumber) {
        setPartNumber(partNumber);
        return this;
    }

    /**
     * <p>
     * The size of the the part in an upload.
     * </p>
     * 
     * @param partSize
     *        The size of the the part in an upload.
     */

    public void setPartSize(Long partSize) {
        this.partSize = partSize;
    }

    /**
     * <p>
     * The size of the the part in an upload.
     * </p>
     * 
     * @return The size of the the part in an upload.
     */

    public Long getPartSize() {
        return this.partSize;
    }

    /**
     * <p>
     * The size of the the part in an upload.
     * </p>
     * 
     * @param partSize
     *        The size of the the part in an upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadSetUploadPartListItem withPartSize(Long partSize) {
        setPartSize(partSize);
        return this;
    }

    /**
     * <p>
     * The origin of the part being direct uploaded.
     * </p>
     * 
     * @param partSource
     *        The origin of the part being direct uploaded.
     * @see ReadSetPartSource
     */

    public void setPartSource(String partSource) {
        this.partSource = partSource;
    }

    /**
     * <p>
     * The origin of the part being direct uploaded.
     * </p>
     * 
     * @return The origin of the part being direct uploaded.
     * @see ReadSetPartSource
     */

    public String getPartSource() {
        return this.partSource;
    }

    /**
     * <p>
     * The origin of the part being direct uploaded.
     * </p>
     * 
     * @param partSource
     *        The origin of the part being direct uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetPartSource
     */

    public ReadSetUploadPartListItem withPartSource(String partSource) {
        setPartSource(partSource);
        return this;
    }

    /**
     * <p>
     * The origin of the part being direct uploaded.
     * </p>
     * 
     * @param partSource
     *        The origin of the part being direct uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetPartSource
     */

    public ReadSetUploadPartListItem withPartSource(ReadSetPartSource partSource) {
        this.partSource = partSource.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier used to confirm that parts are being added to the correct upload.
     * </p>
     * 
     * @param checksum
     *        A unique identifier used to confirm that parts are being added to the correct upload.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * A unique identifier used to confirm that parts are being added to the correct upload.
     * </p>
     * 
     * @return A unique identifier used to confirm that parts are being added to the correct upload.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * A unique identifier used to confirm that parts are being added to the correct upload.
     * </p>
     * 
     * @param checksum
     *        A unique identifier used to confirm that parts are being added to the correct upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadSetUploadPartListItem withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The time stamp for when a direct upload was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for when a direct upload was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time stamp for when a direct upload was created.
     * </p>
     * 
     * @return The time stamp for when a direct upload was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time stamp for when a direct upload was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for when a direct upload was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadSetUploadPartListItem withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time stamp for the most recent update to an uploaded part.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time stamp for the most recent update to an uploaded part.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time stamp for the most recent update to an uploaded part.
     * </p>
     * 
     * @return The time stamp for the most recent update to an uploaded part.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time stamp for the most recent update to an uploaded part.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time stamp for the most recent update to an uploaded part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadSetUploadPartListItem withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getPartNumber() != null)
            sb.append("PartNumber: ").append(getPartNumber()).append(",");
        if (getPartSize() != null)
            sb.append("PartSize: ").append(getPartSize()).append(",");
        if (getPartSource() != null)
            sb.append("PartSource: ").append(getPartSource()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReadSetUploadPartListItem == false)
            return false;
        ReadSetUploadPartListItem other = (ReadSetUploadPartListItem) obj;
        if (other.getPartNumber() == null ^ this.getPartNumber() == null)
            return false;
        if (other.getPartNumber() != null && other.getPartNumber().equals(this.getPartNumber()) == false)
            return false;
        if (other.getPartSize() == null ^ this.getPartSize() == null)
            return false;
        if (other.getPartSize() != null && other.getPartSize().equals(this.getPartSize()) == false)
            return false;
        if (other.getPartSource() == null ^ this.getPartSource() == null)
            return false;
        if (other.getPartSource() != null && other.getPartSource().equals(this.getPartSource()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartNumber() == null) ? 0 : getPartNumber().hashCode());
        hashCode = prime * hashCode + ((getPartSize() == null) ? 0 : getPartSize().hashCode());
        hashCode = prime * hashCode + ((getPartSource() == null) ? 0 : getPartSource().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ReadSetUploadPartListItem clone() {
        try {
            return (ReadSetUploadPartListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ReadSetUploadPartListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
