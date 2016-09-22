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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * CreateTapeWithBarcodeInput
 * </p>
 */
public class CreateTapeWithBarcodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * The size, in bytes, of the virtual tape that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     */
    private Long tapeSizeInBytes;
    /**
     * <p>
     * The barcode that you want to assign to the tape.
     * </p>
     */
    private String tapeBarcode;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use
     *        the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use
     *         the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use
     *        the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapeWithBarcodeRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tape that you want to create.</p> <note>
     *        <p>
     *        The size must be aligned by gigabyte (1024*1024*1024 byte).
     *        </p>
     */

    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @return The size, in bytes, of the virtual tape that you want to create.</p> <note>
     *         <p>
     *         The size must be aligned by gigabyte (1024*1024*1024 byte).
     *         </p>
     */

    public Long getTapeSizeInBytes() {
        return this.tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tape that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tape that you want to create.</p> <note>
     *        <p>
     *        The size must be aligned by gigabyte (1024*1024*1024 byte).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapeWithBarcodeRequest withTapeSizeInBytes(Long tapeSizeInBytes) {
        setTapeSizeInBytes(tapeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The barcode that you want to assign to the tape.
     * </p>
     * 
     * @param tapeBarcode
     *        The barcode that you want to assign to the tape.
     */

    public void setTapeBarcode(String tapeBarcode) {
        this.tapeBarcode = tapeBarcode;
    }

    /**
     * <p>
     * The barcode that you want to assign to the tape.
     * </p>
     * 
     * @return The barcode that you want to assign to the tape.
     */

    public String getTapeBarcode() {
        return this.tapeBarcode;
    }

    /**
     * <p>
     * The barcode that you want to assign to the tape.
     * </p>
     * 
     * @param tapeBarcode
     *        The barcode that you want to assign to the tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapeWithBarcodeRequest withTapeBarcode(String tapeBarcode) {
        setTapeBarcode(tapeBarcode);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: " + getTapeSizeInBytes() + ",");
        if (getTapeBarcode() != null)
            sb.append("TapeBarcode: " + getTapeBarcode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTapeWithBarcodeRequest == false)
            return false;
        CreateTapeWithBarcodeRequest other = (CreateTapeWithBarcodeRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getTapeBarcode() == null ^ this.getTapeBarcode() == null)
            return false;
        if (other.getTapeBarcode() != null && other.getTapeBarcode().equals(this.getTapeBarcode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getTapeBarcode() == null) ? 0 : getTapeBarcode().hashCode());
        return hashCode;
    }

    @Override
    public CreateTapeWithBarcodeRequest clone() {
        return (CreateTapeWithBarcodeRequest) super.clone();
    }
}
