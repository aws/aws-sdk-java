/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactEvaluations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactEvaluationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides details about a list of contact evaluations belonging to an instance.
     * </p>
     */
    private java.util.List<EvaluationSummary> evaluationSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     */
    private String nextToken;

    /**
     * <p>
     * Provides details about a list of contact evaluations belonging to an instance.
     * </p>
     * 
     * @return Provides details about a list of contact evaluations belonging to an instance.
     */

    public java.util.List<EvaluationSummary> getEvaluationSummaryList() {
        return evaluationSummaryList;
    }

    /**
     * <p>
     * Provides details about a list of contact evaluations belonging to an instance.
     * </p>
     * 
     * @param evaluationSummaryList
     *        Provides details about a list of contact evaluations belonging to an instance.
     */

    public void setEvaluationSummaryList(java.util.Collection<EvaluationSummary> evaluationSummaryList) {
        if (evaluationSummaryList == null) {
            this.evaluationSummaryList = null;
            return;
        }

        this.evaluationSummaryList = new java.util.ArrayList<EvaluationSummary>(evaluationSummaryList);
    }

    /**
     * <p>
     * Provides details about a list of contact evaluations belonging to an instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluationSummaryList(java.util.Collection)} or
     * {@link #withEvaluationSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param evaluationSummaryList
     *        Provides details about a list of contact evaluations belonging to an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactEvaluationsResult withEvaluationSummaryList(EvaluationSummary... evaluationSummaryList) {
        if (this.evaluationSummaryList == null) {
            setEvaluationSummaryList(new java.util.ArrayList<EvaluationSummary>(evaluationSummaryList.length));
        }
        for (EvaluationSummary ele : evaluationSummaryList) {
            this.evaluationSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides details about a list of contact evaluations belonging to an instance.
     * </p>
     * 
     * @param evaluationSummaryList
     *        Provides details about a list of contact evaluations belonging to an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactEvaluationsResult withEvaluationSummaryList(java.util.Collection<EvaluationSummary> evaluationSummaryList) {
        setEvaluationSummaryList(evaluationSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.</p> <important>
     *        <p>
     *        This is always returned as null in the response.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     * 
     * @return If there are additional results, this is the token for the next set of results.</p> <important>
     *         <p>
     *         This is always returned as null in the response.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * <important>
     * <p>
     * This is always returned as null in the response.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.</p> <important>
     *        <p>
     *        This is always returned as null in the response.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactEvaluationsResult withNextToken(String nextToken) {
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
        if (getEvaluationSummaryList() != null)
            sb.append("EvaluationSummaryList: ").append(getEvaluationSummaryList()).append(",");
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

        if (obj instanceof ListContactEvaluationsResult == false)
            return false;
        ListContactEvaluationsResult other = (ListContactEvaluationsResult) obj;
        if (other.getEvaluationSummaryList() == null ^ this.getEvaluationSummaryList() == null)
            return false;
        if (other.getEvaluationSummaryList() != null && other.getEvaluationSummaryList().equals(this.getEvaluationSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getEvaluationSummaryList() == null) ? 0 : getEvaluationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactEvaluationsResult clone() {
        try {
            return (ListContactEvaluationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
