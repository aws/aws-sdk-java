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
 * Describes a virtual tape.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/TapeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TapeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a virtual tape.
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
     * The size, in bytes, of a virtual tape.
     * </p>
     */
    private Long tapeSizeInBytes;
    /**
     * <p>
     * The status of the tape.
     * </p>
     */
    private String tapeStatus;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of gateways
     * for your account and region.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
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
     * The Amazon Resource Name (ARN) of a virtual tape.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of a virtual tape.
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a virtual tape.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a virtual tape.
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a virtual tape.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of a virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeInfo withTapeARN(String tapeARN) {
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

    public TapeInfo withTapeBarcode(String tapeBarcode) {
        setTapeBarcode(tapeBarcode);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of a virtual tape.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of a virtual tape.
     */

    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a virtual tape.
     * </p>
     * 
     * @return The size, in bytes, of a virtual tape.
     */

    public Long getTapeSizeInBytes() {
        return this.tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a virtual tape.
     * </p>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of a virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeInfo withTapeSizeInBytes(Long tapeSizeInBytes) {
        setTapeSizeInBytes(tapeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The status of the tape.
     * </p>
     * 
     * @param tapeStatus
     *        The status of the tape.
     */

    public void setTapeStatus(String tapeStatus) {
        this.tapeStatus = tapeStatus;
    }

    /**
     * <p>
     * The status of the tape.
     * </p>
     * 
     * @return The status of the tape.
     */

    public String getTapeStatus() {
        return this.tapeStatus;
    }

    /**
     * <p>
     * The status of the tape.
     * </p>
     * 
     * @param tapeStatus
     *        The status of the tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeInfo withTapeStatus(String tapeStatus) {
        setTapeStatus(tapeStatus);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of gateways
     * for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of
     *        gateways for your account and region.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of gateways
     * for your account and region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of
     *         gateways for your account and region.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of gateways
     * for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of
     *        gateways for your account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *        tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *        the pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @return The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *         the S3 storage class that is associated with the pool. When you use your backup application to eject the
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
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid values: "GLACIER", "DEEP_ARCHIVE"
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *        tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to
     *        the pool.</p>
     *        <p>
     *        Valid values: "GLACIER", "DEEP_ARCHIVE"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TapeInfo withPoolId(String poolId) {
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
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: ").append(getTapeSizeInBytes()).append(",");
        if (getTapeStatus() != null)
            sb.append("TapeStatus: ").append(getTapeStatus()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
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

        if (obj instanceof TapeInfo == false)
            return false;
        TapeInfo other = (TapeInfo) obj;
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
        if (other.getTapeStatus() == null ^ this.getTapeStatus() == null)
            return false;
        if (other.getTapeStatus() != null && other.getTapeStatus().equals(this.getTapeStatus()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
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
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getTapeStatus() == null) ? 0 : getTapeStatus().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        return hashCode;
    }

    @Override
    public TapeInfo clone() {
        try {
            return (TapeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.TapeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
