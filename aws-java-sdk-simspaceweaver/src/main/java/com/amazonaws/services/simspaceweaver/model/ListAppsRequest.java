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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListApps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you want to list apps for.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The maximum number of apps to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the simulation that you want to list apps for.
     * </p>
     */
    private String simulation;

    /**
     * <p>
     * The name of the domain that you want to list apps for.
     * </p>
     * 
     * @param domain
     *        The name of the domain that you want to list apps for.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that you want to list apps for.
     * </p>
     * 
     * @return The name of the domain that you want to list apps for.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that you want to list apps for.
     * </p>
     * 
     * @param domain
     *        The name of the domain that you want to list apps for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The maximum number of apps to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of apps to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of apps to list.
     * </p>
     * 
     * @return The maximum number of apps to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of apps to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of apps to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @param nextToken
     *        If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @return If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *         operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *         <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *         provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @param nextToken
     *        If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the simulation that you want to list apps for.
     * </p>
     * 
     * @param simulation
     *        The name of the simulation that you want to list apps for.
     */

    public void setSimulation(String simulation) {
        this.simulation = simulation;
    }

    /**
     * <p>
     * The name of the simulation that you want to list apps for.
     * </p>
     * 
     * @return The name of the simulation that you want to list apps for.
     */

    public String getSimulation() {
        return this.simulation;
    }

    /**
     * <p>
     * The name of the simulation that you want to list apps for.
     * </p>
     * 
     * @param simulation
     *        The name of the simulation that you want to list apps for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withSimulation(String simulation) {
        setSimulation(simulation);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSimulation() != null)
            sb.append("Simulation: ").append(getSimulation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppsRequest == false)
            return false;
        ListAppsRequest other = (ListAppsRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSimulation() == null ^ this.getSimulation() == null)
            return false;
        if (other.getSimulation() != null && other.getSimulation().equals(this.getSimulation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSimulation() == null) ? 0 : getSimulation().hashCode());
        return hashCode;
    }

    @Override
    public ListAppsRequest clone() {
        return (ListAppsRequest) super.clone();
    }

}
