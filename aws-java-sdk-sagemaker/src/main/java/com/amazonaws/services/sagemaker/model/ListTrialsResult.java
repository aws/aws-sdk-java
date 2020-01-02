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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     */
    private java.util.List<TrialSummary> trialSummaries;
    /**
     * <p>
     * A token for getting the next set of trials, if there are any.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     * 
     * @return A list of the summaries of your trials.
     */

    public java.util.List<TrialSummary> getTrialSummaries() {
        return trialSummaries;
    }

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     * 
     * @param trialSummaries
     *        A list of the summaries of your trials.
     */

    public void setTrialSummaries(java.util.Collection<TrialSummary> trialSummaries) {
        if (trialSummaries == null) {
            this.trialSummaries = null;
            return;
        }

        this.trialSummaries = new java.util.ArrayList<TrialSummary>(trialSummaries);
    }

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrialSummaries(java.util.Collection)} or {@link #withTrialSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param trialSummaries
     *        A list of the summaries of your trials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsResult withTrialSummaries(TrialSummary... trialSummaries) {
        if (this.trialSummaries == null) {
            setTrialSummaries(new java.util.ArrayList<TrialSummary>(trialSummaries.length));
        }
        for (TrialSummary ele : trialSummaries) {
            this.trialSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the summaries of your trials.
     * </p>
     * 
     * @param trialSummaries
     *        A list of the summaries of your trials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsResult withTrialSummaries(java.util.Collection<TrialSummary> trialSummaries) {
        setTrialSummaries(trialSummaries);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of trials, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of trials, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of trials, if there are any.
     * </p>
     * 
     * @return A token for getting the next set of trials, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of trials, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of trials, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsResult withNextToken(String nextToken) {
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
        if (getTrialSummaries() != null)
            sb.append("TrialSummaries: ").append(getTrialSummaries()).append(",");
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

        if (obj instanceof ListTrialsResult == false)
            return false;
        ListTrialsResult other = (ListTrialsResult) obj;
        if (other.getTrialSummaries() == null ^ this.getTrialSummaries() == null)
            return false;
        if (other.getTrialSummaries() != null && other.getTrialSummaries().equals(this.getTrialSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTrialSummaries() == null) ? 0 : getTrialSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrialsResult clone() {
        try {
            return (ListTrialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
