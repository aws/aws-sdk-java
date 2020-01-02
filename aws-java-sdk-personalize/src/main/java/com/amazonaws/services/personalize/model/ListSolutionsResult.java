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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     */
    private java.util.List<SolutionSummary> solutions;
    /**
     * <p>
     * A token for getting the next set of solutions (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     * 
     * @return A list of the current solutions.
     */

    public java.util.List<SolutionSummary> getSolutions() {
        return solutions;
    }

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     * 
     * @param solutions
     *        A list of the current solutions.
     */

    public void setSolutions(java.util.Collection<SolutionSummary> solutions) {
        if (solutions == null) {
            this.solutions = null;
            return;
        }

        this.solutions = new java.util.ArrayList<SolutionSummary>(solutions);
    }

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSolutions(java.util.Collection)} or {@link #withSolutions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param solutions
     *        A list of the current solutions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionsResult withSolutions(SolutionSummary... solutions) {
        if (this.solutions == null) {
            setSolutions(new java.util.ArrayList<SolutionSummary>(solutions.length));
        }
        for (SolutionSummary ele : solutions) {
            this.solutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the current solutions.
     * </p>
     * 
     * @param solutions
     *        A list of the current solutions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionsResult withSolutions(java.util.Collection<SolutionSummary> solutions) {
        setSolutions(solutions);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of solutions (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of solutions (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of solutions (if they exist).
     * </p>
     * 
     * @return A token for getting the next set of solutions (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of solutions (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of solutions (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionsResult withNextToken(String nextToken) {
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
        if (getSolutions() != null)
            sb.append("Solutions: ").append(getSolutions()).append(",");
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

        if (obj instanceof ListSolutionsResult == false)
            return false;
        ListSolutionsResult other = (ListSolutionsResult) obj;
        if (other.getSolutions() == null ^ this.getSolutions() == null)
            return false;
        if (other.getSolutions() != null && other.getSolutions().equals(this.getSolutions()) == false)
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

        hashCode = prime * hashCode + ((getSolutions() == null) ? 0 : getSolutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSolutionsResult clone() {
        try {
            return (ListSolutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
