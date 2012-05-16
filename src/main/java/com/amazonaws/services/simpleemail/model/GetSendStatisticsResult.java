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
package com.amazonaws.services.simpleemail.model;

/**
 * <p>
 * Represents a list of <code>SendDataPoint</code> items returned from a successful <code>GetSendStatistics</code> request. This list contains aggregated
 * data from the previous two weeks of sending activity.
 * </p>
 */
public class GetSendStatisticsResult {

    private java.util.List<SendDataPoint> sendDataPoints;

    /**
     * Returns the value of the SendDataPoints property for this object.
     *
     * @return The value of the SendDataPoints property for this object.
     */
    public java.util.List<SendDataPoint> getSendDataPoints() {
        
        if (sendDataPoints == null) {
            sendDataPoints = new java.util.ArrayList<SendDataPoint>();
        }
        return sendDataPoints;
    }
    
    /**
     * Sets the value of the SendDataPoints property for this object.
     *
     * @param sendDataPoints The new value for the SendDataPoints property for this object.
     */
    public void setSendDataPoints(java.util.Collection<SendDataPoint> sendDataPoints) {
        if (sendDataPoints == null) {
            this.sendDataPoints = null;
            return;
        }

        java.util.List<SendDataPoint> sendDataPointsCopy = new java.util.ArrayList<SendDataPoint>(sendDataPoints.size());
        sendDataPointsCopy.addAll(sendDataPoints);
        this.sendDataPoints = sendDataPointsCopy;
    }
    
    /**
     * Sets the value of the SendDataPoints property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sendDataPoints The new value for the SendDataPoints property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetSendStatisticsResult withSendDataPoints(SendDataPoint... sendDataPoints) {
        if (getSendDataPoints() == null) setSendDataPoints(new java.util.ArrayList<SendDataPoint>(sendDataPoints.length));
        for (SendDataPoint value : sendDataPoints) {
            getSendDataPoints().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SendDataPoints property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sendDataPoints The new value for the SendDataPoints property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetSendStatisticsResult withSendDataPoints(java.util.Collection<SendDataPoint> sendDataPoints) {
        if (sendDataPoints == null) {
            this.sendDataPoints = null;
        } else {
            java.util.List<SendDataPoint> sendDataPointsCopy = new java.util.ArrayList<SendDataPoint>(sendDataPoints.size());
            sendDataPointsCopy.addAll(sendDataPoints);
            this.sendDataPoints = sendDataPointsCopy;
        }

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
        if (sendDataPoints != null) sb.append("SendDataPoints: " + sendDataPoints + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSendDataPoints() == null) ? 0 : getSendDataPoints().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof GetSendStatisticsResult == false) return false;
        GetSendStatisticsResult other = (GetSendStatisticsResult)obj;
        
        if (other.getSendDataPoints() == null ^ this.getSendDataPoints() == null) return false;
        if (other.getSendDataPoints() != null && other.getSendDataPoints().equals(this.getSendDataPoints()) == false) return false; 
        return true;
    }
    
}
    