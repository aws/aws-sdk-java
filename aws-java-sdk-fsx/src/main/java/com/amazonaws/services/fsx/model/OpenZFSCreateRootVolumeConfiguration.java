/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an Amazon FSx for OpenZFS root volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/OpenZFSCreateRootVolumeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSCreateRootVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128,
     * 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database
     * workflows can benefit from a smaller record size, while streaming workflows can benefit from a larger record
     * size. For additional guidance on setting a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     * maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     */
    private Integer recordSizeKiB;
    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
     */
    private String dataCompressionType;
    /**
     * <p>
     * The configuration object for mounting a file system.
     * </p>
     */
    private java.util.List<OpenZFSNfsExport> nfsExports;
    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     */
    private java.util.List<OpenZFSUserOrGroupQuota> userAndGroupQuotas;
    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This value
     * defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     * where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only
     * the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags
     * are copied from the volume, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToSnapshots;
    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can be useful
     * after you have completed changes to a volume and no longer want changes to occur.
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128,
     * 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database
     * workflows can benefit from a smaller record size, while streaming workflows can benefit from a larger record
     * size. For additional guidance on setting a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     * maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param recordSizeKiB
     *        Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32,
     *        64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size.
     *        Database workflows can benefit from a smaller record size, while streaming workflows can benefit from a
     *        larger record size. For additional guidance on setting a custom record size, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     *        maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public void setRecordSizeKiB(Integer recordSizeKiB) {
        this.recordSizeKiB = recordSizeKiB;
    }

    /**
     * <p>
     * Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128,
     * 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database
     * workflows can benefit from a smaller record size, while streaming workflows can benefit from a larger record
     * size. For additional guidance on setting a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     * maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @return Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32,
     *         64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record
     *         size. Database workflows can benefit from a smaller record size, while streaming workflows can benefit
     *         from a larger record size. For additional guidance on setting a custom record size, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips
     *         for maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public Integer getRecordSizeKiB() {
        return this.recordSizeKiB;
    }

    /**
     * <p>
     * Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128,
     * 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database
     * workflows can benefit from a smaller record size, while streaming workflows can benefit from a larger record
     * size. For additional guidance on setting a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     * maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param recordSizeKiB
     *        Specifies the record size of an OpenZFS root volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32,
     *        64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size.
     *        Database workflows can benefit from a smaller record size, while streaming workflows can benefit from a
     *        larger record size. For additional guidance on setting a custom record size, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     *        maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSCreateRootVolumeConfiguration withRecordSizeKiB(Integer recordSizeKiB) {
        setRecordSizeKiB(recordSizeKiB);
        return this;
    }

    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataCompressionType
     *        Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
     *        Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     *        Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *        </p>
     *        </li>
     * @see OpenZFSDataCompressionType
     */

    public void setDataCompressionType(String dataCompressionType) {
        this.dataCompressionType = dataCompressionType;
    }

    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code>
     *         by default.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
     *         Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     *         Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *         </p>
     *         </li>
     * @see OpenZFSDataCompressionType
     */

    public String getDataCompressionType() {
        return this.dataCompressionType;
    }

    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataCompressionType
     *        Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
     *        Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     *        Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDataCompressionType
     */

    public OpenZFSCreateRootVolumeConfiguration withDataCompressionType(String dataCompressionType) {
        setDataCompressionType(dataCompressionType);
        return this;
    }

    /**
     * <p>
     * Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     * default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. Compared
     * to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to Z-Standard,
     * LZ4 is less compute-intensive and delivers higher write throughput speeds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataCompressionType
     *        Specifies the method used to compress the data on the volume. The compression type is <code>NONE</code> by
     *        default.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Doesn't compress the data on the volume. <code>NONE</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZSTD</code> - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm.
     *        Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk storage utilization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     *        Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDataCompressionType
     */

    public OpenZFSCreateRootVolumeConfiguration withDataCompressionType(OpenZFSDataCompressionType dataCompressionType) {
        this.dataCompressionType = dataCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration object for mounting a file system.
     * </p>
     * 
     * @return The configuration object for mounting a file system.
     */

    public java.util.List<OpenZFSNfsExport> getNfsExports() {
        return nfsExports;
    }

    /**
     * <p>
     * The configuration object for mounting a file system.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a file system.
     */

    public void setNfsExports(java.util.Collection<OpenZFSNfsExport> nfsExports) {
        if (nfsExports == null) {
            this.nfsExports = null;
            return;
        }

        this.nfsExports = new java.util.ArrayList<OpenZFSNfsExport>(nfsExports);
    }

    /**
     * <p>
     * The configuration object for mounting a file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNfsExports(java.util.Collection)} or {@link #withNfsExports(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSCreateRootVolumeConfiguration withNfsExports(OpenZFSNfsExport... nfsExports) {
        if (this.nfsExports == null) {
            setNfsExports(new java.util.ArrayList<OpenZFSNfsExport>(nfsExports.length));
        }
        for (OpenZFSNfsExport ele : nfsExports) {
            this.nfsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration object for mounting a file system.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSCreateRootVolumeConfiguration withNfsExports(java.util.Collection<OpenZFSNfsExport> nfsExports) {
        setNfsExports(nfsExports);
        return this;
    }

    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     * 
     * @return An object specifying how much storage users or groups can use on the volume.
     */

    public java.util.List<OpenZFSUserOrGroupQuota> getUserAndGroupQuotas() {
        return userAndGroupQuotas;
    }

    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     * 
     * @param userAndGroupQuotas
     *        An object specifying how much storage users or groups can use on the volume.
     */

    public void setUserAndGroupQuotas(java.util.Collection<OpenZFSUserOrGroupQuota> userAndGroupQuotas) {
        if (userAndGroupQuotas == null) {
            this.userAndGroupQuotas = null;
            return;
        }

        this.userAndGroupQuotas = new java.util.ArrayList<OpenZFSUserOrGroupQuota>(userAndGroupQuotas);
    }

    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAndGroupQuotas(java.util.Collection)} or {@link #withUserAndGroupQuotas(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userAndGroupQuotas
     *        An object specifying how much storage users or groups can use on the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSCreateRootVolumeConfiguration withUserAndGroupQuotas(OpenZFSUserOrGroupQuota... userAndGroupQuotas) {
        if (this.userAndGroupQuotas == null) {
            setUserAndGroupQuotas(new java.util.ArrayList<OpenZFSUserOrGroupQuota>(userAndGroupQuotas.length));
        }
        for (OpenZFSUserOrGroupQuota ele : userAndGroupQuotas) {
            this.userAndGroupQuotas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object specifying how much storage users or groups can use on the volume.
     * </p>
     * 
     * @param userAndGroupQuotas
     *        An object specifying how much storage users or groups can use on the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSCreateRootVolumeConfiguration withUserAndGroupQuotas(java.util.Collection<OpenZFSUserOrGroupQuota> userAndGroupQuotas) {
        setUserAndGroupQuotas(userAndGroupQuotas);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This value
     * defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     * where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only
     * the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags
     * are copied from the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToSnapshots
     *        A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This
     *        value defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied
     *        to snapshots where the user doesn't specify tags. If this value is <code>true</code> and you specify one
     *        or more tags, only the specified tags are copied to snapshots. If you specify one or more tags when
     *        creating the snapshot, no tags are copied from the volume, regardless of this value.
     */

    public void setCopyTagsToSnapshots(Boolean copyTagsToSnapshots) {
        this.copyTagsToSnapshots = copyTagsToSnapshots;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This value
     * defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     * where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only
     * the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags
     * are copied from the volume, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This
     *         value defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are
     *         copied to snapshots where the user doesn't specify tags. If this value is <code>true</code> and you
     *         specify one or more tags, only the specified tags are copied to snapshots. If you specify one or more
     *         tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
     */

    public Boolean getCopyTagsToSnapshots() {
        return this.copyTagsToSnapshots;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This value
     * defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     * where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only
     * the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags
     * are copied from the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToSnapshots
     *        A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This
     *        value defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied
     *        to snapshots where the user doesn't specify tags. If this value is <code>true</code> and you specify one
     *        or more tags, only the specified tags are copied to snapshots. If you specify one or more tags when
     *        creating the snapshot, no tags are copied from the volume, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSCreateRootVolumeConfiguration withCopyTagsToSnapshots(Boolean copyTagsToSnapshots) {
        setCopyTagsToSnapshots(copyTagsToSnapshots);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This value
     * defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     * where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only
     * the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags
     * are copied from the volume, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the volume should be copied to snapshots of the volume. This
     *         value defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are
     *         copied to snapshots where the user doesn't specify tags. If this value is <code>true</code> and you
     *         specify one or more tags, only the specified tags are copied to snapshots. If you specify one or more
     *         tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
     */

    public Boolean isCopyTagsToSnapshots() {
        return this.copyTagsToSnapshots;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can be useful
     * after you have completed changes to a volume and no longer want changes to occur.
     * </p>
     * 
     * @param readOnly
     *        A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can be
     *        useful after you have completed changes to a volume and no longer want changes to occur.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can be useful
     * after you have completed changes to a volume and no longer want changes to occur.
     * </p>
     * 
     * @return A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can
     *         be useful after you have completed changes to a volume and no longer want changes to occur.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can be useful
     * after you have completed changes to a volume and no longer want changes to occur.
     * </p>
     * 
     * @param readOnly
     *        A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can be
     *        useful after you have completed changes to a volume and no longer want changes to occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSCreateRootVolumeConfiguration withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can be useful
     * after you have completed changes to a volume and no longer want changes to occur.
     * </p>
     * 
     * @return A Boolean value indicating whether the volume is read-only. Setting this value to <code>true</code> can
     *         be useful after you have completed changes to a volume and no longer want changes to occur.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
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
        if (getRecordSizeKiB() != null)
            sb.append("RecordSizeKiB: ").append(getRecordSizeKiB()).append(",");
        if (getDataCompressionType() != null)
            sb.append("DataCompressionType: ").append(getDataCompressionType()).append(",");
        if (getNfsExports() != null)
            sb.append("NfsExports: ").append(getNfsExports()).append(",");
        if (getUserAndGroupQuotas() != null)
            sb.append("UserAndGroupQuotas: ").append(getUserAndGroupQuotas()).append(",");
        if (getCopyTagsToSnapshots() != null)
            sb.append("CopyTagsToSnapshots: ").append(getCopyTagsToSnapshots()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenZFSCreateRootVolumeConfiguration == false)
            return false;
        OpenZFSCreateRootVolumeConfiguration other = (OpenZFSCreateRootVolumeConfiguration) obj;
        if (other.getRecordSizeKiB() == null ^ this.getRecordSizeKiB() == null)
            return false;
        if (other.getRecordSizeKiB() != null && other.getRecordSizeKiB().equals(this.getRecordSizeKiB()) == false)
            return false;
        if (other.getDataCompressionType() == null ^ this.getDataCompressionType() == null)
            return false;
        if (other.getDataCompressionType() != null && other.getDataCompressionType().equals(this.getDataCompressionType()) == false)
            return false;
        if (other.getNfsExports() == null ^ this.getNfsExports() == null)
            return false;
        if (other.getNfsExports() != null && other.getNfsExports().equals(this.getNfsExports()) == false)
            return false;
        if (other.getUserAndGroupQuotas() == null ^ this.getUserAndGroupQuotas() == null)
            return false;
        if (other.getUserAndGroupQuotas() != null && other.getUserAndGroupQuotas().equals(this.getUserAndGroupQuotas()) == false)
            return false;
        if (other.getCopyTagsToSnapshots() == null ^ this.getCopyTagsToSnapshots() == null)
            return false;
        if (other.getCopyTagsToSnapshots() != null && other.getCopyTagsToSnapshots().equals(this.getCopyTagsToSnapshots()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordSizeKiB() == null) ? 0 : getRecordSizeKiB().hashCode());
        hashCode = prime * hashCode + ((getDataCompressionType() == null) ? 0 : getDataCompressionType().hashCode());
        hashCode = prime * hashCode + ((getNfsExports() == null) ? 0 : getNfsExports().hashCode());
        hashCode = prime * hashCode + ((getUserAndGroupQuotas() == null) ? 0 : getUserAndGroupQuotas().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshots() == null) ? 0 : getCopyTagsToSnapshots().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        return hashCode;
    }

    @Override
    public OpenZFSCreateRootVolumeConfiguration clone() {
        try {
            return (OpenZFSCreateRootVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.OpenZFSCreateRootVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
