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
public class GetFaceSearchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the face search job.
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
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of search results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page
     * of paginated responses from a Amazon Rekognition Video operation.
     * </p>
     */
    private VideoMetadata videoMetadata;
    /**
     * <p>
     * An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon Rekognition
     * collection. It also includes time information for when persons are matched in the video. You specify the input
     * collection in an initial call to <code>StartFaceSearch</code>. Each <code>Persons</code> element includes a time
     * the person was matched, face match details (<code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     */
    private java.util.List<PersonMatch> persons;

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the face search job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * 
     * @return The current status of the face search job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the face search job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetFaceSearchResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the face search job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetFaceSearchResult withJobStatus(VideoJobStatus jobStatus) {
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

    public GetFaceSearchResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of search results.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of search results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of search results.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *         subsequent request to retrieve the next set of search results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of search results.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceSearchResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page
     * of paginated responses from a Amazon Rekognition Video operation.
     * </p>
     * 
     * @param videoMetadata
     *        Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in
     *        every page of paginated responses from a Amazon Rekognition Video operation.
     */

    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page
     * of paginated responses from a Amazon Rekognition Video operation.
     * </p>
     * 
     * @return Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in
     *         every page of paginated responses from a Amazon Rekognition Video operation.
     */

    public VideoMetadata getVideoMetadata() {
        return this.videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in every page
     * of paginated responses from a Amazon Rekognition Video operation.
     * </p>
     * 
     * @param videoMetadata
     *        Information about a video that Amazon Rekognition analyzed. <code>Videometadata</code> is returned in
     *        every page of paginated responses from a Amazon Rekognition Video operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceSearchResult withVideoMetadata(VideoMetadata videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon Rekognition
     * collection. It also includes time information for when persons are matched in the video. You specify the input
     * collection in an initial call to <code>StartFaceSearch</code>. Each <code>Persons</code> element includes a time
     * the person was matched, face match details (<code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     * 
     * @return An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon
     *         Rekognition collection. It also includes time information for when persons are matched in the video. You
     *         specify the input collection in an initial call to <code>StartFaceSearch</code>. Each
     *         <code>Persons</code> element includes a time the person was matched, face match details (
     *         <code>FaceMatches</code>) for matching faces in the collection, and person information (
     *         <code>Person</code>) for the matched person.
     */

    public java.util.List<PersonMatch> getPersons() {
        return persons;
    }

    /**
     * <p>
     * An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon Rekognition
     * collection. It also includes time information for when persons are matched in the video. You specify the input
     * collection in an initial call to <code>StartFaceSearch</code>. Each <code>Persons</code> element includes a time
     * the person was matched, face match details (<code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     * 
     * @param persons
     *        An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon
     *        Rekognition collection. It also includes time information for when persons are matched in the video. You
     *        specify the input collection in an initial call to <code>StartFaceSearch</code>. Each <code>Persons</code>
     *        element includes a time the person was matched, face match details (<code>FaceMatches</code>) for matching
     *        faces in the collection, and person information (<code>Person</code>) for the matched person.
     */

    public void setPersons(java.util.Collection<PersonMatch> persons) {
        if (persons == null) {
            this.persons = null;
            return;
        }

        this.persons = new java.util.ArrayList<PersonMatch>(persons);
    }

    /**
     * <p>
     * An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon Rekognition
     * collection. It also includes time information for when persons are matched in the video. You specify the input
     * collection in an initial call to <code>StartFaceSearch</code>. Each <code>Persons</code> element includes a time
     * the person was matched, face match details (<code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPersons(java.util.Collection)} or {@link #withPersons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param persons
     *        An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon
     *        Rekognition collection. It also includes time information for when persons are matched in the video. You
     *        specify the input collection in an initial call to <code>StartFaceSearch</code>. Each <code>Persons</code>
     *        element includes a time the person was matched, face match details (<code>FaceMatches</code>) for matching
     *        faces in the collection, and person information (<code>Person</code>) for the matched person.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceSearchResult withPersons(PersonMatch... persons) {
        if (this.persons == null) {
            setPersons(new java.util.ArrayList<PersonMatch>(persons.length));
        }
        for (PersonMatch ele : persons) {
            this.persons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon Rekognition
     * collection. It also includes time information for when persons are matched in the video. You specify the input
     * collection in an initial call to <code>StartFaceSearch</code>. Each <code>Persons</code> element includes a time
     * the person was matched, face match details (<code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     * 
     * @param persons
     *        An array of persons, <a>PersonMatch</a>, in the video whose face(s) match the face(s) in an Amazon
     *        Rekognition collection. It also includes time information for when persons are matched in the video. You
     *        specify the input collection in an initial call to <code>StartFaceSearch</code>. Each <code>Persons</code>
     *        element includes a time the person was matched, face match details (<code>FaceMatches</code>) for matching
     *        faces in the collection, and person information (<code>Person</code>) for the matched person.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFaceSearchResult withPersons(java.util.Collection<PersonMatch> persons) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVideoMetadata() != null)
            sb.append("VideoMetadata: ").append(getVideoMetadata()).append(",");
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

        if (obj instanceof GetFaceSearchResult == false)
            return false;
        GetFaceSearchResult other = (GetFaceSearchResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVideoMetadata() == null ^ this.getVideoMetadata() == null)
            return false;
        if (other.getVideoMetadata() != null && other.getVideoMetadata().equals(this.getVideoMetadata()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVideoMetadata() == null) ? 0 : getVideoMetadata().hashCode());
        hashCode = prime * hashCode + ((getPersons() == null) ? 0 : getPersons().hashCode());
        return hashCode;
    }

    @Override
    public GetFaceSearchResult clone() {
        try {
            return (GetFaceSearchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
