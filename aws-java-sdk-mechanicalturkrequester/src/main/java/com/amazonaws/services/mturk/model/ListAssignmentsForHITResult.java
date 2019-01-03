/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListAssignmentsForHIT"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssignmentsForHITResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String nextToken;
    /**
     * <p>
     * The number of assignments on the page in the filtered results list, equivalent to the number of assignments
     * returned by this call.
     * </p>
     */
    private Integer numResults;
    /**
     * <p>
     * The collection of Assignment data structures returned by this call.
     * </p>
     */
    private java.util.List<Assignment> assignments;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssignmentsForHITResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of assignments on the page in the filtered results list, equivalent to the number of assignments
     * returned by this call.
     * </p>
     * 
     * @param numResults
     *        The number of assignments on the page in the filtered results list, equivalent to the number of
     *        assignments returned by this call.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of assignments on the page in the filtered results list, equivalent to the number of assignments
     * returned by this call.
     * </p>
     * 
     * @return The number of assignments on the page in the filtered results list, equivalent to the number of
     *         assignments returned by this call.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of assignments on the page in the filtered results list, equivalent to the number of assignments
     * returned by this call.
     * </p>
     * 
     * @param numResults
     *        The number of assignments on the page in the filtered results list, equivalent to the number of
     *        assignments returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssignmentsForHITResult withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

    /**
     * <p>
     * The collection of Assignment data structures returned by this call.
     * </p>
     * 
     * @return The collection of Assignment data structures returned by this call.
     */

    public java.util.List<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * <p>
     * The collection of Assignment data structures returned by this call.
     * </p>
     * 
     * @param assignments
     *        The collection of Assignment data structures returned by this call.
     */

    public void setAssignments(java.util.Collection<Assignment> assignments) {
        if (assignments == null) {
            this.assignments = null;
            return;
        }

        this.assignments = new java.util.ArrayList<Assignment>(assignments);
    }

    /**
     * <p>
     * The collection of Assignment data structures returned by this call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssignments(java.util.Collection)} or {@link #withAssignments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param assignments
     *        The collection of Assignment data structures returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssignmentsForHITResult withAssignments(Assignment... assignments) {
        if (this.assignments == null) {
            setAssignments(new java.util.ArrayList<Assignment>(assignments.length));
        }
        for (Assignment ele : assignments) {
            this.assignments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of Assignment data structures returned by this call.
     * </p>
     * 
     * @param assignments
     *        The collection of Assignment data structures returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssignmentsForHITResult withAssignments(java.util.Collection<Assignment> assignments) {
        setAssignments(assignments);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getAssignments() != null)
            sb.append("Assignments: ").append(getAssignments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssignmentsForHITResult == false)
            return false;
        ListAssignmentsForHITResult other = (ListAssignmentsForHITResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getAssignments() == null ^ this.getAssignments() == null)
            return false;
        if (other.getAssignments() != null && other.getAssignments().equals(this.getAssignments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getAssignments() == null) ? 0 : getAssignments().hashCode());
        return hashCode;
    }

    @Override
    public ListAssignmentsForHITResult clone() {
        try {
            return (ListAssignmentsForHITResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
