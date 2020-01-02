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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFindingsFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector associated with the findings to update feedback for.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * IDs of the findings that you want to mark as useful or not useful.
     * </p>
     */
    private java.util.List<String> findingIds;
    /**
     * <p>
     * The feedback for the finding.
     * </p>
     */
    private String feedback;
    /**
     * <p>
     * Additional feedback about the GuardDuty findings.
     * </p>
     */
    private String comments;

    /**
     * <p>
     * The ID of the detector associated with the findings to update feedback for.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector associated with the findings to update feedback for.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector associated with the findings to update feedback for.
     * </p>
     * 
     * @return The ID of the detector associated with the findings to update feedback for.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector associated with the findings to update feedback for.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector associated with the findings to update feedback for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsFeedbackRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * IDs of the findings that you want to mark as useful or not useful.
     * </p>
     * 
     * @return IDs of the findings that you want to mark as useful or not useful.
     */

    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * IDs of the findings that you want to mark as useful or not useful.
     * </p>
     * 
     * @param findingIds
     *        IDs of the findings that you want to mark as useful or not useful.
     */

    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * IDs of the findings that you want to mark as useful or not useful.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingIds(java.util.Collection)} or {@link #withFindingIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingIds
     *        IDs of the findings that you want to mark as useful or not useful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsFeedbackRequest withFindingIds(String... findingIds) {
        if (this.findingIds == null) {
            setFindingIds(new java.util.ArrayList<String>(findingIds.length));
        }
        for (String ele : findingIds) {
            this.findingIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IDs of the findings that you want to mark as useful or not useful.
     * </p>
     * 
     * @param findingIds
     *        IDs of the findings that you want to mark as useful or not useful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsFeedbackRequest withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
        return this;
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * 
     * @param feedback
     *        The feedback for the finding.
     * @see Feedback
     */

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * 
     * @return The feedback for the finding.
     * @see Feedback
     */

    public String getFeedback() {
        return this.feedback;
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * 
     * @param feedback
     *        The feedback for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Feedback
     */

    public UpdateFindingsFeedbackRequest withFeedback(String feedback) {
        setFeedback(feedback);
        return this;
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * 
     * @param feedback
     *        The feedback for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Feedback
     */

    public UpdateFindingsFeedbackRequest withFeedback(Feedback feedback) {
        this.feedback = feedback.toString();
        return this;
    }

    /**
     * <p>
     * Additional feedback about the GuardDuty findings.
     * </p>
     * 
     * @param comments
     *        Additional feedback about the GuardDuty findings.
     */

    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * <p>
     * Additional feedback about the GuardDuty findings.
     * </p>
     * 
     * @return Additional feedback about the GuardDuty findings.
     */

    public String getComments() {
        return this.comments;
    }

    /**
     * <p>
     * Additional feedback about the GuardDuty findings.
     * </p>
     * 
     * @param comments
     *        Additional feedback about the GuardDuty findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFindingsFeedbackRequest withComments(String comments) {
        setComments(comments);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getFindingIds() != null)
            sb.append("FindingIds: ").append(getFindingIds()).append(",");
        if (getFeedback() != null)
            sb.append("Feedback: ").append(getFeedback()).append(",");
        if (getComments() != null)
            sb.append("Comments: ").append(getComments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFindingsFeedbackRequest == false)
            return false;
        UpdateFindingsFeedbackRequest other = (UpdateFindingsFeedbackRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        if (other.getFeedback() == null ^ this.getFeedback() == null)
            return false;
        if (other.getFeedback() != null && other.getFeedback().equals(this.getFeedback()) == false)
            return false;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFindingsFeedbackRequest clone() {
        return (UpdateFindingsFeedbackRequest) super.clone();
    }

}
