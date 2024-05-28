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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkOperations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolNetworkOperationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete operations.
     * </p>
     */
    private java.util.List<ListSolNetworkOperationsInfo> networkOperations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete operations.
     * </p>
     * 
     * @return Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete
     *         operations.
     */

    public java.util.List<ListSolNetworkOperationsInfo> getNetworkOperations() {
        return networkOperations;
    }

    /**
     * <p>
     * Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete operations.
     * </p>
     * 
     * @param networkOperations
     *        Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete
     *        operations.
     */

    public void setNetworkOperations(java.util.Collection<ListSolNetworkOperationsInfo> networkOperations) {
        if (networkOperations == null) {
            this.networkOperations = null;
            return;
        }

        this.networkOperations = new java.util.ArrayList<ListSolNetworkOperationsInfo>(networkOperations);
    }

    /**
     * <p>
     * Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkOperations(java.util.Collection)} or {@link #withNetworkOperations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkOperations
     *        Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete
     *        operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkOperationsResult withNetworkOperations(ListSolNetworkOperationsInfo... networkOperations) {
        if (this.networkOperations == null) {
            setNetworkOperations(new java.util.ArrayList<ListSolNetworkOperationsInfo>(networkOperations.length));
        }
        for (ListSolNetworkOperationsInfo ele : networkOperations) {
            this.networkOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete operations.
     * </p>
     * 
     * @param networkOperations
     *        Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete
     *        operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkOperationsResult withNetworkOperations(java.util.Collection<ListSolNetworkOperationsInfo> networkOperations) {
        setNetworkOperations(networkOperations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkOperationsResult withNextToken(String nextToken) {
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
        if (getNetworkOperations() != null)
            sb.append("NetworkOperations: ").append(getNetworkOperations()).append(",");
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

        if (obj instanceof ListSolNetworkOperationsResult == false)
            return false;
        ListSolNetworkOperationsResult other = (ListSolNetworkOperationsResult) obj;
        if (other.getNetworkOperations() == null ^ this.getNetworkOperations() == null)
            return false;
        if (other.getNetworkOperations() != null && other.getNetworkOperations().equals(this.getNetworkOperations()) == false)
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

        hashCode = prime * hashCode + ((getNetworkOperations() == null) ? 0 : getNetworkOperations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSolNetworkOperationsResult clone() {
        try {
            return (ListSolNetworkOperationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
