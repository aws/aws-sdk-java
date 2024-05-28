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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Property of encoderSettings. Controls color conversion when you are using 3D LUT files to perform color conversion on
 * video.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ColorCorrectionSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorCorrectionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on video.
     * Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an input color space
     * to an output color space), and the input/output combination that this 3D LUT file applies to. MediaLive reads the
     * color space in the input metadata, determines the color space that you have specified for the output, and finds
     * and uses the LUT file that applies to this combination.
     */
    private java.util.List<ColorCorrection> globalColorCorrections;

    /**
     * An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on video.
     * Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an input color space
     * to an output color space), and the input/output combination that this 3D LUT file applies to. MediaLive reads the
     * color space in the input metadata, determines the color space that you have specified for the output, and finds
     * and uses the LUT file that applies to this combination.
     * 
     * @return An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on
     *         video. Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an
     *         input color space to an output color space), and the input/output combination that this 3D LUT file
     *         applies to. MediaLive reads the color space in the input metadata, determines the color space that you
     *         have specified for the output, and finds and uses the LUT file that applies to this combination.
     */

    public java.util.List<ColorCorrection> getGlobalColorCorrections() {
        return globalColorCorrections;
    }

    /**
     * An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on video.
     * Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an input color space
     * to an output color space), and the input/output combination that this 3D LUT file applies to. MediaLive reads the
     * color space in the input metadata, determines the color space that you have specified for the output, and finds
     * and uses the LUT file that applies to this combination.
     * 
     * @param globalColorCorrections
     *        An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on
     *        video. Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an
     *        input color space to an output color space), and the input/output combination that this 3D LUT file
     *        applies to. MediaLive reads the color space in the input metadata, determines the color space that you
     *        have specified for the output, and finds and uses the LUT file that applies to this combination.
     */

    public void setGlobalColorCorrections(java.util.Collection<ColorCorrection> globalColorCorrections) {
        if (globalColorCorrections == null) {
            this.globalColorCorrections = null;
            return;
        }

        this.globalColorCorrections = new java.util.ArrayList<ColorCorrection>(globalColorCorrections);
    }

    /**
     * An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on video.
     * Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an input color space
     * to an output color space), and the input/output combination that this 3D LUT file applies to. MediaLive reads the
     * color space in the input metadata, determines the color space that you have specified for the output, and finds
     * and uses the LUT file that applies to this combination.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalColorCorrections(java.util.Collection)} or
     * {@link #withGlobalColorCorrections(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalColorCorrections
     *        An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on
     *        video. Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an
     *        input color space to an output color space), and the input/output combination that this 3D LUT file
     *        applies to. MediaLive reads the color space in the input metadata, determines the color space that you
     *        have specified for the output, and finds and uses the LUT file that applies to this combination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorCorrectionSettings withGlobalColorCorrections(ColorCorrection... globalColorCorrections) {
        if (this.globalColorCorrections == null) {
            setGlobalColorCorrections(new java.util.ArrayList<ColorCorrection>(globalColorCorrections.length));
        }
        for (ColorCorrection ele : globalColorCorrections) {
            this.globalColorCorrections.add(ele);
        }
        return this;
    }

    /**
     * An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on video.
     * Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an input color space
     * to an output color space), and the input/output combination that this 3D LUT file applies to. MediaLive reads the
     * color space in the input metadata, determines the color space that you have specified for the output, and finds
     * and uses the LUT file that applies to this combination.
     * 
     * @param globalColorCorrections
     *        An array of colorCorrections that applies when you are using 3D LUT files to perform color conversion on
     *        video. Each colorCorrection contains one 3D LUT file (that defines the color mapping for converting an
     *        input color space to an output color space), and the input/output combination that this 3D LUT file
     *        applies to. MediaLive reads the color space in the input metadata, determines the color space that you
     *        have specified for the output, and finds and uses the LUT file that applies to this combination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorCorrectionSettings withGlobalColorCorrections(java.util.Collection<ColorCorrection> globalColorCorrections) {
        setGlobalColorCorrections(globalColorCorrections);
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
        if (getGlobalColorCorrections() != null)
            sb.append("GlobalColorCorrections: ").append(getGlobalColorCorrections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColorCorrectionSettings == false)
            return false;
        ColorCorrectionSettings other = (ColorCorrectionSettings) obj;
        if (other.getGlobalColorCorrections() == null ^ this.getGlobalColorCorrections() == null)
            return false;
        if (other.getGlobalColorCorrections() != null && other.getGlobalColorCorrections().equals(this.getGlobalColorCorrections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalColorCorrections() == null) ? 0 : getGlobalColorCorrections().hashCode());
        return hashCode;
    }

    @Override
    public ColorCorrectionSettings clone() {
        try {
            return (ColorCorrectionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ColorCorrectionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
