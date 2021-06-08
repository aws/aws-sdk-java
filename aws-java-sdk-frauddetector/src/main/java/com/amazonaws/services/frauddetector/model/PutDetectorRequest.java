/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The detector ID.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The description of the detector.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the event type.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @return The detector ID.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDetectorRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The description of the detector.
     * </p>
     * 
     * @param description
     *        The description of the detector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the detector.
     * </p>
     * 
     * @return The description of the detector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the detector.
     * </p>
     * 
     * @param description
     *        The description of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDetectorRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event type.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @return The name of the event type.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDetectorRequest withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @return A collection of key and value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDetectorRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDetectorRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDetectorRequest == false)
            return false;
        PutDetectorRequest other = (PutDetectorRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutDetectorRequest clone() {
        return (PutDetectorRequest) super.clone();
    }

}
