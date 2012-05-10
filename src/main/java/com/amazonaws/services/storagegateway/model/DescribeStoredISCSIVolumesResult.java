/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

/**
 * <p>
 * A JSON object containing a list of
 * DescribeStorediSCSIVolumesOutput$StorediSCSIVolumes.
 * </p>
 */
public class DescribeStoredISCSIVolumesResult {

    /**
     * Describes a single unit of output from
     * <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     * <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     * enabled for the iSCSI target. </li> <li>
     * <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     * StorediSCSIVolume (p. 203) objects where each object contains metadata
     * about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     * disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     * interface ID of the stored volume that initiator use to map the stored
     * volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     * The port used to communicate with iSCSI targets. </li> <li>
     * <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     * was created, existing data on the underlying local disk was preserved.
     * <p><i>Valid Values</i>: true, false </li> <li>
     * <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * snap-1122aabb. Otherwise, this field is not included. </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     * target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     * of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     * of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     * <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     * vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     * percentage complete if the volume is restoring or bootstrapping that
     * represents the percent of data transferred. This field does not appear
     * in the response if the stored volume is not restoring or
     * bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     * volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     * <a>VolumeStatus</a> values that indicates the state of the volume.
     * </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     * describing the type of the volume. Currently, on STORED volumes are
     * supported. </li> </ul>
     */
    private java.util.List<StoredISCSIVolume> storedISCSIVolumes;

    /**
     * Describes a single unit of output from
     * <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     * <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     * enabled for the iSCSI target. </li> <li>
     * <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     * StorediSCSIVolume (p. 203) objects where each object contains metadata
     * about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     * disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     * interface ID of the stored volume that initiator use to map the stored
     * volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     * The port used to communicate with iSCSI targets. </li> <li>
     * <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     * was created, existing data on the underlying local disk was preserved.
     * <p><i>Valid Values</i>: true, false </li> <li>
     * <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * snap-1122aabb. Otherwise, this field is not included. </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     * target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     * of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     * of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     * <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     * vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     * percentage complete if the volume is restoring or bootstrapping that
     * represents the percent of data transferred. This field does not appear
     * in the response if the stored volume is not restoring or
     * bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     * volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     * <a>VolumeStatus</a> values that indicates the state of the volume.
     * </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     * describing the type of the volume. Currently, on STORED volumes are
     * supported. </li> </ul>
     *
     * @return Describes a single unit of output from
     *         <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     *         <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     *         enabled for the iSCSI target. </li> <li>
     *         <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     *         object that represents a collection of iSCSI attributes for one stored
     *         volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     *         StorediSCSIVolume (p. 203) objects where each object contains metadata
     *         about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     *         disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     *         interface ID of the stored volume that initiator use to map the stored
     *         volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     *         The port used to communicate with iSCSI targets. </li> <li>
     *         <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     *         was created, existing data on the underlying local disk was preserved.
     *         <p><i>Valid Values</i>: true, false </li> <li>
     *         <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     *         snapshot, this field contains the snapshot ID used, e.g.
     *         snap-1122aabb. Otherwise, this field is not included. </li> <li>
     *         <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     *         target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     *         of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     *         of the local disk that was specified in the
     *         <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     *         <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     *         vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     *         percentage complete if the volume is restoring or bootstrapping that
     *         represents the percent of data transferred. This field does not appear
     *         in the response if the stored volume is not restoring or
     *         bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     *         volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     *         <a>VolumeStatus</a> values that indicates the state of the volume.
     *         </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     *         describing the type of the volume. Currently, on STORED volumes are
     *         supported. </li> </ul>
     */
    public java.util.List<StoredISCSIVolume> getStoredISCSIVolumes() {
        
        if (storedISCSIVolumes == null) {
            storedISCSIVolumes = new java.util.ArrayList<StoredISCSIVolume>();
        }
        return storedISCSIVolumes;
    }
    
