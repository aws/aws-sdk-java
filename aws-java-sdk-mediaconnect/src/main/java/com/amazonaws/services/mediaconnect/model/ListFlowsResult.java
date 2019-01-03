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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListFlows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of flow summaries. */
    private java.util.List<ListedFlow> flows;
    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListFlows
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListFlows request a second time and specify the NextToken
     * value.
     */
    private String nextToken;

    /**
     * A list of flow summaries.
     * 
     * @return A list of flow summaries.
     */

    public java.util.List<ListedFlow> getFlows() {
        return flows;
    }

    /**
     * A list of flow summaries.
     * 
     * @param flows
     *        A list of flow summaries.
     */

    public void setFlows(java.util.Collection<ListedFlow> flows) {
        if (flows == null) {
            this.flows = null;
            return;
        }

        this.flows = new java.util.ArrayList<ListedFlow>(flows);
    }

    /**
     * A list of flow summaries.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlows(java.util.Collection)} or {@link #withFlows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param flows
     *        A list of flow summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowsResult withFlows(ListedFlow... flows) {
        if (this.flows == null) {
            setFlows(new java.util.ArrayList<ListedFlow>(flows.length));
        }
        for (ListedFlow ele : flows) {
            this.flows.add(ele);
        }
        return this;
    }

    /**
     * A list of flow summaries.
     * 
     * @param flows
     *        A list of flow summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowsResult withFlows(java.util.Collection<ListedFlow> flows) {
        setFlows(flows);
        return this;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListFlows
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListFlows request a second time and specify the NextToken
     * value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a ListFlows
     *        request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken
     *        value. To see the next batch of results, you can submit the ListFlows request a second time and specify
     *        the NextToken value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListFlows
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListFlows request a second time and specify the NextToken
     * value.
     * 
     * @return The token that identifies which batch of results that you want to see. For example, you submit a
     *         ListFlows request with MaxResults set at 5. The service returns the first batch of results (up to 5) and
     *         a NextToken value. To see the next batch of results, you can submit the ListFlows request a second time
     *         and specify the NextToken value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that identifies which batch of results that you want to see. For example, you submit a ListFlows
     * request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value.
     * To see the next batch of results, you can submit the ListFlows request a second time and specify the NextToken
     * value.
     * 
     * @param nextToken
     *        The token that identifies which batch of results that you want to see. For example, you submit a ListFlows
     *        request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken
     *        value. To see the next batch of results, you can submit the ListFlows request a second time and specify
     *        the NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowsResult withNextToken(String nextToken) {
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
        if (getFlows() != null)
            sb.append("Flows: ").append(getFlows()).append(",");
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

        if (obj instanceof ListFlowsResult == false)
            return false;
        ListFlowsResult other = (ListFlowsResult) obj;
        if (other.getFlows() == null ^ this.getFlows() == null)
            return false;
        if (other.getFlows() != null && other.getFlows().equals(this.getFlows()) == false)
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

        hashCode = prime * hashCode + ((getFlows() == null) ? 0 : getFlows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFlowsResult clone() {
        try {
            return (ListFlowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
