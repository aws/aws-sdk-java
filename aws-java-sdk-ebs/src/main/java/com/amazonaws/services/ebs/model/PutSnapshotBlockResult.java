/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ebs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/PutSnapshotBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSnapshotBlockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The SHA256 checksum generated for the block data by Amazon EBS.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The algorithm used by Amazon EBS to generate the checksum.
     * </p>
     */
    private String checksumAlgorithm;

    /**
     * <p>
     * The SHA256 checksum generated for the block data by Amazon EBS.
     * </p>
     * 
     * @param checksum
     *        The SHA256 checksum generated for the block data by Amazon EBS.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The SHA256 checksum generated for the block data by Amazon EBS.
     * </p>
     * 
     * @return The SHA256 checksum generated for the block data by Amazon EBS.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The SHA256 checksum generated for the block data by Amazon EBS.
     * </p>
     * 
     * @param checksum
     *        The SHA256 checksum generated for the block data by Amazon EBS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSnapshotBlockResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The algorithm used by Amazon EBS to generate the checksum.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used by Amazon EBS to generate the checksum.
     * @see ChecksumAlgorithm
     */

    public void setChecksumAlgorithm(String checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    /**
     * <p>
     * The algorithm used by Amazon EBS to generate the checksum.
     * </p>
     * 
     * @return The algorithm used by Amazon EBS to generate the checksum.
     * @see ChecksumAlgorithm
     */

    public String getChecksumAlgorithm() {
        return this.checksumAlgorithm;
    }

    /**
     * <p>
     * The algorithm used by Amazon EBS to generate the checksum.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used by Amazon EBS to generate the checksum.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAlgorithm
     */

    public PutSnapshotBlockResult withChecksumAlgorithm(String checksumAlgorithm) {
        setChecksumAlgorithm(checksumAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm used by Amazon EBS to generate the checksum.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used by Amazon EBS to generate the checksum.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAlgorithm
     */

    public PutSnapshotBlockResult withChecksumAlgorithm(ChecksumAlgorithm checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm.toString();
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
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getChecksumAlgorithm() != null)
            sb.append("ChecksumAlgorithm: ").append(getChecksumAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSnapshotBlockResult == false)
            return false;
        PutSnapshotBlockResult other = (PutSnapshotBlockResult) obj;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getChecksumAlgorithm() == null ^ this.getChecksumAlgorithm() == null)
            return false;
        if (other.getChecksumAlgorithm() != null && other.getChecksumAlgorithm().equals(this.getChecksumAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getChecksumAlgorithm() == null) ? 0 : getChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public PutSnapshotBlockResult clone() {
        try {
            return (PutSnapshotBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