    /**
     * Describes a single unit of output from
     * <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     * <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     * enabled for the iSCSI target. </li> <li>
     * <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     * StorediSCSIVolume (p. 203) objects where each object contains metadata
     * about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     * disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     * interface ID of the stored volume that initiator use to map the stored
     * volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     * The port used to communicate with iSCSI targets. </li> <li>
     * <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     * was created, existing data on the underlying local disk was preserved.
     * <p><i>Valid Values</i>: true, false </li> <li>
     * <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * snap-1122aabb. Otherwise, this field is not included. </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     * target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     * of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     * of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     * <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     * vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     * percentage complete if the volume is restoring or bootstrapping that
     * represents the percent of data transferred. This field does not appear
     * in the response if the stored volume is not restoring or
     * bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     * volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     * <a>VolumeStatus</a> values that indicates the state of the volume.
     * </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     * describing the type of the volume. Currently, on STORED volumes are
     * supported. </li> </ul>
     *
     * @param storedISCSIVolumes Describes a single unit of output from
     *         <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     *         <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     *         enabled for the iSCSI target. </li> <li>
     *         <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     *         object that represents a collection of iSCSI attributes for one stored
     *         volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     *         StorediSCSIVolume (p. 203) objects where each object contains metadata
     *         about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     *         disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     *         interface ID of the stored volume that initiator use to map the stored
     *         volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     *         The port used to communicate with iSCSI targets. </li> <li>
     *         <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     *         was created, existing data on the underlying local disk was preserved.
     *         <p><i>Valid Values</i>: true, false </li> <li>
     *         <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     *         snapshot, this field contains the snapshot ID used, e.g.
     *         snap-1122aabb. Otherwise, this field is not included. </li> <li>
     *         <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     *         target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     *         of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     *         of the local disk that was specified in the
     *         <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     *         <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     *         vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     *         percentage complete if the volume is restoring or bootstrapping that
     *         represents the percent of data transferred. This field does not appear
     *         in the response if the stored volume is not restoring or
     *         bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     *         volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     *         <a>VolumeStatus</a> values that indicates the state of the volume.
     *         </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     *         describing the type of the volume. Currently, on STORED volumes are
     *         supported. </li> </ul>
     */
    public void setStoredISCSIVolumes(java.util.Collection<StoredISCSIVolume> storedISCSIVolumes) {
        if (storedISCSIVolumes == null) {
            this.storedISCSIVolumes = null;
            return;
        }

        java.util.List<StoredISCSIVolume> storedISCSIVolumesCopy = new java.util.ArrayList<StoredISCSIVolume>(storedISCSIVolumes.size());
        storedISCSIVolumesCopy.addAll(storedISCSIVolumes);
        this.storedISCSIVolumes = storedISCSIVolumesCopy;
    }
    
