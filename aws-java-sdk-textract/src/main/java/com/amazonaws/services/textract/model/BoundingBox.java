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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The bounding box around the recognized text, key, value, table or table cell on a document page. The
 * <code>left</code> (x-coordinate) and <code>top</code> (y-coordinate) are coordinates that represent the top and left
 * sides of the bounding box. Note that the upper-left corner of the image is the origin (0,0).
 * </p>
 * <p>
 * The <code>top</code> and <code>left</code> values returned are ratios of the overall document page size. For example,
 * if the input image is 700 x 200 pixels, and the top-left coordinate of the bounding box is 350 x 50 pixels, the API
 * returns a <code>left</code> value of 0.5 (350/700) and a <code>top</code> value of 0.25 (50/200).
 * </p>
 * <p>
 * The <code>width</code> and <code>height</code> values represent the dimensions of the bounding box as a ratio of the
 * overall document page dimension. For example, if the document page size is 700 x 200 pixels, and the bounding box
 * width is 70 pixels, the width returned is 0.1.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/BoundingBox" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BoundingBox implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The width of the bounding box as a ratio of the overall document page width.
     * </p>
     */
    private Float width;
    /**
     * <p>
     * The height of the bounding box as a ratio of the overall document page height.
     * </p>
     */
    private Float height;
    /**
     * <p>
     * The left coordinate of the bounding box as a ratio of overall document page width.
     * </p>
     */
    private Float left;
    /**
     * <p>
     * The top coordinate of the bounding box as a ratio of overall document page height.
     * </p>
     */
    private Float top;

    /**
     * <p>
     * The width of the bounding box as a ratio of the overall document page width.
     * </p>
     * 
     * @param width
     *        The width of the bounding box as a ratio of the overall document page width.
     */

    public void setWidth(Float width) {
        this.width = width;
    }

    /**
     * <p>
     * The width of the bounding box as a ratio of the overall document page width.
     * </p>
     * 
     * @return The width of the bounding box as a ratio of the overall document page width.
     */

    public Float getWidth() {
        return this.width;
    }

    /**
     * <p>
     * The width of the bounding box as a ratio of the overall document page width.
     * </p>
     * 
     * @param width
     *        The width of the bounding box as a ratio of the overall document page width.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoundingBox withWidth(Float width) {
        setWidth(width);
        return this;
    }

    /**
     * <p>
     * The height of the bounding box as a ratio of the overall document page height.
     * </p>
     * 
     * @param height
     *        The height of the bounding box as a ratio of the overall document page height.
     */

    public void setHeight(Float height) {
        this.height = height;
    }

    /**
     * <p>
     * The height of the bounding box as a ratio of the overall document page height.
     * </p>
     * 
     * @return The height of the bounding box as a ratio of the overall document page height.
     */

    public Float getHeight() {
        return this.height;
    }

    /**
     * <p>
     * The height of the bounding box as a ratio of the overall document page height.
     * </p>
     * 
     * @param height
     *        The height of the bounding box as a ratio of the overall document page height.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoundingBox withHeight(Float height) {
        setHeight(height);
        return this;
    }

    /**
     * <p>
     * The left coordinate of the bounding box as a ratio of overall document page width.
     * </p>
     * 
     * @param left
     *        The left coordinate of the bounding box as a ratio of overall document page width.
     */

    public void setLeft(Float left) {
        this.left = left;
    }

    /**
     * <p>
     * The left coordinate of the bounding box as a ratio of overall document page width.
     * </p>
     * 
     * @return The left coordinate of the bounding box as a ratio of overall document page width.
     */

    public Float getLeft() {
        return this.left;
    }

    /**
     * <p>
     * The left coordinate of the bounding box as a ratio of overall document page width.
     * </p>
     * 
     * @param left
     *        The left coordinate of the bounding box as a ratio of overall document page width.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoundingBox withLeft(Float left) {
        setLeft(left);
        return this;
    }

    /**
     * <p>
     * The top coordinate of the bounding box as a ratio of overall document page height.
     * </p>
     * 
     * @param top
     *        The top coordinate of the bounding box as a ratio of overall document page height.
     */

    public void setTop(Float top) {
        this.top = top;
    }

    /**
     * <p>
     * The top coordinate of the bounding box as a ratio of overall document page height.
     * </p>
     * 
     * @return The top coordinate of the bounding box as a ratio of overall document page height.
     */

    public Float getTop() {
        return this.top;
    }

    /**
     * <p>
     * The top coordinate of the bounding box as a ratio of overall document page height.
     * </p>
     * 
     * @param top
     *        The top coordinate of the bounding box as a ratio of overall document page height.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoundingBox withTop(Float top) {
        setTop(top);
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
            sb.append("Height: ").append(getHeight()).append(",");
        if (getLeft() != null)
            sb.append("Left: ").append(getLeft()).append(",");
        if (getTop() != null)
            sb.append("Top: ").append(getTop());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BoundingBox == false)
            return false;
        BoundingBox other = (BoundingBox) obj;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getLeft() == null ^ this.getLeft() == null)
            return false;
        if (other.getLeft() != null && other.getLeft().equals(this.getLeft()) == false)
            return false;
        if (other.getTop() == null ^ this.getTop() == null)
            return false;
        if (other.getTop() != null && other.getTop().equals(this.getTop()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getLeft() == null) ? 0 : getLeft().hashCode());
        hashCode = prime * hashCode + ((getTop() == null) ? 0 : getTop().hashCode());
        return hashCode;
    }

    @Override
    public BoundingBox clone() {
        try {
            return (BoundingBox) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.BoundingBoxMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
