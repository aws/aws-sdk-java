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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssessmentControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     */
    private String controlSetId;
    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     */
    private String controlId;
    /**
     * <p>
     * The status of the specified control.
     * </p>
     */
    private String controlStatus;
    /**
     * <p>
     * The comment body text for the specified control.
     * </p>
     */
    private String commentBody;

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @return The identifier for the specified assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentControlRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the specified control set.
     */

    public void setControlSetId(String controlSetId) {
        this.controlSetId = controlSetId;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @return The identifier for the specified control set.
     */

    public String getControlSetId() {
        return this.controlSetId;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the specified control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentControlRequest withControlSetId(String controlSetId) {
        setControlSetId(controlSetId);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @param controlId
     *        The identifier for the specified control.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @return The identifier for the specified control.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @param controlId
     *        The identifier for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentControlRequest withControlId(String controlId) {
        setControlId(controlId);
        return this;
    }

    /**
     * <p>
     * The status of the specified control.
     * </p>
     * 
     * @param controlStatus
     *        The status of the specified control.
     * @see ControlStatus
     */

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
    }

    /**
     * <p>
     * The status of the specified control.
     * </p>
     * 
     * @return The status of the specified control.
     * @see ControlStatus
     */

    public String getControlStatus() {
        return this.controlStatus;
    }

    /**
     * <p>
     * The status of the specified control.
     * </p>
     * 
     * @param controlStatus
     *        The status of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public UpdateAssessmentControlRequest withControlStatus(String controlStatus) {
        setControlStatus(controlStatus);
        return this;
    }

    /**
     * <p>
     * The status of the specified control.
     * </p>
     * 
     * @param controlStatus
     *        The status of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public UpdateAssessmentControlRequest withControlStatus(ControlStatus controlStatus) {
        this.controlStatus = controlStatus.toString();
        return this;
    }

    /**
     * <p>
     * The comment body text for the specified control.
     * </p>
     * 
     * @param commentBody
     *        The comment body text for the specified control.
     */

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    /**
     * <p>
     * The comment body text for the specified control.
     * </p>
     * 
     * @return The comment body text for the specified control.
     */

    public String getCommentBody() {
        return this.commentBody;
    }

    /**
     * <p>
     * The comment body text for the specified control.
     * </p>
     * 
     * @param commentBody
     *        The comment body text for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentControlRequest withCommentBody(String commentBody) {
        setCommentBody(commentBody);
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
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId()).append(",");
        if (getControlSetId() != null)
            sb.append("ControlSetId: ").append(getControlSetId()).append(",");
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId()).append(",");
        if (getControlStatus() != null)
            sb.append("ControlStatus: ").append(getControlStatus()).append(",");
        if (getCommentBody() != null)
            sb.append("CommentBody: ").append(getCommentBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssessmentControlRequest == false)
            return false;
        UpdateAssessmentControlRequest other = (UpdateAssessmentControlRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getControlSetId() == null ^ this.getControlSetId() == null)
            return false;
        if (other.getControlSetId() != null && other.getControlSetId().equals(this.getControlSetId()) == false)
            return false;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
            return false;
        if (other.getControlStatus() == null ^ this.getControlStatus() == null)
            return false;
        if (other.getControlStatus() != null && other.getControlStatus().equals(this.getControlStatus()) == false)
            return false;
        if (other.getCommentBody() == null ^ this.getCommentBody() == null)
            return false;
        if (other.getCommentBody() != null && other.getCommentBody().equals(this.getCommentBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getControlSetId() == null) ? 0 : getControlSetId().hashCode());
        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getControlStatus() == null) ? 0 : getControlStatus().hashCode());
        hashCode = prime * hashCode + ((getCommentBody() == null) ? 0 : getCommentBody().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssessmentControlRequest clone() {
        return (UpdateAssessmentControlRequest) super.clone();
    }

}
