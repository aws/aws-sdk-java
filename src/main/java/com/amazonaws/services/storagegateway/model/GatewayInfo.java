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
 * Gateway Info
 */
public class GatewayInfo implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    private String gatewayType;

    private String gatewayOperationalState;

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GatewayInfo withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * Returns the value of the GatewayType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @return The value of the GatewayType property for this object.
     */
    public String getGatewayType() {
        return gatewayType;
    }
    
    /**
     * Sets the value of the GatewayType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType The new value for the GatewayType property for this object.
     */
    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }
    
    /**
     * Sets the value of the GatewayType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType The new value for the GatewayType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GatewayInfo withGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Returns the value of the GatewayOperationalState property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @return The value of the GatewayOperationalState property for this object.
     */
    public String getGatewayOperationalState() {
        return gatewayOperationalState;
    }
    
    /**
     * Sets the value of the GatewayOperationalState property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @param gatewayOperationalState The new value for the GatewayOperationalState property for this
     *         object.
     */
    public void setGatewayOperationalState(String gatewayOperationalState) {
        this.gatewayOperationalState = gatewayOperationalState;
    }
    
    /**
     * Sets the value of the GatewayOperationalState property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @param gatewayOperationalState The new value for the GatewayOperationalState property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GatewayInfo withGatewayOperationalState(String gatewayOperationalState) {
        this.gatewayOperationalState = gatewayOperationalState;
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
        if (getGatewayType() != null) sb.append("GatewayType: " + getGatewayType() + ",");
        if (getGatewayOperationalState() != null) sb.append("GatewayOperationalState: " + getGatewayOperationalState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayOperationalState() == null) ? 0 : getGatewayOperationalState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GatewayInfo == false) return false;
        GatewayInfo other = (GatewayInfo)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getGatewayType() == null ^ this.getGatewayType() == null) return false;
        if (other.getGatewayType() != null && other.getGatewayType().equals(this.getGatewayType()) == false) return false; 
        if (other.getGatewayOperationalState() == null ^ this.getGatewayOperationalState() == null) return false;
        if (other.getGatewayOperationalState() != null && other.getGatewayOperationalState().equals(this.getGatewayOperationalState()) == false) return false; 
        return true;
    }
    
}
    