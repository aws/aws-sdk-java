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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServerNeighborsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of distinct servers that are one hop away from the given server.
     * </p>
     */
    private java.util.List<NeighborConnectionDetail> neighbors;
    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you specified 100 IDs for
     * <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     * <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with this token.
     * Use this token in the next query to retrieve the next set of 10.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Count of distinct servers that are one hop away from the given server.
     * </p>
     */
    private Long knownDependencyCount;

    /**
     * <p>
     * List of distinct servers that are one hop away from the given server.
     * </p>
     * 
     * @return List of distinct servers that are one hop away from the given server.
     */

    public java.util.List<NeighborConnectionDetail> getNeighbors() {
        return neighbors;
    }

    /**
     * <p>
     * List of distinct servers that are one hop away from the given server.
     * </p>
     * 
     * @param neighbors
     *        List of distinct servers that are one hop away from the given server.
     */

    public void setNeighbors(java.util.Collection<NeighborConnectionDetail> neighbors) {
        if (neighbors == null) {
            this.neighbors = null;
            return;
        }

        this.neighbors = new java.util.ArrayList<NeighborConnectionDetail>(neighbors);
    }

    /**
     * <p>
     * List of distinct servers that are one hop away from the given server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNeighbors(java.util.Collection)} or {@link #withNeighbors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param neighbors
     *        List of distinct servers that are one hop away from the given server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsResult withNeighbors(NeighborConnectionDetail... neighbors) {
        if (this.neighbors == null) {
            setNeighbors(new java.util.ArrayList<NeighborConnectionDetail>(neighbors.length));
        }
        for (NeighborConnectionDetail ele : neighbors) {
            this.neighbors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of distinct servers that are one hop away from the given server.
     * </p>
     * 
     * @param neighbors
     *        List of distinct servers that are one hop away from the given server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsResult withNeighbors(java.util.Collection<NeighborConnectionDetail> neighbors) {
        setNeighbors(neighbors);
        return this;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you specified 100 IDs for
     * <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     * <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with this token.
     * Use this token in the next query to retrieve the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if you specified 100 IDs for
     *        <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     *        <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with this
     *        token. Use this token in the next query to retrieve the next set of 10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you specified 100 IDs for
     * <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     * <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with this token.
     * Use this token in the next query to retrieve the next set of 10.
     * </p>
     * 
     * @return Token to retrieve the next set of results. For example, if you specified 100 IDs for
     *         <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     *         <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with
     *         this token. Use this token in the next query to retrieve the next set of 10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if you specified 100 IDs for
     * <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     * <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with this token.
     * Use this token in the next query to retrieve the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if you specified 100 IDs for
     *        <code>ListServerNeighborsRequest$neighborConfigurationIds</code> but set
     *        <code>ListServerNeighborsRequest$maxResults</code> to 10, you received a set of 10 results along with this
     *        token. Use this token in the next query to retrieve the next set of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Count of distinct servers that are one hop away from the given server.
     * </p>
     * 
     * @param knownDependencyCount
     *        Count of distinct servers that are one hop away from the given server.
     */

    public void setKnownDependencyCount(Long knownDependencyCount) {
        this.knownDependencyCount = knownDependencyCount;
    }

    /**
     * <p>
     * Count of distinct servers that are one hop away from the given server.
     * </p>
     * 
     * @return Count of distinct servers that are one hop away from the given server.
     */

    public Long getKnownDependencyCount() {
        return this.knownDependencyCount;
    }

    /**
     * <p>
     * Count of distinct servers that are one hop away from the given server.
     * </p>
     * 
     * @param knownDependencyCount
     *        Count of distinct servers that are one hop away from the given server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServerNeighborsResult withKnownDependencyCount(Long knownDependencyCount) {
        setKnownDependencyCount(knownDependencyCount);
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
        if (getNeighbors() != null)
            sb.append("Neighbors: ").append(getNeighbors()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getKnownDependencyCount() != null)
            sb.append("KnownDependencyCount: ").append(getKnownDependencyCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServerNeighborsResult == false)
            return false;
        ListServerNeighborsResult other = (ListServerNeighborsResult) obj;
        if (other.getNeighbors() == null ^ this.getNeighbors() == null)
            return false;
        if (other.getNeighbors() != null && other.getNeighbors().equals(this.getNeighbors()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getKnownDependencyCount() == null ^ this.getKnownDependencyCount() == null)
            return false;
        if (other.getKnownDependencyCount() != null && other.getKnownDependencyCount().equals(this.getKnownDependencyCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNeighbors() == null) ? 0 : getNeighbors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getKnownDependencyCount() == null) ? 0 : getKnownDependencyCount().hashCode());
        return hashCode;
    }

    @Override
    public ListServerNeighborsResult clone() {
        try {
            return (ListServerNeighborsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
