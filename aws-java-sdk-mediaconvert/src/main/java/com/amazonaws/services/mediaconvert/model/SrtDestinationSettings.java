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
 * SRT Destination Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/SrtDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SrtDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from the
     * captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output captions.
     */
    private String stylePassthrough;

    /**
     * Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from the
     * captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output captions.
     * 
     * @param stylePassthrough
     *        Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from the
     *        captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output captions.
     * @see SrtStylePassthrough
     */

    public void setStylePassthrough(String stylePassthrough) {
        this.stylePassthrough = stylePassthrough;
    }

    /**
     * Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from the
     * captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output captions.
     * 
     * @return Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from
     *         the captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output
     *         captions.
     * @see SrtStylePassthrough
     */

    public String getStylePassthrough() {
        return this.stylePassthrough;
    }

    /**
     * Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from the
     * captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output captions.
     * 
     * @param stylePassthrough
     *        Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from the
     *        captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SrtStylePassthrough
     */

    public SrtDestinationSettings withStylePassthrough(String stylePassthrough) {
        setStylePassthrough(stylePassthrough);
        return this;
    }

    /**
     * Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from the
     * captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output captions.
     * 
     * @param stylePassthrough
     *        Choose Enabled (ENABLED) to have MediaConvert use the font style, color, and position information from the
     *        captions source in the input. Keep the default value, Disabled (DISABLED), for simplified output captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SrtStylePassthrough
     */

    public SrtDestinationSettings withStylePassthrough(SrtStylePassthrough stylePassthrough) {
        this.stylePassthrough = stylePassthrough.toString();
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
        if (getStylePassthrough() != null)
            sb.append("StylePassthrough: ").append(getStylePassthrough());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SrtDestinationSettings == false)
            return false;
        SrtDestinationSettings other = (SrtDestinationSettings) obj;
        if (other.getStylePassthrough() == null ^ this.getStylePassthrough() == null)
            return false;
        if (other.getStylePassthrough() != null && other.getStylePassthrough().equals(this.getStylePassthrough()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStylePassthrough() == null) ? 0 : getStylePassthrough().hashCode());
        return hashCode;
    }

    @Override
    public SrtDestinationSettings clone() {
        try {
            return (SrtDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.SrtDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
