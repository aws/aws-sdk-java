/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An automatic tape creation policy consists of automatic tape creation rules where each rule defines when and how to
 * create new tapes. For more information about automatic tape creation, see <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedCreateTapes.html#CreateTapesAutomatically"
 * >Creating Tapes Automatically</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AutomaticTapeCreationRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomaticTapeCreationRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     */
    private String tapeBarcodePrefix;
    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the
     * Amazon S3 storage class that is associated with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to
     * the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The size, in bytes, of the virtual tape capacity.
     * </p>
     */
    private Long tapeSizeInBytes;
    /**
     * <p>
     * The minimum number of available virtual tapes that the gateway maintains at all times. If the number of tapes on
     * the gateway goes below this value, the gateway creates as many new tapes as are needed to have
     * <code>MinimumNumTapes</code> on the gateway. For more information about automatic tape creation, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedCreateTapes.html#CreateTapesAutomatically"
     * >Creating Tapes Automatically</a>.
     * </p>
     */
    private Integer minimumNumTapes;
    /**
     * <p>
     * Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     * <code>false</code> when WORM is not enabled for tapes.
     * </p>
     */
    private Boolean worm;

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @param tapeBarcodePrefix
     *        A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the
     *        barcode unique.</p> <note>
     *        <p>
     *        The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z.
     *        </p>
     */

    public void setTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @return A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the
     *         barcode unique.</p> <note>
     *         <p>
     *         The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z.
     *         </p>
     */

    public String getTapeBarcodePrefix() {
        return this.tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @param tapeBarcodePrefix
     *        A prefix that you append to the barcode of the virtual tape that you are creating. This prefix makes the
     *        barcode unique.</p> <note>
     *        <p>
     *        The prefix must be 1-4 characters in length and must be one of the uppercase letters from A to Z.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticTapeCreationRule withTapeBarcodePrefix(String tapeBarcodePrefix) {
        setTapeBarcodePrefix(tapeBarcodePrefix);
        return this;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the
     * Amazon S3 storage class that is associated with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to
     * the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the Amazon S3 storage class that is associated with the pool. When you use your backup application to
     *        eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep
     *        Archive) that corresponds to the pool.</p>
     *        <p>
     *        Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the
     * Amazon S3 storage class that is associated with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to
     * the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * 
     * @return The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *         the Amazon S3 storage class that is associated with the pool. When you use your backup application to
     *         eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep
     *         Archive) that corresponds to the pool.</p>
     *         <p>
     *         Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the
     * Amazon S3 storage class that is associated with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to
     * the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the Amazon S3 storage class that is associated with the pool. When you use your backup application to
     *        eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep
     *        Archive) that corresponds to the pool.</p>
     *        <p>
     *        Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticTapeCreationRule withPoolId(String poolId) {
        setPoolId(poolId);
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

    public AutomaticTapeCreationRule withTapeSizeInBytes(Long tapeSizeInBytes) {
        setTapeSizeInBytes(tapeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The minimum number of available virtual tapes that the gateway maintains at all times. If the number of tapes on
     * the gateway goes below this value, the gateway creates as many new tapes as are needed to have
     * <code>MinimumNumTapes</code> on the gateway. For more information about automatic tape creation, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedCreateTapes.html#CreateTapesAutomatically"
     * >Creating Tapes Automatically</a>.
     * </p>
     * 
     * @param minimumNumTapes
     *        The minimum number of available virtual tapes that the gateway maintains at all times. If the number of
     *        tapes on the gateway goes below this value, the gateway creates as many new tapes as are needed to have
     *        <code>MinimumNumTapes</code> on the gateway. For more information about automatic tape creation, see <a
     *        href=
     *        "https://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedCreateTapes.html#CreateTapesAutomatically"
     *        >Creating Tapes Automatically</a>.
     */

    public void setMinimumNumTapes(Integer minimumNumTapes) {
        this.minimumNumTapes = minimumNumTapes;
    }

    /**
     * <p>
     * The minimum number of available virtual tapes that the gateway maintains at all times. If the number of tapes on
     * the gateway goes below this value, the gateway creates as many new tapes as are needed to have
     * <code>MinimumNumTapes</code> on the gateway. For more information about automatic tape creation, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedCreateTapes.html#CreateTapesAutomatically"
     * >Creating Tapes Automatically</a>.
     * </p>
     * 
     * @return The minimum number of available virtual tapes that the gateway maintains at all times. If the number of
     *         tapes on the gateway goes below this value, the gateway creates as many new tapes as are needed to have
     *         <code>MinimumNumTapes</code> on the gateway. For more information about automatic tape creation, see <a
     *         href=
     *         "https://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedCreateTapes.html#CreateTapesAutomatically"
     *         >Creating Tapes Automatically</a>.
     */

    public Integer getMinimumNumTapes() {
        return this.minimumNumTapes;
    }

    /**
     * <p>
     * The minimum number of available virtual tapes that the gateway maintains at all times. If the number of tapes on
     * the gateway goes below this value, the gateway creates as many new tapes as are needed to have
     * <code>MinimumNumTapes</code> on the gateway. For more information about automatic tape creation, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedCreateTapes.html#CreateTapesAutomatically"
     * >Creating Tapes Automatically</a>.
     * </p>
     * 
     * @param minimumNumTapes
     *        The minimum number of available virtual tapes that the gateway maintains at all times. If the number of
     *        tapes on the gateway goes below this value, the gateway creates as many new tapes as are needed to have
     *        <code>MinimumNumTapes</code> on the gateway. For more information about automatic tape creation, see <a
     *        href=
     *        "https://docs.aws.amazon.com/storagegateway/latest/userguide/GettingStartedCreateTapes.html#CreateTapesAutomatically"
     *        >Creating Tapes Automatically</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticTapeCreationRule withMinimumNumTapes(Integer minimumNumTapes) {
        setMinimumNumTapes(minimumNumTapes);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     * <code>false</code> when WORM is not enabled for tapes.
     * </p>
     * 
     * @param worm
     *        Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     *        <code>false</code> when WORM is not enabled for tapes.
     */

    public void setWorm(Boolean worm) {
        this.worm = worm;
    }

    /**
     * <p>
     * Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     * <code>false</code> when WORM is not enabled for tapes.
     * </p>
     * 
     * @return Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     *         <code>false</code> when WORM is not enabled for tapes.
     */

    public Boolean getWorm() {
        return this.worm;
    }

    /**
     * <p>
     * Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     * <code>false</code> when WORM is not enabled for tapes.
     * </p>
     * 
     * @param worm
     *        Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     *        <code>false</code> when WORM is not enabled for tapes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticTapeCreationRule withWorm(Boolean worm) {
        setWorm(worm);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     * <code>false</code> when WORM is not enabled for tapes.
     * </p>
     * 
     * @return Set to <code>true</code> to indicate that tapes are to be archived as write-once-read-many (WORM). Set to
     *         <code>false</code> when WORM is not enabled for tapes.
     */

    public Boolean isWorm() {
        return this.worm;
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
        if (getTapeBarcodePrefix() != null)
            sb.append("TapeBarcodePrefix: ").append(getTapeBarcodePrefix()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: ").append(getTapeSizeInBytes()).append(",");
        if (getMinimumNumTapes() != null)
            sb.append("MinimumNumTapes: ").append(getMinimumNumTapes()).append(",");
        if (getWorm() != null)
            sb.append("Worm: ").append(getWorm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomaticTapeCreationRule == false)
            return false;
        AutomaticTapeCreationRule other = (AutomaticTapeCreationRule) obj;
        if (other.getTapeBarcodePrefix() == null ^ this.getTapeBarcodePrefix() == null)
            return false;
        if (other.getTapeBarcodePrefix() != null && other.getTapeBarcodePrefix().equals(this.getTapeBarcodePrefix()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getMinimumNumTapes() == null ^ this.getMinimumNumTapes() == null)
            return false;
        if (other.getMinimumNumTapes() != null && other.getMinimumNumTapes().equals(this.getMinimumNumTapes()) == false)
            return false;
        if (other.getWorm() == null ^ this.getWorm() == null)
            return false;
        if (other.getWorm() != null && other.getWorm().equals(this.getWorm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeBarcodePrefix() == null) ? 0 : getTapeBarcodePrefix().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getMinimumNumTapes() == null) ? 0 : getMinimumNumTapes().hashCode());
        hashCode = prime * hashCode + ((getWorm() == null) ? 0 : getWorm().hashCode());
        return hashCode;
    }

    @Override
    public AutomaticTapeCreationRule clone() {
        try {
            return (AutomaticTapeCreationRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.AutomaticTapeCreationRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
