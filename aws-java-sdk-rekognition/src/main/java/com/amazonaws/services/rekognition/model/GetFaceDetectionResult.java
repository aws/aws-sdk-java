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
public class GetFaceDetectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the face detection job.
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
     * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to
     * retrieve the next set of faces.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of faces detected in the video. Each element contains a detected face's details and the time, in
     * milliseconds from the start of the video, the face was detected.
     * </p>
     */
    private java.util.List<FaceDetection> faces;
    /**
     * <p>
     * Job identifier for the face detection operation for which you want to obtain results. The job identifer is
     * returned by an initial call to StartFaceDetection.
     * </p>
     */
    private String jobId;

    private Video video;
    /**
     * <p>
     * A job identifier specified in the call to StartFaceDetection and returned in the job completion notification sent
     * to your Amazon Simple Notification Service topic.
     * </p>
     */
    private String jobTag;

    /**
     * <p>
     * The current status of the face detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the face detection job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the face detection job.
     * </p>
     * 
     * @return The current status of the face detection job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the face detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the face detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetFaceDetectionResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the face detection job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the face detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetFaceDetectionResult withJobStatus(VideoJobStatus jobStatus) {
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

    public GetFaceDetectionResult withStatusMessage(String statusMessage) {
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

    public GetFaceDetectionResult withVideoMetadata(VideoMetadata videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to
     * retrieve the next set of faces.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent
     *        request to retrieve the next set of faces.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to
     * retrieve the next set of faces.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent
     *         request to retrieve the next set of faces.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to
     * retrieve the next set of faces.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent
     *        request to retrieve the next set of faces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceDetectionResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of faces detected in the video. Each element contains a detected face's details and the time, in
     * milliseconds from the start of the video, the face was detected.
     * </p>
     * 
     * @return An array of faces detected in the video. Each element contains a detected face's details and the time, in
     *         milliseconds from the start of the video, the face was detected.
     */

    public java.util.List<FaceDetection> getFaces() {
        return faces;
    }

    /**
     * <p>
     * An array of faces detected in the video. Each element contains a detected face's details and the time, in
     * milliseconds from the start of the video, the face was detected.
     * </p>
     * 
     * @param faces
     *        An array of faces detected in the video. Each element contains a detected face's details and the time, in
     *        milliseconds from the start of the video, the face was detected.
     */

    public void setFaces(java.util.Collection<FaceDetection> faces) {
        if (faces == null) {
            this.faces = null;
            return;
        }

        this.faces = new java.util.ArrayList<FaceDetection>(faces);
    }

    /**
     * <p>
     * An array of faces detected in the video. Each element contains a detected face's details and the time, in
     * milliseconds from the start of the video, the face was detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaces(java.util.Collection)} or {@link #withFaces(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param faces
     *        An array of faces detected in the video. Each element contains a detected face's details and the time, in
     *        milliseconds from the start of the video, the face was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceDetectionResult withFaces(FaceDetection... faces) {
        if (this.faces == null) {
            setFaces(new java.util.ArrayList<FaceDetection>(faces.length));
        }
        for (FaceDetection ele : faces) {
            this.faces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces detected in the video. Each element contains a detected face's details and the time, in
     * milliseconds from the start of the video, the face was detected.
     * </p>
     * 
     * @param faces
     *        An array of faces detected in the video. Each element contains a detected face's details and the time, in
     *        milliseconds from the start of the video, the face was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceDetectionResult withFaces(java.util.Collection<FaceDetection> faces) {
        setFaces(faces);
        return this;
    }

    /**
     * <p>
     * Job identifier for the face detection operation for which you want to obtain results. The job identifer is
     * returned by an initial call to StartFaceDetection.
     * </p>
     * 
     * @param jobId
     *        Job identifier for the face detection operation for which you want to obtain results. The job identifer is
     *        returned by an initial call to StartFaceDetection.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Job identifier for the face detection operation for which you want to obtain results. The job identifer is
     * returned by an initial call to StartFaceDetection.
     * </p>
     * 
     * @return Job identifier for the face detection operation for which you want to obtain results. The job identifer
     *         is returned by an initial call to StartFaceDetection.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Job identifier for the face detection operation for which you want to obtain results. The job identifer is
     * returned by an initial call to StartFaceDetection.
     * </p>
     * 
     * @param jobId
     *        Job identifier for the face detection operation for which you want to obtain results. The job identifer is
     *        returned by an initial call to StartFaceDetection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceDetectionResult withJobId(String jobId) {
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

    public GetFaceDetectionResult withVideo(Video video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartFaceDetection and returned in the job completion notification sent
     * to your Amazon Simple Notification Service topic.
     * </p>
     * 
     * @param jobTag
     *        A job identifier specified in the call to StartFaceDetection and returned in the job completion
     *        notification sent to your Amazon Simple Notification Service topic.
     */

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartFaceDetection and returned in the job completion notification sent
     * to your Amazon Simple Notification Service topic.
     * </p>
     * 
     * @return A job identifier specified in the call to StartFaceDetection and returned in the job completion
     *         notification sent to your Amazon Simple Notification Service topic.
     */

    public String getJobTag() {
        return this.jobTag;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartFaceDetection and returned in the job completion notification sent
     * to your Amazon Simple Notification Service topic.
     * </p>
     * 
     * @param jobTag
     *        A job identifier specified in the call to StartFaceDetection and returned in the job completion
     *        notification sent to your Amazon Simple Notification Service topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceDetectionResult withJobTag(String jobTag) {
        setJobTag(jobTag);
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
        if (getFaces() != null)
            sb.append("Faces: ").append(getFaces()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getVideo() != null)
            sb.append("Video: ").append(getVideo()).append(",");
        if (getJobTag() != null)
            sb.append("JobTag: ").append(getJobTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFaceDetectionResult == false)
            return false;
        GetFaceDetectionResult other = (GetFaceDetectionResult) obj;
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
        if (other.getFaces() == null ^ this.getFaces() == null)
            return false;
        if (other.getFaces() != null && other.getFaces().equals(this.getFaces()) == false)
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
        hashCode = prime * hashCode + ((getFaces() == null) ? 0 : getFaces().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        return hashCode;
    }

    @Override
    public GetFaceDetectionResult clone() {
        try {
            return (GetFaceDetectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
