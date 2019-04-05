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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListBonusPayments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBonusPaymentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all
     * assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be
     * specified
     * </p>
     */
    private String hITId;
    /**
     * <p>
     * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for
     * the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
     * </p>
     */
    private String assignmentId;
    /**
     * <p>
     * Pagination token
     * </p>
     */
    private String nextToken;

    private Integer maxResults;

    /**
     * <p>
     * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all
     * assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be
     * specified
     * </p>
     * 
     * @param hITId
     *        The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for
     *        all assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter
     *        must be specified
     */

    public void setHITId(String hITId) {
        this.hITId = hITId;
    }

    /**
     * <p>
     * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all
     * assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be
     * specified
     * </p>
     * 
     * @return The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments
     *         for all assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId
     *         parameter must be specified
     */

    public String getHITId() {
        return this.hITId;
    }

    /**
     * <p>
     * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all
     * assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be
     * specified
     * </p>
     * 
     * @param hITId
     *        The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for
     *        all assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter
     *        must be specified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBonusPaymentsRequest withHITId(String hITId) {
        setHITId(hITId);
        return this;
    }

    /**
     * <p>
     * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for
     * the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments
     *        for the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be
     *        specified
     */

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for
     * the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
     * </p>
     * 
     * @return The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus
     *         payments for the given assignment are returned. Either the HITId parameter or the AssignmentId parameter
     *         must be specified
     */

    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for
     * the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments
     *        for the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be
     *        specified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBonusPaymentsRequest withAssignmentId(String assignmentId) {
        setAssignmentId(assignmentId);
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

    public ListBonusPaymentsRequest withNextToken(String nextToken) {
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

    public ListBonusPaymentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getAssignmentId() != null)
            sb.append("AssignmentId: ").append(getAssignmentId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBonusPaymentsRequest == false)
            return false;
        ListBonusPaymentsRequest other = (ListBonusPaymentsRequest) obj;
        if (other.getHITId() == null ^ this.getHITId() == null)
            return false;
        if (other.getHITId() != null && other.getHITId().equals(this.getHITId()) == false)
            return false;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHITId() == null) ? 0 : getHITId().hashCode());
        hashCode = prime * hashCode + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListBonusPaymentsRequest clone() {
        return (ListBonusPaymentsRequest) super.clone();
    }

}
