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
 * A JSON object containing the following fields:
 * </p>
 */
public class DescribeGatewayInformationResult implements Serializable {

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
     * The gateway ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String gatewayId;

    /**
     * One of the values that indicates the time zone configured for the
     * gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     */
    private String gatewayTimezone;

    /**
     * One of the values that indicates the operating state of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     */
    private String gatewayState;

    /**
     * A <a>NetworkInterface</a> array that contains descriptions of the
     * gateway network interfaces.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NetworkInterface> gatewayNetworkInterfaces;

    /**
     * TBD
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     */
    private String gatewayType;

    /**
     * The date at which an update to the gateway is available. This date is
     * in the time zone of the gateway. If the gateway is not available for
     * an update this field is not returned in the response. <!-- Q: [eronh]
     * This next sentence doesn't seem to agree with the preceding one, nor
     * does it agree with the response example. -->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private String nextUpdateAvailabilityDate;

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
    public DescribeGatewayInformationResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * The gateway ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return The gateway ID.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * The gateway ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param gatewayId The gateway ID.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * The gateway ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param gatewayId The gateway ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeGatewayInformationResult withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * One of the values that indicates the time zone configured for the
     * gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return One of the values that indicates the time zone configured for the
     *         gateway.
     */
    public String getGatewayTimezone() {
        return gatewayTimezone;
    }
    