    /**
     * Describes a single unit of output from
     * <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     * <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     * enabled for the iSCSI target. </li> <li>
     * <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     * StorediSCSIVolume (p. 203) objects where each object contains metadata
     * about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     * disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     * interface ID of the stored volume that initiator use to map the stored
     * volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     * The port used to communicate with iSCSI targets. </li> <li>
     * <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     * was created, existing data on the underlying local disk was preserved.
     * <p><i>Valid Values</i>: true, false </li> <li>
     * <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * snap-1122aabb. Otherwise, this field is not included. </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     * target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     * of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     * of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     * <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     * vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     * percentage complete if the volume is restoring or bootstrapping that
     * represents the percent of data transferred. This field does not appear
     * in the response if the stored volume is not restoring or
     * bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     * volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     * <a>VolumeStatus</a> values that indicates the state of the volume.
     * </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     * describing the type of the volume. Currently, on STORED volumes are
     * supported. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storedISCSIVolumes Describes a single unit of output from
     *         <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     *         <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     *         enabled for the iSCSI target. </li> <li>
     *         <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     *         object that represents a collection of iSCSI attributes for one stored
     *         volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     *         StorediSCSIVolume (p. 203) objects where each object contains metadata
     *         about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     *         disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     *         interface ID of the stored volume that initiator use to map the stored
     *         volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     *         The port used to communicate with iSCSI targets. </li> <li>
     *         <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     *         was created, existing data on the underlying local disk was preserved.
     *         <p><i>Valid Values</i>: true, false </li> <li>
     *         <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     *         snapshot, this field contains the snapshot ID used, e.g.
     *         snap-1122aabb. Otherwise, this field is not included. </li> <li>
     *         <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     *         target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     *         of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     *         of the local disk that was specified in the
     *         <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     *         <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     *         vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     *         percentage complete if the volume is restoring or bootstrapping that
     *         represents the percent of data transferred. This field does not appear
     *         in the response if the stored volume is not restoring or
     *         bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     *         volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     *         <a>VolumeStatus</a> values that indicates the state of the volume.
     *         </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     *         describing the type of the volume. Currently, on STORED volumes are
     *         supported. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStoredISCSIVolumesResult withStoredISCSIVolumes(StoredISCSIVolume... storedISCSIVolumes) {
        if (getStoredISCSIVolumes() == null) setStoredISCSIVolumes(new java.util.ArrayList<StoredISCSIVolume>(storedISCSIVolumes.length));
        for (StoredISCSIVolume value : storedISCSIVolumes) {
            getStoredISCSIVolumes().add(value);
        }
        return this;
    }
    
    /**
     * Describes a single unit of output from
     * <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     * <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     * enabled for the iSCSI target. </li> <li>
     * <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     * object that represents a collection of iSCSI attributes for one stored
     * volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     * StorediSCSIVolume (p. 203) objects where each object contains metadata
     * about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     * disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     * interface ID of the stored volume that initiator use to map the stored
     * volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     * The port used to communicate with iSCSI targets. </li> <li>
     * <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     * was created, existing data on the underlying local disk was preserved.
     * <p><i>Valid Values</i>: true, false </li> <li>
     * <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     * snapshot, this field contains the snapshot ID used, e.g.
     * snap-1122aabb. Otherwise, this field is not included. </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     * target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     * of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     * of the local disk that was specified in the
     * <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     * <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     * vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     * percentage complete if the volume is restoring or bootstrapping that
     * represents the percent of data transferred. This field does not appear
     * in the response if the stored volume is not restoring or
     * bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     * volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     * <a>VolumeStatus</a> values that indicates the state of the volume.
     * </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     * describing the type of the volume. Currently, on STORED volumes are
     * supported. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storedISCSIVolumes Describes a single unit of output from
     *         <a>DescribeStorediSCSIVolumes</a>. The following fields are returned:
     *         <ul> <li> <p><b>ChapEnabled</b>: Indicates whether mutual CHAP is
     *         enabled for the iSCSI target. </li> <li>
     *         <p><b>VolumeiSCSIAttributes</b>: An <a>VolumeiSCSIAttributes</a>
     *         object that represents a collection of iSCSI attributes for one stored
     *         volume. </li> <li> <p><b>StorediSCSIVolumes</b>: An array of
     *         StorediSCSIVolume (p. 203) objects where each object contains metadata
     *         about one stored volume. </li> <li> <p><b>LunNumber</b>: The logical
     *         disk number. </li> <li> <p><b>NetworkInterfaceId</b>: The network
     *         interface ID of the stored volume that initiator use to map the stored
     *         volume as an iSCSI target. </li> <li> <p><b>NetworkInterfacePort</b>:
     *         The port used to communicate with iSCSI targets. </li> <li>
     *         <p><b>PreservedExistingData</b>: Indicates if when the stored volume
     *         was created, existing data on the underlying local disk was preserved.
     *         <p><i>Valid Values</i>: true, false </li> <li>
     *         <p><b>SourceSnapshotId</b>: If the stored volume was created from a
     *         snapshot, this field contains the snapshot ID used, e.g.
     *         snap-1122aabb. Otherwise, this field is not included. </li> <li>
     *         <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the volume
     *         target. </li> <li> <p><b>VolumeARN</b>: The Amazon Resource Name (ARN)
     *         of the stored volume. </li> <li> <p><b>VolumeDiskId</b>: The disk ID
     *         of the local disk that was specified in the
     *         <a>CreateStorediSCSIVolume</a> operation. </li> <li>
     *         <p><b>VolumeId</b>: The unique identifier of the storage volume, e.g.
     *         vol-1122AABB. </li> <li> <p><b>VolumeProgress</b>: Represents the
     *         percentage complete if the volume is restoring or bootstrapping that
     *         represents the percent of data transferred. This field does not appear
     *         in the response if the stored volume is not restoring or
     *         bootstrapping. </li> <li> <p><b>VolumeSizeInBytes</b>: The size of the
     *         volume in bytes. </li> <li> <p><b>VolumeStatus</b>: One of the
     *         <a>VolumeStatus</a> values that indicates the state of the volume.
     *         </li> <li> <p><b>VolumeType</b>: One of the enumeration values
     *         describing the type of the volume. Currently, on STORED volumes are
     *         supported. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStoredISCSIVolumesResult withStoredISCSIVolumes(java.util.Collection<StoredISCSIVolume> storedISCSIVolumes) {
        if (storedISCSIVolumes == null) {
            this.storedISCSIVolumes = null;
        } else {
            java.util.List<StoredISCSIVolume> storedISCSIVolumesCopy = new java.util.ArrayList<StoredISCSIVolume>(storedISCSIVolumes.size());
            storedISCSIVolumesCopy.addAll(storedISCSIVolumes);
            this.storedISCSIVolumes = storedISCSIVolumesCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (storedISCSIVolumes != null) sb.append("StoredISCSIVolumes: " + storedISCSIVolumes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStoredISCSIVolumes() == null) ? 0 : getStoredISCSIVolumes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeStoredISCSIVolumesResult == false) return false;
        DescribeStoredISCSIVolumesResult other = (DescribeStoredISCSIVolumesResult)obj;
        
        if (other.getStoredISCSIVolumes() == null ^ this.getStoredISCSIVolumes() == null) return false;
        if (other.getStoredISCSIVolumes() != null && other.getStoredISCSIVolumes().equals(this.getStoredISCSIVolumes()) == false) return false; 
        return true;
    }
    
}
    