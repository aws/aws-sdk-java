/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * Vgw Telemetry
 */
public class VgwTelemetry {

    private String outsideIpAddress;

    private String status;

    private java.util.Date lastStatusChange;

    private String statusMessage;

    private Integer acceptedRouteCount;

    /**
     * Returns the value of the OutsideIpAddress property for this object.
     *
     * @return The value of the OutsideIpAddress property for this object.
     */
    public String getOutsideIpAddress() {
        return outsideIpAddress;
    }
    
    /**
     * Sets the value of the OutsideIpAddress property for this object.
     *
     * @param outsideIpAddress The new value for the OutsideIpAddress property for this object.
     */
    public void setOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
    }
    
    /**
     * Sets the value of the OutsideIpAddress property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param outsideIpAddress The new value for the OutsideIpAddress property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VgwTelemetry withOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
        return this;
    }
    
    
    /**
     * Returns the value of the Status property for this object.
     *
     * @return The value of the Status property for this object.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     *
     * @param status The new value for the Status property for this object.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The new value for the Status property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VgwTelemetry withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * Returns the value of the LastStatusChange property for this object.
     *
     * @return The value of the LastStatusChange property for this object.
     */
    public java.util.Date getLastStatusChange() {
        return lastStatusChange;
    }
    
    /**
     * Sets the value of the LastStatusChange property for this object.
     *
     * @param lastStatusChange The new value for the LastStatusChange property for this object.
     */
    public void setLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }
    
    /**
     * Sets the value of the LastStatusChange property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStatusChange The new value for the LastStatusChange property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VgwTelemetry withLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
        return this;
    }
    
    
    /**
     * Returns the value of the StatusMessage property for this object.
     *
     * @return The value of the StatusMessage property for this object.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * Sets the value of the StatusMessage property for this object.
     *
     * @param statusMessage The new value for the StatusMessage property for this object.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * Sets the value of the StatusMessage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage The new value for the StatusMessage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VgwTelemetry withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }
    
    
    /**
     * Returns the value of the AcceptedRouteCount property for this object.
     *
     * @return The value of the AcceptedRouteCount property for this object.
     */
    public Integer getAcceptedRouteCount() {
        return acceptedRouteCount;
    }
    
    /**
     * Sets the value of the AcceptedRouteCount property for this object.
     *
     * @param acceptedRouteCount The new value for the AcceptedRouteCount property for this object.
     */
    public void setAcceptedRouteCount(Integer acceptedRouteCount) {
        this.acceptedRouteCount = acceptedRouteCount;
    }
    
    /**
     * Sets the value of the AcceptedRouteCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param acceptedRouteCount The new value for the AcceptedRouteCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VgwTelemetry withAcceptedRouteCount(Integer acceptedRouteCount) {
        this.acceptedRouteCount = acceptedRouteCount;
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
        sb.append("OutsideIpAddress: " + outsideIpAddress + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("LastStatusChange: " + lastStatusChange + ", ");
        sb.append("StatusMessage: " + statusMessage + ", ");
        sb.append("AcceptedRouteCount: " + acceptedRouteCount + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    