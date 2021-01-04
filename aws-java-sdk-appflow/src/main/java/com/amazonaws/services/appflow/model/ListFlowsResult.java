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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListFlows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of flows associated with your account.
     * </p>
     */
    private java.util.List<FlowDefinition> flows;
    /**
     * <p>
     * The pagination token for next page of data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of flows associated with your account.
     * </p>
     * 
     * @return The list of flows associated with your account.
     */

    public java.util.List<FlowDefinition> getFlows() {
        return flows;
    }

    /**
     * <p>
     * The list of flows associated with your account.
     * </p>
     * 
     * @param flows
     *        The list of flows associated with your account.
     */

    public void setFlows(java.util.Collection<FlowDefinition> flows) {
        if (flows == null) {
            this.flows = null;
            return;
        }

        this.flows = new java.util.ArrayList<FlowDefinition>(flows);
    }

    /**
     * <p>
     * The list of flows associated with your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlows(java.util.Collection)} or {@link #withFlows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param flows
     *        The list of flows associated with your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowsResult withFlows(FlowDefinition... flows) {
        if (this.flows == null) {
            setFlows(new java.util.ArrayList<FlowDefinition>(flows.length));
        }
        for (FlowDefinition ele : flows) {
            this.flows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of flows associated with your account.
     * </p>
     * 
     * @param flows
     *        The list of flows associated with your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowsResult withFlows(java.util.Collection<FlowDefinition> flows) {
        setFlows(flows);
        return this;
    }

    /**
     * <p>
     * The pagination token for next page of data.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for next page of data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for next page of data.
     * </p>
     * 
     * @return The pagination token for next page of data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for next page of data.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for next page of data.
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
