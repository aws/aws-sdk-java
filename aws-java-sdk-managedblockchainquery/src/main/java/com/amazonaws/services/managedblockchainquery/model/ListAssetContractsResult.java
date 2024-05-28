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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListAssetContracts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetContractsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of contract objects that contain the properties for each contract.
     * </p>
     */
    private java.util.List<AssetContract> contracts;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of contract objects that contain the properties for each contract.
     * </p>
     * 
     * @return An array of contract objects that contain the properties for each contract.
     */

    public java.util.List<AssetContract> getContracts() {
        return contracts;
    }

    /**
     * <p>
     * An array of contract objects that contain the properties for each contract.
     * </p>
     * 
     * @param contracts
     *        An array of contract objects that contain the properties for each contract.
     */

    public void setContracts(java.util.Collection<AssetContract> contracts) {
        if (contracts == null) {
            this.contracts = null;
            return;
        }

        this.contracts = new java.util.ArrayList<AssetContract>(contracts);
    }

    /**
     * <p>
     * An array of contract objects that contain the properties for each contract.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContracts(java.util.Collection)} or {@link #withContracts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contracts
     *        An array of contract objects that contain the properties for each contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetContractsResult withContracts(AssetContract... contracts) {
        if (this.contracts == null) {
            setContracts(new java.util.ArrayList<AssetContract>(contracts.length));
        }
        for (AssetContract ele : contracts) {
            this.contracts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of contract objects that contain the properties for each contract.
     * </p>
     * 
     * @param contracts
     *        An array of contract objects that contain the properties for each contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetContractsResult withContracts(java.util.Collection<AssetContract> contracts) {
        setContracts(contracts);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetContractsResult withNextToken(String nextToken) {
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
        if (getContracts() != null)
            sb.append("Contracts: ").append(getContracts()).append(",");
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

        if (obj instanceof ListAssetContractsResult == false)
            return false;
        ListAssetContractsResult other = (ListAssetContractsResult) obj;
        if (other.getContracts() == null ^ this.getContracts() == null)
            return false;
        if (other.getContracts() != null && other.getContracts().equals(this.getContracts()) == false)
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

        hashCode = prime * hashCode + ((getContracts() == null) ? 0 : getContracts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetContractsResult clone() {
        try {
            return (ListAssetContractsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
