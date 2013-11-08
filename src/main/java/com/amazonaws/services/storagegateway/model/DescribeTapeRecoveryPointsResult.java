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
 * DescribeTapeRecoveryPointsOutput
 * </p>
 */
public class DescribeTapeRecoveryPointsResult implements Serializable {

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
     * An array of TapeRecoveryPointInfos that are available for the
     * specified gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TapeRecoveryPointInfo> tapeRecoveryPointInfos;

    /**
     * An opaque string that indicates the position at which the virtual tape
     * recovery points that were listed for description ended. <p>Use this
     * marker in your next request to list the next set of virtual tape
     * recovery points in the list. If there are no more recovery points to
     * describe, this field does not appear in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

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
    public DescribeTapeRecoveryPointsResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * An array of TapeRecoveryPointInfos that are available for the
     * specified gateway.
     *
     * @return An array of TapeRecoveryPointInfos that are available for the
     *         specified gateway.
     */
    public java.util.List<TapeRecoveryPointInfo> getTapeRecoveryPointInfos() {
        if (tapeRecoveryPointInfos == null) {
              tapeRecoveryPointInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<TapeRecoveryPointInfo>();
              tapeRecoveryPointInfos.setAutoConstruct(true);
        }
        return tapeRecoveryPointInfos;
    }
    
    /**
     * An array of TapeRecoveryPointInfos that are available for the
     * specified gateway.
     *
     * @param tapeRecoveryPointInfos An array of TapeRecoveryPointInfos that are available for the
     *         specified gateway.
     */
    public void setTapeRecoveryPointInfos(java.util.Collection<TapeRecoveryPointInfo> tapeRecoveryPointInfos) {
        if (tapeRecoveryPointInfos == null) {
            this.tapeRecoveryPointInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TapeRecoveryPointInfo> tapeRecoveryPointInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TapeRecoveryPointInfo>(tapeRecoveryPointInfos.size());
        tapeRecoveryPointInfosCopy.addAll(tapeRecoveryPointInfos);
        this.tapeRecoveryPointInfos = tapeRecoveryPointInfosCopy;
    }
    
    /**
     * An array of TapeRecoveryPointInfos that are available for the
     * specified gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tapeRecoveryPointInfos An array of TapeRecoveryPointInfos that are available for the
     *         specified gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTapeRecoveryPointsResult withTapeRecoveryPointInfos(TapeRecoveryPointInfo... tapeRecoveryPointInfos) {
        if (getTapeRecoveryPointInfos() == null) setTapeRecoveryPointInfos(new java.util.ArrayList<TapeRecoveryPointInfo>(tapeRecoveryPointInfos.length));
        for (TapeRecoveryPointInfo value : tapeRecoveryPointInfos) {
            getTapeRecoveryPointInfos().add(value);
        }
        return this;
    }
    
    /**
     * An array of TapeRecoveryPointInfos that are available for the
     * specified gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tapeRecoveryPointInfos An array of TapeRecoveryPointInfos that are available for the
     *         specified gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTapeRecoveryPointsResult withTapeRecoveryPointInfos(java.util.Collection<TapeRecoveryPointInfo> tapeRecoveryPointInfos) {
        if (tapeRecoveryPointInfos == null) {
            this.tapeRecoveryPointInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TapeRecoveryPointInfo> tapeRecoveryPointInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TapeRecoveryPointInfo>(tapeRecoveryPointInfos.size());
            tapeRecoveryPointInfosCopy.addAll(tapeRecoveryPointInfos);
            this.tapeRecoveryPointInfos = tapeRecoveryPointInfosCopy;
        }

        return this;
    }

    /**
     * An opaque string that indicates the position at which the virtual tape
     * recovery points that were listed for description ended. <p>Use this
     * marker in your next request to list the next set of virtual tape
     * recovery points in the list. If there are no more recovery points to
     * describe, this field does not appear in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return An opaque string that indicates the position at which the virtual tape
     *         recovery points that were listed for description ended. <p>Use this
     *         marker in your next request to list the next set of virtual tape
     *         recovery points in the list. If there are no more recovery points to
     *         describe, this field does not appear in the response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string that indicates the position at which the virtual tape
     * recovery points that were listed for description ended. <p>Use this
     * marker in your next request to list the next set of virtual tape
     * recovery points in the list. If there are no more recovery points to
     * describe, this field does not appear in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker An opaque string that indicates the position at which the virtual tape
     *         recovery points that were listed for description ended. <p>Use this
     *         marker in your next request to list the next set of virtual tape
     *         recovery points in the list. If there are no more recovery points to
     *         describe, this field does not appear in the response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string that indicates the position at which the virtual tape
     * recovery points that were listed for description ended. <p>Use this
     * marker in your next request to list the next set of virtual tape
     * recovery points in the list. If there are no more recovery points to
     * describe, this field does not appear in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker An opaque string that indicates the position at which the virtual tape
     *         recovery points that were listed for description ended. <p>Use this
     *         marker in your next request to list the next set of virtual tape
     *         recovery points in the list. If there are no more recovery points to
     *         describe, this field does not appear in the response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTapeRecoveryPointsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getTapeRecoveryPointInfos() != null) sb.append("TapeRecoveryPointInfos: " + getTapeRecoveryPointInfos() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getTapeRecoveryPointInfos() == null) ? 0 : getTapeRecoveryPointInfos().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTapeRecoveryPointsResult == false) return false;
        DescribeTapeRecoveryPointsResult other = (DescribeTapeRecoveryPointsResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getTapeRecoveryPointInfos() == null ^ this.getTapeRecoveryPointInfos() == null) return false;
        if (other.getTapeRecoveryPointInfos() != null && other.getTapeRecoveryPointInfos().equals(this.getTapeRecoveryPointInfos()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    