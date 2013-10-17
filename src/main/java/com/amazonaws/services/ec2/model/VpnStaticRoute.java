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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Vpn Static Route
 */
public class VpnStaticRoute implements Serializable {

    private String destinationCidrBlock;

    private String source;

    private String state;

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
    public VpnStaticRoute withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * Returns the value of the Source property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @return The value of the Source property for this object.
     *
     * @see VpnStaticRouteSource
     */
    public String getSource() {
        return source;
    }
    
    /**
     * Sets the value of the Source property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @param source The new value for the Source property for this object.
     *
     * @see VpnStaticRouteSource
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * Sets the value of the Source property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @param source The new value for the Source property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VpnStaticRouteSource
     */
    public VpnStaticRoute withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Sets the value of the Source property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @param source The new value for the Source property for this object.
     *
     * @see VpnStaticRouteSource
     */
    public void setSource(VpnStaticRouteSource source) {
        this.source = source.toString();
    }
    
    /**
     * Sets the value of the Source property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Static
     *
     * @param source The new value for the Source property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VpnStaticRouteSource
     */
    public VpnStaticRoute withSource(VpnStaticRouteSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * Returns the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return The value of the State property for this object.
     *
     * @see VpnState
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The new value for the State property for this object.
     *
     * @see VpnState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VpnState
     */
    public VpnStaticRoute withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The new value for the State property for this object.
     *
     * @see VpnState
     */
    public void setState(VpnState state) {
        this.state = state.toString();
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VpnState
     */
    public VpnStaticRoute withState(VpnState state) {
        this.state = state.toString();
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
        if (getDestinationCidrBlock() != null) sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getSource() != null) sb.append("Source: " + getSource() + ",");
        if (getState() != null) sb.append("State: " + getState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpnStaticRoute == false) return false;
        VpnStaticRoute other = (VpnStaticRoute)obj;
        
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null) return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false) return false; 
        if (other.getSource() == null ^ this.getSource() == null) return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        return true;
    }
    
}
    