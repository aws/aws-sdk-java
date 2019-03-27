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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a virtual tape object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/Tape" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tape implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     */
    private String tapeARN;
    /**
     * <p>
     * The barcode that identifies a specific virtual tape.
     * </p>
     */
    private String tapeBarcode;
    /**
     * <p>
     * The date the virtual tape was created.
     * </p>
     */
    private java.util.Date tapeCreatedDate;
    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     */
    private Long tapeSizeInBytes;
    /**
     * <p>
     * The current state of the virtual tape.
     * </p>
     */
    private String tapeStatus;
    /**
     * <p>
     * The virtual tape library (VTL) device that the virtual tape is associated with.
     * </p>
     */
    private String vTLDevice;
    /**
     * <p>
     * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete.
     * </p>
     * <p>
     * Range: 0 (not started) to 100 (complete).
     * </p>
     */
    private Double progress;
    /**
     * <p>
     * The size, in bytes, of data stored on the virtual tape.
     * </p>
     * <note>
     * <p>
     * This value is not available for tapes created prior to May 13, 2015.
     * </p>
     * </note>
     */
    private Long tapeUsedInBytes;

    private String kMSKey;
    /**
     * <p>
     * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     */
    private String poolId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the virtual tape.
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the virtual tape.
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
        return this;
    }

    /**
     * <p>
     * The barcode that identifies a specific virtual tape.
     * </p>
     * 
     * @param tapeBarcode
     *        The barcode that identifies a specific virtual tape.
     */

    public void setTapeBarcode(String tapeBarcode) {
        this.tapeBarcode = tapeBarcode;
    }

    /**
     * <p>
     * The barcode that identifies a specific virtual tape.
     * </p>
     * 
     * @return The barcode that identifies a specific virtual tape.
     */

    public String getTapeBarcode() {
        return this.tapeBarcode;
    }

    /**
     * <p>
     * The barcode that identifies a specific virtual tape.
     * </p>
     * 
     * @param tapeBarcode
     *        The barcode that identifies a specific virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withTapeBarcode(String tapeBarcode) {
        setTapeBarcode(tapeBarcode);
        return this;
    }

    /**
     * <p>
     * The date the virtual tape was created.
     * </p>
     * 
     * @param tapeCreatedDate
     *        The date the virtual tape was created.
     */

    public void setTapeCreatedDate(java.util.Date tapeCreatedDate) {
        this.tapeCreatedDate = tapeCreatedDate;
    }

    /**
     * <p>
     * The date the virtual tape was created.
     * </p>
     * 
     * @return The date the virtual tape was created.
     */

    public java.util.Date getTapeCreatedDate() {
        return this.tapeCreatedDate;
    }

    /**
     * <p>
     * The date the virtual tape was created.
     * </p>
     * 
     * @param tapeCreatedDate
     *        The date the virtual tape was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withTapeCreatedDate(java.util.Date tapeCreatedDate) {
        setTapeCreatedDate(tapeCreatedDate);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tape capacity.
     */

    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     * 
     * @return The size, in bytes, of the virtual tape capacity.
     */

    public Long getTapeSizeInBytes() {
        return this.tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tape capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withTapeSizeInBytes(Long tapeSizeInBytes) {
        setTapeSizeInBytes(tapeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The current state of the virtual tape.
     * </p>
     * 
     * @param tapeStatus
     *        The current state of the virtual tape.
     */

    public void setTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
    }

    /**
     * <p>
     * The current state of the virtual tape.
     * </p>
     * 
     * @return The current state of the virtual tape.
     */

    public String getTapeStatus() {
        return this.tapeStatus;
    }

    /**
     * <p>
     * The current state of the virtual tape.
     * </p>
     * 
     * @param tapeStatus
     *        The current state of the virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withTapeStatus(String tapeStatus) {
        setTapeStatus(tapeStatus);
        return this;
    }

    /**
     * <p>
     * The virtual tape library (VTL) device that the virtual tape is associated with.
     * </p>
     * 
     * @param vTLDevice
     *        The virtual tape library (VTL) device that the virtual tape is associated with.
     */

    public void setVTLDevice(String vTLDevice) {
        this.vTLDevice = vTLDevice;
    }

    /**
     * <p>
     * The virtual tape library (VTL) device that the virtual tape is associated with.
     * </p>
     * 
     * @return The virtual tape library (VTL) device that the virtual tape is associated with.
     */

    public String getVTLDevice() {
        return this.vTLDevice;
    }

    /**
     * <p>
     * The virtual tape library (VTL) device that the virtual tape is associated with.
     * </p>
     * 
     * @param vTLDevice
     *        The virtual tape library (VTL) device that the virtual tape is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withVTLDevice(String vTLDevice) {
        setVTLDevice(vTLDevice);
        return this;
    }

    /**
     * <p>
     * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete.
     * </p>
     * <p>
     * Range: 0 (not started) to 100 (complete).
     * </p>
     * 
     * @param progress
     *        For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is
     *        complete.</p>
     *        <p>
     *        Range: 0 (not started) to 100 (complete).
     */

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete.
     * </p>
     * <p>
     * Range: 0 (not started) to 100 (complete).
     * </p>
     * 
     * @return For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is
     *         complete.</p>
     *         <p>
     *         Range: 0 (not started) to 100 (complete).
     */

    public Double getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete.
     * </p>
     * <p>
     * Range: 0 (not started) to 100 (complete).
     * </p>
     * 
     * @param progress
     *        For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is
     *        complete.</p>
     *        <p>
     *        Range: 0 (not started) to 100 (complete).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withProgress(Double progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of data stored on the virtual tape.
     * </p>
     * <note>
     * <p>
     * This value is not available for tapes created prior to May 13, 2015.
     * </p>
     * </note>
     * 
     * @param tapeUsedInBytes
     *        The size, in bytes, of data stored on the virtual tape.</p> <note>
     *        <p>
     *        This value is not available for tapes created prior to May 13, 2015.
     *        </p>
     */

    public void setTapeUsedInBytes(Long tapeUsedInBytes) {
        this.tapeUsedInBytes = tapeUsedInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of data stored on the virtual tape.
     * </p>
     * <note>
     * <p>
     * This value is not available for tapes created prior to May 13, 2015.
     * </p>
     * </note>
     * 
     * @return The size, in bytes, of data stored on the virtual tape.</p> <note>
     *         <p>
     *         This value is not available for tapes created prior to May 13, 2015.
     *         </p>
     */

    public Long getTapeUsedInBytes() {
        return this.tapeUsedInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of data stored on the virtual tape.
     * </p>
     * <note>
     * <p>
     * This value is not available for tapes created prior to May 13, 2015.
     * </p>
     * </note>
     * 
     * @param tapeUsedInBytes
     *        The size, in bytes, of data stored on the virtual tape.</p> <note>
     *        <p>
     *        This value is not available for tapes created prior to May 13, 2015.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withTapeUsedInBytes(Long tapeUsedInBytes) {
        setTapeUsedInBytes(tapeUsedInBytes);
        return this;
    }

    /**
     * @param kMSKey
     */

    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * @return
     */

    public String getKMSKey() {
        return this.kMSKey;
    }

    /**
     * @param kMSKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the
     *        S3 storage class that is associated with the pool. When you use your backup application to eject the tape,
     *        the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the
     *        pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @return The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the
     *         S3 storage class that is associated with the pool. When you use your backup application to eject the
     *         tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *         the pool.</p>
     *         <p>
     *         Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the
     *        S3 storage class that is associated with the pool. When you use your backup application to eject the tape,
     *        the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the
     *        pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withPoolId(String poolId) {
        setPoolId(poolId);
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
        if (getTapeARN() != null)
            sb.append("TapeARN: ").append(getTapeARN()).append(",");
        if (getTapeBarcode() != null)
            sb.append("TapeBarcode: ").append(getTapeBarcode()).append(",");
        if (getTapeCreatedDate() != null)
            sb.append("TapeCreatedDate: ").append(getTapeCreatedDate()).append(",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: ").append(getTapeSizeInBytes()).append(",");
        if (getTapeStatus() != null)
            sb.append("TapeStatus: ").append(getTapeStatus()).append(",");
        if (getVTLDevice() != null)
            sb.append("VTLDevice: ").append(getVTLDevice()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getTapeUsedInBytes() != null)
            sb.append("TapeUsedInBytes: ").append(getTapeUsedInBytes()).append(",");
        if (getKMSKey() != null)
            sb.append("KMSKey: ").append(getKMSKey()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tape == false)
            return false;
        Tape other = (Tape) obj;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getTapeBarcode() == null ^ this.getTapeBarcode() == null)
            return false;
        if (other.getTapeBarcode() != null && other.getTapeBarcode().equals(this.getTapeBarcode()) == false)
            return false;
        if (other.getTapeCreatedDate() == null ^ this.getTapeCreatedDate() == null)
            return false;
        if (other.getTapeCreatedDate() != null && other.getTapeCreatedDate().equals(this.getTapeCreatedDate()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getTapeStatus() == null ^ this.getTapeStatus() == null)
            return false;
        if (other.getTapeStatus() != null && other.getTapeStatus().equals(this.getTapeStatus()) == false)
            return false;
        if (other.getVTLDevice() == null ^ this.getVTLDevice() == null)
            return false;
        if (other.getVTLDevice() != null && other.getVTLDevice().equals(this.getVTLDevice()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getTapeUsedInBytes() == null ^ this.getTapeUsedInBytes() == null)
            return false;
        if (other.getTapeUsedInBytes() != null && other.getTapeUsedInBytes().equals(this.getTapeUsedInBytes()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode + ((getTapeBarcode() == null) ? 0 : getTapeBarcode().hashCode());
        hashCode = prime * hashCode + ((getTapeCreatedDate() == null) ? 0 : getTapeCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getTapeStatus() == null) ? 0 : getTapeStatus().hashCode());
        hashCode = prime * hashCode + ((getVTLDevice() == null) ? 0 : getVTLDevice().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getTapeUsedInBytes() == null) ? 0 : getTapeUsedInBytes().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        return hashCode;
    }

    @Override
    public Tape clone() {
        try {
            return (Tape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.TapeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
