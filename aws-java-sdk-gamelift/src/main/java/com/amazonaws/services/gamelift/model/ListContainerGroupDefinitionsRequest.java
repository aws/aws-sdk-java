/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListContainerGroupDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContainerGroupDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of container group definitions to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICA</code> -- Replica container groups run your game server application and supporting software.
     * Replica groups might be deployed multiple times per fleet instance.
     * </p>
     * </li>
     * </ul>
     */
    private String schedulingStrategy;
    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of container group definitions to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICA</code> -- Replica container groups run your game server application and supporting software.
     * Replica groups might be deployed multiple times per fleet instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schedulingStrategy
     *        The type of container group definitions to retrieve.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLICA</code> -- Replica container groups run your game server application and supporting software.
     *        Replica groups might be deployed multiple times per fleet instance.
     *        </p>
     *        </li>
     * @see ContainerSchedulingStrategy
     */

    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * <p>
     * The type of container group definitions to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICA</code> -- Replica container groups run your game server application and supporting software.
     * Replica groups might be deployed multiple times per fleet instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of container group definitions to retrieve.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REPLICA</code> -- Replica container groups run your game server application and supporting
     *         software. Replica groups might be deployed multiple times per fleet instance.
     *         </p>
     *         </li>
     * @see ContainerSchedulingStrategy
     */

    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * <p>
     * The type of container group definitions to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICA</code> -- Replica container groups run your game server application and supporting software.
     * Replica groups might be deployed multiple times per fleet instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schedulingStrategy
     *        The type of container group definitions to retrieve.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLICA</code> -- Replica container groups run your game server application and supporting software.
     *        Replica groups might be deployed multiple times per fleet instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerSchedulingStrategy
     */

    public ListContainerGroupDefinitionsRequest withSchedulingStrategy(String schedulingStrategy) {
        setSchedulingStrategy(schedulingStrategy);
        return this;
    }

    /**
     * <p>
     * The type of container group definitions to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICA</code> -- Replica container groups run your game server application and supporting software.
     * Replica groups might be deployed multiple times per fleet instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schedulingStrategy
     *        The type of container group definitions to retrieve.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DAEMON</code> -- Daemon container groups run background processes and are deployed once per fleet
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLICA</code> -- Replica container groups run your game server application and supporting software.
     *        Replica groups might be deployed multiple times per fleet instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerSchedulingStrategy
     */

    public ListContainerGroupDefinitionsRequest withSchedulingStrategy(ContainerSchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param limit
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @return The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *         a set of sequential pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param limit
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerGroupDefinitionsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the start of the next sequential page of results. Use the token that is returned
     *        with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *        value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @return A token that indicates the start of the next sequential page of results. Use the token that is returned
     *         with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *         value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the start of the next sequential page of results. Use the token that is returned
     *        with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerGroupDefinitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getSchedulingStrategy() != null)
            sb.append("SchedulingStrategy: ").append(getSchedulingStrategy()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContainerGroupDefinitionsRequest == false)
            return false;
        ListContainerGroupDefinitionsRequest other = (ListContainerGroupDefinitionsRequest) obj;
        if (other.getSchedulingStrategy() == null ^ this.getSchedulingStrategy() == null)
            return false;
        if (other.getSchedulingStrategy() != null && other.getSchedulingStrategy().equals(this.getSchedulingStrategy()) == false)
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

        hashCode = prime * hashCode + ((getSchedulingStrategy() == null) ? 0 : getSchedulingStrategy().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContainerGroupDefinitionsRequest clone() {
        return (ListContainerGroupDefinitionsRequest) super.clone();
    }

}
