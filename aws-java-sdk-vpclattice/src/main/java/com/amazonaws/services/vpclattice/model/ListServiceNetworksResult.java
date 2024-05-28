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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListServiceNetworks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceNetworksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the service networks.
     * </p>
     */
    private java.util.List<ServiceNetworkSummary> items;
    /**
     * <p>
     * If there are additional results, a pagination token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the service networks.
     * </p>
     * 
     * @return Information about the service networks.
     */

    public java.util.List<ServiceNetworkSummary> getItems() {
        return items;
    }

    /**
     * <p>
     * Information about the service networks.
     * </p>
     * 
     * @param items
     *        Information about the service networks.
     */

    public void setItems(java.util.Collection<ServiceNetworkSummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<ServiceNetworkSummary>(items);
    }

    /**
     * <p>
     * Information about the service networks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Information about the service networks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceNetworksResult withItems(ServiceNetworkSummary... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<ServiceNetworkSummary>(items.length));
        }
        for (ServiceNetworkSummary ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the service networks.
     * </p>
     * 
     * @param items
     *        Information about the service networks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceNetworksResult withItems(java.util.Collection<ServiceNetworkSummary> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * If there are additional results, a pagination token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, a pagination token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, a pagination token for the next page of results.
     * </p>
     * 
     * @return If there are additional results, a pagination token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, a pagination token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, a pagination token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceNetworksResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof ListServiceNetworksResult == false)
            return false;
        ListServiceNetworksResult other = (ListServiceNetworksResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceNetworksResult clone() {
        try {
            return (ListServiceNetworksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
