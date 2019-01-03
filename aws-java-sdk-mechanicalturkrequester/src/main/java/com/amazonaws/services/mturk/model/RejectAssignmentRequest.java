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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/RejectAssignment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectAssignmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the assignment. The assignment must correspond to a HIT created by the Requester.
     * </p>
     */
    private String assignmentId;
    /**
     * <p>
     * A message for the Worker, which the Worker can see in the Status section of the web site.
     * </p>
     */
    private String requesterFeedback;

    /**
     * <p>
     * The ID of the assignment. The assignment must correspond to a HIT created by the Requester.
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment. The assignment must correspond to a HIT created by the Requester.
     */

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment. The assignment must correspond to a HIT created by the Requester.
     * </p>
     * 
     * @return The ID of the assignment. The assignment must correspond to a HIT created by the Requester.
     */

    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment. The assignment must correspond to a HIT created by the Requester.
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment. The assignment must correspond to a HIT created by the Requester.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectAssignmentRequest withAssignmentId(String assignmentId) {
        setAssignmentId(assignmentId);
        return this;
    }

    /**
     * <p>
     * A message for the Worker, which the Worker can see in the Status section of the web site.
     * </p>
     * 
     * @param requesterFeedback
     *        A message for the Worker, which the Worker can see in the Status section of the web site.
     */

    public void setRequesterFeedback(String requesterFeedback) {
        this.requesterFeedback = requesterFeedback;
    }

    /**
     * <p>
     * A message for the Worker, which the Worker can see in the Status section of the web site.
     * </p>
     * 
     * @return A message for the Worker, which the Worker can see in the Status section of the web site.
     */

    public String getRequesterFeedback() {
        return this.requesterFeedback;
    }

    /**
     * <p>
     * A message for the Worker, which the Worker can see in the Status section of the web site.
     * </p>
     * 
     * @param requesterFeedback
     *        A message for the Worker, which the Worker can see in the Status section of the web site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectAssignmentRequest withRequesterFeedback(String requesterFeedback) {
        setRequesterFeedback(requesterFeedback);
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
        if (getAssignmentId() != null)
            sb.append("AssignmentId: ").append(getAssignmentId()).append(",");
        if (getRequesterFeedback() != null)
            sb.append("RequesterFeedback: ").append(getRequesterFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectAssignmentRequest == false)
            return false;
        RejectAssignmentRequest other = (RejectAssignmentRequest) obj;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getRequesterFeedback() == null ^ this.getRequesterFeedback() == null)
            return false;
        if (other.getRequesterFeedback() != null && other.getRequesterFeedback().equals(this.getRequesterFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode + ((getRequesterFeedback() == null) ? 0 : getRequesterFeedback().hashCode());
        return hashCode;
    }

    @Override
    public RejectAssignmentRequest clone() {
        return (RejectAssignmentRequest) super.clone();
    }

}
