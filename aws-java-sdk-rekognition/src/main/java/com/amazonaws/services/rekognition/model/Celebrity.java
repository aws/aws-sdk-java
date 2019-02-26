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
 * Provides information about a celebrity recognized by the <a>RecognizeCelebrities</a> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Celebrity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of URLs pointing to additional information about the celebrity. If there is no additional information
     * about the celebrity, this list is empty.
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
     * A unique identifier for the celebrity.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Provides information about the celebrity's face, such as its location on the image.
     * </p>
     */
    private ComparedFace face;
    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * </p>
     */
    private Float matchConfidence;

    /**
     * <p>
     * An array of URLs pointing to additional information about the celebrity. If there is no additional information
     * about the celebrity, this list is empty.
     * </p>
     * 
     * @return An array of URLs pointing to additional information about the celebrity. If there is no additional
     *         information about the celebrity, this list is empty.
     */

    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * An array of URLs pointing to additional information about the celebrity. If there is no additional information
     * about the celebrity, this list is empty.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional information about the celebrity. If there is no additional
     *        information about the celebrity, this list is empty.
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
     * An array of URLs pointing to additional information about the celebrity. If there is no additional information
     * about the celebrity, this list is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUrls(java.util.Collection)} or {@link #withUrls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional information about the celebrity. If there is no additional
     *        information about the celebrity, this list is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Celebrity withUrls(String... urls) {
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
     * An array of URLs pointing to additional information about the celebrity. If there is no additional information
     * about the celebrity, this list is empty.
     * </p>
     * 
     * @param urls
     *        An array of URLs pointing to additional information about the celebrity. If there is no additional
     *        information about the celebrity, this list is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Celebrity withUrls(java.util.Collection<String> urls) {
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

    public Celebrity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the celebrity.
     * </p>
     * 
     * @param id
     *        A unique identifier for the celebrity.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the celebrity.
     * </p>
     * 
     * @return A unique identifier for the celebrity.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the celebrity.
     * </p>
     * 
     * @param id
     *        A unique identifier for the celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Celebrity withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Provides information about the celebrity's face, such as its location on the image.
     * </p>
     * 
     * @param face
     *        Provides information about the celebrity's face, such as its location on the image.
     */

    public void setFace(ComparedFace face) {
        this.face = face;
    }

    /**
     * <p>
     * Provides information about the celebrity's face, such as its location on the image.
     * </p>
     * 
     * @return Provides information about the celebrity's face, such as its location on the image.
     */

    public ComparedFace getFace() {
        return this.face;
    }

    /**
     * <p>
     * Provides information about the celebrity's face, such as its location on the image.
     * </p>
     * 
     * @param face
     *        Provides information about the celebrity's face, such as its location on the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Celebrity withFace(ComparedFace face) {
        setFace(face);
        return this;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * </p>
     * 
     * @param matchConfidence
     *        The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     */

    public void setMatchConfidence(Float matchConfidence) {
        this.matchConfidence = matchConfidence;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * </p>
     * 
     * @return The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     */

    public Float getMatchConfidence() {
        return this.matchConfidence;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * </p>
     * 
     * @param matchConfidence
     *        The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Celebrity withMatchConfidence(Float matchConfidence) {
        setMatchConfidence(matchConfidence);
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
        if (getFace() != null)
            sb.append("Face: ").append(getFace()).append(",");
        if (getMatchConfidence() != null)
            sb.append("MatchConfidence: ").append(getMatchConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Celebrity == false)
            return false;
        Celebrity other = (Celebrity) obj;
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
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        if (other.getMatchConfidence() == null ^ this.getMatchConfidence() == null)
            return false;
        if (other.getMatchConfidence() != null && other.getMatchConfidence().equals(this.getMatchConfidence()) == false)
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
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        hashCode = prime * hashCode + ((getMatchConfidence() == null) ? 0 : getMatchConfidence().hashCode());
        return hashCode;
    }

    @Override
    public Celebrity clone() {
        try {
            return (Celebrity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.CelebrityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
