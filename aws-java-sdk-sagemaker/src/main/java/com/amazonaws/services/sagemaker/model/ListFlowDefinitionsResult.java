/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFlowDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlowDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     */
    private java.util.List<FlowDefinitionSummary> flowDefinitionSummaries;
    /**
     * <p>
     * A token to resume pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     * 
     * @return An array of objects describing the flow definitions.
     */

    public java.util.List<FlowDefinitionSummary> getFlowDefinitionSummaries() {
        return flowDefinitionSummaries;
    }

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     * 
     * @param flowDefinitionSummaries
     *        An array of objects describing the flow definitions.
     */

    public void setFlowDefinitionSummaries(java.util.Collection<FlowDefinitionSummary> flowDefinitionSummaries) {
        if (flowDefinitionSummaries == null) {
            this.flowDefinitionSummaries = null;
            return;
        }

        this.flowDefinitionSummaries = new java.util.ArrayList<FlowDefinitionSummary>(flowDefinitionSummaries);
    }

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFlowDefinitionSummaries(java.util.Collection)} or
     * {@link #withFlowDefinitionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param flowDefinitionSummaries
     *        An array of objects describing the flow definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowDefinitionsResult withFlowDefinitionSummaries(FlowDefinitionSummary... flowDefinitionSummaries) {
        if (this.flowDefinitionSummaries == null) {
            setFlowDefinitionSummaries(new java.util.ArrayList<FlowDefinitionSummary>(flowDefinitionSummaries.length));
        }
        for (FlowDefinitionSummary ele : flowDefinitionSummaries) {
            this.flowDefinitionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects describing the flow definitions.
     * </p>
     * 
     * @param flowDefinitionSummaries
     *        An array of objects describing the flow definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowDefinitionsResult withFlowDefinitionSummaries(java.util.Collection<FlowDefinitionSummary> flowDefinitionSummaries) {
        setFlowDefinitionSummaries(flowDefinitionSummaries);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @return A token to resume pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowDefinitionsResult withNextToken(String nextToken) {
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
        if (getFlowDefinitionSummaries() != null)
            sb.append("FlowDefinitionSummaries: ").append(getFlowDefinitionSummaries()).append(",");
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

        if (obj instanceof ListFlowDefinitionsResult == false)
            return false;
        ListFlowDefinitionsResult other = (ListFlowDefinitionsResult) obj;
        if (other.getFlowDefinitionSummaries() == null ^ this.getFlowDefinitionSummaries() == null)
            return false;
        if (other.getFlowDefinitionSummaries() != null && other.getFlowDefinitionSummaries().equals(this.getFlowDefinitionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getFlowDefinitionSummaries() == null) ? 0 : getFlowDefinitionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFlowDefinitionsResult clone() {
        try {
            return (ListFlowDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
