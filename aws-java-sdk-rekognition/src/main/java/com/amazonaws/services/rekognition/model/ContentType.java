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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information regarding the confidence and name of a detected content type.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The confidence level of the label given
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * The name of the label
     * </p>
     */
    private String name;

    /**
     * <p>
     * The confidence level of the label given
     * </p>
     * 
     * @param confidence
     *        The confidence level of the label given
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence level of the label given
     * </p>
     * 
     * @return The confidence level of the label given
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence level of the label given
     * </p>
     * 
     * @param confidence
     *        The confidence level of the label given
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentType withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The name of the label
     * </p>
     * 
     * @param name
     *        The name of the label
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the label
     * </p>
     * 
     * @return The name of the label
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the label
     * </p>
     * 
     * @param name
     *        The name of the label
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentType withName(String name) {
        setName(name);
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
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentType == false)
            return false;
        ContentType other = (ContentType) obj;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ContentType clone() {
        try {
            return (ContentType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ContentTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
