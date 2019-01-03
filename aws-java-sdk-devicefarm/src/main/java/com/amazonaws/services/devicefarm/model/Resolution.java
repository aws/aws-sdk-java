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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the screen resolution of a device in height and width, expressed in pixels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Resolution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resolution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The screen resolution's width, expressed in pixels.
     * </p>
     */
    private Integer width;
    /**
     * <p>
     * The screen resolution's height, expressed in pixels.
     * </p>
     */
    private Integer height;

    /**
     * <p>
     * The screen resolution's width, expressed in pixels.
     * </p>
     * 
     * @param width
     *        The screen resolution's width, expressed in pixels.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * <p>
     * The screen resolution's width, expressed in pixels.
     * </p>
     * 
     * @return The screen resolution's width, expressed in pixels.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * <p>
     * The screen resolution's width, expressed in pixels.
     * </p>
     * 
     * @param width
     *        The screen resolution's width, expressed in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolution withWidth(Integer width) {
        setWidth(width);
        return this;
    }

    /**
     * <p>
     * The screen resolution's height, expressed in pixels.
     * </p>
     * 
     * @param height
     *        The screen resolution's height, expressed in pixels.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * <p>
     * The screen resolution's height, expressed in pixels.
     * </p>
     * 
     * @return The screen resolution's height, expressed in pixels.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * <p>
     * The screen resolution's height, expressed in pixels.
     * </p>
     * 
     * @param height
     *        The screen resolution's height, expressed in pixels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolution withHeight(Integer height) {
        setHeight(height);
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
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resolution == false)
            return false;
        Resolution other = (Resolution) obj;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        return hashCode;
    }

    @Override
    public Resolution clone() {
        try {
            return (Resolution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.ResolutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
