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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the type of a segment requested in a call to <a>StartSegmentDetection</a>. An array of
 * <code>SegmentTypeInfo</code> objects is returned by the response from <a>GetSegmentDetection</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentTypeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The version of the model used to detect segments.
     * </p>
     */
    private String modelVersion;

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * 
     * @param type
     *        The type of a segment (technical cue or shot detection).
     * @see SegmentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * 
     * @return The type of a segment (technical cue or shot detection).
     * @see SegmentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * 
     * @param type
     *        The type of a segment (technical cue or shot detection).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentTypeInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * 
     * @param type
     *        The type of a segment (technical cue or shot detection).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public SegmentTypeInfo withType(SegmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The version of the model used to detect segments.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model used to detect segments.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model used to detect segments.
     * </p>
     * 
     * @return The version of the model used to detect segments.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model used to detect segments.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model used to detect segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentTypeInfo withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentTypeInfo == false)
            return false;
        SegmentTypeInfo other = (SegmentTypeInfo) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public SegmentTypeInfo clone() {
        try {
            return (SegmentTypeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.SegmentTypeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
