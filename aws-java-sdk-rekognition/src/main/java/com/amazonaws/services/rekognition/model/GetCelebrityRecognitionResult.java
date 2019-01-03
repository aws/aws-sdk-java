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
public class GetCelebrityRecognitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the celebrity recognition job.
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
     * page of paginated responses from a Amazon Rekognition Video operation.
     * </p>
     */
    private VideoMetadata videoMetadata;
    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of celebrities.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Array of celebrities recognized in the video.
     * </p>
     */
    private java.util.List<CelebrityRecognition> celebrities;

    /**
     * <p>
     * The current status of the celebrity recognition job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the celebrity recognition job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the celebrity recognition job.
     * </p>
     * 
     * @return The current status of the celebrity recognition job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the celebrity recognition job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the celebrity recognition job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetCelebrityRecognitionResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the celebrity recognition job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the celebrity recognition job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetCelebrityRecognitionResult withJobStatus(VideoJobStatus jobStatus) {
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

    public GetCelebrityRecognitionResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned in every
     * page of paginated responses from a Amazon Rekognition Video operation.
     * </p>
     * 
     * @param videoMetadata
     *        Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned
     *        in every page of paginated responses from a Amazon Rekognition Video operation.
     */

    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned in every
     * page of paginated responses from a Amazon Rekognition Video operation.
     * </p>
     * 
     * @return Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned
     *         in every page of paginated responses from a Amazon Rekognition Video operation.
     */

    public VideoMetadata getVideoMetadata() {
        return this.videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned in every
     * page of paginated responses from a Amazon Rekognition Video operation.
     * </p>
     * 
     * @param videoMetadata
     *        Information about a video that Amazon Rekognition Video analyzed. <code>Videometadata</code> is returned
     *        in every page of paginated responses from a Amazon Rekognition Video operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityRecognitionResult withVideoMetadata(VideoMetadata videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of celebrities.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of celebrities.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of celebrities.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *         subsequent request to retrieve the next set of celebrities.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of celebrities.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of celebrities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityRecognitionResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Array of celebrities recognized in the video.
     * </p>
     * 
     * @return Array of celebrities recognized in the video.
     */

    public java.util.List<CelebrityRecognition> getCelebrities() {
        return celebrities;
    }

    /**
     * <p>
     * Array of celebrities recognized in the video.
     * </p>
     * 
     * @param celebrities
     *        Array of celebrities recognized in the video.
     */

    public void setCelebrities(java.util.Collection<CelebrityRecognition> celebrities) {
        if (celebrities == null) {
            this.celebrities = null;
            return;
        }

        this.celebrities = new java.util.ArrayList<CelebrityRecognition>(celebrities);
    }

    /**
     * <p>
     * Array of celebrities recognized in the video.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCelebrities(java.util.Collection)} or {@link #withCelebrities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param celebrities
     *        Array of celebrities recognized in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityRecognitionResult withCelebrities(CelebrityRecognition... celebrities) {
        if (this.celebrities == null) {
            setCelebrities(new java.util.ArrayList<CelebrityRecognition>(celebrities.length));
        }
        for (CelebrityRecognition ele : celebrities) {
            this.celebrities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of celebrities recognized in the video.
     * </p>
     * 
     * @param celebrities
     *        Array of celebrities recognized in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCelebrityRecognitionResult withCelebrities(java.util.Collection<CelebrityRecognition> celebrities) {
        setCelebrities(celebrities);
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
        if (getCelebrities() != null)
            sb.append("Celebrities: ").append(getCelebrities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCelebrityRecognitionResult == false)
            return false;
        GetCelebrityRecognitionResult other = (GetCelebrityRecognitionResult) obj;
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
        if (other.getCelebrities() == null ^ this.getCelebrities() == null)
            return false;
        if (other.getCelebrities() != null && other.getCelebrities().equals(this.getCelebrities()) == false)
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
        hashCode = prime * hashCode + ((getCelebrities() == null) ? 0 : getCelebrities().hashCode());
        return hashCode;
    }

    @Override
    public GetCelebrityRecognitionResult clone() {
        try {
            return (GetCelebrityRecognitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
