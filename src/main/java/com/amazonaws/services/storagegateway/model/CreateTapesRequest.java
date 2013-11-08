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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#createTapes(CreateTapesRequest) CreateTapes operation}.
 * <p>
 * Creates one or more virtual tapes. You write data to the virtual tapes and then archive the tapes.
 * </p>
 * <p>
 * <b>NOTE:</b>Cache storage must be allocated to the gateway before you can create virtual tapes. Use the AddCache operation to add cache storage to a
 * gateway.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#createTapes(CreateTapesRequest)
 */
public class CreateTapesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique Amazon Resource Name(ARN) that represents the gateway to
     * associate the virtual tapes with. Use the <a>ListGateways</a>
     * operation to return a list of gateways for your account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * The size, in bytes, of the virtual tapes you want to create. <note>The
     * size must be gigabyte (1024*1024*1024 byte) aligned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>107374182400 - 2748779069440<br/>
     */
    private Long tapeSizeInBytes;

    /**
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request. <note>Using the same <code>ClientToken</code>
     * prevents creating the tape multiple times.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     */
    private String clientToken;

    /**
     * The number of virtual tapes you want to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer numTapesToCreate;

    /**
     * A prefix you append to the barcode of the virtual tape you are
     * creating. This makes a barcode unique. <note>The prefix must be 1 to 4
     * characters in length and must be upper-case letters A-Z.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     */
    private String tapeBarcodePrefix;

    /**
     * The unique Amazon Resource Name(ARN) that represents the gateway to
     * associate the virtual tapes with. Use the <a>ListGateways</a>
     * operation to return a list of gateways for your account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The unique Amazon Resource Name(ARN) that represents the gateway to
     *         associate the virtual tapes with. Use the <a>ListGateways</a>
     *         operation to return a list of gateways for your account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The unique Amazon Resource Name(ARN) that represents the gateway to
     * associate the virtual tapes with. Use the <a>ListGateways</a>
     * operation to return a list of gateways for your account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The unique Amazon Resource Name(ARN) that represents the gateway to
     *         associate the virtual tapes with. Use the <a>ListGateways</a>
     *         operation to return a list of gateways for your account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The unique Amazon Resource Name(ARN) that represents the gateway to
     * associate the virtual tapes with. Use the <a>ListGateways</a>
     * operation to return a list of gateways for your account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The unique Amazon Resource Name(ARN) that represents the gateway to
     *         associate the virtual tapes with. Use the <a>ListGateways</a>
     *         operation to return a list of gateways for your account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTapesRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * The size, in bytes, of the virtual tapes you want to create. <note>The
     * size must be gigabyte (1024*1024*1024 byte) aligned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>107374182400 - 2748779069440<br/>
     *
     * @return The size, in bytes, of the virtual tapes you want to create. <note>The
     *         size must be gigabyte (1024*1024*1024 byte) aligned.</note>
     */
    public Long getTapeSizeInBytes() {
        return tapeSizeInBytes;
    }
    
    /**
     * The size, in bytes, of the virtual tapes you want to create. <note>The
     * size must be gigabyte (1024*1024*1024 byte) aligned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>107374182400 - 2748779069440<br/>
     *
     * @param tapeSizeInBytes The size, in bytes, of the virtual tapes you want to create. <note>The
     *         size must be gigabyte (1024*1024*1024 byte) aligned.</note>
     */
    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }
    
    /**
     * The size, in bytes, of the virtual tapes you want to create. <note>The
     * size must be gigabyte (1024*1024*1024 byte) aligned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>107374182400 - 2748779069440<br/>
     *
     * @param tapeSizeInBytes The size, in bytes, of the virtual tapes you want to create. <note>The
     *         size must be gigabyte (1024*1024*1024 byte) aligned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTapesRequest withTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
        return this;
    }

    /**
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request. <note>Using the same <code>ClientToken</code>
     * prevents creating the tape multiple times.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @return A unique identifier that you use to retry a request. If you retry a
     *         request, use the same <code>ClientToken</code> you specified in the
     *         initial request. <note>Using the same <code>ClientToken</code>
     *         prevents creating the tape multiple times.</note>
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request. <note>Using the same <code>ClientToken</code>
     * prevents creating the tape multiple times.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken A unique identifier that you use to retry a request. If you retry a
     *         request, use the same <code>ClientToken</code> you specified in the
     *         initial request. <note>Using the same <code>ClientToken</code>
     *         prevents creating the tape multiple times.</note>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request. <note>Using the same <code>ClientToken</code>
     * prevents creating the tape multiple times.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken A unique identifier that you use to retry a request. If you retry a
     *         request, use the same <code>ClientToken</code> you specified in the
     *         initial request. <note>Using the same <code>ClientToken</code>
     *         prevents creating the tape multiple times.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTapesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The number of virtual tapes you want to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return The number of virtual tapes you want to create.
     */
    public Integer getNumTapesToCreate() {
        return numTapesToCreate;
    }
    
    /**
     * The number of virtual tapes you want to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param numTapesToCreate The number of virtual tapes you want to create.
     */
    public void setNumTapesToCreate(Integer numTapesToCreate) {
        this.numTapesToCreate = numTapesToCreate;
    }
    
    /**
     * The number of virtual tapes you want to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param numTapesToCreate The number of virtual tapes you want to create.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTapesRequest withNumTapesToCreate(Integer numTapesToCreate) {
        this.numTapesToCreate = numTapesToCreate;
        return this;
    }

    /**
     * A prefix you append to the barcode of the virtual tape you are
     * creating. This makes a barcode unique. <note>The prefix must be 1 to 4
     * characters in length and must be upper-case letters A-Z.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @return A prefix you append to the barcode of the virtual tape you are
     *         creating. This makes a barcode unique. <note>The prefix must be 1 to 4
     *         characters in length and must be upper-case letters A-Z.</note>
     */
    public String getTapeBarcodePrefix() {
        return tapeBarcodePrefix;
    }
    
    /**
     * A prefix you append to the barcode of the virtual tape you are
     * creating. This makes a barcode unique. <note>The prefix must be 1 to 4
     * characters in length and must be upper-case letters A-Z.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @param tapeBarcodePrefix A prefix you append to the barcode of the virtual tape you are
     *         creating. This makes a barcode unique. <note>The prefix must be 1 to 4
     *         characters in length and must be upper-case letters A-Z.</note>
     */
    public void setTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
    }
    
    /**
     * A prefix you append to the barcode of the virtual tape you are
     * creating. This makes a barcode unique. <note>The prefix must be 1 to 4
     * characters in length and must be upper-case letters A-Z.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @param tapeBarcodePrefix A prefix you append to the barcode of the virtual tape you are
     *         creating. This makes a barcode unique. <note>The prefix must be 1 to 4
     *         characters in length and must be upper-case letters A-Z.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTapesRequest withTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
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
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getTapeSizeInBytes() != null) sb.append("TapeSizeInBytes: " + getTapeSizeInBytes() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getNumTapesToCreate() != null) sb.append("NumTapesToCreate: " + getNumTapesToCreate() + ",");
        if (getTapeBarcodePrefix() != null) sb.append("TapeBarcodePrefix: " + getTapeBarcodePrefix() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTapesRequest == false) return false;
        CreateTapesRequest other = (CreateTapesRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null) return false;
        if (other.getTapeSizeInBytes() != null && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getNumTapesToCreate() == null ^ this.getNumTapesToCreate() == null) return false;
        if (other.getNumTapesToCreate() != null && other.getNumTapesToCreate().equals(this.getNumTapesToCreate()) == false) return false; 
        if (other.getTapeBarcodePrefix() == null ^ this.getTapeBarcodePrefix() == null) return false;
        if (other.getTapeBarcodePrefix() != null && other.getTapeBarcodePrefix().equals(this.getTapeBarcodePrefix()) == false) return false; 
        return true;
    }
    
}
    