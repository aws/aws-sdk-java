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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the image frame (pixel data) identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ImageFrameInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageFrameInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image frame (pixel data) identifier.
     * </p>
     */
    private String imageFrameId;

    /**
     * <p>
     * The image frame (pixel data) identifier.
     * </p>
     * 
     * @param imageFrameId
     *        The image frame (pixel data) identifier.
     */

    public void setImageFrameId(String imageFrameId) {
        this.imageFrameId = imageFrameId;
    }

    /**
     * <p>
     * The image frame (pixel data) identifier.
     * </p>
     * 
     * @return The image frame (pixel data) identifier.
     */

    public String getImageFrameId() {
        return this.imageFrameId;
    }

    /**
     * <p>
     * The image frame (pixel data) identifier.
     * </p>
     * 
     * @param imageFrameId
     *        The image frame (pixel data) identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageFrameInformation withImageFrameId(String imageFrameId) {
        setImageFrameId(imageFrameId);
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
        if (getImageFrameId() != null)
            sb.append("ImageFrameId: ").append(getImageFrameId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageFrameInformation == false)
            return false;
        ImageFrameInformation other = (ImageFrameInformation) obj;
        if (other.getImageFrameId() == null ^ this.getImageFrameId() == null)
            return false;
        if (other.getImageFrameId() != null && other.getImageFrameId().equals(this.getImageFrameId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageFrameId() == null) ? 0 : getImageFrameId().hashCode());
        return hashCode;
    }

    @Override
    public ImageFrameInformation clone() {
        try {
            return (ImageFrameInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.ImageFrameInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
