/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents a virtual tape that is archived in the virtual tape shelf (VTS).
 * </p>
 */
public class TapeArchive implements Serializable, Cloneable {

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
     * The size, in bytes, of the archived virtual tape.
     * </p>
     */
    private Long tapeSizeInBytes;
    /**
     * <p>
     * The time that the archiving of the virtual tape was completed.
     * </p>
     * <p>
     * The string format of the completion time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway-VTL that the virtual tape is being retrieved to.
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
     * The string format of the completion time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     * 
     * @param completionTime
     *        The time that the archiving of the virtual tape was completed.</p>
     *        <p>
     *        The string format of the completion time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The time that the archiving of the virtual tape was completed.
     * </p>
     * <p>
     * The string format of the completion time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     * 
     * @return The time that the archiving of the virtual tape was completed.</p>
     *         <p>
     *         The string format of the completion time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The time that the archiving of the virtual tape was completed.
     * </p>
     * <p>
     * The string format of the completion time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * </p>
     * 
     * @param completionTime
     *        The time that the archiving of the virtual tape was completed.</p>
     *        <p>
     *        The string format of the completion time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeArchive withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway-VTL that the virtual tape is being retrieved to.
     * </p>
     * <p>
     * The virtual tape is retrieved from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param retrievedTo
     *        The Amazon Resource Name (ARN) of the gateway-VTL that the virtual tape is being retrieved to.</p>
     *        <p>
     *        The virtual tape is retrieved from the virtual tape shelf (VTS).
     */

    public void setRetrievedTo(String retrievedTo) {
        this.retrievedTo = retrievedTo;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway-VTL that the virtual tape is being retrieved to.
     * </p>
     * <p>
     * The virtual tape is retrieved from the virtual tape shelf (VTS).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway-VTL that the virtual tape is being retrieved to.</p>
     *         <p>
     *         The virtual tape is retrieved from the virtual tape shelf (VTS).
     */

    public String getRetrievedTo() {
        return this.retrievedTo;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway-VTL that the virtual tape is being retrieved to.
     * </p>
     * <p>
     * The virtual tape is retrieved from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param retrievedTo
     *        The Amazon Resource Name (ARN) of the gateway-VTL that the virtual tape is being retrieved to.</p>
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
            sb.append("TapeARN: " + getTapeARN() + ",");
        if (getTapeBarcode() != null)
            sb.append("TapeBarcode: " + getTapeBarcode() + ",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: " + getTapeSizeInBytes() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime() + ",");
        if (getRetrievedTo() != null)
            sb.append("RetrievedTo: " + getRetrievedTo() + ",");
        if (getTapeStatus() != null)
            sb.append("TapeStatus: " + getTapeStatus());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode + ((getTapeBarcode() == null) ? 0 : getTapeBarcode().hashCode());
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getRetrievedTo() == null) ? 0 : getRetrievedTo().hashCode());
        hashCode = prime * hashCode + ((getTapeStatus() == null) ? 0 : getTapeStatus().hashCode());
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
}
