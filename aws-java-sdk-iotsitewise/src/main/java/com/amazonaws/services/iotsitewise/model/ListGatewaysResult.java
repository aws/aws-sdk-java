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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListGateways" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     */
    private java.util.List<GatewaySummary> gatewaySummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     * 
     * @return A list that summarizes each gateway.
     */

    public java.util.List<GatewaySummary> getGatewaySummaries() {
        return gatewaySummaries;
    }

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     * 
     * @param gatewaySummaries
     *        A list that summarizes each gateway.
     */

    public void setGatewaySummaries(java.util.Collection<GatewaySummary> gatewaySummaries) {
        if (gatewaySummaries == null) {
            this.gatewaySummaries = null;
            return;
        }

        this.gatewaySummaries = new java.util.ArrayList<GatewaySummary>(gatewaySummaries);
    }

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewaySummaries(java.util.Collection)} or {@link #withGatewaySummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param gatewaySummaries
     *        A list that summarizes each gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withGatewaySummaries(GatewaySummary... gatewaySummaries) {
        if (this.gatewaySummaries == null) {
            setGatewaySummaries(new java.util.ArrayList<GatewaySummary>(gatewaySummaries.length));
        }
        for (GatewaySummary ele : gatewaySummaries) {
            this.gatewaySummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each gateway.
     * </p>
     * 
     * @param gatewaySummaries
     *        A list that summarizes each gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withGatewaySummaries(java.util.Collection<GatewaySummary> gatewaySummaries) {
        setGatewaySummaries(gatewaySummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysResult withNextToken(String nextToken) {
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
        if (getGatewaySummaries() != null)
            sb.append("GatewaySummaries: ").append(getGatewaySummaries()).append(",");
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

        if (obj instanceof ListGatewaysResult == false)
            return false;
        ListGatewaysResult other = (ListGatewaysResult) obj;
        if (other.getGatewaySummaries() == null ^ this.getGatewaySummaries() == null)
            return false;
        if (other.getGatewaySummaries() != null && other.getGatewaySummaries().equals(this.getGatewaySummaries()) == false)
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

        hashCode = prime * hashCode + ((getGatewaySummaries() == null) ? 0 : getGatewaySummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGatewaysResult clone() {
        try {
            return (ListGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
