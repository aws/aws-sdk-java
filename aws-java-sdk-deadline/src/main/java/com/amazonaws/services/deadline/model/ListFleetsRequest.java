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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFleetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The display names of a list of fleets.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID of the fleets.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results, or <code>null</code> to start from the beginning.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The principal ID of the members to include in the fleet.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The status of the fleet.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The display names of a list of fleets.
     * </p>
     * 
     * @param displayName
     *        The display names of a list of fleets.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display names of a list of fleets.
     * </p>
     * 
     * @return The display names of a list of fleets.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display names of a list of fleets.
     * </p>
     * 
     * @param displayName
     *        The display names of a list of fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID of the fleets.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the fleets.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the fleets.
     * </p>
     * 
     * @return The farm ID of the fleets.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the fleets.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> to start from the beginning.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <code>null</code> to start from the beginning.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> to start from the beginning.
     * </p>
     * 
     * @return The token for the next set of results, or <code>null</code> to start from the beginning.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> to start from the beginning.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <code>null</code> to start from the beginning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The principal ID of the members to include in the fleet.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the members to include in the fleet.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID of the members to include in the fleet.
     * </p>
     * 
     * @return The principal ID of the members to include in the fleet.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The principal ID of the members to include in the fleet.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the members to include in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFleetsRequest withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param status
     *        The status of the fleet.
     * @see FleetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @return The status of the fleet.
     * @see FleetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param status
     *        The status of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public ListFleetsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param status
     *        The status of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public ListFleetsRequest withStatus(FleetStatus status) {
        this.status = status.toString();
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFleetsRequest == false)
            return false;
        ListFleetsRequest other = (ListFleetsRequest) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListFleetsRequest clone() {
        return (ListFleetsRequest) super.clone();
    }

}
