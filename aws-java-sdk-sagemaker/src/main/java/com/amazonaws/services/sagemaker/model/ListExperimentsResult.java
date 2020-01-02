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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListExperiments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExperimentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     */
    private java.util.List<ExperimentSummary> experimentSummaries;
    /**
     * <p>
     * A token for getting the next set of experiments, if there are any.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     * 
     * @return A list of the summaries of your experiments.
     */

    public java.util.List<ExperimentSummary> getExperimentSummaries() {
        return experimentSummaries;
    }

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     * 
     * @param experimentSummaries
     *        A list of the summaries of your experiments.
     */

    public void setExperimentSummaries(java.util.Collection<ExperimentSummary> experimentSummaries) {
        if (experimentSummaries == null) {
            this.experimentSummaries = null;
            return;
        }

        this.experimentSummaries = new java.util.ArrayList<ExperimentSummary>(experimentSummaries);
    }

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExperimentSummaries(java.util.Collection)} or {@link #withExperimentSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param experimentSummaries
     *        A list of the summaries of your experiments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentsResult withExperimentSummaries(ExperimentSummary... experimentSummaries) {
        if (this.experimentSummaries == null) {
            setExperimentSummaries(new java.util.ArrayList<ExperimentSummary>(experimentSummaries.length));
        }
        for (ExperimentSummary ele : experimentSummaries) {
            this.experimentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the summaries of your experiments.
     * </p>
     * 
     * @param experimentSummaries
     *        A list of the summaries of your experiments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentsResult withExperimentSummaries(java.util.Collection<ExperimentSummary> experimentSummaries) {
        setExperimentSummaries(experimentSummaries);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of experiments, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of experiments, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of experiments, if there are any.
     * </p>
     * 
     * @return A token for getting the next set of experiments, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of experiments, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of experiments, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentsResult withNextToken(String nextToken) {
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
        if (getExperimentSummaries() != null)
            sb.append("ExperimentSummaries: ").append(getExperimentSummaries()).append(",");
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

        if (obj instanceof ListExperimentsResult == false)
            return false;
        ListExperimentsResult other = (ListExperimentsResult) obj;
        if (other.getExperimentSummaries() == null ^ this.getExperimentSummaries() == null)
            return false;
        if (other.getExperimentSummaries() != null && other.getExperimentSummaries().equals(this.getExperimentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getExperimentSummaries() == null) ? 0 : getExperimentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExperimentsResult clone() {
        try {
            return (ListExperimentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
