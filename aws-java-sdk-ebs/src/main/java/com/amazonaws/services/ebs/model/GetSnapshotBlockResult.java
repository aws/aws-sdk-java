/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/GetSnapshotBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSnapshotBlockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The size of the data in the block.
     * </p>
     */
    private Integer dataLength;
    /**
     * <p>
     * The data content of the block.
     * </p>
     */
    private java.io.InputStream blockData;
    /**
     * <p>
     * The checksum generated for the block, which is Base64 encoded.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The algorithm used to generate the checksum for the block, such as SHA256.
     * </p>
     */
    private String checksumAlgorithm;

    /**
     * <p>
     * The size of the data in the block.
     * </p>
     * 
     * @param dataLength
     *        The size of the data in the block.
     */

    public void setDataLength(Integer dataLength) {
        this.dataLength = dataLength;
    }

    /**
     * <p>
     * The size of the data in the block.
     * </p>
     * 
     * @return The size of the data in the block.
     */

    public Integer getDataLength() {
        return this.dataLength;
    }

    /**
     * <p>
     * The size of the data in the block.
     * </p>
     * 
     * @param dataLength
     *        The size of the data in the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotBlockResult withDataLength(Integer dataLength) {
        setDataLength(dataLength);
        return this;
    }

    /**
     * <p>
     * The data content of the block.
     * </p>
     * 
     * @param blockData
     *        The data content of the block.
     */

    public void setBlockData(java.io.InputStream blockData) {
        this.blockData = blockData;
    }

    /**
     * <p>
     * The data content of the block.
     * </p>
     * 
     * @return The data content of the block.
     */

    public java.io.InputStream getBlockData() {
        return this.blockData;
    }

    /**
     * <p>
     * The data content of the block.
     * </p>
     * 
     * @param blockData
     *        The data content of the block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotBlockResult withBlockData(java.io.InputStream blockData) {
        setBlockData(blockData);
        return this;
    }

    /**
     * <p>
     * The checksum generated for the block, which is Base64 encoded.
     * </p>
     * 
     * @param checksum
     *        The checksum generated for the block, which is Base64 encoded.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * The checksum generated for the block, which is Base64 encoded.
     * </p>
     * 
     * @return The checksum generated for the block, which is Base64 encoded.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * The checksum generated for the block, which is Base64 encoded.
     * </p>
     * 
     * @param checksum
     *        The checksum generated for the block, which is Base64 encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSnapshotBlockResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum for the block, such as SHA256.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum for the block, such as SHA256.
     * @see ChecksumAlgorithm
     */

    public void setChecksumAlgorithm(String checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum for the block, such as SHA256.
     * </p>
     * 
     * @return The algorithm used to generate the checksum for the block, such as SHA256.
     * @see ChecksumAlgorithm
     */

    public String getChecksumAlgorithm() {
        return this.checksumAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum for the block, such as SHA256.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum for the block, such as SHA256.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAlgorithm
     */

    public GetSnapshotBlockResult withChecksumAlgorithm(String checksumAlgorithm) {
        setChecksumAlgorithm(checksumAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum for the block, such as SHA256.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum for the block, such as SHA256.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAlgorithm
     */

    public GetSnapshotBlockResult withChecksumAlgorithm(ChecksumAlgorithm checksumAlgorithm) {
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
        if (getDataLength() != null)
            sb.append("DataLength: ").append(getDataLength()).append(",");
        if (getBlockData() != null)
            sb.append("BlockData: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof GetSnapshotBlockResult == false)
            return false;
        GetSnapshotBlockResult other = (GetSnapshotBlockResult) obj;
        if (other.getDataLength() == null ^ this.getDataLength() == null)
            return false;
        if (other.getDataLength() != null && other.getDataLength().equals(this.getDataLength()) == false)
            return false;
        if (other.getBlockData() == null ^ this.getBlockData() == null)
            return false;
        if (other.getBlockData() != null && other.getBlockData().equals(this.getBlockData()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDataLength() == null) ? 0 : getDataLength().hashCode());
        hashCode = prime * hashCode + ((getBlockData() == null) ? 0 : getBlockData().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getChecksumAlgorithm() == null) ? 0 : getChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public GetSnapshotBlockResult clone() {
        try {
            return (GetSnapshotBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
