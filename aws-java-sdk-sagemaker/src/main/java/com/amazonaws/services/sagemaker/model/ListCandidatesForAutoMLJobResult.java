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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCandidatesForAutoMLJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCandidatesForAutoMLJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     */
    private java.util.List<AutoMLCandidate> candidates;
    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     * 
     * @return Summaries about the Candidates.
     */

    public java.util.List<AutoMLCandidate> getCandidates() {
        return candidates;
    }

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     * 
     * @param candidates
     *        Summaries about the Candidates.
     */

    public void setCandidates(java.util.Collection<AutoMLCandidate> candidates) {
        if (candidates == null) {
            this.candidates = null;
            return;
        }

        this.candidates = new java.util.ArrayList<AutoMLCandidate>(candidates);
    }

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCandidates(java.util.Collection)} or {@link #withCandidates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param candidates
     *        Summaries about the Candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCandidatesForAutoMLJobResult withCandidates(AutoMLCandidate... candidates) {
        if (this.candidates == null) {
            setCandidates(new java.util.ArrayList<AutoMLCandidate>(candidates.length));
        }
        for (AutoMLCandidate ele : candidates) {
            this.candidates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summaries about the Candidates.
     * </p>
     * 
     * @param candidates
     *        Summaries about the Candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCandidatesForAutoMLJobResult withCandidates(java.util.Collection<AutoMLCandidate> candidates) {
        setCandidates(candidates);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you will receive this token. Use it in your next request to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCandidatesForAutoMLJobResult withNextToken(String nextToken) {
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
        if (getCandidates() != null)
            sb.append("Candidates: ").append(getCandidates()).append(",");
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

        if (obj instanceof ListCandidatesForAutoMLJobResult == false)
            return false;
        ListCandidatesForAutoMLJobResult other = (ListCandidatesForAutoMLJobResult) obj;
        if (other.getCandidates() == null ^ this.getCandidates() == null)
            return false;
        if (other.getCandidates() != null && other.getCandidates().equals(this.getCandidates()) == false)
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

        hashCode = prime * hashCode + ((getCandidates() == null) ? 0 : getCandidates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCandidatesForAutoMLJobResult clone() {
        try {
            return (ListCandidatesForAutoMLJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
