/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The label detection settings you want to use in your stream processor. This includes the labels you want the stream
 * processor to detect and the minimum confidence level allowed to label objects.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectedHomeSettingsForUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages, or pets. The current valid labels you
     * can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     */
    private java.util.List<String> labels;
    /**
     * <p>
     * The minimum confidence required to label an object in the video.
     * </p>
     */
    private Float minConfidence;

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages, or pets. The current valid labels you
     * can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     * 
     * @return Specifies what you want to detect in the video, such as people, packages, or pets. The current valid
     *         labels you can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages, or pets. The current valid labels you
     * can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     * 
     * @param labels
     *        Specifies what you want to detect in the video, such as people, packages, or pets. The current valid
     *        labels you can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages, or pets. The current valid labels you
     * can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        Specifies what you want to detect in the video, such as people, packages, or pets. The current valid
     *        labels you can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectedHomeSettingsForUpdate withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages, or pets. The current valid labels you
     * can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     * 
     * @param labels
     *        Specifies what you want to detect in the video, such as people, packages, or pets. The current valid
     *        labels you can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectedHomeSettingsForUpdate withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The minimum confidence required to label an object in the video.
     * </p>
     * 
     * @param minConfidence
     *        The minimum confidence required to label an object in the video.
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * The minimum confidence required to label an object in the video.
     * </p>
     * 
     * @return The minimum confidence required to label an object in the video.
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * The minimum confidence required to label an object in the video.
     * </p>
     * 
     * @param minConfidence
     *        The minimum confidence required to label an object in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectedHomeSettingsForUpdate withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
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
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getMinConfidence() != null)
            sb.append("MinConfidence: ").append(getMinConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectedHomeSettingsForUpdate == false)
            return false;
        ConnectedHomeSettingsForUpdate other = (ConnectedHomeSettingsForUpdate) obj;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        return hashCode;
    }

    @Override
    public ConnectedHomeSettingsForUpdate clone() {
        try {
            return (ConnectedHomeSettingsForUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ConnectedHomeSettingsForUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
