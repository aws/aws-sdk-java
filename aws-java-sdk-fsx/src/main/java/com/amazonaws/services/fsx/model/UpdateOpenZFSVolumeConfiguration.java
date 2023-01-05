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
 * Used to specify changes to the OpenZFS configuration for the volume that you are updating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateOpenZFSVolumeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOpenZFSVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than
     * the parent volume has reserved. You can specify a value of <code>-1</code> to unset a volume's storage capacity
     * reservation.
     * </p>
     */
    private Integer storageCapacityReservationGiB;
    /**
     * <p>
     * The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent. You can specify a quota
     * larger than the storage on the parent volume. You can specify a value of <code>-1</code> to unset a volume's
     * storage capacity quota.
     * </p>
     */
    private Integer storageCapacityQuotaGiB;
    /**
     * <p>
     * Specifies the record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256,
     * 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database workflows
     * can benefit from a smaller record size, while streaming workflows can benefit from a larger record size. For
     * additional guidance on when to set a custom record size, see <a
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
     * The configuration object for mounting a Network File System (NFS) file system.
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
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than
     * the parent volume has reserved. You can specify a value of <code>-1</code> to unset a volume's storage capacity
     * reservation.
     * </p>
     * 
     * @param storageCapacityReservationGiB
     *        The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage
     *        than the parent volume has reserved. You can specify a value of <code>-1</code> to unset a volume's
     *        storage capacity reservation.
     */

    public void setStorageCapacityReservationGiB(Integer storageCapacityReservationGiB) {
        this.storageCapacityReservationGiB = storageCapacityReservationGiB;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than
     * the parent volume has reserved. You can specify a value of <code>-1</code> to unset a volume's storage capacity
     * reservation.
     * </p>
     * 
     * @return The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more
     *         storage than the parent volume has reserved. You can specify a value of <code>-1</code> to unset a
     *         volume's storage capacity reservation.
     */

    public Integer getStorageCapacityReservationGiB() {
        return this.storageCapacityReservationGiB;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage than
     * the parent volume has reserved. You can specify a value of <code>-1</code> to unset a volume's storage capacity
     * reservation.
     * </p>
     * 
     * @param storageCapacityReservationGiB
     *        The amount of storage in gibibytes (GiB) to reserve from the parent volume. You can't reserve more storage
     *        than the parent volume has reserved. You can specify a value of <code>-1</code> to unset a volume's
     *        storage capacity reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenZFSVolumeConfiguration withStorageCapacityReservationGiB(Integer storageCapacityReservationGiB) {
        setStorageCapacityReservationGiB(storageCapacityReservationGiB);
        return this;
    }

    /**
     * <p>
     * The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent. You can specify a quota
     * larger than the storage on the parent volume. You can specify a value of <code>-1</code> to unset a volume's
     * storage capacity quota.
     * </p>
     * 
     * @param storageCapacityQuotaGiB
     *        The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent. You can specify
     *        a quota larger than the storage on the parent volume. You can specify a value of <code>-1</code> to unset
     *        a volume's storage capacity quota.
     */

    public void setStorageCapacityQuotaGiB(Integer storageCapacityQuotaGiB) {
        this.storageCapacityQuotaGiB = storageCapacityQuotaGiB;
    }

    /**
     * <p>
     * The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent. You can specify a quota
     * larger than the storage on the parent volume. You can specify a value of <code>-1</code> to unset a volume's
     * storage capacity quota.
     * </p>
     * 
     * @return The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent. You can specify
     *         a quota larger than the storage on the parent volume. You can specify a value of <code>-1</code> to unset
     *         a volume's storage capacity quota.
     */

    public Integer getStorageCapacityQuotaGiB() {
        return this.storageCapacityQuotaGiB;
    }

    /**
     * <p>
     * The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent. You can specify a quota
     * larger than the storage on the parent volume. You can specify a value of <code>-1</code> to unset a volume's
     * storage capacity quota.
     * </p>
     * 
     * @param storageCapacityQuotaGiB
     *        The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent. You can specify
     *        a quota larger than the storage on the parent volume. You can specify a value of <code>-1</code> to unset
     *        a volume's storage capacity quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenZFSVolumeConfiguration withStorageCapacityQuotaGiB(Integer storageCapacityQuotaGiB) {
        setStorageCapacityQuotaGiB(storageCapacityQuotaGiB);
        return this;
    }

    /**
     * <p>
     * Specifies the record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256,
     * 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database workflows
     * can benefit from a smaller record size, while streaming workflows can benefit from a larger record size. For
     * additional guidance on when to set a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     * maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param recordSizeKiB
     *        Specifies the record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64,
     *        128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size.
     *        Database workflows can benefit from a smaller record size, while streaming workflows can benefit from a
     *        larger record size. For additional guidance on when to set a custom record size, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     *        maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public void setRecordSizeKiB(Integer recordSizeKiB) {
        this.recordSizeKiB = recordSizeKiB;
    }

    /**
     * <p>
     * Specifies the record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256,
     * 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database workflows
     * can benefit from a smaller record size, while streaming workflows can benefit from a larger record size. For
     * additional guidance on when to set a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     * maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @return Specifies the record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64,
     *         128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size.
     *         Database workflows can benefit from a smaller record size, while streaming workflows can benefit from a
     *         larger record size. For additional guidance on when to set a custom record size, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips
     *         for maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     */

    public Integer getRecordSizeKiB() {
        return this.recordSizeKiB;
    }

    /**
     * <p>
     * Specifies the record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256,
     * 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size. Database workflows
     * can benefit from a smaller record size, while streaming workflows can benefit from a larger record size. For
     * additional guidance on when to set a custom record size, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     * maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param recordSizeKiB
     *        Specifies the record size of an OpenZFS volume, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64,
     *        128, 256, 512, or 1024 KiB. The default is 128 KiB. Most workloads should use the default record size.
     *        Database workflows can benefit from a smaller record size, while streaming workflows can benefit from a
     *        larger record size. For additional guidance on when to set a custom record size, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs"> Tips for
     *        maximizing performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenZFSVolumeConfiguration withRecordSizeKiB(Integer recordSizeKiB) {
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

    public UpdateOpenZFSVolumeConfiguration withDataCompressionType(String dataCompressionType) {
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

    public UpdateOpenZFSVolumeConfiguration withDataCompressionType(OpenZFSDataCompressionType dataCompressionType) {
        this.dataCompressionType = dataCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     * 
     * @return The configuration object for mounting a Network File System (NFS) file system.
     */

    public java.util.List<OpenZFSNfsExport> getNfsExports() {
        return nfsExports;
    }

    /**
     * <p>
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a Network File System (NFS) file system.
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
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNfsExports(java.util.Collection)} or {@link #withNfsExports(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a Network File System (NFS) file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenZFSVolumeConfiguration withNfsExports(OpenZFSNfsExport... nfsExports) {
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
     * The configuration object for mounting a Network File System (NFS) file system.
     * </p>
     * 
     * @param nfsExports
     *        The configuration object for mounting a Network File System (NFS) file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenZFSVolumeConfiguration withNfsExports(java.util.Collection<OpenZFSNfsExport> nfsExports) {
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

    public UpdateOpenZFSVolumeConfiguration withUserAndGroupQuotas(OpenZFSUserOrGroupQuota... userAndGroupQuotas) {
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

    public UpdateOpenZFSVolumeConfiguration withUserAndGroupQuotas(java.util.Collection<OpenZFSUserOrGroupQuota> userAndGroupQuotas) {
        setUserAndGroupQuotas(userAndGroupQuotas);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     * 
     * @param readOnly
     *        A Boolean value indicating whether the volume is read-only.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     * 
     * @return A Boolean value indicating whether the volume is read-only.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     * 
     * @param readOnly
     *        A Boolean value indicating whether the volume is read-only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenZFSVolumeConfiguration withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the volume is read-only.
     * </p>
     * 
     * @return A Boolean value indicating whether the volume is read-only.
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
        if (getStorageCapacityReservationGiB() != null)
            sb.append("StorageCapacityReservationGiB: ").append(getStorageCapacityReservationGiB()).append(",");
        if (getStorageCapacityQuotaGiB() != null)
            sb.append("StorageCapacityQuotaGiB: ").append(getStorageCapacityQuotaGiB()).append(",");
        if (getRecordSizeKiB() != null)
            sb.append("RecordSizeKiB: ").append(getRecordSizeKiB()).append(",");
        if (getDataCompressionType() != null)
            sb.append("DataCompressionType: ").append(getDataCompressionType()).append(",");
        if (getNfsExports() != null)
            sb.append("NfsExports: ").append(getNfsExports()).append(",");
        if (getUserAndGroupQuotas() != null)
            sb.append("UserAndGroupQuotas: ").append(getUserAndGroupQuotas()).append(",");
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

        if (obj instanceof UpdateOpenZFSVolumeConfiguration == false)
            return false;
        UpdateOpenZFSVolumeConfiguration other = (UpdateOpenZFSVolumeConfiguration) obj;
        if (other.getStorageCapacityReservationGiB() == null ^ this.getStorageCapacityReservationGiB() == null)
            return false;
        if (other.getStorageCapacityReservationGiB() != null
                && other.getStorageCapacityReservationGiB().equals(this.getStorageCapacityReservationGiB()) == false)
            return false;
        if (other.getStorageCapacityQuotaGiB() == null ^ this.getStorageCapacityQuotaGiB() == null)
            return false;
        if (other.getStorageCapacityQuotaGiB() != null && other.getStorageCapacityQuotaGiB().equals(this.getStorageCapacityQuotaGiB()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getStorageCapacityReservationGiB() == null) ? 0 : getStorageCapacityReservationGiB().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacityQuotaGiB() == null) ? 0 : getStorageCapacityQuotaGiB().hashCode());
        hashCode = prime * hashCode + ((getRecordSizeKiB() == null) ? 0 : getRecordSizeKiB().hashCode());
        hashCode = prime * hashCode + ((getDataCompressionType() == null) ? 0 : getDataCompressionType().hashCode());
        hashCode = prime * hashCode + ((getNfsExports() == null) ? 0 : getNfsExports().hashCode());
        hashCode = prime * hashCode + ((getUserAndGroupQuotas() == null) ? 0 : getUserAndGroupQuotas().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOpenZFSVolumeConfiguration clone() {
        try {
            return (UpdateOpenZFSVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.UpdateOpenZFSVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
