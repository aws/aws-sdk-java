/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    private java.util.Date tapeCreatedDate;
    /**
     * <p>
     * The size, in bytes, of the virtual tape.
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
     * @param tapeCreatedDate
     */

    public void setTapeCreatedDate(java.util.Date tapeCreatedDate) {
        this.tapeCreatedDate = tapeCreatedDate;
    }

    /**
     * @return
     */

    public java.util.Date getTapeCreatedDate() {
        return this.tapeCreatedDate;
    }

    /**
     * @param tapeCreatedDate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tape withTapeCreatedDate(java.util.Date tapeCreatedDate) {
        setTapeCreatedDate(tapeCreatedDate);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tape.
     */

    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape.
     * </p>
     * 
     * @return The size, in bytes, of the virtual tape.
     */

    public Long getTapeSizeInBytes() {
        return this.tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tape.
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Progress: ").append(getProgress());
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
