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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkRoutes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkRoutesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private RouteTableIdentifier routeTableIdentifier;
    /**
     * <p>
     * An exact CIDR block.
     * </p>
     */
    private java.util.List<String> exactCidrMatches;
    /**
     * <p>
     * The most specific route that matches the traffic (longest prefix match).
     * </p>
     */
    private java.util.List<String> longestPrefixMatches;
    /**
     * <p>
     * The routes with a subnet that match the specified CIDR filter.
     * </p>
     */
    private java.util.List<String> subnetOfMatches;
    /**
     * <p>
     * The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the result
     * returns 10.0.1.0/29.
     * </p>
     */
    private java.util.List<String> supernetOfMatches;
    /**
     * <p>
     * The IDs of the prefix lists.
     * </p>
     */
    private java.util.List<String> prefixListIds;
    /**
     * <p>
     * The route states.
     * </p>
     */
    private java.util.List<String> states;
    /**
     * <p>
     * The route types.
     * </p>
     */
    private java.util.List<String> types;
    /**
     * <p>
     * Filter by route table destination. Possible Values: TRANSIT_GATEWAY_ATTACHMENT_ID, RESOURCE_ID, or RESOURCE_TYPE.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> destinationFilters;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableIdentifier
     *        The ID of the route table.
     */

    public void setRouteTableIdentifier(RouteTableIdentifier routeTableIdentifier) {
        this.routeTableIdentifier = routeTableIdentifier;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @return The ID of the route table.
     */

    public RouteTableIdentifier getRouteTableIdentifier() {
        return this.routeTableIdentifier;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableIdentifier
     *        The ID of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withRouteTableIdentifier(RouteTableIdentifier routeTableIdentifier) {
        setRouteTableIdentifier(routeTableIdentifier);
        return this;
    }

    /**
     * <p>
     * An exact CIDR block.
     * </p>
     * 
     * @return An exact CIDR block.
     */

    public java.util.List<String> getExactCidrMatches() {
        return exactCidrMatches;
    }

    /**
     * <p>
     * An exact CIDR block.
     * </p>
     * 
     * @param exactCidrMatches
     *        An exact CIDR block.
     */

    public void setExactCidrMatches(java.util.Collection<String> exactCidrMatches) {
        if (exactCidrMatches == null) {
            this.exactCidrMatches = null;
            return;
        }

        this.exactCidrMatches = new java.util.ArrayList<String>(exactCidrMatches);
    }

    /**
     * <p>
     * An exact CIDR block.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExactCidrMatches(java.util.Collection)} or {@link #withExactCidrMatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exactCidrMatches
     *        An exact CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withExactCidrMatches(String... exactCidrMatches) {
        if (this.exactCidrMatches == null) {
            setExactCidrMatches(new java.util.ArrayList<String>(exactCidrMatches.length));
        }
        for (String ele : exactCidrMatches) {
            this.exactCidrMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An exact CIDR block.
     * </p>
     * 
     * @param exactCidrMatches
     *        An exact CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withExactCidrMatches(java.util.Collection<String> exactCidrMatches) {
        setExactCidrMatches(exactCidrMatches);
        return this;
    }

    /**
     * <p>
     * The most specific route that matches the traffic (longest prefix match).
     * </p>
     * 
     * @return The most specific route that matches the traffic (longest prefix match).
     */

    public java.util.List<String> getLongestPrefixMatches() {
        return longestPrefixMatches;
    }

    /**
     * <p>
     * The most specific route that matches the traffic (longest prefix match).
     * </p>
     * 
     * @param longestPrefixMatches
     *        The most specific route that matches the traffic (longest prefix match).
     */

    public void setLongestPrefixMatches(java.util.Collection<String> longestPrefixMatches) {
        if (longestPrefixMatches == null) {
            this.longestPrefixMatches = null;
            return;
        }

        this.longestPrefixMatches = new java.util.ArrayList<String>(longestPrefixMatches);
    }

    /**
     * <p>
     * The most specific route that matches the traffic (longest prefix match).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLongestPrefixMatches(java.util.Collection)} or {@link #withLongestPrefixMatches(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param longestPrefixMatches
     *        The most specific route that matches the traffic (longest prefix match).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withLongestPrefixMatches(String... longestPrefixMatches) {
        if (this.longestPrefixMatches == null) {
            setLongestPrefixMatches(new java.util.ArrayList<String>(longestPrefixMatches.length));
        }
        for (String ele : longestPrefixMatches) {
            this.longestPrefixMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The most specific route that matches the traffic (longest prefix match).
     * </p>
     * 
     * @param longestPrefixMatches
     *        The most specific route that matches the traffic (longest prefix match).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withLongestPrefixMatches(java.util.Collection<String> longestPrefixMatches) {
        setLongestPrefixMatches(longestPrefixMatches);
        return this;
    }

    /**
     * <p>
     * The routes with a subnet that match the specified CIDR filter.
     * </p>
     * 
     * @return The routes with a subnet that match the specified CIDR filter.
     */

    public java.util.List<String> getSubnetOfMatches() {
        return subnetOfMatches;
    }

    /**
     * <p>
     * The routes with a subnet that match the specified CIDR filter.
     * </p>
     * 
     * @param subnetOfMatches
     *        The routes with a subnet that match the specified CIDR filter.
     */

    public void setSubnetOfMatches(java.util.Collection<String> subnetOfMatches) {
        if (subnetOfMatches == null) {
            this.subnetOfMatches = null;
            return;
        }

        this.subnetOfMatches = new java.util.ArrayList<String>(subnetOfMatches);
    }

    /**
     * <p>
     * The routes with a subnet that match the specified CIDR filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetOfMatches(java.util.Collection)} or {@link #withSubnetOfMatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param subnetOfMatches
     *        The routes with a subnet that match the specified CIDR filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withSubnetOfMatches(String... subnetOfMatches) {
        if (this.subnetOfMatches == null) {
            setSubnetOfMatches(new java.util.ArrayList<String>(subnetOfMatches.length));
        }
        for (String ele : subnetOfMatches) {
            this.subnetOfMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routes with a subnet that match the specified CIDR filter.
     * </p>
     * 
     * @param subnetOfMatches
     *        The routes with a subnet that match the specified CIDR filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withSubnetOfMatches(java.util.Collection<String> subnetOfMatches) {
        setSubnetOfMatches(subnetOfMatches);
        return this;
    }

    /**
     * <p>
     * The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the result
     * returns 10.0.1.0/29.
     * </p>
     * 
     * @return The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the
     *         result returns 10.0.1.0/29.
     */

    public java.util.List<String> getSupernetOfMatches() {
        return supernetOfMatches;
    }

    /**
     * <p>
     * The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the result
     * returns 10.0.1.0/29.
     * </p>
     * 
     * @param supernetOfMatches
     *        The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the
     *        result returns 10.0.1.0/29.
     */

    public void setSupernetOfMatches(java.util.Collection<String> supernetOfMatches) {
        if (supernetOfMatches == null) {
            this.supernetOfMatches = null;
            return;
        }

        this.supernetOfMatches = new java.util.ArrayList<String>(supernetOfMatches);
    }

    /**
     * <p>
     * The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the result
     * returns 10.0.1.0/29.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupernetOfMatches(java.util.Collection)} or {@link #withSupernetOfMatches(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supernetOfMatches
     *        The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the
     *        result returns 10.0.1.0/29.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withSupernetOfMatches(String... supernetOfMatches) {
        if (this.supernetOfMatches == null) {
            setSupernetOfMatches(new java.util.ArrayList<String>(supernetOfMatches.length));
        }
        for (String ele : supernetOfMatches) {
            this.supernetOfMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the result
     * returns 10.0.1.0/29.
     * </p>
     * 
     * @param supernetOfMatches
     *        The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the
     *        result returns 10.0.1.0/29.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withSupernetOfMatches(java.util.Collection<String> supernetOfMatches) {
        setSupernetOfMatches(supernetOfMatches);
        return this;
    }

    /**
     * <p>
     * The IDs of the prefix lists.
     * </p>
     * 
     * @return The IDs of the prefix lists.
     */

    public java.util.List<String> getPrefixListIds() {
        return prefixListIds;
    }

    /**
     * <p>
     * The IDs of the prefix lists.
     * </p>
     * 
     * @param prefixListIds
     *        The IDs of the prefix lists.
     */

    public void setPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new java.util.ArrayList<String>(prefixListIds);
    }

    /**
     * <p>
     * The IDs of the prefix lists.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrefixListIds(java.util.Collection)} or {@link #withPrefixListIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param prefixListIds
     *        The IDs of the prefix lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withPrefixListIds(String... prefixListIds) {
        if (this.prefixListIds == null) {
            setPrefixListIds(new java.util.ArrayList<String>(prefixListIds.length));
        }
        for (String ele : prefixListIds) {
            this.prefixListIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the prefix lists.
     * </p>
     * 
     * @param prefixListIds
     *        The IDs of the prefix lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withPrefixListIds(java.util.Collection<String> prefixListIds) {
        setPrefixListIds(prefixListIds);
        return this;
    }

    /**
     * <p>
     * The route states.
     * </p>
     * 
     * @return The route states.
     * @see RouteState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * The route states.
     * </p>
     * 
     * @param states
     *        The route states.
     * @see RouteState
     */

    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * The route states.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        The route states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public GetNetworkRoutesRequest withStates(String... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<String>(states.length));
        }
        for (String ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The route states.
     * </p>
     * 
     * @param states
     *        The route states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public GetNetworkRoutesRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * The route states.
     * </p>
     * 
     * @param states
     *        The route states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public GetNetworkRoutesRequest withStates(RouteState... states) {
        java.util.ArrayList<String> statesCopy = new java.util.ArrayList<String>(states.length);
        for (RouteState value : states) {
            statesCopy.add(value.toString());
        }
        if (getStates() == null) {
            setStates(statesCopy);
        } else {
            getStates().addAll(statesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The route types.
     * </p>
     * 
     * @return The route types.
     * @see RouteType
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * The route types.
     * </p>
     * 
     * @param types
     *        The route types.
     * @see RouteType
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * The route types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        The route types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public GetNetworkRoutesRequest withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The route types.
     * </p>
     * 
     * @param types
     *        The route types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public GetNetworkRoutesRequest withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * The route types.
     * </p>
     * 
     * @param types
     *        The route types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public GetNetworkRoutesRequest withTypes(RouteType... types) {
        java.util.ArrayList<String> typesCopy = new java.util.ArrayList<String>(types.length);
        for (RouteType value : types) {
            typesCopy.add(value.toString());
        }
        if (getTypes() == null) {
            setTypes(typesCopy);
        } else {
            getTypes().addAll(typesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filter by route table destination. Possible Values: TRANSIT_GATEWAY_ATTACHMENT_ID, RESOURCE_ID, or RESOURCE_TYPE.
     * </p>
     * 
     * @return Filter by route table destination. Possible Values: TRANSIT_GATEWAY_ATTACHMENT_ID, RESOURCE_ID, or
     *         RESOURCE_TYPE.
     */

    public java.util.Map<String, java.util.List<String>> getDestinationFilters() {
        return destinationFilters;
    }

    /**
     * <p>
     * Filter by route table destination. Possible Values: TRANSIT_GATEWAY_ATTACHMENT_ID, RESOURCE_ID, or RESOURCE_TYPE.
     * </p>
     * 
     * @param destinationFilters
     *        Filter by route table destination. Possible Values: TRANSIT_GATEWAY_ATTACHMENT_ID, RESOURCE_ID, or
     *        RESOURCE_TYPE.
     */

    public void setDestinationFilters(java.util.Map<String, java.util.List<String>> destinationFilters) {
        this.destinationFilters = destinationFilters;
    }

    /**
     * <p>
     * Filter by route table destination. Possible Values: TRANSIT_GATEWAY_ATTACHMENT_ID, RESOURCE_ID, or RESOURCE_TYPE.
     * </p>
     * 
     * @param destinationFilters
     *        Filter by route table destination. Possible Values: TRANSIT_GATEWAY_ATTACHMENT_ID, RESOURCE_ID, or
     *        RESOURCE_TYPE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest withDestinationFilters(java.util.Map<String, java.util.List<String>> destinationFilters) {
        setDestinationFilters(destinationFilters);
        return this;
    }

    /**
     * Add a single DestinationFilters entry
     *
     * @see GetNetworkRoutesRequest#withDestinationFilters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest addDestinationFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.destinationFilters) {
            this.destinationFilters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.destinationFilters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.destinationFilters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DestinationFilters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesRequest clearDestinationFiltersEntries() {
        this.destinationFilters = null;
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getRouteTableIdentifier() != null)
            sb.append("RouteTableIdentifier: ").append(getRouteTableIdentifier()).append(",");
        if (getExactCidrMatches() != null)
            sb.append("ExactCidrMatches: ").append(getExactCidrMatches()).append(",");
        if (getLongestPrefixMatches() != null)
            sb.append("LongestPrefixMatches: ").append(getLongestPrefixMatches()).append(",");
        if (getSubnetOfMatches() != null)
            sb.append("SubnetOfMatches: ").append(getSubnetOfMatches()).append(",");
        if (getSupernetOfMatches() != null)
            sb.append("SupernetOfMatches: ").append(getSupernetOfMatches()).append(",");
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: ").append(getPrefixListIds()).append(",");
        if (getStates() != null)
            sb.append("States: ").append(getStates()).append(",");
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes()).append(",");
        if (getDestinationFilters() != null)
            sb.append("DestinationFilters: ").append(getDestinationFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNetworkRoutesRequest == false)
            return false;
        GetNetworkRoutesRequest other = (GetNetworkRoutesRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getRouteTableIdentifier() == null ^ this.getRouteTableIdentifier() == null)
            return false;
        if (other.getRouteTableIdentifier() != null && other.getRouteTableIdentifier().equals(this.getRouteTableIdentifier()) == false)
            return false;
        if (other.getExactCidrMatches() == null ^ this.getExactCidrMatches() == null)
            return false;
        if (other.getExactCidrMatches() != null && other.getExactCidrMatches().equals(this.getExactCidrMatches()) == false)
            return false;
        if (other.getLongestPrefixMatches() == null ^ this.getLongestPrefixMatches() == null)
            return false;
        if (other.getLongestPrefixMatches() != null && other.getLongestPrefixMatches().equals(this.getLongestPrefixMatches()) == false)
            return false;
        if (other.getSubnetOfMatches() == null ^ this.getSubnetOfMatches() == null)
            return false;
        if (other.getSubnetOfMatches() != null && other.getSubnetOfMatches().equals(this.getSubnetOfMatches()) == false)
            return false;
        if (other.getSupernetOfMatches() == null ^ this.getSupernetOfMatches() == null)
            return false;
        if (other.getSupernetOfMatches() != null && other.getSupernetOfMatches().equals(this.getSupernetOfMatches()) == false)
            return false;
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        if (other.getDestinationFilters() == null ^ this.getDestinationFilters() == null)
            return false;
        if (other.getDestinationFilters() != null && other.getDestinationFilters().equals(this.getDestinationFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableIdentifier() == null) ? 0 : getRouteTableIdentifier().hashCode());
        hashCode = prime * hashCode + ((getExactCidrMatches() == null) ? 0 : getExactCidrMatches().hashCode());
        hashCode = prime * hashCode + ((getLongestPrefixMatches() == null) ? 0 : getLongestPrefixMatches().hashCode());
        hashCode = prime * hashCode + ((getSubnetOfMatches() == null) ? 0 : getSubnetOfMatches().hashCode());
        hashCode = prime * hashCode + ((getSupernetOfMatches() == null) ? 0 : getSupernetOfMatches().hashCode());
        hashCode = prime * hashCode + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode + ((getDestinationFilters() == null) ? 0 : getDestinationFilters().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkRoutesRequest clone() {
        return (GetNetworkRoutesRequest) super.clone();
    }

}
