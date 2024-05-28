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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Custom 3D lut settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ColorConversion3DLUTSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorConversion3DLUTSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the input file S3, HTTP, or HTTPS URL for your 3D LUT .cube file. Note that MediaConvert accepts 3D LUT
     * files up to 8MB in size.
     */
    private String fileInput;
    /** Specify which inputs use this 3D LUT, according to their color space. */
    private String inputColorSpace;
    /**
     * Specify which inputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65 (HDR)
     * inputs with a specific mastering luminance: Enter an integer from 0 to 2147483647, corresponding to the input's
     * Maximum luminance value. To apply this 3D LUT to any input regardless of its luminance: Leave blank, or enter 0.
     */
    private Integer inputMasteringLuminance;
    /** Specify which outputs use this 3D LUT, according to their color space. */
    private String outputColorSpace;
    /**
     * Specify which outputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65 (HDR)
     * outputs with a specific luminance: Enter an integer from 0 to 2147483647, corresponding to the output's
     * luminance. To apply this 3D LUT to any output regardless of its luminance: Leave blank, or enter 0.
     */
    private Integer outputMasteringLuminance;

    /**
     * Specify the input file S3, HTTP, or HTTPS URL for your 3D LUT .cube file. Note that MediaConvert accepts 3D LUT
     * files up to 8MB in size.
     * 
     * @param fileInput
     *        Specify the input file S3, HTTP, or HTTPS URL for your 3D LUT .cube file. Note that MediaConvert accepts
     *        3D LUT files up to 8MB in size.
     */

    public void setFileInput(String fileInput) {
        this.fileInput = fileInput;
    }

    /**
     * Specify the input file S3, HTTP, or HTTPS URL for your 3D LUT .cube file. Note that MediaConvert accepts 3D LUT
     * files up to 8MB in size.
     * 
     * @return Specify the input file S3, HTTP, or HTTPS URL for your 3D LUT .cube file. Note that MediaConvert accepts
     *         3D LUT files up to 8MB in size.
     */

    public String getFileInput() {
        return this.fileInput;
    }

    /**
     * Specify the input file S3, HTTP, or HTTPS URL for your 3D LUT .cube file. Note that MediaConvert accepts 3D LUT
     * files up to 8MB in size.
     * 
     * @param fileInput
     *        Specify the input file S3, HTTP, or HTTPS URL for your 3D LUT .cube file. Note that MediaConvert accepts
     *        3D LUT files up to 8MB in size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorConversion3DLUTSetting withFileInput(String fileInput) {
        setFileInput(fileInput);
        return this;
    }

    /**
     * Specify which inputs use this 3D LUT, according to their color space.
     * 
     * @param inputColorSpace
     *        Specify which inputs use this 3D LUT, according to their color space.
     * @see ColorSpace
     */

    public void setInputColorSpace(String inputColorSpace) {
        this.inputColorSpace = inputColorSpace;
    }

    /**
     * Specify which inputs use this 3D LUT, according to their color space.
     * 
     * @return Specify which inputs use this 3D LUT, according to their color space.
     * @see ColorSpace
     */

    public String getInputColorSpace() {
        return this.inputColorSpace;
    }

    /**
     * Specify which inputs use this 3D LUT, according to their color space.
     * 
     * @param inputColorSpace
     *        Specify which inputs use this 3D LUT, according to their color space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public ColorConversion3DLUTSetting withInputColorSpace(String inputColorSpace) {
        setInputColorSpace(inputColorSpace);
        return this;
    }

    /**
     * Specify which inputs use this 3D LUT, according to their color space.
     * 
     * @param inputColorSpace
     *        Specify which inputs use this 3D LUT, according to their color space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public ColorConversion3DLUTSetting withInputColorSpace(ColorSpace inputColorSpace) {
        this.inputColorSpace = inputColorSpace.toString();
        return this;
    }

    /**
     * Specify which inputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65 (HDR)
     * inputs with a specific mastering luminance: Enter an integer from 0 to 2147483647, corresponding to the input's
     * Maximum luminance value. To apply this 3D LUT to any input regardless of its luminance: Leave blank, or enter 0.
     * 
     * @param inputMasteringLuminance
     *        Specify which inputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65
     *        (HDR) inputs with a specific mastering luminance: Enter an integer from 0 to 2147483647, corresponding to
     *        the input's Maximum luminance value. To apply this 3D LUT to any input regardless of its luminance: Leave
     *        blank, or enter 0.
     */

    public void setInputMasteringLuminance(Integer inputMasteringLuminance) {
        this.inputMasteringLuminance = inputMasteringLuminance;
    }

    /**
     * Specify which inputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65 (HDR)
     * inputs with a specific mastering luminance: Enter an integer from 0 to 2147483647, corresponding to the input's
     * Maximum luminance value. To apply this 3D LUT to any input regardless of its luminance: Leave blank, or enter 0.
     * 
     * @return Specify which inputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or
     *         P3D65 (HDR) inputs with a specific mastering luminance: Enter an integer from 0 to 2147483647,
     *         corresponding to the input's Maximum luminance value. To apply this 3D LUT to any input regardless of its
     *         luminance: Leave blank, or enter 0.
     */

    public Integer getInputMasteringLuminance() {
        return this.inputMasteringLuminance;
    }

    /**
     * Specify which inputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65 (HDR)
     * inputs with a specific mastering luminance: Enter an integer from 0 to 2147483647, corresponding to the input's
     * Maximum luminance value. To apply this 3D LUT to any input regardless of its luminance: Leave blank, or enter 0.
     * 
     * @param inputMasteringLuminance
     *        Specify which inputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65
     *        (HDR) inputs with a specific mastering luminance: Enter an integer from 0 to 2147483647, corresponding to
     *        the input's Maximum luminance value. To apply this 3D LUT to any input regardless of its luminance: Leave
     *        blank, or enter 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorConversion3DLUTSetting withInputMasteringLuminance(Integer inputMasteringLuminance) {
        setInputMasteringLuminance(inputMasteringLuminance);
        return this;
    }

    /**
     * Specify which outputs use this 3D LUT, according to their color space.
     * 
     * @param outputColorSpace
     *        Specify which outputs use this 3D LUT, according to their color space.
     * @see ColorSpace
     */

    public void setOutputColorSpace(String outputColorSpace) {
        this.outputColorSpace = outputColorSpace;
    }

    /**
     * Specify which outputs use this 3D LUT, according to their color space.
     * 
     * @return Specify which outputs use this 3D LUT, according to their color space.
     * @see ColorSpace
     */

    public String getOutputColorSpace() {
        return this.outputColorSpace;
    }

    /**
     * Specify which outputs use this 3D LUT, according to their color space.
     * 
     * @param outputColorSpace
     *        Specify which outputs use this 3D LUT, according to their color space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public ColorConversion3DLUTSetting withOutputColorSpace(String outputColorSpace) {
        setOutputColorSpace(outputColorSpace);
        return this;
    }

    /**
     * Specify which outputs use this 3D LUT, according to their color space.
     * 
     * @param outputColorSpace
     *        Specify which outputs use this 3D LUT, according to their color space.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public ColorConversion3DLUTSetting withOutputColorSpace(ColorSpace outputColorSpace) {
        this.outputColorSpace = outputColorSpace.toString();
        return this;
    }

    /**
     * Specify which outputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65 (HDR)
     * outputs with a specific luminance: Enter an integer from 0 to 2147483647, corresponding to the output's
     * luminance. To apply this 3D LUT to any output regardless of its luminance: Leave blank, or enter 0.
     * 
     * @param outputMasteringLuminance
     *        Specify which outputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or
     *        P3D65 (HDR) outputs with a specific luminance: Enter an integer from 0 to 2147483647, corresponding to the
     *        output's luminance. To apply this 3D LUT to any output regardless of its luminance: Leave blank, or enter
     *        0.
     */

    public void setOutputMasteringLuminance(Integer outputMasteringLuminance) {
        this.outputMasteringLuminance = outputMasteringLuminance;
    }

    /**
     * Specify which outputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65 (HDR)
     * outputs with a specific luminance: Enter an integer from 0 to 2147483647, corresponding to the output's
     * luminance. To apply this 3D LUT to any output regardless of its luminance: Leave blank, or enter 0.
     * 
     * @return Specify which outputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or
     *         P3D65 (HDR) outputs with a specific luminance: Enter an integer from 0 to 2147483647, corresponding to
     *         the output's luminance. To apply this 3D LUT to any output regardless of its luminance: Leave blank, or
     *         enter 0.
     */

    public Integer getOutputMasteringLuminance() {
        return this.outputMasteringLuminance;
    }

    /**
     * Specify which outputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or P3D65 (HDR)
     * outputs with a specific luminance: Enter an integer from 0 to 2147483647, corresponding to the output's
     * luminance. To apply this 3D LUT to any output regardless of its luminance: Leave blank, or enter 0.
     * 
     * @param outputMasteringLuminance
     *        Specify which outputs use this 3D LUT, according to their luminance. To apply this 3D LUT to HDR10 or
     *        P3D65 (HDR) outputs with a specific luminance: Enter an integer from 0 to 2147483647, corresponding to the
     *        output's luminance. To apply this 3D LUT to any output regardless of its luminance: Leave blank, or enter
     *        0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorConversion3DLUTSetting withOutputMasteringLuminance(Integer outputMasteringLuminance) {
        setOutputMasteringLuminance(outputMasteringLuminance);
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
        if (getFileInput() != null)
            sb.append("FileInput: ").append(getFileInput()).append(",");
        if (getInputColorSpace() != null)
            sb.append("InputColorSpace: ").append(getInputColorSpace()).append(",");
        if (getInputMasteringLuminance() != null)
            sb.append("InputMasteringLuminance: ").append(getInputMasteringLuminance()).append(",");
        if (getOutputColorSpace() != null)
            sb.append("OutputColorSpace: ").append(getOutputColorSpace()).append(",");
        if (getOutputMasteringLuminance() != null)
            sb.append("OutputMasteringLuminance: ").append(getOutputMasteringLuminance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColorConversion3DLUTSetting == false)
            return false;
        ColorConversion3DLUTSetting other = (ColorConversion3DLUTSetting) obj;
        if (other.getFileInput() == null ^ this.getFileInput() == null)
            return false;
        if (other.getFileInput() != null && other.getFileInput().equals(this.getFileInput()) == false)
            return false;
        if (other.getInputColorSpace() == null ^ this.getInputColorSpace() == null)
            return false;
        if (other.getInputColorSpace() != null && other.getInputColorSpace().equals(this.getInputColorSpace()) == false)
            return false;
        if (other.getInputMasteringLuminance() == null ^ this.getInputMasteringLuminance() == null)
            return false;
        if (other.getInputMasteringLuminance() != null && other.getInputMasteringLuminance().equals(this.getInputMasteringLuminance()) == false)
            return false;
        if (other.getOutputColorSpace() == null ^ this.getOutputColorSpace() == null)
            return false;
        if (other.getOutputColorSpace() != null && other.getOutputColorSpace().equals(this.getOutputColorSpace()) == false)
            return false;
        if (other.getOutputMasteringLuminance() == null ^ this.getOutputMasteringLuminance() == null)
            return false;
        if (other.getOutputMasteringLuminance() != null && other.getOutputMasteringLuminance().equals(this.getOutputMasteringLuminance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileInput() == null) ? 0 : getFileInput().hashCode());
        hashCode = prime * hashCode + ((getInputColorSpace() == null) ? 0 : getInputColorSpace().hashCode());
        hashCode = prime * hashCode + ((getInputMasteringLuminance() == null) ? 0 : getInputMasteringLuminance().hashCode());
        hashCode = prime * hashCode + ((getOutputColorSpace() == null) ? 0 : getOutputColorSpace().hashCode());
        hashCode = prime * hashCode + ((getOutputMasteringLuminance() == null) ? 0 : getOutputMasteringLuminance().hashCode());
        return hashCode;
    }

    @Override
    public ColorConversion3DLUTSetting clone() {
        try {
            return (ColorConversion3DLUTSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ColorConversion3DLUTSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
