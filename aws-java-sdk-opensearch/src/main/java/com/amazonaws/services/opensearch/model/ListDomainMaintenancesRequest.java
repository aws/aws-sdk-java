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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>ListDomainMaintenances</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainMaintenancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The name of the action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>ListDomainMaintenances</code> operation returns a <code>nextToken</code>, include the
     * returned <code>nextToken</code> in subsequent <code>ListDomainMaintenances</code> operations, which returns
     * results in the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainMaintenancesRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @see MaintenanceType
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @return The name of the action.
     * @see MaintenanceType
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceType
     */

    public ListDomainMaintenancesRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceType
     */

    public ListDomainMaintenancesRequest withAction(MaintenanceType action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see MaintenanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see MaintenanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceStatus
     */

    public ListDomainMaintenancesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceStatus
     */

    public ListDomainMaintenancesRequest withStatus(MaintenanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to get the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainMaintenancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>ListDomainMaintenances</code> operation returns a <code>nextToken</code>, include the
     * returned <code>nextToken</code> in subsequent <code>ListDomainMaintenances</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListDomainMaintenances</code> operation returns a <code>nextToken</code>, include
     *        the returned <code>nextToken</code> in subsequent <code>ListDomainMaintenances</code> operations, which
     *        returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListDomainMaintenances</code> operation returns a <code>nextToken</code>, include the
     * returned <code>nextToken</code> in subsequent <code>ListDomainMaintenances</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @return If your initial <code>ListDomainMaintenances</code> operation returns a <code>nextToken</code>, include
     *         the returned <code>nextToken</code> in subsequent <code>ListDomainMaintenances</code> operations, which
     *         returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListDomainMaintenances</code> operation returns a <code>nextToken</code>, include the
     * returned <code>nextToken</code> in subsequent <code>ListDomainMaintenances</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListDomainMaintenances</code> operation returns a <code>nextToken</code>, include
     *        the returned <code>nextToken</code> in subsequent <code>ListDomainMaintenances</code> operations, which
     *        returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainMaintenancesRequest withNextToken(String nextToken) {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
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

        if (obj instanceof ListDomainMaintenancesRequest == false)
            return false;
        ListDomainMaintenancesRequest other = (ListDomainMaintenancesRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainMaintenancesRequest clone() {
        return (ListDomainMaintenancesRequest) super.clone();
    }

}
