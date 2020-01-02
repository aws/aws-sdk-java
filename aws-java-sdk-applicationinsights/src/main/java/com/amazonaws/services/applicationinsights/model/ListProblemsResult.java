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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListProblems" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProblemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of problems.
     * </p>
     */
    private java.util.List<Problem> problemList;
    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of problems.
     * </p>
     * 
     * @return The list of problems.
     */

    public java.util.List<Problem> getProblemList() {
        return problemList;
    }

    /**
     * <p>
     * The list of problems.
     * </p>
     * 
     * @param problemList
     *        The list of problems.
     */

    public void setProblemList(java.util.Collection<Problem> problemList) {
        if (problemList == null) {
            this.problemList = null;
            return;
        }

        this.problemList = new java.util.ArrayList<Problem>(problemList);
    }

    /**
     * <p>
     * The list of problems.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProblemList(java.util.Collection)} or {@link #withProblemList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param problemList
     *        The list of problems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProblemsResult withProblemList(Problem... problemList) {
        if (this.problemList == null) {
            setProblemList(new java.util.ArrayList<Problem>(problemList.length));
        }
        for (Problem ele : problemList) {
            this.problemList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of problems.
     * </p>
     * 
     * @param problemList
     *        The list of problems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProblemsResult withProblemList(java.util.Collection<Problem> problemList) {
        setProblemList(problemList);
        return this;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProblemsResult withNextToken(String nextToken) {
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
        if (getProblemList() != null)
            sb.append("ProblemList: ").append(getProblemList()).append(",");
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

        if (obj instanceof ListProblemsResult == false)
            return false;
        ListProblemsResult other = (ListProblemsResult) obj;
        if (other.getProblemList() == null ^ this.getProblemList() == null)
            return false;
        if (other.getProblemList() != null && other.getProblemList().equals(this.getProblemList()) == false)
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

        hashCode = prime * hashCode + ((getProblemList() == null) ? 0 : getProblemList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProblemsResult clone() {
        try {
            return (ListProblemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
