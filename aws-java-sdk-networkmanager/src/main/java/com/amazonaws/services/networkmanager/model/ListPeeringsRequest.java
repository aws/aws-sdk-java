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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListPeerings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPeeringsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * Returns a list of a peering requests.
     * </p>
     */
    private String peeringType;
    /**
     * <p>
     * Returns a list edge locations for the
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * Returns a list of the peering request states.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPeeringsRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * Returns a list of a peering requests.
     * </p>
     * 
     * @param peeringType
     *        Returns a list of a peering requests.
     * @see PeeringType
     */

    public void setPeeringType(String peeringType) {
        this.peeringType = peeringType;
    }

    /**
     * <p>
     * Returns a list of a peering requests.
     * </p>
     * 
     * @return Returns a list of a peering requests.
     * @see PeeringType
     */

    public String getPeeringType() {
        return this.peeringType;
    }

    /**
     * <p>
     * Returns a list of a peering requests.
     * </p>
     * 
     * @param peeringType
     *        Returns a list of a peering requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeeringType
     */

    public ListPeeringsRequest withPeeringType(String peeringType) {
        setPeeringType(peeringType);
        return this;
    }

    /**
     * <p>
     * Returns a list of a peering requests.
     * </p>
     * 
     * @param peeringType
     *        Returns a list of a peering requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeeringType
     */

    public ListPeeringsRequest withPeeringType(PeeringType peeringType) {
        this.peeringType = peeringType.toString();
        return this;
    }

    /**
     * <p>
     * Returns a list edge locations for the
     * </p>
     * 
     * @param edgeLocation
     *        Returns a list edge locations for the
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * Returns a list edge locations for the
     * </p>
     * 
     * @return Returns a list edge locations for the
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * Returns a list edge locations for the
     * </p>
     * 
     * @param edgeLocation
     *        Returns a list edge locations for the
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPeeringsRequest withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * Returns a list of the peering request states.
     * </p>
     * 
     * @param state
     *        Returns a list of the peering request states.
     * @see PeeringState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Returns a list of the peering request states.
     * </p>
     * 
     * @return Returns a list of the peering request states.
     * @see PeeringState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Returns a list of the peering request states.
     * </p>
     * 
     * @param state
     *        Returns a list of the peering request states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeeringState
     */

    public ListPeeringsRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Returns a list of the peering request states.
     * </p>
     * 
     * @param state
     *        Returns a list of the peering request states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeeringState
     */

    public ListPeeringsRequest withState(PeeringState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPeeringsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPeeringsRequest withNextToken(String nextToken) {
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getPeeringType() != null)
            sb.append("PeeringType: ").append(getPeeringType()).append(",");
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof ListPeeringsRequest == false)
            return false;
        ListPeeringsRequest other = (ListPeeringsRequest) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getPeeringType() == null ^ this.getPeeringType() == null)
            return false;
        if (other.getPeeringType() != null && other.getPeeringType().equals(this.getPeeringType()) == false)
            return false;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getPeeringType() == null) ? 0 : getPeeringType().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPeeringsRequest clone() {
        return (ListPeeringsRequest) super.clone();
    }

}
