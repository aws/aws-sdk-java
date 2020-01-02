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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrialComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrialComponentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     */
    private java.util.List<TrialComponentSummary> trialComponentSummaries;
    /**
     * <p>
     * A token for getting the next set of components, if there are any.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     * 
     * @return A list of the summaries of your trial components.
     */

    public java.util.List<TrialComponentSummary> getTrialComponentSummaries() {
        return trialComponentSummaries;
    }

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     * 
     * @param trialComponentSummaries
     *        A list of the summaries of your trial components.
     */

    public void setTrialComponentSummaries(java.util.Collection<TrialComponentSummary> trialComponentSummaries) {
        if (trialComponentSummaries == null) {
            this.trialComponentSummaries = null;
            return;
        }

        this.trialComponentSummaries = new java.util.ArrayList<TrialComponentSummary>(trialComponentSummaries);
    }

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrialComponentSummaries(java.util.Collection)} or
     * {@link #withTrialComponentSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trialComponentSummaries
     *        A list of the summaries of your trial components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsResult withTrialComponentSummaries(TrialComponentSummary... trialComponentSummaries) {
        if (this.trialComponentSummaries == null) {
            setTrialComponentSummaries(new java.util.ArrayList<TrialComponentSummary>(trialComponentSummaries.length));
        }
        for (TrialComponentSummary ele : trialComponentSummaries) {
            this.trialComponentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the summaries of your trial components.
     * </p>
     * 
     * @param trialComponentSummaries
     *        A list of the summaries of your trial components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsResult withTrialComponentSummaries(java.util.Collection<TrialComponentSummary> trialComponentSummaries) {
        setTrialComponentSummaries(trialComponentSummaries);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of components, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of components, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of components, if there are any.
     * </p>
     * 
     * @return A token for getting the next set of components, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of components, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of components, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsResult withNextToken(String nextToken) {
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
        if (getTrialComponentSummaries() != null)
            sb.append("TrialComponentSummaries: ").append(getTrialComponentSummaries()).append(",");
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

        if (obj instanceof ListTrialComponentsResult == false)
            return false;
        ListTrialComponentsResult other = (ListTrialComponentsResult) obj;
        if (other.getTrialComponentSummaries() == null ^ this.getTrialComponentSummaries() == null)
            return false;
        if (other.getTrialComponentSummaries() != null && other.getTrialComponentSummaries().equals(this.getTrialComponentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTrialComponentSummaries() == null) ? 0 : getTrialComponentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrialComponentsResult clone() {
        try {
            return (ListTrialComponentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
