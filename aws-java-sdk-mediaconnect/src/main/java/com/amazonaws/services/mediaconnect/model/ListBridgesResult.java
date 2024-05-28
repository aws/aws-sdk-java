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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListBridges" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBridgesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of bridge summaries. */
    private java.util.List<ListedBridge> bridges;
    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListBridges
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListBridges request a second time and specify the NextToken
     * value.
     */
    private String nextToken;

    /**
     * A list of bridge summaries.
     * 
     * @return A list of bridge summaries.
     */

    public java.util.List<ListedBridge> getBridges() {
        return bridges;
    }

    /**
     * A list of bridge summaries.
     * 
     * @param bridges
     *        A list of bridge summaries.
     */

    public void setBridges(java.util.Collection<ListedBridge> bridges) {
        if (bridges == null) {
            this.bridges = null;
            return;
        }

        this.bridges = new java.util.ArrayList<ListedBridge>(bridges);
    }

    /**
     * A list of bridge summaries.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBridges(java.util.Collection)} or {@link #withBridges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param bridges
     *        A list of bridge summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBridgesResult withBridges(ListedBridge... bridges) {
        if (this.bridges == null) {
            setBridges(new java.util.ArrayList<ListedBridge>(bridges.length));
        }
        for (ListedBridge ele : bridges) {
            this.bridges.add(ele);
        }
        return this;
    }

    /**
     * A list of bridge summaries.
     * 
     * @param bridges
     *        A list of bridge summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBridgesResult withBridges(java.util.Collection<ListedBridge> bridges) {
        setBridges(bridges);
        return this;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListBridges
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListBridges request a second time and specify the NextToken
     * value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListBridges request with MaxResults set at 5. The service returns the first batch of results (up to 5) and
     *        a NextToken value. To see the next batch of results, you can submit the ListBridges request a second time
     *        and specify the NextToken value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListBridges
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListBridges request a second time and specify the NextToken
     * value.
     * 
     * @return The token that identifies which batch of results that you want to see. For example, you submit a
     *         ListBridges request with MaxResults set at 5. The service returns the first batch of results (up to 5)
     *         and a NextToken value. To see the next batch of results, you can submit the ListBridges request a second
     *         time and specify the NextToken value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListBridges
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListBridges request a second time and specify the NextToken
     * value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a
     *        ListBridges request with MaxResults set at 5. The service returns the first batch of results (up to 5) and
     *        a NextToken value. To see the next batch of results, you can submit the ListBridges request a second time
     *        and specify the NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBridgesResult withNextToken(String nextToken) {
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
        if (getBridges() != null)
            sb.append("Bridges: ").append(getBridges()).append(",");
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

        if (obj instanceof ListBridgesResult == false)
            return false;
        ListBridgesResult other = (ListBridgesResult) obj;
        if (other.getBridges() == null ^ this.getBridges() == null)
            return false;
        if (other.getBridges() != null && other.getBridges().equals(this.getBridges()) == false)
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

        hashCode = prime * hashCode + ((getBridges() == null) ? 0 : getBridges().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBridgesResult clone() {
        try {
            return (ListBridgesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
