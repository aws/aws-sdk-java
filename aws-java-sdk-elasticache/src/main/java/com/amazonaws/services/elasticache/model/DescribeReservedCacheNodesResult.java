/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>DescribeReservedCacheNodes</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeReservedCacheNodes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedCacheNodesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedCacheNode> reservedCacheNodes;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     * </p>
     * 
     * @return A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     */

    public java.util.List<ReservedCacheNode> getReservedCacheNodes() {
        if (reservedCacheNodes == null) {
            reservedCacheNodes = new com.amazonaws.internal.SdkInternalList<ReservedCacheNode>();
        }
        return reservedCacheNodes;
    }

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     * </p>
     * 
     * @param reservedCacheNodes
     *        A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     */

    public void setReservedCacheNodes(java.util.Collection<ReservedCacheNode> reservedCacheNodes) {
        if (reservedCacheNodes == null) {
            this.reservedCacheNodes = null;
            return;
        }

        this.reservedCacheNodes = new com.amazonaws.internal.SdkInternalList<ReservedCacheNode>(reservedCacheNodes);
    }

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedCacheNodes(java.util.Collection)} or {@link #withReservedCacheNodes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param reservedCacheNodes
     *        A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesResult withReservedCacheNodes(ReservedCacheNode... reservedCacheNodes) {
        if (this.reservedCacheNodes == null) {
            setReservedCacheNodes(new com.amazonaws.internal.SdkInternalList<ReservedCacheNode>(reservedCacheNodes.length));
        }
        for (ReservedCacheNode ele : reservedCacheNodes) {
            this.reservedCacheNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     * </p>
     * 
     * @param reservedCacheNodes
     *        A list of reserved cache nodes. Each element in the list contains detailed information about one node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedCacheNodesResult withReservedCacheNodes(java.util.Collection<ReservedCacheNode> reservedCacheNodes) {
        setReservedCacheNodes(reservedCacheNodes);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getReservedCacheNodes() != null)
            sb.append("ReservedCacheNodes: ").append(getReservedCacheNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedCacheNodesResult == false)
            return false;
        DescribeReservedCacheNodesResult other = (DescribeReservedCacheNodesResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedCacheNodes() == null ^ this.getReservedCacheNodes() == null)
            return false;
        if (other.getReservedCacheNodes() != null && other.getReservedCacheNodes().equals(this.getReservedCacheNodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReservedCacheNodes() == null) ? 0 : getReservedCacheNodes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedCacheNodesResult clone() {
        try {
            return (DescribeReservedCacheNodesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
