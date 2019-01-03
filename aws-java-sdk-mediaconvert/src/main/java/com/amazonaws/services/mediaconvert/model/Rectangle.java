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
 * Use Rectangle to identify a specific area of the video frame.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Rectangle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rectangle implements Serializable, Cloneable, StructuredPojo {

    /** Height of rectangle in pixels. Specify only even numbers. */
    private Integer height;
    /** Width of rectangle in pixels. Specify only even numbers. */
    private Integer width;
    /** The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers. */
    private Integer x;
    /** The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers. */
    private Integer y;

    /**
     * Height of rectangle in pixels. Specify only even numbers.
     * 
     * @param height
     *        Height of rectangle in pixels. Specify only even numbers.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Height of rectangle in pixels. Specify only even numbers.
     * 
     * @return Height of rectangle in pixels. Specify only even numbers.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * Height of rectangle in pixels. Specify only even numbers.
     * 
     * @param height
     *        Height of rectangle in pixels. Specify only even numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rectangle withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * Width of rectangle in pixels. Specify only even numbers.
     * 
     * @param width
     *        Width of rectangle in pixels. Specify only even numbers.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Width of rectangle in pixels. Specify only even numbers.
     * 
     * @return Width of rectangle in pixels. Specify only even numbers.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * Width of rectangle in pixels. Specify only even numbers.
     * 
     * @param width
     *        Width of rectangle in pixels. Specify only even numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rectangle withWidth(Integer width) {
        setWidth(width);
        return this;
    }

    /**
     * The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers.
     * 
     * @param x
     *        The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even
     *        numbers.
     */

    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers.
     * 
     * @return The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even
     *         numbers.
     */

    public Integer getX() {
        return this.x;
    }

    /**
     * The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers.
     * 
     * @param x
     *        The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even
     *        numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rectangle withX(Integer x) {
        setX(x);
        return this;
    }

    /**
     * The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers.
     * 
     * @param y
     *        The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even
     *        numbers.
     */

    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers.
     * 
     * @return The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even
     *         numbers.
     */

    public Integer getY() {
        return this.y;
    }

    /**
     * The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers.
     * 
     * @param y
     *        The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even
     *        numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rectangle withY(Integer y) {
        setY(y);
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
            sb.append("Width: ").append(getWidth()).append(",");
        if (getX() != null)
            sb.append("X: ").append(getX()).append(",");
        if (getY() != null)
            sb.append("Y: ").append(getY());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rectangle == false)
            return false;
        Rectangle other = (Rectangle) obj;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        return hashCode;
    }

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.RectangleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
