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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListReviewPolicyResultsForHIT"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReviewPolicyResultsForHITResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The HITId of the HIT for which results have been returned.
     * </p>
     */
    private String hITId;
    /**
     * <p>
     * The name of the Assignment-level Review Policy. This contains only the PolicyName element.
     * </p>
     */
    private ReviewPolicy assignmentReviewPolicy;
    /**
     * <p>
     * The name of the HIT-level Review Policy. This contains only the PolicyName element.
     * </p>
     */
    private ReviewPolicy hITReviewPolicy;
    /**
     * <p>
     * Contains both ReviewResult and ReviewAction elements for an Assignment.
     * </p>
     */
    private ReviewReport assignmentReviewReport;
    /**
     * <p>
     * Contains both ReviewResult and ReviewAction elements for a particular HIT.
     * </p>
     */
    private ReviewReport hITReviewReport;

    private String nextToken;

    /**
     * <p>
     * The HITId of the HIT for which results have been returned.
     * </p>
     * 
     * @param hITId
     *        The HITId of the HIT for which results have been returned.
     */

    public void setHITId(String hITId) {
        this.hITId = hITId;
    }

    /**
     * <p>
     * The HITId of the HIT for which results have been returned.
     * </p>
     * 
     * @return The HITId of the HIT for which results have been returned.
     */

    public String getHITId() {
        return this.hITId;
    }

    /**
     * <p>
     * The HITId of the HIT for which results have been returned.
     * </p>
     * 
     * @param hITId
     *        The HITId of the HIT for which results have been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITResult withHITId(String hITId) {
        setHITId(hITId);
        return this;
    }

    /**
     * <p>
     * The name of the Assignment-level Review Policy. This contains only the PolicyName element.
     * </p>
     * 
     * @param assignmentReviewPolicy
     *        The name of the Assignment-level Review Policy. This contains only the PolicyName element.
     */

    public void setAssignmentReviewPolicy(ReviewPolicy assignmentReviewPolicy) {
        this.assignmentReviewPolicy = assignmentReviewPolicy;
    }

    /**
     * <p>
     * The name of the Assignment-level Review Policy. This contains only the PolicyName element.
     * </p>
     * 
     * @return The name of the Assignment-level Review Policy. This contains only the PolicyName element.
     */

    public ReviewPolicy getAssignmentReviewPolicy() {
        return this.assignmentReviewPolicy;
    }

    /**
     * <p>
     * The name of the Assignment-level Review Policy. This contains only the PolicyName element.
     * </p>
     * 
     * @param assignmentReviewPolicy
     *        The name of the Assignment-level Review Policy. This contains only the PolicyName element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITResult withAssignmentReviewPolicy(ReviewPolicy assignmentReviewPolicy) {
        setAssignmentReviewPolicy(assignmentReviewPolicy);
        return this;
    }

    /**
     * <p>
     * The name of the HIT-level Review Policy. This contains only the PolicyName element.
     * </p>
     * 
     * @param hITReviewPolicy
     *        The name of the HIT-level Review Policy. This contains only the PolicyName element.
     */

    public void setHITReviewPolicy(ReviewPolicy hITReviewPolicy) {
        this.hITReviewPolicy = hITReviewPolicy;
    }

    /**
     * <p>
     * The name of the HIT-level Review Policy. This contains only the PolicyName element.
     * </p>
     * 
     * @return The name of the HIT-level Review Policy. This contains only the PolicyName element.
     */

    public ReviewPolicy getHITReviewPolicy() {
        return this.hITReviewPolicy;
    }

    /**
     * <p>
     * The name of the HIT-level Review Policy. This contains only the PolicyName element.
     * </p>
     * 
     * @param hITReviewPolicy
     *        The name of the HIT-level Review Policy. This contains only the PolicyName element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITResult withHITReviewPolicy(ReviewPolicy hITReviewPolicy) {
        setHITReviewPolicy(hITReviewPolicy);
        return this;
    }

    /**
     * <p>
     * Contains both ReviewResult and ReviewAction elements for an Assignment.
     * </p>
     * 
     * @param assignmentReviewReport
     *        Contains both ReviewResult and ReviewAction elements for an Assignment.
     */

    public void setAssignmentReviewReport(ReviewReport assignmentReviewReport) {
        this.assignmentReviewReport = assignmentReviewReport;
    }

    /**
     * <p>
     * Contains both ReviewResult and ReviewAction elements for an Assignment.
     * </p>
     * 
     * @return Contains both ReviewResult and ReviewAction elements for an Assignment.
     */

    public ReviewReport getAssignmentReviewReport() {
        return this.assignmentReviewReport;
    }

    /**
     * <p>
     * Contains both ReviewResult and ReviewAction elements for an Assignment.
     * </p>
     * 
     * @param assignmentReviewReport
     *        Contains both ReviewResult and ReviewAction elements for an Assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITResult withAssignmentReviewReport(ReviewReport assignmentReviewReport) {
        setAssignmentReviewReport(assignmentReviewReport);
        return this;
    }

    /**
     * <p>
     * Contains both ReviewResult and ReviewAction elements for a particular HIT.
     * </p>
     * 
     * @param hITReviewReport
     *        Contains both ReviewResult and ReviewAction elements for a particular HIT.
     */

    public void setHITReviewReport(ReviewReport hITReviewReport) {
        this.hITReviewReport = hITReviewReport;
    }

    /**
     * <p>
     * Contains both ReviewResult and ReviewAction elements for a particular HIT.
     * </p>
     * 
     * @return Contains both ReviewResult and ReviewAction elements for a particular HIT.
     */

    public ReviewReport getHITReviewReport() {
        return this.hITReviewReport;
    }

    /**
     * <p>
     * Contains both ReviewResult and ReviewAction elements for a particular HIT.
     * </p>
     * 
     * @param hITReviewReport
     *        Contains both ReviewResult and ReviewAction elements for a particular HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITResult withHITReviewReport(ReviewReport hITReviewReport) {
        setHITReviewReport(hITReviewReport);
        return this;
    }

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

    public ListReviewPolicyResultsForHITResult withNextToken(String nextToken) {
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
        if (getHITId() != null)
            sb.append("HITId: ").append(getHITId()).append(",");
        if (getAssignmentReviewPolicy() != null)
            sb.append("AssignmentReviewPolicy: ").append(getAssignmentReviewPolicy()).append(",");
        if (getHITReviewPolicy() != null)
            sb.append("HITReviewPolicy: ").append(getHITReviewPolicy()).append(",");
        if (getAssignmentReviewReport() != null)
            sb.append("AssignmentReviewReport: ").append(getAssignmentReviewReport()).append(",");
        if (getHITReviewReport() != null)
            sb.append("HITReviewReport: ").append(getHITReviewReport()).append(",");
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

        if (obj instanceof ListReviewPolicyResultsForHITResult == false)
            return false;
        ListReviewPolicyResultsForHITResult other = (ListReviewPolicyResultsForHITResult) obj;
        if (other.getHITId() == null ^ this.getHITId() == null)
            return false;
        if (other.getHITId() != null && other.getHITId().equals(this.getHITId()) == false)
            return false;
        if (other.getAssignmentReviewPolicy() == null ^ this.getAssignmentReviewPolicy() == null)
            return false;
        if (other.getAssignmentReviewPolicy() != null && other.getAssignmentReviewPolicy().equals(this.getAssignmentReviewPolicy()) == false)
            return false;
        if (other.getHITReviewPolicy() == null ^ this.getHITReviewPolicy() == null)
            return false;
        if (other.getHITReviewPolicy() != null && other.getHITReviewPolicy().equals(this.getHITReviewPolicy()) == false)
            return false;
        if (other.getAssignmentReviewReport() == null ^ this.getAssignmentReviewReport() == null)
            return false;
        if (other.getAssignmentReviewReport() != null && other.getAssignmentReviewReport().equals(this.getAssignmentReviewReport()) == false)
            return false;
        if (other.getHITReviewReport() == null ^ this.getHITReviewReport() == null)
            return false;
        if (other.getHITReviewReport() != null && other.getHITReviewReport().equals(this.getHITReviewReport()) == false)
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

        hashCode = prime * hashCode + ((getHITId() == null) ? 0 : getHITId().hashCode());
        hashCode = prime * hashCode + ((getAssignmentReviewPolicy() == null) ? 0 : getAssignmentReviewPolicy().hashCode());
        hashCode = prime * hashCode + ((getHITReviewPolicy() == null) ? 0 : getHITReviewPolicy().hashCode());
        hashCode = prime * hashCode + ((getAssignmentReviewReport() == null) ? 0 : getAssignmentReviewReport().hashCode());
        hashCode = prime * hashCode + ((getHITReviewReport() == null) ? 0 : getHITReviewReport().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReviewPolicyResultsForHITResult clone() {
        try {
            return (ListReviewPolicyResultsForHITResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
