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
 * Settings for the DetectLabels request. Settings can include filters for both GENERAL_LABELS and IMAGE_PROPERTIES.
 * GENERAL_LABELS filters can be inclusive or exclusive and applied to individual labels or label categories.
 * IMAGE_PROPERTIES filters allow specification of a maximum number of dominant colors.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectLabelsSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the specified filters for GENERAL_LABELS.
     * </p>
     */
    private GeneralLabelsSettings generalLabels;
    /**
     * <p>
     * Contains the chosen number of maximum dominant colors in an image.
     * </p>
     */
    private DetectLabelsImagePropertiesSettings imageProperties;

    /**
     * <p>
     * Contains the specified filters for GENERAL_LABELS.
     * </p>
     * 
     * @param generalLabels
     *        Contains the specified filters for GENERAL_LABELS.
     */

    public void setGeneralLabels(GeneralLabelsSettings generalLabels) {
        this.generalLabels = generalLabels;
    }

    /**
     * <p>
     * Contains the specified filters for GENERAL_LABELS.
     * </p>
     * 
     * @return Contains the specified filters for GENERAL_LABELS.
     */

    public GeneralLabelsSettings getGeneralLabels() {
        return this.generalLabels;
    }

    /**
     * <p>
     * Contains the specified filters for GENERAL_LABELS.
     * </p>
     * 
     * @param generalLabels
     *        Contains the specified filters for GENERAL_LABELS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsSettings withGeneralLabels(GeneralLabelsSettings generalLabels) {
        setGeneralLabels(generalLabels);
        return this;
    }

    /**
     * <p>
     * Contains the chosen number of maximum dominant colors in an image.
     * </p>
     * 
     * @param imageProperties
     *        Contains the chosen number of maximum dominant colors in an image.
     */

    public void setImageProperties(DetectLabelsImagePropertiesSettings imageProperties) {
        this.imageProperties = imageProperties;
    }

    /**
     * <p>
     * Contains the chosen number of maximum dominant colors in an image.
     * </p>
     * 
     * @return Contains the chosen number of maximum dominant colors in an image.
     */

    public DetectLabelsImagePropertiesSettings getImageProperties() {
        return this.imageProperties;
    }

    /**
     * <p>
     * Contains the chosen number of maximum dominant colors in an image.
     * </p>
     * 
     * @param imageProperties
     *        Contains the chosen number of maximum dominant colors in an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsSettings withImageProperties(DetectLabelsImagePropertiesSettings imageProperties) {
        setImageProperties(imageProperties);
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
        if (getGeneralLabels() != null)
            sb.append("GeneralLabels: ").append(getGeneralLabels()).append(",");
        if (getImageProperties() != null)
            sb.append("ImageProperties: ").append(getImageProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsSettings == false)
            return false;
        DetectLabelsSettings other = (DetectLabelsSettings) obj;
        if (other.getGeneralLabels() == null ^ this.getGeneralLabels() == null)
            return false;
        if (other.getGeneralLabels() != null && other.getGeneralLabels().equals(this.getGeneralLabels()) == false)
            return false;
        if (other.getImageProperties() == null ^ this.getImageProperties() == null)
            return false;
        if (other.getImageProperties() != null && other.getImageProperties().equals(this.getImageProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneralLabels() == null) ? 0 : getGeneralLabels().hashCode());
        hashCode = prime * hashCode + ((getImageProperties() == null) ? 0 : getImageProperties().hashCode());
        return hashCode;
    }

    @Override
    public DetectLabelsSettings clone() {
        try {
            return (DetectLabelsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DetectLabelsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