    /**
     * One of the values that indicates the time zone configured for the
     * gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone One of the values that indicates the time zone configured for the
     *         gateway.
     */
    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }
    
    /**
     * One of the values that indicates the time zone configured for the
     * gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone One of the values that indicates the time zone configured for the
     *         gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeGatewayInformationResult withGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
        return this;
    }

    /**
     * One of the values that indicates the operating state of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @return One of the values that indicates the operating state of the gateway.
     */
    public String getGatewayState() {
        return gatewayState;
    }
    
    /**
     * One of the values that indicates the operating state of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @param gatewayState One of the values that indicates the operating state of the gateway.
     */
    public void setGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
    }
    
    /**
     * One of the values that indicates the operating state of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @param gatewayState One of the values that indicates the operating state of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeGatewayInformationResult withGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
        return this;
    }

    /**
     * A <a>NetworkInterface</a> array that contains descriptions of the
     * gateway network interfaces.
     *
     * @return A <a>NetworkInterface</a> array that contains descriptions of the
     *         gateway network interfaces.
     */
    public java.util.List<NetworkInterface> getGatewayNetworkInterfaces() {
        if (gatewayNetworkInterfaces == null) {
              gatewayNetworkInterfaces = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkInterface>();
              gatewayNetworkInterfaces.setAutoConstruct(true);
        }
        return gatewayNetworkInterfaces;
    }
    
    /**
     * A <a>NetworkInterface</a> array that contains descriptions of the
     * gateway network interfaces.
     *
     * @param gatewayNetworkInterfaces A <a>NetworkInterface</a> array that contains descriptions of the
     *         gateway network interfaces.
     */
    public void setGatewayNetworkInterfaces(java.util.Collection<NetworkInterface> gatewayNetworkInterfaces) {
        if (gatewayNetworkInterfaces == null) {
            this.gatewayNetworkInterfaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NetworkInterface> gatewayNetworkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkInterface>(gatewayNetworkInterfaces.size());
        gatewayNetworkInterfacesCopy.addAll(gatewayNetworkInterfaces);
        this.gatewayNetworkInterfaces = gatewayNetworkInterfacesCopy;
    }
    
    /**
     * A <a>NetworkInterface</a> array that contains descriptions of the
     * gateway network interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayNetworkInterfaces A <a>NetworkInterface</a> array that contains descriptions of the
     *         gateway network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeGatewayInformationResult withGatewayNetworkInterfaces(NetworkInterface... gatewayNetworkInterfaces) {
        if (getGatewayNetworkInterfaces() == null) setGatewayNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(gatewayNetworkInterfaces.length));
        for (NetworkInterface value : gatewayNetworkInterfaces) {
            getGatewayNetworkInterfaces().add(value);
        }
        return this;
    }
    
    /**
     * A <a>NetworkInterface</a> array that contains descriptions of the
     * gateway network interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayNetworkInterfaces A <a>NetworkInterface</a> array that contains descriptions of the
     *         gateway network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeGatewayInformationResult withGatewayNetworkInterfaces(java.util.Collection<NetworkInterface> gatewayNetworkInterfaces) {
        if (gatewayNetworkInterfaces == null) {
            this.gatewayNetworkInterfaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NetworkInterface> gatewayNetworkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkInterface>(gatewayNetworkInterfaces.size());
            gatewayNetworkInterfacesCopy.addAll(gatewayNetworkInterfaces);
            this.gatewayNetworkInterfaces = gatewayNetworkInterfacesCopy;
        }

        return this;
    }

    /**
     * TBD
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @return TBD
     */
    public String getGatewayType() {
        return gatewayType;
    }
    
    /**
     * TBD
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType TBD
     */
    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }
    
    /**
     * TBD
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType TBD
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeGatewayInformationResult withGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * The date at which an update to the gateway is available. This date is
     * in the time zone of the gateway. If the gateway is not available for
     * an update this field is not returned in the response. <!-- Q: [eronh]
     * This next sentence doesn't seem to agree with the preceding one, nor
     * does it agree with the response example. -->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return The date at which an update to the gateway is available. This date is
     *         in the time zone of the gateway. If the gateway is not available for
     *         an update this field is not returned in the response. <!-- Q: [eronh]
     *         This next sentence doesn't seem to agree with the preceding one, nor
     *         does it agree with the response example. -->
     */
    public String getNextUpdateAvailabilityDate() {
        return nextUpdateAvailabilityDate;
    }
    
    /**
     * The date at which an update to the gateway is available. This date is
     * in the time zone of the gateway. If the gateway is not available for
     * an update this field is not returned in the response. <!-- Q: [eronh]
     * This next sentence doesn't seem to agree with the preceding one, nor
     * does it agree with the response example. -->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param nextUpdateAvailabilityDate The date at which an update to the gateway is available. This date is
     *         in the time zone of the gateway. If the gateway is not available for
     *         an update this field is not returned in the response. <!-- Q: [eronh]
     *         This next sentence doesn't seem to agree with the preceding one, nor
     *         does it agree with the response example. -->
     */
    public void setNextUpdateAvailabilityDate(String nextUpdateAvailabilityDate) {
        this.nextUpdateAvailabilityDate = nextUpdateAvailabilityDate;
    }
    
    /**
     * The date at which an update to the gateway is available. This date is
     * in the time zone of the gateway. If the gateway is not available for
     * an update this field is not returned in the response. <!-- Q: [eronh]
     * This next sentence doesn't seem to agree with the preceding one, nor
     * does it agree with the response example. -->
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param nextUpdateAvailabilityDate The date at which an update to the gateway is available. This date is
     *         in the time zone of the gateway. If the gateway is not available for
     *         an update this field is not returned in the response. <!-- Q: [eronh]
     *         This next sentence doesn't seem to agree with the preceding one, nor
     *         does it agree with the response example. -->
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeGatewayInformationResult withNextUpdateAvailabilityDate(String nextUpdateAvailabilityDate) {
        this.nextUpdateAvailabilityDate = nextUpdateAvailabilityDate;
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
        if (getGatewayId() != null) sb.append("GatewayId: " + getGatewayId() + ",");
        if (getGatewayTimezone() != null) sb.append("GatewayTimezone: " + getGatewayTimezone() + ",");
        if (getGatewayState() != null) sb.append("GatewayState: " + getGatewayState() + ",");
        if (getGatewayNetworkInterfaces() != null) sb.append("GatewayNetworkInterfaces: " + getGatewayNetworkInterfaces() + ",");
        if (getGatewayType() != null) sb.append("GatewayType: " + getGatewayType() + ",");
        if (getNextUpdateAvailabilityDate() != null) sb.append("NextUpdateAvailabilityDate: " + getNextUpdateAvailabilityDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayState() == null) ? 0 : getGatewayState().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayNetworkInterfaces() == null) ? 0 : getGatewayNetworkInterfaces().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode()); 
        hashCode = prime * hashCode + ((getNextUpdateAvailabilityDate() == null) ? 0 : getNextUpdateAvailabilityDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeGatewayInformationResult == false) return false;
        DescribeGatewayInformationResult other = (DescribeGatewayInformationResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getGatewayId() == null ^ this.getGatewayId() == null) return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false) return false; 
        if (other.getGatewayTimezone() == null ^ this.getGatewayTimezone() == null) return false;
        if (other.getGatewayTimezone() != null && other.getGatewayTimezone().equals(this.getGatewayTimezone()) == false) return false; 
        if (other.getGatewayState() == null ^ this.getGatewayState() == null) return false;
        if (other.getGatewayState() != null && other.getGatewayState().equals(this.getGatewayState()) == false) return false; 
        if (other.getGatewayNetworkInterfaces() == null ^ this.getGatewayNetworkInterfaces() == null) return false;
        if (other.getGatewayNetworkInterfaces() != null && other.getGatewayNetworkInterfaces().equals(this.getGatewayNetworkInterfaces()) == false) return false; 
        if (other.getGatewayType() == null ^ this.getGatewayType() == null) return false;
        if (other.getGatewayType() != null && other.getGatewayType().equals(this.getGatewayType()) == false) return false; 
        if (other.getNextUpdateAvailabilityDate() == null ^ this.getNextUpdateAvailabilityDate() == null) return false;
        if (other.getNextUpdateAvailabilityDate() != null && other.getNextUpdateAvailabilityDate().equals(this.getNextUpdateAvailabilityDate()) == false) return false; 
        return true;
    }
    
}
    