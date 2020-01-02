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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ListIAMPolicyAssignmentsForUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIAMPolicyAssignmentsForUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The active assignments for this user.
     * </p>
     */
    private java.util.List<ActiveIAMPolicyAssignment> activeAssignments;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The active assignments for this user.
     * </p>
     * 
     * @return The active assignments for this user.
     */

    public java.util.List<ActiveIAMPolicyAssignment> getActiveAssignments() {
        return activeAssignments;
    }

    /**
     * <p>
     * The active assignments for this user.
     * </p>
     * 
     * @param activeAssignments
     *        The active assignments for this user.
     */

    public void setActiveAssignments(java.util.Collection<ActiveIAMPolicyAssignment> activeAssignments) {
        if (activeAssignments == null) {
            this.activeAssignments = null;
            return;
        }

        this.activeAssignments = new java.util.ArrayList<ActiveIAMPolicyAssignment>(activeAssignments);
    }

    /**
     * <p>
     * The active assignments for this user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveAssignments(java.util.Collection)} or {@link #withActiveAssignments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param activeAssignments
     *        The active assignments for this user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIAMPolicyAssignmentsForUserResult withActiveAssignments(ActiveIAMPolicyAssignment... activeAssignments) {
        if (this.activeAssignments == null) {
            setActiveAssignments(new java.util.ArrayList<ActiveIAMPolicyAssignment>(activeAssignments.length));
        }
        for (ActiveIAMPolicyAssignment ele : activeAssignments) {
            this.activeAssignments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The active assignments for this user.
     * </p>
     * 
     * @param activeAssignments
     *        The active assignments for this user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIAMPolicyAssignmentsForUserResult withActiveAssignments(java.util.Collection<ActiveIAMPolicyAssignment> activeAssignments) {
        setActiveAssignments(activeAssignments);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIAMPolicyAssignmentsForUserResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIAMPolicyAssignmentsForUserResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIAMPolicyAssignmentsForUserResult withStatus(Integer status) {
        setStatus(status);
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
        if (getActiveAssignments() != null)
            sb.append("ActiveAssignments: ").append(getActiveAssignments()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIAMPolicyAssignmentsForUserResult == false)
            return false;
        ListIAMPolicyAssignmentsForUserResult other = (ListIAMPolicyAssignmentsForUserResult) obj;
        if (other.getActiveAssignments() == null ^ this.getActiveAssignments() == null)
            return false;
        if (other.getActiveAssignments() != null && other.getActiveAssignments().equals(this.getActiveAssignments()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveAssignments() == null) ? 0 : getActiveAssignments().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListIAMPolicyAssignmentsForUserResult clone() {
        try {
            return (ListIAMPolicyAssignmentsForUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
