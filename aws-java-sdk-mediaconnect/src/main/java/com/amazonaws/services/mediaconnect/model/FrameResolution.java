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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The frame resolution used by the video stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/FrameResolution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrameResolution implements Serializable, Cloneable, StructuredPojo {

    /** The number of pixels in the height of the video frame. */
    private Integer frameHeight;
    /** The number of pixels in the width of the video frame. */
    private Integer frameWidth;

    /**
     * The number of pixels in the height of the video frame.
     * 
     * @param frameHeight
     *        The number of pixels in the height of the video frame.
     */

    public void setFrameHeight(Integer frameHeight) {
        this.frameHeight = frameHeight;
    }

    /**
     * The number of pixels in the height of the video frame.
     * 
     * @return The number of pixels in the height of the video frame.
     */

    public Integer getFrameHeight() {
        return this.frameHeight;
    }

    /**
     * The number of pixels in the height of the video frame.
     * 
     * @param frameHeight
     *        The number of pixels in the height of the video frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameResolution withFrameHeight(Integer frameHeight) {
        setFrameHeight(frameHeight);
        return this;
    }

    /**
     * The number of pixels in the width of the video frame.
     * 
     * @param frameWidth
     *        The number of pixels in the width of the video frame.
     */

    public void setFrameWidth(Integer frameWidth) {
        this.frameWidth = frameWidth;
    }

    /**
     * The number of pixels in the width of the video frame.
     * 
     * @return The number of pixels in the width of the video frame.
     */

    public Integer getFrameWidth() {
        return this.frameWidth;
    }

    /**
     * The number of pixels in the width of the video frame.
     * 
     * @param frameWidth
     *        The number of pixels in the width of the video frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameResolution withFrameWidth(Integer frameWidth) {
        setFrameWidth(frameWidth);
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
        if (getFrameHeight() != null)
            sb.append("FrameHeight: ").append(getFrameHeight()).append(",");
        if (getFrameWidth() != null)
            sb.append("FrameWidth: ").append(getFrameWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameResolution == false)
            return false;
        FrameResolution other = (FrameResolution) obj;
        if (other.getFrameHeight() == null ^ this.getFrameHeight() == null)
            return false;
        if (other.getFrameHeight() != null && other.getFrameHeight().equals(this.getFrameHeight()) == false)
            return false;
        if (other.getFrameWidth() == null ^ this.getFrameWidth() == null)
            return false;
        if (other.getFrameWidth() != null && other.getFrameWidth().equals(this.getFrameWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameHeight() == null) ? 0 : getFrameHeight().hashCode());
        hashCode = prime * hashCode + ((getFrameWidth() == null) ? 0 : getFrameWidth().hashCode());
        return hashCode;
    }

    @Override
    public FrameResolution clone() {
        try {
            return (FrameResolution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.FrameResolutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
