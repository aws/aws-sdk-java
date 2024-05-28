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
 * Configuration options for Content Moderation training.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomizationFeatureContentModerationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The confidence level you plan to use to identify if unsafe content is present during inference.
     * </p>
     */
    private Float confidenceThreshold;

    /**
     * <p>
     * The confidence level you plan to use to identify if unsafe content is present during inference.
     * </p>
     * 
     * @param confidenceThreshold
     *        The confidence level you plan to use to identify if unsafe content is present during inference.
     */

    public void setConfidenceThreshold(Float confidenceThreshold) {
        this.confidenceThreshold = confidenceThreshold;
    }

    /**
     * <p>
     * The confidence level you plan to use to identify if unsafe content is present during inference.
     * </p>
     * 
     * @return The confidence level you plan to use to identify if unsafe content is present during inference.
     */

    public Float getConfidenceThreshold() {
        return this.confidenceThreshold;
    }

    /**
     * <p>
     * The confidence level you plan to use to identify if unsafe content is present during inference.
     * </p>
     * 
     * @param confidenceThreshold
     *        The confidence level you plan to use to identify if unsafe content is present during inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomizationFeatureContentModerationConfig withConfidenceThreshold(Float confidenceThreshold) {
        setConfidenceThreshold(confidenceThreshold);
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
        if (getConfidenceThreshold() != null)
            sb.append("ConfidenceThreshold: ").append(getConfidenceThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomizationFeatureContentModerationConfig == false)
            return false;
        CustomizationFeatureContentModerationConfig other = (CustomizationFeatureContentModerationConfig) obj;
        if (other.getConfidenceThreshold() == null ^ this.getConfidenceThreshold() == null)
            return false;
        if (other.getConfidenceThreshold() != null && other.getConfidenceThreshold().equals(this.getConfidenceThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidenceThreshold() == null) ? 0 : getConfidenceThreshold().hashCode());
        return hashCode;
    }

    @Override
    public CustomizationFeatureContentModerationConfig clone() {
        try {
            return (CustomizationFeatureContentModerationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.CustomizationFeatureContentModerationConfigMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
