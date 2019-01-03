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
 * Information about a recognized celebrity.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CelebrityDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     */
    private java.util.List<String> urls;
    /**
     * <p>
     * The name of the celebrity.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique identifier for the celebrity.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * Bounding box around the body of a celebrity.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * Face details for the recognized celebrity.
     * </p>
     */
    private FaceDetail face;

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * 
     * @return An array of URLs pointing to additional celebrity information.
     */

    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional celebrity information.
     */

    public void setUrls(java.util.Collection<String> urls) {
        if (urls == null) {
            this.urls = null;
            return;
        }

        this.urls = new java.util.ArrayList<String>(urls);
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUrls(java.util.Collection)} or {@link #withUrls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional celebrity information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityDetail withUrls(String... urls) {
        if (this.urls == null) {
            setUrls(new java.util.ArrayList<String>(urls.length));
        }
        for (String ele : urls) {
            this.urls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional celebrity information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityDetail withUrls(java.util.Collection<String> urls) {
        setUrls(urls);
        return this;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     * 
     * @param name
     *        The name of the celebrity.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     * 
     * @return The name of the celebrity.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     * 
     * @param name
     *        The name of the celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the celebrity.
     * </p>
     * 
     * @param id
     *        The unique identifier for the celebrity.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the celebrity.
     * </p>
     * 
     * @return The unique identifier for the celebrity.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the celebrity.
     * </p>
     * 
     * @param id
     *        The unique identifier for the celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * </p>
     * 
     * @param confidence
     *        The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * </p>
     * 
     * @return The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * </p>
     * 
     * @param confidence
     *        The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityDetail withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * Bounding box around the body of a celebrity.
     * </p>
     * 
     * @param boundingBox
     *        Bounding box around the body of a celebrity.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * Bounding box around the body of a celebrity.
     * </p>
     * 
     * @return Bounding box around the body of a celebrity.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * Bounding box around the body of a celebrity.
     * </p>
     * 
     * @param boundingBox
     *        Bounding box around the body of a celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityDetail withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * Face details for the recognized celebrity.
     * </p>
     * 
     * @param face
     *        Face details for the recognized celebrity.
     */

    public void setFace(FaceDetail face) {
        this.face = face;
    }

    /**
     * <p>
     * Face details for the recognized celebrity.
     * </p>
     * 
     * @return Face details for the recognized celebrity.
     */

    public FaceDetail getFace() {
        return this.face;
    }

    /**
     * <p>
     * Face details for the recognized celebrity.
     * </p>
     * 
     * @param face
     *        Face details for the recognized celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityDetail withFace(FaceDetail face) {
        setFace(face);
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
        if (getUrls() != null)
            sb.append("Urls: ").append(getUrls()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: ").append(getBoundingBox()).append(",");
        if (getFace() != null)
            sb.append("Face: ").append(getFace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CelebrityDetail == false)
            return false;
        CelebrityDetail other = (CelebrityDetail) obj;
        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        return hashCode;
    }

    @Override
    public CelebrityDetail clone() {
        try {
            return (CelebrityDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.CelebrityDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
