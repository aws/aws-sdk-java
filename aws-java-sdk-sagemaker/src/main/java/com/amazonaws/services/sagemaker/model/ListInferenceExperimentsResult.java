/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListInferenceExperiments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceExperimentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of inference experiments.
     * </p>
     */
    private java.util.List<InferenceExperimentSummary> inferenceExperiments;
    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of inference experiments.
     * </p>
     * 
     * @return List of inference experiments.
     */

    public java.util.List<InferenceExperimentSummary> getInferenceExperiments() {
        return inferenceExperiments;
    }

    /**
     * <p>
     * List of inference experiments.
     * </p>
     * 
     * @param inferenceExperiments
     *        List of inference experiments.
     */

    public void setInferenceExperiments(java.util.Collection<InferenceExperimentSummary> inferenceExperiments) {
        if (inferenceExperiments == null) {
            this.inferenceExperiments = null;
            return;
        }

        this.inferenceExperiments = new java.util.ArrayList<InferenceExperimentSummary>(inferenceExperiments);
    }

    /**
     * <p>
     * List of inference experiments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceExperiments(java.util.Collection)} or {@link #withInferenceExperiments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inferenceExperiments
     *        List of inference experiments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsResult withInferenceExperiments(InferenceExperimentSummary... inferenceExperiments) {
        if (this.inferenceExperiments == null) {
            setInferenceExperiments(new java.util.ArrayList<InferenceExperimentSummary>(inferenceExperiments.length));
        }
        for (InferenceExperimentSummary ele : inferenceExperiments) {
            this.inferenceExperiments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of inference experiments.
     * </p>
     * 
     * @param inferenceExperiments
     *        List of inference experiments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsResult withInferenceExperiments(java.util.Collection<InferenceExperimentSummary> inferenceExperiments) {
        setInferenceExperiments(inferenceExperiments);
        return this;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use when calling the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @return The token to use when calling the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use when calling the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsResult withNextToken(String nextToken) {
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
        if (getInferenceExperiments() != null)
            sb.append("InferenceExperiments: ").append(getInferenceExperiments()).append(",");
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

        if (obj instanceof ListInferenceExperimentsResult == false)
            return false;
        ListInferenceExperimentsResult other = (ListInferenceExperimentsResult) obj;
        if (other.getInferenceExperiments() == null ^ this.getInferenceExperiments() == null)
            return false;
        if (other.getInferenceExperiments() != null && other.getInferenceExperiments().equals(this.getInferenceExperiments()) == false)
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

        hashCode = prime * hashCode + ((getInferenceExperiments() == null) ? 0 : getInferenceExperiments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceExperimentsResult clone() {
        try {
            return (ListInferenceExperimentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
