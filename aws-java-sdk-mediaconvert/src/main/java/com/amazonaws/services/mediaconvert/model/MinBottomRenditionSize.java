/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest
 * resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify
 * 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you specify a Min
 * top rendition size rule, the value that you specify for Min bottom rendition size must be less than, or equal to, Min
 * top rendition size.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MinBottomRenditionSize"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MinBottomRenditionSize implements Serializable, Cloneable, StructuredPojo {

    /** Use Height to define the video resolution height, in pixels, for this rule. */
    private Integer height;
    /** Use Width to define the video resolution width, in pixels, for this rule. */
    private Integer width;

    /**
     * Use Height to define the video resolution height, in pixels, for this rule.
     * 
     * @param height
     *        Use Height to define the video resolution height, in pixels, for this rule.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Use Height to define the video resolution height, in pixels, for this rule.
     * 
     * @return Use Height to define the video resolution height, in pixels, for this rule.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * Use Height to define the video resolution height, in pixels, for this rule.
     * 
     * @param height
     *        Use Height to define the video resolution height, in pixels, for this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MinBottomRenditionSize withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * Use Width to define the video resolution width, in pixels, for this rule.
     * 
     * @param width
     *        Use Width to define the video resolution width, in pixels, for this rule.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Use Width to define the video resolution width, in pixels, for this rule.
     * 
     * @return Use Width to define the video resolution width, in pixels, for this rule.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * Use Width to define the video resolution width, in pixels, for this rule.
     * 
     * @param width
     *        Use Width to define the video resolution width, in pixels, for this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MinBottomRenditionSize withWidth(Integer width) {
        setWidth(width);
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
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MinBottomRenditionSize == false)
            return false;
        MinBottomRenditionSize other = (MinBottomRenditionSize) obj;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public MinBottomRenditionSize clone() {
        try {
            return (MinBottomRenditionSize) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MinBottomRenditionSizeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
