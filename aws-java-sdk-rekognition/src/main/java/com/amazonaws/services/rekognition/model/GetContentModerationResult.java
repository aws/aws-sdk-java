/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContentModerationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the content moderation job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page
     * of paginated responses from <code>GetContentModeration</code>.
     * </p>
     */
    private VideoMetadata videoMetadata;
    /**
     * <p>
     * The detected moderation labels and the time(s) they were detected.
     * </p>
     */
    private java.util.List<ContentModerationDetection> moderationLabels;
    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of moderation labels.
     * </p>
     */
    private String nextToken;

    private Integer billableDurationSeconds;

    private String errorCode;

    private java.util.List<Warning> warnings;

    /**
     * <p>
     * The current status of the content moderation job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the content moderation job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the content moderation job.
     * </p>
     * 
     * @return The current status of the content moderation job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the content moderation job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the content moderation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetContentModerationResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the content moderation job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the content moderation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetContentModerationResult withJobStatus(VideoJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     * 
     * @param statusMessage
     *        If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     * 
     * @return If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     * 
     * @param statusMessage
     *        If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page
     * of paginated responses from <code>GetContentModeration</code>.
     * </p>
     * 
     * @param videoMetadata
     *        Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in
     *        every page of paginated responses from <code>GetContentModeration</code>.
     */

    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page
     * of paginated responses from <code>GetContentModeration</code>.
     * </p>
     * 
     * @return Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in
     *         every page of paginated responses from <code>GetContentModeration</code>.
     */

    public VideoMetadata getVideoMetadata() {
        return this.videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page
     * of paginated responses from <code>GetContentModeration</code>.
     * </p>
     * 
     * @param videoMetadata
     *        Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in
     *        every page of paginated responses from <code>GetContentModeration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withVideoMetadata(VideoMetadata videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * The detected moderation labels and the time(s) they were detected.
     * </p>
     * 
     * @return The detected moderation labels and the time(s) they were detected.
     */

    public java.util.List<ContentModerationDetection> getModerationLabels() {
        return moderationLabels;
    }

    /**
     * <p>
     * The detected moderation labels and the time(s) they were detected.
     * </p>
     * 
     * @param moderationLabels
     *        The detected moderation labels and the time(s) they were detected.
     */

    public void setModerationLabels(java.util.Collection<ContentModerationDetection> moderationLabels) {
        if (moderationLabels == null) {
            this.moderationLabels = null;
            return;
        }

        this.moderationLabels = new java.util.ArrayList<ContentModerationDetection>(moderationLabels);
    }

    /**
     * <p>
     * The detected moderation labels and the time(s) they were detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModerationLabels(java.util.Collection)} or {@link #withModerationLabels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param moderationLabels
     *        The detected moderation labels and the time(s) they were detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withModerationLabels(ContentModerationDetection... moderationLabels) {
        if (this.moderationLabels == null) {
            setModerationLabels(new java.util.ArrayList<ContentModerationDetection>(moderationLabels.length));
        }
        for (ContentModerationDetection ele : moderationLabels) {
            this.moderationLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The detected moderation labels and the time(s) they were detected.
     * </p>
     * 
     * @param moderationLabels
     *        The detected moderation labels and the time(s) they were detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withModerationLabels(java.util.Collection<ContentModerationDetection> moderationLabels) {
        setModerationLabels(moderationLabels);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of moderation labels.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of moderation labels.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of moderation labels.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *         subsequent request to retrieve the next set of moderation labels.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of moderation labels.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of moderation labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param billableDurationSeconds
     */

    public void setBillableDurationSeconds(Integer billableDurationSeconds) {
        this.billableDurationSeconds = billableDurationSeconds;
    }

    /**
     * @return
     */

    public Integer getBillableDurationSeconds() {
        return this.billableDurationSeconds;
    }

    /**
     * @param billableDurationSeconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withBillableDurationSeconds(Integer billableDurationSeconds) {
        setBillableDurationSeconds(billableDurationSeconds);
        return this;
    }

    /**
     * @param errorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Warning> getWarnings() {
        return warnings;
    }

    /**
     * @param warnings
     */

    public void setWarnings(java.util.Collection<Warning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<Warning>(warnings);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withWarnings(Warning... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<Warning>(warnings.length));
        }
        for (Warning ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * @param warnings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withWarnings(java.util.Collection<Warning> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getVideoMetadata() != null)
            sb.append("VideoMetadata: ").append(getVideoMetadata()).append(",");
        if (getModerationLabels() != null)
            sb.append("ModerationLabels: ").append(getModerationLabels()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getBillableDurationSeconds() != null)
            sb.append("BillableDurationSeconds: ").append(getBillableDurationSeconds()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContentModerationResult == false)
            return false;
        GetContentModerationResult other = (GetContentModerationResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getVideoMetadata() == null ^ this.getVideoMetadata() == null)
            return false;
        if (other.getVideoMetadata() != null && other.getVideoMetadata().equals(this.getVideoMetadata()) == false)
            return false;
        if (other.getModerationLabels() == null ^ this.getModerationLabels() == null)
            return false;
        if (other.getModerationLabels() != null && other.getModerationLabels().equals(this.getModerationLabels()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBillableDurationSeconds() == null ^ this.getBillableDurationSeconds() == null)
            return false;
        if (other.getBillableDurationSeconds() != null && other.getBillableDurationSeconds().equals(this.getBillableDurationSeconds()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getVideoMetadata() == null) ? 0 : getVideoMetadata().hashCode());
        hashCode = prime * hashCode + ((getModerationLabels() == null) ? 0 : getModerationLabels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBillableDurationSeconds() == null) ? 0 : getBillableDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public GetContentModerationResult clone() {
        try {
            return (GetContentModerationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
