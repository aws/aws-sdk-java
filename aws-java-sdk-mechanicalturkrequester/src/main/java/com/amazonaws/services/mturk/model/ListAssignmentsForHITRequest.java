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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListAssignmentsForHIT"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssignmentsForHITRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the HIT.
     * </p>
     */
    private String hITId;
    /**
     * <p>
     * Pagination token
     * </p>
     */
    private String nextToken;

    private Integer maxResults;
    /**
     * <p>
     * The status of the assignments to return: Submitted | Approved | Rejected
     * </p>
     */
    private java.util.List<String> assignmentStatuses;

    /**
     * <p>
     * The ID of the HIT.
     * </p>
     * 
     * @param hITId
     *        The ID of the HIT.
     */

    public void setHITId(String hITId) {
        this.hITId = hITId;
    }

    /**
     * <p>
     * The ID of the HIT.
     * </p>
     * 
     * @return The ID of the HIT.
     */

    public String getHITId() {
        return this.hITId;
    }

    /**
     * <p>
     * The ID of the HIT.
     * </p>
     * 
     * @param hITId
     *        The ID of the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssignmentsForHITRequest withHITId(String hITId) {
        setHITId(hITId);
        return this;
    }

    /**
     * <p>
     * Pagination token
     * </p>
     * 
     * @param nextToken
     *        Pagination token
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token
     * </p>
     * 
     * @return Pagination token
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token
     * </p>
     * 
     * @param nextToken
     *        Pagination token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssignmentsForHITRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssignmentsForHITRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The status of the assignments to return: Submitted | Approved | Rejected
     * </p>
     * 
     * @return The status of the assignments to return: Submitted | Approved | Rejected
     * @see AssignmentStatus
     */

    public java.util.List<String> getAssignmentStatuses() {
        return assignmentStatuses;
    }

    /**
     * <p>
     * The status of the assignments to return: Submitted | Approved | Rejected
     * </p>
     * 
     * @param assignmentStatuses
     *        The status of the assignments to return: Submitted | Approved | Rejected
     * @see AssignmentStatus
     */

    public void setAssignmentStatuses(java.util.Collection<String> assignmentStatuses) {
        if (assignmentStatuses == null) {
            this.assignmentStatuses = null;
            return;
        }

        this.assignmentStatuses = new java.util.ArrayList<String>(assignmentStatuses);
    }

    /**
     * <p>
     * The status of the assignments to return: Submitted | Approved | Rejected
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssignmentStatuses(java.util.Collection)} or {@link #withAssignmentStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param assignmentStatuses
     *        The status of the assignments to return: Submitted | Approved | Rejected
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public ListAssignmentsForHITRequest withAssignmentStatuses(String... assignmentStatuses) {
        if (this.assignmentStatuses == null) {
            setAssignmentStatuses(new java.util.ArrayList<String>(assignmentStatuses.length));
        }
        for (String ele : assignmentStatuses) {
            this.assignmentStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the assignments to return: Submitted | Approved | Rejected
     * </p>
     * 
     * @param assignmentStatuses
     *        The status of the assignments to return: Submitted | Approved | Rejected
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public ListAssignmentsForHITRequest withAssignmentStatuses(java.util.Collection<String> assignmentStatuses) {
        setAssignmentStatuses(assignmentStatuses);
        return this;
    }

    /**
     * <p>
     * The status of the assignments to return: Submitted | Approved | Rejected
     * </p>
     * 
     * @param assignmentStatuses
     *        The status of the assignments to return: Submitted | Approved | Rejected
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public ListAssignmentsForHITRequest withAssignmentStatuses(AssignmentStatus... assignmentStatuses) {
        java.util.ArrayList<String> assignmentStatusesCopy = new java.util.ArrayList<String>(assignmentStatuses.length);
        for (AssignmentStatus value : assignmentStatuses) {
            assignmentStatusesCopy.add(value.toString());
        }
        if (getAssignmentStatuses() == null) {
            setAssignmentStatuses(assignmentStatusesCopy);
        } else {
            getAssignmentStatuses().addAll(assignmentStatusesCopy);
        }
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
        if (getHITId() != null)
            sb.append("HITId: ").append(getHITId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getAssignmentStatuses() != null)
            sb.append("AssignmentStatuses: ").append(getAssignmentStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssignmentsForHITRequest == false)
            return false;
        ListAssignmentsForHITRequest other = (ListAssignmentsForHITRequest) obj;
        if (other.getHITId() == null ^ this.getHITId() == null)
            return false;
        if (other.getHITId() != null && other.getHITId().equals(this.getHITId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAssignmentStatuses() == null ^ this.getAssignmentStatuses() == null)
            return false;
        if (other.getAssignmentStatuses() != null && other.getAssignmentStatuses().equals(this.getAssignmentStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHITId() == null) ? 0 : getHITId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAssignmentStatuses() == null) ? 0 : getAssignmentStatuses().hashCode());
        return hashCode;
    }

    @Override
    public ListAssignmentsForHITRequest clone() {
        return (ListAssignmentsForHITRequest) super.clone();
    }

}
