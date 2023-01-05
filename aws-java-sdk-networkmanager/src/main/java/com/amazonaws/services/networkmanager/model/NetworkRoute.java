/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a network route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/NetworkRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkRoute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the route, such as a CIDR block.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The destinations.
     * </p>
     */
    private java.util.List<NetworkRouteDestination> destinations;
    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique identifier for the route, such as a CIDR block.
     * </p>
     * 
     * @param destinationCidrBlock
     *        A unique identifier for the route, such as a CIDR block.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * A unique identifier for the route, such as a CIDR block.
     * </p>
     * 
     * @return A unique identifier for the route, such as a CIDR block.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * A unique identifier for the route, such as a CIDR block.
     * </p>
     * 
     * @param destinationCidrBlock
     *        A unique identifier for the route, such as a CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRoute withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @return The destinations.
     */

    public java.util.List<NetworkRouteDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     */

    public void setDestinations(java.util.Collection<NetworkRouteDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<NetworkRouteDestination>(destinations);
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRoute withDestinations(NetworkRouteDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<NetworkRouteDestination>(destinations.length));
        }
        for (NetworkRouteDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRoute withDestinations(java.util.Collection<NetworkRouteDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @return The ID of the prefix list.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkRoute withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * </p>
     * 
     * @param state
     *        The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * @see RouteState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * </p>
     * 
     * @return The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * @see RouteState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * </p>
     * 
     * @param state
     *        The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public NetworkRoute withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * </p>
     * 
     * @param state
     *        The route state. The possible values are <code>active</code> and <code>blackhole</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public NetworkRoute withState(RouteState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * </p>
     * 
     * @param type
     *        The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * @see RouteType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * </p>
     * 
     * @return The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * @see RouteType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * </p>
     * 
     * @param type
     *        The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public NetworkRoute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * </p>
     * 
     * @param type
     *        The route type. The possible values are <code>propagated</code> and <code>static</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public NetworkRoute withType(RouteType type) {
        this.type = type.toString();
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkRoute == false)
            return false;
        NetworkRoute other = (NetworkRoute) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public NetworkRoute clone() {
        try {
            return (NetworkRoute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.NetworkRouteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
