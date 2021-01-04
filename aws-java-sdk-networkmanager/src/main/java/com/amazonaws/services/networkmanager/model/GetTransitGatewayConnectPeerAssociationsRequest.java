/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayConnectPeerAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTransitGatewayConnectPeerAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     * </p>
     */
    private java.util.List<String> transitGatewayConnectPeerArns;
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

    public GetTransitGatewayConnectPeerAssociationsRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     */

    public java.util.List<String> getTransitGatewayConnectPeerArns() {
        return transitGatewayConnectPeerArns;
    }

    /**
     * <p>
     * One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param transitGatewayConnectPeerArns
     *        One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     */

    public void setTransitGatewayConnectPeerArns(java.util.Collection<String> transitGatewayConnectPeerArns) {
        if (transitGatewayConnectPeerArns == null) {
            this.transitGatewayConnectPeerArns = null;
            return;
        }

        this.transitGatewayConnectPeerArns = new java.util.ArrayList<String>(transitGatewayConnectPeerArns);
    }

    /**
     * <p>
     * One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayConnectPeerArns(java.util.Collection)} or
     * {@link #withTransitGatewayConnectPeerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayConnectPeerArns
     *        One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayConnectPeerAssociationsRequest withTransitGatewayConnectPeerArns(String... transitGatewayConnectPeerArns) {
        if (this.transitGatewayConnectPeerArns == null) {
            setTransitGatewayConnectPeerArns(new java.util.ArrayList<String>(transitGatewayConnectPeerArns.length));
        }
        for (String ele : transitGatewayConnectPeerArns) {
            this.transitGatewayConnectPeerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param transitGatewayConnectPeerArns
     *        One or more transit gateway Connect peer Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayConnectPeerAssociationsRequest withTransitGatewayConnectPeerArns(java.util.Collection<String> transitGatewayConnectPeerArns) {
        setTransitGatewayConnectPeerArns(transitGatewayConnectPeerArns);
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

    public GetTransitGatewayConnectPeerAssociationsRequest withMaxResults(Integer maxResults) {
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

    public GetTransitGatewayConnectPeerAssociationsRequest withNextToken(String nextToken) {
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getTransitGatewayConnectPeerArns() != null)
            sb.append("TransitGatewayConnectPeerArns: ").append(getTransitGatewayConnectPeerArns()).append(",");
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

        if (obj instanceof GetTransitGatewayConnectPeerAssociationsRequest == false)
            return false;
        GetTransitGatewayConnectPeerAssociationsRequest other = (GetTransitGatewayConnectPeerAssociationsRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getTransitGatewayConnectPeerArns() == null ^ this.getTransitGatewayConnectPeerArns() == null)
            return false;
        if (other.getTransitGatewayConnectPeerArns() != null
                && other.getTransitGatewayConnectPeerArns().equals(this.getTransitGatewayConnectPeerArns()) == false)
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

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayConnectPeerArns() == null) ? 0 : getTransitGatewayConnectPeerArns().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTransitGatewayConnectPeerAssociationsRequest clone() {
        return (GetTransitGatewayConnectPeerAssociationsRequest) super.clone();
    }

}
