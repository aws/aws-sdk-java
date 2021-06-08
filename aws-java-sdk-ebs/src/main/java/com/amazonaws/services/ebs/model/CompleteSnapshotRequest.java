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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/CompleteSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The number of blocks that were written to the snapshot.
     * </p>
     */
    private Integer changedBlocksCount;
    /**
     * <p>
     * An aggregated Base-64 SHA256 checksum based on the checksums of each written block.
     * </p>
     * <p>
     * To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each written
     * block in ascending order of their block index, concatenate them to form a single string, and then generate the
     * checksum on the entire string using the SHA256 algorithm.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     */
    private String checksumAlgorithm;
    /**
     * <p>
     * The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     * <code>LINEAR</code>.
     * </p>
     */
    private String checksumAggregationMethod;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteSnapshotRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The number of blocks that were written to the snapshot.
     * </p>
     * 
     * @param changedBlocksCount
     *        The number of blocks that were written to the snapshot.
     */

    public void setChangedBlocksCount(Integer changedBlocksCount) {
        this.changedBlocksCount = changedBlocksCount;
    }

    /**
     * <p>
     * The number of blocks that were written to the snapshot.
     * </p>
     * 
     * @return The number of blocks that were written to the snapshot.
     */

    public Integer getChangedBlocksCount() {
        return this.changedBlocksCount;
    }

    /**
     * <p>
     * The number of blocks that were written to the snapshot.
     * </p>
     * 
     * @param changedBlocksCount
     *        The number of blocks that were written to the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteSnapshotRequest withChangedBlocksCount(Integer changedBlocksCount) {
        setChangedBlocksCount(changedBlocksCount);
        return this;
    }

    /**
     * <p>
     * An aggregated Base-64 SHA256 checksum based on the checksums of each written block.
     * </p>
     * <p>
     * To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each written
     * block in ascending order of their block index, concatenate them to form a single string, and then generate the
     * checksum on the entire string using the SHA256 algorithm.
     * </p>
     * 
     * @param checksum
     *        An aggregated Base-64 SHA256 checksum based on the checksums of each written block.</p>
     *        <p>
     *        To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each
     *        written block in ascending order of their block index, concatenate them to form a single string, and then
     *        generate the checksum on the entire string using the SHA256 algorithm.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * An aggregated Base-64 SHA256 checksum based on the checksums of each written block.
     * </p>
     * <p>
     * To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each written
     * block in ascending order of their block index, concatenate them to form a single string, and then generate the
     * checksum on the entire string using the SHA256 algorithm.
     * </p>
     * 
     * @return An aggregated Base-64 SHA256 checksum based on the checksums of each written block.</p>
     *         <p>
     *         To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each
     *         written block in ascending order of their block index, concatenate them to form a single string, and then
     *         generate the checksum on the entire string using the SHA256 algorithm.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * An aggregated Base-64 SHA256 checksum based on the checksums of each written block.
     * </p>
     * <p>
     * To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each written
     * block in ascending order of their block index, concatenate them to form a single string, and then generate the
     * checksum on the entire string using the SHA256 algorithm.
     * </p>
     * 
     * @param checksum
     *        An aggregated Base-64 SHA256 checksum based on the checksums of each written block.</p>
     *        <p>
     *        To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each
     *        written block in ascending order of their block index, concatenate them to form a single string, and then
     *        generate the checksum on the entire string using the SHA256 algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteSnapshotRequest withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum. Currently, the only supported algorithm is
     *        <code>SHA256</code>.
     * @see ChecksumAlgorithm
     */

    public void setChecksumAlgorithm(String checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     * 
     * @return The algorithm used to generate the checksum. Currently, the only supported algorithm is
     *         <code>SHA256</code>.
     * @see ChecksumAlgorithm
     */

    public String getChecksumAlgorithm() {
        return this.checksumAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum. Currently, the only supported algorithm is
     *        <code>SHA256</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAlgorithm
     */

    public CompleteSnapshotRequest withChecksumAlgorithm(String checksumAlgorithm) {
        setChecksumAlgorithm(checksumAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum. Currently, the only supported algorithm is
     *        <code>SHA256</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAlgorithm
     */

    public CompleteSnapshotRequest withChecksumAlgorithm(ChecksumAlgorithm checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     * <code>LINEAR</code>.
     * </p>
     * 
     * @param checksumAggregationMethod
     *        The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     *        <code>LINEAR</code>.
     * @see ChecksumAggregationMethod
     */

    public void setChecksumAggregationMethod(String checksumAggregationMethod) {
        this.checksumAggregationMethod = checksumAggregationMethod;
    }

    /**
     * <p>
     * The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     * <code>LINEAR</code>.
     * </p>
     * 
     * @return The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     *         <code>LINEAR</code>.
     * @see ChecksumAggregationMethod
     */

    public String getChecksumAggregationMethod() {
        return this.checksumAggregationMethod;
    }

    /**
     * <p>
     * The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     * <code>LINEAR</code>.
     * </p>
     * 
     * @param checksumAggregationMethod
     *        The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     *        <code>LINEAR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAggregationMethod
     */

    public CompleteSnapshotRequest withChecksumAggregationMethod(String checksumAggregationMethod) {
        setChecksumAggregationMethod(checksumAggregationMethod);
        return this;
    }

    /**
     * <p>
     * The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     * <code>LINEAR</code>.
     * </p>
     * 
     * @param checksumAggregationMethod
     *        The aggregation method used to generate the checksum. Currently, the only supported aggregation method is
     *        <code>LINEAR</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAggregationMethod
     */

    public CompleteSnapshotRequest withChecksumAggregationMethod(ChecksumAggregationMethod checksumAggregationMethod) {
        this.checksumAggregationMethod = checksumAggregationMethod.toString();
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getChangedBlocksCount() != null)
            sb.append("ChangedBlocksCount: ").append(getChangedBlocksCount()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getChecksumAlgorithm() != null)
            sb.append("ChecksumAlgorithm: ").append(getChecksumAlgorithm()).append(",");
        if (getChecksumAggregationMethod() != null)
            sb.append("ChecksumAggregationMethod: ").append(getChecksumAggregationMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteSnapshotRequest == false)
            return false;
        CompleteSnapshotRequest other = (CompleteSnapshotRequest) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getChangedBlocksCount() == null ^ this.getChangedBlocksCount() == null)
            return false;
        if (other.getChangedBlocksCount() != null && other.getChangedBlocksCount().equals(this.getChangedBlocksCount()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getChecksumAlgorithm() == null ^ this.getChecksumAlgorithm() == null)
            return false;
        if (other.getChecksumAlgorithm() != null && other.getChecksumAlgorithm().equals(this.getChecksumAlgorithm()) == false)
            return false;
        if (other.getChecksumAggregationMethod() == null ^ this.getChecksumAggregationMethod() == null)
            return false;
        if (other.getChecksumAggregationMethod() != null && other.getChecksumAggregationMethod().equals(this.getChecksumAggregationMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getChangedBlocksCount() == null) ? 0 : getChangedBlocksCount().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getChecksumAlgorithm() == null) ? 0 : getChecksumAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getChecksumAggregationMethod() == null) ? 0 : getChecksumAggregationMethod().hashCode());
        return hashCode;
    }

    @Override
    public CompleteSnapshotRequest clone() {
        return (CompleteSnapshotRequest) super.clone();
    }

}
