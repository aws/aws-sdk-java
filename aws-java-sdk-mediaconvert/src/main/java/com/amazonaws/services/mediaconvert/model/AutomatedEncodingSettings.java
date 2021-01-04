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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Use automated encoding to have MediaConvert choose your encoding settings for you, based on characteristics of your
 * input video.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AutomatedEncodingSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomatedEncodingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on
     * characteristics of your input video. This feature optimizes video quality while minimizing the overall size of
     * your ABR package.
     */
    private AutomatedAbrSettings abrSettings;

    /**
     * Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on
     * characteristics of your input video. This feature optimizes video quality while minimizing the overall size of
     * your ABR package.
     * 
     * @param abrSettings
     *        Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically,
     *        based on characteristics of your input video. This feature optimizes video quality while minimizing the
     *        overall size of your ABR package.
     */

    public void setAbrSettings(AutomatedAbrSettings abrSettings) {
        this.abrSettings = abrSettings;
    }

    /**
     * Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on
     * characteristics of your input video. This feature optimizes video quality while minimizing the overall size of
     * your ABR package.
     * 
     * @return Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically,
     *         based on characteristics of your input video. This feature optimizes video quality while minimizing the
     *         overall size of your ABR package.
     */

    public AutomatedAbrSettings getAbrSettings() {
        return this.abrSettings;
    }

    /**
     * Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on
     * characteristics of your input video. This feature optimizes video quality while minimizing the overall size of
     * your ABR package.
     * 
     * @param abrSettings
     *        Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically,
     *        based on characteristics of your input video. This feature optimizes video quality while minimizing the
     *        overall size of your ABR package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedEncodingSettings withAbrSettings(AutomatedAbrSettings abrSettings) {
        setAbrSettings(abrSettings);
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
        if (getAbrSettings() != null)
            sb.append("AbrSettings: ").append(getAbrSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomatedEncodingSettings == false)
            return false;
        AutomatedEncodingSettings other = (AutomatedEncodingSettings) obj;
        if (other.getAbrSettings() == null ^ this.getAbrSettings() == null)
            return false;
        if (other.getAbrSettings() != null && other.getAbrSettings().equals(this.getAbrSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAbrSettings() == null) ? 0 : getAbrSettings().hashCode());
        return hashCode;
    }

    @Override
    public AutomatedEncodingSettings clone() {
        try {
            return (AutomatedEncodingSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AutomatedEncodingSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
