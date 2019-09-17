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
 * Represents a virtual tape that is archived in the virtual tape shelf (VTS).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/TapeArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TapeArchive implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an archived virtual tape.
     * </p>
     */
    private String tapeARN;
    /**
     * <p>
     * The barcode that identifies the archived virtual tape.
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
     * The size, in bytes, of the archived virtual tape.
     * </p>
     */
    private Long tapeSizeInBytes;
    /**
     * <p>
     * The time that the archiving of the virtual tape was completed.
     * </p>
     * <p>
     * The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to.
     * </p>
     * <p>
     * The virtual tape is retrieved from the virtual tape shelf (VTS).
     * </p>
     */
    private String retrievedTo;
    /**
     * <p>
     * The current state of the archived virtual tape.
     * </p>
     */
    private String tapeStatus;
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
     * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class
     * that is associated with the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     */
    private String poolId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an archived virtual tape.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of an archived virtual tape.
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an archived virtual tape.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an archived virtual tape.
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an archived virtual tape.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of an archived virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeArchive withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
        return this;
    }

    /**
     * <p>
     * The barcode that identifies the archived virtual tape.
     * </p>
     * 
     * @param tapeBarcode
     *        The barcode that identifies the archived virtual tape.
     */

    public void setTapeBarcode(String tapeBarcode) {
        this.tapeBarcode = tapeBarcode;
    }

    /**
     * <p>
     * The barcode that identifies the archived virtual tape.
     * </p>
     * 
     * @return The barcode that identifies the archived virtual tape.
     */

    public String getTapeBarcode() {
        return this.tapeBarcode;
    }

    /**
     * <p>
     * The barcode that identifies the archived virtual tape.
     * </p>
     * 
     * @param tapeBarcode
     *        The barcode that identifies the archived virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeArchive withTapeBarcode(String tapeBarcode) {
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

    public TapeArchive withTapeCreatedDate(java.util.Date tapeCreatedDate) {
        setTapeCreatedDate(tapeCreatedDate);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the archived virtual tape.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the archived virtual tape.
     */

    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the archived virtual tape.
     * </p>
     * 
     * @return The size, in bytes, of the archived virtual tape.
     */

    public Long getTapeSizeInBytes() {
        return this.tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the archived virtual tape.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the archived virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeArchive withTapeSizeInBytes(Long tapeSizeInBytes) {
        setTapeSizeInBytes(tapeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The time that the archiving of the virtual tape was completed.
     * </p>
     * <p>
     * The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     * 
     * @param completionTime
     *        The time that the archiving of the virtual tape was completed.</p>
     *        <p>
     *        The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The time that the archiving of the virtual tape was completed.
     * </p>
     * <p>
     * The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     * 
     * @return The time that the archiving of the virtual tape was completed.</p>
     *         <p>
     *         The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The time that the archiving of the virtual tape was completed.
     * </p>
     * <p>
     * The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     * 
     * @param completionTime
     *        The time that the archiving of the virtual tape was completed.</p>
     *        <p>
     *        The default time stamp format is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeArchive withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to.
     * </p>
     * <p>
     * The virtual tape is retrieved from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param retrievedTo
     *        The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to.</p>
     *        <p>
     *        The virtual tape is retrieved from the virtual tape shelf (VTS).
     */

    public void setRetrievedTo(String retrievedTo) {
        this.retrievedTo = retrievedTo;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to.
     * </p>
     * <p>
     * The virtual tape is retrieved from the virtual tape shelf (VTS).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to.</p>
     *         <p>
     *         The virtual tape is retrieved from the virtual tape shelf (VTS).
     */

    public String getRetrievedTo() {
        return this.retrievedTo;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to.
     * </p>
     * <p>
     * The virtual tape is retrieved from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param retrievedTo
     *        The Amazon Resource Name (ARN) of the tape gateway that the virtual tape is being retrieved to.</p>
     *        <p>
     *        The virtual tape is retrieved from the virtual tape shelf (VTS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeArchive withRetrievedTo(String retrievedTo) {
        setRetrievedTo(retrievedTo);
        return this;
    }

    /**
     * <p>
     * The current state of the archived virtual tape.
     * </p>
     * 
     * @param tapeStatus
     *        The current state of the archived virtual tape.
     */

    public void setTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
    }

    /**
     * <p>
     * The current state of the archived virtual tape.
     * </p>
     * 
     * @return The current state of the archived virtual tape.
     */

    public String getTapeStatus() {
        return this.tapeStatus;
    }

    /**
     * <p>
     * The current state of the archived virtual tape.
     * </p>
     * 
     * @param tapeStatus
     *        The current state of the archived virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeArchive withTapeStatus(String tapeStatus) {
        setTapeStatus(tapeStatus);
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

    public TapeArchive withTapeUsedInBytes(Long tapeUsedInBytes) {
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

    public TapeArchive withKMSKey(String kMSKey) {
        setKMSKey(kMSKey);
        return this;
    }

    /**
     * <p>
     * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class
     * that is associated with the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3
     *        storage class that is associated with the pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class
     * that is associated with the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @return The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3
     *         storage class that is associated with the pool.</p>
     *         <p>
     *         Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3 storage class
     * that is associated with the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that was used to archive the tape. The tapes in this pool are archived in the S3
     *        storage class that is associated with the pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeArchive withPoolId(String poolId) {
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
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getRetrievedTo() != null)
            sb.append("RetrievedTo: ").append(getRetrievedTo()).append(",");
        if (getTapeStatus() != null)
            sb.append("TapeStatus: ").append(getTapeStatus()).append(",");
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

        if (obj instanceof TapeArchive == false)
            return false;
        TapeArchive other = (TapeArchive) obj;
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
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getRetrievedTo() == null ^ this.getRetrievedTo() == null)
            return false;
        if (other.getRetrievedTo() != null && other.getRetrievedTo().equals(this.getRetrievedTo()) == false)
            return false;
        if (other.getTapeStatus() == null ^ this.getTapeStatus() == null)
            return false;
        if (other.getTapeStatus() != null && other.getTapeStatus().equals(this.getTapeStatus()) == false)
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
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getRetrievedTo() == null) ? 0 : getRetrievedTo().hashCode());
        hashCode = prime * hashCode + ((getTapeStatus() == null) ? 0 : getTapeStatus().hashCode());
        hashCode = prime * hashCode + ((getTapeUsedInBytes() == null) ? 0 : getTapeUsedInBytes().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        return hashCode;
    }

    @Override
    public TapeArchive clone() {
        try {
            return (TapeArchive) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.TapeArchiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
