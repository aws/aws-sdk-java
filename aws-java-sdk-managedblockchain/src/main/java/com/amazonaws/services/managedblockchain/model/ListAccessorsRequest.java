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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListAccessors" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of accessors to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The blockchain network that the <code>Accessor</code> token is created for.
     * </p>
     * <note>
     * <p>
     * Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens that were
     * created before the <code>networkType</code> property was introduced.
     * </p>
     * </note>
     */
    private String networkType;

    /**
     * <p>
     * The maximum number of accessors to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of accessors to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of accessors to list.
     * </p>
     * 
     * @return The maximum number of accessors to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of accessors to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of accessors to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListAccessorsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The blockchain network that the <code>Accessor</code> token is created for.
     * </p>
     * <note>
     * <p>
     * Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens that were
     * created before the <code>networkType</code> property was introduced.
     * </p>
     * </note>
     * 
     * @param networkType
     *        The blockchain network that the <code>Accessor</code> token is created for.</p> <note>
     *        <p>
     *        Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens that
     *        were created before the <code>networkType</code> property was introduced.
     *        </p>
     * @see AccessorNetworkType
     */

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * The blockchain network that the <code>Accessor</code> token is created for.
     * </p>
     * <note>
     * <p>
     * Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens that were
     * created before the <code>networkType</code> property was introduced.
     * </p>
     * </note>
     * 
     * @return The blockchain network that the <code>Accessor</code> token is created for.</p> <note>
     *         <p>
     *         Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens
     *         that were created before the <code>networkType</code> property was introduced.
     *         </p>
     * @see AccessorNetworkType
     */

    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * <p>
     * The blockchain network that the <code>Accessor</code> token is created for.
     * </p>
     * <note>
     * <p>
     * Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens that were
     * created before the <code>networkType</code> property was introduced.
     * </p>
     * </note>
     * 
     * @param networkType
     *        The blockchain network that the <code>Accessor</code> token is created for.</p> <note>
     *        <p>
     *        Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens that
     *        were created before the <code>networkType</code> property was introduced.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorNetworkType
     */

    public ListAccessorsRequest withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * The blockchain network that the <code>Accessor</code> token is created for.
     * </p>
     * <note>
     * <p>
     * Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens that were
     * created before the <code>networkType</code> property was introduced.
     * </p>
     * </note>
     * 
     * @param networkType
     *        The blockchain network that the <code>Accessor</code> token is created for.</p> <note>
     *        <p>
     *        Use the value <code>ETHEREUM_MAINNET_AND_GOERLI</code> for all existing <code>Accessors</code> tokens that
     *        were created before the <code>networkType</code> property was introduced.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorNetworkType
     */

    public ListAccessorsRequest withNetworkType(AccessorNetworkType networkType) {
        this.networkType = networkType.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccessorsRequest == false)
            return false;
        ListAccessorsRequest other = (ListAccessorsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessorsRequest clone() {
        return (ListAccessorsRequest) super.clone();
    }

}
