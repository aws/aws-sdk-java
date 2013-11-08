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
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#retrieveTapeArchive(RetrieveTapeArchiveRequest) RetrieveTapeArchive operation}.
 * <p>
 * Retrieves an archived virtual tape from the Virtual Tape Shelf (VTS) to a Gateway-Virtual Tape Library. Virtual tapes archived in the Virtual Tape
 * Shelf (VTS) are not associated with any gateway. However after a tape is retrieved, it is associated with a gateway though it also listed in VTS.
 * </p>
 * <p>
 * Once a tape is successfully retrieved to a gateway, it cannot be retrieved again to another gateway. You must archive the tape again before you can
 * retrieve it to another gateway.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#retrieveTapeArchive(RetrieveTapeArchiveRequest)
 */
public class RetrieveTapeArchiveRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the virtual tape you want to
     * retrieve from the Virtual Tape Shelf (VTS).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String tapeARN;

    /**
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     * virtual tape to. Use the <a>ListGateways</a> operation to return a
     * list of gateways for your account and region. <p>You retrieve archived
     * virtual tapes to only one gateway and the gateway must be a
     * Gateway-Virtual Tape Library.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * The Amazon Resource Name (ARN) of the virtual tape you want to
     * retrieve from the Virtual Tape Shelf (VTS).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the virtual tape you want to
     *         retrieve from the Virtual Tape Shelf (VTS).
     */
    public String getTapeARN() {
        return tapeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the virtual tape you want to
     * retrieve from the Virtual Tape Shelf (VTS).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param tapeARN The Amazon Resource Name (ARN) of the virtual tape you want to
     *         retrieve from the Virtual Tape Shelf (VTS).
     */
    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the virtual tape you want to
     * retrieve from the Virtual Tape Shelf (VTS).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param tapeARN The Amazon Resource Name (ARN) of the virtual tape you want to
     *         retrieve from the Virtual Tape Shelf (VTS).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RetrieveTapeArchiveRequest withTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     * virtual tape to. Use the <a>ListGateways</a> operation to return a
     * list of gateways for your account and region. <p>You retrieve archived
     * virtual tapes to only one gateway and the gateway must be a
     * Gateway-Virtual Tape Library.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     *         virtual tape to. Use the <a>ListGateways</a> operation to return a
     *         list of gateways for your account and region. <p>You retrieve archived
     *         virtual tapes to only one gateway and the gateway must be a
     *         Gateway-Virtual Tape Library.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     * virtual tape to. Use the <a>ListGateways</a> operation to return a
     * list of gateways for your account and region. <p>You retrieve archived
     * virtual tapes to only one gateway and the gateway must be a
     * Gateway-Virtual Tape Library.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     *         virtual tape to. Use the <a>ListGateways</a> operation to return a
     *         list of gateways for your account and region. <p>You retrieve archived
     *         virtual tapes to only one gateway and the gateway must be a
     *         Gateway-Virtual Tape Library.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     * virtual tape to. Use the <a>ListGateways</a> operation to return a
     * list of gateways for your account and region. <p>You retrieve archived
     * virtual tapes to only one gateway and the gateway must be a
     * Gateway-Virtual Tape Library.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway you want to retrieve the
     *         virtual tape to. Use the <a>ListGateways</a> operation to return a
     *         list of gateways for your account and region. <p>You retrieve archived
     *         virtual tapes to only one gateway and the gateway must be a
     *         Gateway-Virtual Tape Library.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RetrieveTapeArchiveRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
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
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RetrieveTapeArchiveRequest == false) return false;
        RetrieveTapeArchiveRequest other = (RetrieveTapeArchiveRequest)obj;
        
        if (other.getTapeARN() == null ^ this.getTapeARN() == null) return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false) return false; 
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        return true;
    }
    
}
    