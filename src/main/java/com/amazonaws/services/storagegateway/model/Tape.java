/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * Describes a virtual tape object.
 * </p>
 */
public class Tape implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String tapeARN;

    /**
     * The barcode that identifies a specific virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 16<br/>
     * <b>Pattern: </b>^[A-Z0-9]*$<br/>
     */
    private String tapeBarcode;

    /**
     * The size, in bytes, of the virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>107374182400 - 2748779069440<br/>
     */
    private Long tapeSizeInBytes;

    /**
     * The current state of the virtual tape.
     */
    private String tapeStatus;

    /**
     * The Virtual Tape Library (VTL) device that the virtual tape is
     * associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String vTLDevice;

    /**
     * For archiving virtual tapes, indicates how much data remains to be
     * uploaded before archiving is complete. <p>Range: 0 (not started) to
     * 100 (complete).
     */
    private Double progress;

    /**
     * The Amazon Resource Name (ARN) of the virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the virtual tape.
     */
    public String getTapeARN() {
        return tapeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param tapeARN The Amazon Resource Name (ARN) of the virtual tape.
     */
    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the virtual tape.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param tapeARN The Amazon Resource Name (ARN) of the virtual tape.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Tape withTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
        return this;
    }

    /**
     * The barcode that identifies a specific virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 16<br/>
     * <b>Pattern: </b>^[A-Z0-9]*$<br/>
     *
     * @return The barcode that identifies a specific virtual tape.
     */
    public String getTapeBarcode() {
        return tapeBarcode;
    }
    
    /**
     * The barcode that identifies a specific virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 16<br/>
     * <b>Pattern: </b>^[A-Z0-9]*$<br/>
     *
     * @param tapeBarcode The barcode that identifies a specific virtual tape.
     */
    public void setTapeBarcode(String tapeBarcode) {
        this.tapeBarcode = tapeBarcode;
    }
    
    /**
     * The barcode that identifies a specific virtual tape.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 16<br/>
     * <b>Pattern: </b>^[A-Z0-9]*$<br/>
     *
     * @param tapeBarcode The barcode that identifies a specific virtual tape.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Tape withTapeBarcode(String tapeBarcode) {
        this.tapeBarcode = tapeBarcode;
        return this;
    }

    /**
     * The size, in bytes, of the virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>107374182400 - 2748779069440<br/>
     *
     * @return The size, in bytes, of the virtual tape.
     */
    public Long getTapeSizeInBytes() {
        return tapeSizeInBytes;
    }
    
    /**
     * The size, in bytes, of the virtual tape.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>107374182400 - 2748779069440<br/>
     *
     * @param tapeSizeInBytes The size, in bytes, of the virtual tape.
     */
    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }
    
    /**
     * The size, in bytes, of the virtual tape.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>107374182400 - 2748779069440<br/>
     *
     * @param tapeSizeInBytes The size, in bytes, of the virtual tape.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Tape withTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
        return this;
    }

    /**
     * The current state of the virtual tape.
     *
     * @return The current state of the virtual tape.
     */
    public String getTapeStatus() {
        return tapeStatus;
    }
    
    /**
     * The current state of the virtual tape.
     *
     * @param tapeStatus The current state of the virtual tape.
     */
    public void setTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
    }
    
    /**
     * The current state of the virtual tape.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tapeStatus The current state of the virtual tape.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Tape withTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
        return this;
    }

    /**
     * The Virtual Tape Library (VTL) device that the virtual tape is
     * associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Virtual Tape Library (VTL) device that the virtual tape is
     *         associated with.
     */
    public String getVTLDevice() {
        return vTLDevice;
    }
    
    /**
     * The Virtual Tape Library (VTL) device that the virtual tape is
     * associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDevice The Virtual Tape Library (VTL) device that the virtual tape is
     *         associated with.
     */
    public void setVTLDevice(String vTLDevice) {
        this.vTLDevice = vTLDevice;
    }
    
    /**
     * The Virtual Tape Library (VTL) device that the virtual tape is
     * associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDevice The Virtual Tape Library (VTL) device that the virtual tape is
     *         associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Tape withVTLDevice(String vTLDevice) {
        this.vTLDevice = vTLDevice;
        return this;
    }

    /**
     * For archiving virtual tapes, indicates how much data remains to be
     * uploaded before archiving is complete. <p>Range: 0 (not started) to
     * 100 (complete).
     *
     * @return For archiving virtual tapes, indicates how much data remains to be
     *         uploaded before archiving is complete. <p>Range: 0 (not started) to
     *         100 (complete).
     */
    public Double getProgress() {
        return progress;
    }
    
    /**
     * For archiving virtual tapes, indicates how much data remains to be
     * uploaded before archiving is complete. <p>Range: 0 (not started) to
     * 100 (complete).
     *
     * @param progress For archiving virtual tapes, indicates how much data remains to be
     *         uploaded before archiving is complete. <p>Range: 0 (not started) to
     *         100 (complete).
     */
    public void setProgress(Double progress) {
        this.progress = progress;
    }
    
    /**
     * For archiving virtual tapes, indicates how much data remains to be
     * uploaded before archiving is complete. <p>Range: 0 (not started) to
     * 100 (complete).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress For archiving virtual tapes, indicates how much data remains to be
     *         uploaded before archiving is complete. <p>Range: 0 (not started) to
     *         100 (complete).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Tape withProgress(Double progress) {
        this.progress = progress;
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
        if (getTapeARN() != null) sb.append("TapeARN: " + getTapeARN() + ",");
        if (getTapeBarcode() != null) sb.append("TapeBarcode: " + getTapeBarcode() + ",");
        if (getTapeSizeInBytes() != null) sb.append("TapeSizeInBytes: " + getTapeSizeInBytes() + ",");
        if (getTapeStatus() != null) sb.append("TapeStatus: " + getTapeStatus() + ",");
        if (getVTLDevice() != null) sb.append("VTLDevice: " + getVTLDevice() + ",");
        if (getProgress() != null) sb.append("Progress: " + getProgress() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode()); 
        hashCode = prime * hashCode + ((getTapeBarcode() == null) ? 0 : getTapeBarcode().hashCode()); 
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getTapeStatus() == null) ? 0 : getTapeStatus().hashCode()); 
        hashCode = prime * hashCode + ((getVTLDevice() == null) ? 0 : getVTLDevice().hashCode()); 
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Tape == false) return false;
        Tape other = (Tape)obj;
        
        if (other.getTapeARN() == null ^ this.getTapeARN() == null) return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false) return false; 
        if (other.getTapeBarcode() == null ^ this.getTapeBarcode() == null) return false;
        if (other.getTapeBarcode() != null && other.getTapeBarcode().equals(this.getTapeBarcode()) == false) return false; 
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null) return false;
        if (other.getTapeSizeInBytes() != null && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false) return false; 
        if (other.getTapeStatus() == null ^ this.getTapeStatus() == null) return false;
        if (other.getTapeStatus() != null && other.getTapeStatus().equals(this.getTapeStatus()) == false) return false; 
        if (other.getVTLDevice() == null ^ this.getVTLDevice() == null) return false;
        if (other.getVTLDevice() != null && other.getVTLDevice().equals(this.getVTLDevice()) == false) return false; 
        if (other.getProgress() == null ^ this.getProgress() == null) return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false) return false; 
        return true;
    }
    
}
    