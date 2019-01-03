/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The image format of an AWS Signer platform or profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningImageFormat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningImageFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The supported formats of an AWS Signer signing image.
     * </p>
     */
    private java.util.List<String> supportedFormats;
    /**
     * <p>
     * The default format of an AWS Signer signing image.
     * </p>
     */
    private String defaultFormat;

    /**
     * <p>
     * The supported formats of an AWS Signer signing image.
     * </p>
     * 
     * @return The supported formats of an AWS Signer signing image.
     * @see ImageFormat
     */

    public java.util.List<String> getSupportedFormats() {
        return supportedFormats;
    }

    /**
     * <p>
     * The supported formats of an AWS Signer signing image.
     * </p>
     * 
     * @param supportedFormats
     *        The supported formats of an AWS Signer signing image.
     * @see ImageFormat
     */

    public void setSupportedFormats(java.util.Collection<String> supportedFormats) {
        if (supportedFormats == null) {
            this.supportedFormats = null;
            return;
        }

        this.supportedFormats = new java.util.ArrayList<String>(supportedFormats);
    }

    /**
     * <p>
     * The supported formats of an AWS Signer signing image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedFormats(java.util.Collection)} or {@link #withSupportedFormats(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param supportedFormats
     *        The supported formats of an AWS Signer signing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public SigningImageFormat withSupportedFormats(String... supportedFormats) {
        if (this.supportedFormats == null) {
            setSupportedFormats(new java.util.ArrayList<String>(supportedFormats.length));
        }
        for (String ele : supportedFormats) {
            this.supportedFormats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported formats of an AWS Signer signing image.
     * </p>
     * 
     * @param supportedFormats
     *        The supported formats of an AWS Signer signing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public SigningImageFormat withSupportedFormats(java.util.Collection<String> supportedFormats) {
        setSupportedFormats(supportedFormats);
        return this;
    }

    /**
     * <p>
     * The supported formats of an AWS Signer signing image.
     * </p>
     * 
     * @param supportedFormats
     *        The supported formats of an AWS Signer signing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public SigningImageFormat withSupportedFormats(ImageFormat... supportedFormats) {
        java.util.ArrayList<String> supportedFormatsCopy = new java.util.ArrayList<String>(supportedFormats.length);
        for (ImageFormat value : supportedFormats) {
            supportedFormatsCopy.add(value.toString());
        }
        if (getSupportedFormats() == null) {
            setSupportedFormats(supportedFormatsCopy);
        } else {
            getSupportedFormats().addAll(supportedFormatsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The default format of an AWS Signer signing image.
     * </p>
     * 
     * @param defaultFormat
     *        The default format of an AWS Signer signing image.
     * @see ImageFormat
     */

    public void setDefaultFormat(String defaultFormat) {
        this.defaultFormat = defaultFormat;
    }

    /**
     * <p>
     * The default format of an AWS Signer signing image.
     * </p>
     * 
     * @return The default format of an AWS Signer signing image.
     * @see ImageFormat
     */

    public String getDefaultFormat() {
        return this.defaultFormat;
    }

    /**
     * <p>
     * The default format of an AWS Signer signing image.
     * </p>
     * 
     * @param defaultFormat
     *        The default format of an AWS Signer signing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public SigningImageFormat withDefaultFormat(String defaultFormat) {
        setDefaultFormat(defaultFormat);
        return this;
    }

    /**
     * <p>
     * The default format of an AWS Signer signing image.
     * </p>
     * 
     * @param defaultFormat
     *        The default format of an AWS Signer signing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public SigningImageFormat withDefaultFormat(ImageFormat defaultFormat) {
        this.defaultFormat = defaultFormat.toString();
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
        if (getSupportedFormats() != null)
            sb.append("SupportedFormats: ").append(getSupportedFormats()).append(",");
        if (getDefaultFormat() != null)
            sb.append("DefaultFormat: ").append(getDefaultFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningImageFormat == false)
            return false;
        SigningImageFormat other = (SigningImageFormat) obj;
        if (other.getSupportedFormats() == null ^ this.getSupportedFormats() == null)
            return false;
        if (other.getSupportedFormats() != null && other.getSupportedFormats().equals(this.getSupportedFormats()) == false)
            return false;
        if (other.getDefaultFormat() == null ^ this.getDefaultFormat() == null)
            return false;
        if (other.getDefaultFormat() != null && other.getDefaultFormat().equals(this.getDefaultFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportedFormats() == null) ? 0 : getSupportedFormats().hashCode());
        hashCode = prime * hashCode + ((getDefaultFormat() == null) ? 0 : getDefaultFormat().hashCode());
        return hashCode;
    }

    @Override
    public SigningImageFormat clone() {
        try {
            return (SigningImageFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningImageFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
