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
 * Property of ColorCorrectionSettings. Used for custom color space conversion. The object identifies one 3D LUT file
 * and specifies the input/output color space combination that the file will be used for.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ColorCorrection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorCorrection implements Serializable, Cloneable, StructuredPojo {

    /** The color space of the input. */
    private String inputColorSpace;
    /** The color space of the output. */
    private String outputColorSpace;
    /** The URI of the 3D LUT file. The protocol must be 's3:' or 's3ssl:':. */
    private String uri;

    /**
     * The color space of the input.
     * 
     * @param inputColorSpace
     *        The color space of the input.
     * @see ColorSpace
     */

    public void setInputColorSpace(String inputColorSpace) {
        this.inputColorSpace = inputColorSpace;
    }

    /**
     * The color space of the input.
     * 
     * @return The color space of the input.
     * @see ColorSpace
     */

    public String getInputColorSpace() {
        return this.inputColorSpace;
    }

    /**
     * The color space of the input.
     * 
     * @param inputColorSpace
     *        The color space of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public ColorCorrection withInputColorSpace(String inputColorSpace) {
        setInputColorSpace(inputColorSpace);
        return this;
    }

    /**
     * The color space of the input.
     * 
     * @param inputColorSpace
     *        The color space of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public ColorCorrection withInputColorSpace(ColorSpace inputColorSpace) {
        this.inputColorSpace = inputColorSpace.toString();
        return this;
    }

    /**
     * The color space of the output.
     * 
     * @param outputColorSpace
     *        The color space of the output.
     * @see ColorSpace
     */

    public void setOutputColorSpace(String outputColorSpace) {
        this.outputColorSpace = outputColorSpace;
    }

    /**
     * The color space of the output.
     * 
     * @return The color space of the output.
     * @see ColorSpace
     */

    public String getOutputColorSpace() {
        return this.outputColorSpace;
    }

    /**
     * The color space of the output.
     * 
     * @param outputColorSpace
     *        The color space of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public ColorCorrection withOutputColorSpace(String outputColorSpace) {
        setOutputColorSpace(outputColorSpace);
        return this;
    }

    /**
     * The color space of the output.
     * 
     * @param outputColorSpace
     *        The color space of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public ColorCorrection withOutputColorSpace(ColorSpace outputColorSpace) {
        this.outputColorSpace = outputColorSpace.toString();
        return this;
    }

    /**
     * The URI of the 3D LUT file. The protocol must be 's3:' or 's3ssl:':.
     * 
     * @param uri
     *        The URI of the 3D LUT file. The protocol must be 's3:' or 's3ssl:':.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * The URI of the 3D LUT file. The protocol must be 's3:' or 's3ssl:':.
     * 
     * @return The URI of the 3D LUT file. The protocol must be 's3:' or 's3ssl:':.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * The URI of the 3D LUT file. The protocol must be 's3:' or 's3ssl:':.
     * 
     * @param uri
     *        The URI of the 3D LUT file. The protocol must be 's3:' or 's3ssl:':.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorCorrection withUri(String uri) {
        setUri(uri);
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
        if (getInputColorSpace() != null)
            sb.append("InputColorSpace: ").append(getInputColorSpace()).append(",");
        if (getOutputColorSpace() != null)
            sb.append("OutputColorSpace: ").append(getOutputColorSpace()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColorCorrection == false)
            return false;
        ColorCorrection other = (ColorCorrection) obj;
        if (other.getInputColorSpace() == null ^ this.getInputColorSpace() == null)
            return false;
        if (other.getInputColorSpace() != null && other.getInputColorSpace().equals(this.getInputColorSpace()) == false)
            return false;
        if (other.getOutputColorSpace() == null ^ this.getOutputColorSpace() == null)
            return false;
        if (other.getOutputColorSpace() != null && other.getOutputColorSpace().equals(this.getOutputColorSpace()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputColorSpace() == null) ? 0 : getInputColorSpace().hashCode());
        hashCode = prime * hashCode + ((getOutputColorSpace() == null) ? 0 : getOutputColorSpace().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        return hashCode;
    }

    @Override
    public ColorCorrection clone() {
        try {
            return (ColorCorrection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ColorCorrectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
