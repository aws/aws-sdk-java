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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappingsByDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomRoutingPortMappingsByDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the virtual private cloud (VPC) subnet.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The endpoint IP address in a virtual private cloud (VPC) subnet for which you want to receive back port mappings.
     * </p>
     */
    private String destinationAddress;
    /**
     * <p>
     * The number of destination port mappings that you want to return with this call. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID for the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @param endpointId
     *        The ID for the virtual private cloud (VPC) subnet.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The ID for the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @return The ID for the virtual private cloud (VPC) subnet.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The ID for the virtual private cloud (VPC) subnet.
     * </p>
     * 
     * @param endpointId
     *        The ID for the virtual private cloud (VPC) subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsByDestinationRequest withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The endpoint IP address in a virtual private cloud (VPC) subnet for which you want to receive back port mappings.
     * </p>
     * 
     * @param destinationAddress
     *        The endpoint IP address in a virtual private cloud (VPC) subnet for which you want to receive back port
     *        mappings.
     */

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    /**
     * <p>
     * The endpoint IP address in a virtual private cloud (VPC) subnet for which you want to receive back port mappings.
     * </p>
     * 
     * @return The endpoint IP address in a virtual private cloud (VPC) subnet for which you want to receive back port
     *         mappings.
     */

    public String getDestinationAddress() {
        return this.destinationAddress;
    }

    /**
     * <p>
     * The endpoint IP address in a virtual private cloud (VPC) subnet for which you want to receive back port mappings.
     * </p>
     * 
     * @param destinationAddress
     *        The endpoint IP address in a virtual private cloud (VPC) subnet for which you want to receive back port
     *        mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsByDestinationRequest withDestinationAddress(String destinationAddress) {
        setDestinationAddress(destinationAddress);
        return this;
    }

    /**
     * <p>
     * The number of destination port mappings that you want to return with this call. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The number of destination port mappings that you want to return with this call. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of destination port mappings that you want to return with this call. The default value is 10.
     * </p>
     * 
     * @return The number of destination port mappings that you want to return with this call. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of destination port mappings that you want to return with this call. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The number of destination port mappings that you want to return with this call. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsByDestinationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsByDestinationRequest withNextToken(String nextToken) {
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
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getDestinationAddress() != null)
            sb.append("DestinationAddress: ").append(getDestinationAddress()).append(",");
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

        if (obj instanceof ListCustomRoutingPortMappingsByDestinationRequest == false)
            return false;
        ListCustomRoutingPortMappingsByDestinationRequest other = (ListCustomRoutingPortMappingsByDestinationRequest) obj;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getDestinationAddress() == null ^ this.getDestinationAddress() == null)
            return false;
        if (other.getDestinationAddress() != null && other.getDestinationAddress().equals(this.getDestinationAddress()) == false)
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

        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDestinationAddress() == null) ? 0 : getDestinationAddress().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomRoutingPortMappingsByDestinationRequest clone() {
        return (ListCustomRoutingPortMappingsByDestinationRequest) super.clone();
    }

}
