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
 * Details and path tracking information for a single time a person's path is tracked in a video. Amazon Rekognition
 * operations that track people's paths return an array of <code>PersonDetection</code> objects with elements for each
 * time a person's path is tracked in a video.
 * </p>
 * <p>
 * For more information, see GetPersonTracking in the Amazon Rekognition Developer Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PersonDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the person's path was tracked.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * Details about a person whose path was tracked in a video.
     * </p>
     */
    private PersonDetail person;

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the person's path was tracked.
     * </p>
     * 
     * @param timestamp
     *        The time, in milliseconds from the start of the video, that the person's path was tracked.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the person's path was tracked.
     * </p>
     * 
     * @return The time, in milliseconds from the start of the video, that the person's path was tracked.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the person's path was tracked.
     * </p>
     * 
     * @param timestamp
     *        The time, in milliseconds from the start of the video, that the person's path was tracked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonDetection withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Details about a person whose path was tracked in a video.
     * </p>
     * 
     * @param person
     *        Details about a person whose path was tracked in a video.
     */

    public void setPerson(PersonDetail person) {
        this.person = person;
    }

    /**
     * <p>
     * Details about a person whose path was tracked in a video.
     * </p>
     * 
     * @return Details about a person whose path was tracked in a video.
     */

    public PersonDetail getPerson() {
        return this.person;
    }

    /**
     * <p>
     * Details about a person whose path was tracked in a video.
     * </p>
     * 
     * @param person
     *        Details about a person whose path was tracked in a video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersonDetection withPerson(PersonDetail person) {
        setPerson(person);
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
            sb.append("Person: ").append(getPerson());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PersonDetection == false)
            return false;
        PersonDetection other = (PersonDetection) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getPerson() == null ^ this.getPerson() == null)
            return false;
        if (other.getPerson() != null && other.getPerson().equals(this.getPerson()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPerson() == null) ? 0 : getPerson().hashCode());
        return hashCode;
    }

    @Override
    public PersonDetection clone() {
        try {
            return (PersonDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.PersonDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
