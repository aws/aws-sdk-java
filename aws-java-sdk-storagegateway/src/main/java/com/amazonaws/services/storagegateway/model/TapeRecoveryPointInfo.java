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
 * Describes a recovery point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/TapeRecoveryPointInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TapeRecoveryPointInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape.
     * </p>
     */
    private String tapeARN;
    /**
     * <p>
     * The time when the point-in-time view of the virtual tape was replicated for later recovery.
     * </p>
     * <p>
     * The default time stamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z'
     * format.
     * </p>
     */
    private java.util.Date tapeRecoveryPointTime;
    /**
     * <p>
     * The size, in bytes, of the virtual tapes to recover.
     * </p>
     */
    private Long tapeSizeInBytes;
    /**
     * <p>
     * The status of the virtual tapes.
     * </p>
     */
    private String tapeStatus;

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

    public TapeRecoveryPointInfo withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
        return this;
    }

    /**
     * <p>
     * The time when the point-in-time view of the virtual tape was replicated for later recovery.
     * </p>
     * <p>
     * The default time stamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z'
     * format.
     * </p>
     * 
     * @param tapeRecoveryPointTime
     *        The time when the point-in-time view of the virtual tape was replicated for later recovery.</p>
     *        <p>
     *        The default time stamp format of the tape recovery point time is in the ISO8601 extended
     *        YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */

    public void setTapeRecoveryPointTime(java.util.Date tapeRecoveryPointTime) {
        this.tapeRecoveryPointTime = tapeRecoveryPointTime;
    }

    /**
     * <p>
     * The time when the point-in-time view of the virtual tape was replicated for later recovery.
     * </p>
     * <p>
     * The default time stamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z'
     * format.
     * </p>
     * 
     * @return The time when the point-in-time view of the virtual tape was replicated for later recovery.</p>
     *         <p>
     *         The default time stamp format of the tape recovery point time is in the ISO8601 extended
     *         YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */

    public java.util.Date getTapeRecoveryPointTime() {
        return this.tapeRecoveryPointTime;
    }

    /**
     * <p>
     * The time when the point-in-time view of the virtual tape was replicated for later recovery.
     * </p>
     * <p>
     * The default time stamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z'
     * format.
     * </p>
     * 
     * @param tapeRecoveryPointTime
     *        The time when the point-in-time view of the virtual tape was replicated for later recovery.</p>
     *        <p>
     *        The default time stamp format of the tape recovery point time is in the ISO8601 extended
     *        YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeRecoveryPointInfo withTapeRecoveryPointTime(java.util.Date tapeRecoveryPointTime) {
        setTapeRecoveryPointTime(tapeRecoveryPointTime);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes to recover.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tapes to recover.
     */

    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes to recover.
     * </p>
     * 
     * @return The size, in bytes, of the virtual tapes to recover.
     */

    public Long getTapeSizeInBytes() {
        return this.tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes to recover.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tapes to recover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeRecoveryPointInfo withTapeSizeInBytes(Long tapeSizeInBytes) {
        setTapeSizeInBytes(tapeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The status of the virtual tapes.
     * </p>
     * 
     * @param tapeStatus
     *        The status of the virtual tapes.
     */

    public void setTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
    }

    /**
     * <p>
     * The status of the virtual tapes.
     * </p>
     * 
     * @return The status of the virtual tapes.
     */

    public String getTapeStatus() {
        return this.tapeStatus;
    }

    /**
     * <p>
     * The status of the virtual tapes.
     * </p>
     * 
     * @param tapeStatus
     *        The status of the virtual tapes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeRecoveryPointInfo withTapeStatus(String tapeStatus) {
        setTapeStatus(tapeStatus);
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
        if (getTapeRecoveryPointTime() != null)
            sb.append("TapeRecoveryPointTime: ").append(getTapeRecoveryPointTime()).append(",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: ").append(getTapeSizeInBytes()).append(",");
        if (getTapeStatus() != null)
            sb.append("TapeStatus: ").append(getTapeStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TapeRecoveryPointInfo == false)
            return false;
        TapeRecoveryPointInfo other = (TapeRecoveryPointInfo) obj;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getTapeRecoveryPointTime() == null ^ this.getTapeRecoveryPointTime() == null)
            return false;
        if (other.getTapeRecoveryPointTime() != null && other.getTapeRecoveryPointTime().equals(this.getTapeRecoveryPointTime()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getTapeStatus() == null ^ this.getTapeStatus() == null)
            return false;
        if (other.getTapeStatus() != null && other.getTapeStatus().equals(this.getTapeStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode + ((getTapeRecoveryPointTime() == null) ? 0 : getTapeRecoveryPointTime().hashCode());
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getTapeStatus() == null) ? 0 : getTapeStatus().hashCode());
        return hashCode;
    }

    @Override
    public TapeRecoveryPointInfo clone() {
        try {
            return (TapeRecoveryPointInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.TapeRecoveryPointInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
