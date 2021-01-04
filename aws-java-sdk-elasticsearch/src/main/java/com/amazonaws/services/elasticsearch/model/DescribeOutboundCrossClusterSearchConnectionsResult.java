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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code><a>DescribeOutboundCrossClusterSearchConnections</a></code> request. Contains the list of
 * connections matching the filter criteria.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOutboundCrossClusterSearchConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified filter
     * criteria.
     * </p>
     */
    private java.util.List<OutboundCrossClusterSearchConnection> crossClusterSearchConnections;
    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified filter
     * criteria.
     * </p>
     * 
     * @return Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified
     *         filter criteria.
     */

    public java.util.List<OutboundCrossClusterSearchConnection> getCrossClusterSearchConnections() {
        return crossClusterSearchConnections;
    }

    /**
     * <p>
     * Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified filter
     * criteria.
     * </p>
     * 
     * @param crossClusterSearchConnections
     *        Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified filter
     *        criteria.
     */

    public void setCrossClusterSearchConnections(java.util.Collection<OutboundCrossClusterSearchConnection> crossClusterSearchConnections) {
        if (crossClusterSearchConnections == null) {
            this.crossClusterSearchConnections = null;
            return;
        }

        this.crossClusterSearchConnections = new java.util.ArrayList<OutboundCrossClusterSearchConnection>(crossClusterSearchConnections);
    }

    /**
     * <p>
     * Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified filter
     * criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrossClusterSearchConnections(java.util.Collection)} or
     * {@link #withCrossClusterSearchConnections(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param crossClusterSearchConnections
     *        Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified filter
     *        criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundCrossClusterSearchConnectionsResult withCrossClusterSearchConnections(
            OutboundCrossClusterSearchConnection... crossClusterSearchConnections) {
        if (this.crossClusterSearchConnections == null) {
            setCrossClusterSearchConnections(new java.util.ArrayList<OutboundCrossClusterSearchConnection>(crossClusterSearchConnections.length));
        }
        for (OutboundCrossClusterSearchConnection ele : crossClusterSearchConnections) {
            this.crossClusterSearchConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified filter
     * criteria.
     * </p>
     * 
     * @param crossClusterSearchConnections
     *        Consists of list of <code><a>OutboundCrossClusterSearchConnection</a></code> matching the specified filter
     *        criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundCrossClusterSearchConnectionsResult withCrossClusterSearchConnections(
            java.util.Collection<OutboundCrossClusterSearchConnection> crossClusterSearchConnections) {
        setCrossClusterSearchConnections(crossClusterSearchConnections);
        return this;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @param nextToken
     *        If more results are available and NextToken is present, make the next request to the same API with the
     *        received NextToken to paginate the remaining results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @return If more results are available and NextToken is present, make the next request to the same API with the
     *         received NextToken to paginate the remaining results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @param nextToken
     *        If more results are available and NextToken is present, make the next request to the same API with the
     *        received NextToken to paginate the remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundCrossClusterSearchConnectionsResult withNextToken(String nextToken) {
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
        if (getCrossClusterSearchConnections() != null)
            sb.append("CrossClusterSearchConnections: ").append(getCrossClusterSearchConnections()).append(",");
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

        if (obj instanceof DescribeOutboundCrossClusterSearchConnectionsResult == false)
            return false;
        DescribeOutboundCrossClusterSearchConnectionsResult other = (DescribeOutboundCrossClusterSearchConnectionsResult) obj;
        if (other.getCrossClusterSearchConnections() == null ^ this.getCrossClusterSearchConnections() == null)
            return false;
        if (other.getCrossClusterSearchConnections() != null
                && other.getCrossClusterSearchConnections().equals(this.getCrossClusterSearchConnections()) == false)
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

        hashCode = prime * hashCode + ((getCrossClusterSearchConnections() == null) ? 0 : getCrossClusterSearchConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOutboundCrossClusterSearchConnectionsResult clone() {
        try {
            return (DescribeOutboundCrossClusterSearchConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
