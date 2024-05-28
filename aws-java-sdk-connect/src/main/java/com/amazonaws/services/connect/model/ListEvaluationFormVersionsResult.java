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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListEvaluationFormVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEvaluationFormVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an instance.
     * </p>
     */
    private java.util.List<EvaluationFormVersionSummary> evaluationFormVersionSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an instance.
     * </p>
     * 
     * @return Provides details about a list of evaluation forms belonging to an instance.
     */

    public java.util.List<EvaluationFormVersionSummary> getEvaluationFormVersionSummaryList() {
        return evaluationFormVersionSummaryList;
    }

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an instance.
     * </p>
     * 
     * @param evaluationFormVersionSummaryList
     *        Provides details about a list of evaluation forms belonging to an instance.
     */

    public void setEvaluationFormVersionSummaryList(java.util.Collection<EvaluationFormVersionSummary> evaluationFormVersionSummaryList) {
        if (evaluationFormVersionSummaryList == null) {
            this.evaluationFormVersionSummaryList = null;
            return;
        }

        this.evaluationFormVersionSummaryList = new java.util.ArrayList<EvaluationFormVersionSummary>(evaluationFormVersionSummaryList);
    }

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluationFormVersionSummaryList(java.util.Collection)} or
     * {@link #withEvaluationFormVersionSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param evaluationFormVersionSummaryList
     *        Provides details about a list of evaluation forms belonging to an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationFormVersionsResult withEvaluationFormVersionSummaryList(EvaluationFormVersionSummary... evaluationFormVersionSummaryList) {
        if (this.evaluationFormVersionSummaryList == null) {
            setEvaluationFormVersionSummaryList(new java.util.ArrayList<EvaluationFormVersionSummary>(evaluationFormVersionSummaryList.length));
        }
        for (EvaluationFormVersionSummary ele : evaluationFormVersionSummaryList) {
            this.evaluationFormVersionSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an instance.
     * </p>
     * 
     * @param evaluationFormVersionSummaryList
     *        Provides details about a list of evaluation forms belonging to an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationFormVersionsResult withEvaluationFormVersionSummaryList(
            java.util.Collection<EvaluationFormVersionSummary> evaluationFormVersionSummaryList) {
        setEvaluationFormVersionSummaryList(evaluationFormVersionSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationFormVersionsResult withNextToken(String nextToken) {
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
        if (getEvaluationFormVersionSummaryList() != null)
            sb.append("EvaluationFormVersionSummaryList: ").append(getEvaluationFormVersionSummaryList()).append(",");
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

        if (obj instanceof ListEvaluationFormVersionsResult == false)
            return false;
        ListEvaluationFormVersionsResult other = (ListEvaluationFormVersionsResult) obj;
        if (other.getEvaluationFormVersionSummaryList() == null ^ this.getEvaluationFormVersionSummaryList() == null)
            return false;
        if (other.getEvaluationFormVersionSummaryList() != null
                && other.getEvaluationFormVersionSummaryList().equals(this.getEvaluationFormVersionSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getEvaluationFormVersionSummaryList() == null) ? 0 : getEvaluationFormVersionSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEvaluationFormVersionsResult clone() {
        try {
            return (ListEvaluationFormVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
