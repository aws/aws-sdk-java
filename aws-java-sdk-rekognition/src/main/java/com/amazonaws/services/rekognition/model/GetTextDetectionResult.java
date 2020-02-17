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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTextDetectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     */
    private String statusMessage;

    private VideoMetadata videoMetadata;
    /**
     * <p>
     * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from
     * the start of the video that the text was detected, and where it was detected on the screen.
     * </p>
     */
    private java.util.List<TextDetectionResult> textDetections;
    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of text.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Version number of the text detection model that was used to detect text.
     * </p>
     */
    private String textModelVersion;

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * 
     * @param jobStatus
     *        Current status of the text detection job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * 
     * @return Current status of the text detection job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * 
     * @param jobStatus
     *        Current status of the text detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetTextDetectionResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * 
     * @param jobStatus
     *        Current status of the text detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetTextDetectionResult withJobStatus(VideoJobStatus jobStatus) {
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

    public GetTextDetectionResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * @param videoMetadata
     */

    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    /**
     * @return
     */

    public VideoMetadata getVideoMetadata() {
        return this.videoMetadata;
    }

    /**
     * @param videoMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTextDetectionResult withVideoMetadata(VideoMetadata videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from
     * the start of the video that the text was detected, and where it was detected on the screen.
     * </p>
     * 
     * @return An array of text detected in the video. Each element contains the detected text, the time in milliseconds
     *         from the start of the video that the text was detected, and where it was detected on the screen.
     */

    public java.util.List<TextDetectionResult> getTextDetections() {
        return textDetections;
    }

    /**
     * <p>
     * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from
     * the start of the video that the text was detected, and where it was detected on the screen.
     * </p>
     * 
     * @param textDetections
     *        An array of text detected in the video. Each element contains the detected text, the time in milliseconds
     *        from the start of the video that the text was detected, and where it was detected on the screen.
     */

    public void setTextDetections(java.util.Collection<TextDetectionResult> textDetections) {
        if (textDetections == null) {
            this.textDetections = null;
            return;
        }

        this.textDetections = new java.util.ArrayList<TextDetectionResult>(textDetections);
    }

    /**
     * <p>
     * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from
     * the start of the video that the text was detected, and where it was detected on the screen.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextDetections(java.util.Collection)} or {@link #withTextDetections(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param textDetections
     *        An array of text detected in the video. Each element contains the detected text, the time in milliseconds
     *        from the start of the video that the text was detected, and where it was detected on the screen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTextDetectionResult withTextDetections(TextDetectionResult... textDetections) {
        if (this.textDetections == null) {
            setTextDetections(new java.util.ArrayList<TextDetectionResult>(textDetections.length));
        }
        for (TextDetectionResult ele : textDetections) {
            this.textDetections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from
     * the start of the video that the text was detected, and where it was detected on the screen.
     * </p>
     * 
     * @param textDetections
     *        An array of text detected in the video. Each element contains the detected text, the time in milliseconds
     *        from the start of the video that the text was detected, and where it was detected on the screen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTextDetectionResult withTextDetections(java.util.Collection<TextDetectionResult> textDetections) {
        setTextDetections(textDetections);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of text.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of text.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of text.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *         subsequent request to retrieve the next set of text.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of text.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTextDetectionResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Version number of the text detection model that was used to detect text.
     * </p>
     * 
     * @param textModelVersion
     *        Version number of the text detection model that was used to detect text.
     */

    public void setTextModelVersion(String textModelVersion) {
        this.textModelVersion = textModelVersion;
    }

    /**
     * <p>
     * Version number of the text detection model that was used to detect text.
     * </p>
     * 
     * @return Version number of the text detection model that was used to detect text.
     */

    public String getTextModelVersion() {
        return this.textModelVersion;
    }

    /**
     * <p>
     * Version number of the text detection model that was used to detect text.
     * </p>
     * 
     * @param textModelVersion
     *        Version number of the text detection model that was used to detect text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTextDetectionResult withTextModelVersion(String textModelVersion) {
        setTextModelVersion(textModelVersion);
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
        if (getTextDetections() != null)
            sb.append("TextDetections: ").append(getTextDetections()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTextModelVersion() != null)
            sb.append("TextModelVersion: ").append(getTextModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTextDetectionResult == false)
            return false;
        GetTextDetectionResult other = (GetTextDetectionResult) obj;
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
        if (other.getTextDetections() == null ^ this.getTextDetections() == null)
            return false;
        if (other.getTextDetections() != null && other.getTextDetections().equals(this.getTextDetections()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTextModelVersion() == null ^ this.getTextModelVersion() == null)
            return false;
        if (other.getTextModelVersion() != null && other.getTextModelVersion().equals(this.getTextModelVersion()) == false)
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
        hashCode = prime * hashCode + ((getTextDetections() == null) ? 0 : getTextDetections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTextModelVersion() == null) ? 0 : getTextModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetTextDetectionResult clone() {
        try {
            return (GetTextDetectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
