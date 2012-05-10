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
 * <li> ListLocalDisksOutput$Disks </li>
 * <li> GatewayARN </li>
 * 
 * </ul>
 */
public class ListLocalDisksResult {

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
     * An array of <a>Disk</a> objects.
     */
    private java.util.List<Disk> disks;

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
    public ListLocalDisksResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }
    
    
    /**
     * An array of <a>Disk</a> objects.
     *
     * @return An array of <a>Disk</a> objects.
     */
    public java.util.List<Disk> getDisks() {
        
        if (disks == null) {
            disks = new java.util.ArrayList<Disk>();
        }
        return disks;
    }
    
    /**
     * An array of <a>Disk</a> objects.
     *
     * @param disks An array of <a>Disk</a> objects.
     */
    public void setDisks(java.util.Collection<Disk> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        java.util.List<Disk> disksCopy = new java.util.ArrayList<Disk>(disks.size());
        disksCopy.addAll(disks);
        this.disks = disksCopy;
    }
    
    /**
     * An array of <a>Disk</a> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disks An array of <a>Disk</a> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListLocalDisksResult withDisks(Disk... disks) {
        if (getDisks() == null) setDisks(new java.util.ArrayList<Disk>(disks.length));
        for (Disk value : disks) {
            getDisks().add(value);
        }
        return this;
    }
    
    /**
     * An array of <a>Disk</a> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disks An array of <a>Disk</a> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListLocalDisksResult withDisks(java.util.Collection<Disk> disks) {
        if (disks == null) {
            this.disks = null;
        } else {
            java.util.List<Disk> disksCopy = new java.util.ArrayList<Disk>(disks.size());
            disksCopy.addAll(disks);
            this.disks = disksCopy;
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
        if (gatewayARN != null) sb.append("GatewayARN: " + gatewayARN + ", ");
        if (disks != null) sb.append("Disks: " + disks + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getDisks() == null) ? 0 : getDisks().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListLocalDisksResult == false) return false;
        ListLocalDisksResult other = (ListLocalDisksResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getDisks() == null ^ this.getDisks() == null) return false;
        if (other.getDisks() != null && other.getDisks().equals(this.getDisks()) == false) return false; 
        return true;
    }
    
}
    