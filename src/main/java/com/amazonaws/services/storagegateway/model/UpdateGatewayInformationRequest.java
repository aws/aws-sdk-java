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
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#updateGatewayInformation(UpdateGatewayInformationRequest) UpdateGatewayInformation operation}.
 * <p>
 * This operation updates a gateway's metadata, which includes the gateway's name and time zone. To specify which gateway to update, use the Amazon
 * Resource Name (ARN) of the gateway in your request.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#updateGatewayInformation(UpdateGatewayInformationRequest)
 */
public class UpdateGatewayInformationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     */
    private String gatewayName;

    private String gatewayTimezone;

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
    public UpdateGatewayInformationRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @return A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations.
     */
    public String getGatewayName() {
        return gatewayName;
    }
    
    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @param gatewayName A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations.
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }
    
    /**
     * A unique identifier for your gateway. This name becomes part of the
     * gateway Amazon Resources Name (ARN) which is what you use as an input
     * to other operations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 255<br/>
     * <b>Pattern: </b>^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$<br/>
     *
     * @param gatewayName A unique identifier for your gateway. This name becomes part of the
     *         gateway Amazon Resources Name (ARN) which is what you use as an input
     *         to other operations.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateGatewayInformationRequest withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }

    /**
     * Returns the value of the GatewayTimezone property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return The value of the GatewayTimezone property for this object.
     */
    public String getGatewayTimezone() {
        return gatewayTimezone;
    }
    
    /**
     * Sets the value of the GatewayTimezone property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone The new value for the GatewayTimezone property for this object.
     */
    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }
    
    /**
     * Sets the value of the GatewayTimezone property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone The new value for the GatewayTimezone property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateGatewayInformationRequest withGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
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
        if (getGatewayName() != null) sb.append("GatewayName: " + getGatewayName() + ",");
        if (getGatewayTimezone() != null) sb.append("GatewayTimezone: " + getGatewayTimezone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateGatewayInformationRequest == false) return false;
        UpdateGatewayInformationRequest other = (UpdateGatewayInformationRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getGatewayName() == null ^ this.getGatewayName() == null) return false;
        if (other.getGatewayName() != null && other.getGatewayName().equals(this.getGatewayName()) == false) return false; 
        if (other.getGatewayTimezone() == null ^ this.getGatewayTimezone() == null) return false;
        if (other.getGatewayTimezone() != null && other.getGatewayTimezone().equals(this.getGatewayTimezone()) == false) return false; 
        return true;
    }
    
}
    