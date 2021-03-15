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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ListExperiments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExperimentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The experiments.
     * </p>
     */
    private java.util.List<ExperimentSummary> experiments;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The experiments.
     * </p>
     * 
     * @return The experiments.
     */

    public java.util.List<ExperimentSummary> getExperiments() {
        return experiments;
    }

    /**
     * <p>
     * The experiments.
     * </p>
     * 
     * @param experiments
     *        The experiments.
     */

    public void setExperiments(java.util.Collection<ExperimentSummary> experiments) {
        if (experiments == null) {
            this.experiments = null;
            return;
        }

        this.experiments = new java.util.ArrayList<ExperimentSummary>(experiments);
    }

    /**
     * <p>
     * The experiments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExperiments(java.util.Collection)} or {@link #withExperiments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param experiments
     *        The experiments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentsResult withExperiments(ExperimentSummary... experiments) {
        if (this.experiments == null) {
            setExperiments(new java.util.ArrayList<ExperimentSummary>(experiments.length));
        }
        for (ExperimentSummary ele : experiments) {
            this.experiments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The experiments.
     * </p>
     * 
     * @param experiments
     *        The experiments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperimentsResult withExperiments(java.util.Collection<ExperimentSummary> experiments) {
        setExperiments(experiments);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
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
        if (getExperiments() != null)
            sb.append("Experiments: ").append(getExperiments()).append(",");
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
        if (other.getExperiments() == null ^ this.getExperiments() == null)
            return false;
        if (other.getExperiments() != null && other.getExperiments().equals(this.getExperiments()) == false)
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

        hashCode = prime * hashCode + ((getExperiments() == null) ? 0 : getExperiments().hashCode());
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
