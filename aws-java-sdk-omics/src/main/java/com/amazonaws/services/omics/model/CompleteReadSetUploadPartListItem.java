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
 * Part of the response to the CompleteReadSetUpload API, including metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CompleteReadSetUploadPartListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteReadSetUploadPartListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A number identifying the part in a read set upload.
     * </p>
     */
    private Integer partNumber;
    /**
     * <p>
     * The source file of the part being uploaded.
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
     * A number identifying the part in a read set upload.
     * </p>
     * 
     * @param partNumber
     *        A number identifying the part in a read set upload.
     */

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * A number identifying the part in a read set upload.
     * </p>
     * 
     * @return A number identifying the part in a read set upload.
     */

    public Integer getPartNumber() {
        return this.partNumber;
    }

    /**
     * <p>
     * A number identifying the part in a read set upload.
     * </p>
     * 
     * @param partNumber
     *        A number identifying the part in a read set upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteReadSetUploadPartListItem withPartNumber(Integer partNumber) {
        setPartNumber(partNumber);
        return this;
    }

    /**
     * <p>
     * The source file of the part being uploaded.
     * </p>
     * 
     * @param partSource
     *        The source file of the part being uploaded.
     * @see ReadSetPartSource
     */

    public void setPartSource(String partSource) {
        this.partSource = partSource;
    }

    /**
     * <p>
     * The source file of the part being uploaded.
     * </p>
     * 
     * @return The source file of the part being uploaded.
     * @see ReadSetPartSource
     */

    public String getPartSource() {
        return this.partSource;
    }

    /**
     * <p>
     * The source file of the part being uploaded.
     * </p>
     * 
     * @param partSource
     *        The source file of the part being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetPartSource
     */

    public CompleteReadSetUploadPartListItem withPartSource(String partSource) {
        setPartSource(partSource);
        return this;
    }

    /**
     * <p>
     * The source file of the part being uploaded.
     * </p>
     * 
     * @param partSource
     *        The source file of the part being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetPartSource
     */

    public CompleteReadSetUploadPartListItem withPartSource(ReadSetPartSource partSource) {
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

    public CompleteReadSetUploadPartListItem withChecksum(String checksum) {
        setChecksum(checksum);
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
        if (getPartSource() != null)
            sb.append("PartSource: ").append(getPartSource()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteReadSetUploadPartListItem == false)
            return false;
        CompleteReadSetUploadPartListItem other = (CompleteReadSetUploadPartListItem) obj;
        if (other.getPartNumber() == null ^ this.getPartNumber() == null)
            return false;
        if (other.getPartNumber() != null && other.getPartNumber().equals(this.getPartNumber()) == false)
            return false;
        if (other.getPartSource() == null ^ this.getPartSource() == null)
            return false;
        if (other.getPartSource() != null && other.getPartSource().equals(this.getPartSource()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartNumber() == null) ? 0 : getPartNumber().hashCode());
        hashCode = prime * hashCode + ((getPartSource() == null) ? 0 : getPartSource().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        return hashCode;
    }

    @Override
    public CompleteReadSetUploadPartListItem clone() {
        try {
            return (CompleteReadSetUploadPartListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.CompleteReadSetUploadPartListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
