/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNetworks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNetworksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the network.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional framework specifier. If provided, only networks of this framework type are listed.
     * </p>
     */
    private String framework;
    /**
     * <p>
     * An optional status specifier. If provided, only networks currently in this status are listed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The maximum number of networks to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @param name
     *        The name of the network.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @return The name of the network.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @param name
     *        The name of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworksRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional framework specifier. If provided, only networks of this framework type are listed.
     * </p>
     * 
     * @param framework
     *        An optional framework specifier. If provided, only networks of this framework type are listed.
     * @see Framework
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * An optional framework specifier. If provided, only networks of this framework type are listed.
     * </p>
     * 
     * @return An optional framework specifier. If provided, only networks of this framework type are listed.
     * @see Framework
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * An optional framework specifier. If provided, only networks of this framework type are listed.
     * </p>
     * 
     * @param framework
     *        An optional framework specifier. If provided, only networks of this framework type are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Framework
     */

    public ListNetworksRequest withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * An optional framework specifier. If provided, only networks of this framework type are listed.
     * </p>
     * 
     * @param framework
     *        An optional framework specifier. If provided, only networks of this framework type are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Framework
     */

    public ListNetworksRequest withFramework(Framework framework) {
        this.framework = framework.toString();
        return this;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only networks currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only networks currently in this status are listed.
     * @see NetworkStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only networks currently in this status are listed.
     * </p>
     * 
     * @return An optional status specifier. If provided, only networks currently in this status are listed.
     * @see NetworkStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only networks currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only networks currently in this status are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkStatus
     */

    public ListNetworksRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An optional status specifier. If provided, only networks currently in this status are listed.
     * </p>
     * 
     * @param status
     *        An optional status specifier. If provided, only networks currently in this status are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkStatus
     */

    public ListNetworksRequest withStatus(NetworkStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of networks to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of networks to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of networks to list.
     * </p>
     * 
     * @return The maximum number of networks to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of networks to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of networks to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworksRequest withNextToken(String nextToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListNetworksRequest == false)
            return false;
        ListNetworksRequest other = (ListNetworksRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNetworksRequest clone() {
        return (ListNetworksRequest) super.clone();
    }

}
