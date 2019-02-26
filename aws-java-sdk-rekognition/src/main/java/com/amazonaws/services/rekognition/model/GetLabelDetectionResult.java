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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLabelDetectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the label detection job.
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
     * Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned in every
     * page of paginated responses from a Amazon Rekognition video operation.
     * </p>
     */
    private VideoMetadata videoMetadata;
    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of labels.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of labels detected in the video. Each element contains the detected label and the time, in milliseconds
     * from the start of the video, that the label was detected.
     * </p>
     */
    private java.util.List<LabelDetection> labels;
    /**
     * <p>
     * Version number of the label detection model that was used to detect labels.
     * </p>
     */
    private String labelModelVersion;

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the label detection job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * 
     * @return The current status of the label detection job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the label detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetLabelDetectionResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the label detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetLabelDetectionResult withJobStatus(VideoJobStatus jobStatus) {
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

    public GetLabelDetectionResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned in every
     * page of paginated responses from a Amazon Rekognition video operation.
     * </p>
     * 
     * @param videoMetadata
     *        Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned
     *        in every page of paginated responses from a Amazon Rekognition video operation.
     */

    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned in every
     * page of paginated responses from a Amazon Rekognition video operation.
     * </p>
     * 
     * @return Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned
     *         in every page of paginated responses from a Amazon Rekognition video operation.
     */

    public VideoMetadata getVideoMetadata() {
        return this.videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned in every
     * page of paginated responses from a Amazon Rekognition video operation.
     * </p>
     * 
     * @param videoMetadata
     *        Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned
     *        in every page of paginated responses from a Amazon Rekognition video operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLabelDetectionResult withVideoMetadata(VideoMetadata videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of labels.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of labels.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of labels.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *         subsequent request to retrieve the next set of labels.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of labels.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLabelDetectionResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the detected label and the time, in milliseconds
     * from the start of the video, that the label was detected.
     * </p>
     * 
     * @return An array of labels detected in the video. Each element contains the detected label and the time, in
     *         milliseconds from the start of the video, that the label was detected.
     */

    public java.util.List<LabelDetection> getLabels() {
        return labels;
    }

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the detected label and the time, in milliseconds
     * from the start of the video, that the label was detected.
     * </p>
     * 
     * @param labels
     *        An array of labels detected in the video. Each element contains the detected label and the time, in
     *        milliseconds from the start of the video, that the label was detected.
     */

    public void setLabels(java.util.Collection<LabelDetection> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<LabelDetection>(labels);
    }

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the detected label and the time, in milliseconds
     * from the start of the video, that the label was detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        An array of labels detected in the video. Each element contains the detected label and the time, in
     *        milliseconds from the start of the video, that the label was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLabelDetectionResult withLabels(LabelDetection... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<LabelDetection>(labels.length));
        }
        for (LabelDetection ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the detected label and the time, in milliseconds
     * from the start of the video, that the label was detected.
     * </p>
     * 
     * @param labels
     *        An array of labels detected in the video. Each element contains the detected label and the time, in
     *        milliseconds from the start of the video, that the label was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLabelDetectionResult withLabels(java.util.Collection<LabelDetection> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect labels.
     * </p>
     * 
     * @param labelModelVersion
     *        Version number of the label detection model that was used to detect labels.
     */

    public void setLabelModelVersion(String labelModelVersion) {
        this.labelModelVersion = labelModelVersion;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect labels.
     * </p>
     * 
     * @return Version number of the label detection model that was used to detect labels.
     */

    public String getLabelModelVersion() {
        return this.labelModelVersion;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect labels.
     * </p>
     * 
     * @param labelModelVersion
     *        Version number of the label detection model that was used to detect labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLabelDetectionResult withLabelModelVersion(String labelModelVersion) {
        setLabelModelVersion(labelModelVersion);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getLabelModelVersion() != null)
            sb.append("LabelModelVersion: ").append(getLabelModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLabelDetectionResult == false)
            return false;
        GetLabelDetectionResult other = (GetLabelDetectionResult) obj;
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getLabelModelVersion() == null ^ this.getLabelModelVersion() == null)
            return false;
        if (other.getLabelModelVersion() != null && other.getLabelModelVersion().equals(this.getLabelModelVersion()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getLabelModelVersion() == null) ? 0 : getLabelModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetLabelDetectionResult clone() {
        try {
            return (GetLabelDetectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
