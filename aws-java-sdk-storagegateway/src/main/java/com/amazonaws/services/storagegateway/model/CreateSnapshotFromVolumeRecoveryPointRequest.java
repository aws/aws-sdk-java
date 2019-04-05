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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateSnapshotFromVolumeRecoveryPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotFromVolumeRecoveryPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a> operation to
     * return to retrieve the TargetARN for specified VolumeARN.
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel
     * in the <b>Description</b> field, and in the AWS Storage Gateway snapshot <b>Details</b> pane, <b>Description</b>
     * field
     * </p>
     */
    private String snapshotDescription;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a> operation to
     * return to retrieve the TargetARN for specified VolumeARN.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a>
     *        operation to return to retrieve the TargetARN for specified VolumeARN.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a> operation to
     * return to retrieve the TargetARN for specified VolumeARN.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a>
     *         operation to return to retrieve the TargetARN for specified VolumeARN.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a> operation to
     * return to retrieve the TargetARN for specified VolumeARN.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the iSCSI volume target. Use the <a>DescribeStorediSCSIVolumes</a>
     *        operation to return to retrieve the TargetARN for specified VolumeARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotFromVolumeRecoveryPointRequest withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel
     * in the <b>Description</b> field, and in the AWS Storage Gateway snapshot <b>Details</b> pane, <b>Description</b>
     * field
     * </p>
     * 
     * @param snapshotDescription
     *        Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots
     *        panel in the <b>Description</b> field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     *        <b>Description</b> field
     */

    public void setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
    }

    /**
     * <p>
     * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel
     * in the <b>Description</b> field, and in the AWS Storage Gateway snapshot <b>Details</b> pane, <b>Description</b>
     * field
     * </p>
     * 
     * @return Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots
     *         panel in the <b>Description</b> field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     *         <b>Description</b> field
     */

    public String getSnapshotDescription() {
        return this.snapshotDescription;
    }

    /**
     * <p>
     * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel
     * in the <b>Description</b> field, and in the AWS Storage Gateway snapshot <b>Details</b> pane, <b>Description</b>
     * field
     * </p>
     * 
     * @param snapshotDescription
     *        Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots
     *        panel in the <b>Description</b> field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     *        <b>Description</b> field
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotFromVolumeRecoveryPointRequest withSnapshotDescription(String snapshotDescription) {
        setSnapshotDescription(snapshotDescription);
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
        if (getSnapshotDescription() != null)
            sb.append("SnapshotDescription: ").append(getSnapshotDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotFromVolumeRecoveryPointRequest == false)
            return false;
        CreateSnapshotFromVolumeRecoveryPointRequest other = (CreateSnapshotFromVolumeRecoveryPointRequest) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getSnapshotDescription() == null ^ this.getSnapshotDescription() == null)
            return false;
        if (other.getSnapshotDescription() != null && other.getSnapshotDescription().equals(this.getSnapshotDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getSnapshotDescription() == null) ? 0 : getSnapshotDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotFromVolumeRecoveryPointRequest clone() {
        return (CreateSnapshotFromVolumeRecoveryPointRequest) super.clone();
    }

}
