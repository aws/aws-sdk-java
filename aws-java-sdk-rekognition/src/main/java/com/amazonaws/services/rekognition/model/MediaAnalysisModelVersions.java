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
 * Object containing information about the model versions of selected features in a given job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaAnalysisModelVersions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Moderation base model version.
     * </p>
     */
    private String moderation;

    /**
     * <p>
     * The Moderation base model version.
     * </p>
     * 
     * @param moderation
     *        The Moderation base model version.
     */

    public void setModeration(String moderation) {
        this.moderation = moderation;
    }

    /**
     * <p>
     * The Moderation base model version.
     * </p>
     * 
     * @return The Moderation base model version.
     */

    public String getModeration() {
        return this.moderation;
    }

    /**
     * <p>
     * The Moderation base model version.
     * </p>
     * 
     * @param moderation
     *        The Moderation base model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAnalysisModelVersions withModeration(String moderation) {
        setModeration(moderation);
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
        if (getModeration() != null)
            sb.append("Moderation: ").append(getModeration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisModelVersions == false)
            return false;
        MediaAnalysisModelVersions other = (MediaAnalysisModelVersions) obj;
        if (other.getModeration() == null ^ this.getModeration() == null)
            return false;
        if (other.getModeration() != null && other.getModeration().equals(this.getModeration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModeration() == null) ? 0 : getModeration().hashCode());
        return hashCode;
    }

    @Override
    public MediaAnalysisModelVersions clone() {
        try {
            return (MediaAnalysisModelVersions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.MediaAnalysisModelVersionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
