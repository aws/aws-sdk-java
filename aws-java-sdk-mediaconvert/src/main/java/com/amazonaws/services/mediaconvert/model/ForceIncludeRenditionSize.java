/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Use Force include renditions to specify one or more resolutions to include your ABR stack. * (Recommended) To
 * optimize automated ABR, specify as few resolutions as possible. * (Required) The number of resolutions that you
 * specify must be equal to, or less than, the Max renditions setting. * If you specify a Min top rendition size rule,
 * specify at least one resolution that is equal to, or greater than, Min top rendition size. * If you specify a Min
 * bottom rendition size rule, only specify resolutions that are equal to, or greater than, Min bottom rendition size. *
 * If you specify a Force include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The
 * ABR stack may include other resolutions that you do not specify here, depending on the Max renditions setting.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ForceIncludeRenditionSize"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForceIncludeRenditionSize implements Serializable, Cloneable, StructuredPojo {

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

    public ForceIncludeRenditionSize withHeight(Integer height) {
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

    public ForceIncludeRenditionSize withWidth(Integer width) {
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

        if (obj instanceof ForceIncludeRenditionSize == false)
            return false;
        ForceIncludeRenditionSize other = (ForceIncludeRenditionSize) obj;
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
    public ForceIncludeRenditionSize clone() {
        try {
            return (ForceIncludeRenditionSize) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ForceIncludeRenditionSizeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
