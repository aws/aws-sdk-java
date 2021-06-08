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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineParametersForExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelineParametersForExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     */
    private java.util.List<Parameter> pipelineParameters;
    /**
     * <p>
     * If the result of the previous <code>ListPipelineParametersForExecution</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of parameters, use the token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     * 
     * @return Contains a list of pipeline parameters. This list can be empty.
     */

    public java.util.List<Parameter> getPipelineParameters() {
        return pipelineParameters;
    }

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     * 
     * @param pipelineParameters
     *        Contains a list of pipeline parameters. This list can be empty.
     */

    public void setPipelineParameters(java.util.Collection<Parameter> pipelineParameters) {
        if (pipelineParameters == null) {
            this.pipelineParameters = null;
            return;
        }

        this.pipelineParameters = new java.util.ArrayList<Parameter>(pipelineParameters);
    }

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineParameters(java.util.Collection)} or {@link #withPipelineParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pipelineParameters
     *        Contains a list of pipeline parameters. This list can be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineParametersForExecutionResult withPipelineParameters(Parameter... pipelineParameters) {
        if (this.pipelineParameters == null) {
            setPipelineParameters(new java.util.ArrayList<Parameter>(pipelineParameters.length));
        }
        for (Parameter ele : pipelineParameters) {
            this.pipelineParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     * 
     * @param pipelineParameters
     *        Contains a list of pipeline parameters. This list can be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineParametersForExecutionResult withPipelineParameters(java.util.Collection<Parameter> pipelineParameters) {
        setPipelineParameters(pipelineParameters);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineParametersForExecution</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of parameters, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelineParametersForExecution</code> request was truncated, the
     *        response includes a <code>NextToken</code>. To retrieve the next set of parameters, use the token in the
     *        next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineParametersForExecution</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of parameters, use the token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListPipelineParametersForExecution</code> request was truncated, the
     *         response includes a <code>NextToken</code>. To retrieve the next set of parameters, use the token in the
     *         next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineParametersForExecution</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of parameters, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelineParametersForExecution</code> request was truncated, the
     *        response includes a <code>NextToken</code>. To retrieve the next set of parameters, use the token in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineParametersForExecutionResult withNextToken(String nextToken) {
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
        if (getPipelineParameters() != null)
            sb.append("PipelineParameters: ").append(getPipelineParameters()).append(",");
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

        if (obj instanceof ListPipelineParametersForExecutionResult == false)
            return false;
        ListPipelineParametersForExecutionResult other = (ListPipelineParametersForExecutionResult) obj;
        if (other.getPipelineParameters() == null ^ this.getPipelineParameters() == null)
            return false;
        if (other.getPipelineParameters() != null && other.getPipelineParameters().equals(this.getPipelineParameters()) == false)
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

        hashCode = prime * hashCode + ((getPipelineParameters() == null) ? 0 : getPipelineParameters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelineParametersForExecutionResult clone() {
        try {
            return (ListPipelineParametersForExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
