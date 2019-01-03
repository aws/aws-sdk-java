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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for Avail Blanking
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AvailBlanking" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailBlanking implements Serializable, Cloneable, StructuredPojo {

    /** Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported. */
    private String availBlankingImage;

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @param availBlankingImage
     *        Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     */

    public void setAvailBlankingImage(String availBlankingImage) {
        this.availBlankingImage = availBlankingImage;
    }

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @return Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     */

    public String getAvailBlankingImage() {
        return this.availBlankingImage;
    }

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * 
     * @param availBlankingImage
     *        Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailBlanking withAvailBlankingImage(String availBlankingImage) {
        setAvailBlankingImage(availBlankingImage);
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
        if (getAvailBlankingImage() != null)
            sb.append("AvailBlankingImage: ").append(getAvailBlankingImage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailBlanking == false)
            return false;
        AvailBlanking other = (AvailBlanking) obj;
        if (other.getAvailBlankingImage() == null ^ this.getAvailBlankingImage() == null)
            return false;
        if (other.getAvailBlankingImage() != null && other.getAvailBlankingImage().equals(this.getAvailBlankingImage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailBlankingImage() == null) ? 0 : getAvailBlankingImage().hashCode());
        return hashCode;
    }

    @Override
    public AvailBlanking clone() {
        try {
            return (AvailBlanking) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AvailBlankingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
