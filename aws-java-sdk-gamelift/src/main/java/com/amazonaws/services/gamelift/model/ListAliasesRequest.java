/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class ListAliasesRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use this
     * type when routing to active fleets.lt/ligtltligtTERMINAL: The alias does
     * not resolve to any fleet but instead displays an message screen to the
     * user. A terminal type alias throws a TerminalRoutingStrategyException
     * with terminal routing strategy message embedded.lt/ligtlt/ulgt
     * </p>
     */
    private String routingStrategyType;
    /**
     * <p>
     * Descriptive label associated with this alias. Alias names do not need to
     * be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token indicating the start of the next sequential page of results. A
     * token is returned any time there may be additional results to be
     * retrieved. To start at the beginning of a result set, do not set this
     * parameter.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use this
     * type when routing to active fleets.lt/ligtltligtTERMINAL: The alias does
     * not resolve to any fleet but instead displays an message screen to the
     * user. A terminal type alias throws a TerminalRoutingStrategyException
     * with terminal routing strategy message embedded.lt/ligtlt/ulgt
     * </p>
     * 
     * @param routingStrategyType
     *        ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use
     *        this type when routing to active fleets.lt/ligtltligtTERMINAL: The
     *        alias does not resolve to any fleet but instead displays an
     *        message screen to the user. A terminal type alias throws a
     *        TerminalRoutingStrategyException with terminal routing strategy
     *        message embedded.lt/ligtlt/ulgt
     * @see RoutingStrategyType
     */

    public void setRoutingStrategyType(String routingStrategyType) {
        this.routingStrategyType = routingStrategyType;
    }

    /**
     * <p>
     * ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use this
     * type when routing to active fleets.lt/ligtltligtTERMINAL: The alias does
     * not resolve to any fleet but instead displays an message screen to the
     * user. A terminal type alias throws a TerminalRoutingStrategyException
     * with terminal routing strategy message embedded.lt/ligtlt/ulgt
     * </p>
     * 
     * @return ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use
     *         this type when routing to active fleets.lt/ligtltligtTERMINAL:
     *         The alias does not resolve to any fleet but instead displays an
     *         message screen to the user. A terminal type alias throws a
     *         TerminalRoutingStrategyException with terminal routing strategy
     *         message embedded.lt/ligtlt/ulgt
     * @see RoutingStrategyType
     */

    public String getRoutingStrategyType() {
        return this.routingStrategyType;
    }

    /**
     * <p>
     * ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use this
     * type when routing to active fleets.lt/ligtltligtTERMINAL: The alias does
     * not resolve to any fleet but instead displays an message screen to the
     * user. A terminal type alias throws a TerminalRoutingStrategyException
     * with terminal routing strategy message embedded.lt/ligtlt/ulgt
     * </p>
     * 
     * @param routingStrategyType
     *        ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use
     *        this type when routing to active fleets.lt/ligtltligtTERMINAL: The
     *        alias does not resolve to any fleet but instead displays an
     *        message screen to the user. A terminal type alias throws a
     *        TerminalRoutingStrategyException with terminal routing strategy
     *        message embedded.lt/ligtlt/ulgt
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RoutingStrategyType
     */

    public ListAliasesRequest withRoutingStrategyType(String routingStrategyType) {
        setRoutingStrategyType(routingStrategyType);
        return this;
    }

    /**
     * <p>
     * ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use this
     * type when routing to active fleets.lt/ligtltligtTERMINAL: The alias does
     * not resolve to any fleet but instead displays an message screen to the
     * user. A terminal type alias throws a TerminalRoutingStrategyException
     * with terminal routing strategy message embedded.lt/ligtlt/ulgt
     * </p>
     * 
     * @param routingStrategyType
     *        ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use
     *        this type when routing to active fleets.lt/ligtltligtTERMINAL: The
     *        alias does not resolve to any fleet but instead displays an
     *        message screen to the user. A terminal type alias throws a
     *        TerminalRoutingStrategyException with terminal routing strategy
     *        message embedded.lt/ligtlt/ulgt
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RoutingStrategyType
     */

    public void setRoutingStrategyType(RoutingStrategyType routingStrategyType) {
        this.routingStrategyType = routingStrategyType.toString();
    }

    /**
     * <p>
     * ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use this
     * type when routing to active fleets.lt/ligtltligtTERMINAL: The alias does
     * not resolve to any fleet but instead displays an message screen to the
     * user. A terminal type alias throws a TerminalRoutingStrategyException
     * with terminal routing strategy message embedded.lt/ligtlt/ulgt
     * </p>
     * 
     * @param routingStrategyType
     *        ltulgtltligtSIMPLE: The alias resolves to one specific fleet. Use
     *        this type when routing to active fleets.lt/ligtltligtTERMINAL: The
     *        alias does not resolve to any fleet but instead displays an
     *        message screen to the user. A terminal type alias throws a
     *        TerminalRoutingStrategyException with terminal routing strategy
     *        message embedded.lt/ligtlt/ulgt
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RoutingStrategyType
     */

    public ListAliasesRequest withRoutingStrategyType(
            RoutingStrategyType routingStrategyType) {
        setRoutingStrategyType(routingStrategyType);
        return this;
    }

    /**
     * <p>
     * Descriptive label associated with this alias. Alias names do not need to
     * be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with this alias. Alias names do not
     *        need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with this alias. Alias names do not need to
     * be unique.
     * </p>
     * 
     * @return Descriptive label associated with this alias. Alias names do not
     *         need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with this alias. Alias names do not need to
     * be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with this alias. Alias names do not
     *        need to be unique.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListAliasesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. You can use this parameter
     *        with <i>NextToken</i> to get results as a set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages.
     * </p>
     * 
     * @return Maximum number of results to return. You can use this parameter
     *         with <i>NextToken</i> to get results as a set of sequential
     *         pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. You can use this parameter
     *        with <i>NextToken</i> to get results as a set of sequential pages.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListAliasesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. A
     * token is returned any time there may be additional results to be
     * retrieved. To start at the beginning of a result set, do not set this
     * parameter.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results.
     *        A token is returned any time there may be additional results to be
     *        retrieved. To start at the beginning of a result set, do not set
     *        this parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. A
     * token is returned any time there may be additional results to be
     * retrieved. To start at the beginning of a result set, do not set this
     * parameter.
     * </p>
     * 
     * @return Token indicating the start of the next sequential page of
     *         results. A token is returned any time there may be additional
     *         results to be retrieved. To start at the beginning of a result
     *         set, do not set this parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. A
     * token is returned any time there may be additional results to be
     * retrieved. To start at the beginning of a result set, do not set this
     * parameter.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results.
     *        A token is returned any time there may be additional results to be
     *        retrieved. To start at the beginning of a result set, do not set
     *        this parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListAliasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (other.getRoutingStrategyType() == null
                ^ this.getRoutingStrategyType() == null)
            return false;
        if (other.getRoutingStrategyType() != null
                && other.getRoutingStrategyType().equals(
                        this.getRoutingStrategyType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRoutingStrategyType() == null) ? 0
                        : getRoutingStrategyType().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAliasesRequest clone() {
        return (ListAliasesRequest) super.clone();
    }
}