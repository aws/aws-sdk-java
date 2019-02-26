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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon
     * Elastic Compute Cloud API <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotResult withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon
     * Elastic Compute Cloud API <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots
     *        (Amazon Elastic Compute Cloud API <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     *        (<a>CreateStorediSCSIVolume</a>).
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon
     * Elastic Compute Cloud API <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * </p>
     * 
     * @return The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots
     *         (Amazon Elastic Compute Cloud API <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     *         (<a>CreateStorediSCSIVolume</a>).
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon
     * Elastic Compute Cloud API <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * </p>
     * 
     * @param snapshotId
     *        The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots
     *        (Amazon Elastic Compute Cloud API <code>DescribeSnapshots</code>) or creating a volume from a snapshot
     *        (<a>CreateStorediSCSIVolume</a>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotResult == false)
            return false;
        CreateSnapshotResult other = (CreateSnapshotResult) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotResult clone() {
        try {
            return (CreateSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
