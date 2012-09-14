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
package com.amazonaws.services.ec2.model;

/**
 * Propagated Route
 */
public class PropagatedRoute {

    private String destinationCidrBlock;

    private String gatewayId;

    private String status;

    private String sourceId;

    /**
     * Returns the value of the DestinationCidrBlock property for this
     * object.
     *
     * @return The value of the DestinationCidrBlock property for this object.
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }
    
    /**
     * Sets the value of the DestinationCidrBlock property for this object.
     *
     * @param destinationCidrBlock The new value for the DestinationCidrBlock property for this object.
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }
    
    /**
     * Sets the value of the DestinationCidrBlock property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationCidrBlock The new value for the DestinationCidrBlock property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PropagatedRoute withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    
    
    /**
     * Returns the value of the GatewayId property for this object.
     *
     * @return The value of the GatewayId property for this object.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * Sets the value of the GatewayId property for this object.
     *
     * @param gatewayId The new value for the GatewayId property for this object.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * Sets the value of the GatewayId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayId The new value for the GatewayId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PropagatedRoute withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
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
    public PropagatedRoute withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * Returns the value of the SourceId property for this object.
     *
     * @return The value of the SourceId property for this object.
     */
    public String getSourceId() {
        return sourceId;
    }
    
    /**
     * Sets the value of the SourceId property for this object.
     *
     * @param sourceId The new value for the SourceId property for this object.
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
    
    /**
     * Sets the value of the SourceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceId The new value for the SourceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PropagatedRoute withSourceId(String sourceId) {
        this.sourceId = sourceId;
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
        if (destinationCidrBlock != null) sb.append("DestinationCidrBlock: " + destinationCidrBlock + ", ");
        if (gatewayId != null) sb.append("GatewayId: " + gatewayId + ", ");
        if (status != null) sb.append("Status: " + status + ", ");
        if (sourceId != null) sb.append("SourceId: " + sourceId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof PropagatedRoute == false) return false;
        PropagatedRoute other = (PropagatedRoute)obj;
        
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null) return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false) return false; 
        if (other.getGatewayId() == null ^ this.getGatewayId() == null) return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getSourceId() == null ^ this.getSourceId() == null) return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false) return false; 
        return true;
    }
    
}
    