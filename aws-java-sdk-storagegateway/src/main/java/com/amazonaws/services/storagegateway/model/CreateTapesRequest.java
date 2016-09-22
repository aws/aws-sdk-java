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
 * CreateTapesInput
 * </p>
 */
public class CreateTapesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
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
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     * </p>
     * </note>
     */
    private String clientToken;
    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     */
    private Integer numTapesToCreate;
    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     */
    private String tapeBarcodePrefix;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use
     *        the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with.
     *         Use the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use
     *        the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tapes that you want to create.</p> <note>
     *        <p>
     *        The size must be aligned by gigabyte (1024*1024*1024 byte).
     *        </p>
     */

    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @return The size, in bytes, of the virtual tapes that you want to create.</p> <note>
     *         <p>
     *         The size must be aligned by gigabyte (1024*1024*1024 byte).
     *         </p>
     */

    public Long getTapeSizeInBytes() {
        return this.tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 byte).
     * </p>
     * </note>
     * 
     * @param tapeSizeInBytes
     *        The size, in bytes, of the virtual tapes that you want to create.</p> <note>
     *        <p>
     *        The size must be aligned by gigabyte (1024*1024*1024 byte).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withTapeSizeInBytes(Long tapeSizeInBytes) {
        setTapeSizeInBytes(tapeSizeInBytes);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     * </p>
     * </note>
     * 
     * @param clientToken
     *        A unique identifier that you use to retry a request. If you retry a request, use the same
     *        <code>ClientToken</code> you specified in the initial request.</p> <note>
     *        <p>
     *        Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     *        </p>
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     * </p>
     * </note>
     * 
     * @return A unique identifier that you use to retry a request. If you retry a request, use the same
     *         <code>ClientToken</code> you specified in the initial request.</p> <note>
     *         <p>
     *         Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     *         </p>
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a request, use the same
     * <code>ClientToken</code> you specified in the initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     * </p>
     * </note>
     * 
     * @param clientToken
     *        A unique identifier that you use to retry a request. If you retry a request, use the same
     *        <code>ClientToken</code> you specified in the initial request.</p> <note>
     *        <p>
     *        Using the same <code>ClientToken</code> prevents creating the tape multiple times.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * 
     * @param numTapesToCreate
     *        The number of virtual tapes that you want to create.
     */

    public void setNumTapesToCreate(Integer numTapesToCreate) {
        this.numTapesToCreate = numTapesToCreate;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * 
     * @return The number of virtual tapes that you want to create.
     */

    public Integer getNumTapesToCreate() {
        return this.numTapesToCreate;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * 
     * @param numTapesToCreate
     *        The number of virtual tapes that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withNumTapesToCreate(Integer numTapesToCreate) {
        setNumTapesToCreate(numTapesToCreate);
        return this;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @param tapeBarcodePrefix
     *        A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the
     *        barcode unique.</p> <note>
     *        <p>
     *        The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     *        </p>
     */

    public void setTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @return A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the
     *         barcode unique.</p> <note>
     *         <p>
     *         The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     *         </p>
     */

    public String getTapeBarcodePrefix() {
        return this.tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode
     * unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     * </p>
     * </note>
     * 
     * @param tapeBarcodePrefix
     *        A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the
     *        barcode unique.</p> <note>
     *        <p>
     *        The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapesRequest withTapeBarcodePrefix(String tapeBarcodePrefix) {
        setTapeBarcodePrefix(tapeBarcodePrefix);
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getNumTapesToCreate() != null)
            sb.append("NumTapesToCreate: " + getNumTapesToCreate() + ",");
        if (getTapeBarcodePrefix() != null)
            sb.append("TapeBarcodePrefix: " + getTapeBarcodePrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTapesRequest == false)
            return false;
        CreateTapesRequest other = (CreateTapesRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNumTapesToCreate() == null ^ this.getNumTapesToCreate() == null)
            return false;
        if (other.getNumTapesToCreate() != null && other.getNumTapesToCreate().equals(this.getNumTapesToCreate()) == false)
            return false;
        if (other.getTapeBarcodePrefix() == null ^ this.getTapeBarcodePrefix() == null)
            return false;
        if (other.getTapeBarcodePrefix() != null && other.getTapeBarcodePrefix().equals(this.getTapeBarcodePrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNumTapesToCreate() == null) ? 0 : getNumTapesToCreate().hashCode());
        hashCode = prime * hashCode + ((getTapeBarcodePrefix() == null) ? 0 : getTapeBarcodePrefix().hashCode());
        return hashCode;
    }

    @Override
    public CreateTapesRequest clone() {
        return (CreateTapesRequest) super.clone();
    }
}
