/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class ListAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To retrieve
     * all aliases, leave this parameter empty.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     */
    private String routingStrategyType;
    /**
     * <p>
     * Descriptive label associated with an alias. Alias names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To retrieve
     * all aliases, leave this parameter empty.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routingStrategyType
     *        Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To
     *        retrieve all aliases, leave this parameter empty.</p>
     *        <p>
     *        Possible routing types include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @see RoutingStrategyType
     */

    public void setRoutingStrategyType(String routingStrategyType) {
        this.routingStrategyType = routingStrategyType;
    }

    /**
     * <p>
     * Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To retrieve
     * all aliases, leave this parameter empty.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To
     *         retrieve all aliases, leave this parameter empty.</p>
     *         <p>
     *         Possible routing types include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *         the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *         message embedded.
     *         </p>
     *         </li>
     * @see RoutingStrategyType
     */

    public String getRoutingStrategyType() {
        return this.routingStrategyType;
    }

    /**
     * <p>
     * Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To retrieve
     * all aliases, leave this parameter empty.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routingStrategyType
     *        Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To
     *        retrieve all aliases, leave this parameter empty.</p>
     *        <p>
     *        Possible routing types include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingStrategyType
     */

    public ListAliasesRequest withRoutingStrategyType(String routingStrategyType) {
        setRoutingStrategyType(routingStrategyType);
        return this;
    }

    /**
     * <p>
     * Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To retrieve
     * all aliases, leave this parameter empty.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routingStrategyType
     *        Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To
     *        retrieve all aliases, leave this parameter empty.</p>
     *        <p>
     *        Possible routing types include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @see RoutingStrategyType
     */

    public void setRoutingStrategyType(RoutingStrategyType routingStrategyType) {
        this.routingStrategyType = routingStrategyType.toString();
    }

    /**
     * <p>
     * Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To retrieve
     * all aliases, leave this parameter empty.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routingStrategyType
     *        Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To
     *        retrieve all aliases, leave this parameter empty.</p>
     *        <p>
     *        Possible routing types include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingStrategyType
     */

    public ListAliasesRequest withRoutingStrategyType(RoutingStrategyType routingStrategyType) {
        setRoutingStrategyType(routingStrategyType);
        return this;
    }

    /**
     * <p>
     * Descriptive label associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with an alias. Alias names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label associated with an alias. Alias names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with an alias. Alias names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @return Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *         set of sequential pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *        previous call to this action. To specify the start of the result set, do not specify a value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @return Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *         previous call to this action. To specify the start of the result set, do not specify a value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *        previous call to this action. To specify the start of the result set, do not specify a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoutingStrategyType() != null)
            sb.append("RoutingStrategyType: " + getRoutingStrategyType() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAliasesRequest == false)
            return false;
        ListAliasesRequest other = (ListAliasesRequest) obj;
        if (other.getRoutingStrategyType() == null ^ this.getRoutingStrategyType() == null)
            return false;
        if (other.getRoutingStrategyType() != null && other.getRoutingStrategyType().equals(this.getRoutingStrategyType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutingStrategyType() == null) ? 0 : getRoutingStrategyType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAliasesRequest clone() {
        return (ListAliasesRequest) super.clone();
    }
}
