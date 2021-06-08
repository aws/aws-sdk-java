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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappingsByDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomRoutingPortMappingsByDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The port mappings for the endpoint IP address that you specified in the request.
     * </p>
     */
    private java.util.List<DestinationPortMapping> destinationPortMappings;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The port mappings for the endpoint IP address that you specified in the request.
     * </p>
     * 
     * @return The port mappings for the endpoint IP address that you specified in the request.
     */

    public java.util.List<DestinationPortMapping> getDestinationPortMappings() {
        return destinationPortMappings;
    }

    /**
     * <p>
     * The port mappings for the endpoint IP address that you specified in the request.
     * </p>
     * 
     * @param destinationPortMappings
     *        The port mappings for the endpoint IP address that you specified in the request.
     */

    public void setDestinationPortMappings(java.util.Collection<DestinationPortMapping> destinationPortMappings) {
        if (destinationPortMappings == null) {
            this.destinationPortMappings = null;
            return;
        }

        this.destinationPortMappings = new java.util.ArrayList<DestinationPortMapping>(destinationPortMappings);
    }

    /**
     * <p>
     * The port mappings for the endpoint IP address that you specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPortMappings(java.util.Collection)} or
     * {@link #withDestinationPortMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationPortMappings
     *        The port mappings for the endpoint IP address that you specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsByDestinationResult withDestinationPortMappings(DestinationPortMapping... destinationPortMappings) {
        if (this.destinationPortMappings == null) {
            setDestinationPortMappings(new java.util.ArrayList<DestinationPortMapping>(destinationPortMappings.length));
        }
        for (DestinationPortMapping ele : destinationPortMappings) {
            this.destinationPortMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The port mappings for the endpoint IP address that you specified in the request.
     * </p>
     * 
     * @param destinationPortMappings
     *        The port mappings for the endpoint IP address that you specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomRoutingPortMappingsByDestinationResult withDestinationPortMappings(java.util.Collection<DestinationPortMapping> destinationPortMappings) {
        setDestinationPortMappings(destinationPortMappings);
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

    public ListCustomRoutingPortMappingsByDestinationResult withNextToken(String nextToken) {
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
        if (getDestinationPortMappings() != null)
            sb.append("DestinationPortMappings: ").append(getDestinationPortMappings()).append(",");
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

        if (obj instanceof ListCustomRoutingPortMappingsByDestinationResult == false)
            return false;
        ListCustomRoutingPortMappingsByDestinationResult other = (ListCustomRoutingPortMappingsByDestinationResult) obj;
        if (other.getDestinationPortMappings() == null ^ this.getDestinationPortMappings() == null)
            return false;
        if (other.getDestinationPortMappings() != null && other.getDestinationPortMappings().equals(this.getDestinationPortMappings()) == false)
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

        hashCode = prime * hashCode + ((getDestinationPortMappings() == null) ? 0 : getDestinationPortMappings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomRoutingPortMappingsByDestinationResult clone() {
        try {
            return (ListCustomRoutingPortMappingsByDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
