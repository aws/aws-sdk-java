/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The current status of the content moderation analysis job.
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
     * The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were detected.
     * </p>
     */
    private java.util.List<ContentModerationDetection> moderationLabels;
    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of content moderation labels.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Version number of the moderation detection model that was used to detect inappropriate, unwanted, or offensive
     * content.
     * </p>
     */
    private String moderationModelVersion;
    /**
     * <p>
     * Job identifier for the content moderation operation for which you want to obtain results. The job identifer is
     * returned by an initial call to StartContentModeration.
     * </p>
     */
    private String jobId;

    private Video video;
    /**
     * <p>
     * A job identifier specified in the call to StartContentModeration and returned in the job completion notification
     * sent to your Amazon Simple Notification Service topic.
     * </p>
     */
    private String jobTag;
    /**
     * <p>
     * Information about the paramters used when getting a response. Includes information on aggregation and sorting
     * methods.
     * </p>
     */
    private GetContentModerationRequestMetadata getRequestMetadata;

    /**
     * <p>
     * The current status of the content moderation analysis job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the content moderation analysis job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the content moderation analysis job.
     * </p>
     * 
     * @return The current status of the content moderation analysis job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the content moderation analysis job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the content moderation analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetContentModerationResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the content moderation analysis job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the content moderation analysis job.
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
     * The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were detected.
     * </p>
     * 
     * @return The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were
     *         detected.
     */

    public java.util.List<ContentModerationDetection> getModerationLabels() {
        return moderationLabels;
    }

    /**
     * <p>
     * The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were detected.
     * </p>
     * 
     * @param moderationLabels
     *        The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were
     *        detected.
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
     * The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModerationLabels(java.util.Collection)} or {@link #withModerationLabels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param moderationLabels
     *        The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were
     *        detected.
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
     * The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were detected.
     * </p>
     * 
     * @param moderationLabels
     *        The detected inappropriate, unwanted, or offensive content moderation labels and the time(s) they were
     *        detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withModerationLabels(java.util.Collection<ContentModerationDetection> moderationLabels) {
        setModerationLabels(moderationLabels);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of content moderation labels.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of content moderation labels.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of content moderation labels.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *         subsequent request to retrieve the next set of content moderation labels.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of content moderation labels.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of content moderation labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Version number of the moderation detection model that was used to detect inappropriate, unwanted, or offensive
     * content.
     * </p>
     * 
     * @param moderationModelVersion
     *        Version number of the moderation detection model that was used to detect inappropriate, unwanted, or
     *        offensive content.
     */

    public void setModerationModelVersion(String moderationModelVersion) {
        this.moderationModelVersion = moderationModelVersion;
    }

    /**
     * <p>
     * Version number of the moderation detection model that was used to detect inappropriate, unwanted, or offensive
     * content.
     * </p>
     * 
     * @return Version number of the moderation detection model that was used to detect inappropriate, unwanted, or
     *         offensive content.
     */

    public String getModerationModelVersion() {
        return this.moderationModelVersion;
    }

    /**
     * <p>
     * Version number of the moderation detection model that was used to detect inappropriate, unwanted, or offensive
     * content.
     * </p>
     * 
     * @param moderationModelVersion
     *        Version number of the moderation detection model that was used to detect inappropriate, unwanted, or
     *        offensive content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withModerationModelVersion(String moderationModelVersion) {
        setModerationModelVersion(moderationModelVersion);
        return this;
    }

    /**
     * <p>
     * Job identifier for the content moderation operation for which you want to obtain results. The job identifer is
     * returned by an initial call to StartContentModeration.
     * </p>
     * 
     * @param jobId
     *        Job identifier for the content moderation operation for which you want to obtain results. The job
     *        identifer is returned by an initial call to StartContentModeration.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Job identifier for the content moderation operation for which you want to obtain results. The job identifer is
     * returned by an initial call to StartContentModeration.
     * </p>
     * 
     * @return Job identifier for the content moderation operation for which you want to obtain results. The job
     *         identifer is returned by an initial call to StartContentModeration.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Job identifier for the content moderation operation for which you want to obtain results. The job identifer is
     * returned by an initial call to StartContentModeration.
     * </p>
     * 
     * @param jobId
     *        Job identifier for the content moderation operation for which you want to obtain results. The job
     *        identifer is returned by an initial call to StartContentModeration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * @param video
     */

    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * @return
     */

    public Video getVideo() {
        return this.video;
    }

    /**
     * @param video
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withVideo(Video video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartContentModeration and returned in the job completion notification
     * sent to your Amazon Simple Notification Service topic.
     * </p>
     * 
     * @param jobTag
     *        A job identifier specified in the call to StartContentModeration and returned in the job completion
     *        notification sent to your Amazon Simple Notification Service topic.
     */

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartContentModeration and returned in the job completion notification
     * sent to your Amazon Simple Notification Service topic.
     * </p>
     * 
     * @return A job identifier specified in the call to StartContentModeration and returned in the job completion
     *         notification sent to your Amazon Simple Notification Service topic.
     */

    public String getJobTag() {
        return this.jobTag;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartContentModeration and returned in the job completion notification
     * sent to your Amazon Simple Notification Service topic.
     * </p>
     * 
     * @param jobTag
     *        A job identifier specified in the call to StartContentModeration and returned in the job completion
     *        notification sent to your Amazon Simple Notification Service topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withJobTag(String jobTag) {
        setJobTag(jobTag);
        return this;
    }

    /**
     * <p>
     * Information about the paramters used when getting a response. Includes information on aggregation and sorting
     * methods.
     * </p>
     * 
     * @param getRequestMetadata
     *        Information about the paramters used when getting a response. Includes information on aggregation and
     *        sorting methods.
     */

    public void setGetRequestMetadata(GetContentModerationRequestMetadata getRequestMetadata) {
        this.getRequestMetadata = getRequestMetadata;
    }

    /**
     * <p>
     * Information about the paramters used when getting a response. Includes information on aggregation and sorting
     * methods.
     * </p>
     * 
     * @return Information about the paramters used when getting a response. Includes information on aggregation and
     *         sorting methods.
     */

    public GetContentModerationRequestMetadata getGetRequestMetadata() {
        return this.getRequestMetadata;
    }

    /**
     * <p>
     * Information about the paramters used when getting a response. Includes information on aggregation and sorting
     * methods.
     * </p>
     * 
     * @param getRequestMetadata
     *        Information about the paramters used when getting a response. Includes information on aggregation and
     *        sorting methods.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationResult withGetRequestMetadata(GetContentModerationRequestMetadata getRequestMetadata) {
        setGetRequestMetadata(getRequestMetadata);
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
        if (getModerationModelVersion() != null)
            sb.append("ModerationModelVersion: ").append(getModerationModelVersion()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getVideo() != null)
            sb.append("Video: ").append(getVideo()).append(",");
        if (getJobTag() != null)
            sb.append("JobTag: ").append(getJobTag()).append(",");
        if (getGetRequestMetadata() != null)
            sb.append("GetRequestMetadata: ").append(getGetRequestMetadata());
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
        if (other.getModerationModelVersion() == null ^ this.getModerationModelVersion() == null)
            return false;
        if (other.getModerationModelVersion() != null && other.getModerationModelVersion().equals(this.getModerationModelVersion()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getJobTag() == null ^ this.getJobTag() == null)
            return false;
        if (other.getJobTag() != null && other.getJobTag().equals(this.getJobTag()) == false)
            return false;
        if (other.getGetRequestMetadata() == null ^ this.getGetRequestMetadata() == null)
            return false;
        if (other.getGetRequestMetadata() != null && other.getGetRequestMetadata().equals(this.getGetRequestMetadata()) == false)
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
        hashCode = prime * hashCode + ((getModerationModelVersion() == null) ? 0 : getModerationModelVersion().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        hashCode = prime * hashCode + ((getGetRequestMetadata() == null) ? 0 : getGetRequestMetadata().hashCode());
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
