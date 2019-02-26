/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a static route for a VPN connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpnStaticRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnStaticRoute implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer data center.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The current state of the static route.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer data center.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block associated with the local subnet of the customer data center.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer data center.
     * </p>
     * 
     * @return The CIDR block associated with the local subnet of the customer data center.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block associated with the local subnet of the customer data center.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR block associated with the local subnet of the customer data center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnStaticRoute withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * 
     * @param source
     *        Indicates how the routes were provided.
     * @see VpnStaticRouteSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * 
     * @return Indicates how the routes were provided.
     * @see VpnStaticRouteSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * 
     * @param source
     *        Indicates how the routes were provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnStaticRouteSource
     */

    public VpnStaticRoute withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * 
     * @param source
     *        Indicates how the routes were provided.
     * @see VpnStaticRouteSource
     */

    public void setSource(VpnStaticRouteSource source) {
        withSource(source);
    }

    /**
     * <p>
     * Indicates how the routes were provided.
     * </p>
     * 
     * @param source
     *        Indicates how the routes were provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnStaticRouteSource
     */

    public VpnStaticRoute withSource(VpnStaticRouteSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * 
     * @param state
     *        The current state of the static route.
     * @see VpnState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * 
     * @return The current state of the static route.
     * @see VpnState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * 
     * @param state
     *        The current state of the static route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnState
     */

    public VpnStaticRoute withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * 
     * @param state
     *        The current state of the static route.
     * @see VpnState
     */

    public void setState(VpnState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the static route.
     * </p>
     * 
     * @param state
     *        The current state of the static route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnState
     */

    public VpnStaticRoute withState(VpnState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnStaticRoute == false)
            return false;
        VpnStaticRoute other = (VpnStaticRoute) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
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
    public VpnStaticRoute clone() {
        try {
            return (VpnStaticRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
