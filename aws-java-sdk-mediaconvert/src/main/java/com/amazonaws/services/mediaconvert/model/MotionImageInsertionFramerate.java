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
 * For motion overlays that don't have a built-in frame rate, specify the frame rate of the overlay in frames per
 * second, as a fraction. For example, specify 24 fps as 24/1. The overlay frame rate doesn't need to match the frame
 * rate of the underlying video.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MotionImageInsertionFramerate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MotionImageInsertionFramerate implements Serializable, Cloneable, StructuredPojo {

    /**
     * The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set
     * this value to 1.
     */
    private Integer framerateDenominator;
    /**
     * The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set
     * this value to 24.
     */
    private Integer framerateNumerator;

    /**
     * The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set
     * this value to 1.
     * 
     * @param framerateDenominator
     *        The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24
     *        fps, set this value to 1.
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set
     * this value to 1.
     * 
     * @return The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24
     *         fps, set this value to 1.
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set
     * this value to 1.
     * 
     * @param framerateDenominator
     *        The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24
     *        fps, set this value to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MotionImageInsertionFramerate withFramerateDenominator(Integer framerateDenominator) {
        setFramerateDenominator(framerateDenominator);
        return this;
    }

    /**
     * The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set
     * this value to 24.
     * 
     * @param framerateNumerator
     *        The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps,
     *        set this value to 24.
     */

    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set
     * this value to 24.
     * 
     * @return The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24
     *         fps, set this value to 24.
     */

    public Integer getFramerateNumerator() {
        return this.framerateNumerator;
    }

    /**
     * The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set
     * this value to 24.
     * 
     * @param framerateNumerator
     *        The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps,
     *        set this value to 24.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MotionImageInsertionFramerate withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
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
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MotionImageInsertionFramerate == false)
            return false;
        MotionImageInsertionFramerate other = (MotionImageInsertionFramerate) obj;
        if (other.getFramerateDenominator() == null ^ this.getFramerateDenominator() == null)
            return false;
        if (other.getFramerateDenominator() != null && other.getFramerateDenominator().equals(this.getFramerateDenominator()) == false)
            return false;
        if (other.getFramerateNumerator() == null ^ this.getFramerateNumerator() == null)
            return false;
        if (other.getFramerateNumerator() != null && other.getFramerateNumerator().equals(this.getFramerateNumerator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        return hashCode;
    }

    @Override
    public MotionImageInsertionFramerate clone() {
        try {
            return (MotionImageInsertionFramerate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MotionImageInsertionFramerateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
