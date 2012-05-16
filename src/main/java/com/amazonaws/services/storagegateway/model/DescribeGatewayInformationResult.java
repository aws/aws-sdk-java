/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> GatewayARN </li>
 * <li> DescribeGatewayInformationOutput$GatewayId </li>
 * <li> DescribeGatewayInformationOutput$GatewayNetworkInterfaces </li>
 * <li> DescribeGatewayInformationOutput$GatewayState </li>
 * <li> DescribeGatewayInformationOutput$GatewayTimezone </li>
 * <li> DescribeGatewayInformationOutput$NextUpdateAvailabilityDate </li>
 * 
 * </ul>
 */
public class DescribeGatewayInformationResult {

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
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * configured for the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     */
    private String gatewayTimezone;

    /**
     * One of the <a>GatewayState</a> values that indicates the operating
     * state of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SHUTDOWN
     */
    private String gatewayState;

    /**
     * A <a>NetworkInterface</a> array that contains descriptions of the
     * gateway network interfaces.
     */
    private java.util.List<NetworkInterface> gatewayNetworkInterfaces;

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
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * configured for the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @return One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         configured for the gateway.
     *
     * @see GatewayTimezone
     */
    public String getGatewayTimezone() {
        return gatewayTimezone;
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * configured for the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param gatewayTimezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         configured for the gateway.
     *
     * @see GatewayTimezone
     */
    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * configured for the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param gatewayTimezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         configured for the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayTimezone
     */
    public DescribeGatewayInformationResult withGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
        return this;
    }
    
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * configured for the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param gatewayTimezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         configured for the gateway.
     *
     * @see GatewayTimezone
     */
    public void setGatewayTimezone(GatewayTimezone gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone.toString();
    }
    
    /**
     * One of the <a>GatewayTimezone</a> values that indicates the time zone
     * configured for the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GMT-12:00, GMT-11:00, GMT-10:00, GMT-9:00, GMT-8:00, GMT-7:00, GMT-6:00, GMT-5:00, GMT-4:00, GMT-3:30, GMT-3:00, GMT-2:00, GMT-1:00, GMT, GMT+1:00, GMT+2:00, GMT+3:00, GMT+3:30, GMT+4:00, GMT+4:30, GMT+5:00, GMT+5:30, GMT+5:45, GMT+6:00, GMT+7:00, GMT+8:00, GMT+9:00, GMT+9:30, GMT+10:00, GMT+11:00, GMT+12:00
     *
     * @param gatewayTimezone One of the <a>GatewayTimezone</a> values that indicates the time zone
     *         configured for the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayTimezone
     */
    public DescribeGatewayInformationResult withGatewayTimezone(GatewayTimezone gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone.toString();
        return this;
    }
    
    /**
     * One of the <a>GatewayState</a> values that indicates the operating
     * state of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SHUTDOWN
     *
     * @return One of the <a>GatewayState</a> values that indicates the operating
     *         state of the gateway.
     *
     * @see GatewayState
     */
    public String getGatewayState() {
        return gatewayState;
    }
    
    /**
     * One of the <a>GatewayState</a> values that indicates the operating
     * state of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SHUTDOWN
     *
     * @param gatewayState One of the <a>GatewayState</a> values that indicates the operating
     *         state of the gateway.
     *
     * @see GatewayState
     */
    public void setGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
    }
    
    /**
     * One of the <a>GatewayState</a> values that indicates the operating
     * state of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SHUTDOWN
     *
     * @param gatewayState One of the <a>GatewayState</a> values that indicates the operating
     *         state of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayState
     */
    public DescribeGatewayInformationResult withGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
        return this;
    }
    
    
    /**
     * One of the <a>GatewayState</a> values that indicates the operating
     * state of the gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SHUTDOWN
     *
     * @param gatewayState One of the <a>GatewayState</a> values that indicates the operating
     *         state of the gateway.
     *
     * @see GatewayState
     */
    public void setGatewayState(GatewayState gatewayState) {
        this.gatewayState = gatewayState.toString();
    }
    
    /**
     * One of the <a>GatewayState</a> values that indicates the operating
     * state of the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SHUTDOWN
     *
     * @param gatewayState One of the <a>GatewayState</a> values that indicates the operating
     *         state of the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see GatewayState
     */
    public DescribeGatewayInformationResult withGatewayState(GatewayState gatewayState) {
        this.gatewayState = gatewayState.toString();
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
            gatewayNetworkInterfaces = new java.util.ArrayList<NetworkInterface>();
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

        java.util.List<NetworkInterface> gatewayNetworkInterfacesCopy = new java.util.ArrayList<NetworkInterface>(gatewayNetworkInterfaces.size());
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
            java.util.List<NetworkInterface> gatewayNetworkInterfacesCopy = new java.util.ArrayList<NetworkInterface>(gatewayNetworkInterfaces.size());
            gatewayNetworkInterfacesCopy.addAll(gatewayNetworkInterfaces);
            this.gatewayNetworkInterfaces = gatewayNetworkInterfacesCopy;
        }

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
        if (gatewayARN != null) sb.append("GatewayARN: " + gatewayARN + ", ");
        if (gatewayId != null) sb.append("GatewayId: " + gatewayId + ", ");
        if (gatewayTimezone != null) sb.append("GatewayTimezone: " + gatewayTimezone + ", ");
        if (gatewayState != null) sb.append("GatewayState: " + gatewayState + ", ");
        if (gatewayNetworkInterfaces != null) sb.append("GatewayNetworkInterfaces: " + gatewayNetworkInterfaces + ", ");
        if (nextUpdateAvailabilityDate != null) sb.append("NextUpdateAvailabilityDate: " + nextUpdateAvailabilityDate + ", ");
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
        if (other.getNextUpdateAvailabilityDate() == null ^ this.getNextUpdateAvailabilityDate() == null) return false;
        if (other.getNextUpdateAvailabilityDate() != null && other.getNextUpdateAvailabilityDate().equals(this.getNextUpdateAvailabilityDate()) == false) return false; 
        return true;
    }
    
}
    