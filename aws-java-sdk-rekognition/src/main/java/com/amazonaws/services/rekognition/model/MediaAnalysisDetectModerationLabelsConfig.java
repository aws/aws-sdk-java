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
 * Configuration for Moderation Labels Detection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaAnalysisDetectModerationLabelsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the minimum confidence level for the moderation labels to return. Amazon Rekognition doesn't return any
     * labels with a confidence level lower than this specified value.
     * </p>
     */
    private Float minConfidence;
    /**
     * <p>
     * Specifies the custom moderation model to be used during the label detection job. If not provided the pre-trained
     * model is used.
     * </p>
     */
    private String projectVersion;

    /**
     * <p>
     * Specifies the minimum confidence level for the moderation labels to return. Amazon Rekognition doesn't return any
     * labels with a confidence level lower than this specified value.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the moderation labels to return. Amazon Rekognition doesn't
     *        return any labels with a confidence level lower than this specified value.
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the moderation labels to return. Amazon Rekognition doesn't return any
     * labels with a confidence level lower than this specified value.
     * </p>
     * 
     * @return Specifies the minimum confidence level for the moderation labels to return. Amazon Rekognition doesn't
     *         return any labels with a confidence level lower than this specified value.
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the moderation labels to return. Amazon Rekognition doesn't return any
     * labels with a confidence level lower than this specified value.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the moderation labels to return. Amazon Rekognition doesn't
     *        return any labels with a confidence level lower than this specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAnalysisDetectModerationLabelsConfig withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
        return this;
    }

    /**
     * <p>
     * Specifies the custom moderation model to be used during the label detection job. If not provided the pre-trained
     * model is used.
     * </p>
     * 
     * @param projectVersion
     *        Specifies the custom moderation model to be used during the label detection job. If not provided the
     *        pre-trained model is used.
     */

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    /**
     * <p>
     * Specifies the custom moderation model to be used during the label detection job. If not provided the pre-trained
     * model is used.
     * </p>
     * 
     * @return Specifies the custom moderation model to be used during the label detection job. If not provided the
     *         pre-trained model is used.
     */

    public String getProjectVersion() {
        return this.projectVersion;
    }

    /**
     * <p>
     * Specifies the custom moderation model to be used during the label detection job. If not provided the pre-trained
     * model is used.
     * </p>
     * 
     * @param projectVersion
     *        Specifies the custom moderation model to be used during the label detection job. If not provided the
     *        pre-trained model is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAnalysisDetectModerationLabelsConfig withProjectVersion(String projectVersion) {
        setProjectVersion(projectVersion);
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
        if (getMinConfidence() != null)
            sb.append("MinConfidence: ").append(getMinConfidence()).append(",");
        if (getProjectVersion() != null)
            sb.append("ProjectVersion: ").append(getProjectVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisDetectModerationLabelsConfig == false)
            return false;
        MediaAnalysisDetectModerationLabelsConfig other = (MediaAnalysisDetectModerationLabelsConfig) obj;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        if (other.getProjectVersion() == null ^ this.getProjectVersion() == null)
            return false;
        if (other.getProjectVersion() != null && other.getProjectVersion().equals(this.getProjectVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        hashCode = prime * hashCode + ((getProjectVersion() == null) ? 0 : getProjectVersion().hashCode());
        return hashCode;
    }

    @Override
    public MediaAnalysisDetectModerationLabelsConfig clone() {
        try {
            return (MediaAnalysisDetectModerationLabelsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.MediaAnalysisDetectModerationLabelsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
