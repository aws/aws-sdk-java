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
public class GetPersonTrackingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the person tracking job.
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
     * request to retrieve the next set of persons.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path was tracked throughout the video. An
     * array element will exist for each time a person's path is tracked.
     * </p>
     */
    private java.util.List<PersonDetection> persons;

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the person tracking job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * 
     * @return The current status of the person tracking job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the person tracking job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetPersonTrackingResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the person tracking job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetPersonTrackingResult withJobStatus(VideoJobStatus jobStatus) {
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

    public GetPersonTrackingResult withStatusMessage(String statusMessage) {
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

    public GetPersonTrackingResult withVideoMetadata(VideoMetadata videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of persons.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of persons.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of persons.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *         subsequent request to retrieve the next set of persons.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of persons.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of persons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonTrackingResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path was tracked throughout the video. An
     * array element will exist for each time a person's path is tracked.
     * </p>
     * 
     * @return An array of the persons detected in the video and the time(s) their path was tracked throughout the
     *         video. An array element will exist for each time a person's path is tracked.
     */

    public java.util.List<PersonDetection> getPersons() {
        return persons;
    }

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path was tracked throughout the video. An
     * array element will exist for each time a person's path is tracked.
     * </p>
     * 
     * @param persons
     *        An array of the persons detected in the video and the time(s) their path was tracked throughout the video.
     *        An array element will exist for each time a person's path is tracked.
     */

    public void setPersons(java.util.Collection<PersonDetection> persons) {
        if (persons == null) {
            this.persons = null;
            return;
        }

        this.persons = new java.util.ArrayList<PersonDetection>(persons);
    }

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path was tracked throughout the video. An
     * array element will exist for each time a person's path is tracked.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPersons(java.util.Collection)} or {@link #withPersons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param persons
     *        An array of the persons detected in the video and the time(s) their path was tracked throughout the video.
     *        An array element will exist for each time a person's path is tracked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonTrackingResult withPersons(PersonDetection... persons) {
        if (this.persons == null) {
            setPersons(new java.util.ArrayList<PersonDetection>(persons.length));
        }
        for (PersonDetection ele : persons) {
            this.persons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path was tracked throughout the video. An
     * array element will exist for each time a person's path is tracked.
     * </p>
     * 
     * @param persons
     *        An array of the persons detected in the video and the time(s) their path was tracked throughout the video.
     *        An array element will exist for each time a person's path is tracked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonTrackingResult withPersons(java.util.Collection<PersonDetection> persons) {
        setPersons(persons);
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
        if (getPersons() != null)
            sb.append("Persons: ").append(getPersons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPersonTrackingResult == false)
            return false;
        GetPersonTrackingResult other = (GetPersonTrackingResult) obj;
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
        if (other.getPersons() == null ^ this.getPersons() == null)
            return false;
        if (other.getPersons() != null && other.getPersons().equals(this.getPersons()) == false)
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
        hashCode = prime * hashCode + ((getPersons() == null) ? 0 : getPersons().hashCode());
        return hashCode;
    }

    @Override
    public GetPersonTrackingResult clone() {
        try {
            return (GetPersonTrackingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
