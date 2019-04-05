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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a person whose face matches a face(s) in an Amazon Rekognition collection. Includes information
 * about the faces in the Amazon Rekognition collection (<a>FaceMatch</a>), information about the person
 * (<a>PersonDetail</a>), and the time stamp for when the person was detected in a video. An array of
 * <code>PersonMatch</code> objects is returned by <a>GetFaceSearch</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PersonMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * Information about the matched person.
     * </p>
     */
    private PersonDetail person;
    /**
     * <p>
     * Information about the faces in the input collection that match the face of a person in the video.
     * </p>
     */
    private java.util.List<FaceMatch> faceMatches;

    /**
     * <p>
     * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
     * </p>
     * 
     * @param timestamp
     *        The time, in milliseconds from the beginning of the video, that the person was matched in the video.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
     * </p>
     * 
     * @return The time, in milliseconds from the beginning of the video, that the person was matched in the video.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
     * </p>
     * 
     * @param timestamp
     *        The time, in milliseconds from the beginning of the video, that the person was matched in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonMatch withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Information about the matched person.
     * </p>
     * 
     * @param person
     *        Information about the matched person.
     */

    public void setPerson(PersonDetail person) {
        this.person = person;
    }

    /**
     * <p>
     * Information about the matched person.
     * </p>
     * 
     * @return Information about the matched person.
     */

    public PersonDetail getPerson() {
        return this.person;
    }

    /**
     * <p>
     * Information about the matched person.
     * </p>
     * 
     * @param person
     *        Information about the matched person.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonMatch withPerson(PersonDetail person) {
        setPerson(person);
        return this;
    }

    /**
     * <p>
     * Information about the faces in the input collection that match the face of a person in the video.
     * </p>
     * 
     * @return Information about the faces in the input collection that match the face of a person in the video.
     */

    public java.util.List<FaceMatch> getFaceMatches() {
        return faceMatches;
    }

    /**
     * <p>
     * Information about the faces in the input collection that match the face of a person in the video.
     * </p>
     * 
     * @param faceMatches
     *        Information about the faces in the input collection that match the face of a person in the video.
     */

    public void setFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        if (faceMatches == null) {
            this.faceMatches = null;
            return;
        }

        this.faceMatches = new java.util.ArrayList<FaceMatch>(faceMatches);
    }

    /**
     * <p>
     * Information about the faces in the input collection that match the face of a person in the video.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceMatches(java.util.Collection)} or {@link #withFaceMatches(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param faceMatches
     *        Information about the faces in the input collection that match the face of a person in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonMatch withFaceMatches(FaceMatch... faceMatches) {
        if (this.faceMatches == null) {
            setFaceMatches(new java.util.ArrayList<FaceMatch>(faceMatches.length));
        }
        for (FaceMatch ele : faceMatches) {
            this.faceMatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the faces in the input collection that match the face of a person in the video.
     * </p>
     * 
     * @param faceMatches
     *        Information about the faces in the input collection that match the face of a person in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonMatch withFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        setFaceMatches(faceMatches);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getPerson() != null)
            sb.append("Person: ").append(getPerson()).append(",");
        if (getFaceMatches() != null)
            sb.append("FaceMatches: ").append(getFaceMatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PersonMatch == false)
            return false;
        PersonMatch other = (PersonMatch) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getPerson() == null ^ this.getPerson() == null)
            return false;
        if (other.getPerson() != null && other.getPerson().equals(this.getPerson()) == false)
            return false;
        if (other.getFaceMatches() == null ^ this.getFaceMatches() == null)
            return false;
        if (other.getFaceMatches() != null && other.getFaceMatches().equals(this.getFaceMatches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPerson() == null) ? 0 : getPerson().hashCode());
        hashCode = prime * hashCode + ((getFaceMatches() == null) ? 0 : getFaceMatches().hashCode());
        return hashCode;
    }

    @Override
    public PersonMatch clone() {
        try {
            return (PersonMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.PersonMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
