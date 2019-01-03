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
            sb.append("Faces: ").append(getFaces());
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
