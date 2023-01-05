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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedNodesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     */
    private java.util.List<ReservedNode> reservedNodes;

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords.
     * </p>
     * 
     * @param nextToken
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by MaxRecords.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords.
     * </p>
     * 
     * @param nextToken
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     * 
     * @return Returns information about reserved nodes for this account, or about a specified reserved node.
     */

    public java.util.List<ReservedNode> getReservedNodes() {
        return reservedNodes;
    }

    /**
     * <p>
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     * 
     * @param reservedNodes
     *        Returns information about reserved nodes for this account, or about a specified reserved node.
     */

    public void setReservedNodes(java.util.Collection<ReservedNode> reservedNodes) {
        if (reservedNodes == null) {
            this.reservedNodes = null;
            return;
        }

        this.reservedNodes = new java.util.ArrayList<ReservedNode>(reservedNodes);
    }

    /**
     * <p>
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedNodes(java.util.Collection)} or {@link #withReservedNodes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param reservedNodes
     *        Returns information about reserved nodes for this account, or about a specified reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesResult withReservedNodes(ReservedNode... reservedNodes) {
        if (this.reservedNodes == null) {
            setReservedNodes(new java.util.ArrayList<ReservedNode>(reservedNodes.length));
        }
        for (ReservedNode ele : reservedNodes) {
            this.reservedNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     * 
     * @param reservedNodes
     *        Returns information about reserved nodes for this account, or about a specified reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesResult withReservedNodes(java.util.Collection<ReservedNode> reservedNodes) {
        setReservedNodes(reservedNodes);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReservedNodes() != null)
            sb.append("ReservedNodes: ").append(getReservedNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedNodesResult == false)
            return false;
        DescribeReservedNodesResult other = (DescribeReservedNodesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservedNodes() == null ^ this.getReservedNodes() == null)
            return false;
        if (other.getReservedNodes() != null && other.getReservedNodes().equals(this.getReservedNodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReservedNodes() == null) ? 0 : getReservedNodes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedNodesResult clone() {
        try {
            return (DescribeReservedNodesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
